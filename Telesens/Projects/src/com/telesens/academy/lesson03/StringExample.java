package com.telesens.academy.lesson03;
//вывести последние 2 цифры, которые в диапазоне между 10 и 15
public class StringExample {
    public static void main(String[] args) {
        String[] tracks ={"track_01", "track_03", "track_21", "track_15", "track_12","track_99", "track_11", "track_10"};

        for(int i = 0; i<tracks.length; i++){
           String lastTwoSymbols = extractLastTwoSymbols(tracks[i]);
           int number = Integer.parseInt(lastTwoSymbols);
           if(number>10 && number < 15)
               System.out.println(number);
        }
       // Ctrl+/ закомментирует целый кусок кодаю И так же - раскомментировать
    }
    private static String extractLastTwoSymbols (String tracks){
        return   tracks.substring (tracks.length()-2);
    }
}