package Looping;
class break_and_continue{
    public static void main(String[] args) {
        // break is used to exit from the running loop exiting remaining iteration

        // for(int i = 0; i < 5; i++){
        //     // loop runs when i's value is 3 it will terminate
        //     if (i == 3) {
        //         break; // break the loop
        //     }
        //     System.out.println(i);// print till 0 1 2 
        // }

        // continue skip the current iteration(including all next statement) and continue with next iteration

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // skip the iteraion 
            }
            System.out.println(i); // it will print all values of i from 0 to 9 but not print 5
        }

        // both of these can be used in all loops
    }
}
