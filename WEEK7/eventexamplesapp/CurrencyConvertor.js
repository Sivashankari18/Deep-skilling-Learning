import React from 'react';

class CurrencyConvertor extends React.Component {
  constructor() {
    super();
    this.state = {
      amount: '',
      currency: ''
    };
  }

  handleChange = (e) => {
    this.setState({
      [e.target.name]: e.target.value
    });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    let amount = parseFloat(this.state.amount);
    if (this.state.currency.toLowerCase() === 'euro') {
      let converted = amount * 80;
      alert(`Converting to Euro Amount is ${converted}`);
    } else {
      alert("Currency not supported");
    }
  };

  render() {
    return (
      <div>
        <h1 style={{ color: "green" }}>Currency Convertor!!!</h1>
        <form onSubmit={this.handleSubmit}>
          <label>Amount: </label>
          <input
            type="text"
            name="amount"
            value={this.state.amount}
            onChange={this.handleChange}
          />
          <br /><br />
          <label>Currency: </label>
          <textarea
            name="currency"
            value={this.state.currency}
            onChange={this.handleChange}
          />
          <br /><br />
          <input type="submit" value="Submit" />
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;
