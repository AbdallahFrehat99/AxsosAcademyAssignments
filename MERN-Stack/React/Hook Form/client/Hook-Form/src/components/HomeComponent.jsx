import React, { useState } from 'react';

const HomeComponent = (props) => {
    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");
    const [firstNameError, setFirstNameError] = useState("");
    const [lastNameError, setLastNameError] = useState("");
    const [emailError, setEmailError] = useState("");
    const [passwordError, setPasswordError] = useState("");
    const [confirmPasswordError, setConfirmPasswordError] = useState("");


    const [hasBeenSubmitted, setHasBeenSubmitted] = useState(false);



    const createUser = (e) => {
        // we must prevent the default refresh of the browser to keep our state from being reset
        e.preventDefault();

        // create a javascript object to hold all of the values
        const newUser = { firstName, lastName, email, password, confirmPassword };

        console.log("Welcome", newUser);

        setFirstName("");
        setLastName("");
        setEmail("");
        setPassword("");
        setConfirmPassword("");
        setHasBeenSubmitted(true);

    };

    const handleFirstName = (e) => {
        setFirstName(e.target.value);
        if (e.target.value.length < 1) {
            setFirstNameError("firstName is required!");
        } else if (e.target.value.length < 2) {
            setFirstNameError("firstName must be 2 characters or longer!");
        } else {
            // an empty string is considered a "falsy" value
            setFirstNameError("");
        }
    }
    const handleLastName = (e) => {
        setLastName(e.target.value);
        if (e.target.value.length < 1) {
            setLastNameError("lastName is required!");
        } else if (e.target.value.length < 2) {
            setLastNameError("lastName must be 2 characters or longer!");
        } else {
            // an empty string is considered a "falsy" value
            setLastNameError("");
        }
    }




    const handleEmail = (e) => {
        setEmail(e.target.value);
        if (e.target.value.length < 1) {
            setEmailError("Email is required!");
        } else if (e.target.value.length < 2) {
            setEmailError("Email must be 2 characters or longer!");
        } else {
            // an empty string is considered a "falsy" value
            setEmailError("");
        }
    }

    const handlePassword = (e) => {
        setPassword(e.target.value);
        if (e.target.value.length < 1) {
            setPasswordError("password is required!");
        } else if (e.target.value.length < 8) {
            setPasswordError("password must be 8 characters or longer!");
        } else {
            // an empty string is considered a "falsy" value
            setPasswordError("");
        }
    }

    const handleConfirmPassword = (e) => {
        setConfirmPassword(e.target.value);
        if (e.target.value.length < 1) {
            setConfirmPasswordError("confirm password is required!");
        } else if (e.target.value !=password) {
            setConfirmPasswordError("confirm password does not match the password");
        } else {
            // an empty string is considered a "falsy" value
            setConfirmPasswordError("");
        }
    }




    return (

        <>
            <form onSubmit={createUser}>
                {
                    hasBeenSubmitted ?
                        <h3>Thank you for submitting the form!</h3> :
                        <h3>Welcome, please submit the form.</h3>
                }
                <div>
                    <label>First Name: </label>
                    <input type="text" onChange={handleFirstName} />
                    {
                        firstNameError ?
                            <p>{firstNameError}</p> :
                            ''
                    }
                </div>

                <div>
                    <label>Last Name: </label>
                    <input type="text" onChange={handleLastName} />
                    {
                        lastNameError ?
                            <p>{lastNameError}</p> :
                            ''
                    }
                </div>


                <div>
                    <label>Email Address: </label>
                    <input type="text" onChange={handleEmail} />

                    {
                        emailError ?
                            <p>{emailError}</p> :
                            ''
                    }
                </div>


                <div>
                    <label>Password: </label>
                    <input type="password" onChange={handlePassword} />

                    {
                        passwordError ?
                            <p>{passwordError}</p> :
                            ''
                    }
                </div>


                <div>
                    <label>Confirm Password: </label>
                    <input type="password" onChange={handleConfirmPassword} />
                    {
                        confirmPasswordError ?
                            <p>{confirmPasswordError}</p> :
                            ''
                    }
                </div>

                <input type="submit" value="Create User" />
            </form>
            <h3>Your Form Data</h3>
            <ul>
                <li>First Name  {firstName}</li>
                <li>Last Name   {lastName}</li>
                <li>Email   {email}</li>
                <li>Password    {password}</li>
                <li>Confirm Password    {confirmPassword}</li>
            </ul>
        </>
    );
};

export default HomeComponent;