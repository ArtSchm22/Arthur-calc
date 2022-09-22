public class Divisao {
    private double resultado;

    public void dividir(double dividendo, double divisor){
        setResultado(dividendo / divisor);
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }
}
