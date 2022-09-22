public class Multiplicacao {
    private double resultado;

    public void multiplicar(double fator, double multiplicador){
        setResultado(fator * multiplicador);
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }
}
