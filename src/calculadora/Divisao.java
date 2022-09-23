package calculadora;

public class Divisao {
    
    public float dividir(float a, float b){
        if (a == 0 & b == 0) {
             return 0;
        } else if (a!=0 & b ==0) {
            return a;
        }
        return a/b;
    }
}
