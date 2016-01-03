//Winston Li, Alex Yi, Abhimanyu Choudhary - 3/29/14
//Purpose: To simulate losses from Earthquakes for 200 years
import java.util.Random;
public class Esim 
{
	public static void main(String[] arg)
	{
		int[] moderate = new int[200]; //create 3 arrays to store the number of earthquakes over 200 yrs
		int[] strong = new int[200];
		int[] severe = new int[200];
		
		for(int k = 0; k < 200; k++) //initially set all array values to 0
		{
			moderate[k] = 0;
			strong[k] = 0;
			severe[k] = 0;
		}
		
		for(int j = 0; j < 200; j++) //outer loop increments every year
		{
			double totaldamage = 0; //keep track of the total losses for the year
			Random rand = new Random();
			for(int i = 0; i < 12; i++) //loop increments through 12 months
			{
				boolean small = new Random().nextInt(1000) < 292; //randomly determine if there is a moderate quake
			
				if(small) //if a moderate quake occurs
				{
					moderate[j] = moderate[j]+1; //increase count of moderate earthquakes by 1
					
					double magnitude = new Random().nextInt(10) + 50; //random magnitude from 5.0-5.9
					magnitude = magnitude/10;
				
					double homeowners = 1843.74;//predicted number of homeowners 
				
					double damage = 11500*(Math.pow(10, magnitude -5.5)/3); //calculate the damage claim 
					totaldamage = totaldamage + (damage*homeowners); //total damage for all homeowners
				
					double mobile = 702.38; //number of mobile homes
					damage = 2000*(Math.pow(10, magnitude -5.5)/3); //calculate the damage claim 
					totaldamage = totaldamage + (damage*mobile); //total damage for all mobile homes
				
					double condo = 658.48; //condos affected
					damage = 8500*(Math.pow(10, magnitude -5.5)/3); //calculate the damage claim
					totaldamage = totaldamage + (damage*condo); //total damage for all condos
			
				
					double renter = 1185.26;
					damage = 1500*(Math.pow(10, magnitude -5.5)/3); //calculate the damage claim 
					totaldamage = totaldamage + (damage*renter); //total damage for all renters
				
				}
			
				boolean medium = new Random().nextInt(1000) < 33; //randomly check if there is a strong quake
			
				if(medium) //if there is a strong quake
				{
					strong[j] = strong[j]+1; //increase the strong quake count for that year by 1
					double magnitude = new Random().nextInt(10) + 60; //randomly select magnitude between 6.0 and 6.9
					magnitude = magnitude/10;
				
					double homeowners = 2581.24;//number of homeowners 
				
					double damage = 11500*(Math.pow(10, magnitude -5.5)/3); //calculate the damage claim 
					totaldamage = totaldamage + (damage*homeowners); //total damage for all homeowners
				
					double mobile = 983.33;//number of mobile homes
					damage = 2000*(Math.pow(10, magnitude -5.5)/3); //calculate the damage claim 
					totaldamage = totaldamage + (damage*mobile); //total damage for all mobile homes
				
					double condo = 921.87; //condos affected
					damage = 8500*(Math.pow(10, magnitude -5.5)/3); //calculate the damage claim 
					totaldamage = totaldamage + (damage*condo); //total damage for all condos
			
				
					double renter = 1659.37; //number of renters
					damage = 1500*(Math.pow(10, magnitude -5.5)/3); //calculate the damage claim 
					totaldamage = totaldamage + (damage*renter); //total damage for renters
				}
			
				boolean large = new Random().nextInt(1000) < 8; //randomly decide if a major earthquake occurs
			
				if(large)  //is there a major earthquake
				{
					severe[j] = severe[j]+1; //increase count of major earthquakes by 1
					double magnitude = new Random().nextInt(10) + 70; //randomly choose magnitude between 7.0 - 7.9
					magnitude = magnitude/10;
				
					double homeowners = 2949.99;//number of homeowners 
				
					double damage = 11500*(Math.pow(10, magnitude -5.5)/3); //calculate the damage claim 
					totaldamage = totaldamage + (damage*homeowners); //total damage for homeowners
				
					double mobile = 1123.8;//number of mobile homes
					damage = 2000*(Math.pow(10, magnitude -5.5)/3); //calculate the damage claim
					totaldamage = totaldamage + (damage*mobile); //total damage for mobile
				
					double condo = 1053.57; //condos affected
					damage = 8500*(Math.pow(10, magnitude -5.5)/3); //calculate the damage claim 
					totaldamage = totaldamage + (damage*condo); //total damage for condos
			
				
					double renter = 1896.42; //renters affected
					damage = 1500*(Math.pow(10, magnitude -5.5)/3); //calculate the damage claim 
					totaldamage = totaldamage + (damage*renter); //total damage for renters
				}
			}
			
			System.out.println(totaldamage); //print out the total losses for that year
		}
		System.out.println("Moderate Earthquakes"); //print out the number of moderate earthquakes 
		for(int i = 0; i < moderate.length; i++)
		{
			System.out.println(moderate[i]);
		}
		System.out.println("Strong Earthquakes"); //print out the number of strong earthquakes
		for(int i = 0; i < strong.length; i++)
		{
			System.out.println(strong[i]);
		}
		System.out.println("Major Earthquakes"); //print out number of major earthquakes
		for(int i = 0; i < severe.length; i++)
		{
			System.out.println(severe[i]);
		}
	}
}
