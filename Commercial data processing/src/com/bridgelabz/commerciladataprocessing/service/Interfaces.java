package com.bridgelabz.commerciladataprocessing.service;

import com.bridgelabz.commerciladataprocessing.model.CompanyShares;

public interface Interfaces {

	public void jsonReadUser();
	public void jsonReadCompany();
	public void writeUser();
	public void writeCompany();
	public void buy() throws Exception;
	public void sell() throws Exception;
	public void save(int totalvalue, CompanyShares companyshare);
	public void printReport() throws Exception;
}
