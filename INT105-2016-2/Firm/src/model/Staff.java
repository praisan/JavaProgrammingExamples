package model;

public class Staff {
    private StaffMember[] staff=new StaffMember[4];
    public Staff(){
        staff[0]=new Volunteer("Volunteer","SIT","0947759997");
        staff[1]=new Employee("Employee","SIT","0947759997","454564545454656",50);
        staff[2]=new Executive("Executive","SIT","0947759997","54454544454",80);
        staff[3]=new Hourly("Hourly","SIT","0947759997","54454544454",60);
        ((Executive)staff[2]).awardBonus(500);
        ((Hourly)staff[3]).addHours(5);
        ((Hourly)staff[3]).addHours(2);
    }
    
    public void payday(){
        double pay;
        for(int i=0;i<staff.length;i++){
            pay=((StaffMember)staff[i]).pay();
            if(pay==0){
                System.out.println("Thank you.");
            }
            System.out.println(staff[i].toString()+"\n-BB"+pay+"-\n");
        }
        
    }
    
}
