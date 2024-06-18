package Moebius.problem3;

/** A given class to represent a message  (DO NOT CHANGE) **/
class Message {
    private String subject;
    private String body;

    public Message(String subject, String body) {
        this.subject = subject;
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Message{" +
                "subject: " + Util.abbreviate(subject, 20) +
                ", body: " + Util.abbreviate(body, 40) + "}";
    }
}
