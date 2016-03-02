package com.training.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class GreetingTag extends TagSupport {

	private String userName;

	
	public GreetingTag(String userName) {
		super();
		this.userName = userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Override
	public int doStartTag() throws JspException {
		
		try {
			JspWriter out=pageContext.getOut();
			if(userName!=null)
			{
				out.println("<b>Welcome to custom tag programming</b>"+userName);
			}
			else
			{
				out.println("<i>dear guest welcome to custom tag programming</i>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return Tag.SKIP_BODY;
	}

}
