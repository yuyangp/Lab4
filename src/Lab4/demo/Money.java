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
//        double thisMoney=this.dollars+this.cents* 0.01;
//        double mMoney=m.dollars+m.cents* 0.01;
        Money money=new Money();
        double addMoney=this.amountMoney()+m.amountMoney();
        money.dollars = (int) addMoney;
        money.cents = (addMoney-money.dollars)*100;

//        this.cents+=m.cents;
//        if(this.cents> 100){
//            this.cents-= 100;
//            this.dollars+=m.dollars+ 1;
//        }
//        this.dollars+=m.dollars;
        return money;
    }
    public Money substract(Money m){
//        double thisMoney=this.dollars+this.cents* 0.01;
//        double mMoney=m.dollars+m.cents* 0.01;
//        this.dollars = (int) (thisMoney-mMoney)/ 1;
//        this.cents= (int) ((thisMoney-mMoney)-this.dollars)* 100;
        Money money=new Money();
        double subMoney=this.amountMoney()-m.amountMoney();
        money.dollars = (int) subMoney;
        money.cents= (subMoney-money.dollars)* 100;

//        dollars=this.dollars-m.dollars;
//        cents=this.cents-m.cents;
        return money;
    }
    public Money multiply(int m){
        Money money=new Money();
        double mulMoney=this.amountMoney()*m;

        money.dollars = (int) mulMoney;
        money.cents= (mulMoney-money.dollars)* 100;

//        dollars=this.dollars*m;
//        cents=this.cents*m;
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
