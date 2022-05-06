package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

   ArrayList<Todo> tasks = new ArrayList<>();
   ArrayList<Todo> doneTasks = new ArrayList<>();

   void addTodo(){
       Todo task = new Todo();

       System.out.println("Adding task...");

       System.out.println("Add task ID");
       task.id = intScanner.nextInt();

       System.out.println("Add task description");
       task.description = scanner.nextLine();

       this.tasks.add(task);
       System.out.println("Task added!");
   }

   void viewAllTodo(){
       System.out.println("All tasks:");

       for (Todo task : tasks){
           System.out.println(task.id + ". " + task.description);
       }
   }

   void viewSingleTodo(){
       System.out.println("Input tasks ID you want to view:");
       int taskID = intScanner.nextInt();
       //taskID = taskID+1;

       Todo task = tasks.get(taskID-1);
       System.out.println(task.id + ". " +  task.description);
   }

   void markTodoAsDone(){
       System.out.println("Input tasks ID you want to mark as 'Done':");
       int taskID = intScanner.nextInt();

       Todo task = tasks.get(taskID-1);
       System.out.println("Task No " + task.id + ". is marked as done." + "(" +  task.description + ")");

       tasks.remove(taskID-1);

       //can add removed tasks to viewAllTodo
       Todo doneTask = new Todo();
       this.doneTasks.add(doneTask);
   }

   void deleteTodo(){
       tasks.clear();
       System.out.println("ToDo list removed!");
   }
}
