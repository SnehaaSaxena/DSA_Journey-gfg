class Solution {
    static List<Integer> get(int a, int b) {
        List<Integer> list=new ArrayList<>();
        // 1st WAY
        
        // int temp=a;
        // a=b;
        // b=temp;
        // list.add(a);
        // list.add(b);
        // return list;
        
        // 2nd WAY
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // list.add(a);
        // list.add(b);
        // return list;
        
        
        // 3rd WAY
        a=a^b;
        b=a^b;
        a=a^b;
        list.add(a);
        list.add(b);
        return list;
        
    }
}