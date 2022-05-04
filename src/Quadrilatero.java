public class Quadrilatero {

    public static double area(double lado){
        System.out.println("Area do quadrado: " + lado * lado);
        return lado * lado;
    }

    public static double area(double lado1, double lado2){
        System.out.println("Area do retangulo: " + lado1 * lado2);
        return lado1 * lado2;
   }

    public static double area(double baseMaior, double baseMenor, double altura ){
        System.out.println("Area do trapézio: " + (baseMaior + baseMenor) * altura / 2);
        return (baseMaior + baseMenor) * altura / 2;
    }

    public static float area (float diagonal1, float diagonal2){
        System.out.println("Area do losango: " + (diagonal1 * diagonal2) / 2);
        return (diagonal1 * diagonal2) / 2;
    }
}
