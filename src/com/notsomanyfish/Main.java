package com.notsomanyfish;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Person> personList = new ArrayList<Person>() ;
        ArrayList<String> strings = new ArrayList<>();

        personList.add(new Person("Henok", "male"));  personList.add(new Person("Abizer", "male"));
        personList.add(new Person("Sami", "male"));   personList.add(new Person("Melat", "female"));
        personList.add(new Person("Blen", "female")); personList.add(new Person("Tsion", "female"));

 for(int i=0; i<10; i++) {
            Map<Person,Person> getMatch = matcher(randomNumber(), randomNumber(), personList);

            for (Map.Entry<Person,Person> entry : getMatch.entrySet())
                if(entry.getKey().getName().equalsIgnoreCase(entry.getValue().getName())){
                    System.out.println(entry.getKey().getName()+", free on Saturday\n");
                }
                else {
                List<String> actv = getActivity();
                    entry.getKey().setDateCount();
                    entry.getValue().setDateCount();
                    System.out.println(entry.getKey().getName()+" asked "+entry.getValue().getName()+" out, and "+entry.getValue().getName()+" accepted\n"+ entry.getKey().getName()
                            +actv.get(0)+entry.getValue().getName()+"\n"+entry.getKey().getName()+actv.get(1)+entry.getValue().getName()+"\n"+entry.getKey().getName()
                            +actv.get(2)+entry.getValue().getName()+"\n");
                }
        }
        System.out.println(personList.get(0).getName()+": "+personList.get(0).getDateCount());
        System.out.println(personList.get(1).getName()+": "+personList.get(1).getDateCount());
        System.out.println(personList.get(2).getName()+": "+personList.get(2).getDateCount());
        System.out.println(personList.get(3).getName()+": "+personList.get(3).getDateCount());
        System.out.println(personList.get(4).getName()+": "+personList.get(4).getDateCount());
    }
    public static Map<Person,Person> matcher(int num1, int num2, ArrayList<Person> personList){

        Person person1 = personList.get(num1);
        Person person2 = personList.get(num2);

        Map<Person,Person> returnPerson = new HashMap<Person,Person>();
        returnPerson.put(person1,person2);
        return returnPerson;

    }
    public static int randomNumber(){
        int num = new Random().nextInt(6);
        return num;
    }

    public static List<String> getActivity(){
        List<String> activities = new ArrayList<>();
        activities.add(" played chess with ");  activities.add(" visited ");  activities.add(" went to dinner with ");  activities.add(" tipped over a glass during a date with ");
        activities.add(" saw a movie with ");  activities.add(" went to a meetup with ");

       boolean check = false;
        ArrayList<String> returnActivities = new ArrayList<>();
       do{
        int num1 = new Random().nextInt(6);
        int num2 = new Random().nextInt(6);
        int num3 = new Random().nextInt(6);

            if(num1!=num2&&num2!=num3){
              returnActivities.add(activities.get(num1));
              returnActivities.add(activities.get(num2));
              returnActivities.add(activities.get(num3));
              check = false;
            } else {
                check = true;
            }
        }while(check);
    return returnActivities;
    }
}
