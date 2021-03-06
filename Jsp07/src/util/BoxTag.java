package util;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class BoxTag extends SimpleTagSupport{
	@Override
	public void doTag() throws JspException, IOException {
		JspContext context = getJspContext();
		JspWriter out = context.getOut();
		JspFragment body = getJspBody();
		out.print("<table border=1 cellspacing=20><tr><td>");
		body.invoke(out);
        out.print("</td></tr></table>"); 		
	}
}
