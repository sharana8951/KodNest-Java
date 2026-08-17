import java.util.Scanner;
public class Pgm1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter Array Elements : ");
		
		int b[] = new int[a.length];
		int j=b.length-1;
		
		for(int i=0; i<=a.length-1; i++)
		{
			a[i] = scan.nextInt();
		}
		
		
		
		
		for(int i=0; i<=a.length-1; i++)
		{
			b[j]= a[i];
			j--;
		}
		
		
		
		
		
		System.out.println("Array a :");
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Array b :");
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(b[i]);
		}
		
		
		
		
		
	}
		
}
