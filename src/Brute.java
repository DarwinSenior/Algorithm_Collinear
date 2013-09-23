import java.util.Arrays;


public class Brute {
	public static void main(String[] args) {
		In in=new In(args[0]);
		int N=in.readInt();
		Point[] points=new Point[N];
		for (int i = 0; i < N; i++) {
			int x,y;
			x=in.readInt();
			y=in.readInt();
			points[i]=new Point(x, y);
		}
		Arrays.sort(points);
		for (int i = 0; i < N-3; i++) {
			for (int j = i+1; j < N-2; j++) {
				double slop1=points[i].slopeTo(points[j]);
				for (int k = j+1; k < N-1; k++) {
					double slop2=points[j].slopeTo(points[k]);
					if (slop1==slop2) 
					for (int l = k+1; l < N; l++) {
						double slop3=points[k].slopeTo(points[l]);
						if (slop2==slop3) {
							StdOut.printf("%s -> %s -> %s -> %s\n",points[i],points[j],points[k],points[l]);
						}
					}
				}
			}
		}
	}
}
