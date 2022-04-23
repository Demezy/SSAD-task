import menu.IMenu;
import menu.MenuEnum;
import menu.MenuFactory;
import factory.AndroidFactory;
import factory.RenderableFactory;
import factory.WindowsFactory;
import renderable.IButton;
import renderable.IImage;

class Application {
	IMenu currMenu;

	// TouchManager
	// SpeechSynthesizer
	public void run() {
		// Test Android Factory.
		RenderableFactory factory = new AndroidFactory();
		IButton button = factory.createButton();
		IImage image = factory.createImage();
		System.out.println(button.supportedTypes());
		System.out.println(image.supportedTypes());

		System.out.println(); // Split tests.

		// Test WindowsFactory.
		factory = new WindowsFactory();
		IButton button2 = factory.createButton();
		IImage image2 = factory.createImage();
		System.out.println(button2.supportedTypes());
		System.out.println(image2.supportedTypes());

		// test menu factory
		MenuFactory mf = new MenuFactory();
		IMenu menu = mf.createMenu(MenuEnum.ABOUT_MENU);
		menu.run(null);
		menu.close();

	}
}
