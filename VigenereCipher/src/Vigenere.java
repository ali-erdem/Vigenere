
public class Vigenere {
    
    private String keyExpanding(String message, String key){
        String result = "";
        int i=0;
        while(i<message.length()){
            result += String.valueOf(key.charAt(i % key.length()));
            i++;
        }
        return result;
    }   
    public String vigenereCipher(String plainText,String key,boolean isEncode){
        String result = "";
        String keyE = keyExpanding(plainText, key);
        for(int i=0;i<plainText.length();i++){
             int x = (plainText.charAt(i) + (isEncode ? keyE.charAt(i): -keyE.charAt(i)+26))%26;
             result += String.valueOf((char)(x+65));
        }
        return result;
    }
}
