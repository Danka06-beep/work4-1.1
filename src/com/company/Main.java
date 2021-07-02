package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {

            System.out.println("1. Добавить задачу\n2. Вывести список задач\n3. Удалить задачу\n0. Выход");
            String task = scanner.nextLine();

            if (task.equals("1")) {
                System.out.println("Введите задачу для планирования:");
                task = scanner.nextLine();
                list.add(task);

            }else if ("end".equals(task)) {
                    for (int i = 0; i < list.size(); i++)
                        System.out.println(i + " -> " + list.get(i));
                }
            else if (task.equals("2")) {
                System.out.println("Список задач:\n" + list);
                System.out.println("Нажмите enter чтоб вернутся к меню");
                scanner.nextLine();
            }
            else if (task.equals("3")) {
                    System.out.println("Какую задачу вы хотите удалить\n" + list);
                    Integer indexInput = Integer.valueOf(scanner.nextLine());
                    list.remove(indexInput);
            }
            else if ("0".equals(task))
                break;
            }

        }

    }

