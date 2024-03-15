// class Solution {
//     public void rotate(int[][] matrix) {
//         int row_end= matrix.length-1;
//         int row_st = 0;
//         int col_st=0;
//         int col_end=matrix.length-1;
        
//         for(int i=0;i<matrix.length;i++){
//             for(int j = 0;j<matrix.length;j++){
//                 for(int m = 0;m<j;m++){
//                     matrix[row_st][m]= matrix[row_end][col_st];
//                     row_end--;
//                 }
//                 for(int k=0;k<j;k++){
//                     matrix[k][col_end]=matrix[row_st][col_st];
//                     col_st++;
//                 }
//                 for(int l= col_end;l>=col_end-j;i--){
//                     matrix[col_end][l]= matrix[row_st][col_end];
//                     row_st++;
// }
//                 for(int p= j;p>=0;p--){
//                     matrix[p][col_st]=matrix[row_end][col_end];
//                     col_end--;
// }
//             }
//         }
//         for(int i =0; i<matrix.length;i++){
// for(int j=0;j<matrix.length;j++){
// System.out.print(matrix[i][j]);}
//             System.out.println();
//         }
        
//     }
// }
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}
