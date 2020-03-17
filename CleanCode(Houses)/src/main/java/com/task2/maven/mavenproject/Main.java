package com.task2.maven.mavenproject;
import java.util.Scanner;

import java.io.IOException;


public class Main 
{
    public static void main( String[] args ) throws IOException
    {
      Scanner sc = new Scanner(System.in);
      Houses houses = new Houses();
      int p =1;
      while(p==1){
    	  houses.readInput();
    	  houses.calculateCost(0, 0);
    	  System.out.println();
      	  System.out.println("press 1 to continue else 0 to break");
		  p = sc.nextInt();
      }
     
    }
}
