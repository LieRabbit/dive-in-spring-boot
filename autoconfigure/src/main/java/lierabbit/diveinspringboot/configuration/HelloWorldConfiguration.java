package lierabbit.diveinspringboot.configuration;

import org.springframework.context.annotation.Bean;

/**
 * HelloWorld 配置类
 *
 * @author xyy
 * @since 2018-11-20 15:40
 */
//@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String helloWorld() {
        return "Hello,World 2018";
    }
}
