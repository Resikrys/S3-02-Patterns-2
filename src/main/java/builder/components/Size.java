package builder.components;

public enum Size {
    SMALL("Small"),
    MEDIUM("Medium"),
    FAMILIAR("Familiar");

    private final String description;

    Size(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
