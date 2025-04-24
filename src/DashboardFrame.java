import javax.swing.*;
import java.awt.*;

public class DashboardFrame extends JFrame {

    public DashboardFrame(Fan fan) {
        setTitle("Dashboard do Fã");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JLabel nameLabel = new JLabel("👤 Nome: " + fan.getName());
        JLabel teamLabel = new JLabel("🎮 Jogo preferido: " + fan.getFavoriteTeam());
        JLabel scoreLabel = new JLabel("⭐ Pontuação no quiz: " + fan.getQuizScore());

        JLabel suggestionLabel = new JLabel("💡 Sugestão: " + getSuggestion(fan));

        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        teamLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        suggestionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createVerticalStrut(20));
        add(nameLabel);
        add(teamLabel);
        add(scoreLabel);
        add(Box.createVerticalStrut(10));
        add(suggestionLabel);
    }

    private String getSuggestion(Fan fan) {
        if (fan.getQuizScore() >= 10) {
            return "Você é um fã raiz! Siga a FURIA no Twitter!";
        } else {
            return "Que tal assistir algumas partidas no YouTube da FURIA?";
        }
    }
}


