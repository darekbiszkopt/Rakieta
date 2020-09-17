import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Rakieta{
    String nazwa;
    int wagaPaliwa;

    public Rakieta(String nazwa, int wagaPaliwa){
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }

    public void zatankuj(){
        wagaPaliwa += (int)(Math.random()*(2000+1)) ;


    }

    public void start() throws  Exception{
        if(wagaPaliwa < 1000){
            //throw new IllegalArgumentException("Start anulowany. Za mało paliwa =" + wagaPaliwa);
            throw new Exception("Start anulowany. Za mało paliwa =" + wagaPaliwa);
        }
        else
            System.out.println("Rakieta wystarotwała " + wagaPaliwa);
     }

}