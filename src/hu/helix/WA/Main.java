package hu.helix.WA;

public class Main {

    public static void main(String[] args) {

       /* int[] temperatures = new int[5];

        for (int i = 0; i < 5; i++) {
            temperatures[i] = i;


        }
        printArrayElements(temperatures);
        populateArray(temperatures);
        printMaxValue(temperatures);

    }


    private static void printArrayElements(int[] array) {

        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

    }

    private static void populateArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    private static void printMaxValue(int [] arr){
        int max=arr[0];
        for (int i=0;i<arr.length; ++i){
            if (max<arr[i]){
            max=arr[i];
            }
        }
        System.out.print(max);
    }*/

        User user1 = new User();
        User user2 = new User("Alma", "Béla", "jelszó", 25);
        User user3 = new User(user2);
        Useroperation useroperation= new Useroperation();

        Useroperation userOperation = new Useroperation();
        userOperation.printUserArray(userOperation.generateUserArray(10));

        /*User testUser = useroperation.createRandomUser();
        System.out.println(testUser.getFirstname());
        System.out.println(testUser.getLastname());
        System.out.println(testUser.getPassword());
        System.out.println(testUser.getAge());*/
    }

}
