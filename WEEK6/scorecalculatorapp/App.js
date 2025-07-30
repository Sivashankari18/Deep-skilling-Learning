import React from 'react';
import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore name="Siva Shankari" school="St. Mary's Girls HSS" total={450} goal={5} />
    </div>
  );
}

export default App;
