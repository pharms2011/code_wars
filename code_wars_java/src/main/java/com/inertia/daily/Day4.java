package com.inertia.daily;

public class Day4 {
    public static String longToIP(long ip) {
        // Java doesn't have uint32, so here we use long to represent int32
        // First convert it to a binary String
        String binary = "";
        binary = Long.toBinaryString(ip);
        while (binary.length() < 32) {
            binary = "0" + binary;
        }
        String segmentOneBin = binary.substring(0, 8);
        String segmentTwoBin = binary.substring(9, 16);
        String segmentThreeBin = binary.substring(17, 24);
        String segmentFourBin = binary.substring(25, 32);
        return binToDec(segmentOneBin) + "." + binToDec(segmentTwoBin) + "." + binToDec(segmentThreeBin) + "." + binToDec(segmentFourBin); // do it!
    }

    public static String binToDec(String dec) {
        double sum = 0;
        for (int i = 0; i < dec.length(); i++) {
            switch (dec.charAt(i)) {
                case ('0'):
                    break;
                case ('1'):
                    sum = sum + Math.pow(2, ((dec.length() - 1) - i));
                    break;
            }
        }

        return Double.valueOf(sum).intValue() + "";
    }
}
