package Lab4.demo;

public class Money {
    private double dollars;
    private double cents;

    public Money() {
        normalize();
    }
    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }
    public  double amountMoney(){
        return this.dollars+this.cents* 0.01;
    }
    public Money add(Money m){
        Money money=new Money();
        double addMoney=this.amountMoney()+m.amountMoney();
        money.dollars = (int) addMoney;
        money.cents = (addMoney-money.dollars)*100;
        return money;
    }
    public Money substract(Money m){
        Money money=new Money();
        double subMoney=this.amountMoney()-m.amountMoney();
        money.dollars = (int) subMoney;
        money.cents= (subMoney-money.dollars)* 100;
        return money;
    }
    public Money multiply(int m){
        Money money=new Money();
        double mulMoney=this.amountMoney()*m;
        money.dollars = (int) mulMoney;
        money.cents= (mulMoney-money.dollars)* 100;
        return money;
    }
    public static Money[] multiply(Money[] moneys, int amt){
        Money[] aftmoney=new Money[moneys.length];
        for(int i = 0;i<moneys.length;i++){
            aftmoney[i]=moneys[i].multiply(amt);
        }
        return aftmoney;
    }
    public boolean equals(Money money){
        if(money.dollars==this.dollars&&money.cents==this.cents){
            return true;
        }
        return false;
    }
    public String toString(){
        return (int)this.dollars+"."+(int)this.cents;
    }
    private void normalize() { // normalize dollars and cents field
        this.dollars = 0;
        this.cents = 0;
    }
}
