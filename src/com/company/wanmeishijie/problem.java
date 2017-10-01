package com.company.wanmeishijie;

import com.sun.javafx.tools.packager.PackagerException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by zhzy on 2017/9/26.
 */
public class problem {

    public static void main(String[] args) throws ParseException{

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        Date d1 = sdf.parse(s1);
        Date d2 = sdf.parse(s2);

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.setTime(d1);
        calendar2.setTime(d2);

        int w1 = calendar1.get(Calendar.DAY_OF_WEEK) - 1;
        int w2 = calendar2.get(Calendar.DAY_OF_WEEK) - 1;

        int offeset = 4-w1;

        int betweens = daysBetween(d1, d2);

        int aa = betweens - offeset;

        int res2 = (aa-1) / 7;

        System.out.println(betweens-1 +","+ res2);


    }
    public static int daysBetween(Date smdate,Date bdate) throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        smdate=sdf.parse(sdf.format(smdate));
        bdate=sdf.parse(sdf.format(bdate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days=(time2-time1)/(1000*3600*24);

        return Integer.parseInt(String.valueOf(between_days));
    }


}
