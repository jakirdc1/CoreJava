
package Jannat;

public class District {
     private long id;
    private String districtName;

    public District(long id, String districtName) {
        this.id = id;
        this.districtName = districtName;
    }

    public long getId() {
        return id;
    }

    public String getDistrictName() {
        return districtName;
    }
}
