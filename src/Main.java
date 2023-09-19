import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String firstName = "";
        String lastName = "";
        String fullName = "";
        String Trash = "";


        int favNum =0; //1-10
        double salary = 0.0;
        Scanner in = new Scanner(System.in);

        // use print for a prompt output(smth you have to type)
        System.out.print("Enter your first name: ");
        firstName = in.nextLine();

        System.out.println("You told me your first name is: " + firstName);

        System.out.print("Enter your last name: ");
        lastName = in.nextLine();

        System.out.println("You told me your last name is: " + lastName);

        fullName = firstName + " " + lastName;
        System.out.println("I'm guessing your full name is: " + fullName);

        // ok now lets read some numbers

        System.out.print("Enter your fav num [1-10]: ");
        if (in.hasNextInt())

        {
            favNum = in.nextInt();
            System.out.println("You told me your fav num is: " + favNum);
            if(favNum >= 1);

        }
        else // don't have a number must read buffer as a trash String
        {
            Trash = in.nextLine();
            System.out.println("You told me " + Trash);
            System.out.println("Run the program again and do the input correctly");
        }

        System.out.print("enter your salary: ");
        if(in.hasNextDouble())
        {
            salary = in.nextDouble();
            in.nextLine(); // clear the buffer every time after reading a number
            System.out.println("you said your salary is: " + salary);
        }
        else
        {
            Trash = in.nextLine();
            System.out.println("you entered " + Trash + "which is wrong!");
            System.out.println("Run the program again with the correct input");
        }

    }
}