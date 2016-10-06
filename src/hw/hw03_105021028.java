package hw;
import java.util.*;
public class hw03_105021028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入n");
		int n =scn.nextInt();
		int b = 1;
		for(int a=n;a>=1;a--){
			b=b*a;
		}
		System.out.println(b);

	}

}
