import java.util.Objects;

public class Course {
    private int code;
    private String name;
    private int ects;
    private int ano;

    public Course(){
        this.code = 0;
        this.name = "";
        this.ects = 0;
        this.ano = 0;
    }
    public Course(int code, String name, int ects, int ano){
        this.code = code;
        this.name = name;
        this.ects = ects;
        this.ano = ano;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public int getEcts() {
        return ects;
    }

    public int getAno() {
        return ano;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return code == course.code && ects == course.ects && ano == course.ano && Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, ects, ano);
    }

    @Override
    public String toString() {
        return "Course{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", ects=" + ects +
                ", ano=" + ano +
                '}';
    }
}
