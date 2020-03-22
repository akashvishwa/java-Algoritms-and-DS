public class BubbleSort{
	//the constructor consist of entire code in this specific program you can change it to other functions.
	public BubbleSort(int[] array){
		int temp;
		//the main code is here
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-i-1;j++){
				//compairing current element with next element
				if(array[j]>=array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		//Printing the sorted array
		System.out.print("The Array after Sorting is:");
		for(int i=0;i<array.length;i++)
			System.out.print(" "+array[i]);
		
	}
	
	
	public static void main(String...args){
		//creating the object of the class.
		int[] array={10,50,33,23,57,99,23,6};
		BubbleSort obj=new BubbleSort(array);//calling the constructor with array as parameter.
		
	}

}