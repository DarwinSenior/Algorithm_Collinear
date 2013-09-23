/*************************************************************************
 *  Compilation:  javac PointPlotter.java
 *  Execution:    java PointPlotter input.txt
 *  Dependencies: Point.java, In.java, StdDraw.java
 *
 *  Takes the name of a file as a command-line argument.
 *  Reads in an integer N followed by N pairs of points (x, y)
 *  with coordinates between 0 and 32,767, and plots them using
 *  standard drawing.
 *
 *************************************************************************/

public class PointPlotter {
    public static void main(String[] args) {

        // rescale coordinates and turn on animation mode
        StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);
        StdDraw.show(0);

        // read in the input
//        String filename = args[0];
        In in = new In("/Users/DarwinSenior/Downloads/collinear/input6.txt");
        int N = in.readInt();
        System.out.println(N);
        for (int i = 0; i < N; i++) {
            int x = in.readInt();
            int y = in.readInt();
            System.out.println(x+" "+y);
            Point p = new Point(x, y);
            p.draw();
        }

        // display to screen all at once
        StdDraw.show(0);
    }
}
