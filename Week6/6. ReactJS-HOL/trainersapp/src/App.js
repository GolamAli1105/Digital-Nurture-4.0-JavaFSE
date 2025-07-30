import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import Home from './Home';
import TrainersList from './TrainerList';
import trainersMock from './TrainerMock';
const trainers = trainersMock;

function App() {
  return (
    <BrowserRouter>
      <div>
        <h2>My Academy Trainers App</h2>
        <nav style={{ marginBottom: '20px' }}>
          <Link to="/">Home</Link> | <Link to="/trainers">Show Trainers</Link>
        </nav>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/trainers" element={<TrainersList trainers={trainers} />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}

export default App;
