package by.htp4.les04.start;

import java.util.Random;

public class ExArray {

	public static void main(String[] args) {
		int arSize = 10;
		int[] ar;
		ar = createAndUnitArray(arSize);
		print(ar);
		System.out.println("max = ar[" + indexMaxNumberInArray(ar) + "] = " + maxNumberInArray(ar));
		System.out.println("min = ar[" + indexMinNumberInArray(ar) + "] = " + minNumberInArray(ar));
		System.out.println("Sorted:");
		
		print(sortArray(ar));
		System.out.println("max = ar[" + indexMaxNumberInArray(sortArray(ar)) + "] = " + maxNumberInArray(sortArray(ar)));
		System.out.println("min = ar[" + indexMinNumberInArray(sortArray(ar)) + "] = " + minNumberInArray(sortArray(ar)));
	}
	private static int[] createAndUnitArray(int arSize){
		
		int[] ar = new int[arSize];

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1001);
		}
		return ar;
	}

	private static void print(int[] ar) {
		for (int i = 0; i < (ar.length - 1); i++) {
			System.out.print(" ar[" + i + "] = " + ar[i] + ",");
		}
		System.out.print(" ar[" + (ar.length - 1) + "] = " + ar[ar.length - 1] + ".\n");
	}

	private static int maxNumberInArray(int[] ar) {
		int max = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		return max;
	}

	private static int minNumberInArray(int[] ar) {
		int min = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
		}
		return min;
	}

	private static int indexMaxNumberInArray(int[] ar) {
		int max = ar[0];
		int indexMax = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
				indexMax = i;
			}
		}
		return indexMax;
	}

	private static int indexMinNumberInArray(int[] ar) {
		int min = ar[0];
		int indexMin = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
				indexMin = i;
			}
		}
		return indexMin;
	}

	private static int[] sortArray(int[] ar) {
		int safe;

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					safe = ar[i];
					ar[i] = ar[j];
					ar[j] = safe;
				}
			}
		}
		return ar;
	}
}
