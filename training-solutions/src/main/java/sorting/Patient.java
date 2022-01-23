package sorting;

import java.time.LocalDateTime;

public class Patient {

    private String name;

    private String TAJ;

    private LocalDateTime time;

    public Patient(String name, String TAJ, LocalDateTime time) {
        this.name = name;
        this.TAJ = TAJ;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getTAJ() {
        return TAJ;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
