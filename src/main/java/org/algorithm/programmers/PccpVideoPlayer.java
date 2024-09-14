package org.algorithm.programmers;

import java.time.Duration;

public class PccpVideoPlayer {
    /*
        프로그래머스 [PCCP 기출문제] 1. / 동영상 재생기
     */
    public static void main(String args[]) {
        String video_len = "07:22";
        String pos = "04:05";
        String op_start= "00:15";
        String op_end= "04:07";
        String[] commands = new String[] {"next"};


        System.out.println(solution(video_len, pos, op_start, op_end, commands));
    }

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        Duration videoLength = parseDuration(video_len);
        Duration openingStartTime = parseDuration(op_start);
        Duration openingEndTime = parseDuration(op_end);

        Duration time = parseDuration(pos);
        if(isBetween(time, openingStartTime, openingEndTime)) time = openingEndTime;


        for(String command : commands) {
            switch (command) {
                case "prev" -> {
                    time = time.minusSeconds(10);
                    if(time.isNegative()) time = Duration.ZERO;
                    if(isBetween(time, openingStartTime, openingEndTime)) {
                        time = openingStartTime;
                    }
                }
                case "next" -> {
                    time = time.plusSeconds(10);
                    if(time.compareTo(videoLength) > 0) time = videoLength;
                    if(isBetween(time, openingStartTime, openingEndTime)) {
                        time = openingEndTime;
                    }
                }
            }

        }

        long minutes = time.toMinutes();
        long seconds = time.minusMinutes(minutes).toSeconds();
        return String.format("%02d:%02d", minutes, seconds);
    }

    public static Duration parseDuration(String time) {
        String[] times = time.split(":");

        return Duration.ofMinutes(Integer.parseInt(times[0])).plusSeconds(Integer.parseInt(times[1]));
    }

    public static Boolean isBetween(Duration time, Duration openingStartTime, Duration openingEndTime) {
        int s = time.compareTo(openingStartTime);
        int e = time.compareTo(openingEndTime);
        return s >= 0 && e <= 0;
    }

}
