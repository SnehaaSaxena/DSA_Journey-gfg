class Solution {
    public int romanToDecimal(String s) {
        char roman[]={'M','D','C','L','X','V','I'};
        String integrals[]={"1000","500","100","50","10","5","1"};
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int j=0;
            while(ch!=roman[j]) j++;
            arr[i]=Integer.parseInt(integrals[j]);
         }
        int res=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1])
              res-=arr[i];
            else
              res+=arr[i];
        }
        return res;
    }
}