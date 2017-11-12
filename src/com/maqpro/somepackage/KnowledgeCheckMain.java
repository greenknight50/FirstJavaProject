package com.maqpro.somepackage;

public class KnowledgeCheckMain {



	public static void main(int args)
	{
		KnowledgeCheckImp knowledgeCheckImp = new KnowledgeCheckImp();
		knowledgeCheckImp.car();
		knowledgeCheckImp.Honda();
		System.out.println(knowledgeCheckImp.Acura("Int Acura RDX"));
		
	}
	
	public static void main(String[] args)
	{
//		main(5);
		
//		System.out.println("main with int"+ main(5));
		KnowledgeCheckImp knowledgeCheckImp = new KnowledgeCheckImp();
		knowledgeCheckImp.car();
		knowledgeCheckImp.Honda();
		System.out.println(knowledgeCheckImp.Acura("String Acura RDX"));
		
	}
}
