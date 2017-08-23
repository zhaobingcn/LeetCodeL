package com.company.golden;

/**
 * Created by zhzy on 2017/8/20.
 */
public class BinDecimal {

    public static void main(String[] args) {
        BinDecimal a = new BinDecimal();
        System.out.println(a.printBin(0.625));
    }

    public String printBin(double num) {

        StringBuffer result = new StringBuffer("0.");

        int i=1;
        for(; i<32; i++){
            if (num < Math.pow(2 , -32)){
                break;
            }
            if(num >= Math.pow(2, -i)){
                num = num - Math.pow(2, -i);
                result.append("1");
            }else {
                result.append("0");
            }
        }
        if(i == 32){
            return "Error";
        }
        return result.toString();
    }

}
