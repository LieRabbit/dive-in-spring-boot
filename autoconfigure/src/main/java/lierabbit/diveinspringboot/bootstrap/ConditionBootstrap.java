package lierabbit.diveinspringboot.bootstrap;


import lierabbit.diveinspringboot.condition.ConditionOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 条件引导类
 *
 * @author xyy
 * @since 2018-11-20 17:17
 */
public class ConditionBootstrap {

    @Bean
    @ConditionOnSystemProperty(name = "user.name", value = "xuanyangyang")
    public String hello() {
        return "hello xyy";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        // 获取hello Bean
        String helloWorld = context.getBean("hello", String.class);

        System.out.println("hello Bean : " + helloWorld);

        // 关闭上下文
        context.close();
    }
}
