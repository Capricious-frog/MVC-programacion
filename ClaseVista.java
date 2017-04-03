package mvc_proyecto;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import java.awt.Button;

public class ClaseVista extends JFrame implements ActionListener {
  private static final long serialVersionUID = 1L;
  
  Button botonBuscador = new Button("Buscador");
  
  public ClaseVista() {
      setLayout(new FlowLayout());
      setSize(400, 130);
      setLocationRelativeTo(null);
      setTitle("Menú");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
