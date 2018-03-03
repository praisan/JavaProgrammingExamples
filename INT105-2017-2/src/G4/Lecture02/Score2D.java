package G4.Lecture02;

import java.util.Scanner;

public class Score2D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfStd;
        double[][] scores;
        double best;
        char grade;
        System.out.print("Enter the number of students: ");
        numOfStd = input.nextInt();
        scores = new double[numOfStd][3];        
        for (int i = 0; i < numOfStd; i++) {
            System.out.print("Input scores of student "+
                    i+" (midterm final assignment):");
            scores[i][0]=input.nextDouble();
            scores[i][1]=input.nextDouble();
            scores[i][2]=input.nextDouble();  
        }
        System.out.println("\tmidterm\tfinal\tassignment\tTotal");
        for (int i = 0; i < numOfStd; i++){
            System.out.println(i+":\t"+scores[i][0]+
                    "\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+(scores[i][0]+scores[i][1]+scores[i][2]));
        }

    }

}
