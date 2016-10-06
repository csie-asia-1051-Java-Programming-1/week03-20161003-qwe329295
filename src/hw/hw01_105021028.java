package hw;
import java.util.*;
public class hw01_105021028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入一個正整數值(不含 0)");
		long v1 = scn.nextLong();
		long a = 0;
		while(v1>0){
			a ++;
			v1 = v1 / 10;
		}
		System.out.println(a+"位數");
	}

}
