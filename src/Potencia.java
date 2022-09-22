public class Potencia {
    private double resutaldo;

    public void potenciar(double base, double potencia){
        setResutaldo(Math.pow(base, potencia));
    }

    public void setResutaldo(double resutaldo) {
        this.resutaldo = resutaldo;
    }

    public double getResutaldo() {
        return resutaldo;
    }
}
