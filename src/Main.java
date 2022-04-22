import factory.AndroidFactory;
import factory.RenderableFactory;
import factory.WindowsFactory;
import renderable.IButton;
import renderable.IImage;

class Main {
	public static void main(String[] args) {
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
	}
}
