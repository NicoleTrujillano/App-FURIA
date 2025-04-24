import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FanRegistrationFrame extends JFrame {
    private JTextField nameField;
    private JComboBox<String> teamComboBox;

    public FanRegistrationFrame() {
        setTitle("Cadastro do Fã FURIA");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel principal com BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        JLabel title = new JLabel("🎯 Cadastro do Fã da FURIA");
        title.setFont(new Font("SansSerif", Font.BOLD, 18));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(title);

        mainPanel.add(Box.createVerticalStrut(20));

        // Campo de nome
        JLabel nameLabel = new JLabel("Nome:");
        nameField = new JTextField(20);
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        nameField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

        mainPanel.add(nameLabel);
        mainPanel.add(nameField);
        mainPanel.add(Box.createVerticalStrut(10));

        // ComboBox de time
        JLabel teamLabel = new JLabel("Time preferido:");
        String[] teams = {"CS:GO", "Valorant", "LoL", "Outros"};
        teamComboBox = new JComboBox<>(teams);
        teamComboBox.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

        teamLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(teamLabel);
        mainPanel.add(teamComboBox);
        mainPanel.add(Box.createVerticalStrut(20));

        // Botão "Próximo"
        JButton nextButton = new JButton("Próximo ➡");
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        nextButton.addActionListener(e -> {
            String name = nameField.getText();
            String team = (String) teamComboBox.getSelectedItem();
            Fan fan = new Fan(name, team);
            new QuizFrame(fan).setVisible(true);
            dispose();
        });

        mainPanel.add(nextButton);

        add(mainPanel);
        setLocationRelativeTo(null); // Centraliza a janela
    }
}
