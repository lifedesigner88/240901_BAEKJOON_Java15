import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int STUDNET = 30;

        int[] result = new int[STUDNET];


        for (int i = 0; i < STUDNET - 2; i++) {
            int studnetNum = Integer.parseInt(br.readLine()) - 1;
            result[studnetNum] = 1;
        }

        for (int i = 0; i < STUDNET; i++)
            if (result[i] == 0)
                System.out.println(i + 1);

    }
}