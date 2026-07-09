// Last updated: 7/9/2026, 11:24:44 AM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[] arr=new int[matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                    if(matrix[j][i]>max){
                        max=matrix[j][i];
                    }
            }
            arr[i]=max;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=arr[j];
                }
            }
        }
        return matrix;
    }
}