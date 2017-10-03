package jakir.com;

public class Country {

    private long id;
    private String countryname;

    public Country(long id, String countryname) {
        this.id = id;
        this.countryname = countryname;
    }

    public long getId() {
        return id;
    }

    public String getCountryname() {
        return countryname;
    }

}
