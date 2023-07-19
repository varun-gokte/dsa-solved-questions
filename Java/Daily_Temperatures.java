import java.util.LinkedList;
import java.util.Queue;
class Daily_Temperatures
{
    int[] dailyTemperatures(int[] temperatures)
    {
        Queue<Integer> queue = new LinkedList<>();
        int current_index=0;
        int[] answers = new int[temperatures.length];
        while (current_index<temperatures.length)
        {
            if (!queue.isEmpty())
            {
                for (Integer previous_index : queue)
                    if (temperatures[current_index]>temperatures[previous_index] && answers[previous_index]==0)
                        answers[previous_index]=current_index-previous_index;
            }
            queue.offer(current_index);
            current_index++;
        }
        return answers;
    }
    
}






/*public static void main(String[] args) 
{
    Daily_Temperatures dt = new Daily_Temperatures();
    int[] temperatures={73,74,75,71,69,72,76,73};
    int[] answers=dt.dailyTemperatures(temperatures);
    for (int i=0; i<answers.length; i++)
        System.out.print (answers[i]+ " ");
}*/