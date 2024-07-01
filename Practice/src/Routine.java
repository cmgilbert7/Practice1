package Practice.src;
import java.util.*;

public class Routine {
    public int numExercises;
    private Exercise routine[] = new Exercise[numExercises];
    private Exercise exercise;

    public Routine(){
        for (int i = 0; i < numExercises; i++){
            fillExercise(i);
        }
    }

    public void fillExercise(int index){
        Scanner scnr = new Scanner(System.in);
        String name;
        int reps;
        int sets;
        System.out.print("Enter exercise name: ");
        name = scnr.next();
        System.out.print("Enter number of reps: ");
        reps = scnr.nextInt();
        System.out.print("Enter number of sets: ");
        sets = scnr.nextInt();

        routine[index] = new Exercise(name, reps, sets);
    }
}
