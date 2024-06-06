package MyLessons;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class negativ {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Inserisci un numero: ");
        String inserimento = reader.readLine();
        int numero = Integer.parseInt(inserimento);

        if(numero < 0){
            numero += 1;
        }
        else if(numero > 0 ){
            numero *= 2;
        }
        System.out.println(numero);

    }
}
