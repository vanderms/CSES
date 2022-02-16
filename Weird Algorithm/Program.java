import java.io.*;

public class Program {

    static BufferedWriter out;
    static BufferedReader in;

    public static void main(String[] args) throws IOException {
        out = new BufferedWriter(new OutputStreamWriter(System.out));
        in = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(in.readLine());
        out.append(Long.toString(n));
        out.append(' ');

        while (n != 1) {
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            out.append(Long.toString(n));
            out.append(' ');
        }

        out.flush();
        out.close();
        in.close();
    }
}
