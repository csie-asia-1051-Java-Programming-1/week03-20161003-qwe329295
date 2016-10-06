package hw;
import java.util.*;
public class hw05_105021028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入n");
		int n = scn.nextInt();
		int a = 0;
		for(int b = 1;b<=n;b++){
			a = a  +(b*(b+1));	
		}
		System.out.println(a);
		
	}

}
