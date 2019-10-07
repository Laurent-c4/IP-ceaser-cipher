public class Decrypt {
    private String input;
    private int key;

    public Decrypt(String input, int key) {
        this.input = input;
        this.key = key;
    }

    public String getInput() {
        return input;
    }


    public int getKey() {
        return key;
    }


    public String decode(String message, int encryptKey) {
        String decryptedMessage = "";

        for (int i = 0; i < message.length(); i++) {
            char a = message.charAt(i);
            int aIndex = (int) a;
            if (a == ' ') {
                decryptedMessage += a;
            } else if (Character.isUpperCase(a)) {
                decryptedMessage += (char) ((aIndex - encryptKey - 90) % 26 + 90);
            } else decryptedMessage += (char) ((aIndex - encryptKey - 122) % 26 + 122);
        }
        return decryptedMessage;
    }
}
