package br.edu.infnet.model.test;

import br.edu.infnet.model.dominio.Diretor;
import br.edu.infnet.model.dominio.Gerente;

class GerenteTeste {

	public static void main(String[] args) {
		Gerente g1 = new Gerente("111111111-11", "Gerente1", 15000f, 0);
		g1.setAuxiliogasolina(500f);
		g1.setGratificacaogerente(500f);
		g1.setParticipacaolucros(true);
		System.out.println("O gerente "+g1.getNome()+" tem salário final:"+g1.calcularSalarioFinal());

		Gerente g2 = new Gerente("222222222-22", "Gerente2", 16000f, 0);
		g2.setAuxiliogasolina(500f);
		g2.setGratificacaogerente(1000f);
		g2.setParticipacaolucros(true);
		System.out.println("O gerente "+g2.getNome()+" tem salário final:"+g2.calcularSalarioFinal());
	}

}
