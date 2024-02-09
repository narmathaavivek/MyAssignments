package week1.day2;

import java.util.Arrays;

public class missingnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,6,2,1,7};
		Arrays.sort(a);
		int sum=0;
		int total=0;
	
		for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
		}
		
		for(int j=1;j<=7;j++) {
			total=total+j;
		}
		System.out.println("the missing number is:"+(total-sum));
	}

}
