import javax.naming.spi.DirStateFactory.Result;
import javax.print.attribute.standard.NumberOfInterveningJobs;

public class Equacoes {

    public static Number result = new Number();

    public static void Soma(Number n1, Number n2){
        result.setValor( n1.getValor() + n2.getValor()) ;
    }
    public static void Subtracao(Number n1, Number n2){
        result.setValor( n1.getValor() - n2.getValor()) ;
    }
    public static void Multiplicacao(Number n1, Number n2){
        result.setValor( n1.getValor() * n2.getValor()) ;
    }
    public static void Divisao(Number n1, Number n2){
        result.setValor( n1.getValor() / n2.getValor()) ;
    }


}
