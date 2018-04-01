import com.springcloud.Application;
import com.springcloud.mailService.MimeMessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class MailTest {
    @Autowired
    private MimeMessageService mimeMessageService;

    @Test
    public void test() throws Exception {
        mimeMessageService.sendAttachmentsMail();
    }



}
