<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8"/>

<title>Insert title here</title>
</head>
<body>
	 <p style="color: red;">${errorString}</p>
     <jsp:include page="_header.jsp"></jsp:include>
     <jsp:include page="_menu.jsp"></jsp:include>
    
     
<div style="background-color:black;color:white;padding:20px;width:1000px;height: 1500px; margin: 0 auto;">

<form method="POST" action="DoArama">
<h6>Paket seçin</h6>

 <input type="hidden" id="thisField" name="sinif" value="1">
 <input type="hidden" id="thisField" name="nadir" value="1">
 <input type="hidden" id="thisField" name="mana" value=55>
 <input type="hidden" id="thisField" name="isim" value="isim">
 
  <input type="image" name="paket" value="Kotft" src="http://localhost:8080/SimpleWebApp/paket/Kotft.png" alt="Submit" width="250" height="250">
  <input type="image" name="paket" value="Jtu" src="http://localhost:8080/SimpleWebApp/paket/Ungoro.png" alt="Submit" width="250" height="250">
  <input type="image" name="paket" value="Msog" src="http://localhost:8080/SimpleWebApp/paket/Msog.png" alt="Submit" width="250" height="250">
  <input type="image" name="paket" value="Onik" src="http://localhost:8080/SimpleWebApp/paket/Karaz.png" alt="Submit" width="250" height="250">
  <input type="image" name="paket" value="Wotg" src="http://localhost:8080/SimpleWebApp/paket/Wotog.png" alt="Submit" width="250" height="250">
  <input type="image" name="paket" value="Tloe" src="http://localhost:8080/SimpleWebApp/paket/Loe.png" alt="Submit" width="250" height="250">
  <input type="image" name="paket" value="Brm" src="http://localhost:8080/SimpleWebApp/paket/Brm.png" alt="Submit" width="250" height="250">
  <input type="image" name="paket" value="Tgt" src="http://localhost:8080/SimpleWebApp/paket/Tgt.png" alt="Submit" width="250" height="250">
  <input type="image" name="paket" value="Con" src="http://localhost:8080/SimpleWebApp/paket/Nax.png" alt="Submit" width="250" height="250">
  <input type="image" name="paket" value="Gvg" src="http://localhost:8080/SimpleWebApp/paket/Gvg.png" alt="Submit" width="250" height="250">

 
</form>

</div> 
 
     <jsp:include page="_footer.jsp"></jsp:include>
 
</body>
</html>