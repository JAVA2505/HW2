package academy.mate;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import sun.security.util.Cache.EqualByteArray;

public class A {
	public static void main(String[] args) {
		System.out.println("I'm class A");
		
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			int rnd = (int) (Math.random() * (arr.length - i));
			System.out.println("Num=" + arr[rnd]);
			int temp = arr[rnd];
			arr[rnd] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
			System.out.println(Arrays.toString(arr));

		}

		int[][] arr1 = new int[3][];
		arr1[0] = new int[6];
		arr1[0] = new int[3];
		arr1[0] = new int[8];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(arr1[i]));

		}
		System.out.println(Arrays.deepToString(arr1));

		String[][] db = new String[3][3];

		Scanner in = new Scanner(System.in);
		for (int i = 0; i < db.length; i++) {
			System.out.println("Enter row #" + (i + 1) + ":");
			String[] temp = in.nextLine().split(" ");
			if (temp.length != db[i].length) {
				System.out.println("Error");
				i--;
			} else {
				db[i] = temp;
			}
		}
		
		String search = in.nextLine();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (db[i][j].equals(search)) {
					System.out.println(Arrays.toString(db[i][1]) + Arrays.toString(db[i][2]) + Arrays.toString(db[i][3]));
				};
			}
		}
		
		System.out.println(Arrays.toString("1 2 3".split(" ")));
		
		do {
			System.out.println("Enter query: ");
			String query = in.nextLine();
			if (query.equals("exit")) 
			break;
			for (int i = 0; i < db.length; i++) {
				for (int j = 0; j < db[i].length; j++) {
					if(db[i][j].contains(query)) {
						System.out.println(Arrays.toString(db[i]));
						break;
					}
				}while (true);
			
			System.out.printf("--%2$5d--%s-%tB",10,"Hello",new Date());
		}
	}
}