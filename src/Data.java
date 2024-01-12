public class Data {
    private char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
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
    static final String MESSAGE = "C:\\Users\\use\\YandexDisk\\IdeaProjects\\com.javarush.cryptoanalyzer.gutsev\\src\\data.txt";
    static final String CRYPTO_MESSAGE = "C:\\Users\\use\\YandexDisk\\IdeaProjects\\com.javarush.cryptoanalyzer.gutsev\\src\\cryptoData.txt";
    static final String DECRYPTO_MESSAGE = "C:\\Users\\use\\YandexDisk\\IdeaProjects\\com.javarush.cryptoanalyzer.gutsev\\src\\decryptoData.txt";
    public char[] getAlphabet() {
        return alphabet;
    }
    public void setAlphabet(char[] alphabet) {
        this.alphabet = alphabet;
    }
}

