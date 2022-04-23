package menu;

import java.util.List;

import touchmanager.ITouchManager;

public abstract class AbstractMenu implements IMenu {
	public List<Readable> elements;

	@Override
	public void close() {
		System.out.println("menu " + this.getClass() + " closed");
	}

	@Override
	public IMenu run(ITouchManager touchManager) {
		System.out.println("run " + this.getClass());
		return this;
	}
}
