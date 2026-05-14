package shall.test;

import shall.domain.Client;
import shall.error.ClassException;
import java.io.FileNotFoundException;

public class PersonTest05 {
    public static void main(String[] args) throws ClassException {
        Client client = new Client("Ratiello", 21, "Rui Barbosa 01");

        try {
            client.save();
        } catch (ClassException | FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
