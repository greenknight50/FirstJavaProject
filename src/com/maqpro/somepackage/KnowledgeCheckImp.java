package com.maqpro.somepackage;

public class KnowledgeCheckImp implements KnowledgeCheck
{

	public KnowledgeCheckImp() 
	{
		// TODO Auto-generated constructor stub
	}



	@Override
	public void car() 
	{
		System.out.println("Car Method");
		
	}

	@Override
	public void Honda() 
	{
		System.out.println("Honda Method");
		
	}

	@Override
	public String Acura(String acuraName) 
	{
		
		System.out.println("Acura Method");
		return acuraName;
	}

	
}
