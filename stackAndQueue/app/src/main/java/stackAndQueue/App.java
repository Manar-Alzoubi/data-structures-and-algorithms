

package stackAndQueue;

public class App {

    public static void main(String[] args) throws Exception {
      
        AnimalShelter allAnimals = new AnimalShelter();
        Dog dog = new Dog("dog1");
        allAnimals.enqueue(dog);
        Dog dog2 = new Dog("dog2");
        allAnimals.enqueue(dog2);
        System.out.println(allAnimals.toString());
        Cat cat = new Cat("cat1");
        allAnimals.enqueue(cat);
        Cat cat1 = new Cat("cat2");
        allAnimals.enqueue(cat1);
        System.out.println(allAnimals);


        System.out.println(" dequeue ==>  " + allAnimals.deQueue("cat"));

        System.out.println("dequeue  ==>  " + allAnimals.deQueue("dog"));

        System.out.println(allAnimals);

//
//      ValidateBrackets isValid = new ValidateBrackets();
//
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

    }














