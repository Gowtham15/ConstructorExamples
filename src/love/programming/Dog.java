package love.programming;

public class Dog{

    String dogName;
    String dogBreed;
    int dogAge;

    public void setDogName(String dogName){
        this.dogName=dogName;
    }

    public void setDogBreed(String dogBreed){

        this.dogBreed=dogBreed;
    }

    public void setDogAge(int dogAge){

        this.dogAge=dogAge;
    }

    public String getDogName(){

        return(dogName);
    }

    public String getDogBreed(){

        return(dogBreed);
    }

    public int getDogAge(){

        return(dogAge);
    }
}
