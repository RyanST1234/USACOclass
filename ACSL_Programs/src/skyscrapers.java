import java.util.*;
import java.io.*;
/*
 1, 2 
 1, 5
 2, 1
 2, 4
 3, 5
 4, 2
 4, 3
 5, 1
 2, 2
 1, 3
 
 */
public class skyscrapers {
	static Scanner in;
	
	static int input;
	static int answer;

	static int left, right;
	static int possArr;
	
	public static void main(String[] args) {
	
	
		in = new Scanner(System.in);
		for(int i = 0;i<10;i++) {
			init();
			solve();
			output();
		}
		
		

	}
	
	public static void init() {
		
		StringTokenizer st = new StringTokenizer(in.nextLine(), ", ");
		left=Integer.parseInt(st.nextToken());
		right=Integer.parseInt(st.nextToken());
		
		possArr = -1;
	}
	public static void solve() {
		possArr = 0;
		for(int i = 1;i<=5;i++)
		for(int j = 1;j<=5;j++)
		for(int k = 1;k<=5;k++)
		for(int l = 1;l<=5;l++)
		for(int m = 1;m<=5;m++)
			if(check(i, j, k, l, m)) {
				int towers[] = {i, j, k, l, m};
				int count = 1;
				int bar = towers[0];
				for(int a = 1;a<5;a++) {
					if(towers[a]>bar) {
						bar = towers[a];
						count++;
					}
				}
				int rcount = 1;
				bar = towers[towers.length-1]; 
				for(int a = 3;a>=0;a--) {
					if(towers[a]>bar) {
						bar = towers[a];
						rcount++;
					}
				}
				if(count==left&&rcount==right) {
					possArr++;
				}
			}
			
	}
	public static boolean check(int a, int b, int c, int d, int e) {
		return a!= b && a!= c && a!= d && a!= e &&
			b!= c && b!= d && b!= e &&
			c!= d && c!= e &&
			d!=e;
	}
	public static void output() {
	
			System.out.println(possArr);
			
	}
 
}
