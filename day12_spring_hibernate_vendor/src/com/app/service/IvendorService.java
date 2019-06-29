package com.app.service;

import java.util.List;
import com.app.pojos.Vendor;

public interface IvendorService 
{
	Vendor validateVendor(String email,String password);
	List<Vendor> listVendor();
	String deleteVendor(int id);
	String registerVendor(Vendor v);
	Vendor getVendorDetails(int id);
	String updateVendor(Vendor v);
}
