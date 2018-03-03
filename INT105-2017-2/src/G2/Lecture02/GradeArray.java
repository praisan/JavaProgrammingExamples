package G2.Lecture02;

import java.util.Scanner;

public class GradeArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stdNo;
        System.out.print("Enter the number of students: ");
        stdNo = input.nextInt();
        double[] scores = getScore(stdNo);   
        
        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i]);
        }
        
        for(int i=scores.length-1;i>=0;i--){
            System.out.println(scores[i]);
        }
        
        double best = getBestScore(scores);        
        for(int i=0;i<scores.length;i++){
            System.out.println("Student "+i+" score is "+
                    scores[i]+" and grade is "+score2grade(scores[i],best));
        }     
    }
    public static double[] getScore(int numOfstd) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter "+numOfstd+" scores: ");
        double[] tempScore=new double[numOfstd];
        for(int i=0;i<numOfstd;i++){
            tempScore[i]=input.nextDouble();
        }
        return tempScore;
        
    }
    public static char score2grade(double score,double best) {
        char chGrade;
        
        if(score>=best-10){
            chGrade='A';
        }else if(score >=best-20){
            chGrade='B';
        }else if(score >=best-30){
            chGrade='C';
        }else if(score >=best-40){
            chGrade='D';
        }else{
            chGrade='F';
        }        
        return chGrade;        
    }
    
    public static double getBestScore(double[] theScores) {
        double theBest=theScores[0];
        for(int i=0;i<theScores.length;i++){
            if(theScores[i]>theBest){
                theBest=theScores[i];
            }
        }
        return theBest;
        
    }


}
