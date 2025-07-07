import React, { useState } from 'react'

const HomeComponent = () => {

    const [color, setColor] = useState("");
    const [boxes, setBoxes] = useState([]);

    const handleSubmit = (e) => {
        e.preventDefault();
        if (color.trim() !== "") {
            setBoxes([...boxes, color]);
            setColor(""); 
        }
    };
    return (
<div style={{ padding: "20px", fontFamily: "sans-serif" }}>
            <form onSubmit={handleSubmit}>
                <label>
                    Enter a color:{" "}
                    <input
                        type="text"
                        value={color}
                        onChange={(e) => setColor(e.target.value)}
                        placeholder="e.g. red, #00ff00"
                    />
                </label>
                <button type="submit">Add Box</button>
            </form>

            <div
                style={{
                    display: "flex",
                    flexWrap: "wrap",
                    gap: "10px",
                    marginTop: "20px"
                }}
            >
                {boxes.map((col, index) => (
                    <div
                        key={index}
                        style={{
                            width: "100px",
                            height: "100px",
                            backgroundColor: col,
                            border: "1px solid #ccc"
                        }}
                    />
                ))}
            </div>
        </div>    
        
    )
}
export default HomeComponent;