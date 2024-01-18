public class Data {
    private static final char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
            'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М',
            'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я',
            '.', ',', '«', '»', '"', '\'', ':', ';', '!', '?', '-', '_', ' ', '%', '(', ')', '}', '{'};
    private static int key;

    public static int getKey() {
        return key;
    }

    public static void setKey(int key) {
        if (key < 0) key = key * -1;
        Data.key = key;
    }

    static String pathToMessageFile;

    public static String getPathToMessageFile() {
        return pathToMessageFile;
    }

    public static void setPathToMessageFile(String pathToMessageFile) {
        Data.pathToMessageFile = pathToMessageFile;
    }

    static String keyCodingMessage = "Введите ключ шифрования - целое число   \"⬇\"";
    static String infoMessagePathToReadFile = "Задайте путь для файла который надо преобразовать " + "⬇";
    static String rightPathMessage = "Введите правильный путь   \"⬇\"";
    static String fileIsHere = "Файл с результатом здесь  \"⬇\" ";
    static final String CRYPTO_MESSAGE = "C:\\Users\\use\\YandexDisk\\IdeaProjects\\com.javarush.cryptoanalyzer.gutsev\\src\\documents\\crdata.txt";
    static final String DECRYPTO_MESSAGE = "C:\\Users\\use\\YandexDisk\\IdeaProjects\\com.javarush.cryptoanalyzer.gutsev\\src\\documents\\dcrdata.txt";
    static final String BROUT_FORCE_DECRYPTO_MESSAGE = "C:\\Users\\use\\YandexDisk\\IdeaProjects\\com.javarush.cryptoanalyzer.gutsev\\src\\documents\\broutforcefiles\\brout_force_dcrdata.txt";
    static final String BROUT_FORCE_PACKAGE = "C:\\Users\\use\\YandexDisk\\IdeaProjects\\com.javarush.cryptoanalyzer.gutsev\\src\\documents\\broutforcefiles";

    public static char[] getAlphabet() {
        return alphabet;
    }
}


