import React from "react";

const PersonCardComponent = ({firstname,lastname,age,haircolor}) =>{
    return(
        <>
        <h1>{lastname}, {firstname}</h1>
        <p>Age: {age}</p>
        <p>Hair Color: {haircolor}</p>
        </>
    )
}
export default PersonCardComponent;