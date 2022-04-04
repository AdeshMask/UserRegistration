import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void main() {
        Email email = new Email();
        boolean result = email.checkMails("abc.xyz@bl.co");
        Assert.assertEquals(true,result);
    }
}