import java.util.Random;
import java.util.Scanner;
public class GuessRandom{
	public static void main(String[] args){
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		int x=r.nextInt(1000)+1;
		System.out .println("ϵͳ���������һ��1~1000֮�����x");
		System.out.println("��������µ���:");
		int a=sc.nextInt();
		int cnt=1;
		if(a==x){
			
		}else{
			do{
				if(a>x){
					System.out.println("�������������");
					System.out.println("----------------");
					System.out.println("��������һ����С����:");
					a=sc.nextInt();
				}else{
					System.out.println("���������С��");
					System.out.println("----------------");
					System.out.println("��������һ���������:");
					a=sc.nextInt();
				}
				cnt ++;
			}while(a!=x);
		}
		System.out.println("�����"+cnt+"��");
		System.out.println("��¶���,x����"+x);
	}
}