package builder.components;

public enum Dough {
    THIN_CRUST("Thin Crust"),
    REGULAR("Regular"),
    THICK("Thick"),
    GLUTEN_FREE("Gluten-Free");

    private final String description;

    Dough(String description) {
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
