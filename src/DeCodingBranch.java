import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class DeCodingBranch {
    public static void decodingmenu(){
//        System.out.println("Запишите сообщение для расшифровки в файл " + "⬇");
//        System.out.println(Data.CRYPTO_MESSAGE);
//        System.out.println("Введите ключ шифрования " + "⬇");
//        Scanner scanner = new Scanner(System.in);
//        Data.setKey(scanner.nextInt());
//        Coder coder = new Coder();
//        coder.decryptor();
//        System.out.println("Расшифрованный файл лежит здесь " + "⬇");
//        System.out.println(Data.DECRYPTO_MESSAGE);
//    }
    ///////////////////////
        try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Задайте путь для файла который надо расшифровать " + "⬇");
    Data.pathToCriptoFile = scanner.nextLine();

            if (!Files.isRegularFile(Path.of(Data.pathToCriptoFile)) || !Files.exists(Path.of(Data.pathToCriptoFile))) {

        System.out.println(Data.rightPathMessage);
        decodingmenu();
    } else if (Files.exists(Path.of(Data.pathToCriptoFile))) {

        System.out.println(Data.keyCodingMessage);
    }

            while (!scanner.hasNextInt()) {
        System.out.println(Data.keyCodingMessage);
        scanner.next();
    }
            Data.setKey(scanner.nextInt());
    Coder coder = new Coder();
            coder.decryptor();
            System.out.println("Расшифрованный файл лежит здесь " + "⬇");
            System.out.println(Data.DECRYPTO_MESSAGE);
}

    }

    ////////////////////////////
}
