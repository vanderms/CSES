import java.io.*;

public class Program {

    static BufferedWriter out;
    static BufferedReader in;

    public static void main(String[] args) throws IOException {
        out = new BufferedWriter(new OutputStreamWriter(System.out));
        in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        out.append("0");
        if (n >= 2) {
            out.append("\n6");
        }
        if (n >= 3) {
            out.append("\n28");
        }
        if (n >= 4) {
            out.append("\n96");
        }

        for (int i = 5; i <= n; i++) {
            out.append("\n");
            final long squares = (long) i * i;
            long n3 = (squares - 3) * 4;
            long n4 = (squares - 4) * 8;
            long n5 = (squares - 5) * (4 + (4L * (i - 4)));
            long n7 = (squares - 7) * (4L * (i - 4));
            long n9 = (squares - 9) * ((long) (i - 4) * (i - 4));
            long possibilities = (n3 + n4 + n5 + n7 + n9) / 2;
            out.append(Long.toString(possibilities));
        }
        out.flush();
        out.close();
        in.close();
    }
}
