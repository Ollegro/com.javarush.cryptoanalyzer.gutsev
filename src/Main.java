import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Выберите операцию:\n1 - Шифрование\n2 - Дешифование\n3 - Взлом\nлюбой символ - для выхода\n");
            Coder coder = new Coder();
            String choice;
            boolean isChoice = true;
            while (isChoice) {
                choice = scanner.nextLine();
                if ("1".equals(choice)) {
                    System.out.println("Выбрали шифрование.");
                    CodingBranchNew.checkpathtoreadfile(Data.getPathToMessageFile(), Data.rightPathMessage);
                    CodingBranchNew.insertKeyAndOperation();
                    coder.cryptor();
                    System.out.println(Data.fileIsHere);
                    System.out.println(Data.CRYPTO_MESSAGE);
                    break;
                } else if ("2".equals(choice)) {
                    System.out.println("Выбрали дешифрование.");
                    CodingBranchNew.checkpathtoreadfile(Data.getPathToMessageFile(), Data.rightPathMessage);
                    CodingBranchNew.insertKeyAndOperation();
                    coder.decryptor();
                    System.out.println(Data.fileIsHere);
                    System.out.println(Data.DECRYPTO_MESSAGE);
                    break;
                } else if ("3".equals(choice)) {
                    System.out.println("Выбрали взлом.");
                    CodingBranchNew.checkpathtoreadfile(Data.getPathToMessageFile(), Data.rightPathMessage);
                    coder.broutforce();
                    System.out.println(Data.fileIsHere);
                    System.out.println(Data.BROUT_FORCE_PACKAGE);
                    break;
                } else {
                    isChoice = false;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


