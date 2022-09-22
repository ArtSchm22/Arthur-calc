public class Soma {
    private double resultado = 0;

    public void somar(double valorASomar){
        setResultado(getResultado() + valorASomar);
    }


    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
