package test;

import java.util.*;

public class problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // 读取数据组数
        scanner.nextLine(); // 处理换行

        while (T-- > 0) {
            int n = scanner.nextInt();  // 读取单词数量
            scanner.nextLine(); // 处理换行
            Map<String, Integer> wordCount = new HashMap<>();
            Map<Character, Integer> letterFrequency = new HashMap<>();
            Set<Character> uniqueLetters = new HashSet<>();

            for (int i = 0; i < n; i++) {
                String word = scanner.nextLine();  // 读取每个单词
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);  // 统计单词出现次数
                for (char ch : word.toCharArray()) {
                    uniqueLetters.add(ch);  // 收集出现的字母
                    letterFrequency.put(ch, letterFrequency.getOrDefault(ch, 0) + 1); // 统计字母出现频率
                }
            }

            System.out.println(maxLengthOfRecognizedWords(wordCount, uniqueLetters, letterFrequency));
        }

        scanner.close();
    }

    private static int maxLengthOfRecognizedWords(Map<String, Integer> wordCount, Set<Character> uniqueLetters, Map<Character, Integer> letterFrequency) {
        int maxLength = 0;
        List<Map.Entry<Character, Integer>> letterList = new ArrayList<>(letterFrequency.entrySet());

        // 按字母频率降序排序
        letterList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int size = letterList.size();

        // 从出现的字母中组合三个字母
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    Set<Character> knownLetters = new HashSet<>();
                    knownLetters.add(letterList.get(i).getKey());
                    knownLetters.add(letterList.get(j).getKey());
                    knownLetters.add(letterList.get(k).getKey());

                    int totalLength = 0;

                    // 计算认识的单词总长度
                    for (String word : wordCount.keySet()) {
                        boolean recognizable = true;
                        for (char ch : word.toCharArray()) {
                            if (!knownLetters.contains(ch)) {
                                recognizable = false;
                                break;
                            }
                        }
                        if (recognizable) {
                            totalLength += word.length() * wordCount.get(word); // 累加出现次数
                        }
                    }
                    maxLength = Math.max(maxLength, totalLength);
                }
            }
        }

        return maxLength;
    }
}
