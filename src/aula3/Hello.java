package aula3;

public class Hello {
    public static void main(String[] args) {
        int[] ages = new int[3];
        ages[0] = 12;
        ages[1] = 22;
        ages[2] = 19;
        for (int i = 0; i < ages.length; i++) { //itar
            System.out.println("ages = " + ages[i]);
        }
        int[] qtsCats = {1, 0, 3};
        for (int cat:qtsCats) {
            System.out.println("cat = " + cat);
        }
        String[] names = {"Luisa", "Jhonatan", "Analu"};
        for (String name:names) {  //iter
            System.out.println("name = " + name);
        }
    }
}
