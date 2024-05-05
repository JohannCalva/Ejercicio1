import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int op;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do{
            System.out.println("Seleccione la figura geometrica para calcular su area y perimetro");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Rectangulo");
            System.out.println("4. Salir");
            System.out.println("Opcion: ");
            op = Integer.parseInt(br.readLine());
            switch(op){
                case 1:
                    Cuadrado calCd = new Cuadrado();

                    System.out.println("Ingrese el valor del lado: ");
                    calCd.lado = Float.parseFloat(br.readLine());
                    calCd.areaCuadrado();
                    calCd.perimetroCuadrado();
                    break;
                case 2:
                    Triangulo calTr = new Triangulo();

                    System.out.println("Ingrese el valor de la base: ");
                    calTr.base = Float.parseFloat(br.readLine());
                    System.out.println("Ingrese el valor de la altura: ");
                    calTr.altura = Float.parseFloat(br.readLine());
                    calTr.areaTriangulo();
                    System.out.println("Ingrese el valor de uno de los lados del triangulo isosceles: ");
                    calTr.lado = Float.parseFloat(br.readLine());
                    calTr.perimetroTriangulo();

                    break;
                case 3:
                    Rectangulo calRe = new Rectangulo();

                    System.out.println("Ingrese el valor de la base: ");
                    calRe.base = Float.parseFloat(br.readLine());
                    System.out.println("Ingrese el valor de la altura: ");
                    calRe.altura = Float.parseFloat(br.readLine());
                    calRe.areaRectangulo();
                    calRe.perimetroRectangulo();
                    break;
                case 4:
                    System.out.println("Gracias por usar.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }while(op != 4);
    }
}