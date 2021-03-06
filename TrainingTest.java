abstract public class Training {

	//Parameterised Constructor 
	Training(String name,int fees){
		this.fees=fees;
		subject=name;
	}
	private int id;
	private String subject;
	public int fees;
	
	abstract public void disp();
	
}

public class PublicTraining extends Training{

	//Parameterised constructor
	 public PublicTraining(String name,int fees, int participants){
		super(name,fees);
		this.name=name;
		this.participants=participants;
		
	}
	
	//Instance members
	private String name;
	private int participants;
	private int cost;
	
	//getOrderValue Method
	public int getOrderValue(){
		this.cost=participants*fees;
		return cost;
	}
	
	//disp Method
	public void disp(){
		System.out.println("Training cost for "+name+" course is "+getOrderValue());
	}
}

public class CorporateTraining extends Training{
	
	//Parametric Constructor
	public CorporateTraining(String name,int fees, int days){
		 super(name,fees);
		this.name=name;
		this.days=days;
		
	}
	
	private int days;
	private int cost;
	private String name;
	
	//Method getOrderValue
	public int getOrderValue(){
		this.cost=days*fees;
		return cost;
	}
	
	//Method to display course
	public void disp(){
		System.out.println("Training cost for "+name+" course is "+getOrderValue());
	}

}


public class TrainingTest {
 
	public static void main(String args[]){
		Training publicTraining=new PublicTraining("Java",5000,50);
		publicTraining.disp();
		
		Training corporateTraining=new CorporateTraining("Big Data",35000,4);
		corporateTraining.disp();
		
	}
}

