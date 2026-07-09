// Last updated: 7/9/2026, 11:26:17 AM
import java.util.*;

class Solution {
 
    private int[] findSlope(int[] p1, int[] p2) {
        int dy = p2[1] - p1[1];
        int dx = p2[0] - p1[0];
        
        if (dx == 0) {
            return new int[]{1, 0};
        }
     
        if (dy == 0) {
            return new int[]{0, 1};
        }
       
        int g = gcd(Math.abs(dy), Math.abs(dx));
        dy /= g;
        dx /= g;
       
        if (dx < 0) {
            dy = -dy;
            dx = -dx;
        }
        
        return new int[]{dy, dx};
    }
    
   
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) {
            return n;
        }
        
        int maxPoints = 0;
     
        for (int i = 0; i < n; i++) {
            Map<String, Set<String>> slopes = new HashMap<>();
            
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                
                int[] slope = findSlope(points[i], points[j]);
                String slopeKey = slope[0] + "," + slope[1];
 
                slopes.computeIfAbsent(slopeKey, k -> new HashSet<>())
                    .add(points[i][0] + "," + points[i][1]);
                slopes.computeIfAbsent(slopeKey, k -> new HashSet<>())
                    .add(points[j][0] + "," + points[j][1]);
            }
            
            for (Set<String> pts : slopes.values()) {
                maxPoints = Math.max(maxPoints, pts.size());
            }
        }
        
        return maxPoints;
    }
}

