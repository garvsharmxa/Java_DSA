public class Main {
    public static void main(String[] args) {
      int[] arr = {2, 6, 1, 4, 5};

      int left=2, right =4;

      for(int i = 1; i < arr.length; i++){
          arr[i] = arr[i - 1] + arr[i];
      }

      int sum;

      if(left == 0){
          sum = arr[right];
      }else {
          sum = arr[right] - arr[left -1 ];
      }

        System.out.println(sum);
    }
}