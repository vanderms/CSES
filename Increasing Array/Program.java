import java.io.*;
import java.util.StringTokenizer;

public class Program {

    static BufferedWriter out;
    static BufferedReader in;

    public static void main(String[] args) throws IOException {
        out = new BufferedWriter(new OutputStreamWriter(System.out));
        in = new BufferedReader(new InputStreamReader(System.in));

        long total = 0;
        int n = Integer.parseInt(in.readLine());
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int prev = Integer.parseInt(tokens.nextToken());



        for (int i = 1; i < n; i++) {
            int current = Integer.parseInt(tokens.nextToken());
            if (current >= prev) {
                prev = current;
            } else {
                total += prev - current;
            }
        }

        System.out.print(total);
        out.flush();
        out.close();
        in.close();
    }
}
