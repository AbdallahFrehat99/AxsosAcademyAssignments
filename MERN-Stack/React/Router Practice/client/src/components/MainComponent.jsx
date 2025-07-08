import React from 'react'
import { useParams } from 'react-router-dom'
const MainComponent = () => {
    const { num } = useParams();
    return (
        <>
            {isNaN(num) ?<h1>hello this is word: {num}</h1>: <h1>this is number: {num}</h1>}

        </>
    )
}
export default MainComponent;


