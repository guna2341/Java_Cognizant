import { useParams } from "react-router-dom";
import trainersMock from "../util/TrainersMock";

export const TrainersDetail = () => {

    const { id } = useParams();

    const trainer = trainersMock.find(item => item.trainerId == id);

    return (
        <div>
            <h1>Trainers Details</h1>
    
            <h2>
                {trainer.name} ({trainer.technology})
            </h2>
    
            <p>{trainer.email}</p>
    
            <p>{trainer.phone}</p>
    
            <ul>
                {trainer.skills.map((skill, index) => (
                    <li key={index}>{skill}</li>
                ))}
            </ul>
        </div>
    );
};