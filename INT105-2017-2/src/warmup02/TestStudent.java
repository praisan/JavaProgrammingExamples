package warmup02;
// 1. declare an array variable consisting of 3 Student objects
// 2. print all students object to the console using "for" and "foreach" style

public class TestStudent {

    public static void main(String[] args) {
        Student[] std = new Student[3];

        std[0] = new Student("Ike");
        std[1] = new Student("Anne");
        std[2] = new Student("Kate");

        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i].toString());
        }
        
        for(Student tempSdt:std){
            System.out.println(tempSdt.toString());
        }

    }

}
