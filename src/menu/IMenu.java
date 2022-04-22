package Menu;

import touchmanager.ITouchManager;

public interface IMenu {

	IMenu run(ITouchManager touchManager);

	void close();

}
