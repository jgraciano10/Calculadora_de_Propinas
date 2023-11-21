public class calcularPropina {

    private double valorCuenta;
    private double porcentajePropina;



    public calcularPropina(double valorCuenta, double porcentajePropina) {
        this.valorCuenta = valorCuenta;
        this.porcentajePropina = porcentajePropina;
    }

    public double getPropina (){
        double porcentajePropinaDecimal = porcentajePropina/100;
        double propinaFinal = valorCuenta *porcentajePropinaDecimal;
        return propinaFinal;
    }
}
