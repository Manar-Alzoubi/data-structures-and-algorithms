package stackAndQueue;

import java.lang.reflect.Type;

public class Cat extends Animals{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat";

//        String str = "Cat{ back->";
//        Node curr = back;
////        curr =head;
//        while (curr !=null){
//            str+="{"+ curr.getValue()+"}->";
//            curr = curr.getNext();
//        }
//        str=str+"front";
//        return str;
    }
}
