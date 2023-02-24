package TestingProje1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import com.google.common.annotations.VisibleForTesting;
import com.sun.tracing.dtrace.Attributes;

public class TestProje extends BaseDriver {

    @Test
    public void test1() {
         driver.get("https://itera-qa.azurewebsites.net/");



        BekleKapat();
    }
}
