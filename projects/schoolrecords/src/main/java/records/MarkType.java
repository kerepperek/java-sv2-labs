package records;

public enum MarkType {
    A(5, "excellent"),
    B(4, "very good"),
    C(3, "improvement needed"),
    D(2, "close fail"),
    F(1, "fail");

    private int mark;
    private String markTypeName;

    private MarkType(int mark,String markTypeName){
        this.mark=mark;
        this.markTypeName=markTypeName;

    }

    public String getMarkTypeName() {
        return markTypeName;
    }

    public int getMark() {
        return mark;
    }
}
