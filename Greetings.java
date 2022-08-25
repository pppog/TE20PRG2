import javax.swing.*;

public class Greetings {
    public static void main(String[] args) {
        String NText = "";
        String Text = JOptionPane.showInputDialog("Write something");
        for(int i=0;i<Text.length(); i++) {
            if (Text.charAt(i) == 'e') {
                NText += "ee";
            } else {
                NText += Text.charAt(i);
            }
        }
        System.out.println(NText);
    }
}
