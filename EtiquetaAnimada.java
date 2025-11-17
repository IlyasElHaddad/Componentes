import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class EtiquetaAnimada extends JLabel {
    private Random random = new Random();

    public EtiquetaAnimada(String texto) {
        super(texto, SwingConstants.CENTER);
        setOpaque(true);
        setBackground(Color.CYAN);
        setFont(new Font("Arial", Font.BOLD, 14));
    }

    public void cambiarColor() {
        setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
    }
}
