import java.util.Scanner;

public class CODE_4 {

    static Scanner input = new Scanner(System.in);

    /*public static void main(String[] args) {

        int poligono[] = new int[4];

        String temp[] = input.nextLine().split(" ");

        for (int i = 0; i < temp.length; i++) {
            poligono[i] = Integer.parseInt(temp[i]);
        }

        System.out.println(AreaPoligono(poligono));
    }

    public static double AreaPoligono(int poligono[]){
        double area = 0;
        if(poligono[3] == 0){
            int p = poligono[0] + poligono[1] + poligono[2];
            double s = p/2;
            area = s*(s-poligono[0])*(s-poligono[1])*(s-poligono[2]);
            area = Math.pow(area, 0.5);
        } else if (poligono[0] == poligono[1] && poligono[2] == poligono[3] && poligono[0] == poligono[2]) {
            area = poligono[0] * poligono[0];
        } else {
            for (int i = 0; i < poligono.length; i++) {
                if(poligono[i] != poligono[i+1]){
                    area = poligono[i] * poligono[i+1];
                    break;
                }
            }
        }
        return area;
    }*/

    public static void main(String[] args) {
        triangulo triangle = new triangulo(10, 5);
        System.out.println("Area triangulo base 10, altura 5 = " + triangle.area());

        rectangulo rectangle = new rectangulo(10, 5);
        System.out.println("Area rectangulo base 10, altura 5 = " + rectangle.area());

        cuadrado square = new cuadrado(10);
        System.out.println("Area cuadrado lado 10 = " + square.area());
    }

    public interface poligono {
        double area();
    }

    public static class triangulo implements poligono {
        double base;
        double altura;

        triangulo (double base, double altura){
            this.altura = altura;
            this.base = base;
        }

        @Override
        public double area() {
            return (base*altura)/2;
        }
    }

    public static class rectangulo implements poligono {
        double base;
        double altura;

        rectangulo (double base, double altura){
            this.altura = altura;
            this.base = base;
        }

        @Override
        public double area() {
            return base*altura;
        }
    }

    public static class cuadrado implements poligono {
        double lado;

        cuadrado (double lado){
            this.lado = lado;;
        }

        @Override
        public double area() {
            return lado*lado;
        }
    }

}
