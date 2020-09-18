public class SI {
    //let us learn git today
//calculate simple interest
    void calculate(double p, double r, double t){
        System.out.println("Simple interest is : $"+ ((p*r*t)/100));
    }

    public static void main(String[] args) {
        SI td=new SI();
        td.calculate(2000,1.6,12);

        SI scotia=new SI();
        scotia.calculate(2000,1.5,12);

        SI bmo=new SI();
        bmo.calculate(2000,1.77,12);
    }
}
