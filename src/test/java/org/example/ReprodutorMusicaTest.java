package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ReprodutorMusicaTest {

	@Test
	public void deveRetornarVolume() {
		ReprodutorMusica.obterInstancia().definirVolume(50);
		assertEquals(50, ReprodutorMusica.obterInstancia().obterVolume());
	}

	@Test
	public void deveRetornarModoAleatorio() {
		ReprodutorMusica.obterInstancia().definirModoAleatorio(true);
		assertEquals(true, ReprodutorMusica.obterInstancia().estaNoModoAleatorio());
	}
}
