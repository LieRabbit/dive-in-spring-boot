package lierabbit.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Java7 计算服务实现
 *
 * @author xyy
 * @see CalculateService
 * @since 2018-11-20 16:27
 */
@Profile("java7")
@Service
public class Java7CalculateService implements CalculateService {
    @Override
    public int sum(int... values) {
        System.out.println("Java7 计算服务实现");
        int sum = 0;

        for (int value : values)
            sum += value;

        return sum;
    }
}
