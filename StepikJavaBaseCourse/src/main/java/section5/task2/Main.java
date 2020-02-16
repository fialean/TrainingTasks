package section5.task2;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        int next;
        int prev = reader.read();
        while (prev != -1 &&  (next = reader.read())!=-1) {

            if (prev != 13 || next != 10) {
                System.out.print((char) prev);
            }
            prev = next;
        }
            System.out.flush();

            int buf;
            int buf2 = System.in.read();

//            while ((buf = System.in.read()) != -1 && buf2 != -1) {
//                if (buf2 != 13 || buf != 10) {
//                    System.out.print((char) buf2);
//                }
//
//                buf2 = buf;
//            }
//
//            if (buf2 != -1) {
//                System.out.print((char) buf2);
//            }
//
//            System.out.flush();
        }
    }
