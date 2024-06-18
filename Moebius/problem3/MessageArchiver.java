package Moebius.problem3;

import java.util.List;
import java.util.function.Predicate;

/** A given interface to archive select messages (DO NOT CHANGE) **/
interface MessageArchiver {
    void archiveMessages(List<Message> messages, Predicate<Message> filter);
}
