package cgl.pviz.rpc;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class GoogleActiveMQSender {
	
	Session session;
	Connection connection;
	MessageProducer producer;
	Message.PvizMessage.Builder build;
	public GoogleActiveMQSender(String ipAddress) {
		try {
            // Create a ConnectionFactory
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://" + ipAddress+":61616");

            // Create a Connection
            connection = connectionFactory.createConnection();
            connection.start();

            // Create a Session
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            // Create the destination (Topic or Queue)
            Destination destination = session.createTopic("topic2");
            // Create a MessageProducer from the Session to the Topic or Queue
            producer = session.createProducer(destination);
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            
        }
        catch (Exception e) {
            System.out.println("Caught: " + e);
            e.printStackTrace();
        }
	}
	public void prepareMessage() {
		build = Message.PvizMessage.newBuilder();
        build.setStepid(3);
        build.setTimestamp(System.currentTimeMillis());
        build.setType(Message.PvizMessage.mtype.DATA);
	}
	public void setPosition(int label, double x, double y, double z) {
		build.addLabels(label);
		build.addPositions(Message.Position.newBuilder().setX(x).setY(y).setZ(z));
	}
	public void sendMessage() {
		Message.PvizMessage m;
		try {
			
	         m = build.build();
	         BytesMessage message = session.createBytesMessage();
	         message.writeBytes(m.toByteArray());
	         producer.send(message);
		}
        catch (Exception e) {
             System.out.println("Caught: " + e);
             e.printStackTrace();
         }
	}
	public void close() {
		try {
			session.close();
            connection.close();
        }
        catch (Exception e) {
            System.out.println("Caught: " + e);
            e.printStackTrace();
        }
	}
    private boolean run = true;
 
    public void stop() {
        run = false;
    }

    public void run() {
        try {
            // Create a ConnectionFactory
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://149.165.159.16:61616");

            // Create a Connection
            Connection connection = connectionFactory.createConnection();
            connection.start();

            // Create a Session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            // Create the destination (Topic or Queue)
            Destination destination = session.createTopic("topic2");
            // Create a MessageProducer from the Session to the Topic or Queue
            MessageProducer producer = session.createProducer(destination);
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

            // Create a messages

            while (run) {


                Message.PvizMessage m;
                Message.PvizMessage.Builder build = Message.PvizMessage.newBuilder();
                build.setStepid(3);
                build.setTimestamp(System.currentTimeMillis());
                build.setType(Message.PvizMessage.mtype.DATA);

                for (int i = 0; i < 100; i++) {
                    build.addLabels(i);
                    double x = Math.random() * 100;
                    double y = Math.random() * 100;
                    double z = Math.random() * 100;
                    build.addPositions(Message.Position.newBuilder().setX(x).setY(y).setZ(z));
                }
                m = build.build();
                BytesMessage message = session.createBytesMessage();
                message.writeBytes(m.toByteArray());
                producer.send(message);
            }
            // Clean up
            session.close();
            connection.close();
        }
        catch (Exception e) {
            System.out.println("Caught: " + e);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        GoogleActiveMQSender sender = new GoogleActiveMQSender("149.165.159.16");
        sender.run();
    }
}