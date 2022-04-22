package renderable;

public class AndroidImage extends IImage {
    @Override
    public String supportedTypes() {
        return introOfReturn + RenderableTypes.IMAGE.getTitle() + OS_types.ANDROID.getTitle() + ".";
    }
}
