import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Выберите операцию:\nШифрование - 1\nДешифование - 2\nВзлом - 3\nЛюбой символ - для выхода\n");
            String choice = "";
            boolean nextRound = true;
            while (nextRound) {
                choice = scanner.nextLine();
                if ("1".equals(choice)) {
                    System.out.println("Выбрали шифрование.");
                    CodingBranch.codingmenu();
                    break;
                } else if ("2".equals(choice)) {
                    System.out.println("Выбрали дешифрование.");
                    DeCodingBranch.decodingmenu();
                    break;
                } else if ("3".equals(choice)) {
                    System.out.println("Выбрали взлом.");
                    BroutForceBranch.broutforcemenu();
                    break;
                } else {
                    nextRound = false;
                }
            }

        }
    }
}

