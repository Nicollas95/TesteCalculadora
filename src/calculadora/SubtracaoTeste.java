package calculadora;

public class SubtracaoTeste {

    public void testarSubtrair(){
        
        
        Subtracao calcSub = new Subtracao();
        
        System.out.println("\nTestar Subtração -->");
        
        //----> Cenário 1: 
        int sub = calcSub.subtrair(3, 7);
        System.out.println(sub); 
        
        //---->
        sub = calcSub.subtrair(15, 0);
        System.out.println(sub);
        
        //----> Cenário 3: Subtração com dois zeros
        sub = calcSub.subtrair(0, 0);
        System.out.println(sub);
        
        //----> Cenário 4: 
        sub = calcSub.subtrair(10, -1);
        System.out.println(sub);
        
        //----> Cenário 4: 
        sub = calcSub.subtrair(-5, -1);
        System.out.println(sub);
   }
}
