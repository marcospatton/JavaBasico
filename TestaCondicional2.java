
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("voc� tem mais de 18 anos");
			System.out.println("seja vem vindo");
		
		
	}else {
		if(quantidadePessoas >= 2) {
			System.out.println("voce n�o tem 18 anos, mas pode entrar, "
					+ "pois esta acompanhado");
		}else {
			
		}
		System.out.println("infelismente voce n�o pode entrar");
	}

  }

}
