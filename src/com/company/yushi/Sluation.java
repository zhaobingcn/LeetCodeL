package com.company.yushi;


/**
 * Created by zhzy on 2017/9/28.
 */
public class Sluation {

    public static void main(String[] args) {

        Sluation sluation = new Sluation();

        String test = "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";

        String s = sluation.solution(test);
        System.out.println(s);

    }

    public String solution(String S) {
        String music[] = {"mp3","aac", "flac"};
        String image[] = {"jpg","bmp","gif"};
        String movie[] = {"mp4","avi","mkv"};


        String[] cata = {"music", "images", "movies", "other"};

        long sum[] = new long[4];

        StringBuffer sb = new StringBuffer();

        for(String s: S.split("\n")){
            String[] line = s.split(" ");
            if(isLegal(line[0])){
                String numS = line[1].replace("b", "");
                int start = line[0].lastIndexOf('.' )+1;
                String key = line[0].substring(start);
//                System.out.println(key);
                int num = Integer.valueOf(numS);
                sum[catagory(key, music, image, movie)] += num;
            }
        }

        for(int i=0; i<3; i++){
            sb.append(cata[i] + " " + sum[i] + "b" + "\n");
        }
        sb.append(cata[3] + " " + sum[3] + "b");
        return sb.toString();
    }

    boolean isLegal(String s){
        if(s.length() > 30){
            return false;
        }
//        System.out.println(s);

        String[] ss =s.split("\\.");

//        System.out.println(ss[0]);
        for(int i=1; i<ss.length; i++){
            for(int j=0; j<ss[i].length(); j++){
                char ch = ss[i].charAt(j);
                if(!((ch >= 'a' && ch <= 'z') || (ch>='0' && ch<='9'))){
                    return false;
                }
            }
        }

        for(int i=0; i<ss[0].length(); i++){
            char ch = ss[0].charAt(i);

            if(!((ch >= 'a' && ch <='z') || (ch>='A' && ch <='Z') || (ch>='0' && ch <='9') || contains(ch))) {
                return false;
            }
        }

        return true;
    }

    int catagory(String key, String[] music, String[] image, String[] movie){

        for(String s:music){
            if(s.equals(key)){
                return 0;
            }
        }
        for (String s:image){
            if(s.equals(key)){
                return 1;
            }
        }
        for (String s: movie){
            if(s.equals(key)){
                return 2;
            }
        }
        return 3;
    }

    boolean contains(char a){
        char[] s = {'^', '&', '\'','@','{','}','[',']',',','$'
        ,'=','!','-','#','(',')','%','.','+','~','_'
        };

        for(int i=0; i<s.length; i++){
            if(a == s[i]){
                return true;
            }
        }
        return false;
    }
}

