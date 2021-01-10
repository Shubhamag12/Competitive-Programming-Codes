// https://leetcode.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/

class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        int a = 1;
        int b = 1;
        int c = a + b;
        while(c <= k){
            list.add(c);
            a = b;
            b = c;
            c = a + b;
        }
        // for(int i = 0; i < list.size(); i++){
        //     System.out.print(" " + list.get(i));
        // }
        int count = 0;
        for(int i = list.size() - 1; i >= 0; i--){
            if(k >= list.get(i) && k - list.get(i) >= 0){
                k = k - list.get(i);
                // System.out.println(list.get(i));
                count++;
            }
        }
        return count;
    }
}
