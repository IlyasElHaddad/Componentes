import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonCoordenadas extends JButton {
    private Color color1 = new Color(100, 149, 237);
    private Color color2 = new Color(200, 130, 180);
    private Color colorClick = new Color(80, 44, 255);

    public BotonCoordenadas(String texto) {
        super(texto);
        setFont(new Font("Arial", Font.BOLD, 14));
        setBackground(color1);
        setForeground(Color.WHITE);
        setFocusPainted(false);

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                setText("x: " + e.getX() + "  y: " + e.getY());
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(color2);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(color1);
                setText("Coordenadas");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(color2);
            }
        });
    }
}
