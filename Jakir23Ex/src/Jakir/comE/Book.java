
package Jakir.comE;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
    private int id;
    private String name;
    private Date publication;
    private int price;

    public Book(int id, String name, Date publication, int price) {
        this.id = id;
        this.name = name;
        this.publication = publication;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPublication() {
        return publication;
    }

    public void setPublication(Date publication) {
        this.publication = publication;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", publication=" + publication + ", price=" + price + '}';
    }
    
    
}
