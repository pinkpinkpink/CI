package org.func.nio;

import java.io.IOException;
import java.net.UnknownHostException;

/**
 * 描述:
 *
 * @author wangyifan
 * @create 2019-04-07 16:31
 */
public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("Client连接准备=" + System.currentTimeMillis());
            Socket socket = new Socket("localhost", 8088);
            // 服务器的地址和端口，将这两个参数传递给Socket类后，客户端确定了服务器的地址和端口号，然后客户端Scoket可以连接服务器端了
            System.out.println("Client连接结束=" + System.currentTimeMillis());
            Thread.sleep(Integer.MAX_VALUE);
            socket.close();


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
