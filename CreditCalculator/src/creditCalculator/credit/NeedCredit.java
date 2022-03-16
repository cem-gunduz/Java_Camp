package creditCalculator.credit;

public class NeedCredit implements Credit{
    private double coefficient;
    @Override
    public void calculate(double creditPrice,int year) {
        coefficient=year*0.21;
        System.out.println(creditPrice+ " TL ihtiyaç Kredisi Alırsanız ödeyeceğiniz miktar: "+creditPrice*(1+coefficient));
    }
}
