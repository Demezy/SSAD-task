package Renderable;

public class WindowsButton extends IButton {
    @Override
    public String supportedTypes() {
        return introOfReturn + Renderable_types.BUTTON.getTitle() + OS_types.WINDOWS.getTitle() + ".";
    }
}
