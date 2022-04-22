package Renderable;

public class AndroidImage extends IImage {
    @Override
    public String supportedTypes() {
        return introOfReturn + element + OS.ANDROID.getTitle();
    }
}
