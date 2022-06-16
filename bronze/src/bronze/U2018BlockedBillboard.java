package bronze;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class U2018BlockedBillboard {
	static Scanner in;
	static PrintWriter out;
	static int[] lawn = new int[4];
	static int[] feed = new int[4];
	static int output;
	static int area;
	public static void main(String[] args) throws IOException {
		init();
		solve();
		output();
		
		
		
	}
	
	public static void init() throws IOException {
		in = new Scanner(new File("paint.in"));
		out = new PrintWriter(new FileWriter("paint.out"));
		for(int i = 0; i<3;i++) {
			lawn[i] = Integer.parseInt(in.next())+1000;
		}
		for(int i = 0; i<3;i++) {
			feed[i] = Integer.parseInt(in.next())+1000;
		}
	area = (lawn[2]-lawn[0])*(lawn[3]-lawn[1]);
		output = area;
		
		
	}
	
	
	
	public static void solve() {
		int sub = 0;
		int XlengthL = lawn[2]-lawn[0];
		int YlengthL = lawn[3]-lawn[1];
		//int XlengthF = feed[2]-feed[0];
		//int YlengthF = feed[3]-feed[1];
		
		//lengthwise, vertical
		if(feed[0] < lawn[0] && feed[1]>lawn[0] && feed[2]>lawn[2]) {
			out.print(output);
		}
			
		else if(feed[2]-feed[0]>lawn[2]-lawn[0]) {
			if(feed[0]<=lawn[0] && feed[2]>=lawn[2]) {
				int BL = Math.min(lawn[1], lawn[3]);
				int TL = Math.max(lawn[1], lawn[3]);
				int BF = Math.min(feed[1], feed[3]);
				int TF = Math.max(feed[1], feed[3]);
				if(BL<BF && TL<TF && TL>BF) { //above
					sub = Math.abs((TF-BL)* XlengthL);
				}
				else if(TF<TL && BF<BL && TF>BL) { //below
					sub = Math.abs((TF-BL)* XlengthL);
				}
				
			}
			out.print(output);
		}
		//heightwise, horizontal
		else if(feed[3]-feed[1]>lawn[3]-lawn[1]) {
			if(feed[1]<=lawn[1] && feed[3]>=lawn[3]) {
				int LL = Math.min(lawn[0], lawn[2]);
				int RL = Math.max(lawn[0], lawn[2]);
				int LF = Math.min(feed[0], feed[2]);
				int RF = Math.max(feed[0], feed[2]);
				if(LL>LF && RL>RF && LL<RF) {//covers the left
					sub = Math.abs((RF-LL)* YlengthL);
				}
				else if(RF>RL && LF>LL && LF<RL) { //covers the right
					sub = Math.abs((RF-LL)* YlengthL);
				}
				
			}
			out.print(output);
		}
		else { out.print(output);}
		
		
	}



	public static void output() {
	
		
		
	}
}
