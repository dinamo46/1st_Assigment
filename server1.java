import java.io.*;
import java.net.*;

class TCPServer {
 public static void main(String argv[]) throws Exception {
  String clientSentence,replySentence,justifySentence;
  String reply,answer;
  ServerSocket welcomeSocket = new ServerSocket(47974);

reply = "Waalaikumusalam";
answer = "Are u Muslim?";

  while (true) {
   Socket connectionSocket = welcomeSocket.accept();
   BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
   DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
   clientSentence = inFromClient.readLine();
   System.out.println("Received: " + clientSentence);
  if (clientSentence.equalsIgnoreCase("Assalamualaikum"))
{
replySentence = reply;
outToClient.writeBytes(reply));
}

else
{
justifySentence = answer;
outToClient.writeBytes(answer));
}

  }
 }
}