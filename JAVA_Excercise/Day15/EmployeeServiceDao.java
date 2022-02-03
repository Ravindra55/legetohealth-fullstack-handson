package ServiceEx;

import DaoEx.EmployeeDao;

public class EmployeeServiceDao {
	private EmployeeDao dao;
	//<constructor-arg> tag can call this argument constructor
	public EmployeeServiceDao(EmployeeDao dao) {
		System.out.println("---employeeservicedao() is created----");
		this.dao=dao;
	}
	//usual way to intialize dao using factory pattern
	//EmployeeDao dao1=ObjectFactory.getInstance();
	//setter injection way of initialize dao object creation using dependency injection..
	//public void setDao(EmployeeDao dao) {
		//this.dao=dao;
	//}

	public void save() {
		System.out.println("---save() called inside a employeeservicedao");
		dao.store();
	}
	public void remove() {
		System.out.println("---remove() called inside a employeeservicedao");
		dao.delete();
	}

}
