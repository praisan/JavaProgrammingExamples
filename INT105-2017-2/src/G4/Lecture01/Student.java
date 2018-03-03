
package G4.Lecture01;

class Student {
    private long id;
    private String name;
    
    public Student(long id) {
        this.id = id;
    }
    
    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id:" + id + "\t" + name;
    }    
    
    
}
