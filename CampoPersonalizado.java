import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class CampoPersonalizado extends JTextField {

    public CampoPersonalizado(String textoInicial) {
        super(textoInicial);
        setFont(new Font("Arial", Font.PLAIN, 16));
        setHorizontalAlignment(JTextField.CENTER);


        getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) { actualizarColor(); }
            @Override
            public void removeUpdate(DocumentEvent e) { actualizarColor(); }
            @Override
            public void changedUpdate(DocumentEvent e) { actualizarColor(); }
        });
    }

    private void actualizarColor() {
        String texto = getText();

        if (texto.isEmpty()) {
            setForeground(Color.GRAY);
        }
        else if (texto.matches("\\d+")) {
            setForeground(new Color(30, 144, 255));
        }
        else if (texto.matches("[a-zA-Z ]+")) {
            setForeground(new Color(0, 153, 0));
        }
        else {
            setForeground(Color.RED);
        }
    }
}

