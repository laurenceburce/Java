package Moebius.problem3;

/** Noop implementation of a message processor (DO NOT CHANGE) **/
class TestProcessor implements MessageProcessor {
    long count = 0;
    @Override
    public void processMessage(Message msg) {
        if(++count%1000 == 0) {
            System.out.println("Processed: " + (count) + " Latest: " + msg);
            System.out.flush();
        }
    }
}
