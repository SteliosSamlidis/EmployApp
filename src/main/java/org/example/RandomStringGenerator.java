package org.example;

import java.util.UUID;

public class RandomStringGenerator {

    public static String generateRandomString(int length) {
        // Generate a UUID and remove hyphens
        String uuid = UUID.randomUUID().toString().replace("-", "");

        // Return the substring of the specified length
        return uuid.substring(0, Math.min(length, uuid.length()));
    }

    public static void main(String[] args) {
        // Example usage
        int length = 10; // Specify the length of the random string
        String randomString = generateRandomString(length);
        System.out.println("Random String: " + randomString);
    }
}
