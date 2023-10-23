package hosptial;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class JTextFieldConBordesCurvos extends JTextField {

    private int borderRadius = 10; // Puedes ajustar el radio de los bordes curvos según tus preferencias

    public JTextFieldConBordesCurvos() {
        setOpaque(false);
        setBorder(new EmptyBorder(0, borderRadius, 0, borderRadius));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        RoundRectangle2D shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), borderRadius, borderRadius);
        g2.setColor(getBackground());
        g2.fill(shape);

        super.paintComponent(g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Ejemplo de JTextField con Bordes Curvos");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());

            JTextFieldConBordesCurvos textField = new JTextFieldConBordesCurvos();
            textField.setPreferredSize(new Dimension(200, 30));

            frame.add(textField);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
