package factory;

import renderable.IButton;
import renderable.IImage;

/**
 * Abstract Factory of UI Elements
 */
public interface RenderableFactory {
	IButton createButton();
	IImage createImage();
}
