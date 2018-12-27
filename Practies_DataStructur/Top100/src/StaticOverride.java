 class superclass {

    public void displayResult() {

        System.out.println("Printing from superclass");

    }

}

public class StaticOverride extends superclass {

    public void displayResult() {

        System.out.println("Displaying from subClass");
int I=0;
        super.displayResult();

    }

    public static void main(String args[]) {

    	StaticOverride obj = new StaticOverride();

        obj.displayResult();

    }

}