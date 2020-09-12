import java.util.Arrays;
public class twosum
{
	public static int[]twoSum(int[]num, int sum){

		int [] ret = new int [2];//new array to return the values in the num array that sum equal the target number
		int [] non = new int [1];//array with -1 for no solution
		non[0]=-1;
		
		for(int i = 0;i<num.length-1;i++){//for loop to keep pointer i

			for(int j = 0; j<num.length;j++){//for loop for pointer j that will proceed for every i

				if((j+1)!=num.length){//to accept the last slot of the array

					if(num[i]!=num[j+1]){//if values are duplicates, don't add

						if((num[i]+num[j+1])==sum){//checks whether values are equal to target and if so will add to the ret array as the array placement number, not the value number
							ret[0]=i;
							ret[1]=j+1;
						}

					}else{
						
						j+=1;//will move on if duplicate
					
					}
				}else{

					if(num[i]!=num[j]){

                    	if((num[i]+num[j])==sum){

                        	ret[0]=i;
                        	ret[1]=j;
                    	
                    	}
                  	
                  	}

				}
			
			}
		
		}
		if((ret[0])==0 && (ret[1]==0)){//if no solution, return -1
			
			return non;

		}else{

			return ret;

		}		
			
	}
	
	public static void main(String[]args){

		int [] num = {2, 12, 8, 7};
		int sum = 9;
		int [] ret = twoSum(num,sum);
		System.out.println(Arrays.toString(ret));//prints ret
	
	}
}