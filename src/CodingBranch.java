import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class CodingBranch {


    public static void codingmenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Задайте путь для файла который надо зашифровать " + "⬇");
            while (true) {
                if (scanner.hasNextLine()) {
                    Data.pathToMessageFile = scanner.nextLine();
                    if (!Files.isRegularFile(Path.of(Data.pathToMessageFile))
                            || !Files.exists(Path.of(Data.pathToMessageFile))) {
                        System.out.println(Data.rightPathMessage);
                     } else if (Files.exists(Path.of(Data.pathToMessageFile))) {
                        break;
                    }
                }
                else {
                    System.out.println(Data.rightPathMessage);
                    scanner.nextLine();
                }
            }
            System.out.println(Data.keyCodingMessage);
            while (!scanner.hasNextInt()) {
                System.out.println(Data.keyCodingMessage);
                scanner.next();
            }
            Data.setKey(scanner.nextInt());
            Coder coder = new Coder();
            coder.cryptor();
            System.out.println(Data.fileIsHere);
           System.out.println(Data.CRYPTO_MESSAGE);
        }
    }
}

