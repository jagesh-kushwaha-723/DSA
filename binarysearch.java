static int binarysearch(int[] arr,int target){
        int start=0,end=arr.length-1;
        while(end>=start){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
            start=mid+1;

            }
            else if(target < arr[mid]){

                end=mid-1;

            }
            else{
                return mid;
            }
        }
        return -1;
    }
