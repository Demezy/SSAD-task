package Renderable;

public class AndroidImage extends IImage {
    @Override
    public String supportedTypes() {
        return introOfReturn + Renderable_types.IMAGE.getTitle() + OS_types.ANDROID.getTitle() + ".";
    }
}
