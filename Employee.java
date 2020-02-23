
public class Employee {
	int eid;
	String name;
	static String ceo;

	public Employee() {
		super();

	}

	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}

	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}

	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ceo
	 */
	public static String getCeo() {
		return ceo;
	}

	/**
	 * @param ceo the ceo to set
	 */
	public static void setCeo(String ceo) {
		Employee.ceo = ceo;

	}

	public void show() {
		System.out.println(eid + " : " + name + " : " + ceo);
	}
	// }
	// @Override
	// public String toString() {
	// return "Employee [eid=" + eid + ", name=" + name + ", getEid()=" + getEid() +
	// ", getName()=" + getName()
	// + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ",
	// toString()=" + super.toString()
	// + "]";

	
}

// public static void main(String[] args) {     




