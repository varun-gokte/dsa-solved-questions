import java.util.*;
class Hotel_Bookings_Possible
{
    boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        for (int i=0; i<arrive.size(); i++)
        {
            if (i+K<arrive.size() && arrive.get(i+K)<=depart.get(i))
                return false;
        }
        return true;
    }
}