package ru.savelichev.lesson1;

import java.util.Objects;

public class Box {
    String color;
    int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Box box = (Box) obj;
        return size == box.size && Objects.equals(color, box.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, size);
    }
}
