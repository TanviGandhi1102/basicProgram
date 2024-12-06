package bacicsprograms;

import java.util.Arrays;

public class AvgValueArray {
	public static void main(String[] args) {
		double salary[]=new double[4];
		salary[0]=10000;
		salary[1]=80000;
		salary[2]=40000;
		salary[3]=30000;
		System.out.println(Arrays.toString(salary));
		double sum=0;
		double avg=0;
		for(int i=0;i<salary.length;i++) {
			sum=sum+salary[i];
		}
		System.out.println(sum);
		avg=sum/salary.length;
		System.out.println("the average salary:" +avg);
	}

}
