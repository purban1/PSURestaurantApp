package restaurant.model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Patrick Urban
 */
public class MenuService {
    MenuEAO eao = new MenuEAO();

    public MenuService() {
        
    }

    public List<MenuEntity> retreiveMenuItems(){
        return eao.populateTheMenu();
        
    }
    
}
