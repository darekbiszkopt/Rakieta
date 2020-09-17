import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Pliki {

    public static void main(String[] args) throws IOException {

        FileInputStream fis =  new FileInputStream("1text.txt");
        StringBuilder sb = new StringBuilder();

        int c;
        String s = "";

        while((c = fis.read()) !=-1){

//            System.out.print((char)c);
            sb.append((char)c);

//         sb.append  -->  zajebiscie wydajne      mniej wydajne -->   s += (char)c;

        }

        String text = sb.toString();
//        System.out.println(s);
//        System.out.println(text);
            String odp = sb.reverse().toString();
        System.out.println(odp);

        FileOutputStream fos = new FileOutputStream("odp.txt");
        for (int i = 0; i < odp.length(); i++) {

            fos.write(odp.charAt(i));

        }
    }

}
