package packageclass;

import java.util.Objects;

public class Ironman {
    private int age;
    private String name;

    public Ironman(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Ironman() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ironman ironman = (Ironman) o;
        return age == ironman.age &&
                Objects.equals(name, ironman.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(age, name);
    }
}
