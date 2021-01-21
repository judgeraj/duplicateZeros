class Solution {
    public void duplicateZeros(int[] arr) {
        int dupZeros = 0;
        int length = arr.length - 1;
        
        for(int i = 0; i <= length - dupZeros; i++) {
            if(arr[i] == 0) {
                if(i == length - dupZeros) {
                    arr[length] = 0;
                    length--;
                    break;
                }
                dupZeros++;
            }
        }
        
        for(int i = (length - dupZeros); i >= 0; i--) {
            if(arr[i] == 0) {
                arr[i + dupZeros] = 0;
                dupZeros--;
                arr[i + dupZeros] = 0;
            } else {
                arr[i + dupZeros] = arr[i];
            }
        }
        
    }
}
