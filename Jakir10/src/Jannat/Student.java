
package Jannat;

public class Student {
     private long id;
    private String Name;
    private Gender gender;
    private District district;

    public Student(long id, String Name, Gender gender, District district) {
        this.id = id;
        this.Name = Name;
        this.gender = gender;
        this.district = district;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public Gender getGender() {
        return gender;
    }

    public District getDistrict() {
        return district;
    }
}
