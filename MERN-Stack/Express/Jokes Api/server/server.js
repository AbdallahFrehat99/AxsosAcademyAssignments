
const express = require('express');
const app = express();

require('dotenv').config()

const port = process.env.PORT;
require('./config/mongoose.config')
app.use(express.json());

app.use(express.urlencoded({extended: true }))

const allMyJokesR = require('./routes/joke.routes')

allMyJokesR(app);

app.listen(port , () => console.log(`listening on port ${port}`))