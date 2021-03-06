package restaurant.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Patrick Urban
 */
@Entity
public class MenuEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String item;
    private String itemType;
    private float price;

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

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MenuEntity)) {
            return false;
        }
        MenuEntity other = (MenuEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
   /**
     * @return the itemType
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * @param itemType the itemType to set
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    public String toString() {
        return "MenuEntity{" + "id=" + id + ", item=" + item + ", itemType=" + itemType + ", price=" + price + '}';
    }
   
}
