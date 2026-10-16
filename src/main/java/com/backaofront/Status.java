package com.backaofront;
// criando as raças/objetos, e atribuindo os valores de status de cada um.
public class Status {
		public static Raca humano = new Raca(60, 50, 60, 75, 65);
	  public static Raca vampiro = new Raca(70, 65, 80, 50, 45);
		public static	Raca elfo = new Raca(35, 45, 80, 75, 75);
		public static	Raca orc = new Raca(110, 80, 45, 40, 35);
		public static	Raca draconiano = new Raca(85, 70, 70, 50, 35);
		public static	Raca bruxa = new Raca(35, 35, 35, 95, 110);
		public static Raca lobisomem = new Raca(90, 75, 75, 40, 30);
		// public static Raca mago = new Raca(0,0,0,0,0,); // 310
}
// força, vida, velocidade, dominio, Nem/mana.
// total de pontos base são 300.
// bonus de raça fica em 10 pontos a mais.