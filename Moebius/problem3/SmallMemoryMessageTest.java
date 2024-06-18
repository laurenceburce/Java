package Moebius.problem3;

import java.util.ArrayList;
import java.util.List;

// 16050775 bytes

/**
 * The following mock program passes on our development machines,
 * but the client reports that it fails on their 64MB VM.
 *
 * 1. Run on a 64M VM and copy the failing stack trace
 * 2. Modify main() to work on a 64MB VM.
 * 3. Ensure at most one performance warning.
 *
 * (To set 64Mb VM) run using java -Xmx64M SmallMemoryMessageTest
 */

/**
 * Test class that works on developer boxes but fails on small VMs.
 *
 * Fix this class to work on 64Mb VM
 */
public class SmallMemoryMessageTest {

    public static void main(String []args) {
        MessageProcessor processor = Util.createMessageProcessor();
        MessageArchiver archiver = Util.createMessageArchiver();
        
        // Define the batch size
        final int BATCH_SIZE = 1000;
        //about 160mb

        // Outer loop continues as long as the total number of messages
        // processed (x) is less than the expected total number of messages
        for (int x = 0; x < Util.EXPECTED_TOTAL; x += BATCH_SIZE) {
            List<Message> messages = new ArrayList<>();

            // Inner loop continues as long as we haven't processed the entire 
            // batch (x < BATCH_SIZE) and the total number of messages processed (x + y) 
            // is less than the expected total number of messages
            for (int y = 0; y < BATCH_SIZE && x + y < Util.EXPECTED_TOTAL; y++) {
                Message msg = Util.random();
                processor.processMessage(msg);
                messages.add(msg);
            }
            archiver.archiveMessages(messages, m -> m.getSubject().startsWith("A"));
        } 

        /*
         *  DO NOT CHANGE ANYTHING BELOW THIS LINE.
         *  PROGRAM MUST EXIT SUCCESSFULLY
         */
        Util.validate();
    }
}




