import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonPersonalizado extends JButton {
    private Color color1 = new Color(100, 149, 237);
    private Color color2 = new Color(65, 105, 225);

    public BotonPersonalizado(String texto) {
        super(texto);
        setFont(new Font("Arial", Font.BOLD, 14));
        setBackground(color1);
        setForeground(Color.WHITE);
        setFocusPainted(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(color2);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(color1);
            }
        });
    }
}
