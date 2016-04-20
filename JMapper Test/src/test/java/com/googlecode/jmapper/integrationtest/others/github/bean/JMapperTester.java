/**
 * 
 */
package com.googlecode.jmapper.integrationtest.others.github.bean;

/**
 * <p>JMapper tester.</p>
 * @author Vik
 *
 */
public class JMapperTester implements Runnable {

	/* 
	 * @see java.lang.Runnable#run()
	 */
	
	public void run() {
		
		BuddyPO po = new BuddyPO();
		po.setId(1);
		Buddy bo = BuddyPOConverter.convertPOtoBO(po);
		BuddyVOConverter.convertBOtoVO(bo);

	}

}
