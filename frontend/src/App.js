import React from 'react';

class App extends React.Component{
  constructor(props) {
  super(props);
    this.state = {max: '', result: ''};
    this.handleChange = this.handleChange.bind(this);
    this.getPrimes = this.getPrimes.bind(this);
  }

  handleChange(event) {
    this.setState({max: event.target.value});
  }

  getPrimes(event) {
    fetch('/api/primes?max='+encodeURIComponent(this.state.max))
    .then(res => res.json())
    .then((data) => {
      var res = "";
      data.forEach(function(item,index) {
        if(res == "") {
          res = item;
        } else {
          res = res + ", " + item;
        }
      })
      this.setState({result: "result: " + res})
    })
  }

  render() {
    return (
            <div className="App">
              <header className="App-header">
                <div className="App-intro">
                  <label>
                    <div>
                      Enter a value to get all prime numbers from 1 to given number
                    </div>
                    <input type="text" value={this.state.max} onChange={this.handleChange} name="max"/>
                    <button onClick={this.getPrimes}>
                      Get primes
                    </button>
                  </label>
                  <div>
                    {this.state.result}
                  </div>
                </div>
              </header>
            </div>
        );
  }
}

export default App;
