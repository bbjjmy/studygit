<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"   prefix="fmt"%>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set  value="${pageContext.request.contextPath }"  var="path"></c:set>
<title>Insert title here</title>
<script type="text/javascript"  src="${path}/js/jquery-3.2.1.js"></script>
<script type="text/javascript">
//  pno:页号 
  function  page(pno){
	  location.href="page.do?cpage="+pno;
  }
</script>

</head>
<body>
	<table  cellpadding="10px"  cellspacing="0px"  border="1px solid red"  bgcolor="yellow">
		<tr>
			<td>id</td>
			<td>用户名</td>
			<td>性别</td>
			<td>日期</td>
		</tr>
		<c:forEach items="${list }" var="u">
			<tr>
				<td>${u.id }</td>
				<td>${u.username }</td>
				<td>${u.sex }</td>
				<td>  
					<!-- 指定 日期的格式  -->
					<fmt:formatDate value="${u.birthday }"  pattern="yyyy-MM-dd"/>
				</td>
			</tr>
		</c:forEach>
	</table>
	${pm.page }
</body>
</html>