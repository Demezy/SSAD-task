package renderable;

public class WindowsImage extends IImage {
    @Override
    public String supportedTypes() {
        return introOfReturn + RenderableTypes.IMAGE.getTitle() + OS_types.WINDOWS.getTitle() + ".";
    }
}
