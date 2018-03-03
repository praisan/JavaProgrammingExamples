
package warmup02;
// 1. add a variable to keep track of the number of created student
// 2. (optional) revise the class for assigning a unique id for new student 

class Student {
    private long id;
    private String name;
    private static int count;
    private static long initId=6013500000L;

    public Student(String name) {
        this.name = name;
        count++;
        id=initId+count;
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
