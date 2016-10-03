package ex;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021028 蕭佑誠
 */
import java.util.*;
public class ex05_105021028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if(n%2==0){
			System.out.println("偶數");
		}else{
			if(n%2==1){
				System.out.println("奇數");
			}
		}

	}

}
