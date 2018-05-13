<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
 <div id="calendar">
    <header class="header">
      <ul>
        <li class="cur">月</li>
        <li>年</li>
      </ul>
    </header>
    <aside class="sidebar">
      <div class="wrapper">
        <div class="title">
          <span class="btn btn-prev"><</span>
          <span class="date">2017年9月</span>
          <span class="btn btn-next">></span>
        </div>
        <ul class="week">
          <li>日</li>
          <li>一</li>
          <li>二</li>
          <li>三</li>
          <li>四</li>
          <li>五</li>
          <li>六</li>
        </ul>
        <ul class="day"></ul>
      </div>
    </aside>
    <div class="container">
      <div id="renderMonth" class="render render-show">
        <h2 class="title">2017年9月</h2>
        <ul class="week">
          <li>周日</li>
          <li>周一</li>
          <li>周二</li>
          <li>周三</li>
          <li>周四</li>
          <li>周五</li>
          <li>周六</li>
        </ul>
        <ul class="day"></ul>
      </div>
      <div id="renderFullYear" class="render">
        <div class="title">
          <h2>2017年</h2>
          <p>
            <span class="lunar-year"><i></i>丁酉鸡年</span>
            <span class="info"><i></i>农历初一</span>
          </p>
        </div>
        <ul class="month"></ul>
      </div>
      <div id="control">
        <input type="button" value="<" class="btn btn-prev">
        <input type="button" value="今天" class="today">
        <input type="button" value=">" class="btn btn-next">
      </div>
      <div id="popup">
        <h3 class="title">七夕节</h3>
        <i class="arrow arrow-left"></i>
        <i class="arrow arrow-right"></i>
        <p class="date">2017年8月28日</p>
        <p class="lunar">丁酉鸡年</p>
      </div>
    </div>
  </div>
  

  <script src="js/tools.js"></script>
  <script src="js/ChineseCalendar.js"></script>
  <script src="js/calender.js"></script>
</body>
</html>