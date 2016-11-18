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
<style type="text/css">${demo.css}</style>
<script type="text/javascript">
		
	
$(function () {
	
	
	$.get('ListarDiezPeliculasMasVisitadas', {

	}, function(data) {


$('#cantidad-visitas-peliculas-columns').highcharts({
    chart: {
        type: 'column',
        backgroundColor: "#424242",
        color: "#ffffff",
    },
    title: {
        text: '10 películas más visitadas',
        fontWeight: 'bold',
        style: { "color": "#e3c601", "fontSize": "18px" },
    },
    xAxis: {
        type: 'category',
        labels: {
            rotation: -45,
            style: {
                fontSize: '18px',
                fontFamily: 'Verdana, sans-serif'
            }
        }
    },
    yAxis: {
        min: 0,
        title: {
            text: 'Cantidad de visitas'
        }
    },
    legend: {
        enabled: false
    },

    series: [{
        name: 'Visitas',
        data: [
            [data[0].nombre, data[0].cant_visitas],
            [data[1].nombre, data[1].cant_visitas],
            [data[2].nombre, data[2].cant_visitas],
            [data[3].nombre, data[3].cant_visitas],
            [data[4].nombre, data[4].cant_visitas],
            [data[5].nombre, data[5].cant_visitas],
            [data[6].nombre, data[6].cant_visitas],
            [data[7].nombre, data[7].cant_visitas],
            [data[8].nombre, data[8].cant_visitas],
            [data[9].nombre, data[9].cant_visitas],

        ],
        dataLabels: {
            enabled: true,
            rotation: -90,
            color: '#FFFFFF',
            align: 'right',
            format: '{point.y:.1f}', // one decimal
            y: 10, // 10 pixels down from the top
            style: {
                fontSize: '22px',
                fontFamily: 'Verdana, sans-serif'
            }
        }
    }]
	

		});
	});
	
	
	
	
$.get('ListarDiezActoresMasVisitados', {

	}, function(data) {


$('#cantidad-visitas-actores-columns').highcharts({
    chart: {
        type: 'column',
        backgroundColor: "#424242",
        color: "#ffffff",
    },
    title: {
        text: '10 actores más visitados',
        fontWeight: 'bold',
        style: { "color": "#e3c601", "fontSize": "18px" },
    },
    xAxis: {
        type: 'category',
        labels: {
            rotation: -45,
            style: {
                fontSize: '18px',
                fontFamily: 'Verdana, sans-serif'
            }
        }
    },
    yAxis: {
        min: 0,
        title: {
            text: 'Cantidad de visitas'
        }
    },
    legend: {
        enabled: false
    },

    series: [{
        name: 'Visitas',
        data: [
            [data[0].nombre.concat(" ").concat(data[0].apellido), data[0].cant_visitas],
            [data[1].nombre.concat(" ").concat(data[1].apellido), data[1].cant_visitas],
            [data[2].nombre.concat(" ").concat(data[2].apellido), data[2].cant_visitas],
            [data[3].nombre.concat(" ").concat(data[3].apellido), data[3].cant_visitas],
            [data[4].nombre.concat(" ").concat(data[4].apellido), data[4].cant_visitas],
            [data[5].nombre.concat(" ").concat(data[5].apellido), data[5].cant_visitas],
            [data[6].nombre.concat(" ").concat(data[6].apellido), data[6].cant_visitas],
            [data[7].nombre.concat(" ").concat(data[7].apellido), data[7].cant_visitas],
            [data[8].nombre.concat(" ").concat(data[8].apellido), data[8].cant_visitas],
            [data[9].nombre.concat(" ").concat(data[9].apellido), data[9].cant_visitas],

        ],
        dataLabels: {
            enabled: true,
            rotation: -90,
            color: '#FFFFFF',
            align: 'right',
            format: '{point.y:.1f}', // one decimal
            y: 10, // 10 pixels down from the top
            style: {
                fontSize: '18px',
                fontFamily: 'Verdana, sans-serif'
            }
        }
    }]
	

		});
	});
	
	
	
	
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
	            text: 'Secciones más<br>visitadas',
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
	
	
	
<div class="row" style="margin-top: -50px">
            <div class="col-md-4">
            <h1 class="text-center titulo-seccion"><img src="imgs/cantVisitas.png" class="imagen-seccion" style="margin-top: 250px;"/>CANTIDAD DE VISITAS</h1>
            
            </div>
            
            
            <div class="col-md-4">
                <div class="row pg-empty-placeholder">
               		<div id="cantidad-visitas-peliculas-columns" style="min-width: 210px; height: 300px; max-width: 500px; margin: 0 auto;"></div>
                </div>
                
                <div class="row pg-empty-placeholder">
                	<div id="cantidad-visitas-actores-columns" style="min-width: 210px; height: 300px; max-width: 500px; margin: 0 auto;"></div>
                </div>
            </div>
               
            <div class="col-md-4">
            	<div id="cantidad-visitas-secciones-torta" style="min-width: 210px; height: 300px; max-width: 700px; margin: 0 auto; margin-top: 150px;"></div>
	
            </div>
 </div>	
	
	

	<hr>

<div align=center style="width: 100%; margin:auto;">
        	<a href="ListarInformes.jsp" class="btn btn-primary">Volver</a>
        </div> 

</div>
	
	
<script src="js/highcharts.js"></script>
<script src="js/exporting.js"></script>


	

 </c:if>  




<jsp:include page="MasterPageFooter.jsp" />