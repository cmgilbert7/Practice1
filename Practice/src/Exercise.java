package Practice.src;

public class Exercise {
    /* String that holds value for exercise name */
    private String name;
    /*Int that holds value for reps provided */
    private int reps;
    /*Int that holds value for sets provided */
    private int sets;s

    /* Constructor when sets are provided */
    public Exercise(String name, int reps, int sets){
        setName(name);
        setReps(reps);
        setSets(sets);
    }

    /* Constructor for no sets, (One set is assumed) */
    public Exercise(String name, int reps){
        setName(name);
        setReps(reps);
        setSets(1);
    }

    /*Setter method for exercise name */
    public void setName(String name){
        this.name = name;
    }

    /*Setter method for reps */
    public void setReps(int reps){
        this.reps = reps;
    }

    /*Setter method for sets */
    public void setSets(int sets){
        this.sets = sets;
    }

    /*Getter method for names */
    public String getName(){
        return this.name;
    }

    /*Getter method for reps */
    public int getReps(){
        return this.reps;
    }

    /*Getter method for sets */
    public int getSets(){
        return this.sets;
    }


}
