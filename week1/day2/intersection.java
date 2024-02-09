package week1.day2;

public class intersection {
	public static void main(String[] args) {
		int num[]= {2,3,4,5,6,7,8,9,10,11,31};
		int num2[]= {12,13,14,15,9,16,17,21,17,19,11};
	
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num2.length;j++) {
				if(num[i]==num2[j]) {
					System.out.println("the matched data is:"+num[i]);
				}
			}
		}
	}
}
