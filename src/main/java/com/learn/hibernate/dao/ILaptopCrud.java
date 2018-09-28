package com.learn.hibernate.dao;

import com.learn.hibernate.model.Laptop;

public interface ILaptopCrud {
	public int insertLaptop(Laptop laptop);
	public void deleteLaptop(int lid);
}
