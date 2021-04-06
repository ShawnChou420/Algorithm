package Basic;
//改良氣泡排序法
public class Sentry extends Object{
    int data[]=new int[] {5,4,3,2,1,0};//原始資料
	public static void main(String[] args) {
		System.out.print("改良氣泡排序法\n原始資料為:");
		Sentry test=new Sentry();
		test.showdata();
		test.bubble();
	}
	public void showdata() {   //利用迴圈印資料
		int i;
		for (i=0;i<6;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.print("\n");
	}
	public void bubble() {
		int i,j,tmp,flag;
		for(i=5;i>=0;i--) {
			flag=0;
			for(j=0;j<i;j++) {
				if(data[j+1]<data[j]) {
					tmp=data[j];
					data[j]=data[j+1];
					data[j+1]=tmp;
					flag++;//如果有執行過交換，則flag不為0
				}
			}
			if(flag==0) {
				break;
			}
			//當執行完一次掃描就判斷是否做過交換動作，如果沒有交換過資料
			//表示此時陣列已完成排序，故可直接跳出迴圈
			System.out.print("第"+(6-i)+"次排序");
			for(j=0;j<6;j++) {
				System.out.print(data[j]+" ");
			}
			System.out.print("\n");
		}
		System.out.print("排序後結果為:");
		showdata();
	}

}
