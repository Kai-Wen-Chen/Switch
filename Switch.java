package s_witch;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			n = sc.nextInt();
			switch(n){
				case 0://單一case
					System.out.println("zero");
					break;
				case 1://不同case但執行相同動作
				case 2:
				case 3:
					System.out.println(n);
					break;
				default:
					break;
			}
		}
	}
}
