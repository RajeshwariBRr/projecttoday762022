package projecttoday76202022;

import org.testng.annotations.Test;

public class tdygit {
	public class C {

		@Test		
		private void testC1() {
			System.out.println("TestC2");	
			System.out.println(Thread.currentThread().getId());
	}
	@Test		
	private void testC2() {
		System.out.println("TestC2");	
		System.out.println(Thread.currentThread().getId());
				
	}
	@Test
		private void testC3() {
			System.out.println("TestC3");	
			System.out.println(Thread.currentThread().getId());
				
				
		}			
	private void testC4() {
		System.out.println("TestC3");	
		System.out.println(Thread.currentThread().getId());
					
}
}
}