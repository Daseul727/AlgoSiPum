package kds.week1;

public class maxProfit {
    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        max(price);
    }

    public static int max(int[] prices) {
        int max = 0, min = prices[0];

        for(int price : prices) {
            min = Math.min(min, price);
            max = Math.max(max, price - min);
        }
        return max;
    }


}
