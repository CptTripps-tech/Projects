package AufgabenblattB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.Math;

/**
 * @author ...
 *
 */
public class DWS {

    public static void main(String[] args) {

        try {
            BufferedReader in
                    = new BufferedReader(new FileReader("DWS-TOP-DIVIDENDE.csv"));

            // die ersten sechs Zeilen überlesen
            int cnt = 0;
            while (in.readLine() != null && cnt < 7) {
                in.readLine();
                cnt++;
            }

            //Nachher komfortabler machen!
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            String s;

            DecimalFormat df=new DecimalFormat();
            String[]ak;
            String[]ek;

            double ekw=0;
            double akw = 0;
            Date an=null;
            Date je = null;

            try {
                an=sdf.parse("11.11.2011");
                je = sdf.parse("23.11.2011");
                System.out.printf("Jahresanfang gesetzt:%tF%n",an);
                System.out.printf("Jahresende gesetzt: %tF%n", je);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            while ((s = in.readLine()) != null) {
                int i = s.indexOf(';');
                //String ds =s; //irgendwie umständlich, geht das nicht komfortabler?
                Date d = null;

                try {
                    d = sdf.parse(s);
                } catch (ParseException e) {
                    e.printStackTrace();
                    break;
                }


                if (an.equals(d)) {
                 System.out.printf("Jahresanfang gefunden:%tF%n ", d);
                        ak=s.split(";");
                    try {
                        akw = (double) df.parse(ak[1]);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }

                if (je.equals(d)) {
                    System.out.printf("Jahresende gefunden:%tF%n", d);
                    ek=s.split(";");
                    try {
                        ekw= (double) df.parse(ek[1]);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }


            if(akw<ekw){
                System.out.print("bull");
            }else{
                System.out.print("bear");
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
