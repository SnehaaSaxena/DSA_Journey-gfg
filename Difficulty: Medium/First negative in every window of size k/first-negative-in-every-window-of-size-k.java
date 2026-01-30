class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // Brute Force
        // ArrayList<Integer> list=new ArrayList<>();
        // boolean check=false;
        // for(int i=0;i<arr.length-k+1;i++){
        //     for(int j=0;j<k;j++){
        //         if(arr[i+j]<0){
        //           list.add(arr[i+j]);
        //           check= true;
        //           break;
        //         } 
        //     }
        //     if(check==false) list.add(0);
        //     check=false;
        // }
        // return list;
        
        
        // Better approach
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        int i=0;
        while(i<k){
            if(arr[i]<0)
            queue.add(arr[i]);
            i++;
        }
        if(queue.isEmpty()) list.add(0);
        else list.add(queue.peek());
        i=1;
        while(i<arr.length-k+1){
            if(arr[i-1]<0)  queue.remove();
            if(arr[i+k-1]<0) queue.add(arr[i+k-1]);
            if (queue.isEmpty()) list.add(0);
            else list.add(queue.peek());
            i++;
        }
        return list;
    }
}