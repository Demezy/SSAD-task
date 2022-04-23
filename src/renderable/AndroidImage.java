package renderable;

/**
 * Implementation of Android Image by IImage
 */
public class AndroidImage extends IImage {
    @Override
    public String supportedTypes() {
        return introOfReturn + RenderableTypes.IMAGE.getTitle() + OS_types.ANDROID.getTitle() + ".";
    }
}
