package be.tiemenvermote.projecteuler002;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public Calculator(int limit) {
        getFibonnaci(limit);
    }
    private void getFibonnaci(int limit) {
        List<Integer> list = new ArrayList<>();
        int x;
        int y=1;
        for (int z=2;z<limit;z=x+y) {
            x = y;
            y = z;
            list.add(z);
        }
        getEven(list);
    }
    private void getEven(List list) {
        List<Integer> evenList = new ArrayList<>();
        for (int i=0;i<list.size();i++) {
            int check = (Integer)list.get(i);
            if (check%2==0) {
                evenList.add(check);
            }
        }
        getSum(evenList);
    }
    public int getSum(List list) {
        int sum = 0;
        for (int i = 0;i<list.size();i++){

            sum += (Integer)list.get(i);
        }
        System.out.println("The found sum is: ");
        return sum;
    }
}
