package self.rpc.demo.server;

/**
 * @Author wangfan
 * @Date 2021/12/4
 **/
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
