import javax.swing.*;

public class humancannonball {
    public static void main(String[] args) {
        int v = 0;
        int a = 0;
        int x = 0;
        int l = 0;
        int u = 0;
        int space = 0;
        String input = JOptionPane.showInputDialog("Parameters?");
        for (int i=0; i<input.length(); i++) {
            if (input.charAt(i)==' ') {
                space += 1;
            }
            else {
                if(space==0) {
                    v += input.charAt(i);
                }
                if(space==1) {
                    a += input.charAt(i);
                }
                if(space==2) {
                    x += input.charAt(i);
                }
                if(space==3) {
                    l += input.charAt(i);
                }
                if(space==4) {
                    u += input.charAt(i);
                    space = 0;
                }
            }
        }
        System.out.println("v=" + v + " a=" + a + " x=" + x + " l=" + l + " u=" + u);
    }
}
