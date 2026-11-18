import java.util.*;

class RecentCounter {
    ArrayList<Integer> arr = new ArrayList<>();

    public RecentCounter() {
        
    }

    public int ping(int t) {
        arr.add(t);

        int count = 0;

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) >= t - 3000 && arr.get(i) <= t) {
                count++;
            }
        }

        return count;
    }
}
