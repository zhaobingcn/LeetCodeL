package com.company.toutiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zhzy on 2017/4/18.
 */
public class problem3 {


    String[][] number0 = {{"*", "*", "*"}, {"*", " ", "*"}, {"*", "*", "*"}, {"*", " ", "*"}, {"*","*","*"}};
    String[][] number1 = {{"*"}, {"*"},{"*"},{"*"},{"*"}};
    String[][] number2 = {{"*","*", "*"}, {" ", " ", "*"}, {"*", "*", "*"}, {"*", " ", " "}, {"*", "*", "*"}};
    String[][] number3 = {{"*","*", "*"}, {" ", " ", "*"}, {"*", "*", "*"}, {" ", " ", "*"}, {"*", "*", "*"}};
    String[][] number4 = {{"*", " ", "*"}, {"*", " ", "*"}, {"*", "*", "*"}, {" ", " ", "*"}, {" ", " ", "*"}};
    String[][] number5 = {{"*", "*", "*"}, {"*", " ", " "}, {"*", "*", "*"}, {" ", " ", "*"}, {"*", "*", "*"}};
    String[][] number6 = {{"*", "*", "*"}, {"*", " ", " "}, {"*", "*", "*"}, {"*", " ", "*"}, {"*", "*", "*"}};
    String[][] number7 = {{"*", "*", "*"}, {" ", " ", "*"}, {" ", " ", "*"}, {" ", " ", "*"}, {" ", " ", "*"}};
    String[][] number8 = {{"*", "*", "*"}, {"*", " ", "*"}, {"*", "*", "*"}, {"*", " ", "*"}, {"*", "*", "*"}};
    String[][] number9 = {{"*", "*", "*"}, {"*", " ", "*"}, {"*", "*", "*"}, {" ", " ", "*"}, {"*", "*", "*"}};

    String[][] jia = {{" ", "*", " "}, {" ", " ", " "}, {"*", "*", "*"}, {" ", " ", " "}, {" ", "*", " "}};
    String[][] jian = {{" ", " ", " "}, {" ", " ", " "}, {"*", "*", "*"}, {" ", " ", " "}, {" ", " ", " "}};
    String[][] cheng = {{"*", " ", "*"}, {" ", " ", " "}, {" ", "*", " "}, {" ", " ", " "}, {"*", " ", "*"}};
    String[][] chu = {{" ", " ", "*"}, {" ", " ", " "}, {" ", "*", " "}, {" ", " ", " "}, {"*", " ", " "}};
    String[][] dengyu = {{" "," ", " ", " "}, {"*", "*", "*", "*"}, {" "," ", " ", " "}, {"*", "*", "*", "*"},{" ", " ", " ", " "}};

    String[][] point = {{" ", " "}, {" ", " "}, {" ", " "}, {"*", "*"}, {"*", "*"}};

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        List<String> stringList = new ArrayList<>();

        while (scanner.hasNext()){
            stringList.add(scanner.next());
        }

        ArrayList<String[][]> result = new ArrayList<>();

//        result.add(number0);
//        result.add(number3);

        for(int i=0; i<5; i++){

            for(String[][] array: result){
                for(int j=0; j<array[0].length; j++){
                    System.out.print(array[i][j]);
                }
                System.out.print("  ");
            }
            System.out.println();
        }

    }
    public String[][] aNum(char chr){
        String[][] num = {{},{}};
        switch (chr){
            case '0': num = number0; break;
            case '1': num = number1; break;
            case '2': num = number2; break;
            case '3': num = number3; break;
            case '4': num = number4; break;
            case '5': num = number5; break;
            case '6': num = number6; break;
            case '7': num = number7; break;
            case '8': num = number8; break;
            case '9': num = number9; break;
            case '+': num = jia; break;
            case '-': num = jian; break;
            case '*': num = cheng; break;
            case '/': num = chu; break;

        }
        return num;
    }
}
