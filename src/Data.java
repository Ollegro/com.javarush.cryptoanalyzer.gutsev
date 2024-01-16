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
        Data.key = key;
    }

    static String pathToMessageFile;
    static String pathToCriptoFile;
    static String keyCodingMessage = "Введите ключ шифрования - целое число   \"⬇\"";
    static String rightPathMessage = "Введите правильный путь   \"⬇\"";
    static String fileIsHere = "Файл с результатом здесь  \"⬇\" ";
    static final String CRYPTO_MESSAGE = "C:\\Users\\use\\YandexDisk\\IdeaProjects\\com.javarush.cryptoanalyzer.gutsev\\src\\documents\\cryptoData.txt";
    static final String DECRYPTO_MESSAGE = "C:\\Users\\use\\YandexDisk\\IdeaProjects\\com.javarush.cryptoanalyzer.gutsev\\src\\documents\\decryptoData.txt";
    static final String BROUT_FORCE_DECRYPTO_MESSAGE = "C:\\Users\\use\\YandexDisk\\IdeaProjects\\com.javarush.cryptoanalyzer.gutsev\\src\\documents\\broutforcefiles\\brout_force_decryptoData.txt";
    static final String BROUT_FORCE_PACKAGE = "C:\\Users\\use\\YandexDisk\\IdeaProjects\\com.javarush.cryptoanalyzer.gutsev\\src\\documents\\broutforcefiles";

    public static char[] getAlphabet() {
        return alphabet;
    }

}

