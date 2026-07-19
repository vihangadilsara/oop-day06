import java.util.*;
class Student{
	private String id;	
	private String name;	
	private int prfMarks;
	private int dbmsMarks;
	
	Student(){
		
	}
	Student(String id, String name, int prfMarks, int dbmsMarks){
		this.id=id;
		this.name=name;
		this.prfMarks=prfMarks;
		this.dbmsMarks=dbmsMarks;
	}
	public String getId(){
		return id;
	}
	public boolean equals(Object obj){
		Student student=(Student)obj;
		return id.equalsIgnoreCase(student.id);
	}
	public String toString(){
		return "["+id+","+name+","+prfMarks+","+dbmsMarks+"]";
	}
}

class Demo{
	public static void main(String args[]){
		ArrayList <Student>stList=new ArrayList<>();
		stList.add(new Student("S0001","Nimal",65,67));
		stList.add(new Student("S0002","Amal",85,70));
		stList.add(new Student("S0003","Bimal",35,30));
		stList.add(new Student("S0004","Ramal",55,70));
		stList.add(new Student("S0005","Anil",95,90));
		System.out.println(stList); 
		
		for (int i = 0; i < stList.size(); i++){
			Student s1=stList.get(i);
			System.out.println(s1);
		}
		
		stList.remove(new Student("S0003","Bimal",35,30));
		System.out.println(stList); 
	}
}
