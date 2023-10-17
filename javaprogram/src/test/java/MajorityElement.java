import java.util.HashMap;

public class MajorityElement {
    public static int findMajority(int[] arr, int n)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int majorityElement =-1;
        int count=0;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]))
            {
                count = map.get(arr[i])+1;
                map.put(arr[i],count);
            }
            else
            {  map.put(arr[i],1);
            }
            if(map.get(arr[i]) > n/2)
            {
                majorityElement = arr[i];
                System.out.println("Majority Element is - " + arr[i]);
                return arr[i];
            }
        }
        System.out.println("No Majority Element");
        return majorityElement;
    }

    public static void main(String[] args) {
        int a[]= new int[]{4, 2, 4};
        int nums[] = new int[] {3,3,1,1,1,3,3};
        int n = nums.length;
        findMajority(nums, n);
        findMajority(a, a.length);
    }
}
