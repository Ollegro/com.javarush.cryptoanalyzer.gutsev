import java.util.Scanner;

public class CodingBranch {
    public static void codingmenu(){
        System.out.println("Запишите сообщение для шифровки в файл " + "⬇");
        System.out.println(Data.MESSAGE);
        System.out.println("Введите ключ шифрования " + "⬇");

        Scanner scanner = new Scanner(System.in);
        Data.setKey(scanner.nextInt());

        Coder coder = new Coder();
        coder.cryptor();
        System.out.println("Зашифрованный файл лежит здесь " + "⬇");
        System.out.println(Data.CRYPTO_MESSAGE);

    }
}
