package stackAndQueue;

public class AnimalShelter {

    private Queue catsQueue = new Queue();// store all cats in catsQueue
    private Queue dogsQueue = new Queue();// store all dogs in dogsQueue

    public void enqueue(Animals newAnimal){
        if( newAnimal instanceof Cat){ // if the animal of type cat save it to catsQueue
            catsQueue.enqueue(newAnimal);
        } else if(newAnimal instanceof Dog){ // if animal of type dogs save it in dogsQueue
            dogsQueue.enqueue(newAnimal);
        }
    }

    public String deQueue(String pref) throws Exception {
        if (pref == "dog") {
            if (!dogsQueue.isEmpty())
                this.dogsQueue.dequeue();
            return "dog";
        }
        else if (pref == "cat"){
            if(!catsQueue.isEmpty())
                this.catsQueue.dequeue();
            return "cat";}
        else return null;
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "catsQueue=" + catsQueue +
                ", dogsQueue=" + dogsQueue +
                '}';
    }
}
