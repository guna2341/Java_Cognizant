import logo from './logo.svg';
import './App.css';
import CohortDetails from './CohortDetails';
import { CohortData } from './Cohort';

function App() {
  return (
    <div className="App">
    <CohortDetails cohort={CohortData[0]} />
    </div>
  );
}

export default App;
