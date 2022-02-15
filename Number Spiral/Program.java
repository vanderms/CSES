import java.io.*;

public class Program {

    static BufferedWriter out;
    static BufferedReader in;

    public static void main(String[] args) throws IOException {
        out = new BufferedWriter(new OutputStreamWriter(System.out));
        in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        for(int i = 0; i  < n ; i++){
            String[] numbers = in.readLine().split(" ");
            solve(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]));
        }

        out.flush();
        out.close();
        in.close();
    }

    public static void solve(int y, int x) throws IOException {
        long max = Math.max(y, x);
        long start = (max - 1) * (max -1);

        long end = max * max + 1;
        long result;

        if(max % 2 == 0){
            result = max == x ? start + y : end - x;
        }
        else {
            result = max == x ? end - y : start + x;
        }
        out.append(Long.toString(result));
        out.append("\n");
    }
}
