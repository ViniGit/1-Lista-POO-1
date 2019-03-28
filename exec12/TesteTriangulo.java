package exec12;

import utils.Leitor;

public class TesteTriangulo {

	public static void main(String[] args) {
		Triangulo t = new Triangulo();
		double lado1 = Leitor.LerDoublePositivo("o Lado 1");
		try {
			t.setLado1(lado1);
		}catch(Exception e) {
		}
		double lado2 = Leitor.LerDoublePositivo("o Lado 2");
		try {
			t.setLado2(lado2);
		}catch(Exception e1){
			
		}
		double lado3 = Leitor.LerDoublePositivo("o Lado 3");
		try {
			t.setLado3(lado3);
		}catch(Exception e2) {
			
		}
		if (t.tipodeangulo() == 1) {
			System.out.println("Ocut�ngulo.");
		} else {
			if (t.tipodeangulo() == 2) {
				System.out.println("Obtus�ngulo.");
			} else {
				if (t.tipodeangulo() == 3) {
					System.out.println("Ret�ngulo.");
				} else {
					if (t.tipodeangulo() == 0) {
						System.out.println("Tri�ngulo n�o possui �ngulo.");
					}
				}
			}
		}

		if (t.validartriangulo() == 1) {
			System.out.println("Equilatero.");
		} else {
			if (t.validartriangulo() == 2) {
				System.out.println("Is�sceles.");
			} else {
				if (t.validartriangulo() == 3) {
					System.out.println("Escaleno.");
				} else {
					if (t.validartriangulo() == 0) {
						System.out.println("N�o � tri�ngulo");
					}
				}
			}
		}

		System.out.println("Area do tri�ngulo:" + t.areatriangulo());

	}

}
