import junit.framework.TestCase;
import org.junit.Assert;

public class CheckPatternsTest extends TestCase {

    public void testCheck() throws CustomException {
        CheckPatterns validate = new CheckPatterns();
        boolean result = validate.check("Adesh");
        Assert.assertEquals(true, result);
    }

    public void testMail() throws CustomException {
        CheckPatterns validate = new CheckPatterns();
        boolean result = validate.mail("abc.ades255@bl.co");

        Assert.assertEquals(true,result);
    }

    public void testMobile() throws CustomException {
    CheckPatterns validate = new CheckPatterns();
    boolean result = validate.mobile("1234567890");
    Assert.assertEquals(true,result);
    }

}