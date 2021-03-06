<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/WEB-INF/views/include/nav.jsp"%>
<!-- Page Content -->
<div class="container">
	<!----------------- MAP -------------------->
	<br>
	<div class="col-12">
		<div id="map" style="height: 480px;"></div>
		<!-- services와 clusterer, drawing 라이브러리 불러오기 -->
		<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=5e3fbb5757de439d68c782f62db969ac&libraries=services,clusterer,drawing"></script>
		<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=5e3fbb5757de439d68c782f62db969ac"></script>
		<script>
			var markers = [ {
				position : new kakao.maps.LatLng(37.570506, 126.985289),
				text : '에이아이아카데미학원'
			} ];
			var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스

			var options = { //지도를 생성할 때 필요한 기본 옵션
				center : new kakao.maps.LatLng(37.570506, 126.985289), //지도의 중심좌표.
				level : 1, //지도의 레벨(확대, 축소 정도)
				marker : markers
			};

			var map = new kakao.maps.StaticMap(container, options); //지도 생성 및 객체 리턴
		</script>
	</div>
	<!----------------- MAP END -------------------->
	<br>

	<div class="row">
		<!-------------------- CONTACT ---------------------->
		<div class="col-12">
			<div class="media contact-info">
				<span class="contact-info__icon"><i class="ti-home"></i></span>
				<div class="media-body">
					<h3>에이아이아카데미학원</h3>
					<p>서울특별시 종로구 종로 69 (종로2가 서울 YMCA) 7층 에이아이아카데미학원</p>
				</div>
			</div>
			<div class="media contact-info">
				<span class="contact-info__icon"><i class="ti-tablet"></i></span>
				<div class="media-body">
					<h3>02-722-0491</h3>
					<p>월~금, 오전 9시30분 ~ 오후 6시 30분</p>
				</div>
			</div>
			<div class="media contact-info">
				<span class="contact-info__icon"><i class="ti-email"></i></span>
				<div class="media-body">
					<h4>dyjung2073@gmail.com</h4>
					<p>문의사항은 이메일로 보내주시기 바랍니다.</p>
				</div>
			</div>
		</div>
		<div class="col-lg-8"></div>
		<div class="col-lg-4"></div>
		<!-------------------- CONTACT END---------------------->
	</div>
</div>
<!-- /.container -->
<%@include file="/WEB-INF/views/include/footer.jsp"%>