package com.qa.doggo;

import java.util.ArrayList;
import java.util.Scanner;

public class DogComp {
	
	
	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);
//		Scanner in = new Scanner(System.in);//pos = position
//		int x = in.nextInt();
//		for (int i = 0;  i < 100; i++) {
			
			ArrayList<Integer>doggo = new ArrayList<Integer>();
			
			for (int i = 0;  i <= 100; i++) {
			doggo.add(i);
		}
			
//			for (i : doggo) {
//				if (i= number)
//					break;
//				else{ System.out.println());
//			}}
			
			System.out.println("Dog is in position : " + in);
		
			System.out.println(doggo);
	}
}

