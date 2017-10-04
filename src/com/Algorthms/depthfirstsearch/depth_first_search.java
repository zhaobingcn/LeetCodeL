package com.Algorthms.depthfirstsearch;

import java.util.*;

/**
 * Created by zhzy on 2017/10/3.
 */
public class depth_first_search {
    public static void main(String[] args) {
        Employee a = new Employee(1,2, Arrays.asList(2));
        Employee b = new Employee(2,3, Arrays.asList());

        List<Employee> c = new ArrayList<>();
        c.add(a);
        c.add(b);
        System.out.println(getImportance(c, 2));

    }

    public static int getImportance(List<Employee> employees, int id) {

        HashMap<Integer, Employee> map = new HashMap<>();
        for(Employee e: employees){
            map.put(e.id, e);
        }

        Queue<Employee> queue = new LinkedList<>();
        queue.add(map.get(id));
        int result = 0;
        while(!queue.isEmpty()){
            Employee e = queue.poll();
            result += e.importance;
            if(e.subordinates.size() != 0){
                List<Integer> list = e.subordinates;
                for(Integer i: list){
                    Employee ae = map.get(i);
                    queue.add(ae);
                }
            }
        }
        return result;
    }
    static class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;

        public Employee(int id, int importance, List<Integer> subordinates){
            this.id = id;
            this.importance = importance;
            this.subordinates = subordinates;
        }
    }
}
