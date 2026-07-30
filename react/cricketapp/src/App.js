import { useState } from "react";
import { EvenPlayers, ListofIndianPlayers, OddPlayers } from "./components/IndianPlayers";
import ListofPlayers from "./components/ListOfPlayers";
import Scorebelow70 from "./components/ScoreBelow70";


function App() {
  const [flag, setFlag] = useState(true);

  const players = [
    { name: "Virat", score: 95 },
    { name: "Rohit", score: 85 },
    { name: "Gill", score: 65 },
    { name: "Rahul", score: 45 },
    { name: "Pant", score: 80 },
    { name: "Hardik", score: 60 },
    { name: "Jadeja", score: 75 },
    { name: "Ashwin", score: 55 },
    { name: "Bumrah", score: 35 },
    { name: "Shami", score: 50 },
    { name: "Siraj", score: 90 },
  ];

  const IndianTeam = [
    "Virat",
    "Rohit",
    "Gill",
    "Rahul",
    "Pant",
    "Hardik",
  ];

  const T20players = ["Surya", "Hardik", "Bumrah"];
  const RanjiPlayers = ["Pujara", "Rahane", "Saha"];
  const IndianPlayers = [...T20players, ...RanjiPlayers];

  return (
    <div>

      <button onClick={() => setFlag(true)}>
        Show Players
      </button>

      <button onClick={() => setFlag(false)}>
        Show Indian Team
      </button>

      <hr />

      {flag ? (
        <div>
          <h1>List of Players</h1>
          <ListofPlayers players={players} />

          <hr />

          <h1>Players with Score Less than 70</h1>
          <Scorebelow70 players={players} />
        </div>
      ) : (
        <div>
          <h2>Odd Players</h2>
          {OddPlayers(IndianTeam)}

          <hr />

          <h2>Even Players</h2>
          {EvenPlayers(IndianTeam)}

          <hr />

          <h2>Merged Players</h2>
          <ListofIndianPlayers IndianPlayers={IndianPlayers} />
        </div>
      )}

    </div>
  );
}

export default App;