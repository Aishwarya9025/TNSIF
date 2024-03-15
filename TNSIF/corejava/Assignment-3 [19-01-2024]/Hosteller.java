class Hosteller extends Student
	{
		private int roomNumber;
		private char blockName;
		private String roomType;

		public int getroomNumber()
		{
			return roomNumber;
		}
		public void setroomNumber(int roomNumber)
		{
			this.roomNumber = roomNumber;
		}

		public char getblockName()
		{
			return blockName;
		}
		public void setblockName(char blockName)
		{
			this.blockName = blockName;
		}

		public String getroomType()
		{
			return roomType;
		}
		public void setroomType(String roomType)
		{
			this.roomType = roomType;
		}

		Hosteller(int studentId,String studentName,String department,String gender,String category,double collegeFee,int roomNumber,char blockName,String roomType)
		{
			super(studentId,studentName,department,gender,category,collegeFee);
			
			/*this.studentId = studentId;
			this.studentName = studentName;
			this.department = department;
			this.gender = gender;
			this.category = category;
			this.collegeFee = collegeFee;*/
			this.roomNumber = roomNumber;
			this.blockName = blockName;
			this.roomType = roomType;
		}
		
		
		public double calculateTotalFee()
		{
			if(blockName=='A')
			{
				if(roomType.equals("AC"))
				{
					return collegeFee+60000+8000;
				}
				else
					return collegeFee+60000;
			}
			if(blockName=='B')
			{
				if(roomType.equals("AC"))
				{
					return collegeFee+50000+8000;
				}
				else
					return collegeFee+50000;
			}
			if(blockName=='C')
			{
				if(roomType.equals("AC"))
				{
					return collegeFee+40000+8000;
				}
				else
					return collegeFee+40000;
			}
			return 0.0;
		}
	}