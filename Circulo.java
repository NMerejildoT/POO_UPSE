/**
 * Esta clase crea un circulo atravez de un punto
 * @author Blas0
 *
 */
public class Circulo {
	//Propiedades
	private double radio = 1;
    public static final double pi =3.1415926535;
    private Punto p;
     
    public Circulo(Punto centro, double r)
    {
    	p= centro;
    	radio = r;
    }
    
    public double calcularArea()
    {
    	double area = pi * Math.pow(radio,2);
    	return area;
    }
    
    /**
     * este metodo calcula el area de un circulo
     * @return
     */
    
    public double calcularCircuferencia()
    {
    	return 2*pi*radio;
    }
    /**
     * estes metodo calcula el perimetro del circulo
     * retorna double perimetro
     */
    public void imprimirCirculo()
    {
    	String salida = "El circulo tiene radio: " + this.radio +"centrado en el punto: " + p.getX() + " , " + p.getY();
    	salida += " .El area del circulo es: " + calcularArea() + "y su circunferencia es: "+ calcularCircuferencia ();
    			System.out.println(salida);
    }
}
