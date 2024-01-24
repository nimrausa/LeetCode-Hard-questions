package practice_hard_ques;

import java.util.Scanner;

public class BookAllocationProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int nob=sc.nextInt();
			int nos=sc.nextInt();
			int [] pages=new int [nob];
			for (int i = 0; i < pages.length; i++) {
				pages[i]=sc.nextInt();
				
			}
			System.out.println(numberofpages( pages,nos));
		}

	}
	public static int numberofpages(int[] pages, int nos) {
		int lo=0;
		int hi=0;
		int ans=0;
		for (int i = 0; i < pages.length; i++) {
			hi=hi+pages[i];	
		}
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isitpossible(pages,mid,nos)==true) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
		
	}
	public static boolean isitpossible(int [] pages, int mid, int nos) {
		int students=1;
		int readpages=0;
		int i=0;
		while(i<pages.length) {
			if(readpages+pages[i]<=mid) {
				readpages=readpages+pages[i];
				i++;
			}
			else {
				students++;
				readpages=0;
			}
			if(students>nos) {
				return false;
			}
			
			
		}
		return true;
		
	}

}


//First line contains integer t as number of test cases. Next t lines contains two 
//lines. For each test case, 1st line contains two integers n and m which 
//represents the number of books and students and 2nd line contains n space 
//separated integers which represents the number of pages of n books in 
//ascending order.