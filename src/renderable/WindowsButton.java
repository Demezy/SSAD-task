package renderable;

/**
 * Implementation of Android Button by IButton
 */
public class WindowsButton extends IButton {
    @Override
    public String supportedTypes() {
        return introOfReturn + RenderableTypes.BUTTON.getTitle() + OS_types.WINDOWS.getTitle() + ".";
    }
}
