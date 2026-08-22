class Solution {
    public void sortColors(int[] arr) {
        int z=0;
        int one=0;
        int two=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0)
            z++;
            else if(arr[i]==1)
             one++;
             else
             two++; 
        }
         for( int i=0; i<z; i++){
            arr[i]=0;

    }
    for(int i=z; i<z+one; i++){
            arr[i]=1;

    }
    for(int i=z+one; i<z+one+two; i++){
            arr[i]=2;

    }

}}