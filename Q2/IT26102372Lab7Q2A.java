public class IT26102372Lab7Q2A{
	public static void main (String[] args){
	
	char value[][] = new char [4][5];
	
	int i,j;
	for(i=0;i< value.length;i++){
		for (j =0;j< value[i].length;j++){
			value[i][j] = '$';
		System.out.print(value[i][j] + " ");
		}
		System.out.println();
	}
	}
}