import java.util.Scanner;

public class Main {
	public static void main(String[] args)   {
		
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		
		System.out.println(n*n);
		System.out.println(2); // O(n^2)
		
		sc.close();
		
	}
}
