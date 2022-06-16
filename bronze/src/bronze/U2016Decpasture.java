package bronze;
import java.util.*;
import java.io.*;
public class U2016Decpasture {
	static Scanner in;
	static PrintWriter out;
	static int[] r1, r2;
	static int output;
	public static void main(String[] args) throws IOException {
		

		init();
		solve();
		output();

	}

	
public static void init() throws IOException {
	in = new Scanner(new FileReader("square.in"));
	out = new PrintWriter(new FileWriter("square.out"));
	r1 = new int[4];
	r2 = new int[4];

	for(int i = 0;i<4;i++) {
		r1[i] = in.nextInt();
	}
	for(int i = 0;i<4;i++) {
		r2[i] = in.nextInt();
	}
	in.close();
}

public static void solve() {
int x1 = r1[0];
int y1 = r1[1];
int x2 = r1[2];
int y2 = r1[3];

int xx1 = r2[0];
int yy1 = r2[1];
int xx2 = r2[2];
int yy2 = r2[3];

int left = Math.min(x1, xx1);
int right = Math.max(x2, xx2);
int bottom = Math.min(y1, yy1);
int top = Math.max(y2, yy2);
int side = Math.max(right - left, top - bottom);

output = side*side;


}

public static void output() {
out.println(output);
out.close();
}
}