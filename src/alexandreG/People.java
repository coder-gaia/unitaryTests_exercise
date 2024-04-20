/**
 * @author alexandre.gaia
 */

package alexandreG;


import java.util.List;
import java.util.Objects;

public class People {

    private int age;
    private String name;
    private String gender;

    public People(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public People() {

    }

    public List<People> peopleGroup(){
        People person_1 = new People(18, "John", "Male");
        People person_2 = new People(20, "Dean", "Male");
        People person_3 = new People(30, "Sam", "Male");
        People person_4 = new People(19, "Mary", "Female");
        People person_5 = new People(21, "Julie", "Female");
        People person_6 = new People(31, "Jasmine", "Female");
        return List.of(person_1, person_2, person_3, person_4, person_5, person_6);
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name) && Objects.equals(gender, people.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, gender);
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

}
