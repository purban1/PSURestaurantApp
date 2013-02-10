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

        <form id ="choices" name="choices" method="post" 
              onsubmit="return validate()" action="choices.do">
            <table width="900">
                <tr>
                    <td colspan="3">
                        <h1 style="text-align: center">Servlet Slophouse</h1>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <h3 >Make your selections from the following:</h3>
                    </td>
                </tr>
                <tr>
                    <td class="centerTop" width="300"> 
                        <p>Choose your main meal:</p>
                        <select id="mainmeal" name="mainmeal">
                            <option value="default">---</option>
                            <option value="steak">Steak</option>
                            <option value="cheeseburger">Cheeseburger</option>
                            <option value="pizza">Pizza</option>
                            <option value="burrito">Burrito</option>
                            <option value="stirfry">Stir Fry</option>
                        </select>
                    </td>
                    <td class="centerTop"  width="300">
                        <p>Choose your beverage:</p>
                        <select id="beverage" name="beverage">
                            <option value="default">---</option>
                            <option value="none">None</option>
                            <option value="milk">Milk</option>
                            <option value="soda">Soda</option>
                            <option value="beer">Beer</option>
                            <option value="margarita">Strawberry Margarita</option>
                        </select>
                    </td>
                    <td class="centerTop" width="300">
                        <p>Choose a dessert:</p>
                        <select id="dessert" name="dessert">
                            <option value="default">---</option>
                            <option value="none">None</option>
                            <option value="pie">Blueberry Pie</option>
                            <option value="cake">Chocolate Cake</option>
                            <option value="sundae">Hot Fudge Sundae</option>
                        </select>
                        <p></p>
                    </td>
                </tr>
                <tr>
                    <td class="centerBottom" colspan="3">
                        <input type="submit" name ="submit" value="Let's Eat">
                    </td>
                </tr>
            </table>
        </form>
        
        <script>
            function validate(){
                var choice=document.forms["choices"]["mainmeal"].value;
                var choice2=document.forms["choices"]["beverage"].value;
                var choice3=document.forms["choices"]["dessert"].value;
                if (choice=="default" || choice2=="default" || choice3=="default"){
                    alert("You must make a selection from all menus to continue.")
                    return false;
                }
            }
            
        </script>
    </body>
</html>
