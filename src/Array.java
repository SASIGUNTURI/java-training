package javatraining.sample;
//public class Array {
//public static void  main(String [] args)
//{
//    int [] arr;
//    arr = new int[2];
//    arr[0]=11;arr[1]=13;
//    for (int i=0;i< arr.length;i++)
//        System.out.println("elements at index " +  i  +  " : " + arr[i]);
//}
//}
public class Array {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7};
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] ==7) {

                continue;
            }
            System.out.println(arr[i]);

        }
    }

    public static class Armstrong{
        public static void main(String [] args)
        {
            int num = 320, number, temp, total = 0;


    number = num;
    while (number !=0)
    {
        temp=number%100;
        total=total+temp*temp*temp;
        number/=10;
    if (total==num)
        System.out.println( num+" it is a armstrong number");
        else
            System.out.println(num +"it is not a armstrong nuumber");


    }

        }
    }
}

