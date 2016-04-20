/**
 * Copyright (c) 2014 EraWeb and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of EraWeb or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 
package com.googlecode.jmapper.integrationtest.others.github.bean;

import java.util.Locale;

import com.googlecode.jmapper.JMapper;

/**
 * @author <a href="mailto:vincenzo.magistro@erawebgroup.com">Vincenzo Magistro</a>
 *
 */
public class BuddyPOConverter {
	
	
	
	public static BuddyPO convertBOtoPO( Buddy bo ) throws IllegalArgumentException{
		
		if( bo == null )
			throw new IllegalArgumentException("Buddy BO cannot be null.");
		
		BuddyPO po = new BuddyPO();
		
		po = mergeBOtoPO( bo, po );
		
		return po;
		
	}
	
	
	public static BuddyPO mergeBOtoPO( Buddy bo, BuddyPO po){
		
		JMapper<BuddyPO, Buddy> mapper = new JMapper<BuddyPO, Buddy>( BuddyPO.class, Buddy.class );
		
		mapper.getDestination( po, bo );
				
		
		// Map Gender
		if( bo.getGender() != null )
			if( bo.getGender() == Gender.MALE )
				po.setGender("m");
			else if ( bo.getGender() == Gender.FEMALE )
				po.setGender("f");
		
		// Map Locale
		if( bo.getLocale() != null )
			po.setLocale( bo.getLocale().getLanguage() );
		
		return po;
	}
	
	
	public static Buddy convertPOtoBO( BuddyPO po ) throws IllegalArgumentException{
		
		if( po == null )
			throw new IllegalArgumentException("Buddy PO cannot be null.");
		
		Buddy bo = new Buddy();
		
		JMapper<Buddy, BuddyPO> mapper = new JMapper<Buddy, BuddyPO>( Buddy.class, BuddyPO.class );
		
		mapper.getDestination( bo, po );
		
				
		
		// Map Gender
		if( po.getGender() != null )
			if( po.getGender().toLowerCase().equals("m") )
				bo.setGender(Gender.MALE);
			else if( po.getGender().toLowerCase().equals("f") )
				bo.setGender(Gender.FEMALE);
		
		// Map Locale
		if( po.getLocale() != null )
			bo.setLocale( new Locale( po.getLocale()) );
		
		return bo;
		
	}


}
