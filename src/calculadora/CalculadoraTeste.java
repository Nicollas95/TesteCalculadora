package calculadora;

public class CalculadoraTeste {

    public static void main(String[] args) {
        
        SomarTeste teste = new SomarTeste();
        DividirTeste teste2 = new DividirTeste();
        MultiplicarTeste teste3 = new MultiplicarTeste();
        SubtracaoTeste teste4 = new SubtracaoTeste();
        
        
        teste.testarSoma();
        teste2.testarDividir();
        teste3.testarMultiplicacao();
        teste4.testarSubtrair();
 
    }
}
