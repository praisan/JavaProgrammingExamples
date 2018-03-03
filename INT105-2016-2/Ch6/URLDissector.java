

import java.util.Scanner;
import java.io.*;

public class URLDissector
{
   //-----------------------------------------------------------------
   //  Reads urls from a file and prints their path components.
   //-----------------------------------------------------------------
   public static void main (String[] args) {//throws Exception{
      String url;
      Scanner fileScan, urlScan;
      try{
		fileScan = new Scanner (new File("urls1.inp"));
		while (fileScan.hasNext()){
         url = fileScan.nextLine();
         System.out.println ("URL: " + url);

         urlScan = new Scanner (url);
         urlScan.useDelimiter("/");

         //  Print each part of the url
         while (urlScan.hasNext())
            System.out.println ("   " + urlScan.next());

         System.out.println();
		}
     }
	 catch(FileNotFoundException f){
		System.out.println("File not found");
	  }
	  
	//  catch(Exception f){
	//	System.out.println("Exception occurred!");
	  //}
	

      // Read and process each line of the file
      System.out.println("Bye");
   }
}
