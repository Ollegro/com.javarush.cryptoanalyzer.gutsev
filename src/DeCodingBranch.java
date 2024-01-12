import java.util.Scanner;

public class DeCodingBranch {
    public static void decodingmenu(){
        System.out.println("Запишите сообщение для расшифровки в файл " + "⬇");
        System.out.println(Data.CRYPTO_MESSAGE);
        System.out.println("Введите ключ шифрования " + "⬇");
        Scanner scanner = new Scanner(System.in);
        Data.setKey(scanner.nextInt());
        Coder coder = new Coder();
        coder.decryptor();
        System.out.println("Расшифрованный файл лежит здесь " + "⬇");
        System.out.println(Data.DECRYPTO_MESSAGE);
    }
}
