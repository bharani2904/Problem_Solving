class Solution {
    private int getDistance(int[] p1, int[] p2) {
    return (p1[0]-p2[0])*(p1[0]-p2[0])+(p1[1]-p2[1])*(p1[1]-p2[1]);
    }

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
      HashSet<Integer> distances=new HashSet<>();
      
      distances.add(getDistance(p1,p2));
      distances.add(getDistance(p1,p3));
      distances.add(getDistance(p2,p3));
      distances.add(getDistance(p2,p4));
      distances.add(getDistance(p3,p4));
      distances.add(getDistance(p1,p4));

      return distances.size()==2 && !distances.contains(0);
    }
}