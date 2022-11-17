package operadores;

public class Ternario {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;
        
       
        if(a == b){
            System.out.println("Condição verdadeira!");
        }
        boolean simNao = a == b;
        
        System.out.println("a é igual a b?" + simNao);

         simNao = a > b;

        System.out.println("a é maior que b?" + simNao);

         simNao = a < b;

        System.out.println("a é menor que b?" + simNao);

         simNao = a != b;

        System.out.println("a é diferente de b?" + simNao);
    }

}
