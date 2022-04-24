package menu;

import menu.menulist.AboutMenu;
import menu.menulist.LoginMenu;
import menu.menulist.MainMenu;
import menu.menulist.MoodMenu;
import menu.menulist.PhotoMenu;

/**
 * Factory class for menu objects
 */
public class MenuFactory {
	public IMenu createMenu(MenuEnum type) {
		switch (type) {
			case LOGIN_MENU:
				return new LoginMenu();
			case ABOUT_MENU:
				return new AboutMenu();
			case MAIN_MENU:
				return new MainMenu();
			case MOOD_MENU:
				return new MoodMenu();
			case PHOTO_MENU:
				return new PhotoMenu();
			default:
				return null;
		}
	}

}
