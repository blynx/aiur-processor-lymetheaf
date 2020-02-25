package lymetheaf;

// import org.thymeleaf.templateresolver.FileTemplateResolver;
// import org.thymeleaf.TemplateEngine;
// import org.thymeleaf.context.Context;
// import nz.net.ultraq.thymeleaf.LayoutDialect;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.io.FileUtils;

public class ThymeleafTest {
    @Test public void testThymeleafProcessFile() {
        String prefix = System.getProperty("user.dir");
        String filePath = FileUtils.getFile(
            "src", "test", "java", "lymetheaf", "ThymeleafTest.html").toString();
            // getAbsolutePath();

        Thymeleaf thl = new Thymeleaf(prefix);

        String expectedString = "<div>yep</div>\n";
        assertEquals("Processing a file with data", expectedString,
            thl.processFile(filePath, "{test: \"yep\"}"));

        String expectedStringNoData = "<div></div>\n";
        assertEquals("Processing a file withoout data", expectedStringNoData,
            thl.processFile(filePath, ""));
    }
}
