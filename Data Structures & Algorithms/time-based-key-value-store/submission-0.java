class TimeMap {
    private Map<String, Map<Integer, List<String>>> tm;
    public TimeMap() {
        tm = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!tm.containsKey(key)) {
            tm.put(key, new HashMap<>());
        }
        if (!tm.get(key).containsKey(timestamp)) {
            tm.get(key).put(timestamp, new ArrayList<>());
        }
        tm.get(key).get(timestamp).add(value);
    }

    public String get(String key, int timestamp) {
        if (!tm.containsKey(key))
            return "";
        int maxTime = 0;
        for (int time : tm.get(key).keySet()) {
            if (time <= timestamp)
                maxTime = Math.max(time, maxTime);
        }
        if (maxTime == 0)
            return "";
        int index = tm.get(key).get(maxTime).size() - 1;
        return tm.get(key).get(maxTime).get(index);
    }
}
