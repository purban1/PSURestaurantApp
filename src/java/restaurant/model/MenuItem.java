package restaurant.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "findAllMenuItems"), query = "SELECT m FROM MenuItem m")
/**
 * An Entity object
 * @author patrick Urban
 */
public class MenuItem {

    @Id
    @GeneratedValue
    private Long id;
    private String item;
    private float price;

    /**
     * @return the ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @param id the ID to set
     */
    public void setId(Long id) {
        this.id = id;
    }
}
