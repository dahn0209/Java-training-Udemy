public class Hello {

    public static void main(String[] args){
        System.out.println("Hello DEE DEE");
        int myFirstNumber=(10+5)+(2*10);////Declaration////
        int mySecondNumber=12;
        int myThirdNumber=myFirstNumber*2;
        int myTotal=myFirstNumber+mySecondNumber+myThirdNumber;
        System.out.println(myTotal);
        int mylastOne=1000-myTotal;
        System.out.println("myLastOne==>"+mylastOne);
    }
}

//Java programs (and most other programming languages) have keywords. Each has a specific meaning and sometimes they
// need to be used in specific orders.
//You write Java programs by following a specific set of rules, using a combination of these keywords and other things
//you will see which collectively form a Java program
//NOTE: keywords are case sensitive-public and Public and even PUBLIC are different things.
//public and class are two java keywords-they have a specific meaning which we will find out more about moving foward

//The public Java keyword is an access modifer. An access modifier allows us to defnine the scope or how other parts
//of your code ro even someone else's code can access this code.

//The class keyword is used to define a class with the name following the keyword-Hello in this case and left and
// right curly braces to define the class block.
//To define a class requires an optional access modifier, followed by class, followed by the left and right curly braces
//The left and right curly braces are defining the class body-anything in between them is 'part' of this class.
//We can have data and code.

//A method is a collection of statements (one or more) that performs an operation. We'll be using a special method
// called the main method that Java looks for when running a program. It's the entry point of any Java code.

//public is an access modifier when defining the class

//static is a Java keyword that needs an understanding of other concepts.

// We need to have static for java to find our method to run the code we are going to add.

//void  is another Java keyword used to indicate that the method will not return anything
