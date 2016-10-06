package hw;
import   java.util.*;
public class hw02_105021028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int z = 0;
		char did='y';
		while(did=='y'){
			System.out.println("請輸入一個數");
			long n =scn.nextLong();
			if(n>0){
				x++;
			}else{
			if(n<0){
				y++;
			}else{
			    z++;
			}
			
			}
			System.out.println("是否繼續 (y/n):");
			did = scn.next().charAt(0);  
		}
		System.out.println("正數"+ x +"個"+"負數"+ y + "個"+"零"+ z +"個");
	}

}
