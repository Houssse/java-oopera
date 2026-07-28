import person.*;
import show.Ballet;
import show.MusicalShow;
import show.Opera;

import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 185);
        Actor actor2 = new Actor("Фёдор", "Сидоров", Gender.MALE, 188);
        Actor actor3 = new Actor("Мария", "Иванова", Gender.FEMALE, 165);

        Director director1 = new Director("Павел", "Сызов", Gender.MALE, 300);
        Director director2 = new Director("Петр", "Лузов", Gender.MALE, 412);

        MusicAuthor musicAuthor = new MusicAuthor("Дмитрий", "Пипов", Gender.MALE);

        Choreographer choreographer = new Choreographer("Светлана", "Сычева", Gender.FEMALE);

        MusicalShow ordinaryShow = new MusicalShow(
            "Ромео и Джульетта",
            180,
            director1,
            new ArrayList<>(),
            musicAuthor,
            "Либретто обычного спектакля: История любви Ромео и Джульетты"
        );

        Opera operaShow = new Opera(
            "Князь Игорь",
            240,
            director2,
            new ArrayList<>(),
            musicAuthor,
            "Либретто оперы: История князя Игоря и его похода против половцев",
            50
        );

        Ballet balletShow = new Ballet(
            "Лебединое озеро",
            210,
            director1,
            new ArrayList<>(),
            musicAuthor,
            "Либретто балета: История принцессы Одетты, превращённой в лебедя",
            choreographer
        );

        System.out.println("Обычный спектакль:");
        ordinaryShow.addActor(actor1);
        ordinaryShow.addActor(actor2);

        System.out.println("\nОперный спектакль:");
        operaShow.addActor(actor2);
        operaShow.addActor(actor3);

        System.out.println("\nБалетный спектакль:");
        balletShow.addActor(actor1);
        balletShow.addActor(actor3);

        System.out.println("\n=== Списки актёров ===\n");

        System.out.println("Актёры обычного спектакля:");
        ordinaryShow.listOfActors();

        System.out.println("\nАктёры оперного спектакля:");
        operaShow.listOfActors();

        System.out.println("\nАктёры балетного спектакля:");
        balletShow.listOfActors();

        System.out.println("\n=== Замена актёров ===\n");

        System.out.println("Замена актёра с фамилией 'Иванов' в обычном спектакле на актёра из оперы (Мария Иванова):");
        ordinaryShow.switchActor(actor3, "Иванов");

        System.out.println("\nОбновлённый список актёров обычного спектакля:");
        ordinaryShow.listOfActors();

        System.out.println("\nПопытка замены несуществующего актёра в балете (фамилия 'Петров'):");
        balletShow.switchActor(actor2, "Петров");

        System.out.println("\n=== Тексты либретто ===\n");

        System.out.println("Либретто оперы:");
        operaShow.printLibrettoText();

        System.out.println("\nЛибретто балета:");
        balletShow.printLibrettoText();
    }
}