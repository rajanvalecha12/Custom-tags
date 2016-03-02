package com.training.tags;

import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class ForEachTag extends TagSupport {
	private String items;

	public ForEachTag() {
		super();
	}
	


	public void setItems(String items) {
		this.items = items;
	}



	@Override
	public int doStartTag() throws JspException {
		ArrayList<String> list = new ArrayList<>();
		int i=1;
		// TODO Auto-generated method stub
		try{
			JspWriter out = pageContext.getOut();
			list.add(items);
			for(String name:list){
				out.println(i + " " + name);
			}
			
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return Tag.SKIP_BODY;
	}
	
	
	
	
}
