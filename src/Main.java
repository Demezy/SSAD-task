import Factory.AndroidFactory;
import Renderable.IButton;
import Renderable.IImage;

class Main {
	public static void main(String[] args) {
		AndroidFactory androidFactory = new AndroidFactory();
		IButton button = androidFactory.createButton();
		IImage image = androidFactory.createImage();
		System.out.println(button.supportedTypes());
		System.out.println(image.supportedTypes());

	}
}
