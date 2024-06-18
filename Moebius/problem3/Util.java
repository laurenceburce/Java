package Moebius.problem3;

import java.util.Random;

/** A given utility class (DO NOT CHANGE) **/
class Util {
    static final int EXPECTED_TOTAL = 98765;
    static final int EXPECTED_ARCHIVED = 3799;

    static Message random() {
        String subject = randomSubject();
        String body = randomBody();
        Message m = new Message(subject, body);
        return m;
    }

    static int count = 0;

    static String randomSubject() {
        StringBuilder sb = new StringBuilder(128);
        sb.append((char) ((int) 'A' + (count++ % 26)));
        Random r = new Random();
        while (sb.length() < 128) {
            char c = (char) r.nextInt(127);
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    static String randomBody() {
        StringBuilder sb = new StringBuilder(4096);
        Random r = new Random();
        while (sb.length() < 4096) {
            char c = (char) r.nextInt(127);
            if (!Character.isISOControl(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    static String abbreviate(String s, int n) {
        return s.length() > n + 3 ? s.substring(0, n - 3) + "..." : s;
    }

    static MessageProcessor createMessageProcessor() {
        return new TestProcessor();
    }

    static MessageArchiver createMessageArchiver() {
        return new TestArchiver();
    }

    static void validate() {
        if (TestArchiver.count != EXPECTED_TOTAL ||
                TestArchiver.archived != EXPECTED_ARCHIVED) {
            throw new IllegalStateException("Failed to archive all messages!");
        }
        System.out.println("SUCCESS. PROCESSED: " + TestArchiver.count + " ARCHIVED: " + TestArchiver.archived);
    }
}
