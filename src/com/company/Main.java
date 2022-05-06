package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList tdList = new TodoList();

        System.out.println("Welcome to ToDo app!");

        String usersChoice = "";

        do{
            System.out.println("Choose an activity:");
            System.out.println("""
                    1.Add task
                    2.View all tasks
                    3.View single task
                    4.Mark task as 'Done'
                    5.Delete task
                    Type 'exit' to exit menu.
                    """);

            usersChoice = scanner.nextLine();

            switch (usersChoice){
                case "exit":
                    break;
                case "1","Add task":
                    tdList.addTodo();
                    break;
                case "2","View all tasks":
                    tdList.viewAllTodo();
                    break;
                case "3","View single task":
                    tdList.viewSingleTodo();
                    break;
                case "4","Mark task as 'Done'":
                    tdList.markTodoAsDone();
                    break;
                case "5","Delete task":
                    tdList.deleteTodo();
                    break;
                default:
                    System.out.println("Choose correct activity (Input number or whole activity).");
            }

        }while(!usersChoice.equalsIgnoreCase("exit"));
    }
}
