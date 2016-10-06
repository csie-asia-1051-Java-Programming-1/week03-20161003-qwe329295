package hw;
import java.util.*;
public class hw04_105021028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入n");
		int n = scn.nextInt();
		int a = 1,tel=1;
		while(a<=n){
			tel=tel*a;
			a ++;
		}
     System.out.println(tel);
	}

}
