from flask import Flask  # Import Flask to allow us to create our app
app = Flask(__name__)    # Create a new instance of the Flask class called "app"
@app.route('/')          # The "@" decorator associates this route with the function immediately following
def hello_world():
    return 'Hello World!'  # Return the string 'Hello World!' as a response
@app.route('/champion')
def champion():
    return 'Champion'
@app.route('/say/<name>')
def say_name(name):
    return 'Hi '+ name
@app.route('/repeat/<word>/<number>')
def repeat_word(word,number):
    repeated=""
    for i in range(int(number)):
        repeated +=str(i+1)+"- "+ word +  "     "
    return repeated
if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True)    # Run the app in debug mode.