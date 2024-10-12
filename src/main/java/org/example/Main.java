package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Java Collections", "Write List Interface",
                "Ann", Status.IN_QUEUE, Priority.LOW);
        Task task2 = new Task("Java Collections", "Write Set Interface",
                "Ann", Status.ASSIGNED, Priority.MED);
        Task task3 = new Task("Java Collections", "Write Map Interface",
                "Bob", Status.IN_QUEUE, Priority.HIGH);

        Set<Task> taskSet1 = new HashSet<>();
        taskSet1.add(task1);
        Set<Task> taskSet2 = new HashSet<>();
        taskSet1.add(task2);
        Set<Task> taskSet3 = new HashSet<>();
        taskSet1.add(task3);

        TaskData taskData = new TaskData(taskSet1, taskSet2, taskSet3, new HashSet<>());

        System.out.println(taskData.getTasks("all"));
    }
}