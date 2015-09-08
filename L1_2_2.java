public class L1_2_2 {  
    //递归二分查找的java实现
    public class RecursiveBinarySearch{
        public int recursiveBinarySearch(int[] list, int key){
            int min = 0;
            int max = list.length - 1;
            return recursiveBinarySearch(list, key, min, max);
        }
     
        //Overload recursiveBinarySearch function.
        public int recursiveBinarySearch(int[] list, int key, int min, int max){
            if(min > max) //The list has been exhausted without a match.
                return -min - 1;  
            
            int mid = (min + max) / 2;
            
            if(key < list[mid]){
                return recursiveBinarySearch(list, key, min, mid - 1);
            } else if(key == list[mid]){
                return mid;
            } else {
                return recursiveBinarySearch(list, key, mid + 1, max);
            }
        }
    }
}