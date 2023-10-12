<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="kopo.poly.dto.MovieDTO" %>
<%@ page import="java.util.List" %>
<%@ page import="kopo.poly.util.CmmUtil" %>
<%@ page import="kopo.poly.dto.FoodDTO" %>
<%@ page import="kopo.poly.dto.WeatherDTO" %>
<%
    //Controller로부터 전달받은 데이터
   WeatherDTO rDTO = (WeatherDTO) request.getAttribute("rDTO");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>날씨</title>
    <link rel="stylesheet" href="/css/table.css"/>
</head>
<body>
<h2>날씨 </h2>
<hr/>
<br/>
<div class="divTable minimalistBlack">
    <div class="divTableHeading">
        <div class="divTableRow">
            <div class="divTableHead">오늘 일자</div>
            <div class="divTableHead">최저 기온</div>
            <div class="divTableHead">최고 기온</div>

        </div>
    </div>
    <div class="divTableBody">

        <div class="divTableRow">
            <div class="divTableCell"> 오늘
            </div>
            <div class="divTableCell"><%=CmmUtil.nvl(rDTO.getHightemperature())%>
            </div>
            <div class="divTableCell"><%=CmmUtil.nvl(rDTO.getLowtemperature())%>
            </div>
        </div>

    </div>
</div>
</body>
</html>