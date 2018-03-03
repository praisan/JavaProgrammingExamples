package G2.Lecture05;


public class Staff extends Employee {
    private String title;

    public Staff(String name, String title) {
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null && obj instanceof Staff) {
               if(super.getName()==((Staff)obj).getName()){
                   result=true;
               }
        }
        return result;
    }

    @Override
    public String toString() {
        return super.toString()+"\ntitle: " + title;
    }
    
}
