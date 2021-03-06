package org.yarlithub.yschool.repository.model.dao.yschool.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import org.yarlithub.yschool.repository.model.obj.yschool.Staff;
import org.springframework.stereotype.Repository;
import org.yarlithub.yschool.repository.model.dao.yschool.StaffDao;
 
 
/**
 * DAO for table: Staff.
 * @author autogenerated
 */
@Repository
public class StaffDaoImpl extends GenericHibernateDaoImpl<Staff, Integer> implements StaffDao {
	
	/** Constructor method. */
		public StaffDaoImpl() {
			super(Staff.class);
		}
	}

