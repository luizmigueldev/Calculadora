import java.lang.reflect.Constructor;

public class Number {
    
    private double valor;

    public Number(){

    }    
    public Number(double valor){
        this.valor = valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }

}
