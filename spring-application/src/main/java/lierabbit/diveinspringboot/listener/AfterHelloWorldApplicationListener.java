package lierabbit.diveinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;

/**
 * AfterHelloWorld {@link ApplicationListener} 监听 {@link ContextRefreshedEvent}
 *
 * @author xyy
 * @since 2018-11-21 17:23
 */
public class AfterHelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent>, Ordered {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("After Hello World : " + event.getApplicationContext().getId() + ", timestamp : " + event.getTimestamp());

    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
