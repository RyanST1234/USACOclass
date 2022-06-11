import java.util.*;
import java.io.*;
public class U2017Decbillboard {
	static Scanner in;
	static PrintWriter out;
	static int[] b1, b2, t;
	static int output;
	public static void main(String[] args) throws IOException {
		init();
		solve();
		output();

	}

	
public static void init() throws IOException {
	in = new Scanner(new FileReader("paint.in"));
	out = new PrintWriter(new FileWriter("paint.out"));
	b1 = new int[4];
	b2 = new int[4];
	t = new int[4];
	for(int i = 0;i<4;i++) {
		b1[i] = in.nextInt();
	}
	for(int i = 0;i<4;i++) {
		b2[i] = in.nextInt();
	}
	for(int i = 0;i<4;i++) {
		t[i] = in.nextInt();
	}
	output = 0;
	in.close();
}

public static void solve() {
Rect b1 = new Rect(U2017Decbillboard.b1);
	
Rect b2 = new Rect(U2017Decbillboard.b2);
Rect t = new Rect(U2017Decbillboard.t);

	output = b1.area() + b2.area() - Rect.intersect(b1, t) - Rect.intersect(b2,t ); 
}

public static void output() {
out.print(output);
out.close();
}
}


class Rect{
	int x1,y1,x2,y2;
	
	Rect(int[] data){
		x1 = data[0];
		y1 = data[1];
		x2 = data[2];
		y2 = data[3];
		
	}
	public int area() {
		return (x2-x1)*(y2-y1);
	}
	public static int intersect(Rect a, Rect b) {
		int xoverlap = Math.min(a.x2, b.x2) - Math.max(a.x1, b.x1);
		int yoverlap = Math.min(a.y2, b.y2) - Math.max(a.y1, b.y1);
		return xoverlap*yoverlap;
	}
}
