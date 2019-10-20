package AufgabenblattB;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static java.nio.charset.StandardCharsets.UTF_8;

public class B6 {
    public static void main(String[] args) throws IOException {
        try {
            //  BufferedWriter out = new BufferedWriter(new FileWriter("B6..txt"));
            OutputStreamWriter stream  = new OutputStreamWriter(new FileOutputStream("diewelt.txt"),UTF_8);
            stream.write("Die Welt kostet 17 €\n");
            stream.flush();
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream in = null;

        in = new FileInputStream("diewelt.txt");

        for(int i=0; (i = in.read()) != -1; ) {
            System.out.print(i +" ");
        }
        in.close();
    }
}
