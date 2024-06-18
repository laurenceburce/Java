package Moebius.problem3;

import java.util.List;
import java.util.function.Predicate;

/** Noop implementation of a message archiver (DO NOT CHANGE) **/
class TestArchiver implements MessageArchiver {
    static int count = 0;
    long bytes = 0;
    static long archived = 0;
    @Override
    public void archiveMessages(List<Message> messages, Predicate<Message> filter) {
        if(messages.size() < 1000) {
            System.err.println("WARNING: message list too short, this will drastically reduce performance!");
        }
        messages.stream().filter(filter).forEach(this::archiveOne);
        System.out.println("Archived: " + bytes + " bytes.");
        count += messages.size();
        bytes = 0;
    }
    
    private void archiveOne(Message msg) {
        bytes += msg.getSubject().getBytes().length + 1;
        bytes += msg.getBody().getBytes().length;
        archived++;
    }
}
