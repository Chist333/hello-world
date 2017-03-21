package Test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc1.nextInt();
		}
		System.out.println(move(a, 0, a.length - 1, 0));
	}

	public static int move(int[] a, int start, int end, int step) {
		if (start >= end) {
			return step;
		} else {
			if (a[start] > a[end]) {
				a[end - 1] = a[end - 1] + a[end];
				return move(a, start, --end, ++step);
			} else if (a[start] < a[end]) {
				a[start + 1] = a[start] + a[start + 1];
				return move(a, ++start, end, ++step);
			} else {
				return move(a, ++start, --end, step);
			}
		}
	}
}
