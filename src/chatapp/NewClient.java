
package chatapp;

import java.io.IOException;
import java.net.UnknownHostException;

public class NewClient {
    public static void main(String[] args) throws UnknownHostException, IOException{
        new Client("127.0.0.1", 12345).run();
    }
}