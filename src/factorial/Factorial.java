package factorial;

public class Factorial
{

    public static void main(String[] args)
    {
        /**
         * creacion de un obxeto e chamada ao metodo
         */

        CalculoFactorial obxFactorial = new CalculoFactorial();
        obxFactorial.calcFactorial();
        System.out.println(obxFactorial.getFactor());
    }
}
