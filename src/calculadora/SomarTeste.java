package calculadora;

public class SomarTeste {
    
    public void testarSoma(){
        
        Somar calc = new Somar();
        
        System.out.println("Teste Soma -->");
        
        
        //----> Cenário 1: Soma de dois valores 
        int soma = calc.somar(3,7);
        System.out.println(soma);
        
        //----> Cenário 2: Soma de dois numeros sendo um valor negativo
        soma = calc.somar(3,-4);
        System.out.println(soma);
        
        //----> Cenário 3: Soma de dois numeros sendos ambos negativos
        soma = calc.somar(-15, -10);
        System.out.println(soma);
        
        //----> Cenário 4: Soma de dois numeros sendo um zero
        soma = calc.somar(3, 0);
        System.out.println(soma);
        
        //----> Cenário 5: Soma de dois numeros 
        soma = calc.somar(3,100);
        System.out.println(soma);
    }
        
}
