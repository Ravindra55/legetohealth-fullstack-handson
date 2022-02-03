package DaoEx;

public class EmployeeORMImpl implements EmployeeDao{
	public EmployeeORMImpl() {
		System.out.println("-----employeeORMImple constructor works---- ");
	}
	public void store() {
		System.out.println("--store() will call here to employeeORMimpl----");
	}
	public void delete() {
		System.out.println("----delete()will call here to employeeORMimpl----");
	}

}
