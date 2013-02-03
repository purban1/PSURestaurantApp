package restaurant.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Patrick Urban
 */
public class menuCreator {

    private int creationCount = 0;

    public menuCreator() {

        if (this.creationCount==0) {
            this.populateTheMenu();
            creationCount++;
        }
    }

    private void populateTheMenu() {
        MenuEntity mi1 = new MenuEntity();
        MenuEntity mi2 = new MenuEntity();
        MenuEntity mi3 = new MenuEntity();
        MenuEntity mi4 = new MenuEntity();
        MenuEntity mi5 = new MenuEntity();
        MenuEntity mi6 = new MenuEntity();
        MenuEntity mi7 = new MenuEntity();
        MenuEntity mi8 = new MenuEntity();
        MenuEntity mi9 = new MenuEntity();
        mi1.setItem("Steak");
        mi1.setPrice(15.25f);
        mi2.setItem("Cheeseburger");
        mi2.setPrice(7.50f);
        mi3.setItem("Pizza");
        mi3.setPrice(10.00f);
        mi4.setItem("Burrito");
        mi4.setPrice(9.80f);
        mi5.setItem("Stir Fry");
        mi5.setPrice(13.25f);
        mi6.setItem("Milk");
        mi6.setPrice(2.50f);
        mi7.setItem("Soda");
        mi7.setPrice(1.75f);
        mi8.setItem("Beer");
        mi8.setPrice(5.00f);
        mi9.setItem("Margaritta");
        mi9.setPrice(7.50f);
        this.manageTheMenu(mi1);
        this.manageTheMenu(mi2);
        this.manageTheMenu(mi3);
        this.manageTheMenu(mi4);
        this.manageTheMenu(mi5);
        this.manageTheMenu(mi6);
        this.manageTheMenu(mi7);
        this.manageTheMenu(mi8);
        this.manageTheMenu(mi9);
    }

    private void manageTheMenu(MenuEntity mi) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PSURestaurantAppPU");
        EntityManager em = emf.createEntityManager();

        //Persist the menu item
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(mi);
        tx.commit();

        // Close to release sources
        em.close();
        emf.close();
    }
}
