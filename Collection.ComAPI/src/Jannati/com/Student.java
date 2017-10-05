
package Jannati.com;

public class Student {
    private long id;
     private String Name;
      private Gender gender;
      private Country country;
       private double salary;

    public Student(long id, String Name, Gender gender, Country country, double salary) {
        this.id = id;
        this.Name = Name;
        this.gender = gender;
        this.country = country;
        this.salary = salary;
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

    public Country getCountry() {
        return country;
    }

    public double getSalary() {
        return salary;
    }

    
    
}
