public class Encrypt {
    private String input;
    private int key;

    public Encrypt(String input, int key) {
        this.input = input;
        this.key = key;
    }

    public String getInput() {
        return input;
    }

    public int getKey() {
        return key;
    }

    public String encode(String message, int encryptKey) {
        String encryptedMessage = "";

        for (int i = 0; i < message.length(); i++) {
            char a = message.charAt(i);
            int aIndex = (int) a;
            if (a == ' ') {
                encryptedMessage += a;
            } else if (Character.isUpperCase(a)) {
                encryptedMessage += (char) ((aIndex + encryptKey - 65) % 26 + 65);
            } else encryptedMessage += (char) ((aIndex + encryptKey - 97) % 26 + 97);
        }
        return encryptedMessage;
    }
}
