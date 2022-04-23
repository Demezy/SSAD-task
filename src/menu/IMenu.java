package menu;

import touchmanager.ITouchManager;

/**
 * interface of the class menu of application
 */
public interface IMenu {
	// basic interface for all menus

	IMenu run(ITouchManager touchManager);

	void close();

}
