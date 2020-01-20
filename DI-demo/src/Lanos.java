/**
 * Ланос
 *
 */
public class Lanos implements Car {
	private Engine engine;
	

	public Lanos(Engine engine) {
		//super();
		this.engine = engine;
	}


	@Override
	public void go() {
		engine.start();
		System.out.println("GO Lanos");

	}

}
