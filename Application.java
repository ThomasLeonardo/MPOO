package entrega1;

public class Application {
	public static void main(String[] args) {
		HelloWorld helloWorld1 = new HelloWorld();
		helloWorld1.setNome("Malus");
		System.out.println(helloWorld1);
		HelloWorld helloWorld2 = new HelloWorld();
		helloWorld2.setNome("Luiz");
		System.out.println(helloWorld2);
		
		HelloWorld helloWorld3 = new HelloWorld();
		helloWorld3.setNome("Maria");
		System.out.println(helloWorld3);
		HelloWorld helloWorldSemNome = new HelloWorld();
		System.out.println(helloWorldSemNome);
	}
}
