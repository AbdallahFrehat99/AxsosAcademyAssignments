import React, { useState } from "react";

const Tabs = ({ items }) => {
    const [activeIndex, setActiveIndex] = useState(0);

    return (
        <div>
            <div style={{ display: "flex", cursor: "pointer" }}>
                {items.map((item, index) => (
                    <div
                        key={index}
                        onClick={() => setActiveIndex(index)}
                        style={{
                            padding: "16px 32px",
                            border: "1px solid black",
                            backgroundColor: activeIndex === index ? "black" : "white",
                            color: activeIndex === index ? "white" : "black",
                            fontWeight: "bold",
                            textAlign: "center",
                            flex: 1,
                        }}
                    >
                        {item.label}
                    </div>
                ))}
            </div>

            <div style={{ border: "1px solid black", padding: "32px", fontSize: "24px" }}>
                {items[activeIndex].content}
            </div>
        </div>
    );
};

export default Tabs;
