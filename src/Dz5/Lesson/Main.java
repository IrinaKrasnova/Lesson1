package Dz5.Lesson;

public class Main {
    public static void main(String[] args) {
        String Luck = "успешно";
        String Failure = "безуспешно";
        String situationName;
        String situationResult;

        Cat cat = new Cat("Мурка", 2, 200, 0);
        Dog dog = new Dog("Bobic", 0.5f, 500, 10);
        Horse horse = new Horse("Gracia", 3, 1500, 100);
        Bird bird = new Bird("Chiric", 0.2f, 5, 0);

        Animal[] arr={ cat, dog, horse, bird};
        float jampLenght = 0.3f;
        float runLenght = 200;
        float swimLenght = 9;

        for (int i = 0; i < arr.length; i++) {
            String nameString = arr[i].getName() + "  может  ";

            situationName = " прыгнуть на " + arr[i].getJamp() + "м.  Пытается прыгнуть на ";
            situationResult = (arr[i].Jump(jampLenght)) ? Luck : Failure;
            result(nameString, situationName, jampLenght, situationResult);

            situationName = " пробежать " + arr[i].getRun() + "м.  Пытается пробежать ";
            situationResult = (arr[i].Run(runLenght)) ? Luck : Failure;
            result(nameString, situationName, jampLenght, situationResult);

            int swimResult = arr[i].Swim(swimLenght);
            situationName = " проплыть " + arr[i].getSwim() + "м.  Пытается проплыть ";
            situationResult = (swimResult == Animal.SwimOk) ? Luck : Failure;
            if (swimResult == Animal.SwimNon)
                situationResult = " это не получилось, ведь он не умеет плавать";
           result(nameString, situationName, jampLenght, situationResult);
        }
    }

    private static void result(String nameAnimal, String situation, float situationlenght, String situationResult) {
        System.out.println(nameAnimal + situation + situationlenght + "м.  -  " + situationResult);
    }
}







