package AufgabenblattB;

import java.io.FileInputStream;
import java.io.IOException;

public class B8 {
    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream("B8_2.txt");


            for (int i = 0; (i = in.read()) != -1; ) {
                System.out.print(i + " ");
            }
                in.close();
    }
}