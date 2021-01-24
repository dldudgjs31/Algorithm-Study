package backjun_level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int tmp = input;
        int units = 0;
        int tens = 0;
        boolean isPass = false;
        int count = 0;

        while(!isPass) {
            tens = tmp / 10;
            units = tmp % 10;
            tmp = units * 10 + ((tens + units) % 10);
            count++;
            if(tmp == input)
                isPass = true;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
