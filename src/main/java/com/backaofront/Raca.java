package com.backaofront;

public class Raca {
	int forc, vid, vel, dom, nen; //forc = força, vid = vida, vel = velocidade, dom = dominio/inteligencia, nen = mana

 	// Criando o construtor para definir os atributos de cada raça com valores determinados pelo desenvolvedor.
	Raca(int forc, int vid, int vel, int dom, int nen){
		this.forc = forc;
		this.vid = vid;
		this.vel = vel;
		this.dom = dom;
		this.nen = nen;
	}
}
