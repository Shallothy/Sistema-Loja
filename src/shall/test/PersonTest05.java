package shall.test;

import shall.domain.Client;
import shall.error.LoginInvalidoException;
import java.io.FileNotFoundException;

public class PersonTest05 {
    public static void main(String[] args) throws LoginInvalidoException {
        Client client = new Client("Ratiello", 21, "Rui Barbosa 01");

        try {
            client.save();
        } catch (LoginInvalidoException | FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
