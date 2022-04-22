package factory;

import renderable.AndroidButton;
import renderable.AndroidImage;
import renderable.IButton;
import renderable.IImage;

public class AndroidFactory implements RenderableFactory {
	@Override
	public IButton createButton() {
		return new AndroidButton();
	}

	@Override
	public IImage createImage() {
		return new AndroidImage();
	}
}
