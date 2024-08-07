package dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
    // Message we expect to see in the status check
    public static final String MESSAGE_TO_CHECK = "Активна";

    /**
     * Provides test data for the Toll Check tests.
     * Each test case consists of a number plate and the expected status message.
     *
     * @return A 2D array where each row is a number plate and the expected status.
     */
    @DataProvider(name = "testData")
    public static Object[][] testData() {
        return new Object[][]{
                {"cb2865ae", MESSAGE_TO_CHECK},
                {"b7369kc", MESSAGE_TO_CHECK},
                {"H1088AK", MESSAGE_TO_CHECK},
                {"B2826TK", MESSAGE_TO_CHECK},
                {"e8299Hh", MESSAGE_TO_CHECK},
                {"CB5928PA", MESSAGE_TO_CHECK},
                {"cb2408xp", MESSAGE_TO_CHECK},
                {"cb4723ma", MESSAGE_TO_CHECK},
                {"cb6037xk", MESSAGE_TO_CHECK},
                {"cb6038xk", MESSAGE_TO_CHECK},
                {"cb6615he", MESSAGE_TO_CHECK},
                {"cb4902tx", MESSAGE_TO_CHECK},
                {"ea4635aa", MESSAGE_TO_CHECK},
                {"cb2419ph", MESSAGE_TO_CHECK},
                {"cb7180aa", MESSAGE_TO_CHECK},
                {"ca6040tm", MESSAGE_TO_CHECK},
                {"ca8057cx", MESSAGE_TO_CHECK},
                {"ca8672tc", MESSAGE_TO_CHECK},
                {"cb1242mk", MESSAGE_TO_CHECK},
                {"cb1243mk", MESSAGE_TO_CHECK},
                {"cb8089mb", MESSAGE_TO_CHECK},
                {"cb1244mk", MESSAGE_TO_CHECK},
                {"cb8092mb", MESSAGE_TO_CHECK},
                {"a8911hm", MESSAGE_TO_CHECK},
                {"a9219hm", MESSAGE_TO_CHECK},
                {"ca7424cp", MESSAGE_TO_CHECK},
                {"ca3679tt", MESSAGE_TO_CHECK},
                {"ca3466tc", MESSAGE_TO_CHECK},
                {"ca6105cc", MESSAGE_TO_CHECK},
                {"ca2710ck", MESSAGE_TO_CHECK},
                {"ca4154tp", MESSAGE_TO_CHECK},
                {"ca7889xh", MESSAGE_TO_CHECK},
                {"cb6238am", MESSAGE_TO_CHECK},
                {"ca0943ch", MESSAGE_TO_CHECK},
                {"cb4793mp", MESSAGE_TO_CHECK},
                {"cb4375mb", MESSAGE_TO_CHECK},
                {"cb4454mp", MESSAGE_TO_CHECK},
                {"cb2109px", MESSAGE_TO_CHECK},
                {"cb0121hx", MESSAGE_TO_CHECK},
                {"cb1395am", MESSAGE_TO_CHECK},
                {"cb2609ke", MESSAGE_TO_CHECK},
                {"cb0418tc", MESSAGE_TO_CHECK},
                {"ca3768ch", MESSAGE_TO_CHECK},
                {"cb5694bh", MESSAGE_TO_CHECK},
                {"cb4780pb", MESSAGE_TO_CHECK},
                {"cb4796cx", MESSAGE_TO_CHECK},
                {"cb2681xk", MESSAGE_TO_CHECK},
                {"cb1368BB", MESSAGE_TO_CHECK},
                {"cb9686kt", MESSAGE_TO_CHECK},
        };
    }
}
