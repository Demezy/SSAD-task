package Factory;

import Renderable.AndroidButton;
import Renderable.AndroidImage;
import Renderable.IButton;
import Renderable.IImage;

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
