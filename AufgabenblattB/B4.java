package AufgabenblattB;

import java.io.*;

public class B4 {
        public static void main(String[] args) throws IOException {

            System.out.println("Zu lesende Datei eingeben:");
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String s=bufferRead.readLine();

            try {
                FileInputStream tex = new FileInputStream(""+s);

                for(int i=0; (i = tex.read()) != -1; ) {
                    System.out.print(encodeChar(i));
                }

                tex.close();

            } catch (FileNotFoundException e) {
                System.out.print("Datei wurde nicht gefunden!");
                System.exit(0);
            }
        }
        public static char encodeChar (int i){
            return ((char) i);
        }
    }



