package com.academy.lesson03;

public class TrackExc {
    public static void main(String[]args){

        String[] tracks={"track_01", "track_03", "track_21", "track_15", "track_12","track_99", "track_11", "track_10"};
    // 1 способ перебрать
//        for (String track : tracks) {
//            System.out.println(track);
//        }

    // 2 способ перебрать
        for (int i = 0; i < tracks.length; i++) {
        String lastTwoSymbols = extractLastTwoSymbols(tracks[i]);
        int number = Integer.parseInt(lastTwoSymbols);
        if (number >= 10 && number <= 15)
            System.out.println(tracks[i]);
    }
}

    private static String extractLastTwoSymbols(String track) {
//        return track.substring(6, 8);
//        return track.substring(track.length()-2, track.length());
        return track.substring(track.length()-2);
    }
}
