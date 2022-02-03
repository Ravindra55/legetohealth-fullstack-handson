package DaoEx;

public class EmployeeJdbcImpl implements EmployeeDao{
	
	public EmployeeJdbcImpl() {
		System.out.println("-----employeeJdbcImple constructor works---- ");
	}
	public void store() {
		System.out.println("--store() will call here to employeejdbcimpl----");
	}
	public void delete() {
		System.out.println("----delete()will call here to employeejdbcimpl----");
	}

}
