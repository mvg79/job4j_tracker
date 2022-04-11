package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String dic = "Неизвестное слово";
        return dic + eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String sent = dic.engToRus("Еще слово");
        System.out.println(sent);
    }
}
