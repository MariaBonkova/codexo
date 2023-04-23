package codexo.elf;

import java.util.*;

public class ElfWorlds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w1 = scanner.nextLine();
        String w2 = scanner.nextLine();

        char[] first = w1.toLowerCase().toCharArray();
        char[] second = w2.toLowerCase().toCharArray();

        int minLength = Math.min(first.length, second.length);
        int sum = first.length+second.length;

        Set<Character> result = new HashSet<>();

            for (int j = 0; j < minLength-1; j++) {
                for (int i = 0; i < minLength-1; i++) {
                if (first[i] == second[j]) {
                    result.add(first[i]);
                }
            }
        }
        System.out.println(sum-result.size()*2);
    }
}
