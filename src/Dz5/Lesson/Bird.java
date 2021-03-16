package Dz5.Lesson;


public class Bird extends Animal{
    Bird (String name,float jamp,float run, float swim){
        super (name, jamp, run, swim);
    }

    int Swim(float distance){
        return Animal.SwimNon;
    }
}