package Factory;

import Renderable.IButton;
import Renderable.IImage;

public interface RenderableFactory {
    IButton createButton();
    IImage createImage();
}
