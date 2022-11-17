package vini.lazzeri.anatomiadeclasses;
public class MinhaClasse {
    
    public static void main(String[] args) {
        
        String primeiroNome = "Vini";
        String segundoNome = "Lazzeri";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);

    }
}

