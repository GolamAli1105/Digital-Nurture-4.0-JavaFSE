import React, { useState } from 'react';

const TrainersList = ({ trainers }) => {
  const [selectedTrainer, setSelectedTrainer] = useState(null);

  const handleClick = (trainer) => {
    setSelectedTrainer(trainer);
  };

  return (
    <div>
      <h2>Trainers List</h2>
      <ul>
        {trainers.map((trainer, index) => (
          <li key={index}>
            <a href="#" onClick={(e) => { e.preventDefault(); handleClick(trainer); }}>
              {trainer.name}
            </a>
          </li>
        ))}
      </ul>

      {/* Trainer Details Section */}
      {selectedTrainer && (
        <div style={{ border: '1px solid black', padding: '10px', marginTop: '10px', borderRadius: '10px' }}>
          <h3>Trainer Details</h3>
          <p><strong>Name:</strong> {selectedTrainer.name}</p>
          <p><strong>Email:</strong> {selectedTrainer.email}</p>
          <p><strong>Experience:</strong> {selectedTrainer.experience} years</p>
        </div>
      )}
    </div>
  );
};

export default TrainersList;