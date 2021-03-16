package com.nackademin.week5_ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		Random r = new Random();

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			al.add(r.nextInt(3));
		}
		int guess1 = 0;
		int freqOf0 = 0;
		int freqOf1 = 0;
		int freqOf2 = 0;
		int MaxFreq = 0;

		//System.out.println("cheet info " + al.toString());
		System.out.println("Give me the most frequent of 0,1 or 2");
		try (Scanner sc = new Scanner(System.in)) {
			String guess = sc.next();

			guess1 = Integer.valueOf(guess);
			if (guess1>2) {
			System.out.println("Wrong number, Give just a number of integer between 0 and 2");
			System.exit(0);
			}
			
			freqOf0 = Collections.frequency(al, 0);
			freqOf1 = Collections.frequency(al, 1);
			freqOf2 = Collections.frequency(al, 2);

			if ((freqOf0 > freqOf1) && (freqOf0 > freqOf2)) {
				System.out.println("The most frequent is 0");
				MaxFreq = 0;
			} else if ((freqOf2 > freqOf1) && (freqOf2 > freqOf0)) {
				System.out.println("The most frequent is 2");
				MaxFreq = 2;
			} else if ((freqOf1 > freqOf0) && (freqOf1 > freqOf2)) {
				System.out.println("The most frequent is 1");
				MaxFreq = 1;
			} else {
				System.out.println("No winner");
			}

			if (guess1 == MaxFreq) {

				System.out.println("Right you win" + al.toString());

			} else
				System.out.println("Wrong you lose" + al.toString());
		} catch (NumberFormatException e) {
			System.out.println("It is not a number,Give just a number of integer between 0 and 2, then press Enter");
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("It is out of bounds,Give just a number of integer between 1 and 2, then press Enter");
		}

	}

}
