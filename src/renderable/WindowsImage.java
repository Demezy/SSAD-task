package renderable;

/**
 * Implementation of Windows Image by IImage
 */
public class WindowsImage extends IImage {
    @Override
    public String supportedTypes() {
        return introOfReturn + RenderableTypes.IMAGE.getTitle() + OS_types.WINDOWS.getTitle() + ".";
    }
}
