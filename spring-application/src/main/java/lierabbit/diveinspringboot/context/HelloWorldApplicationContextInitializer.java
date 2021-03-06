package lierabbit.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * TODO...
 *
 * @author xyy
 * @since 2018-11-21 16:24
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C> {

    @Override
    public void initialize(C applicationContext) {
        System.out.println("ConfigurableApplicationContext.id = " + applicationContext.getId());
    }
}
