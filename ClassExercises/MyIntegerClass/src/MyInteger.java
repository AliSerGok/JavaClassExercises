public class MyInteger {
    int value;
    MyInteger(int value){
        this.value=value;

    }

    public int getValue(){
        return this.value;
    }

    public boolean isOdd(){
        return this.value % 2 != 0;
    }

    public boolean isEven(){
        return this.value % 2 == 0;
    }

    public boolean isPrime(){
        int value2=this.value;
        for(int i=2;i<this.value;i++){
            if(this.value%i==0){
                value2=this.value/i;
            }
        }
        return this.value == value2;
    }

    public void printInfo(){
        System.out.println("Number is even: "+isEven()+"\nNumber is odd: "+isOdd()+"\nNumber is prime: "+isPrime());
    }



}
