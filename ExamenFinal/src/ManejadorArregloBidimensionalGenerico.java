/*
 * Rodrigo
 * Dec2018
 * MABG
 */
public class ManejadorArregloBidimensionalGenerico {
	
	public static <T> boolean esTridiagonal (T [][] matriz, int tRen, int tCol) {
		boolean res = false;
		int fil=1;
		int col=0;
		
		if(tRen==tCol) {
			int i=0;
			int j=0;
			while(i<tCol-1) {
				i++;
				while(j<tCol-1) {
					j++;
					if(matriz [i][j]!=null && matriz [fil][j]!=null && matriz[i][col]!=null) {
						while(fil<tRen-1 && col<tCol-1) {
							fil++;
							col++;
						}
					}
					else {
						res=false;
						i=0;
						j=0;
					}
				}
				
			}
			if(i==tRen-1 && j==tCol-1)
				res=true;
		}
		
		return res;
	}

	public static void main(String[] args) {
		String  [] [] mat = {{"uno","uno",null,null,null},{"uno","uno","uno","dos",null},{null,"uno","uno","uno",null},{"dos",null,"uno","uno","uno"},{null,"tres","dos","uno","uno"}};
		String  [] [] mat2 = {{"uno","uno",null,null,null},{"uno","uno","uno","dos",null},{null,"uno",null,"uno",null},{"dos",null,"uno","uno",null},{null,"tres","dos","uno","uno"}};
		
		System.out.println("Es tridiagonal: "+esTridiagonal(mat,mat[0].length,mat.length));
		System.out.println("Es tridiagonal: "+esTridiagonal(mat2,mat2[0].length,mat2.length));
	}

}
