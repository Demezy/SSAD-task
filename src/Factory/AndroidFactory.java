package Factory;

import Randerable.AndroidButton;
import Randerable.AndroidImage;
import Randerable.IButton;
import Randerable.IImage;

public class AndroidFactory implements UIFactory {
    @Override
    public IButton createButton() {
        return new AndroidButton();
    }

    @Override
    public IImage createImage() {
        return new AndroidImage();
    }
}
