package lierabbit.diveinspringboot.annotation;

import lierabbit.diveinspringboot.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * HelloWorld实现选择器
 *
 * @author xyy
 * @see EnableHelloWorld
 * @since 2018-11-20 16:00
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("i am HelloWorldImportSelector");
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
