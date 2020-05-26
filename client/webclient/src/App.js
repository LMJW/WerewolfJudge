import React from 'react';
import logo from './logo.svg';
import Login from './components/Login';
import RoomCreation from "./components/RoomCreation";
import GameInit from "./components/GameInit";
import CharacterSelectionDialog from "./components/CharacterSelectionDialog";
import Welcome from "./components/Welcome";
import { GameRoom } from "./components/GameRoom";
import './App.css';

function App() {
  return (
    <div className="App">
      <GameRoom />
    </div>
  );
}

export default App;
