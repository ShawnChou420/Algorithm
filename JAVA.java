package Basic;

import java.util.ArrayList;
import java.util.Collection;

public class JAVA {

	public static void main(String[] args) {
		int[] arr = { 4, 189, 49, 1,3,6 };
		for (int a = 0; a < arr.length; a++) {// 處理排序的次數迴圈
			for (int i = 0; i < arr.length - 1; i++) {// 操控元素得迴圈
				if (arr[i] < arr[i + 1]) {//元素內的值小於下一個值的話觸發換位
					int b = 0;//先宣告一個變數
					b = arr[i];//將第一個元素的值取代為變數b
					arr[i] = arr[i + 1];//把下面一個值取代為第一個值
					arr[i + 1] = b;//將變數b值取代i+1的元素位置
				}
			}
			System.out.print(arr[arr.length-1-a]+",");
			//因為i+1了，所以我們要印出arr[arr.lenth-1-a]將會獲得排序好位置的陣列
			//arr[arr.lenth-1-a]這段意思是印出arr[]中排序好的參數
			//arr.lenth為6，而我們要取的是已經轉換過位置的陣列，所以必須-1
			//再-a是因為他的處理次數迴圈的樹值，如果不-a，只會顯示第一個值
			//如果我們不用-1的話便會出現錯誤Index out of bounds for length
		}

	}
}
