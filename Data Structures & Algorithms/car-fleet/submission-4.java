class Solution {
    class Car {
        int position;
        int speed;
        double targetBy;

        Car(int position, int speed, double targetBy) {
            this.position = position;
            this.speed = speed;
            this.targetBy = targetBy;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        List<Car> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            li.add(new Car(position[i], speed[i], (target - position[i]) / (double) speed[i]));
        }
        Collections.sort(li, (a, b) -> b.position - a.position);
        int fleet = 0;
        double prevFleetTime = 0.0;
        for (Car item : li) {
            if (item.targetBy > prevFleetTime) {
                fleet++;
                prevFleetTime = item.targetBy;
            }
        }
        return fleet;
    }
}