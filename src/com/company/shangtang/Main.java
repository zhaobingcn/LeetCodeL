package com.company.shangtang;
import java.util.*;

/**
 * Created by zhzy on 2017/10/12.
 */


    public class Main {

        private static double[][] DATA;
        public static int k;//k个中心点
        public static int[] memberShip;
        public static int[] centersIndex;
        public static double[][] centers;
        public static int[] elementsInCenters;


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            k = scanner.nextInt();
            DATA = new double[5][2];
            for(int i=0; i<5; i++){
                for(int j=0; j<2; j++){
                    DATA[i][j] = scanner.nextDouble();
                }

            }




            Main kmeans = new Main(k);
            String lastMembership = "";
            String nowMembership = "";
            int i=0;
            while(true){
                i++;
                kmeans.randomCenters();
//                System.out.println("随机选中的中心index为："+Arrays.toString(kmeans.centersIndex));
                kmeans.calMemberShip();
                nowMembership = Arrays.toString(kmeans.memberShip);
//                System.out.println("DATA聚类之后Membership为："+nowMembership);
//                System.out.println("Elements in centers cnt:"+Arrays.toString(kmeans.elementsInCenters));
                if(nowMembership.equals(lastMembership)){
//                    System.out.println("本次聚类与上次相同，退出执行！");
//                    System.out.println("一共聚类了 "+i+" 次！");
                    kmeans.calNewCenters();

                    double [][]res = kmeans.centers;
                    for(int k=0; k<res.length; k++){

                        for(int j=0; j<res[0].length; j++){
//                            res[k][j] = Math.floor(res[k][j]);
                            System.out.printf("%.5f ", res[k][j]);
                        }
                        System.out.println();
                    }
//                    System.out.println("新中心点为："+Arrays.deepToString(kmeans.centers));
                    double totalDistance = kmeans.computeTotalDistance();
//                    System.out.println("totalDistance ： "+totalDistance);
                    break;
                }else{
                    lastMembership = nowMembership;
                }
//                System.out.println("----------------华丽的分割线----------------");
            }
        }

        public Main(int k){
            this.k = k;
        }


        public double manhattanDistince(double []paraFirstData,double []paraSecondData){
            double tempDistince = 0;
            if((paraFirstData!=null && paraSecondData!=null) && paraFirstData.length==paraSecondData.length){
                for(int i=0;i<paraFirstData.length;i++){
                    tempDistince += Math.abs(paraFirstData[i] - paraSecondData[i]);
                }
            }else{
                System.out.println("firstData 与 secondData 数据结构不一致");
            }
            return tempDistince;
        }

        public void randomCenters(){
            centersIndex = new int[k];
            Random random = new Random();
            Map map = new HashMap();
            for(int i=0;i<k;i++){
                int index = Math.abs(random.nextInt())%DATA.length;
                if(map.containsKey(index)){
                    i--;
                }else{
                    //将中心点的下标存到MAP中，保证下次选出的中心点不是同一个
                    map.put(index, DATA[index]);
                    //将中心点的下标存入centers[]中
                    centersIndex[i] = index;
                }
            }
        }

        public void calMemberShip(){
            memberShip = new int[DATA.length];
            elementsInCenters = new int[k];
            for(int j=0;j<DATA.length;j++){
                double currentDistance = Double.MAX_VALUE;
                int currentIndex = -1;
                double[] item = DATA[j];
                for(int i=0;i<k;i++){
                    //中心点
                    double[] tempCentersValue = DATA[centersIndex[i]];
                    double distance = this.manhattanDistince(item, tempCentersValue);
                    if(distance<currentDistance){
                        currentDistance = distance;
                        currentIndex = i;
                    }
                }
                memberShip[j] = currentIndex;
            }

            for(int i=0;i<memberShip.length;i++){
                elementsInCenters[memberShip[i]]++;
            }
        }

        public void calNewCenters(){
            centers = new double[k][DATA[0].length];
            for(int i=0;i<memberShip.length;i++){
                for(int j=0;j<DATA[0].length;j++){
                    centers[memberShip[i]][j] += DATA[i][j];
                }
            }

            for(int i=0;i<centers.length;i++){
                for(int j=0;j<DATA[0].length;j++){
                    centers[i][j] /= elementsInCenters[i];
                    centers[i][j] = Math.floor(centers[i][j] + 0.5);
                }
            }
        }

        public double computeTotalDistance() {
            double tempTotal = 0;
            for (int i = 0; i < DATA.length; i ++) {
                tempTotal += manhattanDistince(DATA[i], centers[memberShip[i]]);
            }
            return tempTotal;
        }
    }
