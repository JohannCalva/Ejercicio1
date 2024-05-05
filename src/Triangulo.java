public class Triangulo {
    float base;
    float altura;
    float area;
    float lado;
    float perimetro;
    public void areaTriangulo(){
        System.out.println("Area del triangulo");
        area = (base * altura) / 2;
        System.out.println("El area del triangulo es: "+area);
    }
    public void perimetroTriangulo(){
        System.out.println("Perimetro del Triangulo Isosceles");
        perimetro = base + (lado*2);
        System.out.println("El perimetro de un triangulo isoceles de base " + base + " y lados " + lado + " es " + perimetro);
    }
}
