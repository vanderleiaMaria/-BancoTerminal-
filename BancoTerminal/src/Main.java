import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // janela principal
        JFrame frame = new JFrame("Conta Bancária");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Saldo inicial
        double saldo = 25;

        // Criar componentes para exibir o saldo
        JLabel saldoLabel = new JLabel("Saldo: " + saldo);
        saldoLabel.setBounds(50, 50, 300, 25);
        frame.add(saldoLabel);

        JLabel valorLabel = new JLabel("Valor solicitado:");
        valorLabel.setBounds(50, 100, 120, 25);
        frame.add(valorLabel);

        JTextField valorField = new JTextField();
        valorField.setBounds(170, 100, 150, 25);
        frame.add(valorField);

        JButton sacarButton = new JButton("Realizar Saque");
        sacarButton.setBounds(100, 150, 150, 30);
        frame.add(sacarButton);

        JLabel resultadoLabel = new JLabel("Resultado: ");
        resultadoLabel.setBounds(50, 200, 300, 25);
        frame.add(resultadoLabel);

        // Adicionando ação ao botão
        sacarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double saldo1 = saldo;
                    double valorSolicitado = Double.parseDouble(valorField.getText());

                    if (saldo1 >= valorSolicitado) {
                        saldo1 -= valorSolicitado;
                        resultadoLabel.setText("Saque realizado com sucesso. Saldo atual: " + saldo1);
                    } else {
                        resultadoLabel.setText("Resultado: Saldo insuficiente");
                    }
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Resultado: Por favor, insira valores válidos");
                }
            }
        });

        // janela visível
        frame.setVisible(true);
        }
    }
