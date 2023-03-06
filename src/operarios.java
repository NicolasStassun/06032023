import javax.swing.*;
import java.util.ArrayList;

public class operarios {

    static ArrayList<operarios> Operarios = new ArrayList<>();

    int numOperario;
    int numPecas;
    String sexo;
    int classeTrabalhador;
    double salario;

    public operarios(int numOperario, int numPecas, String sexo, int classeTrabalhador) {
        this.numOperario = numOperario;
        this.numPecas = numPecas;
        this.sexo = sexo;
        this.classeTrabalhador = classeTrabalhador;
    }

    public static void addOperario() {

        for (int i = 0; i < 15; i++) {

            int numOperario = 0;
            numOperario += 1;
            int numPecas = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do jogador"));
            String sexo = JOptionPane.showInputDialog("Informe a altura em metros do jogador");
            int classeTrabalhador = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do jogador"));

            operarios operario = new operarios(numOperario, numPecas, sexo, classeTrabalhador);
            Operarios.add(operario);
        }


    }

    public static void totalFolha() {

        double totalFolha=0;

        for (operarios i :
                Operarios) {

            if (i.classeTrabalhador == 1) {

                i.salario = 1365.0;
                totalFolha =+ i.salario;

            } else if (i.classeTrabalhador == 2) {

                 double pecasExtras= i.numPecas - 30;

                 pecasExtras *= 39.09;

                 i.salario = 1303+pecasExtras;
                 totalFolha =+ i.salario;

            } else {

                double pecasExtras= i.numPecas - 30;

                pecasExtras *= 65.15;

                i.salario = 1303+pecasExtras;
                totalFolha =+ i.salario;
            }

        }

        JOptionPane.showMessageDialog(null,"R$"+totalFolha);

    }
    public static void totalPecas() {

        double totalpecas=0;

        for (operarios i :
                Operarios) {

              totalpecas += i.numPecas;


        }

        JOptionPane.showMessageDialog(null,"Total de peças: "+totalpecas);

    }

    public static void mediaPorSexo(){

        int totalPecaFeminino = 0;
        int totalPecaMenino = 0;

        for (operarios i :
                Operarios) {

            if(i.sexo.equals("Feminino")){

                totalPecaFeminino += i.numPecas;

            }
            else if(i.sexo.equals("Masculino")){

                totalPecaMenino += i.numPecas;

            }


        }

        JOptionPane.showMessageDialog(null,"Peças feminino: "+totalPecaFeminino);
        JOptionPane.showMessageDialog(null,"Peças masculino: "+totalPecaMenino);

    }
    public static void maiorSalario(){

        double maiorsalario = 0;

        for (operarios i :
                Operarios) {

            if(maiorsalario<i.salario){

                maiorsalario = i.salario;

            }

        }

    }


}
