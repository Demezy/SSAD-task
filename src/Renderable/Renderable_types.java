package Renderable;

public enum Renderable_types {
    IMAGE ("image: "),
    BUTTON ("button: ");

    private final String title;

    Renderable_types(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
