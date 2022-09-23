package Test;

import calculadora.Divisao;
import calculadora.Multiplicacao;
import calculadora.Somar;
import calculadora.Subtracao;
import org.junit.Assert;
import org.junit.Test;

public class TestJUnit {
    
    @SuppressWarnings("deprecation")
    @Test
    public void junitSoma(){
        Somar calcJunit = new Somar();
       
        System.out.println("Teste Soma -->");
        
        //----> Cenário 1: Soma de dois valores inteiros positivos
        int soma = calcJunit.somar(3,8);
        System.out.println(soma);
        Assert.assertEquals(11,soma);
        
        //----> Cenário 2: Soma de dois numeros inteiros sendo um valor negativo
        soma = calcJunit.somar(3,-4);
        System.out.println(soma);
        Assert.assertEquals(-1,soma);
        
        //----> Cenário 3: Soma de dois numeros inteiros sendo ambos negativos
        soma = calcJunit.somar(-15, -10);
        System.out.println(soma);
        Assert.assertEquals(-25,soma);
        
        //----> Cenário 4: Soma de dois numeros inteiros sendo um zero
        soma = calcJunit.somar(3, 0);
        System.out.println(soma);
        Assert.assertEquals(3,soma);
        
        //----> Cenário 5: Soma de dois numeros inteiros
        soma = calcJunit.somar(3,100);
        Assert.assertEquals(103,soma);  
    }
    
    
    @SuppressWarnings("deprecation")
    @Test
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
    
    @SuppressWarnings("deprecation")
    @Test
        public void testarMultiplicacao(){
        
        Multiplicacao calcMult = new Multiplicacao();
        
        System.out.println("\nTeste Multiplicação -->");
        
        //----> Cenário 1: Multiplicação com dois números inteiros
        int mult = calcMult.multiplicar(8, 5);
        System.out.println(mult);
        Assert.assertEquals(40,mult);
        
        //----> Cenário 2: Multiplicação com um numero zero. Multiplicar zero com qualquer número equivale a somar o zero varias vezes
        mult = calcMult.multiplicar(145, 0);
        System.out.println(mult);
        Assert.assertEquals(0,mult);
        
        //----> Cenário 3: Multiplicação com ambos número zero. resposta sempre será zero
        mult = calcMult.multiplicar(0, 0);
        System.out.println(mult);
        Assert.assertEquals(0,mult);
        
        //----> Cenário 4: Multplição com um número zero. Nesse calculo a primeira coisa a ser feita é a soma dos sinais(Mais com menos é igual a menos),
        //após isso segue com fluxo do calculo normal
        mult = calcMult.multiplicar(3, -1);
        System.out.println(mult);
        Assert.assertEquals(-3,mult);
        
        //----> Cenário 4: Multplição com dois número zero. Nesse calculo a primeira coisa a ser feita é a soma dos sinais(menos com menos é igual a mais), 
        //após isso segue com fluxo do calculo normal
        mult = calcMult.multiplicar(-10, -3);
        System.out.println(mult);
        Assert.assertEquals(30,mult);
    }  
        
    
    @SuppressWarnings("deprecation")
    @Test
    public void testarSubtrair(){
        
        
        Subtracao calcSub = new Subtracao();
        
        System.out.println("\nTestar Subtração -->");
        
        //----> Cenário 1: Subtração com dois números inteiros
        int sub = calcSub.subtrair(3, 7);
        System.out.println(sub);
        Assert.assertEquals(-4,sub);
        
        //----> Cenário 2: Subtração com dois números sendo um zero.
        sub = calcSub.subtrair(15, 0);
        System.out.println(sub);
        Assert.assertEquals(15,sub);
        
        //----> Cenário 3: Subtração com dois zeros
        sub = calcSub.subtrair(0, 0);
        System.out.println(sub);
        Assert.assertEquals(0,sub);
        
        //----> Cenário 4: Subtração com dois números inteiros, sendo um negativo
        sub = calcSub.subtrair(10, -1);
        System.out.println(sub);
        Assert.assertEquals(11,sub);
        
        //----> Cenário 5: Subtração com dois números inteiros, sendos os dois negativos
        sub = calcSub.subtrair(-5, -1);
        System.out.println(sub);
        Assert.assertEquals(-4,sub);
   }
}
