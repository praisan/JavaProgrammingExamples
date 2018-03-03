package G2.Lecture05;


public class Employee extends Person{
//#office: String
//#salary: double
    protected String office;
    protected double salary;
    
    public Employee(String name){
        super(name);
    }

    public Employee(String name, String office, double salary) {
        super(name);
        this.office = office;
        this.salary = salary;
    }

    public Employee(String name,String address, String phoneNumber,String emailAddress,String office, double salary) {
        super(name,address,phoneNumber,emailAddress);
        this.office = office;
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+"\noffice: " + office + "\nsalary: " + salary;
    }
    
}
