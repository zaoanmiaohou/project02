package TestDeskTop;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.net.URI;
import java.util.Date;

@Controller
public class TestDeskTop {

    @Test
    public void testDeskTop() throws Exception{
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URI("www.baidu.com"));

        Date date = new Date();
    }
}
