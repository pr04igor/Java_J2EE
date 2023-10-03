package org.example;
public class Main {
    public static void main(String[] args) throws Exception{
        try {
            Employee worker = new Employee((short)1, "John", "Peterson", -3000);
        }
        catch (FieldLengthLimitException | IncorrectSalaryException ex) {
            System.out.println(ex.getMessage());
        }
    }
}