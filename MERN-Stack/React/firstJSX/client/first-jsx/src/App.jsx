import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import HomeComponent from './Components/HomeComponent';

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <HomeComponent/>
    </>
  )
}

export default App
