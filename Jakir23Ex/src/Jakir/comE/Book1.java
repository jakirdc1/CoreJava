
package Jakir.comE;


import java.util.Date;

public class Book1 extends serialization {
    private int id;
    private String name;
    private Date publication;
    private int price;

    public Book1(int id, String name, Date publication, int price) {
        this.id = id;
        this.name = name;
        this.publication = publication;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getPublication() {
        return publication;
    }

    public int getPrice() {
        return price;
    }
    
}
