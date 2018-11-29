package lierabbit.diveinspringboot.configuration;

import lierabbit.diveinspringboot.annotation.EnableHelloWorld;
import lierabbit.diveinspringboot.condition.ConditionOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWorld 自动装配
 *
 * @author xyy
 * @since 2018-11-20 17:43
 */
@Configuration
@EnableHelloWorld
@ConditionOnSystemProperty(name = "user.name", value = "xuanyangyang")
public class HelloWorldAutoConfiguration {
}
