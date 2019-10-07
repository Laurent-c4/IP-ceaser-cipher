import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n*************\n" +
                "CEASER CIPHER\n" +
                "*************\n" +
                "Welcome to the Ceaser Cipher. Here you can encrypt or decrypt a message.\n");

        System.out.println("Choose option\n" +
                "1 => Encrypt\n" +
                "2 => Exit");

        //User selects choice
        String choice = scanner.nextLine().toLowerCase();


        if (choice.equals("encrypt") || choice.equals("1")) {
            //Get User Input
            System.out.println("Enter Message to encrypt");
            String message = scanner.nextLine();
            System.out.println("Enter Encryption key");
            int encryptionKey = scanner.nextInt();

            //Encrypt Message
            Encrypt encrypt = new Encrypt(message, encryptionKey);
            String encryptedMessage = encrypt.encode(encrypt.getInput(), encrypt.getKey());
            System.out.println("MESSAGE: " + message +
                    "\nMESSAGE ENCRYPTED: " + encryptedMessage);


        } else if (choice.equals("exit") || choice.equals("3")) {

        } else {
            System.out.println("invalid output");

        }

    }
}
