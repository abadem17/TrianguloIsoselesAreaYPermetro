package Ejercicio5;

public class Triangulo {

    private double l1,l2,base,perimetro;
    double altura;
    double area;

    public Triangulo(double l1, double base) { //tringulo isoseles
        this.l1 = this.l2 = l1;
        this.base = base;
    }
    public void calcularAltura(){
        altura = Math.sqrt((l1*l1)-((base/2)*(base/2)));
    }

    public double getBase() {
        return base;
    }

    public double calcularPerimetro(){
        perimetro = l1 + l2 + base;
        return perimetro;
    }
    public double calcularArea(){
        area = (base*altura)/2;
        return area;
    }
    /*
    public double obtenerArea(){
        area= (base*Math.sqrt((l1*l1)-(base*base/4)))/2;
        return area;
    }*/
    public String mostrarDatos(){
        return "El area del tringulo con mayor base("+base+") es: "+calcularArea() +"\nperimetro: "+calcularPerimetro();
    }

}
