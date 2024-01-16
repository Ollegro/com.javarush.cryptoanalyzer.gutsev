import java.io.*;

public class Coder {

    char[] charsAlphabet = Data.getAlphabet();
    private int key = Data.getKey();

    {
        if (key < 0) key = key * -1;
    }

    public void cryptor() {
        try (BufferedReader br = new BufferedReader(new FileReader(Data.pathToMessageFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(Data.CRYPTO_MESSAGE))) {
            while (br.ready()) {
                char[] messageCharArray = br.readLine().toCharArray();
                char[] cryptoMessageCharArray = new char[messageCharArray.length];
                for (int i = 0; i < messageCharArray.length; i++) {
                    for (int j = 0; j < charsAlphabet.length; j++) {
                        if (charsAlphabet[j] == messageCharArray[i]) {
                            cryptoMessageCharArray[i] = (charsAlphabet[(j + key) % charsAlphabet.length]);
                        }
                    }
                }
                bw.write(cryptoMessageCharArray);
                bw.write("\n");
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void decryptor() {
        try (BufferedReader br = new BufferedReader(new FileReader(Data.CRYPTO_MESSAGE));
             BufferedWriter bw = new BufferedWriter(new FileWriter(Data.DECRYPTO_MESSAGE))) {
            while (br.ready()) {
                char[] cryptoMessageCharArray = br.readLine().toCharArray();
                char[] decryptoMessageCharArray = new char[cryptoMessageCharArray.length];
                for (int i = 0; i < cryptoMessageCharArray.length; i++) {
                    for (int j = 0; j < charsAlphabet.length; j++) {
                        if (charsAlphabet[j] == cryptoMessageCharArray[i]) {
                            int temp = j - key % charsAlphabet.length;
                            if (temp < 0) {
                                temp = charsAlphabet.length + temp;
                            }
                            decryptoMessageCharArray[i] = charsAlphabet[temp % charsAlphabet.length];
                        }
                    }
                }
                bw.write(decryptoMessageCharArray);
                bw.write("\n");
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void broutforce() throws IOException {
        for (int z = 0; z < Data.getAlphabet().length; z++) {
            BufferedReader br = new BufferedReader(new FileReader(Data.pathToCriptoFile));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(Data.BROUT_FORCE_DECRYPTO_MESSAGE + " №" + z));
                while (br.ready()) {
                    char[] cryptoMessageCharArray = br.readLine().toCharArray();
                    char[] decryptoMessageCharArray = new char[cryptoMessageCharArray.length];
                    for (int i = 0; i < cryptoMessageCharArray.length; i++) {
                        for (int j = 0; j < charsAlphabet.length; j++) {
                            if (charsAlphabet[j] == cryptoMessageCharArray[i]) {
                                int temp = j - z % charsAlphabet.length;
                                if (temp < 0) {
                                    temp = charsAlphabet.length + temp;
                                }
                                decryptoMessageCharArray[i] = charsAlphabet[temp % charsAlphabet.length];
                            }
                        }
                    }
                    bw.write(decryptoMessageCharArray);
                    bw.write("\n");
                    bw.flush();
                }
            }
        }
    }





