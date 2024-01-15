public class BroutForceBranch {
    public static void broutforcemenu(){
        System.out.println("Запишите сообщение для взлома в файл " + "⬇");
        System.out.println(Data.CRYPTO_MESSAGE);
        Coder coder = new Coder();
        coder.broutforce();
        System.out.println("Взломанный файл лежит здесь " + "⬇");
        System.out.println(Data.BROUT_FORCE_DECRYPTO_MESSAGE);
    }
}
