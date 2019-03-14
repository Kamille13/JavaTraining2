package exercices;

public class Person {

    private String name;
    private int age;
    private boolean wilder;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.wilder = true;
    }
    public String getName(){
        return name;
    }
    public void setName(String nameValue){
        this.name = nameValue;
    }    
    public int getAge(){
        return age;
    }
    public void setAge(int ageValue){
        this.age = ageValue;
    }
    public boolean isWilder(){
        return wilder;
    }
    public void setWilder(boolean wilderValue){
        this.wilder = wilderValue;
    }
    public String whoAmI(){
        return "My name is " +name+ " and I'm " + age ;
    }


    // TODO 9. Create a method 'whoAmI' that returns "My name is {name} and I'm {age}"
    // where you replace {name} and {age} with attributes values




    // Do not remove this empty constructor !
    public Person() {
    }
}
