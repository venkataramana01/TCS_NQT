public class Dog extends Animal{
    String color;
    Dog(String color){
        super("Dog",25);
        this.color = color;
    }
    @Override
    void bark(){
//        super.bark();
        System.out.println(color + " dog is barking");
    }
    public static void main(String[]args){
        Dog dog = new Dog("red");
        dog.bark();
    }
}
