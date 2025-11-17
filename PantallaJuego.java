import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PantallaJuego extends JFrame {

    private EtiquetaAnimada jugador;
    private JLabel obstaculo;
    private Timer timerMovimiento;
    private Timer timerColor;
    private JButton btnVolver;

    public PantallaJuego() {
        setTitle("Pantalla de juego️");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        jugador = new EtiquetaAnimada("Jugador");
        jugador.setBounds(50, 150, 80, 40);
        add(jugador);

        obstaculo = new JLabel("Obstáculo", SwingConstants.CENTER);
        obstaculo.setOpaque(true);
        obstaculo.setBackground(Color.RED);
        obstaculo.setBounds(350, 150, 100, 40);
        add(obstaculo);

        btnVolver = new JButton("Volver al inicio");
        btnVolver.setBounds(170, 300, 150, 40);
        btnVolver.addActionListener(e -> {
            new AppComponentes().setVisible(true);
            dispose();
        });
        add(btnVolver);

        timerMovimiento = new Timer(50, e -> moverJugador());
        timerMovimiento.start();

        timerColor = new Timer(1000, e -> jugador.cambiarColor());
        timerColor.start();
    }

    private void moverJugador() {
        jugador.setLocation(jugador.getX() + 2, jugador.getY());

        if (jugador.getX() > getWidth()) {
            jugador.setLocation(-80, jugador.getY());
        }

        if (jugador.getBounds().intersects(obstaculo.getBounds())) {
            jugador.setBackground(Color.MAGENTA);
            obstaculo.setBackground(Color.ORANGE);
        } else {
            obstaculo.setBackground(Color.RED);
        }
    }
}
