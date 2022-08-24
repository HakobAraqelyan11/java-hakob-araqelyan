package ru.otus;

import ru.otus.homework.GuavaImpl;

public class Main {
    public static void main(String[] args) {
        GuavaImpl guava = new GuavaImpl();
        guava.checkIsPowerTwo(256);
        guava.checkIsPowerTwo(13);
    }

}
