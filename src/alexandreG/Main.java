/**
 * @author alexandre.gaia
 */

package alexandreG;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<People> people = new People().peopleGroup();

        Stream<People> person = people.stream().filter(p -> p.getGender().equals("Female"));

        System.out.println("Female Group: ");
        person.forEach(System.out::println);
    }
}
