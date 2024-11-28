package Model;

public enum Kewarganegaraan {
    WNI("WNI"),
    WNA("WNA");

    private String label;

    Kewarganegaraan(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

