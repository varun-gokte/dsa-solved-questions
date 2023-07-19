import java.util.*;
class Word_Ladder
{
    int ladderLength(String beginWord, String endWord, List<String> wordList)
    {
        HashSet<String> set = new HashSet<>();
        for (String word : wordList)
            set.add(word);
        if (!set.contains(endWord))
            return 0;

        Queue<String> queue = new java.util.LinkedList<>();
        queue.offer(beginWord);
        int level=1;

        while (!queue.isEmpty())
        {
            int len=queue.size();
            for (int i=0; i<len; i++)
            {
                String current=queue.poll();
                char[] arr=current.toCharArray();
                for (int j=0; j<arr.length; j++)
                {
                    char org_char=arr[j];
                    for (char c='a'; c<'z'; c++)
                    {
                        if (c==arr[j])
                            continue;
                        arr[j]=c;
                        String new_word=String.valueOf(arr);
                        if (new_word.equals(endWord))
                            return level+1;
                        if (set.contains(new_word))
                        {
                            queue.offer(new_word);
                            set.remove(new_word);
                        }
                    }
                    arr[j]=org_char;
                }
            }
            level++;
        }
        return 0;
    }
}