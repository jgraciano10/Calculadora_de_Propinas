import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Procesador implements ActionListener {
    private obtenerInterfaz ventana;

    public Procesador() {
        ventana = new obtenerInterfaz();
        ventana.setListener(this);
        ventana.setVisible(true);
        ventana.setContentPane(ventana.getPrincipalPane());
        ventana.setSize(800,600);
        ventana.setLocationRelativeTo(ventana);





    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()){
            case "Propina":
                ventana.calcularP();
                break;
            case "Limpiar":
                ventana.Limpiar();
                break;
        }


    }
}
