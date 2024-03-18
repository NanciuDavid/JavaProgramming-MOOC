import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messageList = new ArrayList<>();

    public MessagingService() { 
        this.messageList = new ArrayList<Message>();
    }

    public void add(Message message) {
        if(message.getContent().length() <= 280 && messageList.contains(message) == false) { 
            messageList.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.messageList;
    }

}
