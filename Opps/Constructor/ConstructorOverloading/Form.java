package ConstructorOverloading;

class Form {
    String name;
    String email;
    String Location;
    Long Phno;
    String blood;
    double height;


    Form() {
        System.out.println("Form generated");
    }

    Form(String name, String email, String Location, Long Phno) {
        this.name = name;
        this.email = email;
        this.Location = Location;
        this.Phno = Phno;
    }

    Form(String name, String email, String Location, Long Phno, String blood) {
        this.name = name;
        this.email = email;
        this.Location = Location;
        this.Phno = Phno;
        this.blood = blood;
    }

    Form(String name, String email, String Location, Long Phno, String blood, double height) {
        this.name = name;
        this.email = email;
        this.Location = Location;
        this.Phno = Phno;
        this.blood = blood;
        this.height = height;
    }

    public void displayForm() {
        System.out.println(name);
        System.out.println(email);
        System.out.println(Location);
        System.out.println(Phno);
        System.out.println(blood);
        System.out.println(height);

    }

}
