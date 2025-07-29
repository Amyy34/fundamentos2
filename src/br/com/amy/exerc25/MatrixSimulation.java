package br.com.amy.exerc25;

import java.util.ArrayList;
import java.util.List;

public class MatrixSimulation {
     private Integer numberOfActors;
     List<Humanoide> actors = new ArrayList<>();

    public MatrixSimulation(Integer numberOfActors) {
        this.numberOfActors = numberOfActors;
    }

    public void run(){
        System.out.println("Initiating...");
        System.out.println("Generating actors...");
        generateActors();
        System.out.println("Done, starting now...");
    }

    public void generateActors(){
        for (var i = 0; i < numberOfActors; i++){
            actors.add(Person.generateRandomPerson());
        }
        actors.add(new WomanInTheRedDress());
    }

    public void addActor(Person actor){
        actors.add(actor);
    }

    public void catchRecruitAttention(){
        for (var actor: actors){
            if(actor instanceof WomanInTheRedDress){
                ((WomanInTheRedDress) actor).catchAttention();
            }
        }
    }

    public void turnCatchIntoAgent(){
        for (var actor: actors){
            if (actor instanceof WomanInTheRedDress){
                actor.turnIntoAgent();
            }
        }
    }

    public void freeze(Person person){
        if (!person.accessLevel.equals("Root")){
            System.out.println("Not sufficient privilege");
            return;
        };
        for (var actor: actors){
            actor.freeze();
        }
        System.out.println("All actors were frozen");
    }

    public int howManyFrozen(){
        var frozenCount = 0;
        for (var actor: actors){
            if (!actor.on){
                frozenCount++;
            }
        }
        return frozenCount;
    }

    public int totalInSimulation(){
        return actors.size();
    }
}
