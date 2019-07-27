package cz.cellar.beans;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven
public class MyMessageDrivenBean implements MessageListener {
    @Override
    public void onMessage(Message message) {
        TextMessage tm = (TextMessage)message;
        try{
            System.out.println(tm);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
