package renderable;

public class AndroidButton extends IButton {
    @Override
    public String supportedTypes() {
        return introOfReturn + RenderableTypes.BUTTON.getTitle() + OS_types.ANDROID.getTitle() + ".";
    }
}
