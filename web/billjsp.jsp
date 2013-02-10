<%-- 
    Document   : billjsp
    Created on : Jan 31, 2013, 10:21:14 PM
    Author     : Patrick Urban
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="restaurantcss.css">
        <title>Time for the bill</title>
    </head>
    <body>

        <p></p>
        <%
                DecimalFormat df = new DecimalFormat("$#0.00");
                double totalBill;
                double theTax;
                double suggestedTip;
                final int SPAN_VALUE = 11;

                final double TAX_RATE = .055;
                final double TIP_RATE = .15;


                Map bill = (Map) request.getAttribute("total");
                String meal, beverage, dessert;
                double mealPrice, beveragePrice, dessertPrice;
                meal = bill.get("meal").toString();
                mealPrice = Double.parseDouble(bill.get("mealprice").toString());
                beverage = bill.get("beverage").toString();
                if (beverage.equals("none")) {
                    beveragePrice = 0.00;
                } else {
                    beveragePrice = Double.parseDouble(bill.get("beverageprice").toString());
                }
                dessert = bill.get("dessert").toString();
                if (dessert.equals("none")) {
                    dessertPrice = 0.00;
                } else {
                    dessertPrice = Double.parseDouble(bill.get("dessertprice").toString());
                }
            totalBill  = beveragePrice + mealPrice + dessertPrice;
            theTax  = totalBill * TAX_RATE;
            suggestedTip  = totalBill * TIP_RATE;

            out.print ("<table width=680>");
            out.print ("<tr><td width=150 rowspan=" + SPAN_VALUE + "><img src=\"images/cook.gif\" alt=\"Chef\" style=\"align: left\"></td>");
            out.print ("<td width=50 rowspan=" + SPAN_VALUE + "></td>");
            out.print ("<th colspan=2>Servlet Slophouse Dining Bill</th></tr>");
            out.print ("<tr><td width=390>Your meal was a " + meal + " at a cost of </td><td align = \"right\">"
                    + df.format(mealPrice) + "</td></tr>");
            if (beverage.equals("none")){
            }
            else
            {
               out.print ("<tr><td>Your beverage was a " + beverage + " at a cost of </td><td align = \"right\">"
                    + df.format(beveragePrice) + "</td></tr>");
            }
            if (dessert.equals("none")){
            }
            else
            {
               out.print ("<tr><td>Your dessert was " + dessert + " at a cost of </td><td align = \"right\">"
                    + df.format(dessertPrice) + "</td></tr>");
            }
            out.print ("<tr><td>Your total before tax was </td><td align = \"right\">" + df.format(totalBill) + "</td></tr>");
            out.print ("<tr><td>The tax on the meal was </td><td align = \"right\">" + df.format(theTax) + "</td></tr>");
            out.print ("<tr class=\"tipline\"><td >The suggest tip for your Server Bluto </td><td align = \"right\">" + df.format(suggestedTip) + "</td></tr>");
            out.print ("<tr class=\"lastrow\"><td>The total with tip is....... </td><td class=\"lastrow\">" + df.format(totalBill + theTax + suggestedTip) + "</td></tr>");
            out.print ( "</table>");
        %>
        <h3>Please come again...</h3>
    </body>
</html>
