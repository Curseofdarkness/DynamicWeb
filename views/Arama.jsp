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
 <h6>Sınıfı seçin</h6>
 <select name= "sinif">
  <option value="1">Seçiniz</option>
  <option value="Naturel">Naturel</option>
  <option value="Warrior">Warrior</option>
  <option value="Shaman">Shaman</option>
  <option value="Rogue">Rogue</option>
  <option value="Paladin">Paladin</option>
  <option value="Hunter">Hunter</option>
  <option value="Druid">Druid</option>
  <option value="Warlock">Warlock</option>
  <option value="Mage">Mage</option>
  <option value="Priest">Priest</option>
  
</select>

<h6>Nadirliğini seçin</h6>
 <select name ="nadir">
  <option value="1">Seçiniz</option>
  <option value="Normal">Normal</option>
  <option value="Yaygın">Yaygın</option>
  <option value="Nadir">Nadir</option>
  <option value="Destansi">Destansı</option>
  <option value="Efsanevi">Efsanevi</option>
  
</select>

<h6>Paket seçin</h6>
 <select name ="paket">
  <option value="1">Seçiniz</option>
  <option value="Klasik">Klasik</option>
  <option value="Wotg">Whispers of the old gods</option>
  <option value="Msog">Mean streets of gadgetzan</option>
  <option value="Jtu">Journey to un'goro</option>
  <option value="Kotft">Knights of the frozen throne</option>
  <option value="Tgt">The grand tournament</option>
  <option value="Gvg">Goblins vs gnomest</option>
  <option value="Onik">One night in karazhan</option>
  <option value="Con">Curse of naxxramas</option>
  <option value="Brm">Blackrock mountain</option>
  <option value="Tloe">The league of explorers</option>
  
  
</select>

 manası:<br> <input type="text"  name="mana" value=55 onkeypress='return event.charCode >= 48 && event.charCode <= 57'>
</input>
 	<input type="text" name="isim" value="isim">
 	
 <input type="submit">
</form>

</div> 
 
     <jsp:include page="_footer.jsp"></jsp:include>
 
</body>
</html>