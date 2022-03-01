<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<table id="movieTable" class="center">
<c:forEach var="Movie" items="${movieslist}">
<tr>
<td><img src="data:image/jpg;base64,${Movie.base64Image}" width="240" height="300"/></td>
</tr>
</c:forEach>
</table>