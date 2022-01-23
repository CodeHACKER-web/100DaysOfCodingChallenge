class operatorsType_Casting{
    public static void main(String []args){
        int obt=450, tot=500;
        double per= (double)obt / tot * 100;
        /*(double)obt is done so that Type casting will be feasible because when we devide int by int will resultant int and
         int producted with int will result the int as the result the Resulting answer might arrive in 0 as type<<int>> thus,
         to avoid that we just typecasted the "obt" variable into double as a result: {(double/int->int) && (int)} -> double;
        */ 
        System.out.printf("The obtained percentage is: %f \n",per);
    }
}