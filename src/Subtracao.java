public class Subtracao {
    private double resultado = 0;

    public void subtrair(double numeroASubtrair){
        if(resultado == 0){
            setResultado(numeroASubtrair);
            return;
        }

        setResultado(getResultado() - numeroASubtrair);
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
