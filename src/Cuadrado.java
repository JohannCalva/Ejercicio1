import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cuadrado {
    float lado;
    float area;
    float perimetro;

    public Cuadrado(){
    }

    public void areaCuadrado(){

        System.out.println("Area del Cuadrado");
        this.area = this.lado * this.lado;
        System.out.println("El area del cuadrado es " + area);
    }
    public void perimetroCuadrado(){
        System.out.println("Perimetro del cuadrado");
        this.perimetro = this.lado * 4;
        System.out.println("El perimetro del cuadrado es " +perimetro);
    }
}
