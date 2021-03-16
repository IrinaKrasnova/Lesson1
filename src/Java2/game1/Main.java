package Java2.game1;

public class Main {
    public static void main(String[] args) {
        Human human=new Human("Геракл", 80,3);
        Robot robot=new Robot("Бронислав",120,1);
        Cat cat=new Cat("Барсик",50,4);

        Road[] roads={new Road(1000), new Road(1400)};
        Wall[]walls={new Wall(2),new Wall(3)};

        double humanTimeRun=0;
        double catTimeRun=0;
        double robotTimeRun=0;
        double humanTimeJamp=0;
        double catTimeJamp=0;
        double robotTimeJamp=0;

        for (Road road : roads){
            humanTimeRun=humanTimeRun+ road.getTimeToRoad(human);
            robotTimeRun=robotTimeRun+ road.getTimeToRoad(robot);
            catTimeRun+= road.getTimeToRoad(cat);
        }
        for (Wall wall : walls){
            humanTimeJamp=humanTimeJamp+ wall.getTimeToWall(human);
            robotTimeJamp=robotTimeJamp+ wall.getTimeToWall(robot);
            catTimeJamp+= wall.getTimeToWall(cat);
        }
    }
}
