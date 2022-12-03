public enum Colour {
    RED("Красный"),
    BLACK("Черный"),
    BLUE("Синий"),
    WHITE("Белый"),
    GRAY("Серый");

    private final String name;

    Colour(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
