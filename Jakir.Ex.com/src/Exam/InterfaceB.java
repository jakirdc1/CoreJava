
package Exam;

public class InterfaceB implements InterfaceA {
    double blnce;
    double dep;
    double with;
    double check;

    public InterfaceB(double blnce, double dep, double with, double check) {
        this.blnce = blnce;
        this.dep = dep;
        this.with = with;
        this.check = check;
    }
    

    @Override
    public double deposit() {
       return dep;
    }

    @Override
    public double withdraw() {
     return with;  
    }

    @Override
    public double checkeBalance() {
   blnce = blnce + dep - with; 
        return blnce;
}
}
