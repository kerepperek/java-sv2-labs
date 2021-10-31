package stringbasic;

public class Student {
    private Person person;
    private String neptunId;
    private String eduId;
    private String cardId;

    public Student(Person person, String neptunId, String eduId) {
        this.person = person;
        this.neptunId = neptunId;
        this.eduId = eduId;
    }

    public Person getPerson() {
        return person;
    }

    public String getNeptunId() {
        return neptunId;
    }

    public String getEduId() {
        return eduId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setNeptunId(String neptunId) {
        this.neptunId = neptunId;
    }

    public void setEduId(String eduId) {
        this.eduId = eduId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "person=" + person +
                ", neptunId='" + neptunId + '\'' +
                ", eduId='" + eduId + '\'' +
                ", cardId='" + cardId + '\'' +
                '}';
    }
}
