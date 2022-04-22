package Factory;

import Randerable.IButton;
import Randerable.IImage;

public interface UIFactory {
    IButton createButton();
    IImage createImage();
}
