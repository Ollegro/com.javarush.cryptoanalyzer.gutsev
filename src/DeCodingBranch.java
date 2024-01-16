import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class DeCodingBranch {
    public static void decodingmenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Задайте путь для файла который надо расшифровать " + "⬇");
            while (true) {
                if (scanner.hasNextLine()) {
                    Data.pathToCriptoFile = scanner.nextLine();
                    if (!Files.isRegularFile(Path.of(Data.pathToCriptoFile))
                            || !Files.exists(Path.of(Data.pathToCriptoFile))) {
                        System.out.println(Data.rightPathMessage);
                    } else if (Files.exists(Path.of(Data.pathToCriptoFile))) {
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
            coder.decryptor();
            System.out.println(Data.fileIsHere);
            System.out.println(Data.DECRYPTO_MESSAGE);
        }
    }
}
