package examples.oop.relations_between_classes;

/**
 * Created by burdun on 20.07.2015.
 */

class Plate {}

class DinnerPlate extends Plate {}

class Utensil {}

class Spoon extends Utensil {}

class Fork extends Utensil {}

class Knife extends Utensil {}

class Custom {}


public class PlaceSettings extends Custom {
    private Spoon sp;
    private Fork frk;
    private Knife kn = new Knife();
    private DinnerPlate pl = new DinnerPlate();

    public class InnerClass {}
}
