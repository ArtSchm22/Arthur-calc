public class RaizQuadrada {
    private double resultado;

    public void raizar(double base){
        setResultado(Math.sqrt(base));
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }
}
