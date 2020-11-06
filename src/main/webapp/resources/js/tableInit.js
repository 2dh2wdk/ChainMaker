function listInit() {

	vm = new Vue({
		el : '#divCourseList',
		components : {
			'bootstrap-table' : BootstrapTable
		},
		data : {
			items : [],
			no : ''
		},
		methods : {
			rowClicked : function(row) {

				var tdArr = new Array(); // 배열

				//현재 클릭된 Row(<tr>)
				var tr = $(row);
				var td = tr.children();

				td.each(function(i) {
					tdArr.push(td.eq(i).text());
				});

				console.log(tdArr);

				console.log("tdArr[0] : " + tdArr[0]);

				this.no = tdArr[0];

				unstsearch = true;

				fListstudent();

				//console.log("배열에 담긴 값 : "+tdArr[1]);	 
			},
			coursemod : function(no) {
				fcoursesel(no);
			},
			coursedel : function(no, scnt) {
				if (scnt > 0 || stvm.items.length > 0) {
					alert("수강중인 학생이 있어  삭제 불가 합니다.");
				} else {
					// fcoursedel(no); 
				}
			}
		}
	});
}

/** 학생 조회 */
function fListstudent(currentPage) {
	
	currentPage = currentPage || 1;
	
	console.log("currentPage : " + currentPage + " no : " + vm.no);
	
	var param = {
				currentPage : currentPage
			,	pageSize : pageSizeStudent
			,   no : vm.no
	}
	
	var resultCallback = function(data) {
		flistStudentResult(data, currentPage);
	};
	//Ajax실행 방식
	callAjax("/cur/liststudent.do", "post", "json", true, param, resultCallback);
}