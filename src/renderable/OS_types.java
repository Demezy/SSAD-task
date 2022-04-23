package renderable;

/**
 * Enum of OS types
 */
public enum OS_types {
    ANDROID ("Android"),
    WINDOWS ("Windows");

    private final String title;

    OS_types(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
