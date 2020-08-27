package LearnStatic;

public class OverRidingEx 
{

	public static void main(String[] args) {
		OldCarFeatures OC=new OldCarFeatures();		
		NewCarFeatures NC=new NewCarFeatures();
		OldCarFeatures NOC=new NewCarFeatures(); ///upcasting 
		OldCarFeatures nes=NC;
		
		System.out.println(nes);
		System.out.println(NC);
		System.out.println("old Car Features: ");
		OC.cost();
		OC.SeatingCapacity();
		OC.SpeedLimit();
		System.out.println("-------------------------------");
		System.out.println("New Car Features: ");
		NC.cost();
		NC.SeatingCapacity();
		NC.SpeedLimit();
		System.out.println("-------------------------------");
		System.out.println("new car features=============");
		NOC.cost();
		NOC.SeatingCapacity();
		NOC.SpeedLimit();
		System.out.println("new one");
		NC.Newon();
		((NewCarFeatures) NOC).Newon();
		
		
	}

}

class OldCarFeatures // Parent class
{
	void SpeedLimit()
	{
		String limit="500kmph";
		System.out.println("Speed limit of car "+ limit);
	}
	void SeatingCapacity()
	{
		int SC=4;
		System.out.println("Seating capacity of car :"+ SC);
	}
	void cost()
	{
		int CostC=10000;
		System.out.println("Cost od the car :"+ CostC);
	}
	
	
	
}
class NewCarFeatures  extends OldCarFeatures//Child class
{
	void SpeedLimit()
	{
		String limit="1000kmph";
		System.out.println("Speed limiy of the car:" +limit);
	}
	void Newon()
	{
		System.out.println("method for child class");
	}
	
}
