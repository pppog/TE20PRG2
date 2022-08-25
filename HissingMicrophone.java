import javax.swing.*;

public class HissingMicrophone {
    public static void main(String[] args) {
            int s = 0;
            String hiss = "No Hiss";
            String Text = JOptionPane.showInputDialog("Write something");
            for(int i=1;i<Text.length(); i++) {
                if(Text.charAt(i) == 's') {
                    s += 1;
                }
                else {
                    s = 0;
                }
                if(s>1) {
                    hiss = "Hiss";
                    i = Text.length();
                }
            }

            System.out.println(hiss);
    }
}
