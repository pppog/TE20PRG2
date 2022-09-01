import javax.swing.*;

public class Cryptering {
    public static void main(String[] args) {
        String message = JOptionPane.showInputDialog("encrypt 👍");
        String crypt = "";
        for(int i = 0; i<message.length(); i++) {
            char x = message.charAt(i);
            char key = '(';
            if(message.charAt(i) == ' ') {
                crypt += ' ';
            } else {
                crypt += (char) (x ^ key);
            }
        }
        System.out.println(crypt);
    }
}
