package HW03;

public  class Client implements Check {
    static int startNameCheck = 0;
    private float balans;
    final int nameCheck;
    public Client(){
        this.balans = 0;
        this.nameCheck = ++startNameCheck;
        printNameCheck();
    }

    @Override
    public float getBalans() {
        return balans;
    }

    @Override
    public void printNameCheck() {
         System.out.println("Номер счета: "  + getNameCheck());
    }

    @Override
    public int getNameCheck() {
        return nameCheck;
    }

    @Override
    public void setBalans(float sum) {
        balans = balans + sum;
    }


}
