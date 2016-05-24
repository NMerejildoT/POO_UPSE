
public class SinuladorGeometrico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p= new Punto(5,8);
		double x = p.getX();
		p.imprimir();
		Circulo c = new Circulo(p, 5);
		c.imprimirCirculo();
		
	}

}
