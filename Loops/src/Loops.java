public class Loops {
    public static void main(String[] args) {
        writeSquares();
    }

    public static void writeSquares() {
        System.out.println("writeSquares...");
        //we want to create a program to print the
        //Squares of the first five natural numbers
        //One wa to do it is like this
        System.out.println(1 + " squared = " + (1 * 1));
        System.out.println(2 + " squared = " + (2 * 2));
        System.out.println(3 + " squared = " + (3 * 3));
        System.out.println(4 + " squared = " + (4 * 4));
        System.out.println(5 + " squared = " + (5 * 5));
        System.out.println(6 + " squared = " + (6 *6 ));
        //This can be done with loops
        writeSquares2();
    }

    public static void writeSquares2() {
        System.out.println("writeSquares2 (loop)...");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " squared = " + (i * i));
            //There are 3 parts to a for loop, they are all optional
            //The first part is used to initialize a variable
            //for the above loop we create a variable "i"
            //called i and initialized it to 1
            //middle part is the condition which will
            //continue the loop, for the one above, the loop
            //will continue as long as i is less than or equal to 5
            //the last part of the loop is used to increment
            //or decrement the variable, for the next loop we
            //will continue as long as i is less than or equal to 100
        }
        writeSquares3();
    }
        public static void writeSquares3() {
            System.out.println("writeSquares3 (loop 2)...");
            for (int b = 1; b <= 100; b++) {
                System.out.println(b + " squared = " + (b * b));
            }
            //Lets make the next one a little more interesting
            //we will pass the value where to stop at
            writeSquares4(1000);
        }
            public static void writeSquares4(int stopVal)
            {
                System.out.println("writeSquares4 (loop 3)...");
                System.out.println("Stop value is " + stopVal);
                for (int f = 1; f <= stopVal; f++) {
                    System.out.println(f + " squared = " + (f * f));
                }
                //What if the stop value was negative
                //See if you can figure out where it will stop
                writeSquares5();
            }
            public static void writeSquares5(){
            System.out.println("writeSquares5...");
            for(int c =(2 + 2); c<=(17 * 3); c++)
            {
                System.out.println(c + " squared = " +(c * c));
            }
            //if it goes from 4 to 51 for a total of 47 loops
            }

}