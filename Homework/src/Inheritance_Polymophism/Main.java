/**
 * 
 */
package Inheritance_Polymophism;


/**
 * @author : Thanh
 * @date   : Jan 17, 2023
 * 
 */


public class Main{
	public static void main(String[] args) {
		Instrument arr[] = new Instrument[10];
		
		arr[0] = new Piano();
		arr[1] = new Piano();
		arr[2] = new Piano();
		arr[3] = new Guitar();
		arr[4] = new Guitar();
		arr[5] = new Guitar();
		arr[6] = new Guitar();
		arr[7] = new Flute();
		arr[8] = new Flute();
		arr[9] = new Flute();
		
		
		//for each loop used when dont know how many time the loop
		/*for(Instrument i: arr) {
			i.play();
			
			System.out.println("This instrument is a " + i.getClass().getName());
		}*/
		
		for(int i = 0; i < arr.length; i++)
		{
			// Play each instrument
			arr[i].play();
			
			// Print which object at which index
			/*if ( arr[i] instanceof Piano )
			{
				System.out.println("index " + i+ " will be Piano");
			}
			else if (arr[i] instanceof Guitar) {
				System.out.println("index " + i+ " will be Guitar");
			}
			else if (arr[i] instanceof Flute) {
				System.out.println("index " + i+ " will be Flute");
			}
			else {
				System.out.println("Index " + i+ " will be Unknown.  THIS SHOULDN'T HAPPEN!!!!!");
			}*/
			
			String instrument_type = "Unknown";
			if ( arr[i] instanceof Piano )
			{
				instrument_type = "Piano";
			}
			else if (arr[i] instanceof Guitar) {
				instrument_type = "Guitar";
			}
			else if (arr[i] instanceof Flute) {
				instrument_type = "Flute";
			}
			
			System.out.println("Index " + i + " will be " + instrument_type);
		}
	}
}

abstract class Instrument {
	abstract void play();
}

class Piano extends Instrument {

	@Override
	void play() {
		System.out.println("Piano is playing tan tan tan tan");
	}
}

class Flute extends Instrument {

	@Override
	void play() {
		System.out.println("Flute is playing toot toot toot toot");
	}
	
}

class Guitar extends Instrument {

	@Override
	void play() {
		System.out.println("Guitar is playing tin tin tin ");
	}
	
}



