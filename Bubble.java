package Basic;

public class Bubble extends Object {

	public static void main(String[] args) {
		int i,j,tmp;
		int data[]= {9,8,7,6,5,4};//原始資料
		System.out.println("氣泡排序法：");
		System.out.print("原始資料為:");
		for(i=0;i<6;i++) {
			System.out.print(data[i]+",");
		}
		System.out.print("\n");
		for (i=5;i>0;i--) {//掃描次數
			for(j=0;j<i;j++){//比較、交換次數
				//比較相鄰兩數，如第一數較大則交換
				if(data[j]>data[j+1]) {//如果第一個元素大於後面一個元素
					tmp=data[j];//把第一個元素的值取代進tmp變數
					data[j]=data[j+1];//再把第二個元素取代放入原本空的陣列元素
					data[j+1]=tmp;//再把tmp的值放進第二個元素
				}
			}
			//把各次掃描後的結果印出
			System.out.print("第"+(6-i)+"次排序後的結果是:");
			for(j=0;j<6;j++) {
				System.out.print(data[j]+",");
			}
			System.out.println("\n");
		}
		System.out.print("排序後的結果為:");
		for(i=0;i<6;i++) {
			System.out.print(data[i]+",");
		}
		System.out.print("\n");

	}

}
