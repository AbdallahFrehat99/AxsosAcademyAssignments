import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import PersonCardComponent from './components/PersonCardComponent '
function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <PersonCardComponent firstname="Jane" lastname="Doe" age={45} haircolor="Black" />
      <PersonCardComponent firstname="John" lastname="Smith" age={88} haircolor="Brown" />
      <PersonCardComponent firstname="Millard" lastname="Fillmore" age={50} haircolor="Brown" />
      <PersonCardComponent firstname="Maria" lastname="Smith" age={62} haircolor="Brown" />
    </>
  )
}

export default App



