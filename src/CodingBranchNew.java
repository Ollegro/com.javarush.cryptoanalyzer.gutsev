import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class CodingBranchNew {
        public static void checkpathtoreadfile(String pathToTxtReadFile, String rightPathMessage) throws IOException {
        System.out.println(Data.infoMessagePathToReadFile);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextLine()) {
                pathToTxtReadFile = scanner.nextLine();
                if (!Files.isRegularFile(Path.of(pathToTxtReadFile))
                        || !Files.exists(Path.of(pathToTxtReadFile))) {
                    System.out.println(rightPathMessage);
                } else if (Files.exists(Path.of(pathToTxtReadFile))) {
                    Data.setPathToMessageFile(pathToTxtReadFile);
                    break;
                }
            } else {
                System.out.println(rightPathMessage);
                scanner.nextLine();
            }
        }
    }

    public static void insertKeyAndOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Data.keyCodingMessage);
        while (!scanner.hasNextInt()) {
            System.out.println(Data.keyCodingMessage);
            scanner.next();
        }
        int k = scanner.nextInt();
        Data.setKey(k);
    }
}




