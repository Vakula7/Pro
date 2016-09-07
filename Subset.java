package java2;

import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count=0;
		int size1 = sc.nextInt();
		int size2=sc.nextInt();
		if(size1<=size2)
		{
		int[] a1 = new int[size1];
		int[] a2 = new int[size2];
		for(int i=0;i<size1;i++)
			a1[i]=sc.nextInt();
		for(int j=0;j<size2;j++)
			a2[j]=sc.nextInt();
		for(int z=0;z<size1;z++)
		{
			for(int q=0;q<size2;q++)
			{
				if(a1[z]==a2[q])
					count++;
			}
		}
		if(count==size1)
			System.out.println("subset");
		else
			System.out.println("not subset");
		}
		
		else
			System.out.println("not subset");
	}

}
