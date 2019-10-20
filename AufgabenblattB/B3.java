package AufgabenblattB;

import java.io.*;

public class B3 {
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
        } catch (IOException e) {
            System.out.print("Fehler beim Einlesen der Datei!");
        }
    }

    public static int decodeChar(char c){
        return ((int) c);
    }
    public static char encodeChar (int i){
        return ((char) i);
    }
}


