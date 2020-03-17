package com.task2.maven.mavenproject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class SimpleInterest {
	float principleAmount,rate,time,simpleInterest;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	void readInput() throws IOException{
		Scanner sc = new Scanner(System.in);
		bw.write("Enter Principle Amount : ");
		bw.flush();
		principleAmount = sc.nextFloat();
		bw.write("Enter Rate : ");
		bw.flush();
		rate = sc.nextFloat();
		bw.write("Enter Time Period : ");
		bw.flush();
		time = sc.nextFloat();
	}
	void calculateSimpleInterest() throws IOException{
		simpleInterest = (principleAmount * rate * time)/100;
		bw.write("Total Amount : "+simpleInterest);
		bw.flush();
	}
	
}
