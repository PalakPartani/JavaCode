//Gambler code
package com.bridgelabz.fellowshipprograms.functional;
import java.util.Scanner;

public class Gambler {

    	public static void main(String[] args)
    	{
    		int stake,goal,trial;
    		int win=0,loss=0;
    		int total=0;
    		Scanner scobj=new Scanner(System.in);
    		System.out.println("Enter the stake value:");
    		stake=scobj.nextInt();
    		System.out.println("Enter the goal value:");
    		goal=scobj.nextInt();
    		System.out.println("Enter the trial value:");
    		trial=scobj.nextInt();
    		//Checking for initial value
    		if(stake>0)
    		{
    			if(goal>stake)    
    			{
    				if(trial!=0)
    				{
    					for(int i=0;i<trial;i++)
    					{
    						total++;
    						if(Math.random()>0.5)
    						{
    						stake++;
							win++;
    						}
							else
							loss++;
						    stake--;	
							
    						if(stake==goal)
    						{
    							System.out.println("You won");
    							
    							break;
    						}
    						if(stake==0)
    						{
    							System.out.println("You loss");
    							
    						}
    				
    				}
    					System.out.println("win percent is"+(win*100.00)/total);
    					System.out.println("loss percent is"+(loss*100.00)/total);
                        scobj.close();
    			}
    				else
    					System.out.println("Please enter trail greater than 0");

    		}
    			else
    				
					System.out.println("Please enter goal greater than stake");
    			

    		
    		
    	}
    		else
				System.out.println("Please enter stake greater than 0");

    	}
    }