package labPadroesProjetoJava.Gof.Singleton;

import labPadroesProjetoJava.Gof.Strategy.ComportamentoAgressivo;
import labPadroesProjetoJava.Gof.Strategy.ComportamentoDefensivo;
import labPadroesProjetoJava.Gof.Strategy.ComportamentoNormal;
import labPadroesProjetoJava.Gof.Strategy.Robo;

public class TesteSingleton {

	public static void main(String[] args) {
		
		// Strategy
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println();
		System.out.println(holder);
		
		//Strategy
		
		ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
		ComportamentoNormal normal = new ComportamentoNormal();
		ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
	}

}
