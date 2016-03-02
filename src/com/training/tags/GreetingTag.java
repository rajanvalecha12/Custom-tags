package com.training.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class GreetingTag extends TagSupport {

	/**
	 * 
	 */
	private String userName;
	public void setUserName(String userName) {
		this.userName = userName;
	}

	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		try{
			JspWriter out =pageContext.getOut();
			
			if(userName !=null)
			{
				out.println("<b> Welcome To Custom Tag : Mr. </b><i>"+userName+"</i>");
			}
			else
				out.println("<b> Welcome To Custom Tag </b>");	
			
		}catch(Exception ex)
		{
			ex.getMessage();
			ex.printStackTrace();
		}
		
		return Tag.SKIP_BODY;
	}

	
	
}
