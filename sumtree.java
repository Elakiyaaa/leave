package beginners;
import java.util.Scanner;
public class sumtree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENTER THE NUMBER");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int temp=0;
		for(int i=0;i<=a;i++){
		temp=temp+i;
		}
		System.out.print(temp);
		}
	}


