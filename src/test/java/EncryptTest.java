import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void newEncrypt_succesfullyInstanciates() {
        Encrypt newEncrypt = new Encrypt("a",1);
        assertEquals(true,newEncrypt instanceof Encrypt);
    }

    @Test
    public void newEncrypt_storesMessage_String() {
        Encrypt newEncrypt = new Encrypt("a",1);
        assertEquals("a",newEncrypt.getInput());
    }

    @Test
    public void newEncrypt_storesKey_String() {
        Encrypt newEncrypt = new Encrypt("a",1);
        assertEquals(1,newEncrypt.getKey());
    }

    @Test
    public void encode_encryptsCharacter_String() {
        Encrypt newEncrypt = new Encrypt("a",1);
        assertEquals("b",newEncrypt.encode(newEncrypt.getInput(),newEncrypt.getKey()));
    }

    @Test
    public void encode_encryptsWord_String() {
        Encrypt newEncrypt = new Encrypt("Moringa",3);
        assertEquals("Prulqjd",newEncrypt.encode(newEncrypt.getInput(),newEncrypt.getKey()));
    }

    @Test
    public void encode_encryptsSentence_String() {
        Encrypt newEncrypt = new Encrypt("Moringa is a top School",3);
        assertEquals("Prulqjd lv d wrs Vfkrro",newEncrypt.encode(newEncrypt.getInput(),newEncrypt.getKey()));
    }
}