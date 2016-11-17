<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/ListarPeticionesPeliculas" /> <!-- llamo servlet al cargar pagina -->

<jsp:include page="MasterPageCabecera.jsp" />
    
   
<div class="contenido">


<c:if test="${userLogueado.rango != 'admin'}" >
	<div class="container left-addon inner-addon">
		<img src="imgs/SinPermisos.png" class="text-center img-responsive" width="10px%" style="margin:auto;">
		<br>
        <h1 class="text-center">Usted no tiene permisos para estar acá.<br><br></h1>  
    </div>
</c:if>  



<c:if test="${userLogueado.rango == 'admin'}">
	
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<style type="text/css">
${demo.css}
		</style>
		<script type="text/javascript">
$(function () {
	
	
	$.get('ListarSecciones', {

	}, function(data) {

	    $('#cantidad-visitas-secciones-torta').highcharts({
	        chart: {
	            plotBackgroundColor: null,
	            plotBorderWidth: 0,
	            plotShadow: false,
	            backgroundColor: "#424242",
	            options3d: {
	                enabled: true,
	                alpha: 45,
	                beta: 0
	            }
	        },
	        title: {
	            text: 'Secciones',
	            align: 'center',
	            verticalAlign: 'middle',
	            y: 40,
	            style: { "color": "#e3c601", "fontSize": "18px" }
	        },
	        tooltip: {
	            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
	        },
	        plotOptions: {
	            pie: {
	                dataLabels: {
	                    enabled: true,
	                    distance: -50,
	                    style: {
	                        fontWeight: 'bold',
	                        color: 'white'
	                    }
	                },
	                startAngle: -90,
	                endAngle: 90,
	                center: ['50%', '75%']
	            }
	        },
	        series: [{
	            type: 'pie',
	            name: 'Visitas',
	            innerSize: '50%',
	            data: [
	                ['Películas',   data[0].cant_visitas],
	                ['Actores',       data[1].cant_visitas],
	                ['Directores', data[2].cant_visitas],
	                ['Usuarios', data[3].cant_visitas],
 
	            ]
	        }]
	    });
	});
		
});
	
		</script>
	
	
	<div class="login">
		<h1 class="text-center titulo-seccion"><img src="imgs/cantVisitas.png" class="imagen-seccion"/>CANTIDAD DE VISITAS</h1>
	</div>
	
	
	
<script src="js/highcharts.js"></script>
<script src="js/exporting.js"></script>

<div id="cantidad-visitas-secciones-torta" style="min-width: 310px; height: 400px; max-width: 600px; margin: 0 auto;"></div>

	


 </c:if>  

</div>


<jsp:include page="MasterPageFooter.jsp" />