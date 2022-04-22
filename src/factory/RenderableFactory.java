package factory;

import renderable.IButton;
import renderable.IImage;

/**
 * Starting implement Abstract Factory pattern.
 */
public interface RenderableFactory {
	IButton createButton();
	IImage createImage();
}
