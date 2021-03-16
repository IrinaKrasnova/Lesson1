package Dz5.Lesson;

public class Cat extends Animal{
    Cat (String name,float jamp,float run, float swim){
        super (name, jamp, run, swim);
    }
    @Override
    int Swim(float distance){
        return Animal.SwimNon;
    }
}
