package G4.Lecture02;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfStd;
        double[] scores;
        double best;
        char grade;
        System.out.print("Enter the number of students: ");
        numOfStd = input.nextInt();
        scores = getScores(numOfStd);
        best = getBestScore(scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is "
                    + scores[i] + " grade is " + score2grade(scores[i], best));
        }

    }

    public static double getBestScore(double[] tempScores) {
        double best = tempScores[0];
        for (int i = 1; i < tempScores.length; i++) {
            if (best < tempScores[i]) {
                best = tempScores[i];
            }
        }
        return best;
    }

    public static double[] getScores(int numOfStudent) {
        double[] tempScores = new double[numOfStudent];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numOfStudent; i++) {
            tempScores[i] = input.nextDouble();
        }
        return tempScores;
    }

    private static char score2grade(double score, double best) {
        char grade;
        if (score >= best - 10) {
            grade = 'A';
        } else if (score >= best - 20) {
            grade = 'B';
        } else if (score >= best - 30) {
            grade = 'C';
        } else if (score >= best - 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
}
