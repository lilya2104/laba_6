public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        if (b != 0) return a/b;
        return 0;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(){
        int res = this.times(this.div(this.add(16, 5), this.dif(16, 9)), this.add(7, -11));
        return res;
        //-12
    }
}
