import java.rmi.Naming;

public class CalculadoraCliente {

    public static void main(String[] args) {
        
        try {
            CalculadoraRemota calculadora = (CalculadoraRemota) Naming.lookup("//127.0.0.1:1099/CalculadoraServer");
            System.out.println("5 + 5 é igual a " + calculadora.somar(5, 5));
            System.out.println("5 - 5 é igual a " + calculadora.subtrair(5, 5));
            System.out.println("2 x 2 é igual a " + calculadora.multiplicar(2, 2));
            System.out.println("4 / 4 é igual a " + calculadora.dividir(4, 4));
        } catch (Exception ex) {
            System.err.println("Erro: " + ex.getMessage());
        }
    }
}