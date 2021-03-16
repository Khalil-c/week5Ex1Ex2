package com.nackademin.week5_ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i < 11; i++) {
			al.add(i);
		}
		Collections.shuffle(al);
		//System.out.println("cheet info "+al.toString());
		System.out.println("Give me 3 guesses to fine where is nr 5");
		try (Scanner sc = new Scanner(System.in)) {
			String firstGuess = sc.next();
			String secondGuess = sc.next();
			String thirdGuess = sc.next();
			int guess1 = Integer.valueOf(firstGuess);
			int guess2 = Integer.valueOf(secondGuess);
			int guess3 = Integer.valueOf(thirdGuess);
			
			if (al.get(guess1) == 5 || al.get(guess2)== 5 || al.get(guess3) == 5) {
				
				System.out.println("Right " + al.toString());

			} else
				System.out.println("Wrong " + al.toString());
		} catch (NumberFormatException e) {
			System.out.println("It is not a number,Give just a number of integer between 1 and 10, then press Enter");
		}catch (IndexOutOfBoundsException ex) {
			System.out.println("It is out of bounds,Give just a number of integer between 1 and 10, then press Enter");
		}

	}
}
