
public class Cars {
	

		private String Make;
		private String Model;
		private double EngineSize;
		private String EngineType;		
		private String CarRegNum;
		
		public Cars() // constructor
		{
			
		}
		// second constructor with make / model/engine size/engine type setting carRegnum to null
		public Cars(String make, String Mod,double EngineSize, String EngineType)
		{
			this.Make = make;
			this.Model = Mod;
			this.EngineSize = EngineSize;
			this.EngineType = EngineType;
			this.CarRegNum = null;
		}
		// third constructor passing in all parameters  make / model/engine size/engine type and setting carRegnum to cars object
		public Cars(String make, String Mod,double EngineSize, String EngineType, String comCarReg)
		{
			this.Make = make;
			this.Model = Mod;
			this.EngineSize = EngineSize;
			this.EngineType = EngineType;
			this.CarRegNum = comCarReg;
		}
		
		public void setMake(String makeName)
		{
			this.Make = makeName;
		}
		
		public void setModel(String ModType)
		{
			this.Model = ModType;
		}
		
		public void setEngineSize(double EngSize )
		{
			this.EngineSize = EngSize;
		}
		
		public void setEngineType(String type)
		{
			this.EngineType = type;
		}
		
		
		public void setCarReg(String reg)
		{
			this.CarRegNum = reg;
		}
		
		public String getMake()
		{
			return this.Make;
		}
		
		public String getModel()
		{
			return this.Model;
		}
		
		public double getEngineSize()
		{
			return this.EngineSize;
		}
		
		public String getEngineType()
		{
			return this.EngineType;
		}
		
		
		public String getCarReg()
		{
			return this.CarRegNum;
		}
		
		public String toString()
		{
			return " car Make: " + this.Make + "\n Car model: " + this.Model 
					+ "\n Engine Size: " + this.EngineSize + "\n Engine Type: " + this.EngineType 
				
					+ "\n Car Reg: " + this.CarRegNum;
		}
		
		
		
	}

	
	
	
	
	


