package Renderable;

public class AndroidButton extends IButton {
    @Override
    public String supportedTypes() {
        return introOfReturn + Renderable_types.BUTTON.getTitle() + OS_types.ANDROID.getTitle() + ".";
    }
}
