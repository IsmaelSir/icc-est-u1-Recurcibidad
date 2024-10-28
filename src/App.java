public class App {
    public static void main(String[] args) throws Exception {
         System.out.println("Hello, World!");
        Recirsividad  rec = new Recirsividad();/* 

        int resultado = rec.factorial(5);
        System.out.println(resultado);
        System.out.println("Suma de consecutivos");
        int resultado1 = rec.sumaConsecutivos(5);
        System.out.println(resultado1);*/
        int resultado3 = rec.potencia(2, 3);
        //System.out.println(resultado3);
        System.out.println("Suma de digitos");
        int resultado4 = rec.sumaConsecutivos(456);
        System.out.println(resultado4);
    }
}
