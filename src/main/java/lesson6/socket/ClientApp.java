package lesson6.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try(Socket socket = new Socket("localhost",1234)){
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            while (true){
                System.out.println("Введите сообщение для отправки на сервер");
                String message = scanner.nextLine();
                if (message.equals("end")) break;
                dataOutputStream.writeUTF(message);
                System.out.println(dataInputStream.readUTF());

            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
