public class Loader {
    public static void main(String[] args) {
        System.out.println("Через массив массивов: ");
        String letters[][] = {
                {"A", "B", "C", "D", "E", "F", "G", "H"},
                {"A", "B", "C", "D", "E", "F", "G", "H"},
                {"A", "B", "C", "D", "E", "F", "G", "H"},
                {"A", "B", "C", "D", "E", "F", "G", "H"},
                {"A", "B", "C", "D", "E", "F", "G", "H"},
                {"A", "B", "C", "D", "E", "F", "G", "H"},
                {"A", "B", "C", "D", "E", "F", "G", "H"},
                {"A", "B", "C", "D", "E", "F", "G", "H"}
        };
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for(int i=7; i>=0; i--){
            for(int j=0; j<8; j++){
                System.out.print(letters[i][j] + numbers[i] + " ");
            }
            System.out.println();
        }

        System.out.println("\nЧерез 2 отдельных массива: ");
        int numbers1[] = {1, 2, 3, 4, 5, 6, 7, 8};
        String letters1[] = {"A", "B", "C", "D", "E", "F", "G", "H"};
        for (int i=letters1.length-1; i>=0; i--){
            for (int j=0; j<letters1.length; j++){
                System.out.print(letters1[j] + numbers1[i] + " ");
            }
            System.out.println();
        }
    }
}