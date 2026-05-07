
class TimeMap {
    class Pair {
        int timestamp;
        String value;
        Pair(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }
    private Map<String, List<Pair>> tm;
    public TimeMap() {
        tm = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        tm.putIfAbsent(key, new ArrayList<>());
        tm.get(key).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!tm.containsKey(key))
            return "";
        List<Pair> list = tm.get(key);
        int low = 0;
        int high = list.size() - 1;
        String ans = "";
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid).timestamp <= timestamp) {
                ans = list.get(mid).value;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
