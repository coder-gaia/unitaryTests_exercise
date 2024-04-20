package alexandreG;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class GenderInclusionTestTest {

    @Test
    public void GenderInclusion() {
        List<People> peopleList = new People().peopleGroup();

        Stream<People> onlyWomenList = peopleList.stream().filter(person -> person.getGender().equals("Female"));

        boolean allWomen = onlyWomenList.allMatch(p -> p.getGender().equals("Female"));
        Assert.assertTrue(allWomen);
    }

}