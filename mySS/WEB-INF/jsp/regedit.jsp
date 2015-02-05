<%@page contentType="text/html;charset=GBK"%>
<html> 
<head><title>Spring和Struts整合实例</title></head> 
<%
String msg = request.getAttribute("msg") == null ? "" : (String)request.getAttribute("msg");
%>


<body> ${msg}
    <form name="HelloWorld" action="/mySS/regedit.do" method="post"> 
        用户名 <input type="text" name="name" value="${user.name}"/><br> 
密    码  <input type="password" name="password" value=""/><br>
        <input type="submit" name="method" value="提交"/> 
    </form> 
</body> 
</html>

