import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);

        String str = br.readLine();
        int bucketsNumber = Integer.parseInt(str.charAt(0) + "");
        int counter = Integer.parseInt(str.charAt(2) + "");

        int[] buckets = new int[bucketsNumber + 1];

        for (int i = 1; i <= bucketsNumber; i++) buckets[i] = i;
        for (int i = 0; i < counter; i++) {
            String range = br.readLine();
            int start = Integer.parseInt(range.charAt(0) + "");
            int end = Integer.parseInt(range.charAt(2) + "");
            changeArrayWithRange(buckets, start, end);
        }

        for (int i = 1; i <= bucketsNumber; i++)
            bw.write(buckets[i] + " ");

        bw.flush();
        bw.close();


    }

    static void changeArrayWithRange(int[] arr, int start, int end) {
        for (int i = 0; i <= (end - start) / 2; i++) {
            int temp = arr[start + i];
            arr[start + i] = arr[end - i];
            arr[end - i] = temp;
        }
    }

}