package Model;

public enum GolDarah {
    A("A"),
    B("B"),
    AB("AB"),
    O("O");

    private String label;

    GolDarah(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

