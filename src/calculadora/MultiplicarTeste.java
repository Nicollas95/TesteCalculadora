package calculadora;


public class MultiplicarTeste {
    
    public void testarMultiplicacao(){
        
        Multiplicacao calcMult = new Multiplicacao();
        
        System.out.println("\nTeste Multiplicação -->");
        
        //----> Cenário 1: Multiplicação com dois números
        int mult = calcMult.multiplicar(8, 5);
        System.out.println(mult);
        
        //----> Cenário 2: Multiplicação com um numero zero. Multiplicar zero com qualquer número equivale a somar o zero varias vezes
        mult = calcMult.multiplicar(145, 0);
        System.out.println(mult);
        
        //----> Cenário 3: Multiplicação com ambos número zero. resposta sempre será zero
        mult = calcMult.multiplicar(0, 0);
        System.out.println(mult);
        
        //----> Cenário 4: Multplição com um número zero. Nesse calculo a primeira coisa a ser feita é a soma dos sinais(Mais com menos é igual a menos),
        //após isso segue com fluxo do calculo normal
        mult = calcMult.multiplicar(3, -1);
        System.out.println(mult);
        
        //----> Cenário 4: Multplição com dois número zero. Nesse calculo a primeira coisa a ser feita é a soma dos sinais(menos com menos é igual a mais), 
        //após isso segue com fluxo do calculo normal
        mult = calcMult.multiplicar(-10, -3);
        System.out.println(mult);
        
    
    }   
}
