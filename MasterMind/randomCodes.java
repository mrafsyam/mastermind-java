import java.util.Random;
import java.awt.Color;



public class randomCodes {
	char ColorArray[];

	public randomCodes() {


		///setup an array of 9 diff colors
		ColorArray = new char[8];
		ColorArray[0] = 'g';
		ColorArray[1] = 'y';
		ColorArray[2] = 'b';
		ColorArray[3] = 'w';
		ColorArray[4] = 'r';
		ColorArray[5] = 'p';
		ColorArray[6] = 'c';
		ColorArray[7] = 'o';

		

		/*//debug - display 
		for (int j=0; j<4; j++){
			System.out.println(ColorCodes[j]); 
		}*/	
	
	}




	//function to generate 4 random colors 
	public char[] getNonRepeatRandomColor(char[] ColorArray, int[] inArray){
		
		char ColorCodes[] = new char[4];

		for (int i=0; i<4; i++){
			ColorCodes[i] = ColorArray[inArray[i]];
		}

		return ColorCodes;
	}

	//function to generate 4 random int that represent color 
	public void getNonRepeatRandomNumber(int[] inArray){
		Random gen = new Random();
		int num;

		for (int i=0; i<4; i++){

			num = gen.nextInt(9)+0;

			//generate an int from 1-9 which isnt yet in IntArray
			for (int j=0; j<4; j++){
				while (num == inArray[j]){
					num = gen.nextInt(9)+1;

				}
			}

			inArray[i] = num;

			//debug - display : System.out.println(inArray[i]); 	
		}

	}


	//getters
	public char[] getRandomCodes(){
		//create and get an array of 4 int
		int IntArray[] = new int[4];
		getNonRepeatRandomNumber(IntArray);

		//generate an array of 4 random colors
		char ColorCodes[] = new char[4];
		ColorCodes = getNonRepeatRandomColor(ColorArray, IntArray);

		return ColorCodes;
	}



}