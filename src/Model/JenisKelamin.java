package Model;

public enum JenisKelamin {
    LAKI_LAKI("Laki-Laki"),
    PEREMPUAN("Perempuan");

    private String label;

    JenisKelamin(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
