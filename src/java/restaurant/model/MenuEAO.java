package restaurant.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Patrick Urban
 */
public class MenuEAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PSURestaurantAppPU");
    EntityManager em = emf.createEntityManager();

    public List<MenuEntity> populateTheMenu() {
        List<MenuEntity> menuSelections = new ArrayList<MenuEntity>();
        MenuEntity me1 = new MenuEntity();
        MenuEntity me2 = new MenuEntity();
        MenuEntity me3 = new MenuEntity();
        MenuEntity me4 = new MenuEntity();
        MenuEntity me5 = new MenuEntity();
        MenuEntity me6 = new MenuEntity();
        MenuEntity me7 = new MenuEntity();
        MenuEntity me8 = new MenuEntity();
        MenuEntity me9 = new MenuEntity();
        MenuEntity me10 = new MenuEntity();
        MenuEntity me11 = new MenuEntity();
        MenuEntity me12 = new MenuEntity();
        MenuEntity me13 = new MenuEntity();
        me1.setItem("Steak");
        me1.setItemType("Meal");
        me1.setPrice(15.25f);
        me2.setItem("Cheeseburger");
        me2.setItemType("Meal");
        me2.setPrice(7.50f);
        me3.setItem("Pizza");
        me3.setItemType("Meal");
        me3.setPrice(10.00f);
        me4.setItem("Burrito");
        me4.setItemType("Meal");
        me4.setPrice(9.80f);
        me5.setItem("Stir Fry");
        me5.setItemType("Meal");
        me5.setPrice(13.25f);
        me6.setItem("Milk");
        me6.setItemType("Meal");
        me6.setPrice(2.50f);
        me7.setItem("Soda");
        me7.setItemType("Beverage");
        me7.setPrice(1.75f);
        me8.setItem("Beer");
        me8.setItemType("Beverage");
        me8.setPrice(5.00f);
        me9.setItem("Margaritta");
        me9.setItemType("Beverage");
        me9.setPrice(7.50f);
        me10.setItem("Blueberry Pie");
        me10.setItemType("Dessert");
        me10.setPrice(2.75f);
        me11.setItem("Hot Fudge Sundae");
        me11.setItemType("Dessert");
        me11.setPrice(2.25f);
        me12.setItem("Chocolate Cake");
        me12.setItemType("Dessert");
        me12.setPrice(3.25f);
        this.manageTheMenu(me1);
        this.manageTheMenu(me2);
        this.manageTheMenu(me3);
        this.manageTheMenu(me4);
        this.manageTheMenu(me5);
        this.manageTheMenu(me6);
        this.manageTheMenu(me7);
        this.manageTheMenu(me8);
        this.manageTheMenu(me9);
        this.manageTheMenu(me10);
        this.manageTheMenu(me11);
        this.manageTheMenu(me12);
        
        menuSelections.add(me1);
        menuSelections.add(me2);
        menuSelections.add(me3);
        menuSelections.add(me4);
        menuSelections.add(me5);
        menuSelections.add(me6);
        menuSelections.add(me7);
        menuSelections.add(me8);
        menuSelections.add(me9);
        menuSelections.add(me10);
        menuSelections.add(me11);
        menuSelections.add(me12);
        
        
        return menuSelections;
    }

    private void manageTheMenu(MenuEntity me) {
        

        //Persist the menu item
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
        em.persist(me);
//        tx.commit();

        // Close to release sources
        em.close();
        emf.close();
    }
}
