package calculadora;

public class SomarTeste {
    
    public void testarSoma(){
        
        Somar calc = new Somar();
        
        System.out.println("Teste Soma -->");
        
        
        //----> Cenário 1: Soma de dois valores inteiros positivos
        int soma = calc.somar(3,8);
        System.out.println(soma);
        
        //----> Cenário 2: Soma de dois numeros inteiros sendo um valor negativo
        soma = calc.somar(3,-4);
        System.out.println(soma);
        
        //----> Cenário 3: Soma de dois numeros inteiros sendo ambos negativos
        soma = calc.somar(-15, -10);
        System.out.println(soma);
        
        //----> Cenário 4: Soma de dois numeros inteiros sendo um zero
        soma = calc.somar(3, 0);
        System.out.println(soma);
        
        //----> Cenário 5: Soma de dois numeros inteiros
        soma = calc.somar(3,100);
        System.out.println(soma);
    }
        
}
