<%@page contentType="text/html;charset=GBK"%>
<html> 
<head><title>Spring��Struts����ʵ��</title></head> 
<%
String msg = request.getAttribute("msg") == null ? "" : (String)request.getAttribute("msg");
%>


<body> ${msg}
    <form name="HelloWorld" action="/mySS/regedit.do" method="post"> 
        �û��� <input type="text" name="name" value="${user.name}"/><br> 
��    ��  <input type="password" name="password" value=""/><br>
        <input type="submit" name="method" value="�ύ"/> 
    </form> 
</body> 
</html>

