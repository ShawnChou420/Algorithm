package Basic;

public class 質數 {
	public static void main(String[] args) {
		//質數的定義:只能被1與自己整除的數值
		int m, n;
		int temp=0;
		System.out.println("100內的質數有：");
		A:for(n=2;n<100;n++) {//跑一個迴圈稱為A，從2往一百開始掃for迴圈，撈出2~100的質數
			for(m=2;m<n/2;m++) {//m也從2開始掃描，n/2的結果如果大於m,m就+1
		//以n=6為範例，6/2=3大於了2所以m++ 2+1=3
				if(n%m==0)//然後再如果6/3==0(餘數為0)
					//代表條件為能夠被自己與1以外的數整除，那就不是我們要找的質數
					continue A;//就捨棄此數值，繼續迴圈A
			}
			System.out.print(n+" "+"\t");
			temp++;
			if(temp%5==0) {//每輸出5個質數換一次行
				System.out.println();
			}
		}
	}
   
    }
	
	
	


