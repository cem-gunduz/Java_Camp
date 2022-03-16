package creditCalculator.credit;


public class CarCredit implements Credit {
    private double coefficient;


    @Override
    public void calculate(double creditPrice, int year) {

        coefficient=year*0.18;

        System.out.println(creditPrice + " TL Araba Kredisi Alırsanız ödeyeceğeiniz miktar: " + creditPrice*(1+coefficient));

    }
}
