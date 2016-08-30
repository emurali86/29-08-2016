class Person
{
String name,address;

Person(String name,String address)
{
this.name=name;
this.address=address;
}

public void setName(String name)
{
	this.name=name;
}

public String getName() 
{
	return name;	
}

public String getAddress()
{
	return address;
}
public void setAddress(String address) 
{
	this.address=address;
}

public String toString() 
{
      return name + " " + address;
   }

}


class Student extends Person
{
	String program;
	int year;
	double fee;

Student(String name,String address,String program,int year,double fee)
{
	super(name,address);
this.program=program;
this.year=year;
this.fee=fee;
}
public String getProgram()
{
	return program;
}
public void setProgram(String program)
{
	this.program=program;
}

public int getYear()
{
	return year;
}
public void setYear(int year)
{
	this.year=year;
}
public double getFee()
{
	return fee;
}
public void setFee(int fee)
{
	this.fee=fee;
}

public String toString() 
{
      return program+ " " + year+" "+fee;
   }


}


class Staff extends Person
{
	String school;
	double pay;

Staff(String name,String address,String school,double pay)
{
	super(name,address);
	this.school=school;
	this.pay=pay;
	
}

public String getSchool()
{
	return school;
}

public void setSchool(String school)
{
	this.school=school;
}

public double getPay()
{
	return pay;
}

public void setPay(double pay)
{
	this.pay=pay;
}

public String toString() 
{
      return school+ " " + pay;
   }


}


class HClass
{
public static void main(String args[])
{


Person p = new Person("dhasaradhi", "puttur");

Student st=new Student("abc","puttur","B.Tech",2014,40000);
Staff s=new Staff("dhasaradhi", "puttur","sietk",4000);

	 System.out.println(p.toString() + "\n");
        System.out.println(st.toString() + "\n");
        System.out.println(s.toString() + "\n");

}
}

