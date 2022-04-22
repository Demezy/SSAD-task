package Renderable;

public class WindowsImage extends IImage {
    @Override
    public String supportedTypes() {
        return introOfReturn + element + OS.WINDOWS.getTitle();
    }
}
