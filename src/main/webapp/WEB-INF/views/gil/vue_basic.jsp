<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Vue Basic</title>

<jsp:include page="/WEB-INF/views/common/include.jsp"/>
<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resource/js/alert.js"></script>

</head>

<body>
	<h1>Vue Basic Page</h1>
	
	<div id="vueTestDiv">
  		{{ message }}
	</div>

<button onclick="al()">test!</button>


<!-- 
	<div class="divCourseList" id="divCourseList">
		<table class="col">
			<caption>caption</caption>
			<colgroup>
				<col width="10%">
				<col width="35%">
				<col width="20%">
				<col width="20%">
				<col width="15%">
			</colgroup>

			<thead>
				<tr>
					<th scope="col">번호</th>
					<th scope="col">과정명</th>
					<th scope="col">기간</th>
					<th scope="col">강사</th>
					<th scope="col">수정/삭제</th>
				</tr>
			</thead>
			<tbody id="listCourse">

				data: {items: [],no: ''}, 에서 데이터 배열 선언 해놓은거 쓰는거임 
				row = 하나 꺼내는거 for each 같은애, index는 몇번재꺼인지?, v-if는 items.length만큼 그냥 vue 문법
				<template v-for="(row, index) in items" v-if="items.length">
				<tr onclick="vm.rowClicked(this)">
					<td>{{ row.no }}</td>
					<td>{{ row.title }}</td>
					<td>{{ row.startdate }} - {{ row.enddate }}</td>
					<td>{{ row.teacher }}</td>
					<td align="center">
						<table border=0>
							<tr>
								<td><p class="btnType3 color1" @click="coursemod(row.no)">
										<a class="btnType3 color1"><span id="searchEnter">수정</span></a>
									</p></td>
								<td><p class="btnType3 color1"
										@click="coursedel(row.no,row.scnt)">
										<a class="btnType3 color1"><span id="searchEnter">삭제</span></a>
									</p></td>
							</tr>
						</table>
					</td>
				</tr>
				</template>
			</tbody>
		</table>
	</div> -->
	
	
	
	
	
</body>
</html>
