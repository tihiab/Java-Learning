import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args){
		Scanner sc =new Scanner(System .in);
		System.out.println("输入第一个和尚的身高");
		int x=sc.nextInt();
		System.out.println("输入第二个和尚的身高");
		int y=sc.nextInt();
		System.out.println("输入第三个和尚的身高");
		int z=sc.nextInt();
		int max1=(x>y)? x:y;
		int max=(max1>z)? max1:z;
		System.out.println("经过比较,最高和尚的身高如下:");
		System.out.println("max:"+max);
		
	}
}