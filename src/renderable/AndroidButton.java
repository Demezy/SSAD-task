package Renderable;

public class AndroidButton extends IButton {
    @Override
    public String supportedTypes() {
        return introOfReturn + element + OS.ANDROID.getTitle();
    }
}
