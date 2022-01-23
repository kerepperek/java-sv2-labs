package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TrainingCompany {

    private List<Course> courses;

    public TrainingCompany(List<Course> courses) {
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    public Course getCheaperCourse(int maxPrice) {
        Optional<Course> courseOptional = Optional.empty();
        for (Course course : courses) {
            if (course.getPrice() <= maxPrice) {
                courseOptional = Optional.of(course);
            }
        }
        return courseOptional.orElseThrow(() -> new IllegalArgumentException("No such course."));
    }

    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level) {
        Optional<Course> courseOptional = Optional.empty();
        for (Course course : courses) {
            if (course.getName().equals(name) && course.getLevel() == level) {
                courseOptional = Optional.of(course);
            }
        }
        return courseOptional.orElseThrow(() -> new IllegalArgumentException("No such course.")).getPrice();
    }

    public String getNameOfCourseWithGivenLevel(Level level) {
        Optional<String> nameOptional = Optional.empty();
        for (Course course : courses) {
            if (course.getLevel() == level) {
                nameOptional = Optional.of(course.getName());
            }
        }
        return nameOptional.orElse("Sorry, there is no course at this level.");
    }
}