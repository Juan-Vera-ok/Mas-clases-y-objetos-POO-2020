public class Test1Animal {
  public static void main(String[] args)
  {
     adoptaAnimal(new Armadillo());
     Object o = new Armadillo();
     Armadillo a1 = new Animal();
     Armadillo a2 = new Muflon();
   }
private static void adoptaAnimal(Animal a){
    System.out.println("Ven, cachorrito!");
}
}


//adoptaAnimal(new Armadillo()); no provoca error debido a que el parametro que se intruduce "Armadillo()" 
//es del tipo Animal porque la clase Armadillo es hija de dicha clase


//Object o = new Armadillo(); no provoca error debido a que Armadillo es del tipo Object

//Armadillo a1 = new Animal(); provoca error porque Animal() no es del tipo Armadillo

//Armadillo a2 = new Muflon(); provoca error porque Muflon() no es del tipo Armadillo


//private static void adoptaAnimal(Animal a){
//System.out.println("Ven, cachorrito!");
//}
//No provoca error debido a que adoptaAnimal(Animal a) el parametro "a" es del tipo animal 