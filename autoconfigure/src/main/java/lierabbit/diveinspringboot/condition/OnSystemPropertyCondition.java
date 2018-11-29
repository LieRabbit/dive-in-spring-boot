package lierabbit.diveinspringboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * 系统属性条件判断
 *
 * @author xyy
 * @since 2018-11-20 17:13
 */
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(ConditionOnSystemProperty.class.getName());

        String name = String.valueOf(annotationAttributes.get("name"));

        String value = String.valueOf(annotationAttributes.get("value"));

        String systemValue = System.getProperty(name);

        System.out.println(systemValue);

        return value.equals(systemValue);
    }
}
