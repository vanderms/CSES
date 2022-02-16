import java.io.*;

public class Program {

    static BufferedWriter out;
    static BufferedReader in;

    public static void main(String[] args) throws IOException {
        out = new BufferedWriter(new OutputStreamWriter(System.out));
        in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        if(n == 1){
            System.out.print(1);
            return;
        }

        if(n <= 3){
            System.out.print("NO SOLUTION");
            return;
        }

        for(int i = n - 1; i > 0; i-= 2){
            out.append(Integer.toString(i));
            out.append(' ');
        }

        for(int i = n; i > 0; i-= 2){
            out.append(Integer.toString(i));
            out.append(' ');
        }
        out.flush();
        out.close();
        in.close();
    }
}
