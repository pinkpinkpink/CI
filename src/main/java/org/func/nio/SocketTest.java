package org.func.nio;

import java.io.IOException;

/**
 * 描述:
 * DNS服务器
 *
 * @author wangyifan
 * @create 2019-04-07 16:40
 */
public class SocketTest {
    public static void main(String[] args) throws IOException{
        Socket socket = null;
        try{
            socket = new Socket("www.csdn.com",80);
            System.out.println(" socket connect successful");

        }catch (IOException e){
            System.out.println("socket connect failure");

            e.printStackTrace();

        }finally {
            socket.close();
        }

    }

}
