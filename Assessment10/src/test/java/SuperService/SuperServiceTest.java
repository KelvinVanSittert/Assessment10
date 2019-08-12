package SuperService;

import org.junit.Assert;
import org.junit.Test;

public class SuperServiceTest {

    private SuperService superService = new SuperService();

    @Test
    public void create() {

        String firstName = "Spock";
        String lastName = "Idk";
        String genderName = "Male";
        String raceName = "Vulcan";

        boolean success = superService.create(firstName, lastName, genderName, raceName);

        Assert.assertTrue(success);
    }
}