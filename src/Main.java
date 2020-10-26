public class Main {

    public static void main(String[] args) {

        //max, min

//        int[] arr = new int[]{3 ,4, 2, 7, 9, 19, 47};
//
//        int max = 0;
//        int min = arr[0];
//        double avg = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//            if(arr[i] < min){
//                min = arr[i];
//            }
//            avg += arr[i]/arr.length;
//        }
//        System.out.println("max: " +  max);
//        System.out.println("min: " +  min);
//        System.out.println("avg: " +  avg);

        // buble sort

//        int[] arr = new int[]{3 ,4, 2, 7, 9, 19, 47};
//
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr.length - 1; j++){
//                if(arr[j] > arr[j + 1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

        for(int i = 2; i <= 100; i++){
            boolean isPrime = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }


    }

}
