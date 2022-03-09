//Дано энное количество в массиве.
// Задача: Вычислить количество от минимального к максимальному.

public class Minmax {

    public static void main(String[] args) {

        int[] dress = {45, 34, 2, 98, 5, 0, 13, 65, 43};

        int n = dress.length;
        int lager = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (dress[i] > dress[j]) {
                    lager = dress[j];
                    dress[j] = dress[i];
                    dress[i] = lager;
                }
            }
            System.out.print("/" + dress[i]);
        }

    }
}
