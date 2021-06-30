public class Animal 
{
	void Legs()
	{
		System.out.println("Animal has legs");
	}
	void Eat()
	{
		System.out.println("Animal eat..");
	}
	void Sleep()
	{
		System.out.println("Every animal sleeps for 8 hours");
	}
	void Breath()
	{
		
	}
	public void Animal() {
		// TODO Auto-generated method stub
		
	}
}
class Fish extends Animal
{
	private Object Breath;

	void Layeggs()
	{
		System.out.println("Fish lay eggs");
		this.Breath=Breath;
	}
	
	void Swim()
	{
		System.out.println("Fish Swim in the Water");
	}
}
class Amphibians extends Animal
{
	void SmoothSkin()
	{
		System.out.println("Amphibians has Smooth Skin");
	}
	void LayEggsInWater()
	{
		System.out.println("Lay eggs in Water");
	}
}
class Reptiles extends Animal
{
	void LayEggs()
	{
		System.out.println("Reptiles Lay eggs");
	}
	void ColdBlooded()
	{
		System.out.println("ColdBlooded");
	}
}
class Snakes extends Reptiles
{
	private Object Breath;

	void Climb()
	{
		System.out.println("Snakes can Climb Trees");
		this.Breath=Breath;
	}
}
class Mammals extends Animal
{
	void GivesBirth()
	{
		System.out.println("It gives birth");
	}
	void Hair()
	{
		System.out.println("All Mammals have Hair");
	}
}
class Humans extends Mammals
{
	private Object Legs;

	void Think()
	{
		System.out.println("Humans can Think");
		this.Legs= Legs;
	}
}
class Birds extends Animal
{
	void LayEggs()
	{
		System.out.println("All Birds Lay Eggs");
	}
	void Fly()
	{
		System.out.println("Birds Fly in the Sky");
	}
	void WarmBlodded()
	{
		System.out.println("WarmBloded");
	}
}

