// Main is the name of the class since it is the name of the file...
public class Main {
    public static void main(String args[]) {
        String name, gender;
        int age;
        float weight;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = s.nextLine();

        System.out.print("Enter gender: ");
        gender = s.nextLine();

        System.out.print("Enter age: ");
        age = s.nextInt();

        System.out.print("Enter weight");
        weight = s.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);

    }
}
