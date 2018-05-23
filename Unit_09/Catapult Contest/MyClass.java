public class MyClass {
 private int x;
 
 public Num (int x) {
     
    if ( x <= 10){
        return 2;
    }else{
        return getNum(x - 5) + 4;
    }  
    }
}
