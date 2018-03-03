
package G2.Lecture05;


public class Faculty extends Employee{
//    -officeHours: String
//-rank: String
    private String officeHours;
    private String rank;

    public Faculty(String officeHours, String rank, String name) {
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String officeHours, String rank, String name, String address, String phoneNumber, String emailAddress, String office, double salary) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()+"\nofficeHours: " + officeHours + "\nrank: " + rank;
    }
}
