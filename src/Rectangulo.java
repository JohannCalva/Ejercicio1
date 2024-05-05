public class Rectangulo {
    float base;
    float altura;
    float area;
    float perimetro;
    public void areaRectangulo(){
        System.out.println("Area del rectangulo");
        area = base * altura;
        System.out.println("El area del rectangulo es: "+area);
    }
    public void perimetroRectangulo(){
        System.out.println("Perimetro del rectangulo");
        perimetro = (base*2) + (altura*2);
        System.out.println("El perimetro del rectangulo es: "+ perimetro);
    }

}
