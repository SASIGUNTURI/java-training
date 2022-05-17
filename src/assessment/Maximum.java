package assessment;
public class Maximum {
    public static void main(String[] args) {
        int []arr = new int[] {1,10,27,32,54};
        int max= arr[0];
        for(int i= 0;i< arr.length;i++){
            if(arr[i] >max)
                max =arr[i];

        }
        System.out.println("maximum num in given :" +max);

    }
}
