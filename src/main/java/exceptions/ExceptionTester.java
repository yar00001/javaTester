package exceptions;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionTester {

    public void throwChildExc() throws ChildException {
        throw new ChildException("child");
    }

    public void throwParent() throws BaseException {
        throw new BaseException("parent");
    }

    @Test
    public void catchExcTest() {
        try {
            throwChildExc();
        } catch (BaseException exception) {
            String exceptionMessage = exception.getMessage();
            Assert.assertEquals(exceptionMessage, "child");
        }
    }

}
