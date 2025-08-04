import React from 'react';
import './App.css';
import sr from './office.jpg'; 

function App() {
  const element = "Office Space";

  const officeList = [
    { Name: "DBS", Rent: 50000, Address: "Chennai" },
    { Name: "WeWork", Rent: 65000, Address: "Bangalore" },
    { Name: "Smartworks", Rent: 55000, Address: "Hyderabad" }
  ];

  return (
    <div className="App">
      <h1>{element}, at Affordable Range</h1>
      {
        officeList.map((item, index) => {
          let rentColor = item.Rent <= 60000 ? "textRed" : "textGreen";

          return (
            <div key={index}>
              <img src={sr} width="25%" height="25%" alt="Office Space" />
              <h1>Name: {item.Name}</h1>
              <h3 className={rentColor}>Rent: Rs. {item.Rent}</h3>
              <h3>Address: {item.Address}</h3>
              <hr />
            </div>
          );
        })
      }
    </div>
  );
}

export default App;
