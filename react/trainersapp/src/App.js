import { BrowserRouter, Routes, Route, Link, Navigate } from "react-router-dom";
import { Home } from "./components/Home";
import { TrainersList } from "./components/TrainersList";
import { TrainersDetail } from "./components/TrainerDetail";


function App() {
    return (
      <div>
        <BrowserRouter>
            <div>
                <nav>
                    <Link to="/">Home</Link> |{" "}
                    <Link to="/trainers">Show Trainers</Link>
                </nav>

                <hr />

                <Routes>
                    <Route path="/" element={<Home />} />

                    <Route path="/trainers" element={<TrainersList />} />

                    <Route path="/trainer/:id" element={<TrainersDetail />} />

                </Routes>
            </div>
        </BrowserRouter>
        </div>
    );
}

export default App;