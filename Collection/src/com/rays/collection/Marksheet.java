package com.rays.collection;

public class Marksheet implements Comparable<Marksheet> {
	private int rollno;
	private String fname;
	 private int physics;
	 private int chemistry;
	 private int maths;
		 
	     public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		
		public int getPhysics() {
			return physics;
		}
		public void setPhysics(int physics) {
			this.physics = physics;
		}
		public int getChemistry() {
			return chemistry;
		}
		public void setChemistry(int chemistry) {
			this.chemistry = chemistry;
		}
		public int getMaths() {
			return maths;
		}
		public void setMaths(int maths) {
			this.maths = maths;
		}
		/*@Override
		public String toString() {
			return "Marksheet [rollno=" + rollno + ", fname=" + fname + ", physics=" + physics + ", chemistry="
					+ chemistry + ", maths=" + maths + "]";
		}*/
		
		
			
			
      public int compareTo(Marksheet m1){
    	  return fname.compareTo(m1.getFname());
    	  
      }
}



