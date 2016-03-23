
public class TheBrokenStickProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int total = 0;
				int trueCount=0;
				int falseCount=0;
				for(int i=0; i<10
						; i++){
					int low=0;
					int high = 1000;
					
					int break1 = (int) (Math.random()*1001);
					System.out.println("Break ones length is " + break1);
			
					int low1=low;
					int high1=break1;
					int stick1length = high1-low1;
					
					int low2=break1;
					int high2=high;
					int stick2length = high2-low2;
					int break2;
					
					System.out.println("stick1length is; " + stick1length);
					System.out.println("stick2length is; " + stick2length);
					
					int stick3length=0;
					
					if(stick1length>stick2length){
						break2 = (int)(Math.random()*high1);
						System.out.println("Break two's value is " + break2);
						low1=low;
						high1=break2;
						stick1length = high1-low1;
						
						int low3=break2;
						int high3=break1;
						stick3length = high3-low3;
						
					}
					else{
						int break3 = (int)((Math.random()*(1000 - low2)+low2));
						System.out.println("Break 3's value is " + break3);
						
						low2=break1;
						high2=break3;
						stick2length = high2-low2;
						
						int low3=break3;
						int high3=high;
						stick3length = high3-low3;
										
						}
	
					//System.out.println(stick1length);
					//System.out.println(stick2length);
					//System.out.println(stick3length);
					System.out.println("Total stick length is; " + (stick3length+stick2length+stick1length));
					
							
						if(isTriangle(stick1length, stick2length, stick3length)){
							trueCount++;
							total++;
						}
						else{
							falseCount++;
							total++;
						}
						
				}
				
				double prob = (double) trueCount/total;
				//System.out.println();
				System.out.println("True count is ; " + trueCount);
				System.out.println("False count is ; " + falseCount);
				//System.out.println();
				System.out.println(total);
				System.out.println("The probability of a triangle is " + prob);
				
			}
			
			public static boolean isTriangle(int a, int b, int c){
				
				if(a+b>c && b+c>a && a+c>b){
					return true;
				}
				else{
					return false;
				}
			}
}
