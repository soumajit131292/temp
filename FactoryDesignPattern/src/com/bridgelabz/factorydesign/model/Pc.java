package com.bridgelabz.factorydesign.model;

import com.bridgelabz.factorydesign.seervice.Computer;

public class Pc implements Computer{

	private String ram;
	private String hdd;
	private String cpu;
	
	public Pc(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

	public String toString(){
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();


}

}