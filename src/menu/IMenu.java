package menu;

import touchmanager.ITouchManager;

public interface IMenu {
	// basic interface for all menus

	IMenu run(ITouchManager touchManager);

	void close();

}
