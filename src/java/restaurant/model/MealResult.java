package restaurant.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Patrick Urban
 */
public class MealResult {
    public Map mealSelection(String meal, String beverage){
        
        
        Map bill = new HashMap();
        if (meal.equals("steak")){
            bill.put("meal", "Steak");
            bill.put("mealprice", "15.00");
        }
        else if (meal.equals("cheeseburger")){
            bill.put("meal", "");
            bill.put("mealprice", "7.50");
        }
        else if (meal.equals("pizza")){
            bill.put("meal", "Pizza");
            bill.put("mealprice", "10.00");
        }
        else if (meal.equals("burrito")){
            bill.put("meal", "Burrito");
            bill.put("mealprice", "9.80");
        }
        else if (meal.equals("stirfry")){
            bill.put("meal", "Stir Fry dish");
            bill.put("mealprice", "13.25");
        }
        
        if (beverage.equals("milk")){
            bill.put("beverage", "Milk");
            bill.put("beverageprice", "2.50");
        }
        else if (beverage.equals("soda")){
            bill.put("beverage", "Soda");
            bill.put("beverageprice", "1.75");
        }
        else if (beverage.equals("beer")){
            bill.put("beverage", "Beer");
            bill.put("beverageprice", "5.50");
        }
        else if (beverage.equals("margarita")){
            bill.put("beverage", "Strawberry Margarita");
            bill.put("beverageprice", "7.75");
        }
        
        
        return bill;
        
    }
}
