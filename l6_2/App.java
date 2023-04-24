public class App {

    public static void main(String[] args) {
        User a = new User("asf", "dfg");
        Manager mg = new Manager("Ivan", "Ivanov", 3);
        Coder cod = new Coder("Vasy", "Petrov", false);

        System.out.println(a.toStr());
        System.out.println(mg.toStr());
        System.out.println(cod.toStr());
    }
}

class ENV {
    static int ID = 1;
}

class User {
    int id;
    String firstName;
    String lastName;

    User(String firstName, String lastName) {
        this.id = ENV.ID;
        ENV.ID++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String toStr() {
        return this.id + ":" + this.firstName + " " + this.lastName;
    }
}

class Manager extends User {
    private int stage;

    Manager(String firstName, String lastName, int stage) {
        super(firstName, lastName);
        this.stage = stage;
    }

    String toStr() {
        return "Manager:" + this.id + ":" + this.firstName + " " + this.lastName + " Stage " + this.stage;
    }
}

class Coder extends User {
    boolean work;

    Coder(String firstName, String lastName, boolean work) {
        super(firstName, lastName);
        this.work = work;
    }

    String toStr() {
        return "Coder:" + this.id + ":" + this.firstName + " " + this.lastName + " work " + this.work;
    }
}