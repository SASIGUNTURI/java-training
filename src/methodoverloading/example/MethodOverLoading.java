package methodoverloading.example;

class MethodOverLoading{
    int mul(int r,int s){
        return r+s;
    }
    int mul(int r,int s,int t){
        return r+s+t;

}
    public static void main(String [] args ) {
        MethodOverLoading m=new MethodOverLoading();
         System.out.println(m.mul(1,2));
         System.out.println(m.mul(3,4,5));

    }

}
