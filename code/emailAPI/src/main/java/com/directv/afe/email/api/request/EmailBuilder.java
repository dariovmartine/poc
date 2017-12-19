package com.directv.afe.email.api.request;

import com.directv.afe.email.api.Email;

public abstract class EmailBuilder<T extends Object>  {

	public abstract Object createRequest(Email email) ;
	
	

}
