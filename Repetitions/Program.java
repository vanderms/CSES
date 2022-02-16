import java.io.*;
import java.util.StringTokenizer;

public class Program {

    static BufferedWriter out;
    static BufferedReader in;

    public static void main(String[] args) throws IOException {
        out = new BufferedWriter(new OutputStreamWriter(System.out));
        in = new BufferedReader(new InputStreamReader(System.in));

        char[] sequence = in.readLine().toCharArray();

        int prev = 0;
        int max = 1;

        for(int i = 1; i < sequence.length; i++){
            if(sequence[i] == sequence[prev]){
                max = Math.max(max, i - prev + 1);
            }
            else{
                prev = i;
            }
        }

        System.out.print(max);

        out.flush();
        out.close();
        in.close();
    }
}
