package com.task2.maven.mavenproject;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Interest {
	public static void main( String[] args ) throws IOException
    {
    	Scanner sc = new Scanner(System.in);
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	bw.write("Choose either option 1 or 2 :"+"\n");
    	bw.write("1.Simple Interest"+"\n");
    	bw.write("2.Compound Interest"+"\n");
    	bw.flush();
    	SimpleInterest simpleInterest = new SimpleInterest();
    	CompoundInterest compoundInterest = new CompoundInterest();
    	int p = 1;
    	while(p==1){
    		System.out.println("Enter Your Choice:");
    		int n = sc.nextInt();
        	if(n==1){
        		simpleInterest.readInput();
    			simpleInterest.calculateSimpleInterest();
        	}
        	else if(n==2){
        		compoundInterest.readInput();
    			compoundInterest.calculateCompoundInterest();
        	}
        	else{
        		bw.write("Please Enter Valid Option!");
        		bw.flush();
        	}
        	System.out.println();
        	System.out.println("press 1 to continue else 0 to break");
 			p = sc.nextInt();
    		
    	}
    	bw.flush();
    }

}
