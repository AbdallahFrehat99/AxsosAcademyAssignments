<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

   
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Send an Omikuji!</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>

<body>
    <header>
        <h1>Send an Omikuji!</h1>
    </header>

    <main>
        <form action="/omikuji/process" method="post">
            <label for="number">Pick any number from 5 to 25</label>
			<input type="number" class="form-control" id="number" name="number" min="5" max="25" required>

            <label>Enter the name of any city.</label>
            <input type="text" name="city" />

            <label>Enter the name of any real person</label>
            <input type="text" name="person" />

            <label>Enter professional endeavor or hobby:</label>
            <input type="text" name="endeavor" />

            <label>Enter any type of living thing.</label>
            <input type="text" name="thing" />

            <label>Say something nice to someone:</label>
            <textarea name="nice"></textarea>

            <p><em>Send and show a friend</em></p>

            <button type="submit">Send</button>
        </form>
    </main>
</body>

</html>