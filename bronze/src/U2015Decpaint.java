import java.util.*;
import java.io.*;
public class U2015Decpaint {

	static Scanner in;
	static PrintWriter out;
	static int a, b, c, d;
	static int total;
	
	public static void main(String[] args) throws IOException {
		init();
		solve();
		output();
		
		
		
	}
	
	public static void init() throws IOException {
		in = new Scanner(new File("paint.in"));
		out = new PrintWriter(new FileWriter("paint.out"));
		
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		total = 0;
		
		in.close();
	}
	
	
	
	public static void solve() {
		int intersect = Math.min(b, d) - Math.max(a, c);
		if(intersect<0) {
			intersect=0;
		}
		total = (b-a)+(d-c)-intersect;
	}



	public static void output() {
	out.println(total);
	out.close();
		
		
	}
	
	
}
