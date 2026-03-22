class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum1 = 0, sum2 = 0;
        if(start > destination){
            int temp = start;
            start = destination;
            destination = temp;
        }
        for(int i = start; i < destination; i++){
            sum1 += distance[i];
        }
        for(int i = destination; i != start; i = (i + 1) % distance.length){
            sum2 += distance[i];
        }
        return Math.min(sum1, sum2);
    }
}