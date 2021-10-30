package enumtype.university;

public enum University {
    BGE("Budapesti Gazdasági Egyetem"), PTE("Pécsi Tudományegyetem"),ELTE("Eötvös Loránd Tudományegyetem"), MILTON("Milton Friedman Egyetem");

    private String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
