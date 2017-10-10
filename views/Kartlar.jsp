<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>

</style>
<meta charset="UTF-8"/>

<title>Insert title here</title>
</head>
<body>
	 <p style="color: red;">${errorString}</p>
     <jsp:include page="_header.jsp"></jsp:include>
     <jsp:include page="_menu.jsp"></jsp:include>
    
    
<div style="background-color:black;color:white;padding:20px;width:1000px;height: 1500px; margin: 0 auto;">
 	
 	<c:forEach items="${kartResim}"  var="i"  >
 	
 		
     	<img src="${i.Getresim()}" alt="${i.Getresim()}" style="width:304px;height:300px;" > 
   
	</c:forEach >
	
	<form method="POST" action="DoAra">

	  <input type="hidden" id="thisField" name="sqlp" value="${sqlp}">
		<c:forEach items="${sayfaNumara}"  var="i"  >
  			<input name="sayfa" type="submit" value="${i.toString()}" align="bottom"  >
    	</c:forEach >

	</form>

 
 

</div> 
 
     <jsp:include page="_footer.jsp"></jsp:include>
 
</body>
</html>