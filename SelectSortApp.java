package Basic;

public class SelectSortApp {
	public static void main(String[] args) {
		int[]arr= {51,38,49,27,62,5,16};
		int i,j,min,temp,len;
		len=arr.length;
		for(i=0;i<len-1;i++) {//進行len-1選擇循環
			min=i;//第一位永遠是最小數
			for(j=i+1;j<len;j++) {//選擇從i到n-1號位置中最小的值得索引值
				if(arr[min]>arr[j]) {//比較索引中的數值大小
					min=j;//進行換位
				}
			}
			if(min!=i) {//如果最小值不在i號位置，則交換min與i號位置中的值
				temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			 }
		}
		System.out.println("選擇排序的結果是");
		for(i=0;i<len;i++) {
			System.out.print(arr[i]+",");
		}
	
 }
}