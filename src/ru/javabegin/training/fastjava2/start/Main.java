package ru.javabegin.training.fastjava2.start;
import ru.javabegin.training.fastjava2.objects.Car;
import ru.javabegin.training.fastjava2.objects.Door;
import ru.javabegin.training.fastjava2.objects.House;

public class Main {
    public static void main(String[] args) {

    Door door = new Door();
    door.setVisota(10);
    System.out.println("door.getVisota() = " + door.getVisota());

    }

}