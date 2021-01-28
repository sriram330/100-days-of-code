/*
Unchecked Exceptions:
They are not checked at compile-time but at run-time.
For example: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, exceptions under Error class, etc.

Checked Exceptions: They are checked at compile-time. For example, IOException, InterruptedException, etc.

 */



package Exception_Handling;

import java.util.InputMismatchException;

public class GetExceptions {


        public static void main(String[] args) throws InterruptedException {


            Thread.sleep(5000);
            try {

                // code that generate exception
                int divideByZero = 5 / 0;
                System.out.println("Rest of code in try block");
            }

            catch (ArithmeticException e) {
            //    System.out.println("Exception is =>       " + e);

                System.out.println("ArithmeticException => " + e.getMessage());
            }

            catch(InputMismatchException e){
                System.out.println("Please enter only integer values");
            }

            catch (Exception e){
                System.out.println("Something went Wrong");
            }
            finally {
                int Sum =5+6;
                System.out.println("Sum is "  +Sum);
            }
        }
    }

