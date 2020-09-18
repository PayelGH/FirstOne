package pragraPackage;

public class IfElseExamples {
    public static void main (String[]args){
        //return true if all are multiple of 3
        int apple=6;
        int orange=9;
        int banana=12;
        if(apple%3==0&&orange%3==0&&banana%3==0){
            System.out.println("all are multiples of 3");
        }
        else{
            System.out.println("not multiple of 3");
        }
        System.out.println("not recognised");
    }
}
