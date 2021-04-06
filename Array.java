package Basic;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[]score = new int[5];
		for(int i=0;i<5;i++) {
			System.out.printf("請輸入第%d/5個整數:",i+1);//這是格式化輸出
			score[i]=sc.nextInt();
		}
			sc.close();//關閉輸入串流
			System.out.print("你輸入的整數是:");
			for(int i=0;i<score.length;i++) {
				System.out.printf(score[i]+",");
			}
		}

	}


