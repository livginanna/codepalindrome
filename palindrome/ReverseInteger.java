class ReverseInteger{
    public static void main(String[]args){
        int number=7645, reverse=0,rem;
        while(number!=0){
            rem = number%10;
        reverse=reverse*10 + rem;
        number=number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);


        


    }
}