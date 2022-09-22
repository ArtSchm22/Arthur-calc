public class Porcentagem {

    private double resultado;

    public void fazerPorcentagem(double total, double quantia){
        setResultado((quantia * 100) / total);
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
