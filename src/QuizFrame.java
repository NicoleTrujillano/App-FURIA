import javax.swing.*;
import java.awt.*;

public class QuizFrame extends JFrame {
    private Fan fan;
    private int score = 0;

    public QuizFrame(Fan fan) {
        this.fan = fan;

        setTitle("Quiz FURIA");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        JLabel title = new JLabel("🔥 Quiz sobre a FURIA");
        title.setFont(new Font("SansSerif", Font.BOLD, 18));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(title);

        panel.add(Box.createVerticalStrut(15));

        // Pergunta 1
        JLabel q1 = new JLabel("1. Qual é o principal jogo da FURIA?");
        JRadioButton q1a = new JRadioButton("League of Legends");
        JRadioButton q1b = new JRadioButton("CS:GO");
        JRadioButton q1c = new JRadioButton("Fortnite");

        ButtonGroup g1 = new ButtonGroup();
        g1.add(q1a); g1.add(q1b); g1.add(q1c);

        // Pergunta 2
        JLabel q2 = new JLabel("2. Em que país está sediada a FURIA?");
        JRadioButton q2a = new JRadioButton("Brasil");
        JRadioButton q2b = new JRadioButton("Estados Unidos");
        JRadioButton q2c = new JRadioButton("Portugal");

        ButtonGroup g2 = new ButtonGroup();
        g2.add(q2a); g2.add(q2b); g2.add(q2c);

        // Pergunta 3
        JLabel q3 = new JLabel("3. Qual animal representa a FURIA?");
        JRadioButton q3a = new JRadioButton("Tigre");
        JRadioButton q3b = new JRadioButton("Pantera");
        JRadioButton q3c = new JRadioButton("Águia");

        ButtonGroup g3 = new ButtonGroup();
        g3.add(q3a); g3.add(q3b); g3.add(q3c);

        // Botão de envio
        JButton submit = new JButton("Enviar respostas ✅");
        submit.setAlignmentX(Component.CENTER_ALIGNMENT);

        submit.addActionListener(e -> {
            score = 0;
            if (q1b.isSelected()) score += 10;
            if (q2a.isSelected()) score += 10;
            if (q3b.isSelected()) score += 10;

            fan.setQuizScore(score);
            JOptionPane.showMessageDialog(this, "Sua pontuação: " + score + " de 30");
            new DashboardFrame(fan).setVisible(true);
            dispose();
        });

        // Adiciona ao painel
        panel.add(q1); panel.add(q1a); panel.add(q1b); panel.add(q1c);
        panel.add(Box.createVerticalStrut(10));
        panel.add(q2); panel.add(q2a); panel.add(q2b); panel.add(q2c);
        panel.add(Box.createVerticalStrut(10));
        panel.add(q3); panel.add(q3a); panel.add(q3b); panel.add(q3c);
        panel.add(Box.createVerticalStrut(15));
        panel.add(submit);

        add(panel);
    }
}
