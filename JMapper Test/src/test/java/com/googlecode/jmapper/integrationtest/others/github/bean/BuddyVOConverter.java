/**
 * Copyright (c) 2014 EraWeb and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
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
 * @author vik
 *
 */
public class BuddyVOConverter {
	
	public static BuddyVO convertBOtoVO( Buddy bo ) throws IllegalArgumentException{
		
		if( bo == null )
			throw new IllegalArgumentException("Buddy BO cannot be null.");
		
		BuddyVO vo = new BuddyVO();
		
		vo = mergeBOtoVO( bo, vo );
		
		return vo;

	}
	
	
	
	public static BuddyVO mergeBOtoVO( Buddy bo, BuddyVO vo ){
		
		if( bo == null )
			throw new IllegalArgumentException("Buddy BO cannot be null.");
		
		JMapper<BuddyVO, Buddy> postMapper = new JMapper<BuddyVO, Buddy>( BuddyVO.class, Buddy.class );
		
		postMapper.getDestination( vo, bo );
		
		
		// Map Gender
		if( bo.getGender() != null )
			if( bo.getGender() == Gender.MALE )
				vo.setGender("Male");
			else if ( bo.getGender() == Gender.FEMALE )
				vo.setGender("Female");
		
		// Map Locale
		if( bo.getLocale() != null )
			vo.setLocale( bo.getLocale().getLanguage() );
		
		return vo;
	}
	
	
	public static Buddy convertVOtoBO( BuddyVO vo ){
		
		if( vo == null )
			throw new IllegalArgumentException("Buddy VO cannot be null.");
		
		Buddy bo = new Buddy();
		
		JMapper<Buddy, BuddyVO> mapper = new JMapper<Buddy, BuddyVO>( Buddy.class, BuddyVO.class );
		
		mapper.getDestination( bo, vo );

		
		
		// Map Gender
		if( vo.getGender() != null )
			if( vo.getGender().toLowerCase().equals("male") )
				bo.setGender(Gender.MALE);
			else if( vo.getGender().toLowerCase().equals("female") )
				bo.setGender(Gender.FEMALE);
		
		// Map Locale
		if( vo.getLocale() != null )
			bo.setLocale( new Locale( vo.getLocale()) );

		
		return bo;
		
	}

}
