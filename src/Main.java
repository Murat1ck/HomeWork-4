

public class Main {
    public static void main(String[] args) {

        //int age = 17;
        //if (age >= 18) {
        // System.out.println("Ты можешь водить");
        //}
        //if (age < 18) {
        //System.out.println("Ты не можешь водить");
        //}
        //System.out.println("Задание №1");
        //int age = 17;
        //if (age >= 18) {
        //System.out.println("Поздравляю с совершеннолетием!");
        //}
        //if (age < 18) {
        //System.out.println("Возраст совершеннолетия ещё не наступил :(");

        //System.out.println("Задание №2");

       // int age = 16;
        //if (age >= 7 ) {
           // System.out.println("Ребёнок ходит в школу");
        //}
       // if (age >= 18 ) {
            //System.out.println("Человек уже закончил школу и может отправляться в университет");
       // }
       // if (age >= 24) {
            //System.out.println("Человек окончил университет и ему пора искать первую работу");
        int capacity = 102;
        int totalSeats = 60;
        int totalStandingPlaces = capacity - totalSeats;
        System.out.println("Стоячих мест: " + totalStandingPlaces);
        int sittingPlace = 61;
        int standingPlace =43;
        if (sittingPlace <= 60 || standingPlace <= 42) {
            System.out.println("В вагоне есть свободные места");
        }
        if (sittingPlace > 60 || standingPlace > 42) {
            System.out.println("В вагоне нет свободных мест");

        }
        if (sittingPlace > 60 && standingPlace <= 42) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (sittingPlace <= 60 && standingPlace > 42) {
            System.out.println("В вагоне есть сидячие места");
        }



       }
   }

