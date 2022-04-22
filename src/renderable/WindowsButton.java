package Renderable;

public class WindowsButton extends IButton {
    @Override
    public String supportedTypes() {
        return introOfReturn + element + OS.WINDOWS.getTitle();
    }
}
