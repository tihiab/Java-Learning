import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args){
		Scanner sc =new Scanner(System .in);
		System.out.println("�����һ�����е����");
		int x=sc.nextInt();
		System.out.println("����ڶ������е����");
		int y=sc.nextInt();
		System.out.println("������������е����");
		int z=sc.nextInt();
		int max1=(x>y)? x:y;
		int max=(max1>z)? max1:z;
		System.out.println("�����Ƚ�,��ߺ��е��������:");
		System.out.println("max:"+max);
		
	}
}