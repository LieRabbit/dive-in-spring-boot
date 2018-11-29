package lierabbit.diveinspringboot.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * Java 系统属性条件判断
 *
 * @author xyy
 * @since 2018-11-20 17:04
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionOnSystemProperty {
    /**
     * 系统属性名称
     *
     * @return
     */
    String name();

    /**
     * 系统属性值
     *
     * @return
     */
    String value();
}
