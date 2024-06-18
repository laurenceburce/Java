package Moebius.problem6;

import java.util.Base64;

public class test {
    public static void main(String[] args) {
        String key = "MOEBIUS";
        String encryptedMessage = "DiArJTs0JzgjJDYgOj0+Y2U7JiBzPiApNCwxczknIGIrOj04PGUzPDAgOSYqLGhfWW1vZWJpdXNtb2ViaXVzbW9lYml1c21vZWJpdXNtb2ViaXVzY2hibEN1c21vZWJpe3RqYWViaXVzbWFlYml1c21vZWhucnltb2VicwoPYhB/Yml1c21hT2JpdXNtb38dFXoMd29lYhYJe2IQZWJnb31nEBltFn9zbW9/YmYJc3dvZWxue2ljaGtIaXV9amhreGl6D211ZWJpe3xkE2ViaXJpamVlbRV1eW11ZWJue31qYWViZGhpInV4b0N1aRITah1zcn13dX9saXVzbWhlaG5yeW1vZWJjdXRjaGpsbnUMEWdqHW57dHdoa2VDdWltYBlic3Vpd3V/eGl1c21vbx0Vegxnb2ViaXV+cG8qYnR4c21gbB5pdXNtaE9iaXJ9Y2hlYm5vaXdoZWJpdXNnb2oeaX9zbW9lYmdyfGNoa2JpdXRHb2ViaXVzbW9lYml1c21vZWJpdXljYW9iaXVzbW9lYmlvWQ==";
        
        // Decode the Base64 encoded message
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedMessage);
        
        // Decrypt the message
        byte[] decryptedBytes = new byte[decodedBytes.length];
        int keyLength = key.getBytes().length;
        
        // Iterate through each byte of the encrypted message
        for (int i = 0; i < decodedBytes.length; i++) {
            // Apply XOR operation between encrypted byte and corresponding key byte
            // Then store the result in the decrypted byte array
            decryptedBytes[i] = (byte)(decodedBytes[i] ^ key.getBytes()[i % keyLength]);
        }
        
        // Display the decrypted message
        String decryptedMessage = new String(decryptedBytes);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }
}