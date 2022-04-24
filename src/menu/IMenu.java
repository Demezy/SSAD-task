package menu;

import touchmanager.ITouchManager;

/**
 * Interface of the class menu in the application.
 */
public interface IMenu {
	// basic interface for all menus

	IMenu run(ITouchManager touchManager);

	void close();

}
