package calculadora;

public class DividirTeste {
    
        public void testarDividir(){
        
        Divisao calc2 = new Divisao();
        
        System.out.println("\nTeste Dividir -->");
        
        //----> Cenário 1: Divisão com numeros positivos, porém o dividendo é menor que o divisor.
        float div = calc2.dividir(10,20); 
        System.out.println(div);
        
        //----> Cenário 2: Divisão com numeros positivos e o divir é igual a zero. Não é possível dividir nenhum numero por zero, pois não
        // iremos encontrar nenhum número para quociente de forma que se aproxime do dividendo
        div = calc2.dividir(5,0); 
        System.out.println(div);
        
        //----> Cenário 3: Divisão com ambos numero zero. Não é possível dizer quanto vale essa divisão. 
        div = calc2.dividir(0,0); 
        System.out.println(div);
        
        //----> Cenário 4: Divisão com um número negativo.
        div = calc2.dividir(3,-1); 
        System.out.println(div);
        
        //----> Cenário 5: Divisão com dois número negativos. Nessa divisão a primeira que será feita é a soma dos sinais 
        //(menos com menos é igual a mais). E na sequencia segue com a divisão com números positivos
        div = calc2.dividir(-50,-5); 
        System.out.println(div);
    }   
}
