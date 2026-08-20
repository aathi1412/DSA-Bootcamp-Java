class Main {
    public static void main(String[] args) {
        int[][] arr = { {3, 8, 5}, {12, 7, 9}, {6, 14, 10} };

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    thirdMax = secondMax;
                    secondMax = max;
                    max = arr[i][j];
                } 
                else if (arr[i][j] > secondMax && arr[i][j] != max) {
                    thirdMax = secondMax;
                    secondMax = arr[i][j];
                } 
                else if (arr[i][j] > thirdMax && arr[i][j] != max && arr[i][j] != secondMax) {
                    thirdMax = arr[i][j];
                }
            }
    }

        System.out.println(thirdMax);
   }
}
