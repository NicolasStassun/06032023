import javax.swing.*;

public class main {

    public static void main(String[] args) {

        double tabuada = Double.parseDouble(JOptionPane.showInputDialog("Qual número você deseja ver a tabuada"));

        for (int i = 0; i <= 10; i++) {

            JOptionPane.showMessageDialog(null,tabuada +" x "+ i +" = "+ (tabuada*i));

        }

    }

}
