import javax.swing.*;

public class Greetings {
    public static void main(String[] args) {
        String NText = "h";
        String Text = JOptionPane.showInputDialog("Write something");
        for(int i=1;i<Text.length(); i++) {
            if(Text.charAt(i) == 'e') {
                NText += "ee";
            }
        }
        NText += "y";
        System.out.println(NText);
    }
}
