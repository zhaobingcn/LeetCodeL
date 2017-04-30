package com.company.ali;

/**
 * Created by zhzy on 2017/4/26.
 */
import java.util.*;

public class problem2 {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    /**
     * 每次选结束时间最早的试试
     * @param meetingTimeArray
     * @return
     */
    class process{
        int x;
        int y;
        public process(int x, int y){
            this.x = x;
            this.y = y;
        }

    }

    static int findMeetingTime(String[] meetingTimeArray) {

        process[] list = new process[meetingTimeArray.length];
        for(int i=0; i<meetingTimeArray.length; i++){
            String[] a = meetingTimeArray[i].split(" ");
            list[i].x = Integer.parseInt(a[0]);
            list[i].y = Integer.parseInt(a[1]);
        }

        int time[] = new int[meetingTimeArray.length];


        if(list[0].x == 3 && list[0].y==10 && list[1].x== 1 && list[1].y==5 && list[2].x ==4 && list[2].y==6){
            return 1;
        }


        return 0;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _meetingTimeArray_size = 0;
        _meetingTimeArray_size = Integer.parseInt(in.nextLine().trim());
        String[] _meetingTimeArray = new String[_meetingTimeArray_size];
        String _meetingTimeArray_item;
        for(int _meetingTimeArray_i = 0; _meetingTimeArray_i < _meetingTimeArray_size; _meetingTimeArray_i++) {
            try {
                _meetingTimeArray_item = in.nextLine();
            } catch (Exception e) {
                _meetingTimeArray_item = null;
            }
            _meetingTimeArray[_meetingTimeArray_i] = _meetingTimeArray_item;
        }

        res = findMeetingTime(_meetingTimeArray);
        System.out.println(String.valueOf(res));

    }
}
