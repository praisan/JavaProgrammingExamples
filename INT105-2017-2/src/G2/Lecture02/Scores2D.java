
package G2.Lecture02;

import java.util.Scanner;

public class Scores2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stdNo;
        System.out.print("Enter the number of students: ");
        stdNo = input.nextInt();
        double[][] scores=new double[stdNo][2];
        for(int i=0;i<stdNo;i++){
            System.out.print("Enter midterm and final scores of student "+i+": ");
            scores[i][0]=input.nextDouble();
            scores[i][1]=input.nextDouble();
        }
        
        for(int i=0;i<stdNo;i++){
            System.out.println("Student "+i+" score: mid="+
                    scores[i][0]+" final="+scores[i][1]+" total: "+(scores[i][0]+scores[i][1]));
        }
    }
    
}
