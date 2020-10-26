package lessons.lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("first");
//        list.add("second");
//        list.add("third");
//        list.add(null);
//        list.add("first");
//
//        list.add(1, "another");
//        list.add(1, "anotherBySet");
//
//        for (String s : list) {
//            System.out.println(s);
//        }
//
//        for (int i = 0; i <list.size(); i++) {
//            String s = list.get(i);
//            if("first".equals(s)){
//                System.out.println(i + " " + s);
//            }
//
//        }

        //System.out.println(list.lastIndexOf("first"));

        List<Person> list = new ArrayList <>();
        list.add(new Person("Taras", 22));
        list.add(new Person("Petro", 28));
        list.add(new Person("Bogdan", 25));
        list.add(new Person("Ira", 21));
        list.add(new Person("Julia", 30));
//        for (Person person : list) {
//            if(person.getName().startsWith("T")){
//                list.add(person);
//            }
//        }

        Iterator <Person> iterator = list.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if(person.getName().startsWith("T")){
                iterator.remove();
            }
        }
        iterator = list.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if(person.getName().startsWith("I")){
                iterator.remove();
            }
        }

        for (Person person : list) {
            System.out.println(person);
        }

    }

    }
