package com.soe.mit;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee emp1=new Employee("Kavita",201,50000);
        System.out.println(emp1);
        try {
            Employee emp2 = null;
            System.out.println(emp2.getEmployeeName());
        }
        catch (NullPointerException ne){
            ne.printStackTrace();
        }
        catch (RuntimeException re){
            re.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("all connections closed");
        }
        System.out.println("after exception block");
//        try {
//            int a = 5, b = 0;
//            System.out.println(a/b);
//        }
//        catch (ArithmeticException ae){
//            System.out.println(ae);
//        }
//        System.out.println("after exception");

    }
}
