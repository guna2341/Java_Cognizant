import { Link } from "react-router-dom";
import trainersMock from "../util/TrainersMock";


export const TrainersList = () => (
    <div>
        <h3>Trainers List</h3>
        {trainersMock.map(item => (
            <ul>
                <Link to={`/trainer/${item.trainerId}`}>
                    <li key={item.email}>{item.name}</li>
                </Link>
            </ul>
        ))}
    </div>
);