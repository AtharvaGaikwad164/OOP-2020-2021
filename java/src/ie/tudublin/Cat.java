package ie.tudublin;

public class Cat extends Animal
{
    //Private Field - every animal has a name
    //Private means it can only accessed by methods inside the animal class
    private int numLives;

    //Constructor for the cat class - passing in String name
    //So the cat has a name
    public Cat(String name)
    {
        //This passes the String name parameter for dog into the super
        //clas constructor because the dog class extends animal
        super(name);
        numLives = 9;
    }

    //Kill method
    void kill()
    {
            if (numLives > 0) 
            {
                    numLives--;
                    System.out.println("Ouch");
            }
            else
            {
                    System.out.println("Dead");
            }
    }

    //Public Accessor method to access the private field and get name
    //Getter/Accesssor
    public int getnumLives()
    {
        //Gets access to the private field
        return numLives;
    }
    //public Accessor Setter Method to set the private field
    public void setnumLives(int numLives)
    {
        //We assign the numLives parameter to name private field
        //because there are two variable called name and now 
        //we have to disambiguate between them
        this.numLives = numLives;
    }

}