package factory;

import renderable.IButton;
import renderable.IImage;
import renderable.WindowsButton;
import renderable.WindowsImage;

/**
 * Implementation factory for windows
 */
public class WindowsFactory implements RenderableFactory {
	@Override
	public IButton createButton() {
		return new WindowsButton();
	}

	@Override
	public IImage createImage() {
		return new WindowsImage();
	}
}
