package busRes;

public class Bus {
	
	//instance variable
	private int busNo;
	private boolean ac; 
	private int capacity; //get and set... 
	//get method =  get data and return it.... 
	//set method = get data ad stored it.
	
	//constructor
	Bus(int no, boolean ac, int cap){
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	//methods
	public int getBusNo(){ //accessor method
		return busNo;
	}
	public boolean isAc(){
		return ac;
	}
	public int getCapacity(){ //accessor method
		return capacity;
	}
	public void setCapacity(int cap){ //mutator method
		capacity = cap;
	}
	public void DisplayBusInfo() {
		System.out.println("Bus no: " + busNo + " Ac: " + ac + " Total Capacity: "+capacity);
	}
	
	

}
