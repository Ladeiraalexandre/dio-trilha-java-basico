import com.exemplo.Circulo;
import com.exemplo.Forma;
import com.exemplo.CoresFormaDecorator;

public class DecoratorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forma circulo = new Circulo();

        Forma circuloVermelho = new CoresFormaDecorator(new Circulo());

        System.out.println("Circulo com as bordas normais");
        circulo.desenho();

        System.out.println("\nCirculo com as bordas vermelhas");
        circuloVermelho.desenho();
	}

}
