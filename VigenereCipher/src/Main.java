
public class Main {
    
    public static void main(String [] args){
        
        String plainText = "HELLOWORLDHOWAREYOU";
        String key = "CRYPTO";
        Vigenere vigenere = new Vigenere();
        System.out.println("Plaint text is: \"" +plainText+"\"");
        System.out.println("Key: \"" +key+"\"");
        String cipherText = vigenere.vigenereCipher(plainText,key,true);
        System.out.println("Cipher text: " +cipherText);
        System.out.println("Plain text: " +vigenere.vigenereCipher(cipherText,key,false));
    }
}
