package Renderable;

public class WindowsImage extends IImage {
    @Override
    public String supportedTypes() {
        return introOfReturn + Renderable_types.IMAGE.getTitle() + OS_types.WINDOWS.getTitle() + ".";
    }
}
