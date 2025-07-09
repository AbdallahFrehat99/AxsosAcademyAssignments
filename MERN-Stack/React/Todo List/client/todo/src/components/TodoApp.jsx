import React, { useState } from 'react';

const TodoApp = () => {
  const [tasks, setTasks] = useState([
    { id: 1, text: 'Get Python black belt.', completed: true }
  ]);
  const [newTask, setNewTask] = useState('');

  const handleAdd = () => {
    if (newTask.trim() === '') return;

    const newTaskObj = {
      id: Date.now(),
      text: newTask.trim(),
      completed: false
    };

    setTasks([...tasks, newTaskObj]);
    setNewTask('');
  };

  const handleDelete = (id) => {
    const filteredTasks = tasks.filter(task => task.id !== id);
    setTasks(filteredTasks);
  };

  const toggleComplete = (id) => {
    const updatedTasks = tasks.map(task =>
      task.id === id ? { ...task, completed: !task.completed } : task
    );
    setTasks(updatedTasks);
  };

  return (
    <div style={{ padding: '30px' }}>



      <div style={{ marginBottom: '20px' }}>
        <input
          type="text"
          placeholder="Enter new task"
          value={newTask}
          onChange={(e) => setNewTask(e.target.value)}
          style={{
            padding: '16px',
            fontSize: '20px',
            borderRadius: '12px',
            border: '1px solid lightgray',
            marginRight: '10px',
            width: '300px'
          }}
        />
        <button
          onClick={handleAdd}
          style={{
            backgroundColor: 'blue',
            color: 'white',
            padding: '12px 32px',
            borderRadius: '16px',
            border: 'none',
            fontSize: '20px',
            cursor: 'pointer'
          }}
        >
          Add
        </button>
      </div>




      {tasks.map((task) => (
        <div
          key={task.id}
          style={{
            display: 'flex',
            alignItems: 'center',
            marginBottom: '16px'
          }}
        >
          <span
            style={{
              textDecoration: task.completed ? 'line-through' : 'none',
              fontSize: '24px',
              marginRight: '10px'
            }}
          >
            {task.text}
          </span>
          <input
            type="checkbox"
            checked={task.completed}
            onChange={() => toggleComplete(task.id)}
            style={{ transform: 'scale(1.5)', marginRight: '16px' }}
          />
          <button
            onClick={() => handleDelete(task.id)}
            style={{
              backgroundColor: 'black',
              color: 'white',
              padding: '10px 20px',
              borderRadius: '10px',
              fontSize: '18px',
              cursor: 'pointer'
            }}
          >
            Delete
          </button>
        </div>
      ))}
    </div>
  );
};

export default TodoApp;
