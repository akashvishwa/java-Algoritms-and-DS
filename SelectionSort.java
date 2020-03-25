public class SelectionSort{

	//the constructor consist of entire code in this specific program you can change it to other functions.
	public SelectionSort(int[] array){
		int temp;
		int min;
		//the main code is here
		for(int i=0;i<array.length;i++){
			min=i;
			for(int j=i;j<array.length;j++){
				//Finding the index of minimum element
				if(array[j]<=array[min]){
					min=j;
				}
			}
			temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}
		
		//Printing the sorted array
		System.out.print("The Array after Sorting is:");
		for(int i=0;i<array.length;i++)
			System.out.print(" "+array[i]);
		
	}
	
	
	public static void main(String...args){
		//creating the object of the class.
		int[] array={10,50,33,23,57,99,23,6};
		SelectionSort obj=new SelectionSort(array);//calling the constructor with unsorted array as parameter.
		
	}

}