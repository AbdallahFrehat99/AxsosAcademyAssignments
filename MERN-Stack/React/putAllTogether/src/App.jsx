import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import HomeComponent from './components/HomeComponent'
function App() {

  return (
    <>
      <HomeComponent firstname = "Jane" lastname = "Doe" age = {45} haircolor = "Black"/>
      <HomeComponent firstname = "John" lastname = "Smith" age = {88} haircolor = "Brown"/>
    </>
  )
}

export default App
