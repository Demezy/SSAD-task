package Renderable;

public enum OS {
    ANDROID ("Android"),
    WINDOWS ("Windows");

    private String title;

    OS(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
