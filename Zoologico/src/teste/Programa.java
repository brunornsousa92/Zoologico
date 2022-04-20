package teste;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mamifero mamifero;
		mamifero = new Mamifero();
		
		mamifero.setNome("Leoa");
		mamifero.setPeso(130.5);
		mamifero.setMesesGestacao(110);
		
		System.out.println("Nome do Mamífero: " + mamifero.getNome() +
				"\nPeso: " + mamifero.getPeso() +
				"\nMeses de Gestação: " + mamifero.getMesesGestacao() + " dias\n");
		
		Reptil reptil;
		reptil = new Reptil();
		
		reptil.setNome("Iguana Marinha");
		reptil.setPeso(1.5);
		reptil.setQuantidadeMaximaOvo(6);
		
		System.out.println("Nome do Réptil: " + reptil.getNome() +
				"\nPeso: " + reptil.getPeso() +
				"\nQuantidade Máxima de Ovos: " + reptil.getQuantidadeMaximaOvo());
		
		

	}

}
