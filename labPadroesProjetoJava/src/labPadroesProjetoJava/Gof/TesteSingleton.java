package labPadroesProjetoJava.Gof;

public class TesteSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
	}

}
