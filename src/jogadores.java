import javax.swing.*;
import java.util.ArrayList;

public class jogadores {

    static ArrayList<jogadores> Jogadores = new ArrayList<>();

    int idade;
    String time;
    double altura;
    double peso;

    public jogadores(int idade, String time, double altura, double peso) {
        this.idade = idade;
        this.time = time;
        this.altura = altura;
        this.peso = peso;
    }

    public static void addJogador(){

        for (int i = 0; i < 22; i++) {

                int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do jogador"));
                String time = JOptionPane.showInputDialog("Informe a time do jogador");
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura em metros do jogador"));
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe a peso em quilos do jogador"));

                jogadores jogador = new jogadores(idade,time,altura,peso);
                Jogadores.add(jogador);

        }

    }

    public static void idade18Menos(){

        int menos18 = 0;

        for (jogadores i:
             Jogadores) {

            if (i.idade < 18){

                menos18++;

            }

        }

        JOptionPane.showMessageDialog(null,"Quantidade de jogadores com menos de 18 anos" +menos18);

    }
    public static void mediaTodasIdades(){

        double idadeTodosJogadores = 0;

        for (jogadores i:
                Jogadores) {

             idadeTodosJogadores += i.idade;

        }

        JOptionPane.showMessageDialog(null,"A média da idade: "+(idadeTodosJogadores/22));

    }
    public static void mediaAlturaTodos(){

        double alturaTodosJogadores = 0;

        for (jogadores i :
                Jogadores) {

            alturaTodosJogadores += i.altura;

        }

        JOptionPane.showMessageDialog(null, "A média da altura: " + (alturaTodosJogadores/ 22));
    }
    public static void porcentagem80mais(){

        int mais80 = 0;

        for (jogadores i:
                Jogadores) {

            if (i.peso > 80){

                mais80++;

            }

        }
        double media = (mais80*100)/22;

        JOptionPane.showMessageDialog(null,"Porcentagem jogadores com mais de 80kg");

    }




}
