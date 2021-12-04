package self.rpc.demo.server;

import self.rpc.demo.RpcServer;

/**
 * @Author wangfan
 * @Date 2021/12/4
 **/
public class ServerDemo {
    public static void main(String[] args) throws Exception {
        CalculatorService service = new CalculatorServiceImpl();
        RpcServer server = new RpcServer();
        server.export(service, 1234);
    }
}
