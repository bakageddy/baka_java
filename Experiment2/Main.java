import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String args[]) {
        int choice;
        do {
            choice = getChoice();
            if (choice == 1) {
                Programmer pp = new Programmer();
                pp.getDetails();
                pp.display();
            } else if (choice == 2) {
                Professor pp = new Professor();
                pp.getDetails();
                pp.display();
            } else if (choice == 3) {
                AssistantProfessor pp = new AssistantProfessor();
                pp.getDetails();
                pp.display();
            } else if (choice == 4) {
                AssociateProfessor pp = new AssociateProfessor();
                pp.getDetails();
                pp.display();
            } else {
                System.out.println("Wrong Input!");
                continue;
            }
        } while (choice != 5);
    }

    public static int getChoice() {
        int temp;
        System.out.println("1. Programmer");
        System.out.println("2. Professor");
        System.out.println("3. Assistant Professor");
        System.out.println("4. Associate Professor");
        System.out.println("5. Quit");
        System.out.println("Your choice: ");
        temp = s.nextInt();
        return temp;
    }
}

class Employee {
    String name, address, mailId;
    long id, phoneNo;
    double bp, da, hra, pf, clubFund, gross, net;
    public static Scanner s = new Scanner(System.in);

    public void getDetails() {
        System.out.print("Name: ");
        name = s.nextLine();
        System.out.print("Address: ");
        address = s.nextLine();
        System.out.print("Mail ID: ");
        mailId = s.nextLine();
        System.out.print("Employee ID: ");
        id = s.nextLong();
        System.out.print("Phone: ");
        phoneNo = s.nextLong();
        System.out.print("Basic Pay: ");
        bp = s.nextDouble();
    }

    public void display() {
        hra = 0.1 * bp;
        da = 0.97 * bp;
        pf = 0.12 * bp;
        clubFund = 0.1 * bp;
        gross = hra + da + bp;
        net = gross - pf - clubFund;
        System.out.println("Name: " + name);
        System.out.println("ID" + id);
        System.out.println("Phone No: " + phoneNo);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Basic Pay: " + bp);
        System.out.println("HRA: " + hra);
        System.out.println("DA" + da);
        System.out.println("PF: " + pf);
        System.out.println("Club Fund: " + clubFund);
        System.out.println("Gross: " + gross);
        System.out.println("Net Pay: " + net);
    }
}

class Programmer extends Employee {
    public void display() {
        System.out.println("Programmer Pay Slip: ");
        super.display();
    }
}

class Professor extends Employee {
    public void display() {
        System.out.println("Professor Pay Slip: ");
        super.display();
    }
}

class AssistantProfessor extends Employee {
    public void display() {
        System.out.println("Assistant Professor Pay Slip: ");
        super.display();
    }
}

class AssociateProfessor extends Employee {
    public void display() {
        System.out.println("Associate Professor Pay Slip: ");
        super.display();
    }
}
