import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppComponentes extends JFrame {

    private BotonPersonalizado btnAbrirJuego;
    private BotonCoordenadas btnCoordenadas;
    private CampoPersonalizado campoTexto;
    private JLabel titulo;
    private JPanel panelBotones;

    public AppComponentes() {
        setTitle("Aplicación Componentes");
        setSize(600, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10,10));

        titulo = new JLabel("Práctica de componentes", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        add(titulo, BorderLayout.NORTH);

        campoTexto = new CampoPersonalizado("");
        add(campoTexto, BorderLayout.CENTER);

        panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));

        btnAbrirJuego = new BotonPersonalizado("Abrir pantalla de juego");
        btnAbrirJuego.addActionListener(e -> {
            new PantallaJuego().setVisible(true);
            dispose();
        });

        btnCoordenadas = new BotonCoordenadas("Coordenadas");

        panelBotones.add(btnAbrirJuego);
        panelBotones.add(btnCoordenadas);
        add(panelBotones, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { new AppComponentes().setVisible(true);
        });
    }
}
