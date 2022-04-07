
package stackAndQueue;

public class App {

    public static void main(String[] args) throws Exception {

      Queue queue=new Queue<>();
      queue.enqueue(5);
      queue.enqueue(7);
      queue.enqueue(3);
      System.out.println(queue);
      System.out.println("dequeue -->  "+ queue.dequeue());
      System.out.println("dequeue -->  "+ queue.dequeue());
      System.out.println("queue after dequeue -->  "+ queue);
      AnimalShelter animalShelter = new AnimalShelter();

      animalShelter.enqueue(new Cat("cat1") );
        animalShelter.enqueue(new Cat("cat2") );
        animalShelter.enqueue(new Cat("cat3") );
        animalShelter.enqueue(new Dog("Dog1") );
        animalShelter.enqueue(new Dog("Dog2") );
        System.out.println(animalShelter);
        animalShelter.deQueue("cat");
        animalShelter.deQueue("dog");
        System.out.println(animalShelter);







//      ValidateBrackets isValid = new ValidateBrackets();
//        System.out.println("{}  ==> " + isValid.validateBrackets("{}"));
//        System.out.println("{}(){}  ==> " + isValid.validateBrackets("{}(){}"));
//        System.out.println("()[[Extra Characters]]  ==> " + isValid.validateBrackets("()[[Extra Characters]]"));
//        System.out.println("(){}[[]]  ==> " + isValid.validateBrackets("(){}[[]]"));
//        System.out.println("{}{Code}[Fellows](())  ==> " + isValid.validateBrackets("{}{Code}[Fellows](())"));
//        System.out.println("[({}]  ==> " + isValid.validateBrackets("[({}]"));
//        System.out.println("(](  ==> " + isValid.validateBrackets("(]("));
//        System.out.println("{(})  ==> " + isValid.validateBrackets("{(})"));
//        System.out.println("(  ==> " + isValid.validateBrackets("("));
//        System.out.println("}  ==> " + isValid.validateBrackets("}"));
//        System.out.println("(} ==> " + isValid.validateBrackets("(}"));
//        System.out.println("(Sadan} ==> " + isValid.validateBrackets("(Sadan}"));
//        System.out.println("(Sa]dan} ==> " + isValid.validateBrackets("(Sa]dan}"));

//        AnimalShelter allAnimals = new AnimalShelter();
//        Dog dog = new Dog("dog1");
//        allAnimals.enqueue(dog);
//        Dog dog2 = new Dog("dog2");
//        allAnimals.enqueue(dog2);
//        System.out.println(allAnimals.toString());
//        Cat cat = new Cat("cat1");
//        allAnimals.enqueue(cat);
//        Cat cat1 = new Cat("cat2");
//        allAnimals.enqueue(cat1);
//        System.out.println(allAnimals);
//
//
//        System.out.println(" dequeue ==>  " + allAnimals.deQueue("cat"));
//
//        System.out.println("dequeue  ==>  " + allAnimals.deQueue("dog"));
//
//        System.out.println(allAnimals);
    }

    }


