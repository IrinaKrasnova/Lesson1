package Dz5.Lesson;


public abstract class Animal {
    private final String name;
    private final float jamp;
    private final float run;
    private final float swim;

    static int SwimNon=-1;
    static int SwimOk=1;
    static int SwimFail=0;

    public Animal(String name, float jamp, float run, float swim) {
        this.name = name;
        this.jamp = jamp;
        this.run = run;
        this.swim = swim;
    }

    String getName() {
        return this.name;
    }

    float getJamp() {
        return this.jamp;
    }

    float getRun() {
        return this.run;
    }

    float getSwim() {
        return this.swim;
    }
    int Swim(float distance) {
        if (distance <= swim) {
            return SwimOk;
        } else
            return SwimFail;
    }
     boolean Run(float distance){
return(distance<=run);
    }
    boolean Jump(float distance){
        return (distance<=jamp);
    }
}
