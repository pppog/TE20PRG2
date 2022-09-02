import javax.swing.*;

public class Cryptering {
    public static void main(String[] args) {
        String message = JOptionPane.showInputDialog("encrypt 👍");
        String crypt = "";
        String hex = "";
        String word = "";
        int key = 69;
        for(int i = 0; i<message.length(); i++) {
            int x = message.charAt(i);
            hex = Integer.toHexString(krypt(x,key));
            crypt += hex;
        }
        System.out.println(crypt);
    }
    static int krypt(int m, int k) {
        int c =m^k;
        return c;
    }
}
