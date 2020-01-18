import java.util.Scanner;
public class IfDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("give it to x");
		int x=sc.nextInt();
		switch(x){
			case 1 : 
				System.out.println("Monday");
				break;
			case 2 : 
				System.out.println("Tues");
				break;
			case 3 : 
				System.out.println("Wens");
				break;
			case 4 : 
				System.out.println("Thurs");
				break;
			case 5 : 
				System.out.println("Fri");
				break;
			case 6 : 
				System.out.println("Satur");
				break;
			case 7 : 
				System.out.println("Sun");
				break;
			default :
				System.out.println("wrong type");
				break;
			
		}
	}
}