package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();


        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println(" Dentro array ArrayIndexOutOfBoundsException");

    }catch( IndexOutOfBoundsException e)

    {
        System.out.println(" Dentro array IndexOutOfBoundsException");



        System.out.println();
        System.out.println("ArithmeticException ");
    }catch(RuntimeException e)

    {
        System.out.println("Dentro RuntimeException");
    }
        try{
            talvezLanceException();
        }
        catch(SQLException | IOException e){
            e.printStackTrace();
        }

}

private static void talvezLanceException() throws SQLException, IOException{
    }}