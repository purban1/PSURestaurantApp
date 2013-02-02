<%-- 
    Document   : index
    Created on : Jan 31, 2013, 9:34:56 PM
    Author     : production
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="restaurantcss.css">
        <title>Welcome to the Servlet Slophouse</title>
    </head>
    <body>
        <h1 style="text-align: center">Servlet Slophouse</h1>
        <h3>Make you selections from the following:</h3>
        <form id ="choices" name="choices" method="post" 
              onsubmit="return validate()" action="choices.do">
            <p>Choose your main meal:</p>
            <select id="mainmeal" name="mainmeal">
                <option value="default">---</option>
                <option value="steak">Steak</option>
                <option value="cheeseburger">Cheeseburger</option>
                <option value="pizza">Pizza</option>
                <option value="burrito">Burrito</option>
                <option value="stirfry">Stir Fry</option>
            </select>
            <p>Choose your beverage:</p>
            <select id="beverage" name="beverage">
                <option value="default">---</option>
                <option value="milk">Milk</option>
                <option value="soda">Soda</option>
                <option value="beer">Beer</option>
                <option value="margarita">Strawberry Margarita</option>
            </select>
            <p></p>
            <input type="submit" value="Let's Eat">
            
        </form>
        <script>
            function validate(){
                var choice=document.forms["choices"]["mainmeal"].value;
                var choice2=document.forms["choices"]["beverage"].value;
                if (choice=="default"){
                    alert("You must make a selection from all menus to continue.")
                    return false;
                }
            }
            
        </script>
    </body>
</html>
