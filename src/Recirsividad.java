public class Recirsividad {

    public int factorial(int n){
        System.out.println("Calculadoel factorial de "+n);
        //caso base: cuando n sea 0! y 1! son iguales a 1
        if(n == 0 || n==1 ){
            System.out.println("Caso base alcanzado el factorial de "+n);
            return 1;
        }
        int resultado = n * factorial(n-1);
        System.out.println("resultado parcial para " +n+" * factorial( "+(n-1)+" ) = "+resultado);
        return resultado;
    }

    //calcular la suma de los numero consecutivos
    // n = 5 el resultado= 5+4+3+2+1 => 15
    public int sumaConsecutivos(int n){
        //caso base n =1
        if(n == 1){
            return 1;
        }
        return  n+ sumaConsecutivos(n-1);
    }

    //calcular la potencia de un numero

    public int potencia(int base, int exponente) {
        // caso base
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    //crear un metodo que sume los digitos de un numero
    //si mando 456 sea igual a 15
    // 4+5+6 = 15
    //pista se usa el % mod
    public int sumarDigitos(int n) {

        if (n < 10) {
            return n;
        }
        return (n % 10) + sumarDigitos(n / 10);
    }
    
}
