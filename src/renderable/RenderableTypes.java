package renderable;

public enum RenderableTypes {
    IMAGE ("image: "),
    BUTTON ("button: ");

    private final String title;

    RenderableTypes(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
