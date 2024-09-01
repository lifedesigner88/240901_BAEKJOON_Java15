import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);

        StringTokenizer firstLine = new StringTokenizer(br.readLine(), " ");

        int buckets = Integer.parseInt(firstLine.nextToken());
        int tryCounters = Integer.parseInt(firstLine.nextToken());

        int[] result = new int[buckets + 1];

        for (int i = 1; i < result.length; i++) result[i] = i;

        for (int i = 0; i < tryCounters; i++) {

            StringTokenizer next = new StringTokenizer(br.readLine(), " ");

            int start = Integer.parseInt(next.nextToken());
            int end = Integer.parseInt(next.nextToken());

            int temp = result[start];
            result[start] = result[end];
            result[end] = temp;

        }

        for (int i = 1; i < result.length; i++)
            bw.write(result[i] + " ");

        bw.flush();
        bw.close();

    }
}