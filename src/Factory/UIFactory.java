package Factory;

import Renderable.IButton;
import Renderable.IImage;

public interface UIFactory {
    IButton createButton();
    IImage createImage();
}
