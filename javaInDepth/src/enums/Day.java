package enums;

public enum Day {
    MONDAY(1,"Pazartesi"),
    TUESDAY(2,"Salı"),
    WEDNESDAY(3,"Çarşamba");


    private int number;
    private String label;

    private Day(int number, String label) {
        this.number = number;
        this.label = label;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
