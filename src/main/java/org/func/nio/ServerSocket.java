package org.func.nio;

import java.io.IOException;
import java.io.InputStream;

/**
 * 描述:
 * 服务端
 *
 * @author wangyifan
 * @create 2019-04-07 16:21
 */
public class ServerSocket {
    public ServerSocket(int port) {
        return;
    }


    public Socket close() {
        return null;
    }

    public static void main(String[] args) {
        try {
            byte[] byteArray = new byte[1024];
            ServerSocket serverSocket = new ServerSocket(8000);
            // TODO 8088是设置服务器的Socket的端口号，客户端连接到这个端口实现服务端与客户端的通信
            System.out.println("" + System.currentTimeMillis());
            //socket.accept();
            Socket socket = serverSocket.accept();
            //呈阻塞效果
            System.out.println("accept end" + System.currentTimeMillis());
            InputStream inputStream = socket.getInputSteam();
            System.out.println("read begin" + System.currentTimeMillis());
            int readLength = inputStream.read(byteArray);
            // TODO 呈阻塞效果
            inputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Socket accept() {
        return null;
    }

}
