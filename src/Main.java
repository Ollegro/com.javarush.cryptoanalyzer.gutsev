import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Выберите операцию:\n1 - Шифрование\n2 - Дешифование\n3 - Взлом\nлюбой символ - для выхода\n");
            String choice ;
            boolean isChoice = true;
            while (isChoice) {   // генерим меню
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
                    isChoice = false;
                }
            }
        }
    }
}


