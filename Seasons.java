import java.util.Scanner;
public class Seasons{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		if(0<x&&x<13){
			int k=(x-1)/3;
			switch(k){
				case 0 :
					System.out.println("Spring");
					break;
				case 1:
					System.out.println("Summer");
					break;
				case 2 :
					System.out.println("Fall");
					break;
				case 3 :
					System.out.println("Winter");
					break;
			}
		}else{
			System.out.println("Wrong Type");
		}
		
	}
}