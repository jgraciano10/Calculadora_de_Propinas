import javax.swing.*;

public class obtenerInterfaz extends JFrame {
    private JPanel PrincipalPane;
    private JTextField ProductoValor;
    private JTextField PropinaPorcentaje;
    private JButton propinaButton;
    private JButton limpiarButton;
    private JTextArea textMessage;

    public JPanel getPrincipalPane() {
        return PrincipalPane;
    }

    public void setListener(Procesador Listener){
        propinaButton.addActionListener(Listener);
        limpiarButton.addActionListener(Listener);
    }

    public void calcularP(){
        double precioTotal = Double.parseDouble(ProductoValor.getText());
        double porcentajePropina = Double.parseDouble(PropinaPorcentaje.getText());
        double propinaTotal = new calcularPropina(precioTotal, porcentajePropina).getPropina();
        textMessage
                .setText("El valor de la propina a dar dado un valor de la cuenta de "+ProductoValor.getText() +" y un porcentaje de propina de "+PropinaPorcentaje.getText()+ "% es de: " + propinaTotal );
    }
    public void Limpiar(){
        textMessage.setText("");
        ProductoValor.setText("");
        PropinaPorcentaje.setText("");
    }


}
