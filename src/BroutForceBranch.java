import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class BroutForceBranch {
    public static void broutforcemenu() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Задайте путь для файла который надо взломать " + "⬇");
            while (true) {
                if (scanner.hasNextLine()) {
                    Data.pathToCriptoFile = scanner.nextLine();
                    if (!Files.isRegularFile(Path.of(Data.pathToCriptoFile))
                            || !Files.exists(Path.of(Data.pathToCriptoFile))) {
                        System.out.println(Data.rightPathMessage);
                    } else if (Files.exists(Path.of(Data.pathToCriptoFile))) {
                        break;
                    }
                } else {
                    System.out.println(Data.rightPathMessage);
                    scanner.nextLine();
                }
            }
            Coder coder = new Coder();
            coder.broutforce();
            System.out.println(Data.fileIsHere);
            System.out.println(Data.BROUT_FORCE_PACKAGE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
