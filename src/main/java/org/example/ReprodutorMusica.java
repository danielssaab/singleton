package org.example;

public class ReprodutorMusica {

	private ReprodutorMusica() {}
	private static ReprodutorMusica instance = new ReprodutorMusica();
	public static ReprodutorMusica obterInstancia() {
		return instance;
	}

	private int volume;
	private boolean modoAleatorio;

	public int obterVolume() {
		return volume;
	}

	public void definirVolume(int volume) {
		this.volume = volume;
	}

	public boolean estaNoModoAleatorio() {
		return modoAleatorio;
	}

	public void definirModoAleatorio(boolean modoAleatorio) {
		this.modoAleatorio = modoAleatorio;
	}
}
