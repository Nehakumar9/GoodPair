package goodpair;

import java.util.Scanner;

public class GoodPair {

	public static int goodPair(int array[],int size,int k) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(array[i]+array[j]==k) {
					return 1;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int results = goodPair(array,n,k);
		System.out.println(results);
	}

}
