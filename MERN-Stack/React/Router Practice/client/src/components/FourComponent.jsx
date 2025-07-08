import React from 'react'
import { useParams } from 'react-router-dom'

const FourComponent = () => {
 const {word, tcol, bgcol } = useParams()
  return (
    <h1 style={{ color: tcol, backgroundColor: bgcol }}>The word is: {word}</h1>
  )
}

export default FourComponent;