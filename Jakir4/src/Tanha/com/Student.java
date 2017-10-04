
package Tanha.com;

public class Student {
    private long studentID;
    private String Name;
    private Gender gender;
    private District district;

    public Student(long studentID, String Name, Gender gender, District district) {
        this.studentID = studentID;
        this.Name = Name;
        this.gender = gender;
        this.district = district;
    }

    public long getStudentID() {
        return studentID;
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
