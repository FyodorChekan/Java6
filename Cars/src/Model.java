public enum Model {
    RIO("Rio"),
    FOCUS("Focus"),
    KALINA("Kalina"),
    M4("M4"),
    Q8("Q8");

    private final String name;

    Model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}