import java.io.*;
import java.util.StringTokenizer;

public class Program {

    static BufferedWriter out;
    static BufferedReader in;

    public static void main(String[] args) throws IOException {
        out = new BufferedWriter(new OutputStreamWriter(System.out));
        in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        boolean[] numbers = new boolean[n + 1];

        StringTokenizer entries = new StringTokenizer(in.readLine());

        while(entries.hasMoreTokens()){
            numbers[Integer.parseInt(entries.nextToken())] = true;
        }

        for(int i = 1; i <= n; i++){
            if(!numbers[i]){
                System.out.print(i);
                return;
            }
        }

        out.flush();
        out.close();
        in.close();
    }
}
