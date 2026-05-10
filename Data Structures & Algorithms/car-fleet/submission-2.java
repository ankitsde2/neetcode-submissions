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
        int n=position.length;
        List<Car> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(new Car(position[i],speed[i],(target-position[i])/(double)speed[i]));
        }
        Collections.sort(li,(a,b)->b.position-a.position);
        Deque<Car> st=new ArrayDeque<>();
        for(Car item: li){
            System.out.println(item.targetBy);
            if(st.isEmpty()) st.push(item);
            else if(!st.isEmpty() && st.peek().targetBy<item.targetBy){
                st.push(item);
            }
        }
        return st.size();
    }
}