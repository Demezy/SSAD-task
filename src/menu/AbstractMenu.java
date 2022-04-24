package menu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import touchmanager.ITouchManager;

/**
 * Abstract Menu for all menu in the application.
 */
public abstract class AbstractMenu implements IMenu {
	// move boilerplate code to abstract class
	// concrete menu implements in menu.menulist package
	public List<Readable> elements;

	@Override
	public void close() {
		// some closing logic
		System.out.println("menu " + this.getClass() + " closed");
	}

	@Override
	public IMenu run(ITouchManager touchManager) {
		// some running logic
		System.out.println("running " + this.getClass());

		// do some payload
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println(this.getClass() + " work finished");
		return this;
	}
}
