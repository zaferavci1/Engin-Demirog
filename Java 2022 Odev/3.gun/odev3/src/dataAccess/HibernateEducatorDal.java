package dataAccess;

import entities.Educator;

public class HibernateEducatorDal implements EducatorDao{

	@Override
	public void add(Educator educator) {
		System.out.println(educator.getFirstName() + "kursiyer eklendi");
	}

}
