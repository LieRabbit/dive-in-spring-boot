package lierabbit.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

/**
 * Java8 计算服务实现
 *
 * @author xyy
 * @see CalculateService
 * @since 2018-11-20 16:27
 */
@Profile("java8")
@Service
public class Java8CalculateService implements CalculateService {
    @Override
    public int sum(int... values) {
        System.out.println("Java8 计算服务实现");

        return IntStream.of(values).sum();
    }
}
