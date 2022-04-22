package Factory;

import Renderable.IButton;
import Renderable.IImage;
import Renderable.WindowsButton;
import Renderable.WindowsImage;

public class WindowsFactory implements UIFactory {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public IImage createImage() {
        return new WindowsImage();
    }
}
