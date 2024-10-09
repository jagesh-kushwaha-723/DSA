import java.util.Arrays;

public class spiralmatrix {
    public static void main(String[] args) {
        int[] matrix={-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(matrix)));

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int i, top=0,bottom = matrix.length,left=0,right= matrix[0].length;
        while (top<bottom && left <right){
            for ( i = left; i < right ; i++) {
                res.add(matrix[top][i]);

            }
            top++;
            for ( i = top; i < bottom ; i++) {
                res.add(matrix[i][right-1]);
            }
            right--;
            if(left>=right || top >= bottom){
                break;
            }
            for ( i = right-1; i >=left ; i--) {
                res.add(matrix[bottom-1][i]);
            }
            bottom--;
            for ( i = bottom-1; i >=top ; i--) {
                res.add(matrix[i][left]);
            }
            left++;

        }
        return res;
    }
}
