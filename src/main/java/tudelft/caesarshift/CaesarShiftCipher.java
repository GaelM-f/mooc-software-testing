package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String caesarShiftCipher(String message, int shift){
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();

        shift = shift%26;

        for(int i = 0; i < length; i++){
            currentChar = message.charAt(i);
           
           // sb.append(currentChar);
            if ((currentChar > 'z' || currentChar < 'a') && currentChar != ' ') {
                return "invalid";
            } else if ((char) (currentChar + shift) > 'z' && currentChar != ' ') {
                currentChar = (char) (currentChar - 26);
            } else if ((char) (currentChar + shift) < 'a' && currentChar != ' '){
                currentChar = (char) (currentChar + 26);
            }
            if (currentChar == ' ') {
            	sb.append(' ');
            } else {
            	sb.append((char) (currentChar + shift));
            }
        }

        return sb.toString();
    }
}
