package com.muhammet;

import com.muhammet.repository.UserRepositoryImpl;

public class Runner {

	public static void main(String[] args) {
		System.out.println("*****   UYGULAMA BA�LADI DATALAR �EK�L�YOR...");
		UserRepositoryImpl dbUser = new UserRepositoryImpl(13);
		//dbUser.getUserList().forEach(System.out::println);
		dbUser.getUserList().stream().filter(x-> x.getNat().equals("TR"))
		.forEach(x-> System.out.println(x.getLocation().getCountry()));
	}

}
