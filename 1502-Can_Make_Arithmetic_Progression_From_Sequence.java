class Solution {
    //with sorting
    // public boolean canMakeArithmeticProgression(int[] arr) {
    //     Arrays.sort(arr);
    //     for(int i = 0 ; i< arr.length - 2; i++){
    //         if((arr[i+1] - arr[i])!=(arr[i+2] - arr[i+1]))
    //             return false;
    //     }
    //     return true;
    // }
    //without sorting --> ap: An = A + (n-1)d
                            // d = An - A / n - 1;
    public boolean canMakeArithmeticProgression(int[] arr) {
        int len = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int d = ((max - min)+(len-1)-1)/(len - 1);
        Set<Integer> s = new HashSet<>();
        for(int i : arr){
            s.add(i);
        }
        for(int i = 0 ; i < len ; i++){
            int expected = min + (i * d);
            // boolean found = false;
            if(!s.contains(expected))
                return false;
        }
        return true;
    }
}