public class drease {
    static void dec (int n){
        if(n>=6)
            return ;
        else
        dec(n+1);//head
            System.out.println(n);
        // dec(n-1);//tail
    }

    public static void main(String[] args) {
        dec(1);
    }
}
