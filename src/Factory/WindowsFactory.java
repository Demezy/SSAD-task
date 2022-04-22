package Factory;

import Randerable.IButton;
import Randerable.IImage;
import Randerable.WindowsButton;
import Randerable.WindowsImage;

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
