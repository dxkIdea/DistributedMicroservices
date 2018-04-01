import com.springcloud.RabbitMQApplication;
import com.springcloud.rabbit.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 丁杏凯
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/3/268:58
 * IDEA 2017.2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RabbitMQApplication.class)
public class RabbitTest {
    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception{
        //sender.send();
    }

}
