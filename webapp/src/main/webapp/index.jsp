<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>
        String concatenation
    </title>
</head>
<body>
<h2>String concatenation</h2>
<div class="container">
    <form id="form" name="form" method="POST" action="controller">
        <input type="hidden" name="command" value="concatenate" />
        String one:<br/>
        <input type="text" name="stringOne" id="stringOne" value="" placeholder="Enter something here"/>
        <br/>String two:<br/>
        <input type="text" name="stringTwo" id="stringTwo" value="" placeholder="...and here"/>
        <br/>
        <br/>
        <button type="submit">See the result</button>
    </form><hr/>
    </div>
</body>
</html>
