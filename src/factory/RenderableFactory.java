package factory;

import renderable.IButton;
import renderable.IImage;

public interface RenderableFactory {
	IButton createButton();

	IImage createImage();
}
