package ru.job4j.tracker.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("����� ����� ��������");
        } else if (position == 2) {
            System.out.println("��������� ����");
        } else {
            System.out.println("����� �� �������");
        }

    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        int position = 1;
        song.music(position);
        position = 2;
        song.music(position);
        position = 3;
        song.music(position);
    }
}
