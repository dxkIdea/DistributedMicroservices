package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 丁杏凯
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/3/289:52
 * IDEA 2017.2
 */
@EnableEurekaClient
@SpringBootApplication
public class ClientTest2Application {
    public static void main(String[] args) {
        SpringApplication.run(ClientTest2Application.class,args);
    }
}
