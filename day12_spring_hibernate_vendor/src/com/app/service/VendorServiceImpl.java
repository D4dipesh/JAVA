package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IVendorDao;
import com.app.pojos.Vendor;

@Service //To tell Sc that this component contains B.L.
@Transactional //to automate transaction management 
public class VendorServiceImpl implements IvendorService 
{	
	//dependency
	@Autowired
	private IVendorDao dao;
	
	@Override
	public Vendor validateVendor(String email, String password) 
	{
		return dao.validateVendor(email, password);
	}

	@Override
	public List<Vendor> listVendor() 
	{
		return dao.listVendor();
	}

	@Override
	public String deleteVendor(int id) 
	{
		return dao.deleteVendorDetails(dao.getVendorDetails(id));
	}

	@Override
	public String registerVendor(Vendor v) {
			return dao.registerVendorDetails(v);
	}

	@Override
	public Vendor getVendorDetails(int id) {
		// TODO Auto-generated method stub
		return dao.getVendorDetails(id);
	}

	@Override
	public String updateVendor(Vendor v) {
		// TODO Auto-generated method stub
		return dao.updateVendorDetails(v);
	}
}
