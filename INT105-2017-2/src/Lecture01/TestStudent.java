package Lecture01;

import newpackage.Student;

public class TestStudent {

    public static void main(String[] args) {
        Student[] sitStudent = new Student[2];
        sitStudent[0] = new Student(603006102, "Freeman Goodjob");
        sitStudent[1] = new Student(603006103, "Anita Fresh");
        
        for (int i = 0; i < sitStudent.length; i++) {
            System.out.println(i + " -:- " + sitStudent[i].toString());
        }
        System.out.println("1----------------------");
//        
//        for(Student tempStd : sitStudent){            
//            System.out.println(tempStd.toString());
//            tempStd.setId(0);
//        }
//        
//        System.out.println("2----------------------");
//        for (int i = 0; i < sitStudent.length; i++) {
//            System.out.println(i + " -:- " + sitStudent[i].toString());
//        }

//        double[][] values = new double[2][3];
//        values[0][0]=1;
//        values[0][1]=2;
//        values[0][2]=3;
//        
//        values[1][0]=4;
//        values[1][1]=5;
//        values[1][2]=6;
//        
//        for(int i=0;i<2;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(values[i][j]+"\t");
//            }
//            System.out.println("");
//        }
//
//        sum = 0;
//        for (int i = 0; i < values.length; i++) {
//            sum = sum + values[i];
//        }
        int[] scores = new int[30];
        int[] frequent=new int[10];
        
        for (int i = 0; i < scores.length; i++) {
               scores[i]=(int)(Math.random()*10+1);
        }
        
        for (int i = 0; i < scores.length; i++) {
               frequent[(scores[i]-1)]++;
        }
        System.out.println("scores--------------");
        for (int i = 0; i < scores.length; i++) {
               System.out.print(scores[i]+" ");;
        }
        System.out.println("\nfrequent--------------");
        for (int i = 0; i < frequent.length; i++) {
               System.out.print(frequent[i]+" ");;
        }
        

    }

}
