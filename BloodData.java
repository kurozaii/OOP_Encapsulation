class BloodData{
    //private instance
    private String bloodType;
    private String rhFactor;

    public BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }
	
	//setter and getter for blood type
  	public void setBloodType(String bloodType){
  		this.bloodType = bloodType;
  	}
  	
  	public String getBloodType(){
  		return bloodType;
  	}
  	
  	//setter and getter for rhFactor
  	public void setRhFactor(String rhFactor){
  	 this.rhFactor= rhFactor;
  	}
  	
  	public String getRhFactor(){
  		return rhFactor;
  	}
  

    public void display(){
        System.out.println(getBloodType()+getRhFactor()+" is added to the blood bank.");
    }
}