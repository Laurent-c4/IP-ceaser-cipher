import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void newDecrypt_succesfullyInstanciates() {
        Decrypt newDecrypt = new Decrypt("a", 1);
        assertEquals(true, newDecrypt instanceof Decrypt);
    }

    @Test
    public void newDecrypt_storesMessage_String() {
        Decrypt newDecrypt = new Decrypt("a", 1);
        assertEquals("a", newDecrypt.getInput());
    }

    @Test
    public void newDecrypt_storesKey_String() {
        Decrypt newDecrypt = new Decrypt("a", 1);
        assertEquals(1, newDecrypt.getKey());
    }

    @Test
    public void decode_decryptsCharacter_String() {
        Decrypt newDecrypt = new Decrypt("b", 1);
        assertEquals("a", newDecrypt.decode(newDecrypt.getInput(), newDecrypt.getKey()));
    }

    @Test
    public void decode_decryptsWord_String() {
        Decrypt newDecrypt = new Decrypt("Prulqjd", 3);
        assertEquals("Moringa", newDecrypt.decode(newDecrypt.getInput(), newDecrypt.getKey()));
    }

    @Test
    public void decode_decryptsSentence_String() {
        Decrypt newDecrypt = new Decrypt("Prulqjd lv d wrs Vfkrro", 3);
        assertEquals("Moringa is a top School", newDecrypt.decode(newDecrypt.getInput(), newDecrypt.getKey()));
    }

}