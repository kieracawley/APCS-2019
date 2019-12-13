public class SpreadSheet{

    public static void main(String [] args){
	// a is a 11 x 4
	// a represents a spreadsheet containing
	// the 3 test scores for 10 students.
	double[][] a = { 
	    { 99.0, 85.0, 98.0, 0.0 }, 
	    { 98.0, 57.0, 79.0, 0.0 }, 
	    { 92.0, 77.0, 74.0, 0.0 }, 
	    { 94.0, 62.0, 81.0, 0.0 }, 
	    { 99.0, 94.0, 92.0, 0.0 }, 
	    { 80.0, 76.5, 67.0, 0.0 }, 
	    { 76.0, 58.5, 90.5, 0.0 }, 
	    { 92.0, 66.0, 91.0, 0.0 }, 
	    { 97.0, 70.5, 66.5, 0.0 }, 
	    { 89.0, 89.5, 81.0, 0.0 },
	    {  0.0,  0.0,  0.0, 0.0 }
	};
	for (int i = 0; i < 3 ; i++){
	    String row = "";
	    for (int j = 0; j < 10; j++){
		row = row + a[j][i] + " ";
	    }
	    System.out.println(row);
	}
	double[] weights = {0.25,0.25, 0.5};
	for (int i=0; i<10; i++){
	    double  avg = 0;
	    for(int j = 0; j<3; j++){
		avg += a[i][j] * weights[j];
	    }
	    a[i][4] = avg;
	}
    }

}
