package Basic;

public class InsertSortApp {
	public static void main(String[] args) {
		int[]arr= {49,38,29,19,22,52};
		int i,j,temp;
		int len=arr.length;
		for(i=1;i<len;i++) {
			temp=arr[i];//陣列第二個元素(38)1~5
			j=i-1;//陣列第一個元素(49)0，此時j=i-1已經把陣列元素中要排序的元素放置第一位了
			//與已排列的數逐一比較，大於temp時，該數往後移
			while((j>=0)&&(arr[j]>temp)) {//關鍵在這句
				//當j>=0和arr[j]>temp說明j位置(0)和arr[j]元素中的數值如果大於變數temp時
				arr[j+1]=arr[j];//就把後面的一個位置交換為第一個元素
				j--;//當j>=0 -1 無法滿足後面arr[j]>temp條件，就會跳出迴圈
			}
			arr[j+1]=temp;//再從-1+1=0跳回迴圈繼續執行
		}
		System.out.println("插入的排序是");
		for(i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	
 }
}