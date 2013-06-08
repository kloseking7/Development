package com.glassbox.webinvoice.server.dataaccess;

import org.springframework.stereotype.Repository;

import com.glassbox.webinvoice.shared.entity.Company;
@Repository
public class CompanyDAO extends BaseDAO<Company, Long> {

	public CompanyDAO() {
		super(Company.class);
		// TODO Auto-generated constructor stub
	}
	
	public void deleteCompanys(){
		System.out.println(sf.getCurrentSession().createQuery("delete from Company").executeUpdate());
	}
	
	public void deleteCompany(long id){
		sf.getCurrentSession().delete(find(id));
	}

}
