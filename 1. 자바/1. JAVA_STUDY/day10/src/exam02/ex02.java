package exam02;

public class ex02 {
    public static void main(String[] args){
  /*    Animal[] animals = new Animal[3];
        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Bird();
        */
        Animal[] animals = {new Human(), new Tiger(), new Bird()};

        for(Animal animal : animals){

            animal.move();
            if(animal instanceof Human){
            Human human = (Human) animal;
            human.readBook();
            }

            if(animal instanceof Tiger
            ){
            Tiger tiger = (Tiger) animal;
            tiger.hunting();
            }
        }
    }
}
