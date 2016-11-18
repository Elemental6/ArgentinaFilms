package test;


import java.util.ArrayList;
import java.util.List;

import model.Actores;
import model.Directores;
import model.Generos;
import model.Peliculas;
import model.Resenias;
import model.Secciones;
import model.Usuarios;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import service.ServiceDirector;
import service.ServiceGenero;
import service.ServicePelicula;
import service.ServiceSecciones;
import service.ServiceUsuario;

public class AllTests {

	public ServicePelicula peliculaService = null;
	public ServiceUsuario usuarioService = null;
	public ServiceDirector directorService = null;
	public ServiceGenero generoService = null;
	public ServiceSecciones seccionService = null;
	
	
	@Test
	public void GenerarDatosPredeterminados() {

		ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		this.peliculaService = (ServicePelicula) context.getBean(ServicePelicula.class);
		this.usuarioService = (ServiceUsuario) context.getBean(ServiceUsuario.class);
		this.directorService = (ServiceDirector) context.getBean(ServiceDirector.class);
		this.generoService = (ServiceGenero) context.getBean(ServiceGenero.class);
		this.seccionService = (ServiceSecciones) context.getBean(ServiceSecciones.class);
		
		
		Usuarios usuario = new Usuarios("Jocs", "12345678", "Jose", "Hassan", "jose.h.utn@gmail.com", "admin", true);
		usuario.setAvatar("imgs/avatares/xfdfrgf.jpg");
		this.usuarioService.add(usuario);
		
		List<Actores> actorespelicula = null;
		List<Resenias> reseniaspelicula = null;


		/*Genero Usuarios*/
		/*genero usuarios*/
		Usuarios usuario0 = new Usuarios("doylesharp", "1234", "Doyle", "Sharp", "doylesharp@lyrichord.com", "novato", true);
		usuario0.setAvatar("imgs/avatares/no-foto-male.png");
		this.usuarioService.add(usuario0);

		Usuarios usuario1 = new Usuarios("angelitasloan", "1234", "Angelita", "Sloan", "angelitasloan@lyrichord.com", "novato", true);
		usuario1.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario1);

		Usuarios usuario2 = new Usuarios("christishannon", "1234", "Christi", "Shannon", "christishannon@lyrichord.com", "novato", true);
		usuario2.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario2);

		Usuarios usuario3 = new Usuarios("kimberleyhuber", "1234", "Kimberley", "Huber", "kimberleyhuber@lyrichord.com", "novato", true);
		usuario3.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario3);

		Usuarios usuario4 = new Usuarios("tamihensley", "1234", "Tami", "Hensley", "tamihensley@lyrichord.com", "novato", true);
		usuario4.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario4);

		Usuarios usuario5 = new Usuarios("maritzalynch", "1234", "Maritza", "Lynch", "maritzalynch@lyrichord.com", "novato", true);
		usuario5.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario5);

		Usuarios usuario6 = new Usuarios("sanchezpatterson", "1234", "Sanchez", "Patterson", "sanchezpatterson@lyrichord.com", "novato", true);
		usuario6.setAvatar("imgs/avatares/no-foto-male.png");
		this.usuarioService.add(usuario6);

		Usuarios usuario7 = new Usuarios("erikadudley", "1234", "Erika", "Dudley", "erikadudley@lyrichord.com", "novato", true);
		usuario7.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario7);

		Usuarios usuario8 = new Usuarios("haydenblack", "1234", "Hayden", "Black", "haydenblack@lyrichord.com", "novato", true);
		usuario8.setAvatar("imgs/avatares/no-foto-male.png");
		this.usuarioService.add(usuario8);

		Usuarios usuario9 = new Usuarios("natashaburgess", "1234", "Natasha", "Burgess", "natashaburgess@lyrichord.com", "novato", true);
		usuario9.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario9);

		Usuarios usuario10 = new Usuarios("ameliaross", "1234", "Amelia", "Ross", "ameliaross@lyrichord.com", "novato", true);
		usuario10.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario10);

		Usuarios usuario11 = new Usuarios("davidsonhooper", "1234", "Davidson", "Hooper", "davidsonhooper@lyrichord.com", "novato", true);
		usuario11.setAvatar("imgs/avatares/no-foto-male.png");
		this.usuarioService.add(usuario11);

		Usuarios usuario12 = new Usuarios("marisoldrake", "1234", "Marisol", "Drake", "marisoldrake@lyrichord.com", "novato", true);
		usuario12.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario12);

		Usuarios usuario13 = new Usuarios("barbermccarthy", "1234", "Barber", "Mccarthy", "barbermccarthy@lyrichord.com", "novato", true);
		usuario13.setAvatar("imgs/avatares/no-foto-male.png");
		this.usuarioService.add(usuario13);

		Usuarios usuario14 = new Usuarios("megannelson", "1234", "Megan", "Nelson", "megannelson@lyrichord.com", "novato", true);
		usuario14.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario14);

		Usuarios usuario15 = new Usuarios("carneywebster", "1234", "Carney", "Webster", "carneywebster@lyrichord.com", "novato", true);
		usuario15.setAvatar("imgs/avatares/no-foto-male.png");
		this.usuarioService.add(usuario15);

		Usuarios usuario16 = new Usuarios("shaunaperez", "1234", "Shauna", "Perez", "shaunaperez@lyrichord.com", "novato", true);
		usuario16.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario16);

		Usuarios usuario17 = new Usuarios("wyattbutler", "1234", "Wyatt", "Butler", "wyattbutler@lyrichord.com", "novato", true);
		usuario17.setAvatar("imgs/avatares/no-foto-male.png");
		this.usuarioService.add(usuario17);

		Usuarios usuario18 = new Usuarios("torresjoyner", "1234", "Torres", "Joyner", "torresjoyner@lyrichord.com", "novato", true);
		usuario18.setAvatar("imgs/avatares/no-foto-male.png");
		this.usuarioService.add(usuario18);

		Usuarios usuario19 = new Usuarios("perezfletcher", "1234", "Perez", "Fletcher", "perezfletcher@lyrichord.com", "novato", true);
		usuario19.setAvatar("imgs/avatares/no-foto-male.png");
		this.usuarioService.add(usuario19);

		Usuarios usuario20 = new Usuarios("sharicarver", "1234", "Shari", "Carver", "sharicarver@lyrichord.com", "novato", true);
		usuario20.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario20);

		Usuarios usuario21 = new Usuarios("earleneneal", "1234", "Earlene", "Neal", "earleneneal@lyrichord.com", "novato", true);
		usuario21.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario21);

		Usuarios usuario22 = new Usuarios("jodiblackwell", "1234", "Jodi", "Blackwell", "jodiblackwell@lyrichord.com", "novato", true);
		usuario22.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario22);

		Usuarios usuario23 = new Usuarios("oliviahood", "1234", "Olivia", "Hood", "oliviahood@lyrichord.com", "novato", true);
		usuario23.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario23);

		Usuarios usuario24 = new Usuarios("verabest", "1234", "Vera", "Best", "verabest@lyrichord.com", "novato", true);
		usuario24.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario24);

		Usuarios usuario25 = new Usuarios("chavezthompson", "1234", "Chavez", "Thompson", "chavezthompson@lyrichord.com", "novato", true);
		usuario25.setAvatar("imgs/avatares/no-foto-male.png");
		this.usuarioService.add(usuario25);

		Usuarios usuario26 = new Usuarios("alexisschultz", "1234", "Alexis", "Schultz", "alexisschultz@lyrichord.com", "novato", true);
		usuario26.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario26);

		Usuarios usuario27 = new Usuarios("maureencarter", "1234", "Maureen", "Carter", "maureencarter@lyrichord.com", "novato", true);
		usuario27.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario27);

		Usuarios usuario28 = new Usuarios("ramseydaniel", "1234", "Ramsey", "Daniel", "ramseydaniel@lyrichord.com", "novato", true);
		usuario28.setAvatar("imgs/avatares/no-foto-male.png");
		this.usuarioService.add(usuario28);

		Usuarios usuario29 = new Usuarios("nicholswells", "1234", "Nichols", "Wells", "nicholswells@lyrichord.com", "novato", true);
		usuario29.setAvatar("imgs/avatares/no-foto-male.png");
		this.usuarioService.add(usuario29);

		Usuarios usuario30 = new Usuarios("kathleenbruce", "1234", "Kathleen", "Bruce", "kathleenbruce@lyrichord.com", "novato", true);
		usuario30.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario30);

		Usuarios usuario31 = new Usuarios("berrymeyers", "1234", "Berry", "Meyers", "berrymeyers@lyrichord.com", "novato", true);
		usuario31.setAvatar("imgs/avatares/no-foto-male.png");
		this.usuarioService.add(usuario31);

		Usuarios usuario32 = new Usuarios("louiseratliff", "1234", "Louise", "Ratliff", "louiseratliff@lyrichord.com", "novato", true);
		usuario32.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario32);

		Usuarios usuario33 = new Usuarios("robertsonlarsen", "1234", "Robertson", "Larsen", "robertsonlarsen@lyrichord.com", "novato", true);
		usuario33.setAvatar("imgs/avatares/no-foto-male.png");
		this.usuarioService.add(usuario33);

		Usuarios usuario34 = new Usuarios("dixonrojas", "1234", "Dixon", "Rojas", "dixonrojas@lyrichord.com", "novato", true);
		usuario34.setAvatar("imgs/avatares/no-foto-male.png");
		this.usuarioService.add(usuario34);

		Usuarios usuario35 = new Usuarios("rosiemiller", "1234", "Rosie", "Miller", "rosiemiller@lyrichord.com", "novato", true);
		usuario35.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario35);

		Usuarios usuario36 = new Usuarios("lawandawhitfield", "1234", "Lawanda", "Whitfield", "lawandawhitfield@lyrichord.com", "novato", true);
		usuario36.setAvatar("imgs/avatares/no-foto-female.png");
		this.usuarioService.add(usuario36);

		Usuarios usuario37 = new Usuarios("terrellcameron", "1234", "Terrell", "Cameron", "terrellcameron@lyrichord.com", "novato", true);
		usuario37.setAvatar("imgs/avatares/no-foto-male.png");
		this.usuarioService.add(usuario37);

		/*Genero Actores*/
		Actores actor0 = new Actores("Ricardo", "Darín", 0, true);
		Actores actor1 = new Actores("Soledad", "Villamil", 0, true);
		Actores actor2 = new Actores("Pablo", "Rago", 0, true);
		Actores actor3 = new Actores("Javier", "Godino", 0, true);
		Actores actor4 = new Actores("Guillermo", "Francella", 0, true);
		Actores actor5 = new Actores("José", "Gioia", 0, true);
		Actores actor6 = new Actores("Mario", "Alarcón", 0, true);
		Actores actor7 = new Actores("Mariano", "Argento", 0, true);
		Actores actor8 = new Actores("Kiko", "Cerone", 0, true);
		Actores actor9 = new Actores("David", "Nápoli", 0, true);
		Actores actor10 = new Actores("Carla", "Quevedo", 0, true);
		Actores actor11 = new Actores("Gastón", "Pauls", 0, true);
		Actores actor12 = new Actores("Leticia", "Brédice", 0, true);
		Actores actor13 = new Actores("Tomás", "Fonzi", 0, true);
		Actores actor14 = new Actores("Ignasi", "Abadal", 0, true);
		Actores actor15 = new Actores("Roly", "Serrano", 0, true);
		Actores actor16 = new Actores("Alejandro", "Awada", 0, true);
		Actores actor17 = new Actores("Antonio", "Ugo", 0, true);
		Actores actor18 = new Actores("Elsa", "Berenguer", 0, true);
		Actores actor19 = new Actores("Celia", "Juárez", 0, true);
		Actores actor20 = new Actores("Leo", "Dyzen", 0, true);
		Actores actor21 = new Actores("Graciela", "Tenembaum", 0, true);
		Actores actor22 = new Actores("Oscar", "Núñez", 0, true);
		Actores actor23 = new Actores("María", "Villagra", 0, true);
		Actores actor24 = new Actores("Gabriel", "Correa", 0, true);
		Actores actor25 = new Actores("Luis", "Armesto", 0, true);
		Actores actor26 = new Actores("Pochi", "Ducasse", 0, true);
		Actores actor27 = new Actores("Ernesto", "Arias", 0, true);
		Actores actor28 = new Actores("Amancay", "Espíndola", 0, true);
		Actores actor29 = new Actores("Jorge", "Noya", 0, true);
		Actores actor30 = new Actores("Carlos", "Lanari", 0, true);
		Actores actor31 = new Actores("Roberto", "Rey", 0, true);
		Actores actor32 = new Actores("Carlos", "Falcone", 0, true);
		Actores actor33 = new Actores("Ricardo", "Mourelle", 0, true);
		Actores actor34 = new Actores("Emanuel", "Mercado", 0, true);
		Actores actor35 = new Actores("Ulises", "Celestino", 0, true);
		Actores actor36 = new Actores("Norberto", "Arcusín", 0, true);
		Actores actor37 = new Actores("Gabriel", "Molinelli", 0, true);
		Actores actor38 = new Actores("Claudio", "Rissi", 0, true);
		Actores actor39 = new Actores("Héctor", "Alterio", 0, true);
		Actores actor40 = new Actores("Norma", "Aleandro", 0, true);
		Actores actor41 = new Actores("Natalia", "Verbeke", 0, true);
		Actores actor42 = new Actores("Eduardo", "Blanco", 0, true);
		Actores actor43 = new Actores("Gimena", "Nóbile", 0, true);
		Actores actor44 = new Actores("Claudia", "Fontán", 0, true);
		Actores actor45 = new Actores("David", "Masajnik", 0, true);
		Actores actor46 = new Actores("Atilio", "Pozzobon", 0, true);
		Actores actor47 = new Actores("Salo", "Pasik", 0, true);
		Actores actor48 = new Actores("Darío", "Grandinetti", 0, true);
		Actores actor49 = new Actores("Leonardo", "Sbaraglia", 0, true);
		Actores actor50 = new Actores("Erica", "Rivas", 0, true);
		Actores actor51 = new Actores("Oscar", "Martínez", 0, true);
		Actores actor52 = new Actores("Julieta", "Zylberberg", 0, true);
		Actores actor53 = new Actores("Rita", "Cortese", 0, true);
		Actores actor54 = new Actores("María", "Onetto", 0, true);
		Actores actor55 = new Actores("Osmar", "Núñez", 0, true);
		Actores actor56 = new Actores("Nancy", "Dupláa", 0, true);
		Actores actor57 = new Actores("María", "Marull", 0, true);
		Actores actor58 = new Actores("Germán", "Silva", 0, true);
		Actores actor59 = new Actores("Marcelo", "Pozzi", 0, true);
		Actores actor60 = new Actores("Diego", "Gentile", 0, true);
		Actores actor61 = new Actores("Alan", "Daicz", 0, true);
		Actores actor62 = new Actores("Liliana", "Weimer", 0, true);
		Actores actor63 = new Actores("Claudio", "Delan", 0, true);
		Actores actor64 = new Actores("Lucila", "Mangone", 0, true);
		Actores actor65 = new Actores("Federico", "Liss", 0, true);
		Actores actor66 = new Actores("Walter", "Donado", 0, true);
		Actores actor67 = new Actores("Diego", "Velázquez", 0, true);
		Actores actor68 = new Actores("Margarita", "Molfino", 0, true);
		Actores actor69 = new Actores("César", "Bordón", 0, true);
		Actores actor70 = new Actores("Mónica", "Villa", 0, true);
		Actores actor71 = new Actores("Juan", "Linari", 0, true);
		Actores actor72 = new Actores("Federico", "Luppi", 0, true);
		Actores actor73 = new Actores("Mercedes", "Sampietro", 0, true);
		Actores actor74 = new Actores("Arturo", "Puig", 0, true);
		Actores actor75 = new Actores("Carlos", "Santamaría", 0, true);
		Actores actor76 = new Actores("Yael", "Bamatán", 0, true);
		Actores actor77 = new Actores("Valentina", "Bassi", 0, true);
		Actores actor78 = new Actores("María", "Fiorentino", 0, true);
		Actores actor79 = new Actores("Klaus", "Dietze", 0, true);
		Actores actor80 = new Actores("Eduardo", "Iaccono", 0, true);
		Actores actor81 = new Actores("Walter", "Jakob", 0, true);
		Actores actor82 = new Actores("Mariano", "Llinás", 0, true);
		Actores actor83 = new Actores("Horacio", "Marassi", 0, true);
		Actores actor84 = new Actores("Agustín", "Mendilaharzu", 0, true);
		Actores actor85 = new Actores("Óscar", "Martínez", 0, true);
		Actores actor86 = new Actores("Dady", "Brieva", 0, true);
		Actores actor87 = new Actores("Andrea", "Frigerio", 0, true);
		Actores actor88 = new Actores("Belén", "Chavanne", 0, true);
		Actores actor89 = new Actores("Nora", "Navas", 0, true);
		Actores actor90 = new Actores("Iván", "Steinhardt", 0, true);
		Actores actor91 = new Actores("Manuel", "Vicente", 0, true);
		Actores actor92 = new Actores("Marcelo", "D'Andrea", 0, true);
		Actores actor93 = new Actores("Gustavo", "Garzón", 0, true);
		Actores actor94 = new Actores("Emma", "Rivera", 0, true);
		Actores actor95 = new Actores("Javier", "Lombardo", 0, true);
		Actores actor96 = new Actores("Antonio", "Benedictis", 0, true);
		Actores actor97 = new Actores("Javiera", "Bravo", 0, true);
		Actores actor98 = new Actores("Laura", "Vagnoni", 0, true);
		Actores actor99 = new Actores("Mariela", "Díaz", 0, true);
		Actores actor100 = new Actores("Julia", "Solomonoff", 0, true);
		Actores actor101 = new Actores("Anibal", "Maldonado", 0, true);
		Actores actor102 = new Actores("Magín", "García", 0, true);
		Actores actor103 = new Actores("María", "Cianferoni", 0, true);
		Actores actor104 = new Actores("Carlos", "Monteros", 0, true);
		Actores actor105 = new Actores("Gael", "Bernal", 0, true);
		Actores actor106 = new Actores("Rodrigo", "Serna", 0, true);
		Actores actor107 = new Actores("Mía", "Maestro", 0, true);
		Actores actor108 = new Actores("Mercedes", "Morán", 0, true);
		Actores actor109 = new Actores("Jorge", "Chiarella", 0, true);
		Actores actor110 = new Actores("Gabriela", "Aguilera", 0, true);
		Actores actor111 = new Actores("Mariana", "Anghileri)", 0, true);
		Actores actor112 = new Actores("Javier", "Drolas", 0, true);
		Actores actor113 = new Actores("Valentina", "Liernud", 0, true);
		Actores actor114 = new Actores("Natalia", "Oreiro", 0, true);
		Actores actor115 = new Actores("Lautaro", "Delgado", 0, true);
		Actores actor116 = new Actores("Susana", "Pampín", 0, true);
		Actores actor117 = new Actores("Daniel", "Melingo", 0, true);
		Actores actor118 = new Actores("Ángela", "Torres", 0, true);
		Actores actor119 = new Actores("Daniel", "Valenzuela", 0, true);
		Actores actor120 = new Actores("Vanesa", "Weinberg", 0, true);
		Actores actor121 = new Actores("Carmen", "Maura", 0, true);
		Actores actor122 = new Actores("Rodrigo", "Noya", 0, true);
		Actores actor123 = new Actores("Julieta", "Cardinali", 0, true);
		Actores actor124 = new Actores("Jean", "Noher", 0, true);
		Actores actor125 = new Actores("Mex", "Urtizberea", 0, true);
		Actores actor126 = new Actores("Alejandro", "Agresti", 0, true);
		Actores actor127 = new Actores("Diego", "Peretti", 0, true);
		Actores actor128 = new Actores("Luis", "Luque", 0, true);
		Actores actor129 = new Actores("Oscar", "Ferreiro", 0, true);
		Actores actor130 = new Actores("Gabriela", "Izcovich", 0, true);
		Actores actor131 = new Actores("Martín", "Adjemián", 0, true);
		Actores actor132 = new Actores("Tony", "Lestingi", 0, true);
		Actores actor133 = new Actores("Carlos", "Portaluppi", 0, true);
		Actores actor134 = new Actores("Ernesto", "Claudio", 0, true);
		Actores actor135 = new Actores("Juan", "Botto", 0, true);
		Actores actor136 = new Actores("Susú", "Pecoraro", 0, true);
		Actores actor137 = new Actores("José", "Sacristán", 0, true);
		Actores actor138 = new Actores("Agustín", "Garvie", 0, true);
		Actores actor139 = new Actores("Vando", "Villamil", 0, true);
		Actores actor140 = new Actores("Marcela", "Kloosterboer", 0, true);
		Actores actor141 = new Actores("Maximiliano", "Ghione", 0, true);
		Actores actor142 = new Actores("Marina", "Gleezer", 0, true);
		Actores actor143 = new Actores("Carla", "Crespo", 0, true);
		Actores actor144 = new Actores("Marcos", "Mundstock", 0, true);
		Actores actor145 = new Actores("Raúl", "Rizzo", 0, true);
		Actores actor146 = new Actores("Alberto", "Jiménez", 0, true);
		Actores actor147 = new Actores("Ángel", "Facio", 0, true);
		Actores actor148 = new Actores("María", "Galiana", 0, true);
		Actores actor149 = new Actores("Marcos", "Woinski", 0, true);
		Actores actor150 = new Actores("Antonella", "Costa", 0, true);
		Actores actor151 = new Actores("Pablo", "Cedrón", 0, true);
		Actores actor152 = new Actores("Esteban", "Meloni", 0, true);
		Actores actor153 = new Actores("Mariana", "Briski", 0, true);
		Actores actor154 = new Actores("Hernán", "Jiménez", 0, true);
		Actores actor155 = new Actores("China", "Zorrilla", 0, true);
		Actores actor156 = new Actores("Manuel", "Alexandre", 0, true);
		Actores actor157 = new Actores("Blanca", "Portillo", 0, true);
		Actores actor158 = new Actores("Roberto", "Carnaghi", 0, true);
		Actores actor159 = new Actores("José", "Egido", 0, true);
		Actores actor160 = new Actores("Gonzalo", "Urtizberea", 0, true);
		Actores actor161 = new Actores("Omar", "Muñoz", 0, true);
		Actores actor162 = new Actores("Carlos", "Novoa", 0, true);
		Actores actor163 = new Actores("Fanny", "Gautier", 0, true);
		Actores actor164 = new Actores("Claudia", "Álvarez", 0, true);
		Actores actor165 = new Actores("Tomás", "Sáez", 0, true);
		Actores actor166 = new Actores("Pablo", "Echarri", 0, true);
		Actores actor167 = new Actores("Nazareno", "Casero", 0, true);
		Actores actor168 = new Actores("Matías", "Marmorato", 0, true);
		Actores actor169 = new Actores("Diego", "Gómez", 0, true);
		Actores actor170 = new Actores("Martín", "Urruty", 0, true);
		Actores actor171 = new Actores("Micaela", "Vázquez", 0, true);
		Actores actor172 = new Actores("Julián", "Krakov", 0, true);
		Actores actor173 = new Actores("Rubén", "Noceda", 0, true);
		Actores actor174 = new Actores("Alfonso", "Tort", 0, true);
		Actores actor175 = new Actores("César", "Albarracín", 0, true);
		Actores actor176 = new Actores("Leonardo", "Ramírez", 0, true);
		Actores actor177 = new Actores("Juan", "Villegas", 0, true);
		Actores actor178 = new Actores("Rosa", "Valsecchi", 0, true);
		Actores actor179 = new Actores("Pascual", "Condito", 0, true);
		Actores actor180 = new Actores("Carlos", "Rossi", 0, true);
		Actores actor181 = new Actores("Ulises", "Dumont", 0, true);
		Actores actor182 = new Actores("Silvina", "Bosco", 0, true);
		Actores actor183 = new Actores("Floria", "Bloise", 0, true);
		Actores actor184 = new Actores("Nicolás", "Condito", 0, true);
		Actores actor185 = new Actores("Tito", "Mendoza", 0, true);
		Actores actor186 = new Actores("Leonor", "Manso", 0, true);
		Actores actor187 = new Actores("Peto", "Menahem", 0, true);
		Actores actor188 = new Actores("Alejandra", "Manzo", 0, true);
		Actores actor189 = new Actores("Laura", "Cymer", 0, true);
		Actores actor190 = new Actores("Silke", "", 0, true);
		Actores actor191 = new Actores("Luis", "Machin", 0, true);
		Actores actor192 = new Actores("Carlos", "Belloso", 0, true);
		Actores actor193 = new Actores("Alfredo", "Casero", 0, true);
		Actores actor194 = new Actores("Marcelo", "Mazzarello", 0, true);
		Actores actor195 = new Actores("Julio", "Chávez", 0, true);
		Actores actor196 = new Actores("Luis", "Machín", 0, true);
		Actores actor197 = new Actores("Agostina", "Lage", 0, true);
		Actores actor198 = new Actores("Enrique", "Liporace", 0, true);
		Actores actor199 = new Actores("Rene", "Lavand", 0, true);
		Actores actor200 = new Actores("Freddy", "Flores", 0, true);
		Actores actor201 = new Actores("Ernesto", "Villegas", 0, true);
		Actores actor202 = new Actores("Cecilia", "Roth", 0, true);
		Actores actor203 = new Actores("Fernanda", "Mistral", 0, true);
		Actores actor204 = new Actores("Mónica", "Scapparone", 0, true);
		Actores actor205 = new Actores("Milton", "Canal", 0, true);
		Actores actor206 = new Actores("Matías", "Pozo", 0, true);
		Actores actor207 = new Actores("Evelyn", "Domínguez", 0, true);
		Actores actor208 = new Actores("Leticia", "Bredice", 0, true);
		Actores actor209 = new Actores("Nicolás", "Cantafio", 0, true);
		Actores actor210 = new Actores("Gabriel", "Galíndez", 0, true);
		Actores actor211 = new Actores("María", "Socas", 0, true);
		Actores actor212 = new Actores("Juan", "Carrasco", 0, true);
		Actores actor213 = new Actores("Demián", "Bugallo", 0, true);
		Actores actor214 = new Actores("Valentín", "Barrio", 0, true);
		Actores actor215 = new Actores("Oscar", "Ferrigno", 0, true);
		Actores actor216 = new Actores("Alberto", "Silva", 0, true);
		Actores actor217 = new Actores("Rosa", "Sánchez", 0, true);
		Actores actor218 = new Actores("Óscar", "Bertea", 0, true);
		Actores actor219 = new Actores("Marcelo", "Videla", 0, true);
		Actores actor220 = new Actores("Alberto", "Mercado", 0, true);
		Actores actor221 = new Actores("Héctor", "Anglada", 0, true);
		Actores actor222 = new Actores("Martina", "Gusman", 0, true);
		Actores actor223 = new Actores("Elli", "Medeiros", 0, true);
		Actores actor224 = new Actores("Rodrigo", "Santoro", 0, true);
		Actores actor225 = new Actores("Laura", "García", 0, true);
		Actores actor226 = new Actores("Tomás", "Plotinsky", 0, true);
		Actores actor227 = new Actores("Leonardo", "Sauma", 0, true);
		Actores actor228 = new Actores("Clara", "Sajnovetzky", 0, true);
		Actores actor229 = new Actores("Roberto", "Maciel", 0, true);
		Actores actor230 = new Actores("Walter", "Cignoli", 0, true);
		Actores actor231 = new Actores("Ricardo", "Ragendorfer", 0, true);
		Actores actor232 = new Actores("Hernán", "Piquín", 0, true);
		Actores actor233 = new Actores("Alejandra", "Baldoni", 0, true);
		Actores actor234 = new Actores("Natalia", "Pelayo", 0, true);
		Actores actor235 = new Actores("Jorge", "Torres", 0, true);
		Actores actor236 = new Actores("Luis", "Mazzeo", 0, true);
		Actores actor237 = new Actores("Ignacio", "Toselli", 0, true);
		Actores actor238 = new Actores("Mariana", "Anghileri", 0, true);
		Actores actor239 = new Actores("Alicia", "Palmes", 0, true);
		Actores actor240 = new Actores("Sofía", "Silva", 0, true);
		Actores actor241 = new Actores("Ariel", "Staltari", 0, true);
		Actores actor242 = new Actores("Pablo", "Ribba", 0, true);
		Actores actor243 = new Actores("Marcelo", "Nacci", 0, true);
		Actores actor244 = new Actores("Gabriel", "Goity", 0, true);
		Actores actor245 = new Actores("Corina", "Romero", 0, true);
		Actores actor246 = new Actores("Ricardo", "Niz", 0, true);
		Actores actor247 = new Actores("Norma", "Argentina", 0, true);
		Actores actor248 = new Actores("Raúl", "Panguinao", 0, true);
		Actores actor249 = new Actores("Susana", "Lanteri", 0, true);
		Actores actor250 = new Actores("Claudia", "Lapacó", 0, true);
		Actores actor251 = new Actores("Mónica", "Gonzaga", 0, true);
		Actores actor252 = new Actores("Eduardo", "Rodríguez", 0, true);
		Actores actor253 = new Actores("Alberto", "Laiseca", 0, true);
		Actores actor254 = new Actores("Sergio", "Pángaro", 0, true);
		Actores actor255 = new Actores("Andrés", "Duprat", 0, true);
		Actores actor256 = new Actores("Enrique", "Gagliesi", 0, true);
		Actores actor257 = new Actores("Ana", "Loza", 0, true);
		Actores actor258 = new Actores("Luciana", "Fauci", 0, true);
		Actores actor259 = new Actores("Graciela", "Borges", 0, true);
		Actores actor260 = new Actores("Martín", "Adjeiman", 0, true);
		Actores actor261 = new Actores("Leonora", "Balcarce", 0, true);
		Actores actor262 = new Actores("Diego", "Baenas", 0, true);
		Actores actor263 = new Actores("Silvia", "Bayel", 0, true);
		Actores actor264 = new Actores("Sofía", "Bertolotto", 0, true);
		Actores actor265 = new Actores("Valeria", "Bertuccelli", 0, true);
		Actores actor266 = new Actores("José", "Vázquez", 0, true);
		Actores actor267 = new Actores("Daniel", "Fanego", 0, true);
		Actores actor268 = new Actores("Silvia", "Kutika", 0, true);
		Actores actor269 = new Actores("Darío", "Levy", 0, true);
		Actores actor270 = new Actores("Monica", "Lairana", 0, true);
		Actores actor271 = new Actores("Rodrigo", "Silva", 0, true);
		Actores actor272 = new Actores("Adrián", "Witzke", 0, true);
		Actores actor273 = new Actores("Julieta", "Díaz", 0, true);
		Actores actor274 = new Actores("Clara", "Lago", 0, true);
		Actores actor275 = new Actores("Uma", "Salduende", 0, true);
		Actores actor276 = new Actores("Daniel", "Comini", 0, true);
		Actores actor277 = new Actores("Laura", "Faienza", 0, true);
		Actores actor278 = new Actores("Sergio", "Ferreiro", 0, true);
		Actores actor279 = new Actores("Facundo", "Giménez", 0, true);
		Actores actor280 = new Actores("Ariel", "Croce", 0, true);
		Actores actor281 = new Actores("Cristóbal", "Pinto", 0, true);
		Actores actor282 = new Actores("Ernesto", "Suarez", 0, true);
		Actores actor283 = new Actores("Elisa", "Carricajo", 0, true);
		Actores actor284 = new Actores("Marta", "Lubos", 0, true);
		Actores actor285 = new Actores("Maria", "Canale", 0, true);
		Actores actor286 = new Actores("Enrique", "Piñeyro", 0, true);
		Actores actor287 = new Actores("Adolfo", "Yanelli", 0, true);
		Actores actor288 = new Actores("Martín", "Slipak", 0, true);
		Actores actor289 = new Actores("Sergio", "Boris", 0, true);
		Actores actor290 = new Actores("Joaquín", "Furriel", 0, true);
		Actores actor291 = new Actores("Mónica", "Lairana", 0, true);
		Actores actor292 = new Actores("Guillermo", "Pfening", 0, true);
		Actores actor293 = new Actores("Luis", "Ziembrowski", 0, true);
		Actores actor294 = new Actores("Victoria", "Raposo", 0, true);
		Actores actor295 = new Actores("Andrea", "Garrote", 0, true);
		Actores actor296 = new Actores("Abel", "Ayala", 0, true);
		Actores actor297 = new Actores("Marina", "Glezer", 0, true);
		Actores actor298 = new Actores("Fernando", "Roa", 0, true);
		Actores actor299 = new Actores("Fabián", "Arenillas", 0, true);
		Actores actor300 = new Actores("Víctor", "Carrizo", 0, true);
		Actores actor301 = new Actores("Osvaldo", "Sanders", 0, true);
		Actores actor302 = new Actores("Rafael", "Spregelburd", 0, true);
		Actores actor303 = new Actores("Daniel", "Aráoz", 0, true);
		Actores actor304 = new Actores("Eugenia", "Alonso", 0, true);
		Actores actor305 = new Actores("Inés", "Budassi", 0, true);
		Actores actor306 = new Actores("Lorenza", "Acuña", 0, true);
		Actores actor307 = new Actores("Eugenio", "Scopel", 0, true);
		Actores actor308 = new Actores("Débora", "Zanolli", 0, true);
		Actores actor309 = new Actores("Bárbara", "Hang", 0, true);
		Actores actor310 = new Actores("Rubén", "Guzmán", 0, true);
		Actores actor311 = new Actores("Sol", "Alac", 0, true);
		Actores actor312 = new Actores("Sergio", "Baldini", 0, true);
		Actores actor313 = new Actores("Gerardo", "Chendo", 0, true);
		Actores actor314 = new Actores("Diego", "Mackenzie", 0, true);
		Actores actor315 = new Actores("Fernando", "Cia", 0, true);
		Actores actor316 = new Actores("Vera", "Fogwill", 0, true);
		Actores actor317 = new Actores("Lucía", "Snieg", 0, true);
		Actores actor318 = new Actores("Mirta", "Busnelli", 0, true);
		Actores actor319 = new Actores("Edda", "Díaz", 0, true);
		Actores actor320 = new Actores("Mariel", "Sanchez", 0, true);
		Actores actor321 = new Actores("Paola", "Krum", 0, true);
		Actores actor322 = new Actores("Claudio", "Gallardou", 0, true);
		Actores actor323 = new Actores("Diego", "Capusotto", 0, true);
		Actores actor324 = new Actores("Jacqueline", "Decibe", 0, true);
		Actores actor325 = new Actores("Ivana", "Acosta", 0, true);
		Actores actor326 = new Actores("Alfonso", "Sierra", 0, true);
		Actores actor327 = new Actores("Sebastián", "Toro", 0, true);
		Actores actor328 = new Actores("Juan", "Echanove", 0, true);
		Actores actor329 = new Actores("Juan", "Diego", 0, true);
		Actores actor330 = new Actores("Diego", "Torres", 0, true);
		Actores actor331 = new Actores("Rebeca", "Cobos", 0, true);
		Actores actor332 = new Actores("Vladimir", "Cruz", 0, true);
		Actores actor333 = new Actores("Enrique", "Quiñones", 0, true);
		Actores actor334 = new Actores("Alejandro", "Trejo", 0, true);
		Actores actor335 = new Actores("Gabriel", "Rovito", 0, true);
		Actores actor336 = new Actores("Pilar", "Ayala", 0, true);
		Actores actor337 = new Actores("Inés", "Efron", 0, true);
		Actores actor338 = new Actores("Carla", "Peterson", 0, true);
		Actores actor339 = new Actores("Rafael", "Ferro", 0, true);
		Actores actor340 = new Actores("Adrián", "Navarro", 0, true);
		Actores actor341 = new Actores("Jorge", "Lanata", 0, true);
		Actores actor342 = new Actores("Alan", "Pauls", 0, true);
		Actores actor343 = new Actores("Romina", "Paula", 0, true);
		Actores actor344 = new Actores("Peter", "Lanzani", 0, true);
		Actores actor345 = new Actores("Inés", "Popovich", 0, true);
		Actores actor346 = new Actores("Gastón", "Cocchiarale", 0, true);
		Actores actor347 = new Actores("Giselle", "Motta", 0, true);
		Actores actor348 = new Actores("Franco", "Masini", 0, true);
		Actores actor349 = new Actores("Antonia", "Bengoechea", 0, true);
		Actores actor350 = new Actores("Gabo", "Correa", 0, true);
		Actores actor351 = new Actores("Daniel", "Hendler", 0, true);
		Actores actor352 = new Actores("Adriana", "Aizemberg", 0, true);
		Actores actor353 = new Actores("Jorge", "D'Elía", 0, true);
		Actores actor354 = new Actores("Rosita", "Londner", 0, true);
		Actores actor355 = new Actores("Diego", "Korol", 0, true);
		Actores actor356 = new Actores("Melina", "Petriella", 0, true);
		Actores actor357 = new Actores("Juan", "Minujín", 0, true);
		Actores actor358 = new Actores("Norman", "Erlich", 0, true);
		Actores actor359 = new Actores("Alejandra", "Flechner", 0, true);
		Actores actor360 = new Actores("Malena", "Sánchez", 0, true);
		Actores actor361 = new Actores("Rita", "Pauls", 0, true);
		Actores actor362 = new Actores("Flavia", "Palmiero", 0, true);
		Actores actor363 = new Actores("Teo", "Moreno", 0, true);
		Actores actor364 = new Actores("Ernesto", "Alterio", 0, true);
		Actores actor365 = new Actores("César", "Troncoso", 0, true);
		Actores actor366 = new Actores("Cristina", "Banegas", 0, true);
		Actores actor367 = new Actores("Violeta", "Palukas", 0, true);
		Actores actor368 = new Actores("Alejandro", "Urdapilleta", 0, true);
		Actores actor369 = new Actores("Florencia", "Raggi", 0, true);
		Actores actor370 = new Actores("Ignacio", "Huang", 0, true);
		Actores actor371 = new Actores("Muriel", "Ana", 0, true);
		Actores actor372 = new Actores("Iván", "Romanelli", 0, true);
		Actores actor373 = new Actores("Vivian", "Jaber", 0, true);
		Actores actor374 = new Actores("Enric", "Cambray", 0, true);
		Actores actor375 = new Actores("Pablo", "Seijo", 0, true);
		Actores actor376 = new Actores("Joaquín", "Bouzas", 0, true);
		Actores actor377 = new Actores("Manuel", "Vignau", 0, true);
		Actores actor378 = new Actores("Mateo", "Chiarino", 0, true);
		Actores actor379 = new Actores("Mercedes", "Quinteros", 0, true);
		Actores actor380 = new Actores("Luz", "Palazón", 0, true);
		Actores actor381 = new Actores("Manuel", "Sobrad", 0, true);
		Actores actor382 = new Actores("Jorge", "Román", 0, true);
		Actores actor383 = new Actores("Mimí", "Ardú", 0, true);
		Actores actor384 = new Actores("Victor", "Carrizo", 0, true);
		Actores actor385 = new Actores("Hugo", "Anganuzzi", 0, true);
		Actores actor386 = new Actores("Luis", "Vicat", 0, true);
		Actores actor387 = new Actores("Graciana", "Chironi", 0, true);
		Actores actor388 = new Actores("Roberto", "Posse", 0, true);
		Actores actor389 = new Actores("Anibal", "Barengo", 0, true);
		Actores actor390 = new Actores("Lucas", "Olivera", 0, true);
		Actores actor391 = new Actores("Jorge", "Giménez", 0, true);
		Actores actor392 = new Actores("Daniel", "Coria", 0, true);
		Actores actor393 = new Actores("Gastón", "Polo", 0, true);
		Actores actor394 = new Actores("Argentino", "Vargas", 0, true);
		Actores actor395 = new Actores("Francisco", "Dornez", 0, true);
		Actores actor396 = new Actores("Yolanda", "Galarza", 0, true);
		Actores actor397 = new Actores("Víctor", "Varela", 0, true);
		Actores actor398 = new Actores("Francisco", "Salazar", 0, true);
		Actores actor399 = new Actores("Hilda", "Chamorro", 0, true);
		Actores actor400 = new Actores("Ángel", "Vera", 0, true);
		Actores actor401 = new Actores("Javier", "Lenciza", 0, true);
		Actores actor402 = new Actores("Bárbara", "Goenaga", 0, true);
		Actores actor403 = new Actores("Ana", "Celentano", 0, true);
		Actores actor404 = new Actores("Liliana", "Capuro", 0, true);
		Actores actor405 = new Actores("Ruth", "Dobel", 0, true);
		Actores actor406 = new Actores("Federico", "Esquerro", 0, true);
		Actores actor407 = new Actores("Nicolás", "López", 0, true);
		Actores actor408 = new Actores("Bernardo", "Forteza", 0, true);
		Actores actor409 = new Actores("Laura", "Glave", 0, true);
		Actores actor410 = new Actores("Leila", "Gómez", 0, true);
		Actores actor411 = new Actores("Marianela", "Pedano", 0, true);
		Actores actor412 = new Actores("Carlos", "Resta", 0, true);
		Actores actor413 = new Actores("Raúl", "Viñoles", 0, true);
		Actores actor414 = new Actores("Liliana", "Escobar", 0, true);
		Actores actor415 = new Actores("Daniel", "Pereira", 0, true);
		Actores actor416 = new Actores("John", "McInerny", 0, true);
		Actores actor417 = new Actores("Griselda", "Siciliani", 0, true);
		Actores actor418 = new Actores("Margarita", "López", 0, true);
		Actores actor419 = new Actores("Rocío", "Presedo", 0, true);
		Actores actor420 = new Actores("Nora", "Childers", 0, true);
		Actores actor421 = new Actores("Ariadna", "Gil", 0, true);
		Actores actor422 = new Actores("Malena", "Solda", 0, true);
		Actores actor423 = new Actores("Nancy", "Duplaa", 0, true);
		Actores actor424 = new Actores("Nicolás", "Pauls", 0, true);
		Actores actor425 = new Actores("Cristina", "Fridman", 0, true);
		Actores actor426 = new Actores("Sofìa", "Castiglione", 0, true);
		Actores actor427 = new Actores("Romina", "Ricci", 0, true);
		Actores actor428 = new Actores("Julio", "Arrieta", 0, true);
		Actores actor429 = new Actores("Dolores", "Fernández", 0, true);
		Actores actor430 = new Actores("Claudia", "Herrera", 0, true);
		Actores actor431 = new Actores("Ignacio", "Benítez", 0, true);
		Actores actor432 = new Actores("Carlos", "Bella", 0, true);
		Actores actor433 = new Actores("Paola", "Rotela", 0, true);
		Actores actor434 = new Actores("Silvina", "Fontelles", 0, true);
		Actores actor435 = new Actores("Miguel", "Colman", 0, true);
		Actores actor436 = new Actores("Leandro", "Castello", 0, true);
		Actores actor437 = new Actores("Mercedes", "Scapola", 0, true);
		Actores actor438 = new Actores("Mariano", "Martínez", 0, true);
		Actores actor439 = new Actores("Karina", "Dali", 0, true);
		Actores actor440 = new Actores("Facundo", "Espinosa", 0, true);
		Actores actor441 = new Actores("Santiago", "Pedrero", 0, true);
		Actores actor442 = new Actores("Celina", "Zambón", 0, true);
		Actores actor443 = new Actores("Marcos", "Zucker", 0, true);
		Actores actor444 = new Actores("Darío", "Torrens", 0, true);
		Actores actor445 = new Actores("Cecilia", "Trejo", 0, true);
		Actores actor446 = new Actores("Laura", "Paredes", 0, true);
		Actores actor447 = new Actores("Valeria", "Lois", 0, true);
		Actores actor448 = new Actores("Marcelo", "Subiotto", 0, true);
		Actores actor449 = new Actores("Rafael", "Federman", 0, true);
		Actores actor450 = new Actores("Martín", "Piroyansky", 0, true);
		Actores actor451 = new Actores("Germán", "Palacios", 0, true);
		Actores actor452 = new Actores("Carolina", "Peleritti", 0, true);
		Actores actor453 = new Actores("Guillermo", "Angelelli", 0, true);
		Actores actor454 = new Actores("Animation", "", 0, true);
		Actores actor455 = new Actores("Darío", "Valenzuela", 0, true);
		Actores actor456 = new Actores("Carlos", "Weber", 0, true);
		Actores actor457 = new Actores("José", "Arias", 0, true);
		Actores actor458 = new Actores("Loren", "Acuña", 0, true);
		Actores actor459 = new Actores("Gabriel", "Almirón", 0, true);
		Actores actor460 = new Actores("José", "Espeche", 0, true);
		Actores actor461 = new Actores("Guadalupe", "Alonso", 0, true);
		Actores actor462 = new Actores("María", "Merendino", 0, true);
		Actores actor463 = new Actores("Mirella", "Pascual", 0, true);
		Actores actor464 = new Actores("Silvia", "Tavcar", 0, true);
		Actores actor465 = new Actores("Nicolás", "Treise", 0, true);
		Actores actor466 = new Actores("Misael", "Saavedra", 0, true);
		Actores actor467 = new Actores("Humberto", "Estrada", 0, true);
		Actores actor468 = new Actores("Rafael", "Estrada", 0, true);
		Actores actor469 = new Actores("Omar", "Didino", 0, true);
		Actores actor470 = new Actores("Javier", "Didino", 0, true);
		Actores actor471 = new Actores("Bárbara", "Lombardo", 0, true);
		Actores actor472 = new Actores("Susana", "Campos", 0, true);
		Actores actor473 = new Actores("Hugo", "Arana", 0, true);
		Actores actor474 = new Actores("Osvaldo", "Santoro", 0, true);
		Actores actor475 = new Actores("Mercedes", "Funes", 0, true);
		Actores actor476 = new Actores("Silvia", "Baylé", 0, true);
		Actores actor477 = new Actores("Dolores", "Fonzi", 0, true);
		Actores actor478 = new Actores("Walter", "Reyno", 0, true);
		Actores actor479 = new Actores("Jorge", "D´Elía", 0, true);
		Actores actor480 = new Actores("Nahuel", "Biscayart", 0, true);
		Actores actor481 = new Actores("Jazmín", "Stuart", 0, true);
		Actores actor482 = new Actores("Martín", "Feldman", 0, true);
		Actores actor483 = new Actores("Miguel", "Dedovich", 0, true);
		Actores actor484 = new Actores("Juan", "Leyrado", 0, true);
		Actores actor485 = new Actores("Virginia", "Inocenti", 0, true);
		Actores actor486 = new Actores("Arturo", "Bonín", 0, true);
		Actores actor487 = new Actores("María", "Carámbula", 0, true);
		Actores actor488 = new Actores("Pepe", "Novoa", 0, true);
		Actores actor489 = new Actores("Óscar", "Núñez", 0, true);
		Actores actor490 = new Actores("Mónica", "Antonopulos", 0, true);
		Actores actor491 = new Actores("Mabel", "Pessen", 0, true);
		Actores actor492 = new Actores("Érica", "Rivas", 0, true);
		Actores actor493 = new Actores("Susana", "Pampin", 0, true);
		Actores actor494 = new Actores("Elvira", "Onetto", 0, true);
		Actores actor495 = new Actores("Roberto", "Suárez", 0, true);
		Actores actor496 = new Actores("Rosana", "Vezzoni", 0, true);
		Actores actor497 = new Actores("Jorge", "Marrale", 0, true);
		Actores actor498 = new Actores("Belén", "Blanco", 0, true);
		Actores actor499 = new Actores("Esteban", "Pérez", 0, true);
		Actores actor500 = new Actores("Duilio", "Marzio", 0, true);
		Actores actor501 = new Actores("Jean", "Reguerraz", 0, true);
		Actores actor502 = new Actores("Mónica", "Cabrera", 0, true);
		Actores actor503 = new Actores("Luís", "Machín", 0, true);
		Actores actor504 = new Actores("Cecilia", "Rosetto", 0, true);
		Actores actor505 = new Actores("Luciano", "Cáceres", 0, true);
		Actores actor506 = new Actores("M.Laura", "Caccamo", 0, true);
		Actores actor507 = new Actores("Paloma", "Contreras", 0, true);
		Actores actor508 = new Actores("Vera", "Carneval", 0, true);
		Actores actor509 = new Actores("Esteban", "Lamothe", 0, true);
		Actores actor510 = new Actores("Ricardo", "Felix", 0, true);
		Actores actor511 = new Actores("Valeria", "Correa", 0, true);
		Actores actor512 = new Actores("Rubén", "Beltrán", 0, true);
		Actores actor513 = new Actores("Armando", "Galvalisi", 0, true);
		Actores actor514 = new Actores("Gabriel", "Méndez", 0, true);
		Actores actor515 = new Actores("Alejandro", "Méndez", 0, true);
		Actores actor516 = new Actores("Natalia", "Gómez", 0, true);
		Actores actor517 = new Actores("Franco", "González", 0, true);
		Actores actor518 = new Actores("María", "Alche", 0, true);
		Actores actor519 = new Actores("Alejo", "Mango", 0, true);
		Actores actor520 = new Actores("Arturo", "Goetz", 0, true);
		Actores actor521 = new Actores("Adrián", "Suar", 0, true);
		Actores actor522 = new Actores("Marcelo", "Xicarte", 0, true);
		Actores actor523 = new Actores("Luis", "Herrera", 0, true);
		Actores actor524 = new Actores("Martín", "Salazar", 0, true);
		Actores actor525 = new Actores("Oscar", "Nuñez", 0, true);
		Actores actor526 = new Actores("Benjamín", "Amadeo", 0, true);
		Actores actor527 = new Actores("Lucas", "Ferraro", 0, true);
		Actores actor528 = new Actores("Damián", "Canduci", 0, true);
		Actores actor529 = new Actores("Ana", "Antony", 0, true);
		Actores actor530 = new Actores("Carolina", "Stegmayer", 0, true);
		Actores actor531 = new Actores("Antonia", "Michelis", 0, true);
		Actores actor532 = new Actores("Damián", "Dreizik", 0, true);
		Actores actor533 = new Actores("Juan", "Bianchi", 0, true);
		Actores actor534 = new Actores("Kevin", "Sztajn", 0, true);
		Actores actor535 = new Actores("Marcos", "Montes", 0, true);
		Actores actor536 = new Actores("Luis", "Sabatini", 0, true);
		Actores actor537 = new Actores("Guillermo", "Arengo", 0, true);
		Actores actor538 = new Actores("Maya", "Lesca", 0, true);
		Actores actor539 = new Actores("Verónica", "Piaggio", 0, true);
		Actores actor540 = new Actores("Davis", "Burgos", 0, true);
		Actores actor541 = new Actores("Jannette", "Clemenceau", 0, true);
		Actores actor542 = new Actores("Marcos", "Dubuch", 0, true);
		Actores actor543 = new Actores("Totó", "López", 0, true);
		Actores actor544 = new Actores("Miguel", "Porro", 0, true);
		Actores actor545 = new Actores("Sandra", "Rodríguez", 0, true);
		Actores actor546 = new Actores("José", "Soriano", 0, true);
		Actores actor547 = new Actores("León", "Dogodny", 0, true);
		Actores actor548 = new Actores("Juan", "Ciancio", 0, true);
		Actores actor549 = new Actores("Javier", "Olivera", 0, true);
		Actores actor550 = new Actores("Anita", "Gutierrez", 0, true);
		Actores actor551 = new Actores("Martín", "Rodríguez", 0, true);
		Actores actor552 = new Actores("Iván", "Espeche", 0, true);
		Actores actor553 = new Actores("Juan", "West", 0, true);
		Actores actor554 = new Actores("Román", "Tanoni", 0, true);
		Actores actor555 = new Actores("Estanislao", "Silveyra", 0, true);
		Actores actor556 = new Actores("Paula", "Brasca", 0, true);
		Actores actor557 = new Actores("Francisco", "Suárez", 0, true);
		Actores actor558 = new Actores("Lisandro", "Rodríguez", 0, true);
		Actores actor559 = new Actores("Felipe", "Colombo", 0, true);
		Actores actor560 = new Actores("Mirta", "Bogdasarian", 0, true);
		Actores actor561 = new Actores("Fernando", "Arman", 0, true);
		Actores actor562 = new Actores("Patrick", "Dell'Isola", 0, true);
		Actores actor563 = new Actores("Carlos", "Defeo", 0, true);
		Actores actor564 = new Actores("Miguel", "Solá", 0, true);
		Actores actor565 = new Actores("Gerardo", "Romano", 0, true);
		Actores actor566 = new Actores("Patricio", "Contreras", 0, true);
		Actores actor567 = new Actores("Arturo", "Maly", 0, true);
		Actores actor568 = new Actores("Inés", "Estévez", 0, true);
		Actores actor569 = new Actores("Juan", "León", 0, true);
		Actores actor570 = new Actores("Oscar", "Alegre", 0, true);
		Actores actor571 = new Actores("Martín", "Pavlovsky", 0, true);
		Actores actor572 = new Actores("Luis", "Margani", 0, true);
		Actores actor573 = new Actores("Mario", "Paolucci", 0, true);
		Actores actor574 = new Actores("Tito", "Gómez", 0, true);
		Actores actor575 = new Actores("Gerardo", "Dayub", 0, true);
		Actores actor576 = new Actores("Héctor", "Molina", 0, true);
		Actores actor577 = new Actores("Raúl", "Calandra", 0, true);
		Actores actor578 = new Actores("David", "Edery", 0, true);
		Actores actor579 = new Actores("Daniel", "Briguet", 0, true);
		Actores actor580 = new Actores("Pablo", "Fossa", 0, true);
		Actores actor581 = new Actores("Camila", "Villada", 0, true);
		Actores actor582 = new Actores("Maite", "Lanata", 0, true);
		Actores actor583 = new Actores("Naty", "Menstrual", 0, true);
		Actores actor584 = new Actores("German", "Silva", 0, true);
		Actores actor585 = new Actores("Ernesto", "Candoni", 0, true);
		Actores actor586 = new Actores("Carole", "Bouquet", 0, true);
		Actores actor587 = new Actores("Juan", "Doménech", 0, true);
		Actores actor588 = new Actores("Goya", "Toledo", 0, true);
		Actores actor589 = new Actores("Ignacio", "Jiménez", 0, true);
		Actores actor590 = new Actores("Aymará", "Rovera", 0, true);
		Actores actor591 = new Actores("Cecilia", "Dopazo", 0, true);
		Actores actor592 = new Actores("Luis", "Brandoni", 0, true);
		Actores actor593 = new Actores("Maria", "Tobal", 0, true);
		Actores actor594 = new Actores("Carlos", "Roffé", 0, true);
		Actores actor595 = new Actores("Mónica", "Galán", 0, true);
		Actores actor596 = new Actores("Lidia", "Catalano", 0, true);
		Actores actor597 = new Actores("Agustina", "Noya", 0, true);
		Actores actor598 = new Actores("Eduardo", "Argaranaz", 0, true);
		Actores actor599 = new Actores("Óscar", "Soto", 0, true);
		Actores actor600 = new Actores("Àlex", "Brendemühl", 0, true);
		Actores actor601 = new Actores("Elena", "Roger", 0, true);
		Actores actor602 = new Actores("Ana", "Pauls", 0, true);
		Actores actor603 = new Actores("Florencia", "Bado", 0, true);
		Actores actor604 = new Actores("Abril", "Braunstein", 0, true);
		Actores actor605 = new Actores("Juani", "Martínez", 0, true);
		Actores actor606 = new Actores("Alberto", "Mendoza", 0, true);
		Actores actor607 = new Actores("Ailen", "Guerrero", 0, true);
		Actores actor608 = new Actores("Norman", "Briski", 0, true);
		Actores actor609 = new Actores("Analia", "Couceyro", 0, true);
		Actores actor610 = new Actores("Cecilia", "Rossetto", 0, true);
		Actores actor611 = new Actores("Mario", "Alarcon", 0, true);
		Actores actor612 = new Actores("Jimena", "Torre", 0, true);
		Actores actor613 = new Actores("Conrado", "Valenzuela", 0, true);
		Actores actor614 = new Actores("Max", "Berliner", 0, true);
		Actores actor615 = new Actores("Sebastián", "Molinaro", 0, true);
		Actores actor616 = new Actores("Sofía", "Palomino", 0, true);
		Actores actor617 = new Actores("Sandra", "Villani", 0, true);
		Actores actor618 = new Actores("Paula", "Ituriza", 0, true);
		Actores actor619 = new Actores("Ignacia", "Allamand", 0, true);
		Actores actor620 = new Actores("María", "Izquierdo", 0, true);
		Actores actor621 = new Actores("Horacio", "Peña", 0, true);
		Actores actor622 = new Actores("Ariana", "Morini", 0, true);
		Actores actor623 = new Actores("Manuel", "Navarro", 0, true);
		Actores actor624 = new Actores("Daniel", "Toppino", 0, true);
		Actores actor625 = new Actores("Horacio", "Acosta", 0, true);
		Actores actor626 = new Actores("Cristian", "Salguero", 0, true);
		Actores actor627 = new Actores("Verónica", "Llinás", 0, true);
		Actores actor628 = new Actores("Laura", "Moyano", 0, true);
		Actores actor629 = new Actores("Emilio", "Disi", 0, true);
		Actores actor630 = new Actores("Darío", "Lopilato", 0, true);
		Actores actor631 = new Actores("Eusebio", "Poncela", 0, true);
		Actores actor632 = new Actores("Francisco", "Carrasco", 0, true);
		Actores actor633 = new Actores("Federica", "Cafferata", 0, true);
		Actores actor634 = new Actores("Verónica", "Nonni", 0, true);
		Actores actor635 = new Actores("Laura", "Rúpolo", 0, true);
		Actores actor636 = new Actores("Betiana", "Blum", 0, true);
		Actores actor637 = new Actores("Hebe", "Duarte", 0, true);
		Actores actor638 = new Actores("Nayra", "Mamani", 0, true);
		Actores actor639 = new Actores("Carlos", "Bermejo", 0, true);
		Actores actor640 = new Actores("Pilar", "Gamboa", 0, true);
		Actores actor641 = new Actores("Atilio", "Pozzobón", 0, true);
		Actores actor642 = new Actores("María", "Ucedo", 0, true);
		Actores actor643 = new Actores("Elvira", "Villariño", 0, true);
		Actores actor644 = new Actores("Soledad", "Cagnoni", 0, true);
		Actores actor645 = new Actores("Augustín", "Mendilaharzu", 0, true);
		Actores actor646 = new Actores("Agustín", "Markert", 0, true);
		Actores actor647 = new Actores("Carolina", "Fal", 0, true);
		Actores actor648 = new Actores("Diego", "Rafecas", 0, true);
		Actores actor649 = new Actores("Tina", "Serrano", 0, true);
		Actores actor650 = new Actores("Nelly", "Prince", 0, true);
		Actores actor651 = new Actores("Boy", "Olmi", 0, true);
		Actores actor652 = new Actores("Paula", "Siero", 0, true);
		Actores actor653 = new Actores("Vera", "Carnevale", 0, true);
		Actores actor654 = new Actores("Juan", "Tenuta", 0, true);
		Actores actor655 = new Actores("Iván", "Pineda", 0, true);
		Actores actor656 = new Actores("Henny", "Trayles", 0, true);
		Actores actor657 = new Actores("Mirta", "Wons", 0, true);
		Actores actor658 = new Actores("Rosario", "Blefari", 0, true);
		Actores actor659 = new Actores("Sergio", "Prina", 0, true);
		Actores actor660 = new Actores("Cynthia", "Avellaneda", 0, true);
		Actores actor661 = new Actores("Liliana", "Juarez", 0, true);
		Actores actor662 = new Actores("Nicolás", "Aráoz", 0, true);
		Actores actor663 = new Actores("Daniel", "Elías", 0, true);
		Actores actor664 = new Actores("Andrea", "Galante", 0, true, 320);
		Actores actor665 = new Actores("Federico", "Cánepa", 0, true);
		Actores actor666 = new Actores("Ingrid", "Pelicori", 0, true);
		Actores actor667 = new Actores("María", "Gabín", 0, true);
		Actores actor668 = new Actores("Juan", "Galván", 0, true);
		Actores actor669 = new Actores("Reneé", "Darin", 0, true);
		Actores actor670 = new Actores("Oscar", "Sisto", 0, true);
		Actores actor671 = new Actores("Pasta", "Dioguardi", 0, true);
		Actores actor672 = new Actores("Néstor", "Sánchez", 0, true);
		Actores actor673 = new Actores("Juan", "Ballinou", 0, true, 520);
		Actores actor674 = new Actores("Lucas", "Ana", 0, true);
		Actores actor675 = new Actores("Ernesto", "Larrese", 0, true);
		Actores actor676 = new Actores("Nuria", "Burak", 0, true, 521);
		Actores actor677 = new Actores("Ramiro", "Agüero", 0, true, 555);
		Actores actor678 = new Actores("Ignacio", "Mendi", 0, true);
		Actores actor679 = new Actores("José", "Cortez", 0, true);
		Actores actor680 = new Actores("Rafael", "Filipelli", 0, true);
		Actores actor681 = new Actores("Jérémie", "Renier", 0, true);
		Actores actor682 = new Actores("Federico", "Barga", 0, true);
		Actores actor683 = new Actores("Mauricio", "Minetti", 0, true);
		Actores actor684 = new Actores("Gabriel", "Vicentico)", 0, true);
		Actores actor685 = new Actores("Cecilia", "Biagini", 0, true);
		Actores actor686 = new Actores("Diego", "Olivera", 0, true);
		Actores actor687 = new Actores("Leonardo", "Azamor", 0, true);
		Actores actor688 = new Actores("Esther", "Goris", 0, true);
		Actores actor689 = new Actores("Sofía", "Castiglione", 0, true);
		Actores actor690 = new Actores("Roberto", "Vallejos", 0, true, 1200);
		Actores actor691 = new Actores("Sebastián", "Cantoni", 0, true);
		Actores actor692 = new Actores("Valeria", "Medina", 0, true);
		Actores actor693 = new Actores("Willy", "Lemos", 0, true);
		Actores actor694 = new Actores("Juan", "Palomino", 0, true);
		Actores actor695 = new Actores("María", "Villar", 0, true);
		Actores actor696 = new Actores("Agustina", "Muñoz", 0, true);
		Actores actor697 = new Actores("Gabi", "Saidón", 0, true);
		Actores actor698 = new Actores("Julia", "Rubio", 0, true);
		Actores actor699 = new Actores("Esteban", "Bigliardi", 0, true);
		Actores actor700 = new Actores("Julián", "Tello", 0, true);
		Actores actor701 = new Actores("Pablo", "Sigal", 0, true);
		Actores actor702 = new Actores("Alberto", "Ajaka", 0, true, 632);
		Actores actor703 = new Actores("Nacha", "Guevara", 0, true);
		Actores actor704 = new Actores("Sandra", "Ballesteros", 0, true);
		Actores actor705 = new Actores("Santiago", "Ramos", 0, true);
		Actores actor706 = new Actores("Manuel", "Bandera", 0, true);
		Actores actor707 = new Actores("Francisco", "Colja", 0, true);
		Actores actor708 = new Actores("Yohana", "Pereyra", 0, true);
		Actores actor709 = new Actores("Martín", "Rena", 0, true);
		Actores actor710 = new Actores("Rodrigo", "Savina", 0, true);
		Actores actor711 = new Actores("Gustavo", "Almada", 0, true);
		Actores actor712 = new Actores("Fabio", "Aste", 0, true);
		Actores actor713 = new Actores("Nontué", "Bautista", 0, true);
		Actores actor714 = new Actores("Alicia", "Aller", 0, true);
		Actores actor715 = new Actores("Ezequiel", "Diaz", 0, true);
		Actores actor716 = new Actores("Celina", "Font", 0, true);
		Actores actor717 = new Actores("Marcelo", "Melingo", 0, true);
		Actores actor718 = new Actores("Lautaro", "Sagardoy", 0, true);
		Actores actor719 = new Actores("Brian", "Sichel", 0, true);
		Actores actor720 = new Actores("Victoria", "Almeida", 0, true, 850);
		Actores actor721 = new Actores("Oscar", "Ayala", 0, true);
		Actores actor722 = new Actores("Sandra", "Hoyos", 0, true);
		Actores actor723 = new Actores("Kharold", "García", 0, true);
		Actores actor724 = new Actores("Laura", "Novoa", 0, true);
		Actores actor725 = new Actores("Fernán", "Mirás", 0, true);
		Actores actor726 = new Actores("Inés", "Efrón", 0, true);
		Actores actor727 = new Actores("Guadalupe", "Docampo", 0, true);
		Actores actor728 = new Actores("Guido", "Fiara", 0, true);
		Actores actor729 = new Actores("Elcida", "Villagra", 0, true);
		Actores actor730 = new Actores("María", "Alché", 0, true);
		Actores actor731 = new Actores("Alejandra", "Darín", 0, true);
		Actores actor732 = new Actores("Ana", "Fernández", 0, true);
		Actores actor733 = new Actores("Ágatha", "Fresco", 0, true);
		Actores actor734 = new Actores("Eugenia", "Tobal", 0, true);
		Actores actor735 = new Actores("Emilia", "Attías", 0, true);
		Actores actor736 = new Actores("Akemi", "Nakamura", 0, true);
		Actores actor737 = new Actores("Maricel", "Álvarez", 0, true);
		Actores actor738 = new Actores("Verónica", "Hassan", 0, true);
		Actores actor739 = new Actores("Tatiana", "Saphir", 0, true);
		Actores actor740 = new Actores("Marcos", "Ferrante", 0, true);
		Actores actor741 = new Actores("María", "Merlino", 0, true);
		Actores actor742 = new Actores("Nicolás", "Scarpino", 0, true);
		Actores actor743 = new Actores("Monica", "Francovich", 0, true);
		Actores actor744 = new Actores("Agustina", "Rudi", 0, true);
		Actores actor745 = new Actores("Paula", "Sartor", 0, true);
		Actores actor746 = new Actores("Nadia", "Gazze", 0, true);
		Actores actor747 = new Actores("Jorgelina", "Aruzzi", 0, true);
		Actores actor748 = new Actores("Nora", "Cárpena", 0, true);
		Actores actor749 = new Actores("Mauricio", "Dayub", 0, true);
		Actores actor750 = new Actores("Nicolás", "Francella", 0, true);
		Actores actor751 = new Actores("María", "Sinisterra", 0, true);
		Actores actor752 = new Actores("Imanol", "Arias", 0, true);
		Actores actor753 = new Actores("Stefania", "Sandrelli", 0, true);
		Actores actor754 = new Actores("Chiara", "Caselli", 0, true);
		Actores actor755 = new Actores("Gabriela", "Acher", 0, true);
		Actores actor756 = new Actores("Edda", "Bustamante", 0, true);
		Actores actor757 = new Actores("Sandra", "Sandrelli", 0, true);
		Actores actor758 = new Actores("Óscar", "Ferrigno", 0, true);
		Actores actor759 = new Actores("Eugenia", "Levin", 0, true);
		Actores actor760 = new Actores("Diego", "Rodríguez", 0, true);
		Actores actor761 = new Actores("Pia", "Uribelarrea", 0, true);
		Actores actor762 = new Actores("Irene", "Goldzer", 0, true);
		Actores actor763 = new Actores("Luciana", "Dulizky", 0, true);
		Actores actor764 = new Actores("Martín", "Aguilar", 0, true, 23);
		Actores actor765 = new Actores("Maite", "Zumelzú", 0, true);
		Actores actor766 = new Actores("Eugenia", "Capizzano", 0, true);
		Actores actor767 = new Actores("Estefanía", "Conejo", 0, true);
		Actores actor768 = new Actores("Javier", "Heras", 0, true);
		Actores actor769 = new Actores("María", "Passo", 0, true);
		Actores actor770 = new Actores("María", "Sancerni", 0, true);
		Actores actor771 = new Actores("Rosario", "Shanly", 0, true);
		Actores actor772 = new Actores("Matías", "Castelli", 0, true);
		Actores actor773 = new Actores("Martina", "Juncadella", 0, true);
		Actores actor774 = new Actores("Ignacio", "Rogers", 0, true);
		Actores actor775 = new Actores("Alberto", "Apel", 0, true);
		Actores actor776 = new Actores("Daniel", "Kuzniecka", 0, true);
		Actores actor777 = new Actores("Dolores", "Solá", 0, true);
		Actores actor778 = new Actores("Nuria", "Gago", 0, true);
		Actores actor779 = new Actores("Viviana", "Saccone", 0, true);
		Actores actor780 = new Actores("Julia", "Calvo", 0, true);
		Actores actor781 = new Actores("Carlos", "Kaspar", 0, true);
		Actores actor782 = new Actores("Juan", "Minujin", 0, true);
		Actores actor783 = new Actores("Ana", "Katz", 0, true, 316);
		Actores actor784 = new Actores("Malena", "Figo", 0, true);
		Actores actor785 = new Actores("Luciano", "Cazaux", 0, true);
		Actores actor786 = new Actores("Carlos", "Garric", 0, true);
		Actores actor787 = new Actores("Diego", "Leske", 0, true);
		Actores actor788 = new Actores("Constanza", "Marino", 0, true);
		Actores actor789 = new Actores("Carlos", "Issa", 0, true);
		Actores actor790 = new Actores("Francisco", "Nepomuceno", 0, true, 95);
		Actores actor791 = new Actores("Marcelo", "Sein", 0, true);

		/*Genero Categorias*/
		Generos genero0 = new Generos("Thriller");
		this.generoService.add(genero0);
		Generos genero1 = new Generos("Drama");
		this.generoService.add(genero1);
		Generos genero2 = new Generos("Comedia");
		this.generoService.add(genero2);
		Generos genero3 = new Generos("Intriga");
		this.generoService.add(genero3);
		Generos genero4 = new Generos("Aventuras");
		this.generoService.add(genero4);
		Generos genero5 = new Generos("Romance");
		this.generoService.add(genero5);
		Generos genero6 = new Generos("Ciencia ficción");
		this.generoService.add(genero6);
		Generos genero7 = new Generos("Animación");
		this.generoService.add(genero7);
		Generos genero8 = new Generos("Bélico");
		this.generoService.add(genero8);
		Generos genero9 = new Generos("Fantástico");
		this.generoService.add(genero9);

		/*Genero Directores*/
		Directores director0 = new Directores("Juan", "Campanella", 0, true);
		this.directorService.add(director0);
		Directores director1 = new Directores("Fabián", "Bielinsky", 0, true);
		this.directorService.add(director1);
		Directores director2 = new Directores("Damián", "Szifrón", 0, true);
		this.directorService.add(director2);
		Directores director3 = new Directores("Adolfo", "Aristarain", 0, true);
		this.directorService.add(director3);
		Directores director4 = new Directores("Mariano", "Llinás", 0, true);
		this.directorService.add(director4);
		Directores director5 = new Directores("Mariano", "Duprat", 0, true);
		this.directorService.add(director5);
		Directores director6 = new Directores("Carlos", "Sorín", 0, true);
		this.directorService.add(director6);
		Directores director7 = new Directores("Walter", "Salles", 0, true);
		this.directorService.add(director7);
		Directores director8 = new Directores("Gustavo", "Taretto", 0, true);
		this.directorService.add(director8);
		Directores director9 = new Directores("Lorena", "Muñoz", 0, true);
		this.directorService.add(director9);
		Directores director10 = new Directores("Alejandro", "Agresti", 0, true);
		this.directorService.add(director10);
		Directores director11 = new Directores("Eduardo", "Mignogna", 0, true);
		this.directorService.add(director11);
		Directores director12 = new Directores("Marcos", "Carnevale", 0, true);
		this.directorService.add(director12);
		Directores director13 = new Directores("Adrián", "Caetano", 0, true);
		this.directorService.add(director13);
		Directores director14 = new Directores("Santiago", "Oves", 0, true);
		this.directorService.add(director14);
		Directores director15 = new Directores("Lucho", "Bender", 0, true);
		this.directorService.add(director15);
		Directores director16 = new Directores("Marcelo", "Piñeyro", 0, true);
		this.directorService.add(director16);
		Directores director17 = new Directores("Pablo", "Trapero", 0, true);
		this.directorService.add(director17);
		Directores director18 = new Directores("Leonardo", "Favio", 0, true);
		this.directorService.add(director18);
		Directores director19 = new Directores("Leonardo", "Cesare", 0, true);
		this.directorService.add(director19);
		Directores director20 = new Directores("Jorge", "Gaggero", 0, true);
		this.directorService.add(director20);
		Directores director21 = new Directores("Lucrecia", "Martel", 0, true);
		this.directorService.add(director21);
		Directores director22 = new Directores("María", "Menis", 0, true);
		this.directorService.add(director22);
		Directores director23 = new Directores("Paula", "Hernández", 0, true);
		this.directorService.add(director23);
		Directores director24 = new Directores("Rodrigo", "Grande", 0, true);
		this.directorService.add(director24);
		Directores director25 = new Directores("Francisco", "Varone", 0, true);
		this.directorService.add(director25);
		Directores director26 = new Directores("Enrique", "Piñeyro", 0, true);
		this.directorService.add(director26);
		Directores director27 = new Directores("Sebastián", "Schindel", 0, true);
		this.directorService.add(director27);
		Directores director28 = new Directores("Juan", "Desanzo", 0, true);
		this.directorService.add(director28);
		Directores director29 = new Directores("Cristian", "Nardini", 0, true);
		this.directorService.add(director29);
		Directores director30 = new Directores("Vera", "Desalvo", 0, true);
		this.directorService.add(director30);
		Directores director31 = new Directores("Sebastián", "Borensztein", 0, true);
		this.directorService.add(director31);
		Directores director32 = new Directores("Pedro", "Saborido", 0, true);
		this.directorService.add(director32);
		Directores director33 = new Directores("Alberto", "Lecchi", 0, true);
		this.directorService.add(director33);
		Directores director34 = new Directores("Daniel", "Burman", 0, true);
		this.directorService.add(director34);
		Directores director35 = new Directores("Benjamín", "Ávila", 0, true);
		this.directorService.add(director35);
		Directores director36 = new Directores("Esteban", "Sapir", 0, true);
		this.directorService.add(director36);
		Directores director37 = new Directores("Marco", "Berger", 0, true);
		this.directorService.add(director37);
		Directores director38 = new Directores("Lisandro", "Alonso", 0, true);
		this.directorService.add(director38);
		Directores director39 = new Directores("Miguel", "Cohan", 0, true);
		this.directorService.add(director39);
		Directores director40 = new Directores("Armando", "II", 0, true);
		this.directorService.add(director40);
		Directores director41 = new Directores("Eliseo", "Subiela", 0, true);
		this.directorService.add(director41);
		Directores director42 = new Directores("Edi", "Flehner", 0, true);
		this.directorService.add(director42);
		Directores director43 = new Directores("Fernando", "Musa", 0, true);
		this.directorService.add(director43);
		Directores director44 = new Directores("Andrea", "Márquez", 0, true);
		this.directorService.add(director44);
		Directores director45 = new Directores("Lucía", "Puenzo", 0, true);
		this.directorService.add(director45);
		Directores director46 = new Directores("Liliana", "Ruiz", 0, true);
		this.directorService.add(director46);
		Directores director47 = new Directores("Julia", "Solomonoff", 0, true);
		this.directorService.add(director47);
		Directores director48 = new Directores("Gastón", "Biraben", 0, true);
		this.directorService.add(director48);
		Directores director49 = new Directores("Gabriel", "Medina", 0, true);
		this.directorService.add(director49);
		Directores director50 = new Directores("Tristán", "Bauer", 0, true);
		this.directorService.add(director50);
		Directores director51 = new Directores("Ariel", "Rotter", 0, true);
		this.directorService.add(director51);
		Directores director52 = new Directores("Alejandro", "Doria", 0, true);
		this.directorService.add(director52);
		Directores director53 = new Directores("Gabriela", "David", 0, true);
		this.directorService.add(director53);
		Directores director54 = new Directores("Santiago", "Mitre", 0, true);
		this.directorService.add(director54);
		Directores director55 = new Directores("José", "Campusano", 0, true);
		this.directorService.add(director55);
		Directores director56 = new Directores("Juan", "Taratuto", 0, true);
		this.directorService.add(director56);
		Directores director57 = new Directores("Pablo", "Fendrik", 0, true);
		this.directorService.add(director57);
		Directores director58 = new Directores("Rodrigo", "Fürth", 0, true);
		this.directorService.add(director58);
		Directores director59 = new Directores("Leandro", "Ipiña", 0, true);
		this.directorService.add(director59);
		Directores director60 = new Directores("Guillermo", "Grillo", 0, true);
		this.directorService.add(director60);
		Directores director61 = new Directores("Gustavo", "Postiglione", 0, true);
		this.directorService.add(director61);
		Directores director62 = new Directores("Javier", "Couter", 0, true);
		this.directorService.add(director62);
		Directores director63 = new Directores("Mariano", "Manzur", 0, true);
		this.directorService.add(director63);
		Directores director64 = new Directores("Juan", "Solanas", 0, true);
		this.directorService.add(director64);
		Directores director65 = new Directores("Nicolás", "Tuozzo", 0, true);
		this.directorService.add(director65);
		Directores director66 = new Directores("Miguel", "Rocca", 0, true);
		this.directorService.add(director66);
		Directores director67 = new Directores("Diego", "Lerman", 0, true);
		this.directorService.add(director67);
		Directores director68 = new Directores("Lucía", "Cedrón", 0, true);
		this.directorService.add(director68);
		Directores director69 = new Directores("Alejandro", "Chomski", 0, true);
		this.directorService.add(director69);
		Directores director70 = new Directores("María", "Ramírez", 0, true);
		this.directorService.add(director70);
		Directores director71 = new Directores("Gaspar", "Gómez", 0, true);
		this.directorService.add(director71);
		Directores director72 = new Directores("Pablo", "Giorgelli", 0, true);
		this.directorService.add(director72);
		Directores director73 = new Directores("Hernán", "Goldfrid", 0, true);
		this.directorService.add(director73);
		Directores director74 = new Directores("Santiago", "...", 0, true);
		this.directorService.add(director74);
		Directores director75 = new Directores("Diego", "Rafecas", 0, true);
		this.directorService.add(director75);
		Directores director76 = new Directores("Natalia", "Smirnoff", 0, true);
		this.directorService.add(director76);
		Directores director77 = new Directores("Ezequiel", "Toscano", 0, true);
		this.directorService.add(director77);
		Directores director78 = new Directores("Daniel", "Burak", 0, true);
		this.directorService.add(director78);
		Directores director79 = new Directores("Martín", "Rejtman", 0, true);
		this.directorService.add(director79);
		Directores director80 = new Directores("Matías", "Piñeiro", 0, true);
		this.directorService.add(director80);
		Directores director81 = new Directores("Rosendo", "Ruiz", 0, true);
		this.directorService.add(director81);
		Directores director82 = new Directores("Daniel", "Bustamante", 0, true);
		this.directorService.add(director82);
		Directores director83 = new Directores("Nicolás", "Lavedra", 0, true);
		this.directorService.add(director83);
		Directores director84 = new Directores("Laura", "Mañá", 0, true);
		this.directorService.add(director84);
		Directores director85 = new Directores("Gabriel", "Nesci", 0, true);
		this.directorService.add(director85);
		Directores director86 = new Directores("Daniel", "Rosenfeld", 0, true);
		this.directorService.add(director86);
		Directores director87 = new Directores("Martin", "Shanly", 0, true);
		this.directorService.add(director87);
		Directores director88 = new Directores("Ezequiel", "Acuña", 0, true);
		this.directorService.add(director88);
		Directores director89 = new Directores("Hernán", "Gaffet", 0, true);
		this.directorService.add(director89);
		Directores director90 = new Directores("Ana", "Katz", 0, true);
		this.directorService.add(director90);
		Directores director91 = new Directores("Juan", "Antin", 0, true);
		this.directorService.add(director91);

		/*Genero Resenias*/
		Resenias resenia0 = new Resenias("Acabo de regalarle a mis sentidos una serie de momentos difíciles de olvidar; acabo de ver “El secreto de sus ojos” y es una película total. Casi que no me sale poner un comentario, me resulta incalificable como me dejó esta película: si ya vieron de Campanella “El hijo de la novia” o “Luna de Avellaneda”, simplemente olvídense, esta cinta va por rumbos distintos, es mas densa y profunda en lo que plantea; por momentos los diálogos, por momentos el guión, por momentos los gestos, por momentos escenas de una belleza visual increíble, por momentos, me hundí en la butaca sin ser consciente de nada a mi alrededor, mas que la pantalla y el audio.", "", usuario37, null);
		Resenias resenia1 = new Resenias("Finalmente, El secreto de tus ojos se ha quedado fuera del palmarés de San Sebastián. Deseando estoy de ver las películas que el jurado ha decidido galardonar en detrimento de ésta, porque tienen que ser excepcionales, excelsas, únicas…. o eso, o lo del jurado ha sido un fallo garrafal, cosa ésta bastante común en la historia del festival.", "", usuario13, null);
		Resenias resenia2 = new Resenias("El azúcar diluyéndose en mi vaso de té con limón... en suspense brotando de la mirada y la investigación.Una vieja Olivetti que escribe sin la &quot;A&quot;... temor a la vida, al tiempo, al amor.El secreto que oculta su mirada.", "", usuario25, null);
		Resenias resenia3 = new Resenias("Camino de Nassica (UGC Getafe), a ver la ineludible cita que produce el estreno de un filme de Campanella, tengo una sensación de miedo, intento mentalizarme de que quizá no sea para tanto, como preparándome para una nueva decepción. Este año me he llevado algún mosqueo por ir con las expectativas demasiado altas.", "", usuario36, null);
		Resenias resenia4 = new Resenias("Quería ver la película por Campanella, por Darín (el GRAN Darín), porque había oído de grandes críticas. No sabía nada más. Entonces empezó la película y a los cinco minutos ya me impresinaba. Luego acabó, y tuve claro que había visto una obra maestra.", "", usuario3, null);
		Resenias resenia5 = new Resenias("La gran película argentina de principios de siglo.Partiendo desde un guión sencillamente exquisito y unas interpretaciones magníficas, Fabián Bielinsky logró hacer de su ópera prima una verdadera obra maestra. Claro que nada hubiera sido lo mismo sin el maravilloso final que tiene, ese giro repentino que da una vuelta de tuerca total a cada uno de los personajes y a la historia en general, y que te produce esa sensación de querer volverla a ver en ese mismo momento.", "", usuario9, null);
		Resenias resenia6 = new Resenias("La película me gustó. No voy a analizarla en detalle. Simplemente un par de cosas:Tiene un guión muy bueno: Las escenas están encadenadas con mucho estilo y esto la hace entretenida de principio a fin, manteniendo un ritmo constante, sin decaer en ningún momento.", "", usuario28, null);
		Resenias resenia7 = new Resenias("“Nueve reinas” es un inteligente divertimento cinematográfico, construido con notables precisión e ingenio sobre las sólidas bases del guión y las dos interpretaciones principales, excelentes.Como en un reportaje a lo “Pickpocket”, vemos pronto el doble fondo de una escena callejera en un momento al azar, su trastienda delictiva.", "", usuario22, null);
		Resenias resenia8 = new Resenias("Estupenda película argentina, con un guión bien estructurado aunque con varios peros. Entretenida de principio a fin y bastante absorbente, el director llega a conseguir que el espectador sea el tercer pillo, que nos preguntemos constantemente quién engaña a quién y que estemos atentos a que no nos engañen a nosotros.", "", usuario2, null);
		Resenias resenia9 = new Resenias("Empecé a ver la película con cierto escepticismo, pero en seguida me enganché.Un buen ritmo, un maravilloso y original guión, una buena elección de actores: una gran película. Te regalará momentos en los que no sabrás que decir...", "", usuario34, null);
		Resenias resenia10 = new Resenias("Si &quot;El niño que gritó puta&quot; me conmocionó, &quot;El hijo de la novia&quot; me emocionó. El inicio de la película apunta a un guión lleno de tópicos, trucos emocionales, lágrimas fáciles. Pero según va transcurriendo empiezo a ser consciente de mi piel: caray, me estoy emocionando, me está enganchando, sonrío, me emociono, .", "", usuario7, null);
		Resenias resenia11 = new Resenias("Escucha... no, no te estoy diciendo que me oigas. ¡Escucha! Es la diferencia entre la actitud pasiva y la activa, porque para esta película lo vas a necesitar.Brevemente, la sinopsis: Rafael, estresado propietario de restaurante, un ´malabarista que corre arriba y abajo intentando mantener el equilibrio ´, que tiene una madre con Alzheimer, una novia a quien atiende como si florero, una hija para los jueves fruto de su divorcio y un reencuentro con un viejo amigo que le devuelve sueños de su infancia.", "", usuario20, null);
		Resenias resenia12 = new Resenias("Posiblemente la más equilibrada de la esplendida trilogía social de Campanella, El Hijo de la Novia es un drama extremadamente sutil e incisivo con respecto a la naturaleza del ser humano, de la vida en pareja, del trabajo, de los amigos o de la familia.", "", usuario31, null);
		Resenias resenia13 = new Resenias("El Alzheimer es una de los peores enfermedades de la senectud. La pérdida progresiva de la memoria es una condena para quien la padece, y para los que observan cómo se volatiliza mes a mes la identidad, el alma de esa persona tan querida, tan apreciada, tan importante.", "", usuario34, null);
		Resenias resenia14 = new Resenias("Gracias, Zoquete, por tu crítica. Me exime de decir más. Los argentinos, que andamos tan mal en tantas cosas, hemos sabido rescatar el arte de la cinematografía. &quot;Hemos &quot;dijo el mosquito, pero bueno... Campanella es nuestro y Darín supernuestro.", "", usuario29, null);
		Resenias resenia15 = new Resenias("El gran Jean Jacques Rousseau decía ¨Los temores, las sospechas, la frialdad, la reserva, el odio, la traición, se esconden frecuentemente bajo ese velo uniforme y pérfido de la cortesía¨ y este velo es el que viene a correr con vehemencia esta gran película.", "", usuario8, null);
		Resenias resenia16 = new Resenias("Dividida en varias historias, encuentra la fórmula perfecta para que sus dos horas de duración te pasen volando. Cuando han aparecido los títulos finales me he dicho a mí mismo &quot;¿Pero ya está?&quot;. La verdad que la calidad de todas las historias está muy bien, aunque como en todos lados hay unas mejores que otras, y hay unas más violentas que otras.", "", usuario32, null);
		Resenias resenia17 = new Resenias("La indignación del hombre común frente a un sistema burocrático e insensible, la corrupción generalizada, la mentira y la codicia son los ejes principales de este tratado moral provocativo y perturbador, atravesado por un humor negrísimo, que puede alcanzar dosis muy altas de crueldad hasta irrupciones extremas a puro gore.", "", usuario13, null);
		Resenias resenia18 = new Resenias("Antes de nada aclaro que soy un acérrimo fan de Quentin Tarantino y lo cierto es que la película bajo reseña tranquilamente podría ser de su autoría. Su estilo es muy tarantiniano, con algunas influencias tal vez de Sidney Lumet o Sam Peckinpah. Con una muy buena factura técnica y con música del galardonado Gustavo Santaolalla (ganador del oscar a mejor banda sonora por la película Brokeback Mountain).", "", usuario25, null);
		Resenias resenia19 = new Resenias("¿Qué pasa cuando juntás un gran director con un elenco de figuras de verdad, actores de primer nivel, e historias que son simplemente geniales? Bueno, en consecuencia resultan cintas que valen la pena ver, y que enaltecen el cine argentino cada día más.", "", usuario17, null);
		Resenias resenia20 = new Resenias("Tengo una amiga que dice que los argentinos con tal de no estar callados acaban hablando por hablar incluso debajo del agua. En esta película hablan mucho. Pero todo lo que se habla es importante, es el sostén de este drama tan tierno como cercano. A veces incluso arrastra este exceso de conversaciones y reflexiones en voz alta como un ligero lastre, porque no da respiro y todo parece demasiado atado a las palabras.", "", usuario6, null);
		Resenias resenia21 = new Resenias("¿ Te has sentado alguna vez en una hamaca de madera frente a mar, con una buena copa de vino en la mano, dejando que la brisa caliente te te pegue en la piel ? ¿ Cerraste los ojos y respiraste relajado...?¿ Por qué intentar hacer una crítica de esta película ?Esta película la guardaré , en esa pequeña caja en la que guardo los detalles importantes de mi vida, y cuando sea algo más mayor.", "", usuario31, null);
		Resenias resenia22 = new Resenias("Existe el mundo al revés. Hay familias que se decepcionan cuando en la vida te dedicas a hacer dinero, criar hijos y tener trabajo fijo. Hay familias en las que has fracasado cuando no has dedicado la mayoría del tiempo a hacer algo que te gusta.", "", usuario22, null);
		Resenias resenia23 = new Resenias("Si esta película no te pone un nudo en la garganta, te envidiaré, porque eso querrá decir que no has tenido ningún problema en tu vida.Por otra parte, el habitual discurso político de Aristarain no molesta nada, lo cual también es habitual, valga la redundancia.", "", usuario17, null);
		Resenias resenia24 = new Resenias("Una película extremadamente idealista, que nos incita a reflexionar sobre las distintas actitudes frente a la vida: la elección sobre si vivir lleno de ideales pero pobre en el país que te vio nacer o si emanciparte y tener un futuro promisorio en otro pero sentirte un desertor, sobre si el mayor acervo que un ser humano puede acumular en esta vida es el cultural e ideológico o el amontonar riquezas materiales, sobre el poder de saber “pensar” por sobre el actuar automáticamente, el asumir el fracaso de no poder cumplir las metas y cambiar de rumbo cuando las situaciones así lo exijan, etc.", "", usuario30, null);
		Resenias resenia25 = new Resenias("Un crimen, un tesoro, una apuesta. 3 historias, 18 capítulos y 4 horas de duración. Mariano Llinás dirigió, escribió y protagonizó esta arriesgada “película literaria” completamente curiosa desde cualquier ángulo que se la mire, como si fuera una aventura que nosotros mismos estamos viviendo, porque los largos pasajes temporales y los ojos de los personajes parecen ver al mismo tiempo lo que el espectador ve, convirtiéndose ellos mismos espectadores de las historias y meta-historias que suceden… como si fuera una lectura audiovisual narrada en 3era persona donde (vaya paradoja) los personajes principales carecen de identidad, no tienen nombre, como si se generalizaran todas las historias que similares a estas son contadas por personas, personas comunes, como vivencias y anécdotas de la vida.", "", usuario17, null);
		Resenias resenia26 = new Resenias("Un halo fantástico se desprende de estas tres potentes historias rodadas en localidades anodinas, desperdigadas en la llanura de la provincia de Buenos Aires, que encierran arquitecturas misteriosas y suntuosas geometrías recubiertas de olvido y abandono, que parecen aguardar a quien las descifre.", "", usuario32, null);
		Resenias resenia27 = new Resenias("El hermoso mundo del cine hace que cada tanto nos topemos con obras de arte de este talante. Lamentablemente, las veces que me ha sucedido las puedo contar con los dedos de una mano. Ni bien finalicé de ver el film, cuyas 4 horas de duración me fueron escasas, sentí el impulso de levantarme y aplaudir.", "", usuario30, null);
		Resenias resenia28 = new Resenias("No se trata una adaptación de Roahl Dahl ni tampoco de Fellini &amp; Cia…  pero se trata también de cine y ficción extraordinarias. Con un potente guión que tal vez deje descompensado un poco la historia de H.  Deja ese poso como en los títulos de crédito finales ¡Siempre de viaje! mirando a esa carretera interminable que es la vida a veces… Lo mas bonito es haber estado en los meses de rodaje, parece el texto de las postales finales.", "", usuario37, null);
		Resenias resenia29 = new Resenias("A medio caminoLlinás hace suyo el postulado de Unamuno: &quot;… todo hombre es un boceto de novela&quot;. El resultado es una cinta irregular. Las historias no están del todo mal. De hecho, comienzan muy bien, con imágenes sugerentes y plenas de misterio, pero conforme avanza el tiempo, el recurso de las cajas chinas pierde fuerza e interés y las tramas personales sin aparente resolución, terminan dejando un extraño sinsabor.", "", usuario16, null);
		Resenias resenia30 = new Resenias("“El Ciudadano Ilustre” es la cuarta película realizada por la dupla Cohn-Duprat y, como sus anteriores trabajos, es una buena recomendación de cine argentino.En la cinta, se cuenta la historia del Premio Nobel de Literatura Daniel Mantovani, un escritor nacido en un pequeño pueblo rural de Argentina, llamado Salas, del cual huyó hace más de 40 años para radicarse en Europa, sin haber vuelto jamás a pisar su país natal.", "", usuario27, null);
		Resenias resenia31 = new Resenias("Daniel Mantovani a los 20 años,  escapó de un pequeño pueblo, tal vez presentía que si se quedaba moriría de asfixia. Nunca volviò, ni para el entierro de su padre. Se fué sin que lo echaran, huyó para crecer, de un lugar donde no podría hacerlo, y paradójicamente su obra y sus personajes giran alrededor de sus vivencias en la infancia y adolescencia construyendo la base de su obra literaria premiada en Suecia.", "", usuario36, null);
		Resenias resenia32 = new Resenias("Muy buen film basado especialmente en la gran actuación de Oscar Martinez y en el excelente trabajo de todos los actores de reparto. La composición del protagonista, de ese ser egocéntrico y ácido,   es perfecta. La pintura sobre un pueblo pequeño, del interior, de campo, es impresionantemente real en actitudes, modos y ticks de sus habitantes.", "", usuario13, null);
		Resenias resenia33 = new Resenias("Su lanzamiento pareciera arrancar (al menos en Argentina) con un nuevo enfoque en la presentación de un producto cinematográfico, en donde se propone una ficción en la que se mezcla de manera endemoniada al actor principal con el propio personaje, supuesto escritor del mismísimo libro en el que se detallan las características de propio guión que constituye la historia.", "", usuario11, null);
		Resenias resenia34 = new Resenias("-Si nunca fuiste a un pueblo argentino, puede que la película no te parezca tan genial (aunque conozcas pueblos de otros países).-Si no sos de los que aman observar las conductas humanas, puede ser que la película no te parezca tan genial.", "", usuario26, null);
		Resenias resenia35 = new Resenias("Don Justo, buscando a su perro perdido. María, seleccionada para participar en un concurso de televisión. Roberto, ideando una manera creativa de conquistar a la mujer que le gusta.Tres historias paralelas de gente sencilla que viaja en pos de un sueño.", "", usuario19, null);
		Resenias resenia36 = new Resenias("&quot;Historias mínimas&quot; es, efectivamente, y como reza su título, una pequeña, mínima película que narra tres cuentos componiéndolos armoniosamente a través de una cámara austera, una fotografía espléndida de Hugo Colace y un puñado de actores, que salvo Javier Lombardo, ni siquiera lo son pero que transmiten una verdad y maestría emocionantes.", "", usuario25, null);
		Resenias resenia37 = new Resenias("Si pudiera mi puntuación sería de 9.50 o sea casi un 10. No llega a un 10 por muy poquito, por casi nada. Es una película maravillosa. Es tan sencilla, simple y humana como hacia tiempo no veía. Realmente me dejó en un estado de melancólica emoción, un revoltijo de sentimientos que estaba necesitando.", "", usuario17, null);
		Resenias resenia38 = new Resenias("Una maravilla hecha con lo mínimo. Los actores parecen profesionales, el guión y la fotografía muy buenos. Cuando se tiene algo que contar acerca de personas que viven, respiran, desean, aman, etc, como tu, como yo, como todos,  sale una película que desborda ternura, cierta melancolía y alegría contenida.", "", usuario9, null);
		Resenias resenia39 = new Resenias("Lo cierto es que a mi, el cine argentino de la última década no me interesa lo más mínimo, o me aburre, o me causa una total y pasmosa indiferencia o me saca de quicio con sus historias mínimas.Y, menuda ironía que, precisamente, una cinta llamada &quot;Historias mínimas&quot; me haya conmovido y dejado este tan buen sabor de boca al mismo tiempo gracias, en especial, a un Carlos Sorín que en ningún momento sobrecarga su film de excesos que, por lo general, suelen hacer mella en films de este tipo, como los largos y pausados silencios o lo común y lo banal.", "", usuario22, null);
		Resenias resenia40 = new Resenias("Realización de Walter Salles (&quot;Tierra extranjera&quot;, 1995), basada en las notas de viaje que tomó Ernesto Guevara de la Serna y reescribió años más tarde en el libro de memorias &quot;Notas de viaje&quot;. Se rodó a lo largo de 16 semanas, a partir de mediados de junio de 2002, en más de 30 localizaciones.", "", usuario4, null);
		Resenias resenia41 = new Resenias("La mejor película que se ha realizado sobre Ernesto Guevara. Impresionantes los escenarios mostrando el recorrido del Che junto a su gran amigo Alberto por toda latinoamérica, viaje que fué decisivo en su vida y que forjó el comienzo de su preocupación social.", "", usuario27, null);
		Resenias resenia42 = new Resenias("Gran película. Nos cuenta la historia de cómo un joven Ernesto “Che “ Guevara emprende un viaje con su amigo Alberto Granado alrededor de Sudamérica por Argentina, Chile, Perú, Venezuela, en una vieja motocicleta en el año 52. La película se diferencia en dos partes, la primera más jovial, más agradable, con grandes paisajes y momentos de comedia y alegría.", "", usuario14, null);
		Resenias resenia43 = new Resenias("En primer lugar, considero a esta película muy equilibrada, no está contaminada con la historia posterior de Ernesto, (como diría el propio protagonista: no está plagada de &quot;lugares comunes&quot;, salvo el cruce a nado del río, una metáfora sobre su heroísmo y su carisma), trata su tema tal como es: el descubrimiento de nuestro mundo (&quot;un mundo de 'mestizos'&quot;), grande y bello, pobre y rico, por un par de jóvenes en formación, sensibles e inteligentes.", "", usuario29, null);
		Resenias resenia44 = new Resenias("Gran film de Walter Salles con un joven Che como reclamo. He de decir que el último plano de la película, con el amigo del Che ya mayor y mirando el avión, es el mismo que utiliza el film cubano Habana suite dos años antes. Si alguna vez habéis viajado con vuestro mejor amigo en patinete, coche, bici, autocar, etc.", "", usuario15, null);
		Resenias resenia45 = new Resenias("Preciosa obra cinematográfica de aproximadamente solo media hora. Tuvo tanto éxito que el director ha decidido hacerla largometraje y probar suerte con el mismo contenido por segunda vez en 2011; donde con más medios y retoques, repiten el mismo director, el mismo fotógrafo, el mismo intérprete masculino, etc.", "", usuario17, null);
		Resenias resenia46 = new Resenias("Hermoso corto ubicado en Buenos Aires, que aúna la peculiar belleza que se puede encontar en los lugares más comunes de cualquier ciudad, con una elegante y bonita historia de amor. El narrador nos muestra realidades que nos pasan desapercibidas, apoyado por imágenes de &quot;documental&quot; muy efectivas.", "", usuario20, null);
		Resenias resenia47 = new Resenias("66/20(20/03/12) Original cortometraje argentino, que posee un arranque arrollador, donde se critica en un brillante monólogo la anarquía urbanística de Buenos Aires que deriva en una sociedad insegura, con la soledad, con relaciones complicadas, con fobias y manías, por que como dice el protagonista &lt;Que se puede esperar de una ciudad que da la espalda a su Río&gt;.", "", usuario5, null);
		Resenias resenia48 = new Resenias("Cortometraje fresco e imaginativo, con imágenes impactantes y un contenido muy lúcido. &quot;Medianeras&quot; ofrece una aguda disección de la sociedad moderna actual, en un entorno urbano alienante y claustrofóbico, pero con un mensaje esperanzador y positivo.", "", usuario29, null);
		Resenias resenia49 = new Resenias("No tengo en mi casa un solo disco de cumbia ni me gusta bailarla en las fiestas, es decir no soy una fan de la música tropical y desde ese lugar fui a ver “Gilda”.  Se trata de una película que tiene dos rasgos distintivos: el primero, que su directora ha recreado el mundo de la música más popular de las clases más populares sin caer en lugares comunes ni rozar el grotesco, con buen gusto y sobre todo con muchísimo respeto por los artistas y el público que los admira (algo que lamentablemente no supieron hacer Cohn y Duprat en  “El ciudadano ilustre”, cuya crítica escribí la semana pasada y parece no haberle sido muy útil a las clases medias que van al cine a reírse de la gente de menores recursos intelectuales de las cuales, por supuesto, las separa un abismo) Pero volviendo a Gilda, sostengo que uno de sus mayores logros es que aborda la vida de esta cantante de un modo ético en lo conceptual y grácil en lo estético.", "", usuario25, null);
		Resenias resenia50 = new Resenias("Esta película tenía un gran desafío: contar la historia de una estrella popular devenida en santa pagana, cuya muerte fue trágica, sin caer en los lugares comunes que este tipo de biopic ha generado. Sin embargo Gilda(no me arrepiento de este amor), va por otro lado: narra la historia desde una óptica feminista, contando la historia de una mujer casada con dos hijos, de clase media, que anhela hacer otra cosa con su vida, y que tiene que pelear contra todo el machismo que la rodea: desde su hogar, con marido y su madre, hasta el ámbito de la movida bailantera, con personajes que de momento dan un miedo real.", "", usuario10, null);
		Resenias resenia51 = new Resenias("&quot;Gilda. No me arrepiento de este amor&quot; (2016) de Lorena Muñoz.Antes que nada sólida actuación de Natalia Oreiro, vale la pena reconocerlo. Muy bien caracterizada y dirigida además. La película llama la atención por no tener una mirada pochoclera del fenómeno Gilda.", "", usuario36, null);
		Resenias resenia52 = new Resenias("La película comienza con un cajón dentro de un coche fúnebre. La cámara está sobre el cajón, se ve la madera brillante, los arreglos florales, la lluvia en el exterior. La puerta del baúl se abre, el féretro sale y recibe las gotas de lluvia y las manos de unas 15 personas que simulan muchedumbre, envueltas en llanto, con caras desfiguradas por los gritos, con desesperación por tocar el cajón, por besarlo, por darle flores, por agarrarlo y llevarlo hasta su nicho.", "", usuario6, null);
		Resenias resenia53 = new Resenias("Emotiva película que nos lleva al universo de Valentín, un niño que sueña con ser astronauta y que tiene los pies en la tierra más que algunos adultos. Desde su perspectiva observamos como es su vida y la de los personajes que le rodean.Una mezcla de comedia y drama, que tan pronto nos pone tristes como nos hace sonreir con las ocurrencias del muchacho.", "", usuario12, null);
		Resenias resenia54 = new Resenias("Fastinante película del otro lado del charco que nos invita a hacer una reflexión sobre la importancia del amor familiar en la vida de las personas. Desde el principio nos envuelve su pasión por la vida en unas condiciones en las que es difícil tener las ideas claras.", "", usuario5, null);
		Resenias resenia55 = new Resenias("Alejandro Agresti nos cuenta la historia de Valentín, un niño argentino de ocho años cuatrojos, cuyos padres están divorciados, él vive con su abuela, y que tiene un gran sueño, ser astronauta. Detrás de esas gafas de pasta y ese cuerpo menudo se esconde una mente audaz, inteligente y pilla.", "", usuario13, null);
		Resenias resenia56 = new Resenias("Agresti logra una película contundente y concisa a la hora de la efectividad: emociona hasta las lágrimas, nos arranca algunas sonrisas con su delicado humor y nos deja el claro mensaje a favor del valor inconmensurable de poseer una familia que contenga y con la cual compartir el devenir de la vida.", "", usuario31, null);
		Resenias resenia57 = new Resenias("Enorme la actuación del niño que interpreta a Valentín. La historia es sencilla pero que te llega al corazón y por momentos te arranca una risa.", "", usuario2, null);
		Resenias resenia58 = new Resenias("Película de pareja antigonista. Crítica a la sociedad argentina, al psicoanálisis, a la corrupción, a la infidelidad...etc, todo esto desde el punto de vista de una comedia bien hecha, con momentos delirantes, con buenas actuaciones, con personajes a los que se le coge cariño.", "", usuario12, null);
		Resenias resenia59 = new Resenias("Realmente se trata de una parodia que se ríe de casi todo, en especial de la realidad de su país y del cine de Hollywood, en la que en algunos momentos se pueden reconocer referencias directas a títulos como por ejemplo Mentiras arriesgadas o a cualquiera de las muchas que han emparejado a policías dispares.", "", usuario11, null);
		Resenias resenia60 = new Resenias("La última sorpresa que nos ha llegado de tierras argentinas no ha sido la eliminación de su selección en el mundial de fútbol (con la que me han fastidiado una porra de más de 120 €), ha sido &quot;Tiempo de valientes&quot;. Una buddy movie cuyo guión ya quisiera hollywood.", "", usuario34, null);
		Resenias resenia61 = new Resenias("Aunque tengamos recién estrenado el carnet de conducir por puntos, si el Director General de Tráfico viera Tiempo de valientes podría añadir una nueva fórmula para mejorar el comportamiento de los conductores.	Una grave infracción de circulación, cometida por un psicoanalista, es uno de los elementos argumentales que inician esta película nacida, aparentemente, sin aspiraciones de epatar ni de ser original y que, sin embargo, utilizando un esquema casi tópico (thriller con dos personajes antagónicos convertidos en colegas a la fuerza), consigue ser una obra sin fisuras gracias a la perfección con que encajan todos los mecanismos que permiten que una obra cinematográfica sea redonda.", "", usuario35, null);
		Resenias resenia62 = new Resenias("El cine argentino nos viene ofreciendo últimamente auténticas perlas cinematográficas, tanto en forma de suspense casi metafísico (El aura), drama de tono melancólico (Luna de Avellaneda) o esta mezcla insólita de thriller y comedia que es Tiempo de valientes.", "", usuario0, null);
		Resenias resenia63 = new Resenias("Excelente guión. De esos que no te deja indiferente, que al final de cada diálogo te da la impresión de haber aprendido un poquito más de la vida, o por lo menos te recuerda algo que sabías pero que tenías olvidado. El personaje de Roma inolvidable.", "", usuario5, null);
		Resenias resenia64 = new Resenias("El director de una de las mejores películas &quot;Martin Hache&quot;, nos vuelve a deleitar con &quot;Roma&quot;, un nuevo derroche de dialogos coherentes, bien construidos y que te dejan boquiabierto, es impresionante la naturalidad que consigue, gracias a un buen guión y auna excelente dirección de un reparto de actores y actrices de lujo, donde todos, por más minima aparición que tengan es extraordinaria.", "", usuario17, null);
		Resenias resenia65 = new Resenias("Roma son dos películas con un ensamble lógico pero no del todo armónico.Por un lado un amargo escritor diseñando su salida de escena, en contrapunto con un asistente que esta empezando su carrera. En este juego se ponen de manifiesto los puntos en común que unen a dos separaciones diferentes y recelosas por distintos motivos una de la otra.", "", usuario27, null);
		Resenias resenia66 = new Resenias("Una película interesante pero mucho más floja de lo habitual en el estupendo Aristarain (aquí ayudado en el guión además por Mario Camus aparte de la habitual Kathy Saavedra).Cuenta el encuentro entre un joven periodista aspirante a escritor (Botto) y un escritor ya consagrado y aislado del mundo y de sus recuerdos (Sacristán), que activará en el segundo la moviola de toda su vida.", "", usuario12, null);
		Resenias resenia67 = new Resenias("Magnífica película, sin duda una inesperada y grata sorpresa la que me he llevado con este film, me ha encantado de principio a fin. Además de entretener adquiere formas sentimentales y muchas secuencias de gran carácter poético, tan profundo que van directamente al corazón.", "", usuario24, null);
		Resenias resenia68 = new Resenias("Apegado a narraciones intimistas, como las que mostrara en El Faro o Sol de Otoño, admirador de Akira Kurosawa, &quot;porque se anima a llegar a un lugar del alma donde no muchos se atreven&quot;, el escritor y cineasta argentino Eduardo Mignona nos ofrece una historia sobriamente emotiva, que tiene como eje la reconstrucción del vínculo afectivo entre un abuelo y su nieta.", "", usuario33, null);
		Resenias resenia69 = new Resenias("Después de ver últimamente tanto cine adocenado (hecho en Hollywood o mirando a Hollywood), por no hablar de la larga lista de filmes en los que el volumen de efectos especiales es inversamente proporcional a la calidad del guión y de comedias (¿comedias?) de una zafiedad prácticamente insultante, resulta absolutamente estimulante ir a ver una obra como &quot;El viento&quot;.", "", usuario10, null);
		Resenias resenia70 = new Resenias("Es imposible que esta película tenga una nota tan alta. Es de risa que según las críticas supere a Lawrence de Arabia, Amelie o Lo que el viento se llevó. Por Dios, esta pelicula es correcta, pero nada más. Las actuaciones son buenas y está bien dirigida, pero el guión peca de simple y la pelicula solo emociona los 20 últimos minutos.", "", usuario30, null);
		Resenias resenia71 = new Resenias("Cuando vi la altas puntuaciones que daban los usuarios a esta película, situándola entre las mejores de la historia prácticamente, no dudé en ir a verla al cine, esperando ver una obra maestra. Sin embargo esto no fue lo que ocurrió. Reconozco que es una buena película, pero no creo que merezca más de un 7,5.", "", usuario37, null);
		Resenias resenia72 = new Resenias("Lo mejor de Mignona y  de lo mejor que he visto últimamente.Un muy buen guión como punto de partida; una puesta en escena sobria, totalmente acorde con el tono que la historia demandaba; unas interpretaciones de lujo en ese choque generacional entre Frank y su nieta; unos valores en juego de los que conmueven al espectador sin alardes pirotécnicos, y un cierre que lejos de decepcionar, potencia esa carga que la película ha ido alimentando hasta entonces.", "", usuario35, null);
		Resenias resenia73 = new Resenias("Como decía Coleccionista Visual, parece que llegados a una edad ya no queda esperanza,  ni sueños, ni deseos por cumplir, sólo esperas que los días pasen y la muerte llegue lo antes posible, y más cuando la que pensabas que era la mujer de tu vida muere dejándote viudo, como en el caso de Fred.", "", usuario1, null);
		Resenias resenia74 = new Resenias("En el mundo del cine, siempre hubieron -y habrán- actores secundarios realmente temibles, que hacían sacar a los protagonistas lo mejor de sí mismos, por no verse eclipsados ante el talento que éstos demostraban. Gracias a ellos, muchos directores consiguieron filmes con toneladas de quilates, y sería una verguenza no nombrar a alguno como Walter Brennan, Steve Buscemi, John Goodman, Basil Rathbone, Manolo Zarzo, Luis Ciges.", "", usuario2, null);
		Resenias resenia75 = new Resenias("Después del estreno de la película, una radio entrevistaba a Elsa y por detrás se escuchó un grito de una admiradora que decía: &quot;Me hiciste llorar hija de puta&quot;. A mi, no tan solo me ha hecho llorar sino que he reído y he disfrutado de esta excelente interpretación.", "", usuario10, null);
		Resenias resenia76 = new Resenias("Elsa y Fred fue un trabajo elegido para conformar la XLVI Muestra Internacional de Cine en México, la cual amenizó de manera cómica la proyección de 15 películas en su mayoría de género dramático. Los protagonistas en plena senectud son escasos debido a la desafortunada visión que se tiene de la vida.", "", usuario29, null);
		Resenias resenia77 = new Resenias("Esta es una película sobre todo de actores. El guión no deja de ser una historia pasable, salpicada de algunos momentos emotivos y simpáticos, pero bastante previsible. Lo mejor de la película, los actores, sobre todo Manuel Alexandre, un actor siempre secundario y que nunca ha defraudado a los que lo buscábamos en una de esas innumerables películas en las que ha trabajado.", "", usuario33, null);
		Resenias resenia78 = new Resenias("Lugo de alcanzar el éxito con series como &quot;Tumberos&quot; o de películas como &quot;Un oso rojo&quot; el director uruguayo/argentino Israel Adrián Caetano vuelve al ruedo con &quot;Crónica de una fuga&quot;, competidora en la selección oficial de Cannes.", "", usuario3, null);
		Resenias resenia79 = new Resenias("O Efectismo vs. Realismo.El propio Claudio Tamburrini relató en su libro “Pase libre” su arresto, secuestro, reclusión en una mansión y todo tipo de penurias que tuvo que sufrir por parte de sus torturadores. Era inocente aunque eso poco importaba en ese instante si estabas en el momento y lugar equivocados.", "", usuario4, null);
		Resenias resenia80 = new Resenias("Crónica de una fuga es de esas películas que acercan al espectador internacional, a hechos reales llenos de ingratitud e injusticia, sufridos por miles de personas que a la fecha exigen cárcel para los tiranos responsables del derramamiento de sangre y lágrimas.", "", usuario7, null);
		Resenias resenia81 = new Resenias("&quot;Crónica de una fuga&quot; no explica las causas de la dictadura ni se extiende en explicar el origen de los personajes, es sencillamente un alegato contra la tortura disfrazado de cine de fugas. Desde el principio se siente verdadero asco hacia esas alimañas que ocupan uno de los puestos de honor en el ranking de la escoria humana: los policías secretos que desempeñan el trabajo sucio de los regímenes totalitarios.", "", usuario11, null);
		Resenias resenia82 = new Resenias("Desde el punto de vista conceptual, la película constituye apenas un acercamiento somero hacia algunos detalles sobre cómo operaban las fuerzas militares en la dictadura militar que sufriera la Argentina allá por la década del setenta. Pero el conflicto del filme no se centra en la coyuntura política del momento, sino que se detiene en los pormenores de lo ocurrido en un centro de detención clandestino, en los métodos de tortura, de avasallamiento de derechos humanos en pos de la obtención de datos para acabar con la guerrilla y los movimientos de izquierda que proponían una especie de terrorismo de estado.", "", usuario21, null);
		Resenias resenia83 = new Resenias("El realizador argentino Carlos Sorin revisita los terrenos y códigos que abarcó en la entrañable Historias mínimas. Nuevamente en el marco de los amplios horizontes y pueblos perdidos de las tierras patagónicas, registra a actores no profesionales interpretando a personajes cuyas vidas bien pueden ser las de ellos mismos: en este caso un hombre maduro, humilde y desempleado, vislumbra nuevas esperanzas cuando por azar termina siendo dueño de un perro dogo que bien podría ser un campeón en exposiciones.", "", usuario13, null);
		Resenias resenia84 = new Resenias("Supuestamente el detonante de toda historia es el conflicto. Practicamente todos partimos de la idea de que esa palabra implica que hay un problema, que ha pasado algo negativo. Para Carlos Sorín no. Para él el detonante de toda historia es lo cotidiano, lo sencillo, el día a día, los encuentros fortuitos.", "", usuario21, null);
		Resenias resenia85 = new Resenias("Manolo es pequeño, peludo, suave; tan blando por fuera, que se diría todo de algodón. Manolo es mi perro y no es un burro. Y por si hubiera alguna duda, yo tampoco soy Juan Ramón Jiménez.Si hubiera visto esta película hace un año probablemente me habría aburrido.", "", usuario27, null);
		Resenias resenia86 = new Resenias("Excelente película que transcurre con el lento ritmo de la Patagonia, la lucha por la supervivencia, las necesidades de un hombre humilde que pueden ser satisfechas por el azar de recibir como regalo un perro, perro que no cumple con lo que se espera de él.", "", usuario9, null);
		Resenias resenia87 = new Resenias("Un problema de desempleo con una aparente solución inusual, el Sr. Juan Villegas la verdad, ha hecho un trabajo de interpretación muy bueno, al igual que el resto, no sabía que no eran profesionales o por lo menos no han tenido gran cantidad de trabajos.", "", usuario0, null);
		Resenias resenia88 = new Resenias("La película desprende sencillez y ternura por todas partes, a medio camino entre la sonrisa y la tristeza, entre la dulzura (la experiencia y la sabiduría de las personas mayores) y la acidez (en la vejez casi todos los pensamientos viajan hacia atrás, los sueños son muy cortos y la esperanza se hace cada vez más pequeña), donde el director no quiere ahondar nunca en el drama y nos muestra la historia con naturalidad.", "", usuario23, null);
		Resenias resenia89 = new Resenias("Sublime China Zorrila. ¿Puede una actriz ser más adorable, talentosa y creíble que la inmensa uruguaya?. No por supuesto, porque todo lo que haga China tiene su toque mágico único. En Conversaciones con mamá está impresionante y Eduardo Blanco como su hijo no se queda atrás, juntos tienen unos diálogos que son de antología.", "", usuario30, null);
		Resenias resenia90 = new Resenias("Es una de las mejores películas que he visto en los últimos cinco años, sin duda. Un maravilloso guión interpretado de forma magistral por todos los actores sin excepción. Eduardo Blanco se ha colocado merecidamente en uno de los mejores actores que he visto.", "", usuario9, null);
		Resenias resenia91 = new Resenias("...muy realista y humana. Una relación madre e hijo bien dirigida da para mucho, como en ésta película. Realmente no puede ser más sencilla, pero a la vez llena de la propia vida de mucha gente.", "", usuario13, null);
		Resenias resenia92 = new Resenias("Con esta pelícua se demuestra que con un guión sencillo, pero excelente, unos decorados baratos y cero efectos especiales pero con dos actorazos se puede conseguir una obra maestra. Para algún experto quizá exagero, pero la actuación de China Zorrilla es tan entrañable, tan creíble que dan ganas de ver la película una y otra vez.", "", usuario3, null);
		Resenias resenia93 = new Resenias("Anita calza zapatitos de niña y zoquetes. Su edad mental y su edad física no coinciden. Ella está detenida en la infancia: es tierna, vital, inocente. Mantiene con su madre viuda una relación simbiótica. Para bañarse, vestirse y saber cuáles son los pasos a seguir depende de su madre y ambas duermen tomadas de la mano.", "", usuario18, null);
		Resenias resenia94 = new Resenias("Una autentica joya de película que nos enseña que viviendo en el presente, en el aquí, en el ahora..en la vida se puede superar cualquier obstaculo que se te presenta si en ello concentras tu determinación. y todo ello se lo debemos de agradecer a la hermosa protagonista que se pega un papelón impresionante.", "", usuario6, null);
		Resenias resenia95 = new Resenias("Marcos Carnevale (“Tocar el cielo”, “Elsa y Fred”) se arriesga a contar una historia sencilla si se quiere, pero arriesgada en el fondo, ya que, siendo la protagonista una chica con “síndrome de Down”  (Alejandra Manzo), y a semejanza del  dios caos de la mitología egipcia: Nace  el destino de ella y el de los demás con quienes se tropieza, generando así mismo, compromisos por el amor y consideración; en una tierna historia sobre cómo deberían ser las relaciones humanas.", "", usuario5, null);
		Resenias resenia96 = new Resenias("Esta película tiene todos los ingredientes para ser una gran película dirigida al corazón y al cerebro, pero intentando ir a ambos lados se queda a mitad de camino, y sólo llega a los ojos en forma de lágrima para aquellos que se dejan engañar facilmente por la suma de un atentado y una persona con sindrome de down.", "", usuario12, null);
		Resenias resenia97 = new Resenias("Este filme está protagonizado por Norma Aleandro, Leonor Manso, Luis Luque, Peto Menahem y la presentación de Alejandra Manzo, actriz que interpreta a la protagonista, Anita, y que padece en la realidad síndrome de down, al igual que su personaje. “La descubrimos luego de varios castings”, relata Carnevale.", "", usuario10, null);
		Resenias resenia98 = new Resenias("No sé cómo andará la cosa por allí, pero de lo que no os podéis quejar es de la calidad de vuestro cine. Aquí en España pasa todo lo contrario, no tenemos ni la mitad de talento que vosotros en este aspecto. Lo que no consigo adivinar es el porqué de esta situación.", "", usuario3, null);
		Resenias resenia99 = new Resenias("Los argentinos son únicos para radiografiar la soledad, y en esta pelicula lo demuestran una vez más. Sin llegar a situaciones estremas nos produce unas sensaciones de agobio y de impotencia al ver como los personajes son sometidos a pruebas absurdas que les van complicando la vida de una forma casi casual, al fin crítica social y drama.", "", usuario20, null);
		Resenias resenia100 = new Resenias("Una insólita mezcla de HISTORIAS MÍNIMAS y LA PRIMERA NOCHE DE MI VIDA. Una Navidad austral pasada por el tamiz de... ¿de qué, en realidad? FELICIDADES pretende ser comedia social, comedia tragicómica, comedia con toques kafkianos... Es todo muy confuso.", "", usuario7, null);
		Resenias resenia101 = new Resenias("Da igual lo que estés haciendo, déjalo, dedícate desde ahora a conseguir esta película.Se me caen las lágrimas cada vez que me acuerdo de ella, de sus personajes increíbles, de momentos tan sencillos, pero aún mejor incluso que los de historias mínimas, no se explicarte porque es tan buena, pero se que te va a gustar, es una película para todo el mundo, de esas que estés como estes, en cuanto veas un minuto no la dejas, chavales, da igual el Real Madrid, las discotecas, los cristales tuneados de tu Golf, el sexo (bueno el sexo es importante), da igual ir a comprarse algo bonito para estar más guapas, así estais muy bien, sentaros un rato, dejaros llevar, y comprobareis cual es el significado de la vida.", "", usuario4, null);
		Resenias resenia102 = new Resenias("Justamente en el año 2000, el cine argentino se ve revitalizado por dos filmes que renuevan lo antes hecho dentro del cine nacional: &quot;Nueve Reinas&quot; y &quot;Felicidades&quot;. A través del cruce simultáneo de historias, Bender nos brinda una magnífica caracterización de personajes que retratan una navidad triste, con altas dosis de soledad, insatisfacción y con la consabida búsqueda de la felicidad.", "", usuario22, null);
		Resenias resenia103 = new Resenias("Se ha dicho muchas veces, incluso lo afirma el propio Caetano, que “Un oso rojo” es un western. Esto resulta un poco extraño en principio, pero por muchas razones es una descripción acertada.El héroe tiene la marca. Un pasado turbio y un presente del que no puede escapar aunque quiera, precisamente condicionado por su trajín de delincuencia.", "", usuario11, null);
		Resenias resenia104 = new Resenias("Película subversiva como pocas, sería imposible realizarla en los Estados Unidos o cualquier otro país &quot;civilizado&quot;; los personajes son exactos; el casting idem; la música no es la que me gusta a mí, es la que les gusta a los personajes de la trama; el final totalmente inmoral de acuerdo a los cánones dictados por la censura  o autocensura de los EEUU y países semejantes.", "", usuario0, null);
		Resenias resenia105 = new Resenias("Al cabo de ver esta obra inigualable, los argentinos, nos quedamos con una cierta mueca  híbrida con sabor a aceptación, pues es la más pura realidad que se vive en el Gran Buenos Aires de hoy, otro poco de desazón, pues presumo que la mayoría de mis compatriotas preferiría que estos sucesos, aunque ficticios, basados estrictamente en el sórdido ambiente de delincuencia y corrupción policial, no se dieran en nuestro querido país, sumados a una extraña sensación de inseguridad generalizada y por qué no algo de desilusión o agotamiento mental que estalla en muchos ciudadanos que ven que la realidad, en lugar de mejorar, camina hacia atrás, como si muchos anduvieran por la vida &quot;jugados&quot; (en el peor de los sentidos que este vocablo puede ofrecer).", "", usuario18, null);
		Resenias resenia106 = new Resenias("Notable trabajo de Adrián Caetano al llevar otra historia en torno a la vida de un expresidiario que trata de reintegrarse a la sociedad y reivindicarse con su hija, a quien dejó de ver después de su ingreso a prisión y la ruptura con su mujer. Con pocos personajes y diferentes planteamientos de una crisis opresiva, Caetano y su personaje central “El Oso” nos presenta una Argentina olvidada y gris, que acentúa el desencanto de la sociedad que pide ayuda ú oportunidades para un estilo de vida mejor.", "", usuario30, null);
		Resenias resenia107 = new Resenias("No sólo es un fiel reflejo de la baja sociedad argentina, sino de la de cualquier país del mundo. No nos explican con demasiado detalle qué llevó a ese padre de familia a cometer esos crímenes, pero no hace falta, uno se lo imagina cuando le ve hablar con el Turco.", "", usuario24, null);
		Resenias resenia108 = new Resenias("Otoño de 1.976, en Argentina. El país sufre una conmoción cuando sufre un golpe militar. A partir de entonces, muchas personas hasta aquel momento libres y que ejercían con total naturalidad sus derechos y defendían sus ideales políticos, comenzarán a ser perseguidos.", "", usuario24, null);
		Resenias resenia109 = new Resenias("&quot;Houdini no fue un mago, fue un gran escapista. Un buen escapista debe tener...&quot;.Estremecedor relato del infierno en el que se transformó Argentina en la segunda mitad de la década de los setenta -la película está ambientada en 1976- bajo la terrorífica dictadura militar de Videla.", "", usuario13, null);
		Resenias resenia110 = new Resenias("Tras Plata quemada, Marcelo Piñeyro confirma las buenas maneras que ya apuntaba.La política ha sido desde siempre un buen terreno del que sacar materia fílmica. En muchas ocasiones ayuda a recuperar una memoria, que en muchos casos, se ha pretendido hacer olvidar a la fuerza.", "", usuario11, null);
		Resenias resenia111 = new Resenias("Hablar de la dictadura desde otro punto de vista, el de un niño. Como drama familiar está muy bien, pero falta algo para que sea una película redonda.Sus bazas son unos estupendos actores, incluidos los niños, una estética muy buena, al estilo hollywoodiense (similar a la de &quot;Las horas&quot;, &quot;Magnolia&quot; y similares, aunque salvando las diferencias), un más que aceptable guión y el importante tema tratado.", "", usuario15, null);
		Resenias resenia112 = new Resenias("Sosa, ñoña y anodina, si no fuera por su trasfondo político, que es en lo que se basa la película, resultaría inaguantable, su único ápice está en el principio y en el final, toda su &quot;aventura&quot; durante el metraje es algo casi sin interés.", "", usuario7, null);
		Resenias resenia113 = new Resenias("En Argentina existe la discriminación hacia los peruanos, bolivianos, paraguayos, etc., y esta película la retrata muy bien, al punto de que nos muestra la cara más horrible de este asunto.Me he sentido identificado con ese pobre muchacho que deja a su familia, mujer e hijos en su Bolivia natal, y llega a Buenos Aires con la sola intención de encontrar una oportunidad por mísera que sea.", "", usuario7, null);
		Resenias resenia114 = new Resenias("Con una ejemplar economía narrativa y de medios, desarrollando la acción practicamente en un único lugar, el cineasta argentino Adrián Caetano cuenta la historia de un inmigrante boliviano recién llegado a la prometedora Argentina, sin papeles, dónde comenzará a trabajar de cocinero en un bar.", "", usuario17, null);
		Resenias resenia115 = new Resenias("Ganador del Premio de la Crítica Joven en el Festival de Cannes y del Premio Made In Spanish en el Festival de San Sebastián.Freddy (Freddy Flores), un inmigrante boliviano ha conseguido un reciente trabajo en Argentina de parrillero en un restaurant, ya que en su país ha perdido su trabajo.", "", usuario6, null);
		Resenias resenia116 = new Resenias("Soberbias actuaciones: el oso, Freddy, el dueño del restaurant y Marcelo dan cátedra. Este era mi principal miedo ante actores de poco cartel. Nada está demás, nada parece fingido... Ahora que miro mejor, los nombres de los actores y de sus personajes son idénticos.", "", usuario36, null);
		Resenias resenia117 = new Resenias("Bolivia-Simplista y muy reconocido largometraje Argentino, en muchos niveles es el retrato de cada uno de los inmigrantes de América Latina a otro país hermano, independientemente el nombre del país es casi seguro que la realidad vivida por el protagonista, es la difícil realidad de muchos que deciden viajar de su nación a un país vecino que les pueda dar más oportunidades de vida digna, también retrata de forma secundaria la penosa situación económica de los ciudadanos producida por el subdesarrollo de la misma economía, me ha llamado la atención en sobre manera la forma de dirigir de Caetano, en muchos sentidos se sale de la típica filmación peculiar del cine latino con sus cámaras en mano, este se decanta por tener mucha cámara fija y hacer imágenes de transición con algún dialogo de personaje de fondo, esto da cierta fuerza a las imágenes y describe de forma creíble el entorno, además da fuerza a la cinematografía de la propuesta, el resultado final un filme bastante bien hecho, que peca de algunas ingenuidades técnicas propias del arte del director que está en desarrollo, para muestra el desenlace que se siente un poco forzado.", "", usuario1, null);
		Resenias resenia118 = new Resenias("Los niños que nacen entre rejas, el vinculo madre-hijo en esas circunstancias,  la relación de solidaridad u hostilidad con las compañeras del presidio, el derecho de los que están afuera y el de los que están encerrados, son los temas incorporados al último film del realizador argentino Pablo Trapero, que elude transitar por los lugares comunes del subgénero de películas carcelarias, evitando hacer de lo escabroso un motivo central.", "", usuario31, null);
		Resenias resenia119 = new Resenias("Esta película se caracteriza por lo real que es. El drama de la protagonista el espectador lo va a sentir como propio. Está muy bien representada la presa embrazada. Parece haber estudio en la interpretación. Y que muestren como ella está embarazada de verdad, la hace aun más cruda a la realidad.", "", usuario10, null);
		Resenias resenia120 = new Resenias("Creo que esta película responde a la pregunta del título. Describe el día a día en una cárcel de mujeres, sin darle tintes novelescos ni melodramáticos. Son cosas que podrían pasar en unas celdas. Y creo que logra describirlo así de bien por cómo comienza la película, ya que no hace falta que haya un culpable o un inocente para que pase algo así, para que te veas embarazada y desvalida en una penitenciaría.", "", usuario5, null);
		Resenias resenia121 = new Resenias("La veracidad es algo que siempre está presente en las películas de Trapero. En los últimos años han salido un grupo de cineastas argentinos como Carlos Sorín o el propio Trapero que dotan a su cine de una veracidad muy palpable. Usan para ello historias muy cotidianas y con actores no profesionales (en muchos casos).", "", usuario36, null);
		Resenias resenia122 = new Resenias("Trapero busca el realismo más descarnado, como en sus anteriores películas. Es una historia totalmente creíble, sobria y natural. Es diferente a otras películas sobre prisiones. Nunca cae en lugares comunes. La sensación de claustrofobia es enorme.", "", usuario25, null);
		Resenias resenia123 = new Resenias("Luego de 15 años de ausencia de la pantalla grande (en el medio sólo hubo un extenso documental político), Leonardo Favio regresa a su propio clásico de mediados de los sesenta, &quot;El romance del Aniceto y la Francisca&quot;, para transformarlo en una emotiva pintura sonora en movimiento de ballet.", "", usuario20, null);
		Resenias resenia124 = new Resenias("Cuarenta y dos años después, Leonardo Favio retoma su segunda película con el convencimiento de que no hay versión buena si no se transmuta la obra original. Y con esta idea, alejado por completo de lo que se ofrece en el mercado, convierte la historia de Aniceto y Francisca, en una obra nueva, visualmente deslumbrante y con un carácter sensual donde antes solo existía rudeza.", "", usuario26, null);
		Resenias resenia125 = new Resenias("El genio de Favio nos vuelve a sorprender con una fábula rebosante de ternura y lirismo, emanada de su sensible espíritu, la que, lamentablemente, es posible sea su obra póstuma, ya que su salud se encuentra muy deteriorada por una penosa enfermedad.", "", usuario25, null);
		Resenias resenia126 = new Resenias("Aniceto es la reversión “bailada” de la película que dirigió allá por el año 1967, titulada Éste es el romance del Aniceto y la Francisca, de cómo quedó trunco, comenzó la tristeza y unas pocas cosas más… protagonizada por Federico Luppi, Elsa Daniel y María Vaner.", "", usuario12, null);
		Resenias resenia127 = new Resenias("Leonardo Favio ya había hecho en los años 60 una hermosa versión de este cuento de su hermano Jorge Zuhair Jury, con un título bastante más extenso, en blanco y negro. Sin embargo en la presente versión, &quot;Aniceto&quot;, mostrando su creatividad y capacidad, logra ir más allá del cine.", "", usuario3, null);
		Resenias resenia128 = new Resenias("Kafkiano retrato de la sociedad argentina en el que un hombre normal se ve involucrado, de la noche a la mañana, en la más absurda de las pesadillas.Me gustan mucho estos finales tan abiertos, tan imprecisos. Cada uno se construirá el suyo propio.", "", usuario33, null);
		Resenias resenia129 = new Resenias("Di Cesare ofrece una absoluta tragicomedia que retrata la miseria no sólo económica sino también moral instalada en su país desde la crisis, representada por un mensajero que ve como de la noche a la mañana se le instala en su casa una familia con el objetivo de montar un negocio a su costa.", "", usuario2, null);
		Resenias resenia130 = new Resenias("Al principio todo comienza según lo previsto: crisis argentina, mirada costumbrista y relación amorosa entrañable y aparentemente idílica. Pero lo previsto se derrumba, pues la película sorpresivamente adquiere la forma de un delirante drama kafkiano.", "", usuario19, null);
		Resenias resenia131 = new Resenias("¡Gratas sorpresas! nos dejo está nación Sudamericana, al mostrarnos un filme digno de competencia; calidad en toda la extensión de la palabra, sin faramalla y sencillez su historia lleva al espectador a la risa, a las muecas y a la indignación en tan solo hora y media; la crisis de principios de siglo ha servido de inspiración para contarnos lo increíble más no imposible.", "", usuario10, null);
		Resenias resenia132 = new Resenias("Realizada con poquitísimos recursos y un acotado presupuesto, la película se destaca por un guión súper entretenido. Hernán es un buen chico, que recientemente vive solo en la casa familiar, tiene buenos sentimientos y un gran corazón. Pero pobre Hernán un día le agarra (y voy a ser sutil para decirlo) una calentura de ésas con una muchacha que trabaja en una gasolinera.", "", usuario22, null);
		Resenias resenia133 = new Resenias("Película humana, intimista y que se hace muy agradable gracias a los papeles de las dos actrices protagonistas. Norma Aleandro está estupenda, como siempre, pero Norma Argentina no se le queda atrás. Alejado de los circuitos comerciales, Jorge Gaggero nos intenta mostrar la decadencia de la clase media Argetina, que pierde poder económico poco a poco.", "", usuario21, null);
		Resenias resenia134 = new Resenias("El joven director Jorge Gaggero elige una óptica diferente a la convencional dialéctica ideológica del amo y el esclavo, para observar las relaciones de clase en medio del desplazamiento social de un país, que a fines de 2001 entró en un caos económico y político sin precedentes.", "", usuario14, null);
		Resenias resenia135 = new Resenias("En ocasión de la proyección en TV2 de la fenomenal “Historia oficial”, el prestigioso crítico de cine Juan Miguel Lamet no dudó en señalar a Norma Aleandro como la mejor actriz en activo de habla hispana y probablemente una de las tres o cuatro mejores del mundo.", "", usuario29, null);
		Resenias resenia136 = new Resenias("Entretenidísimo cara a cara entre dos mujeres que tras vivir casi treinta años bajo un mismo techo (una, la señora de la casa; la otra, su empleada) se ven enfrentadas por la crisis económica que sacudió recientemente a la Argentina.¿Que sucederá cuando esos roles y status que mantuvieron durante tanto tiempo resulten dinamitados?¿Qué mujer aparecerá tras la orgullosa burguesa venida a menos y cuál tras la empleada que no aguantaba ya más a su jefa?¿Qué queda cuando nada de eso queda? ¿Servirá de algo todo lo que han comparetido juntas aunque de manera tan diferente?Interesante historia, interesante película.", "", usuario27, null);
		Resenias resenia137 = new Resenias("Me gustó la historia. Me gustaron mucho los personajes. Me gustó como lo va contando todo Gaggero. Me gustó la fotografía. Me gustaron los toques de humor. Me gustó la mirada crítica, limpia, humana del director. Me gustaron mucho las dos Normas, la que ya lo ha demostrado casi todo y la que debutaba ante las cámaras.", "", usuario15, null);
		Resenias resenia138 = new Resenias("Por sus características, puede decirse que esta película dirigida por la exitosa dupla conformada por Mariano Cohn y Gastón Duprat (&quot;Yo presidente&quot;, &quot;El hombre de al lado&quot;) es un filme de género inclasificable, ya que a pesar de su constante ironía, la parodia humorística no parece ser su objetivo último, sino apenas un puente para pensar sobre dónde se refugia y cómo se reconoce al artista y su obra en los tiempos que corren.", "", usuario30, null);
		Resenias resenia139 = new Resenias("En principio el guión de “El Artista” promete: un enfermero que cuida ancianos descubre que uno de ellos - en silla de ruedas y sin habla (salvo para pedir puchos) - es un genio de la pintura. Sin ningún escrúpulo, decide  tomar sus obras y presentarlas como propias amparado en el ensimismamiento del viejo que ignora la situación.", "", usuario18, null);
		Resenias resenia140 = new Resenias("Esta película argentina refleja lo banal del ambiente artístico, revisando el concepto comercial, mostrando en escena la frivolidad en donde se desarrollan estas actividades. Podría decirse que es una sátira, pero la historia de fondo es la protagonista principal.", "", usuario33, null);
		Resenias resenia141 = new Resenias("Jorge, un enfermero que trabaja en un asilo, se introduce de buenas a primeras en primera fila del arte de vanguardia. El argumento es mínimo, pero está lleno de detalles y entraña grandes dosis de ironía y de crítica a la pedantería reinante en ciertos ambientes.", "", usuario10, null);
		Resenias resenia142 = new Resenias("Lo mejor más allá de la premisa, que ya se ha usado otras veces, es ese humor tan contenido, de una irónica de lo más sutil que está presente en toda la película, algo bastante atípico en el cine argentino, cuyas propuestas en lo que a la comedia se refiere, por lo general son las familiares un poco herederas de las comedias italianas de los 60 y 70, o sino las vulgares, de ese humor vulgar y machista, aquí no solo el argumento y el tono, sino hasta la dirección es diferente, sobria a más no poder, sin destacar ningún plano, con la cámara fija en casi todas las escenas, viendo al protagonista desenfocado.", "", usuario4, null);
		Resenias resenia143 = new Resenias("Curiosa película, maldita sea. Ya en las primeras secuencias nos encontramos una situación opresiva, enfermiza. Unos ancianos en traje de baño toman el sol al lado de una piscina, mientras beben vino con hielo. Se mueven rítmicamente, sin alma, de un modo siniestro que hipnotiza.", "", usuario35, null);
		Resenias resenia144 = new Resenias("La participación de unas jóvenes y sensuales mujeres, la mayor parte del tiempo en bañador o traje de baño, son la carnada para pescar al espectador. A parte de estas atractivas féminas, todo es tediosa cotidianeidad familiar sobre un transcurso de horas calurosas en algún lugar de la provincia de Salta al noroeste de Argentina (esta provincia limita con tres países: Chile, Bolivia y Paraguay; en el film la acción transcurre durante unos dos o tres días en la zona fronteriza de Salta con Bolivia).", "", usuario6, null);
		Resenias resenia145 = new Resenias("Muchos pergaminos, mucha alharaca y en verdad la película de la salteña Lucrecia Martel no cuenta nada, se queda en una insolvencia argumental alarmante. Ya estos ingredientes se pueden vislumbrar en su posterior trabajo &quot;La niña santa&quot; que no es para nada distinto a este filme que nos ocupa.", "", usuario15, null);
		Resenias resenia146 = new Resenias("Tremenda decepción, me esperaba una película acorde con la puntuación que le daba la crítica y me ha defraudado. Lo único que puedo destacar es que ha sabido reflejar muy bien el prototipo de familia aburguesada que está pasada de vuelta, no hay ilusión ni esperanza, los valores brillan por su ausencia.", "", usuario2, null);
		Resenias resenia147 = new Resenias("Según tengo entendido, un guión viene a ser una especie de libreto en el que se escriben los diálogos y se describen detalladamente las diferentes escenas de una peli. Me atrevería a asegurar, incluso, que a través de un buen guión el lector/espectador debería ser capaz de encontrar un hilo conductor que le permitiera interpretar correctamente el sustrato argumental (lo que acontece, vaya) de cualquier peli hecha como Dios manda.", "", usuario7, null);
		Resenias resenia148 = new Resenias("Si fuera hacer un resumen de esta película partiendo tan sólo de las escenas elegiría dos de ellas: la del diálogo de Cristina en la barca y la de Román en la Asamblea. Las dos son especialmente bellas porque nos hablan del verdadero concepto de la felicidad.", "", usuario20, null);
		Resenias resenia149 = new Resenias("Luna de Avellaneda es la historia de un emblemático club de barrio que ha vivido en el pasado una época de esplendor y que en la actualidad se encuentra inmerso en una crisis que pone en peligro su existencia. Al parecer, la única salida posible es que se convierta en un casino, nada más alejado de los ideales y de los fines de sus fundadores en la década de 1940: un club social, deportivo y cultural.", "", usuario11, null);
		Resenias resenia150 = new Resenias("Juan José Campanella demuestra que posee las cualidades propias de un director de fuste y de gran calidad. La película presenta una historia hecha de cotidianeidad, sencillez, personajes humanos, situaciones normales, reacciones verosímiles, que componen en conjunto un excelente retazo de la vida misma.", "", usuario13, null);
		Resenias resenia151 = new Resenias("Una cálida noche de 1959, durante el carnaval, Román nació en el club social “Luna de Avellaneda”. El club estaba a reventar de gente que se divertía, que bailaba y que vibraba al son de un sentimiento colectivo de unidad. Porque el “Luna de Avellaneda” era más que un club social.", "", usuario2, null);
		Resenias resenia152 = new Resenias("Emotiva película y muy buenas actuaciones en las que destacamos al actor principal Ricardo Darin y a la actriz Mercedes Morán! La historia es realmente hermosa y muestra un poco la realidad de cierto sector de la Argentina, en especial ese de clase media/baja.", "", usuario32, null);
		Resenias resenia153 = new Resenias("Película muy seria, triste, deprimente; donde todo lo que sucede está bajo la esfera de la realidad frustante de tantísimos millones de argentinos dentro de una patria-sociedad que es capaz de darles equipos de futbol campeones del mundo, pero para nada un Estado campeón  en hacer cumplir los derechos humanos en la mayoría de sus ciudadanos, empezando por la comida, la educación, el trabajo, la vivienda, etc.", "", usuario14, null);
		Resenias resenia154 = new Resenias("1) Una primera parte rural, muy extensa y morosa, con muchos detalles que suman poco, expuestos por María Victoria Menis con escritura elemental, precede a una segunda parte urbana, más breve, dramáticamente cargada, a un ritmo que se acelera de pronto hacia el tajante final.", "", usuario29, null);
		Resenias resenia155 = new Resenias("La primera secuencia nos presenta a Félix -un joven huérfano y sin dinero- a bordo de un tren donde no ha pagado el boleto y del que minutos después se arrojará para no ser descubierto. No tiene un derrotero fijo hasta que el azar lo relaciona con Roberto, al que conoce en el bar de un mísero pueblito.", "", usuario11, null);
		Resenias resenia156 = new Resenias("Película que en cierto sentido podría considerarse como eso que en algún momento se llamó cine de autor. Pero de ninguna manera se trata de un filme pretencioso, todo lo contrario. Humilde y valiente, cercana y contenida, &quot;El cielito&quot; nos atrapa con una historia tejida en los límites de la ficción y el documental, con la sinceridad de un niño mirándote a los ojos.", "", usuario3, null);
		Resenias resenia157 = new Resenias("Resulta muy difícil encontrar la luz al final del túnel. Descubrir un rayito de sol, el rayo verde tal vez, en medio de toda la miseria económica, moral y emocional que envuelve a los protagonistas de El cielito. Posiblemente esta sea la razón del diminutivo simbólico al que remite el título de la película.", "", usuario27, null);
		Resenias resenia158 = new Resenias("Tras la II Guerra Mundial Olinda (Rita Cortese) abandona su Italia natal para ir en busca de un amor de juventud que perdiera hace años. Intento fallido que desemboca en una nueva vida regentando un (permítanme el giro) pequeño &quot;boliche&quot; con su nombre en un barrio indeterminado de Buenos Aires; que esta vez no suena a Gardel, sino a tarantella.", "", usuario29, null);
		Resenias resenia159 = new Resenias("Esta es una película de detalles, de cosas pequeñas (que le llaman algunos a este tipo de historias), en la que disfrutar con miradas, silencios, reacciones sentimentales de los personajes... todo eso te puede atrapar y realmente emocionar, o quizá dejar indiferente y aburrir, admito el riesgo.", "", usuario2, null);
		Resenias resenia160 = new Resenias("Herencia, es una comedia dramática sobre dos inmigrantes europeos que llegan a Buenos Aires en dos épocas muy diferentes. Olinda (Rita Cortese) es una inmigrante italiana que llegó a la Argentina tras la Segunda Guerra Mundial. Aunque nunca pudo encontrar al hombre cuyos pasos seguía, decidió adoptar a Buenos Aires como su ciudad.", "", usuario18, null);
		Resenias resenia161 = new Resenias("Cine de sentimientos escondidos, de amistad a flor de piel oculta tras una coraza tan frágil como un plato, de amores perdidos, encontrados y vueltos a perder, la película de Hernández se paladea como las berenjenas, sin salsas que escondan su sabor.", "", usuario6, null);
		Resenias resenia162 = new Resenias("No tengo mucho más para agregar sobre las bondades de este film a las críticas que ya existen, salvo que la actuación de Rita Cortese es excelente, creo que es una de las mejores actrices argentinas. Ya la había visto en televisión y siempre ha destacado por su forma de expresar, su convicción y su nervio.", "", usuario12, null);
		Resenias resenia163 = new Resenias("Cinta argentina bajo el manto de un thriller policial. Un paralítico vive la precariedad de su existencia hasta que ésta es interrumpida por la llegada de nuevos inquilinos. Le aportan fuerza vital y un hecho fortuito lo hace interesarse en la vida exterior.", "", usuario35, null);
		Resenias resenia164 = new Resenias("Acercarse al cine argentino siempre reserva sorpresas agradables. Los profesionales del sector audiovisual de ese querido país hermano tienen una categoría más que notable que se ha podido comprobar en cine y en un mercado publicitario internacional que dominan por su ingenio y saber hacer.", "", usuario27, null);
		Resenias resenia165 = new Resenias("Fuí sin siquiera saber el Título, ni de que trataba, y me llevé una grata sorpresa.La Película me tuvo atado a la butaca hasta el final.Me pareció original la idea de la trama central, y el guión muy bien llevado. La resumiría como &quot; La Doble Mejicaneada del Paralítico &quot;.", "", usuario3, null);
		Resenias resenia166 = new Resenias("Al final del túnel Estamos de parabienes. De nuevo me toca reseñar una estupenda película argentina pues, como ocurre con el cine español, son aconticimientos escasos así que, estas alegrías, dosificadas con cuentagotas, siempre significarán un motivo de celebración.", "", usuario37, null);
		Resenias resenia167 = new Resenias("Siento decirlo, pero tengo cierta prevención contra las películas españolas e hispanoamericanas, quizá sea injusto, pero es así. Me cuesta darles una oportunidad. Éste es uno de esos casos, y me han sorprendido muy, muy, muy gratamente.Un thriller en estado puro, nada de denuncias sociales por en medio, nada de escenas de sexo para rellenar, nada de violencia gratuita, (aunque cuando hace falta está ahí).", "", usuario1, null);
		Resenias resenia168 = new Resenias("La película esta bien estructurada, cuenta lo importante de la situación de la aviación en Argentina desde un punto de vista miy crítico aunque tambien meten paja para rellenar pero eso es menos importante. A quien le guste la película y tenga ganas de saber algo mas del accidente y de las compañias aereas de ese pais, el mismo actor/piloto &quot;Piñeyro&quot; ha realizado un documental muy interesante, la puesta en escena me recuerda en algunos momentos al maestro Alfred Hitchcock, pero se puede llevar muy bien.", "", usuario21, null);
		Resenias resenia169 = new Resenias("Me es indiferente que sea considerada película o documental. El caso es que relata muy bien la historia del avión WRZ y de la compañía aérea LAPA. Definitivamente está claro que vale la pena pagar un billete más caro y volar más seguro, porque compañías de bajo coste o provenientes de países con una economía deficiente son un verdadero peligro.", "", usuario9, null);
		Resenias resenia170 = new Resenias("&quot;Whisky Romeo Zulú&quot; es un filme absolutamente excepcional en el panorama del cine en general. Las singularidades arrancan ya desde el título: &quot;Whisky-Romeo-Zulú&quot;, no es una mezcla surrealista de palabras al azar, sino la matrícula del avión siniestrado de Lapa, en la tragedia aérea que conmocionó a la Argentina en 1999.", "", usuario20, null);
		Resenias resenia171 = new Resenias("Una película con concesiones al genero documental que establece con meticulosidad los precedentes a un accidente aereo y mezcla una historia sentimental/personal que muchas veces no acaba de encajar, especialmente las escenas de la infancia del piloto.", "", usuario2, null);
		Resenias resenia172 = new Resenias("Y es que después de ver la película y de sobre todo el documental que relata la verdadera historia si voy a argentina procuraré moverme por allí en autobús. Cinematográficamante la película no aporta mucho ni va más allá. No es brillante en ninguno de sus aspectos aunque si cabe destacar el trabajo de Enrique Piñeyro.", "", usuario28, null);
		Resenias resenia173 = new Resenias("Esta primera incursión del joven realizador Sebastián Schindel en el largometraje de ficción, luego de una amplia y sólida trayectoria como documentalista (“Mundo alas”, “Rerum Novarum”, entre otras, son muestras de su vocación por sensibilizar acerca de la dignidad de los más débiles) es un implacable retrato sobre las prácticas poco menos que esclavistas, aún presentes en ciertas relaciones laborales.", "", usuario4, null);
		Resenias resenia174 = new Resenias("Un caso de la historia jurídica argentina. Una historia de abuso degradante.Un guión simple, una estética que ronda entre lo humilde y lo miserable,con atmósferas por momentos bastante asfixiantes.Y dos actuaciones para mencionar, una la de Luis Ziembrowski, que hace un papel absolutamente creíble.", "", usuario27, null);
		Resenias resenia175 = new Resenias("Bendito el día que mi amigo Sebastián, argentino de nacimiento, me inculcó el amor por el cine de su país. Descubrí ésta historia de pura casualidad y me enganchó desde sus primeros minutos. La imagen de la marginación que muestra el protagonista desde el primer plano te hace sentir empatía por él, a sabiendas que su vida no debe ser nada envidiable.", "", usuario17, null);
		Resenias resenia176 = new Resenias("Buena película de mi país con una actuación sencilla pero contundente de Joaquín Furriel, quien da vida a un santiagueño que llega a Buenos Aires para intentar trabajar y ganarse la vida, cae de este modo en manos de un patrón muy jodido, quien lucra con la carne y hace un comercio de ella.", "", usuario19, null);
		Resenias resenia177 = new Resenias("&quot;La vida es un destino que hay que cumplir&quot; y, oyendo recitar las pocas palabras que se atreve a decir más allá de &quot;si, patrón&quot;, el sentimiento que surge es el de pena, lástima urgente por quien ha sido utilizado, engañado, maltratado y humillado, analfabeto sin recursos, inepto para el gobierno sólo cuenta con sus dos manos y esa férrea voluntad de hierro por obedecer, complacer y servir al patrón en todo lo que diga.", "", usuario34, null);
		Resenias resenia178 = new Resenias("Durísimo guión y film sobre la desgraciada vida de un muchacho de la calle en Argentina. Toda su existencia espeluznante transcurre entre los incontables adjetivos de &quot;boludo&quot; y &quot;loco&quot;. Juan Carlos Desanzo elabora de manera magistral una atmósfera social de cruel desesperanza y frustración de las expectativas vitales, encarnada en un cuarteto principal de personajes: Abel Ayala (&quot;Polaquito&quot;, un preadolescente de los que callejean como perros realengos), Marina Glezer (&quot;Pelu&quot;, la muchacha prostituta sin futuro ni valentía para dejar atrás su presente), Fernando Roa ( &quot;Vieja&quot;, un adolescente violenteo, delincuente con labios de mujer, el amigo &quot;mala compañia y peor ejemplo&quot; que &quot;El Polaquito&quot; toma como referencia) y a Roly Serrano (actor adulto y veterano que hace el papel de &quot;Rengo&quot;, el chulo de putas y jefe de jóvenes a los que dirige en la dilincuencia).", "", usuario22, null);
		Resenias resenia179 = new Resenias("Para estar basada en hechos reales, tener a un director tan experimentado y estar ambientada en un escenario tan duro, el guión es demasiado ingenuo. La distribución de la violencia es torpe –resulta contraproducente que adquiera tantísimo protagonismo–, y su retrato, demasiado básico cinematográficamente hablando –los explotadores sólo son &quot;temibles&quot; porque maltratan físicamente, pero psicológicamente apenas tienen profundidad–.", "", usuario27, null);
		Resenias resenia180 = new Resenias("Lo real inverosímil, pesado, reiterativo, poco desarrollado, repitiendo una y otra vez las mismas situaciones teniendo un material tan rico, surgido de la propia crónica negra: esto es El polaquito, que no sigue la tradición iniciada por Pixote, de Babenco, también argentino pero radicado en Brasil.", "", usuario16, null);
		Resenias resenia181 = new Resenias("&quot;El polaquito&quot; es una obra centrada el la vida de un chico huido de casa por las continuas palizas recibidas por su padre, en la que su única forma de ganarse la vida es la mendicidad y pequeños hurtos. La película nos muestra la época en la que el chaval en plena adolescencia se enamora de una chica que trabaja de prostituta para el mismo hombre que se encarga de explotar lo poco que ganan a cambio de protección.", "", usuario15, null);
		Resenias resenia182 = new Resenias("No suelo ser despiadado, pero en este caso no pude contenerme. No puedo creer que le hayan dado tan alto puntaje a este mamarracho de película. No puedo recordar cuántas cintas pueden competir con esta en &quot;malas actuaciones&quot;, que digo malas, son patéticas, vergonzosas, inverosímiles hasta la risa.", "", usuario17, null);
		Resenias resenia183 = new Resenias("No pensaba escribir una crítica, pero mientras leía las ajenas se activaron ciertos botones que no pude negar.Tenía algo de información sobre la película, viene premiada por varios festivales, había visto el Trailer y en mí cuerpo corría cierta incomodidad previa.", "", usuario13, null);
		Resenias resenia184 = new Resenias("Soberano sacudón le ha propinado la dupla Cohn-Duprat a la medianía general cinematográfica. Acabo de salir del cine y tengo todavía esa sensación de plenitud, de panza llena. Esa sensación tan infrecuente últimamente, en un mundo -el del cine- en el que parece a veces que está todo dicho, o que ya todo está contado de todas las maneras posibles.", "", usuario23, null);
		Resenias resenia185 = new Resenias("¿O no…?Si hay algo en el cine argentino que me atrae son sus actores. Parecen tocados por una barita mágica. Esta es una película puramente actoral y de muy alto nivel.La trama se fundamenta en una idea, tan genial como sencilla.", "", usuario28, null);
		Resenias resenia186 = new Resenias("Muy interesante propuesta de Cohn y Duprat, quienes logran una comedia inteligente que circula entre lo estéticamente visual y el discurso ideológico que transmite. Las imágenes dicen más de lo que muestran.  La frase: “Yo lo que necesito es un poquito de luz que a vos te sobra”, funciona como disparadora del relato.", "", usuario8, null);
		Resenias resenia187 = new Resenias("Últimamente tiendo a ordenar mentalmente el cine en tres categorías:1) Populista: Aquel que trata de saciar los instintos más primarios de un espectador al que en realidad el cine no le interesa. Por ejemplo el Hollywood más descerebrado, las españoladas o Bollywood.", "", usuario10, null);
		Resenias resenia188 = new Resenias("Película estrenada en el año 2000, en blanco y negro, con actores desconocidos y bajo presupuesto, apenas 52000 dolares.Este Film se sale del molde y nos cuenta una original historia en 3 épocas de Buenos aires.Son 3 amigos que desde adolescentes, están obsesionados por una actriz de teatro de revistas, que se van metiendo en &quot;quilombos&quot;, y van mostrando lo peor de los argentinos, el mundo de la noche, la droga, las mafias y la historia y las crisis que se repiten década a década.", "", usuario25, null);
		Resenias resenia189 = new Resenias("En está semana con la oportunidad de ir al cine y ver propuestas en la segunda Muestra Internacional de Cine en México me he topado curiosamente con cuatro películas de crítica social a personajes ubicados como el pilar de la familia: la madre. La visión ha girado 180º y la descomposición parte de ellas, gracias al desencanto con el que viven y con el cual han construido su destino, colocándolas como la escoria de una sociedad supuestamente funcional.", "", usuario20, null);
		Resenias resenia190 = new Resenias("&quot;No me gusta trabajar&quot;, esgrime Florencia, protagonista principal de esta obra que conmueve, divierte y hace pensar. Son las vicisitudes femeninas, sus contradicciones, enfrentamientos de clase y familiares y demás detalles de la vida cotidiana los que se nos presentan de una manera que nos permite mantener el interés durante su desarrollo.", "", usuario7, null);
		Resenias resenia191 = new Resenias("La nena hace lo que puede, pero su actuación es muy sobre actuada . Con la musica de los bobosónicos que son insoportables. Es una comedia dramática, pero de comedia no tiene nada, nunca te hace reir. La madre hace de cocainómana y llega ser adicta a la idiotez.", "", usuario15, null);
		Resenias resenia192 = new Resenias("Aceptable film argentino que comienza de un modo exultante, con diálogos y escenas motivantes pero que a medida que transcurre la película se va cayendo poco a poco, (comienza con suerte y acaba sin fortuna) llegando a tener un desenlace absurdo no creíble.", "", usuario23, null);
		Resenias resenia193 = new Resenias("Felipe (Marcelo Mazzarello) un actor desempleado y Guillermo (Gastón Pauls) despedido de su trabajo y abandonado por su novia, son dos medio hermanos muy diferentes, hacen años que no se ven, pero vuelven a reunirse para complacer a su moribundo padre en su último deseo antes de morir.", "", usuario3, null);
		Resenias resenia194 = new Resenias("De nuevo una película argentina entrañable. La suerte está ahí, y en muchas ocasiones hay un hilo muy fino que separa la mala de la buena. Nuestro querido protagonista no se resigna a ser un perdedor toda su vida y tendrá que luchar para que su suerte y la de quien le rodea cambie a mejor.", "", usuario11, null);
		Resenias resenia195 = new Resenias("Entretenida y hasta enternecedora película, signada por un halo melodramático que no siempre se plantea de la mejor manera. Algunos visos de comedia romántica - a la americana-  y pálidos tintes de cine absurdo, arrasan con su unidad narrativa sin que esto obre como proyecto del guión; es decir, no es de aquellos trabajos fílmicos que, como propuesta, rompen con el orden cronológico lineal y/o la estructura tradicional de la historia contada; aquí en cambio se ofrece un caldo saturado de trucos  y fórmulas efectistas, que termina por desestructurarlo  y por ofrecer un conjunto de escenas mal hilvanadas.", "", usuario37, null);
		Resenias resenia196 = new Resenias("Al principio pensé que la película se trataría de una suerte de selección de videos del programa de televisión. Por suerte me equivoqué: Los personajes son los mismos y Capusotto es el de siempre, pero el material es renovado. En esta oportunidad se añaden además publicidades y números nuevos muy bien logados (el del rollinga que tiene que exorcizar a un careta es sencillamente desopilante).", "", usuario35, null);
		Resenias resenia197 = new Resenias("Una comedia genial, probablemente la película que más me hizo reir en una sala de cine. Lo mejor de todo es que el film no vuelve simplemente a cada broma que ya siendo marca registrada garantiza una sonrisa al menos, sino que profundiza esa hilaridad poniendo un hilo, un sentido en común que reúne a todos los personajes de capusotto para &quot;discutir&quot; acerca del entretenimiento, con una violencia rivas en un rol contuctor que le calza a la perfección.", "", usuario25, null);
		Resenias resenia198 = new Resenias("¿Qué más puede decirse del humor de Capusotto que no se haya dicho? Es un genio y un gran actor que transmite justo lo que desea transferirnos: la ironía descarnada, la sátira social aguda, sonrisas y carcajadas a granel. La película es una extensión de su programa de televisión con mayor producción.", "", usuario21, null);
		Resenias resenia199 = new Resenias("El tándem creativo Capusotto-Saborido logra su punto máximo en esta película que sencillamente no puede recibir otro calificativo de mi parte que excelente. Pensaba ver un programa largo de Peter Capusotto y sus videos y me encontré con una cinta totalmente conexa, que además de desternillarte de la risa es un mazazo a la industria del entretenimiento hecha desde el mismo medio que te entretiene (ese es otro punto genial de la película).", "", usuario19, null);
		Resenias resenia200 = new Resenias("-&quot;Antes, uno no sabía la cantidad de forros que podía haber por el mundo. Ahora, con los posteos, los comentarios de los foros y los diarios, y toda la impunidad opinadora, te das cuenta categóricamente de la cantidad de nabos que existen y dejan constancia escrita de su pelotudez&quot;(Violencia Rivas en Peter Capusotto y sus 3 dimensiones)Con permiso de la querida Violencia, voy a dejar constancia escrita de mi pelotudez una vez más aquí en Filmaffinity (la número 263, según dice el conteo de mi sección de críticas), hablando de esa decepción que fue la primer película de cine basada en la serie de culto de la televisión argentina: &quot;Peter Capusotto y sus videos&quot;.", "", usuario16, null);
		Resenias resenia201 = new Resenias("Es una película utópicamente sencilla, o sencillamente utópica. Siempre me han gustado las historias de juegos o libros que transforman súbitamente la realidad, pasando a convertirse en mitos culturales y congeniando el arte con la vida. Pero he de reconocer que por lo general, cuando esto ocurre, corre mucha sangre antes de que los esperados cambios sobrevengan.", "", usuario13, null);
		Resenias resenia202 = new Resenias("Película de Alberto Lecchi, quien había debutado en 1993 con la entretenida &quot;Perdido por perdido&quot;, para esta historia Lecchi reunió un grupo de actores consagrados en España como Juan Echaove y Juan Diego además del argentino Dario Grandinetti quien sostiene la trama a base de su enorme actuación, no cabe duda que el  guión es interesante y la realización técnicamente bien lograda, dando como resultado una historia cautivante, aunque por momentos si parece excederse en pretensiones, lo mejor es que de algún modo enaltece el espíritu revolucionario latinoamericano, además, la idea es burlarse de la realidad, antes que ella se burle de nosotros.", "", usuario32, null);
		Resenias resenia203 = new Resenias("Lo que insufla vida a esta producción argentina es la Idea. La Idea, con perdón, es la rehostia. Va de un periodista, Arcibel Alegría, que es encarcelado por un error de maquetación en el periódico en el que trabaja: un inofensivo artículo sobre una partida de ajedrez (&quot;El Rey Negro está acorralado&quot;) aparece por equivocación al lado de una foto del dictador que rige el destino del país de Miranda.", "", usuario6, null);
		Resenias resenia204 = new Resenias("Lo primero que me llamó la atención de la película fue el reparto de actores, estando entre ellos varios de los mejores del panorama español e hispano-americano (Darío, Juan Diego, Vladimir,...).Lo segundo que me sorprendió fue el número tan pequeño de votaciones que tenía.", "", usuario21, null);
		Resenias resenia205 = new Resenias("“Medianeras” es una historia de amor aunque habla sobre todo de su ausencia, en tiempos de fobias sociales y en el marco de una sociedad progresivamente deshumanizada, tanto en su arquitectura como en su sofisticada tecnología. El problema que plantea es universal: en las macrociudades actuales todos se cruzan sin conocerse.", "", usuario21, null);
		Resenias resenia206 = new Resenias("Náufragos en un océano sin apenas islas, viven en Buenos Aires, dentro de sus respectivas cáscaras de nuez, dos jóvenes. Él, diseñador de páginas web, con poca suerte y pocas ganas de buscarla. Ella, arquitecta, metida a decoradora de escaparates por aquello de la crisis, empeñada en localizar a Wally en la ciudad.", "", usuario22, null);
		Resenias resenia207 = new Resenias("Medianeras cierra un 2011 de muy buen cine argentino. Aún cuando todavía me queda por ver varios films del producción nacional del 2011 (De caravana y Las Acacias, principalmente) ya puedo destacar varios de ellos: Fase 7, La vieja de Atrás, El Estudiante y ahora Medianeras.", "", usuario30, null);
		Resenias resenia208 = new Resenias("&quot;Buenos Aires crece descontrolada e imperfecta, una ciudad en la que se yerguen miles y miles de edificios sin ningún criterio. Al lado de uno muy alto hay uno muy bajo, al lado de uno racionalista, uno irracional. Probablemente estas irregularidades estéticas y éticas nos reflejen perfectamente.", "", usuario34, null);
		Resenias resenia209 = new Resenias("Son almas gemelas, pero no se conocen... A pesar de vivir en la misma calle y coincidir en ella y hasta en la piscina. Él ha pasado dos años encerrado en casa, haciendo todo en Internet, desde la compra hasta el sexo. Ella ha cortado recientemente una relación de cuatro años.", "", usuario24, null);
		Resenias resenia210 = new Resenias("Salí del cine con una sensación vacía, hueca, de nada, preguntándome qué quiso transmitir Trapero con la película y por qué y cómo la misma fue propuesta para el Oscar...No pongo en tela de juicio la actuación de los actores ya que la misma es realmente muy buena, a excepción del Comodoro que en el inicio de la película, cuando están brindando, dice un discurso en un tono nada convinecente y poco energético.", "", usuario2, null);
		Resenias resenia211 = new Resenias("Dicen que la mejor estrategia del diablo es hacer creer que no existe, como ocurrió con el clan Puccio y su monstruoso jefe disfrazado de cordero. Esa respetable apariencia que encierra el mal, es uno de los aspectos más interesantes de la historia que cuenta la nueva película de uno de los mejores realizadores del actual cine nacional.", "", usuario29, null);
		Resenias resenia212 = new Resenias("El film, es correcto en general. No obstante lo cual, se queda en algo muy superficial dado lo ambicioso de la historia y el momento histórico que contempla. El cine argentino ha hecho auténticas obras maestras en ese contexto histórico, con menos guión (&quot;Garaje Olimpo&quot; &quot;La historia oficial&quot;).", "", usuario23, null);
		Resenias resenia213 = new Resenias("Luego de ver las películas anteriores de Pablo Trapero se puede decir que va disminuyedo la intensidad con la que abordaba diferentes temas sangrantes de la Argentina. Aún así, en El Clan, logra llevar al cine una novela aterradora que sucedió en la década del 80 en este país.", "", usuario25, null);
		Resenias resenia214 = new Resenias("Recomendable por la crudeza de las situaciones, con contadas escenas de violencia explícita pero sin exceso de gore, lo cual la hará más o menos difícil de tragar según la susceptibilidad de cada uno.Cualquier persona con un poco de humanidad, sentirá rechazo y repudio hacia los Puccio, que realizaban secuestros extorsivos para cobrar abundantes sumas de dinero, aunque siempre ejecutaban a sus víctimas, en vez de devolverlas sanas y salvas a sus familias.", "", usuario33, null);
		Resenias resenia215 = new Resenias("¡Qué actores más maravillosos los de este &quot;Abrazo partido&quot;! Al verla a veces me acordaba del cine de Wong Kar-Wai: tenía la misma sensación de asistir a un borbotón (estilizado) de vida cotidiana, comparte el escenario de una ciudad superpoblada en la que se mueven unos personajes solitarios que arrastran sus pequeñas desdichas, muestra un mundo de pequeños comercios y cafeterías, evoca ausencias que marcan la vida de las personas (hay muchas diferencias entre el chino y Burman, claro, entre otras, el gran humor que tienen el argentino y que aquí no se muestra ninguna pasión amorosa arrasadora).", "", usuario25, null);
		Resenias resenia216 = new Resenias("El abrazo partido es una película costumbrista, en la que Burman no se aparta de su estilo, pero que aquí, a mi entender, encuentra su punto mas alto. Cuenta la búsqueda de un joven judío argentino de su identidad, en el mas completo significado de esa palabra.", "", usuario34, null);
		Resenias resenia217 = new Resenias("Una película sumamente digna.- Debo reconocer que la vi sin demasiadas expectativas, con muchas dudas... y la pasé realmente bien. Desde el comienzo tiene cosas distintas y de calidad.- Es una historia chiquita, no es para ir a ver grandes momentos, tiene toques de comedia (algunos muy buenos) y una riqueza increible en sus personajes, los cuales no se podrían lucir, sin el notable elenco que han elegido (destacan la madre -Aizemberg- e hijo -Hendler- en sus roles protagónicos).", "", usuario17, null);
		Resenias resenia218 = new Resenias("¿Qué le pasa a Daniel Burman que cada vez que veo una película suya me encuentro a un hijo huyendo de su padre y a un padre buscando a su hijo? ¿Será un tema &quot;familiar&quot; en la Argentina? Desde luego dicho esto, y salvo por ser un judío ateo, poco veo de parentesco a este pibe con Woody Allen.", "", usuario7, null);
		Resenias resenia219 = new Resenias("Empieza bastante bien con un travelling de los que te meten en la historia, pero el film va perdiendo interés poco a poco y lo mejor son eso, los movimientos de cámara que la verdad están muy bien. La película se puede dividir en la parte en la que busca ser polaco y otra parte en la que se reencuentra con su padre.", "", usuario32, null);
		Resenias resenia220 = new Resenias("A diferencia de lo que pensé, es muy divertida, fui con mis hijos de 27 y 22 años y también les gustó- escuchaba sus carcajadas en el cine- Rodrigo de la Serna está espectacular, y Oscar Martinez,  excelente. Muy argentina, en los modismos y lenguaje.", "", usuario18, null);
		Resenias resenia221 = new Resenias("Les cuento: hace una semana ví El Ciudadano Ilustre (también con Oscar Martinez como protagonista) y me encantó. Recién termino de ver Inseparables, y la verdad es que no tiene ni punto de comparación. Nunca me imaginé que éste hombre fuera a hacer una americanada así (aunque sea una remake de cine francés), tan obvia, liviana, previsible y cursi.", "", usuario16, null);
		Resenias resenia222 = new Resenias("Remake argentina de la película del 2011 llamada AMIGOS INTOCABLES producción que fue el más exitoso del cine francés, a su vez basado en hechos reales.La película original me encanto. Buena historia, buenos personajes, divertimiento y emoción en unas 2 horas magnificas.", "", usuario17, null);
		Resenias resenia223 = new Resenias("Cuando me enteré que se realizaría la remake de Intouchables, en version argentinizada mis sensaciones fueron buenas y más sabiendo quienes eran los actores principales.Aquel film francés me pareció muy bueno, una historia real conmovedora contada de una forma emotiva, divertida y con grandes actuaciones.", "", usuario15, null);
		Resenias resenia224 = new Resenias("En carne propia. Entre la autobiografía y la ficción, la película recrea las vivencias de un niño, hijo de militantes clandestinos en los años setenta. La mirada infantil corre el eje ideológico de un relato tan crudo como íntimo, que expone sus propias contradicciones con intenso humanismo.", "", usuario14, null);
		Resenias resenia225 = new Resenias("No creo que sea posible comentar una película de tan alto contenido social  desde un lugar objetivo y aséptico. La temática divide y dividirá aguas por largo tiempo, pero en este caso el director (con la autoridad moral  y artística que da la referencia autobiográfica) logra calar profundo en una mirada que se despega del golpe bajo y de la tentación de cualquier bajada de línea ideológica.", "", usuario25, null);
		Resenias resenia226 = new Resenias("Cuando me enteré de que Infancia Clandestina fue seleccionada para representar al país para los Oscar, de repente me entraron las ganas de verla. No lo niego, los oscar, por mas desvalorizados (por culpas propias) siguen siendo una referencia de calidad para mí.", "", usuario36, null);
		Resenias resenia227 = new Resenias("En cualquier expresión artística es necesario que haya un.. alma? plus? punto de contacto? puente? que permita la identificación de la obra con el público, que logre ese clic, ese cierre o broche final en la cabeza o en el corazón del espectador.", "", usuario33, null);
		Resenias resenia228 = new Resenias("La guerra sucia de Argentina es quizás uno de los capítulos más tristes, amargos y violentos que han empañado la historia moderna de Suramérica. Entre el inicio de 1970 y la instauración de la democracia en 1983, el país sufrió un régimen de represión ilegal, tortura, desaparición masiva de civiles y manipulación informativa entre otras formas de terrorismo de estado.", "", usuario11, null);
		Resenias resenia229 = new Resenias("Pequeña joya del cine independiente argentino. Original y divertida, es una mezcla entre el cine de Tim Burton y el de Jean-Pierre Jeunet con algunas gotas de Lynch y una estética cómic muy lograda. La película nos situa en una ciudad imaginaria, alegoría de un futuro en el que los seres humanos han perdido el don del habla y viven al son  de un magnate de la televisión, un tirano que pretende controlar sus mentes (una metafora muy actual del mundo de las grandes empresas de comunicación).", "", usuario21, null);
		Resenias resenia230 = new Resenias("En España la TV es una caja donde se emiten programas que a nadie gustan, pero que, como el 6 espirílico e hipnótico de la película argentina, nos atraen y no dejamos de verlos. Además, la presencia de la publicidad es cada vez mayor, y ya incluso los programas se convierten en escaparates al más puro estilo del teletienda.", "", usuario25, null);
		Resenias resenia231 = new Resenias("Me he quedado alucinado con esta película. Sin palabras; han sabido chupar de fuentes clásicas de la historia del cine pero le dan un toque personal que nunca llega a dar ni un ligero tono pedante.Tiene ritmo,guión de cuento, buenos actores (hasta los niños están bien), un diseño de producción deslumbrante, muy de la época de Al Capone, estética de comic, surrealismo, humor, ternura, historias dentro de otras historias, la música es espectacular, te mete dentro de la peli y no te suelta; Cada pequeño detalle es deslumbrante y no me voy a enrrollar más, simplemente voy a recomendar a la gente con rigor y una cierta cultura de cine que vayan, paguen los siete euros y disfruten porque este espectáculo no se ve muy fecuentemente.", "", usuario4, null);
		Resenias resenia232 = new Resenias("Por lo tanto la media es de 8.25, estuve pensando en ponerle un 10, pero hay un momento de la película que desconectas, por suerte son sólo unos minutos antes del desenlace y gran final; el resultado es una historia muy bien montada con unas imágenes superpuestas espléndidas, además de una fotografía y una música que complementan muy bien con la trama y las actuaciones.", "", usuario10, null);
		Resenias resenia233 = new Resenias("Cargada de referentes del mejor cine silente, LA ANTENA recoge montones de elementos de &quot;Tiempos modernos&quot; de Chaplin, de &quot;Metropolis&quot; de Fritz Lang, de Méliès, Murnau... y aderezada con unos toques más actuales a lo Jean Pierre Jeunet, nos cuenta un cuento contra las dictaduras y los totalitarismos tan presentes en nuestra historia universal reciente.", "", usuario32, null);
		Resenias resenia234 = new Resenias("Contrariamente al previsible argumento delirante que mal podrían anticipar los prejuicios ante los anuncios que promocionan esta película, desde su mismo título y las imágenes de una vaca caída del cielo, pocos guiones cierran con tanta lógica, cuidado y prolijidad como en esta película atípica y divertida pero tan racional como un mecanismo de relojería.", "", usuario23, null);
		Resenias resenia235 = new Resenias("Voy a ser breve. Ya hay otros usuarios que han hecho unas críticas más profundas que recomiendo leer.Las diferencias entre el cine argentino y el español son numerosas. Una de ellas es que el cine de aquí es incapaz de confeccionar un guión interesante y acondicionarlo a grandes actores.", "", usuario3, null);
		Resenias resenia236 = new Resenias("Roberto está harto de la sociedad en general, y tiene sus razones. Está harto de la gente que le falta al respeto, del que duda de su honradez, del  desconfiado sin razones. Cuando se encuentra con el chino y lo lleva a su casa, puede ver que él no es un pelotudo, que es como Roberto califica al resto del mundo del que está cansado, cansancio que inicialmente viene provocado por un incidente ocurrido varios años atrás.", "", usuario4, null);
		Resenias resenia237 = new Resenias("Estoy harto de leer por ahí a ciertos sabihondos que usan peyorativamente el término &quot;costumbrismo/costumbrista&quot; hasta como mala palabra. ¿Qué es exactamente el costumbrismo? ¿Mostrar al hombre común en su hábitat, con sus manías, sus modos, sus expresiones, sus altibajos es costumbrismo? ¿Si? ¿Y eso de por sí está mal, es caca, por su misma esencia costumbrista conduce a una obra a la hoguera? No lo entiendo.", "", usuario33, null);
		Resenias resenia238 = new Resenias("Un desconocido director de apellido impronunciiable nos regala una de las pequeñas joyas más brillantes del reciente cine argentino con esta entrañable fábula moral sobre el azar y la necesidad, sobre la soledad y la incomunicación del hombre contemporáneo, sobre el choque y la simbiosis de culturas en nuestra aldea global.", "", usuario35, null);
		Resenias resenia239 = new Resenias("De Marco Berger he visto su filmografía completa, hasta ahora, desde sus cortometrajes cuasi amateurs Una Última Voluntad (que remite, un poco, a Un Chant D’Amour de Jean Genet) y El Reloj hasta su enigmática y oscura Ausente habiendo pasado por sus opera magna Platero (corto incluido en el colectivo Cinco) y la indispensable Plan B.", "", usuario17, null);
		Resenias resenia240 = new Resenias("Hawaii es la tercer película del director argentino Marco Berger (Plan B, Ausente) que compite en la categoría de Largometrajes Nacionales.Una historia de amor. Así presentan esta película que trata sobre Martín y Eugenio. Martín debe pasar el verano sobreviviendo, no tiene un lugar donde quedarse y se hace algunos pesos como puede.", "", usuario28, null);
		Resenias resenia241 = new Resenias("Lo del cine gay o de temática LGTB es un poco extraño. Da la impresión de que por tener protagonistas homosexuales una película ya se ha ganado la pesada etiqueta, como si ya importara poco cuál sea su argumento o su moraleja. Claro está que cada uno se quedará con la parte que más le haya interesado, pero tal y como yo la veo &quot;HAWAII&quot; no es la historia de amor de dos treintañeros homosexuales, sino la de dos personas a las que la vida, tras un breve pero intenso encuentro durante la infancia, les ha llevado por caminos muy diferentes, hasta clases sociales distintas, para acabar reuniéndolos de nuevo.", "", usuario9, null);
		Resenias resenia242 = new Resenias("En la primera parte de la película Marco Berger consigue despertar el interés del espectador mediante la mirada de los protagonistas, inquieta, variante, como buscando algo o temiendo algo. A partir del encuentro de los dos protagonistas, las miradas cambian, ahora son de interés personal y hasta de análisis físico, cada uno por el cuerpo del otro.", "", usuario14, null);
		Resenias resenia243 = new Resenias("Una de las mejores películas que he visto sobre el deseo, la búsqueda y el encuentro...  Refleja cada una de las dudas, miedos y emociones que se siente ante lo prohibido...  Lo que te invade sin que consigas evitarlo y a la vez lo temes.    Acertada elección de actores, dirección sensible, puesta en escena sencilla pero profundamente eficaz.", "", usuario19, null);
		Resenias resenia244 = new Resenias("El Zapa es un pobre cerrajero que se ve implicado en un robo. En el pueblo todos le conocen y saben que no es mal chico, por lo que todo se arregla para que viaje a Buenos Aires con una recomendación para incorporarse al cuerpo de la Bonaerense.El Zapa se va dando cuenta, poco a poco, de que la policía se mueve corruptamente por los bajos fondos.", "", usuario25, null);
		Resenias resenia245 = new Resenias("Pablo Trapero nos muestra una realidad cruda, sin edición y sin ornamentos, de una institución tan cuestionada en la Argentina como lo es la Policía Bonaerense, enmarcando las historias personales en un país en plena crisis económica. Lejos están en esta película, los irreales sueños primermundistas de la Argentina de los 90´.", "", usuario2, null);
		Resenias resenia246 = new Resenias("Coproducción argentino-chilena que cuenta la historia de un hombre que por circunstancias ajenas a él se verá en la necesidad de dedicarse a ser policía en la capital argentina.Posee una dirección artística mediocre, con pésimas actuaciones de los protagonistas principales y aún peores de los secundarios (a la madre de Zapa sólo le falta mirar a la cámara y mandar saludos).", "", usuario5, null);
		Resenias resenia247 = new Resenias("Más que &quot;Trapero&quot; este hombre podría ser &quot;modisto de Alta Costura&quot;,  posiblemente sea la película argentina de los últimos años que más poso deja tras verla. Escenas memorables y sutilmente inolvidables.Magnífico Trapero.", "", usuario4, null);
		Resenias resenia248 = new Resenias("Esta película quizás no tenga el super-argumento, pero nos demuestra lo más profundo de la realidad de la Policia Bonaerense: corrupción, prostitución, oficiales excedidos de edad que entran por los &quot;amiguismos&quot;, y demás cosas. Sin dudas el protagonista es un inutil, que lo pasan por arriba (por decirlo en criollo), unas 2 veces en la película.", "", usuario31, null);
		Resenias resenia249 = new Resenias("Escondido cine  argentino, que  al igual que decenas de películas  que no llegan a nuestras carteleras, no deja de ser un  cine interesante, sea cual fuere su procedencia. Su trasfondo es el del abandono,  el de la soledad y la muerte; una solución de búsqueda que  acompaña al protagonista y a todo al que la ve, que trasluce el ámbito del cine independiente para hacerse aún más desgraciadamente olvidado.", "", usuario35, null);
		Resenias resenia250 = new Resenias("En otra esfera,  más allá de lo que signifique &quot;cine de autor&quot;, hay cineastas que se rigen por sus propios códigos, fuera de su época o nacionalidad; a costa de quedar recluidos en ámbitos bastante reducidos o  de ser ignorados u olvidados momentáneamente, durísimamente criticados o tal vez exageradamente exaltados (castigo, en cierta medida, justo).", "", usuario36, null);
		Resenias resenia251 = new Resenias("Cine antropológico pero no autocéntrico (y por ahí el aficionado no encontrará punto de apoyo en una personalidad o una empatía motor del metraje); aquí el protagonista no se presenta en el centro de una ficción construida por y para él (clásico sujeto volitivo de introducción-nudo-desenlace) sino que el contexto emerge estructuralista como suma de elementos sin retórica del “yo”.", "", usuario23, null);
		Resenias resenia252 = new Resenias("Segundo intento, segunda parte, continuación con intermedio o vayan ustedes a saber. Lo cierto es que esta vez, arrancamos (de nuevo) con un intenso plano-secuencia de los momentos anteriores al asesinato. Sirve este inicio como prolegómeno, como resumen y también, aunque no se vea, como conclusión.", "", usuario27, null);
		Resenias resenia253 = new Resenias("Existen grandes películas, que se construyen con diálogos ingeniosos, bien elaborados, que son del disfrute para los amantes del buen cine, pero también existen películas en donde los diálogos son practicamente inexistentes, en el cual el uso de la cámara es importante, el cine es un arte y la cámara es el instrumento, la cámara nos habla nos muestra, sin necesidad de la palabra, tan solo que con el movimiento de esta, siendo grandes representantes de este cine Andrei Tarkovsky, Bresson y más contemporáneo Bela Tarr, pero latinoamerica también tiene su representante con Lisandro Alonso.", "", usuario34, null);
		Resenias resenia254 = new Resenias("&quot;Sin retorno&quot; es un film muy profesional en su solidez técnica, formal e interpretativa y una brillante carta de presentación de la ópera prima de Miguel Cohan, producido por los responsables de &quot;El Secreto de sus Ojos&quot; y &quot;El corredor nocturno&quot;, aunque no se parece a ninguna de las dos.", "", usuario1, null);
		Resenias resenia255 = new Resenias("Supongo que Miguel Cohan sabrá que hace cincuenta y siete años, un gran director, de nombre Juan Antonio Bardem, contó una historia muy parecida a la suya, entre otras cosas porque además de autos y bicicletas aparecen clases humildes, burgueses, ocultaciones, injusticias y sentido de culpa.", "", usuario32, null);
		Resenias resenia256 = new Resenias("Sorprendente thriller dramático argentino en donde las cosas se han realizado con verdadera pericia, esto sin desmerecer nuestro cine pero aquí la eficacia ha alcanzado niveles como sólo veo en contadas pelis de nuestro país. Desde luego, el título es irónico, pero vamos a la peli.", "", usuario11, null);
		Resenias resenia257 = new Resenias("Muchos quedamos sorprendidos al ver el palmarés de la pasada SEMINCI, en la que se alzaron con la Espiga de Oro ex aequo 'Copia certificada', de Abbas Kiarostami y 'Sin retorno', de Miguel Cohan. La primera es para el que esto escribe la mejor película de 2010, por lo que el hueco en lo más alto lo tenía de sobra merecido.", "", usuario23, null);
		Resenias resenia258 = new Resenias("Dicen algunos que uno no puede fiarse de nadie. Y menos, de los desconocidos. Hace unos días, sin embargo, recibí a través de esta misma página un mensaje privado de un usuari@ a quien no conocía en absoluto cuyo sobrio y escueto texto me conminaba a ver un par de pelis.", "", usuario3, null);
		Resenias resenia259 = new Resenias("Mejor, incluso, que &quot;Una historia verdadera&quot;. De hecho el argumento es similar, aunque la dirección e interpretaciones son muy diferentes, mucho menos pretenciosas.Estoy de acuerdo con la mayoría de las críticas precedentes.Metamos en una caravana a una abuela empeñada en ejercer su papel de matriarca y que va a su bola cuando le interesa, a tres adolescentes con las hormonas sexuales por las nubes, a un niño más travieso que Bart Simpson, a dos matrimonios hastiados y a una joven madre maltratada con su bebé; el resultado no puede ser otro: un circo ambulante, con la comicidad y dramatismo inherentes.", "", usuario7, null);
		Resenias resenia260 = new Resenias("Trapero tiene un estilo que me gusta mucho. Su cine es tan realista, tan sutil, que al principio parece que nada va a ocurrir, pero inmediatamente te sientes muy cercano a sus personajes, a sus conflictos y esa mirada penetrante e irónica que posee va construyendo una historia, varias historias, que te arrastran, que te llevan.", "", usuario0, null);
		Resenias resenia261 = new Resenias("Una road movie por naturaleza, argentina a más nos poder por su alto contenido realista e intimista. Brinda una radiografía, o más bien una tomografía, de los pormenores que aquejan el día a día a una familia tipo.Un viaje hacia el norte del país para asistir a un casamiento será la excusa ideal para que Trapero nos describa con mucha agudeza y naturalismo las miserias y los pesares propios del ser humano, pero con las improntas propia de la realidad socioeconómica de la Argentina más popular y folclórica.", "", usuario6, null);
		Resenias resenia262 = new Resenias("Es posible que los creadores de &quot;Pequeña Miss Sunshine&quot; vieran &quot;Familia rodante&quot;, ya que es en esencia la misma idea. Una famila que viaja en una carabana durante muchos quilómetros para que un miembro de la famila cumpla un sueño o deseo.", "", usuario13, null);
		Resenias resenia263 = new Resenias("Presenta un buen entramado de relaciones principalmente de dos a dos (en especial la de los dos cuñados). Aceptables y coherentes algunos personajes (el gordo conductor, por ejemplo); aunque menos logrados y ni siquiera mínimamente explicados otros (el novio de la moto).", "", usuario17, null);
		Resenias resenia264 = new Resenias("Habitar la piel de otro es una experiencia común para los artistas y particularmente para los imitadores, aunque en este último caso están más atados a un personaje que a veces puede devorarlos y alejarlos de su propia realidad. Esta situación, llevada al extremo, es la que plantea la historia de Carlos Gutiérrez, quien de día trabaja como obrero en una ruidosa fábrica de electrodomésticos y de noche imita a Elvis Presley en fiestas familiares, bares y bingos del conurbano porteño.", "", usuario32, null);
		Resenias resenia265 = new Resenias("El último Elvis logra llevar en andas al ángel de los perdedores, ese qué viene de los callejones, donde solo campeonan los peores; esos callejones donde nuestros sueños son solo nuestros y las luces de un escenario (sin espectadores) iluminan solo nuestras sombras.", "", usuario3, null);
		Resenias resenia266 = new Resenias("No hay lugar para la ampulosidad en El último Elvis; ni para la joda ni para la caricaturización. Sobria como pocas, justamente por tratar de un  tema como el que trata, lo que sorprende es la seriedad de la propuesta y el como desarrollarla apenas teniendo en cuenta el devenir psicológico del personaje principal.", "", usuario20, null);
		Resenias resenia267 = new Resenias("Historia pausada, intimista, con una camara omnipresente que sigue a nuestro ¿ídolo? en cada momento vital. La historia de un hombre que se transforma en el único y ¿legítimo? continuador de Elvis Presley...o así lo entiende él.", "", usuario37, null);
		Resenias resenia268 = new Resenias("Película intrigante, de esas con las que piensas una vez salido del cine y meses después. Una reflexión perfecta entre la obsesión y la realidad de un auténtico fan. Merece la pena verla, sin duda una de las mejores películas que pueden salir en verano.", "", usuario11, null);
		Resenias resenia269 = new Resenias("Una película a la que me acerqué sin saber nada de ella, que cautiva desde el inicio gracias a la excelente química de la pareja protagonista. Sin saber muy bien por qué su historia de amor te engancha, quizá muchos puedan sentirse identificados con ese amor que nunca cuajó, pero que no se olvida con los años.", "", usuario21, null);
		Resenias resenia270 = new Resenias("Esta película cuenta una bonita historia de amor, encuentros y desencuentros con la historia coétanea de Argentina de fondo. A veces tiene bajones, algunas lagunas narrativas, pero en su conjunto esta película de curioso y bonito título está llevada con sensibilidad y dignidad.", "", usuario32, null);
		Resenias resenia271 = new Resenias("Para decir algo sobre &quot;Nueces para el amor&quot;, es imprescindible darle una definición; en ese sentido considero esta película como la historia de amor más grande del cine hispanoamericano. Su historia, sus actuaciones, su musicalización, su lenguaje narrativo, y todo los demás elementos cinematográficos forman un conjunto sui generis en la historia del cine.", "", usuario23, null);
		Resenias resenia272 = new Resenias("Entretenida y romántica, una trama clásica de historia de amor a lo largo de los años, con el aliciente de unos diálogos excelentes. Creo que es innecesaria la actuación de Nicolás Pauls, se parece tanto a su hermano que con un poco más de pelo el papel lo podía haber hecho Gastón sin problema.", "", usuario11, null);
		Resenias resenia273 = new Resenias("Sólida y completa coproducción hispanoargentina que une muy bien la soltura, animosidad y capacidad de transmitir sentimientos del cine argentino, con la templanza y equilibrio que le da una producción de cabeza clara detrás.&quot;Nueces para el amor&quot; es la triste, díficil, hermosa y común historia de amor entre Marcelo y Alicia, a través de los años y con ella del repaso histórico de acontecimientos: la dictadura argentina, la guerra de las Malvinas, el Mundial del 82, Maradona, etc.", "", usuario3, null);
		Resenias resenia274 = new Resenias("La vida es ese gran camino regado con momentos dulces y amargos, de sonrisas y llantos, de lágrimas de amor y de dolor, de flores y espinas, de miradas compartidas y caminares solitarios...  El destino hace que Martín y Mabel se conozcan, ese destino caprichoso que no controlamos, ese guiño que el futuro nos brinda en forma de aliento inesperado.", "", usuario0, null);
		Resenias resenia275 = new Resenias("Hace más de veinte años que Eliseo Subiela cuenta variaciones de una historia parecida. Si algo lo distingue como cineasta es la fidelidad a   sus ideas, a su mundo personal que tiene una estética cinematográfica  reconocible, con adeptos y detractores.", "", usuario27, null);
		Resenias resenia276 = new Resenias("Me gustó. Es una historia de amor con enseñanza, que nos muestra los valores fundamentales del ser humano: amor desinteresado, lealtad en los malos momentos, generosidad, inocencia, confianza en uno mismo, piedad, etc.Mabel y Martín encarnan muy bien estos valores y nos hacen partícipes de su ternura.", "", usuario12, null);
		Resenias resenia277 = new Resenias("Cuando alguien está empeñado en contar algo para que llegue al gran público, tiene que saber el grado de sinceridad de sí mismo quiere que impregne en su obra. La necesidad de hacer una exposición no comercial de una idea y que llegue al mayor número de personas posibles, es arto difícil.", "", usuario32, null);
		Resenias resenia278 = new Resenias("Es un film que trata de hacer pensar sobre la vida sin caer en el didactismo, por lo cual, los dos protagonistas, si son ejemplo, lo son con sus simples actos, que son de libertad y de amor: son personas atípicas precisamente porque hacen uso de tal libertad, la que todos tenemos y quizás no usamos.", "", usuario10, null);
		Resenias resenia279 = new Resenias("Pelicula muy en la línea de Historias Mínimas, (es prácticamente un calco muy bien hecho). Se nos muestra la realidad de un país, de un amplio sector de la sociedad argentina que permanece agarrada a  unos sueños, a unos ideales que permanecen muy arraigados.", "", usuario5, null);
		Resenias resenia280 = new Resenias("“El camino de San Diego” (2006), merecidísimo Gran Premio del Jurado en el Festival de San Sebastián, es el quinto largometraje del argentino Carlos Sorin. Como en la mayor parte de sus trabajos anteriores -”Eterna sonrisa en New Jersey” (1989), “Historias mínimas” (2002), “Bombón, el perro” (2004).", "", usuario13, null);
		Resenias resenia281 = new Resenias("Que es el Diego para parte del pueblo argentino. Para esa parte del pueblo separado por la línea de la General Paz del Buenos Aires cosmopolita (aunque también ahí tiene sus fans, y muchos), y que define a La Otra, a la Otra Argentina que nunca ha podido demostrarse a si misma que El Dorado existía.", "", usuario14, null);
		Resenias resenia282 = new Resenias("A modo de falso documental, se nos presenta a Tati Benitez, un joven animado y jovial, fanático de Maradona. Su vida da un vuelco cuando se queda sin empleo y, casi al mismo tiempo, su ídolo máximo es ingresado en una clínica por un problema cardíaco.", "", usuario12, null);
		Resenias resenia283 = new Resenias("Carlos Sorin vuelve a convencer en esta reciente película que sigue el esquema de una road movie, como también ocurría en “Bombón, el perro”. Y vuelve a utilizar un personaje lleno de dignidad que a pesar de su pobreza disfruta de las cosas de la vida.", "", usuario7, null);
		Resenias resenia284 = new Resenias("Tulio y Susana (Leandro Castello y Mercedes Scápola), un hombre de edad incierta (¿envejecido?), deteriorado por su circunstancia, y su sobrina llegan a Buenos Aires desde un pueblo del interior. Acaban de ser empujados del rancho en el que vivían, rodeados de gallinas y chivos.", "", usuario32, null);
		Resenias resenia285 = new Resenias("Es interesante encontrarse con un película como esta, que en momentos nos lleva a la reflexión; hacía rato que no me reía con los personajes muy bien elaborados, (tal vez tulio tendría que estar mas envejecido), la fotografía excelente. Por vivir en un pueblo bastante similar a lo que puede se Nogolí, me puedo identificar con partes de la película que son tristemente ciertas.", "", usuario29, null);
		Resenias resenia286 = new Resenias("Maravillosa película, destaca en todos los rubros, guion, actuación, direccion, fotografía y música. Es un compendio de como lograr una pelicular inolvidable. Quizá perdida en le maremágnum de estrenos no tiene el lugar que se merece, muy cercano a  &quot; Esperando la carroza&quot;, pero con mayores dosis de poesía.", "", usuario14, null);
		Resenias resenia287 = new Resenias("Un lujo del timming dialogal, de la fuerza y EXPRESION de cada palabra, de cada frase del guión, puestas ahí, sin que sobre ni falte absolutamente nada. CHAPEAU por la expresividad de cada uno de los 3 protagonistas principales.; Clara con su actuación: MEMORABLE.", "", usuario27, null);
		Resenias resenia288 = new Resenias("De  que se trata:Tulio y su sobrina Susana, son desalojados del rancho donde viven en el campo. Van a vivir a la ciudad, al departamento de Clara, hermana  de Tulio.Allí chocaran la precariedad  y limitaciones de Tulio y Susana con la sofisticación y buen vivir de Clara .", "", usuario25, null);
		Resenias resenia289 = new Resenias("Cuando alguien está contando realmente algo, no importa si de vez en cuando se trabuca y tarda un poco en encontrar la expresión adecuada; no importa si ocurre por el afán de transmitir ideas y sentimientos, y se hace auténticamente, moviendo talento.", "", usuario6, null);
		Resenias resenia290 = new Resenias("Ejemplo de cómo hacer cine para adolescentes sin renunciar a otro tipo de público. Han reflejando la cotidianeidad (exagerándola en algunos momentos) sin renunciar al humor. Algunos directores podrían tomar nota (léanse Clark, Winterbottom...)Lo malo es que también llega a utilizar la pseudo-poesía y el intimismo más banal, lastrando el conjunto.", "", usuario3, null);
		Resenias resenia291 = new Resenias("Interesante film dirigido por musa que es un buen director y que además se acompaña siempre de excelentes libretos. En esta ocasión realiza una comedia dramática interpretada por Mariano Martínez (con su apoyo fue estrenada esta peli ya que en ese momento estaba pasando un buen momento en la TV), me pareció una peli que llama la atención y no pasa desapercibida y que tiene momentos muy buenos e interesantes ya que no es tan típica como las demás films románticos.", "", usuario23, null);
		Resenias resenia292 = new Resenias("Pese a no ser una mala película, considero que es demasiado lenta en el desarrollo de la trama y en su realiación para tratarse de una comedia con el único objetivo de entretener. Algunas interpretaciones son muy flojitas y la historia no consigue emocionar, pese a los intentos ñoños del autor y el guionista con escenas pasteleras que, incluso, no vienen a cuento.", "", usuario4, null);
		Resenias resenia293 = new Resenias("Fernando Musa sí sabe y contesta a la tendencia que asola a las comedia juveniles, género característico por atrofiar cualquier dechado de seriedad, muchas veces justificado por tónica brindada a este tipo de cintas. La sencillez del argumento en este caso, recorre las preocupaciones de varios sujetos que se toman la vida entre cigarrillos y chacota sin tomar en cuenta el fondo de sus decisiones y como les afectan a terceros.", "", usuario34, null);
		Resenias resenia294 = new Resenias("http://filmicas.comEn la Buenos Aires de los 70s, Francisco Sanctis desayuna con su familia, camina al trabajo, intenta conseguir un ascenso, termina su día laboral y regresa a casa. Podría haber sido un día rutinario, pero desde el comienzo de &quot;La larga noche de Francisco Sanctis&quot; sentimos que hay algo podrido en alguna parte y que es cuestión de esperar a que se destape.", "", usuario6, null);
		Resenias resenia295 = new Resenias("&quot;XXY&quot; no es precisamente una película que se dedica a explotar desde el lado morboso o sensacionalista el tema de la intersexualidad. El hermafroditismo de la joven protagonista que compone Inés Efron es el disparador para reflexionar sobre algo que está detrás y es más profundo: la libertad de elección.", "", usuario23, null);
		Resenias resenia296 = new Resenias("—¡Nos fuimos de Buenos Aires para alejarnos de cierta clase de gente, y ahora los tenemos sentados a nuestra mesa!Kraken, emigrado con mujer e hija a un pueblo costero uruguayo, lamenta la actitud de unos invitados: una compañera de infancia de la mujer, su marido cirujano y el hijo por éste despreciado al considerarlo poco hombre.", "", usuario6, null);
		Resenias resenia297 = new Resenias("Pareciera exagerado el título de la crítica, pero en realidad no lo es tanto ya que en pleno siglo XXI las personas con alguna diferencia sea cual fuere siguen siendo agredidas y sobajadas por algo fuera de control, donde la naturaleza asigna y el hombre “corrige” sin permitir el poder de elección de quien vive esa alteración en cromosomas.", "", usuario27, null);
		Resenias resenia298 = new Resenias("Este drama de un ser humano que padece el dolor de navegar entre dos aguas pisando ambas y ninguna, el drama de una familia que se enfrenta a una diferencia que la sociedad señala con crueldad (como ocurre con cualquier aspecto que se salga de la &quot;normalidad&quot;), me ha llegado muy adentro.", "", usuario12, null);
		Resenias resenia299 = new Resenias("Era esta película de Lucía Puenzo una historia que no me atrajo en su estreno. A pesar de los premios, del Goya y las críticas favorables que leía no llegaba a despertar en mí demasiada curiosidad. Y eso que soy hombre curioso. Fue por tanto, una agradable sorpresa descubrir este admirable y provechoso trabajo de Puenzo donde sabe narrar una historia a la vieja usanza: sugiriendo, no mostrando.", "", usuario20, null);
		Resenias resenia300 = new Resenias("Bella recreación fílmica del poema gauchesco homónimo, se basa en la primera parte de la obra de José Hernández, Martín Fierro, un gaucho privado de su libertad para ser llevado a la frontera a luchar contra los indios. En formato de dibujos animados, creados por el gran Roberto Fontanarrosa, quien le dio color a esta historia.", "", usuario12, null);
		Resenias resenia301 = new Resenias("Versión del Martín Fierro en animación, si bien matizada para un público de menor edad, no se toma demasiadas libertades poéticas y representa fielmente el poema de José Hernandez. Con dibujos dirigidos por Fontanarrosa, esta trabajada de una manera muy interesante la imagen.", "", usuario33, null);
		Resenias resenia302 = new Resenias("Montada sobre los dibujos del famoso autor gráfico y escritor Roberto Fontanarrosa, la obra se inspira en los célebres versos del poema &quot;Martin Fierro&quot;, de la pluma de Jose Hernández, considerado por algunos el mayor exponente de la literatura gauchesca y argentina, en general, que convocó, incluso, la admiración de Borges.", "", usuario37, null);
		Resenias resenia303 = new Resenias("La película se inicia con inquietantes cifras sobre los miles de muertos y heridos por accidentes de tránsito en la Argentina (un promedio de veintidós víctimas fatales por día). Alrededor de estas estadísticas se maneja el dinero de indemnizaciones, gastos médicos y legales que genera un mercado donde se mueven muchas aves de rapiña con diferentes ganancias de acuerdo con su poder.", "", usuario28, null);
		Resenias resenia304 = new Resenias("Carancho es una película con pulso, con rabia, de esas que te mantienen pegado a la pantalla casi sin pestañear, tan urbana y con tanto nervio como cualquiera de algún gran director del momento. Darín, como siempre, magistral, esta vez acompañado de una chica que, además de ser la mujer del director, tampoco desentona en su papel de médico del servicio de emergencias.", "", usuario7, null);
		Resenias resenia305 = new Resenias("No es una película que maneje grandes conceptos, ésa no es su intención; su objetivo es contar una historia con un estilo sencillo, funcional y fluído que cede el protagonismo a quien debe tenerlo: el actor. El uso de la cámara es digno de los mejores directores: todas escenas se resuelven con planos fijos y planos-escena cortos que recuerdan a Kieslowski o a Lucrecia Martel.", "", usuario21, null);
		Resenias resenia306 = new Resenias("Carancho es un policial oscuro con una historia de amor en el medio. Debe su nombre a un ave rapaz que anda merodeando, atento para cazar a su víctima. Eso es lo que hace el personaje de Ricardo Darín (Sosa), un abogado oportunista devenido a menos, sin matrícula que merodea los hospitales en búsqueda de clientes para “ayudarlos”.", "", usuario4, null);
		Resenias resenia307 = new Resenias("Los accidentes de tráfico se sitúan entre las principales causas mundiales de muertes masivas, imagino que no muy por detrás de las guerras, la pobreza extrema, las hambrunas, el terrorismo, las enfermedades y las catástrofes naturales. La carretera es escenario de innumerables tragedias anuales.", "", usuario32, null);
		Resenias resenia308 = new Resenias("Muy bella película, que nos acerca al laberíntico mundo del cambio de las edades y  más concretamente sobre lo difícil que puede llegar a ser el abandono de la infancia, y a veces, entrar en la adolescencia. Cambios en lo que no sólo asumes problemas derivaos de cambalaches fisiológicos naturales, sino que también te hacer portador de un sinfín de problemas  nuevos y desconocidos –o antes triviales-, que a veces, serán compañeros fieles de por vida.", "", usuario1, null);
		Resenias resenia309 = new Resenias("Ayer por la noche hacía mucho frío. Afortunadamente, &quot;Versión Española&quot; emitía la película &quot;El último verano de la boyita&quot;, de la directora argentina Julia Solomonoff.Gracias a eso, me teletransporté a la Argentina más calurosa y me olvidé del frío.", "", usuario22, null);
		Resenias resenia310 = new Resenias("Tarde o temprano debemos abandonar la Boyita, casa rodante que hace la suerte de un enorme útero materno que poco a poco se va abandonando. El tono que utiliza Solomonoff es el justo y correcto, contra comercial y contra convencional: de allí se desprende esa sensación de intensa quietud que transpira la cinta.", "", usuario36, null);
		Resenias resenia311 = new Resenias("&quot;El último verano de la boyita&quot; es una pequeña joya del reciente cine argentino, sobre el tortuoso paso hacia la adolescencia y el despertar sexual, a través de una historia de amistad diferente y rodada con extremada sensibilidad por Julia Solomonoff (&quot;Hermanas&quot;), con una pareja de niños protagonistas que otorga gran credibilidad a lo que se nos cuenta.", "", usuario5, null);
		Resenias resenia312 = new Resenias("Sensible, lo cual no quiere decir aburrido, largometraje argentino, donde -escapándose en adoptar líneas académicas ni mucho menos adornadas-, se cuentan los días decisivos para un adolescente y una amiga, una niña que aprende, a través de su amigo, los secretos de la adolescencia, bajo una sorpresa de guión que no estorba el cuidado cuento que trata.", "", usuario3, null);
		Resenias resenia313 = new Resenias("Filmación de un día de naturaleza pampera y de naturaleza humana, ambas en simbiosis. Lisandro Alonso es un maestro en filmar la soledad, el comportamiento, el ir y venir de seres humanos solitarios; así lo ha dejado patente en varias de sus obras.", "", usuario4, null);
		Resenias resenia314 = new Resenias("¿Es realmente un &quot;drama&quot; una película que insiste los 73 minutos en presentarnos a un personaje -un personaje que en realidad es una persona- rodeado de árboles, trabajando, cocinando, fumando, durmiendo? ¿Se puede hablar de una película, tal como la concebimos, como nos hicieron creer que era una película cuando nos enfrentamos ante La libertad? ¿Dónde está el drama? ¿Por qué el director Lisandro Alonso nos titula &quot;La libertad&quot; a un film que, de hecho, se trata de una esclavitud, de un trabajador, de un asalariado, de alguien corriente e invisible? ¿La libertad no será aquello que está ausente? ¿Aquello que no conforma el universo de Misael? ¿Misael Saavedra, que hace de sí mismo, actúa o no actúa? ¿Podría ser La libertad un film de 24hs, teniendo en cuenta que narra la vida de un hachero pampeano en un día de su vida? ¿Por qué Alonso, corta, edita, sugiere algunos planos y no otros, si en definitiva es un día en la vida de? ¿Nos estará diciendo Alonso, sin decírnoslo, que no hay nada para decir? ¿Hasta qué punto la ambiguedad entre ficción y no ficción, documental y no documental funciona? ¿Por qué tanto en &quot;La libertad&quot; como en &quot;Los muertos&quot;, su segunda película, se matan animales? ¿Qué representa esa muerte? ¿A quién se está matando en realidad? ¿Y por qué será que me gusta tanto tanto el cine de Lisandro Alonso?", "", usuario14, null);
		Resenias resenia315 = new Resenias("Frédéric Back realizó un cortometraje donde narraba como un humilde pastor de ovejas se dedica a recoger bellotas, para luego plantarlas en una tierra yerma, y convertir con el paso del tiempo un desolado valle en un hermoso bosque. Casi quince años después, la cámara de Alonso regresa a esas tierras y graba un día en la vida de  Misael, un humilde pastor del tiempo que se dedica a cortar los árboles y venderlos para su sustento.", "", usuario3, null);
		Resenias resenia316 = new Resenias("Si nos atenemos a la definición de Tarkovski -esculpir en el tiempo- &quot;La Libertad&quot; es cine en estado puro. Una película completamente ajena al teatro y a la literatura -y a otras artes- en la que la realidad por sí misma se revela como fuente de conflicto o de aquello que nos incumbe como seres humanos.", "", usuario17, null);
		Resenias resenia317 = new Resenias("En Las Palmas de G.C. algunos han tenido la oportunidad y otros la desgracia de poder visionar en los Multicines Monopol esta cinta argentina. Y comento esto porque entre otras cosas me ha hecho mucha gracia al término de la misma, la diversidad de opiniones sobre la obra, en especial la de un individuo que manifestaba su desencanto, ridiculez y tomadura de pelo hacia el espectador, el hombre se encontraba tremendamente indignado con el resultado de la misma.", "", usuario13, null);
		Resenias resenia318 = new Resenias("Cautiva, la película argentina, es simplemente brillante, una historia dura contada con profundidad, crudeza, y a la vez ternura. La historia de la apropiación de menores durante la dictadura militar en Argentina ha tenido diferentes relatos, ya sea en forma documental como en otros géneros.", "", usuario9, null);
		Resenias resenia319 = new Resenias("Película necesaria la de Gastón Birabén que ahonda en el destino de los hijos de los desaparecidos, y que narra el descubrimiento de la verdad desde la óptica de la adolescente protagonista (estupenda Bárbara Lombardo). El mayor mérito de la película es el punto de vista, que se centra en las víctimas contemporáneas de aquella masacre: esos jóvenes de hoy día a los que se les arrebató la verdad para crearles una vida ficticia.", "", usuario25, null);
		Resenias resenia320 = new Resenias("Realmente no es una mala película... Entonces ¿Por qué esa nota tan baja?  Porque este tipo de trabajos son tan predecibles que no mantienen la tensión dramática, se sustentan únicamente sobre la emocional, de ella se nutren y avanzan.   Cuando veo alguna película, serie, corto, me interesa su desarrollo, su planteamiento y.", "", usuario28, null);
		Resenias resenia321 = new Resenias("Es una historia conmovedora acerca de la “Apropiación Ilegal de Menores”, cuando los padres se hallaban ilegalmente detenidos, durante la dictadura militar que azotó la Argentina.Cristina, una joven que descubre a los 15 años que es hija de una pareja de arquitectos detenidos y desaparecidos durante la dictadura militar que azotó la Argentina entre 1976 y 1983.", "", usuario37, null);
		Resenias resenia322 = new Resenias("No sé por qué hablar siempre sólo de Hitler cuando EEUU -Kissinger- hizo cosas peores que Mengele. Qué si no es eliminar una generación tirando a muchos de ellos desde aviones al mar, -los vuelos de la muerte-  y dar los bebés a parejas afines a la dictadura.", "", usuario32, null);
		Resenias resenia323 = new Resenias("Sin duda una película para cinéfilos. Para el que no busque ni acción ni sustos, y que si disfrute de tramas inteligentes. Después de la original y primera película “Nueve Reinas”, este director y guionista nos trae una historia mucho más relajada, más oscura y con un ritmo bastante más lento, además de mucho más profunda e inteligente; una trama que va creciendo en intensidad y suspense conforme van pasando los minutos; te mete dentro de la mente del personaje principal (superior interpretación de Ricardo Darín) y no te deja tranquilo en ningún momento.", "", usuario12, null);
		Resenias resenia324 = new Resenias("&quot;El aura&quot; es una película de atmósferas y personajes antes que de género, aunque es  evidente el manejo de los códigos cinematográficos y el brillante oficio para combinar todas las piezas. La original historia tiene como protagonista a un epiléptico, introvertido y parco, con el oficio nada frecuente de embalsamar animales.", "", usuario1, null);
		Resenias resenia325 = new Resenias("Película de suspense, engancha desde el primer momento. La fotografía y el clima que es capaz de generar, lo más destacable. La pareja Darín-Bielinsky repite tras &quot;Nueve Reinas&quot;.", "", usuario10, null);
		Resenias resenia326 = new Resenias("Se agradece, y mucho, poder contemplar -de vez en cuando- un thriller que no se desarrolle en un contexto urbanita y, sobre todo, que no se haya rodado en Hollywood. Se agradece muy mucho porque los aficionados al thriller empezamos a estar hasta las mismísimas pelotas de que, una y otra vez, nos la metan doblada con peliculillas tan prefabricadas que, a los cinco minutos, ya nos han saturado la mollera con un bombardeo de “deja vu” absolutamente insoportable.", "", usuario3, null);
		Resenias resenia327 = new Resenias("Quise ir a verla por varios motivos. En primer lugar, leí en esta página las críticas existentes y todas le daban buena nota, a parte de que contaba con un 8,4 de nota (escribiendo estas líneas tiene un 8,2). También influía que la dirigía Fabián Bielinsky cuya película  &quot;Nueve Reinas&quot; me pareció soberbia y además, igual que con aquella contaba con un gran actor como Ricardo Darín.", "", usuario35, null);
		Resenias resenia328 = new Resenias("La cosa dicen que es así: Gabriel Medina, el debutante director de Los Paranoicos, supo ser asistente de dirección de Damián Szifrón, realizador que pergeñó un par de éxitos de TV en Argentina luego exportados a España: Los Simuladores y Hermanos y Detectives.", "", usuario35, null);
		Resenias resenia329 = new Resenias("Los paranoicos expone un excelente desarrollo de caracteres psicológicos al servicio de una trama tan interesante como sencilla. Hendler cumple un papel más que correcto, la lejanía/imposibilidad afectiva del personaje está trazada bajo tonos humorísticos, aunque hay mucho de tragedia ahi detrás unida a una cierta melancolía, un cierto estancamiento.", "", usuario11, null);
		Resenias resenia330 = new Resenias("Entretenida película que trata sobre la rivalidad entre dos “amigos” guionistas. La verdad es que la película me ha gustado principalmente, pero luego, hay cierta parte que parece un poco cogida con pinzas… (no puedo seguir, sin destripar parte de la película, así que continúo en el spoiler).", "", usuario10, null);
		Resenias resenia331 = new Resenias("Un personaje interesantisimo el protagonizado por Hendler, Gauna, en esta peli, es lo más rescatable de la misma, un personaje lleno de miedos, de excentricidades y de contradicciones. Así vemos, como el mundo al rededor ve a este sujeto, a Gauna, como lo interpretan, como lo burlan, o tratan de entenderlo sobre todo stuart.", "", usuario19, null);
		Resenias resenia332 = new Resenias("Tenía gran ilusión en visionar esta película Argentina, ya que es un cine bastante interesante y que ha realizado grandes películas, y en los aspectos culturales tenemos características en común, y pienso que es a mi parecer recomendable que nos preocupemos por conocer su cultura, costumbres, ya que en estos momentos convivimos con una población argentina considerable y sería bueno que el hecho de que nos conozcamos no lleve a un mejor entendimiento, y como es sabido la diversidad es enriquecedora.", "", usuario11, null);
		Resenias resenia333 = new Resenias("Muchas de las críticas negativas que recibió esta pelicula cometen el error de utilizar parámetros comúnmente utilizados para evaluar películas bélicas. Si bien la guerra es el tema central, el significado pasa por otro lado. Lamentablemente, esto es algo muy claro para un argentino, tal vez también para otros latinoamericanos, pero no lo es para otro público.", "", usuario1, null);
		Resenias resenia334 = new Resenias("Desde el punto de vista puramente cinematrográfico es una película humilde, con golpes bajos por momentos innecesarios, elaborada con tesón pero con algunas fallas fílmicas grandes y notorias. Pero perdón, no puedo dejar de decir algo desde el corazón.", "", usuario15, null);
		Resenias resenia335 = new Resenias("Podría haber sido mejor si no se hubiese hecho la historia mirando con un solo ojo. Como película bélica hay que tener en cuenta que es Argentina y como tal (presupuesto y efectos especiales por medio) no llega a las alturas de ningún filme norteamericano, pero independientemente las escenas bélicas matizan un poco la película.", "", usuario25, null);
		Resenias resenia336 = new Resenias("PREMIOS:San Sebastián: Premio Especial del Jurado Premio Goya por mejor película extranjera de habla hispana==================HECHOS (por Wikipedia):Los propios ex combatientes de Malvinas han expuesto su desacuerdo con la película, que fue presentada como una historia real cuando los hechos parecen indicar que Esteban Leguizamón no fue partícipe de las acciones como las relata la obra.", "", usuario16, null);
		Resenias resenia337 = new Resenias("“Cuestión de principios” combina varias líneas narrativas que circulan por los canales de la comedia dramática. Estética y narrativamente, es una película convencionalmente clásica, que se parece a los valores que encarna su protagonista principal, un impecable Federico Luppi que apela a su no tan frecuente costado de comediante.", "", usuario28, null);
		Resenias resenia338 = new Resenias("Muy grata sopresa.El film trata temas como los principios y valores, el peso de las convicciones de las personas en el desarrollo de la vida y la diferencia generacional. El punto de inicio del film parte del conflicto entre el abuelito de la empresa, trabajador, moral y de pensamientos casi caballerescos y el joven jefe, con poder y dinero que cree poder comprar todo, incluyendo a las personas a base de talonario.", "", usuario24, null);
		Resenias resenia339 = new Resenias("La primera escena de 'Cuestión de principios', película basada en el popular cuento del escritor y dibujante argentino Roberto Fontanarrosa, muy al estilo del mítico camarote de los hermanos Marx, presagia ya cuál va a ser la pauta a seguir. En un mundo tecnológicamente hablando cada vez más desarrollado y más superpoblado, los espacios se han reducido mucho, quizás demasiado.", "", usuario26, null);
		Resenias resenia340 = new Resenias("El cine argentino vive una época excelente, no paran de llegarnos nuevos trabajos del país de Messi y Maradona y a cual de ellos más interesante. Y es que no sólo destaca este enorme país que ahora llora a su ex presidente del gobierno los jugadores de fútbol mundialmente reconocidos, sino que también cuenta el país del tango con una gran hornada de actores y actrices que interpretan de maravilla.", "", usuario21, null);
		Resenias resenia341 = new Resenias("El paso del estado literario (cuento corto) al estado fílmico (largometraje) no le quitó muchos méritos a esta agradable fábula sobre los principios y la (post)modernidad. La película se disfruta por momentos y por otros se balancea peligrosamente cerca de los abismos de aquél viejo cine popular argentino, ese que lejos de pretender ser culto, quería convocar masivamente valiéndose de clichés y actuaciones vergonzantes.", "", usuario14, null);
		Resenias resenia342 = new Resenias("Parece que algo va a pasar en cualquier momento. El dolor sostenido de la protagonista es tan fuerte como las imágenes en blanco y negro inspiradas en Bergman o en el Allen de Interiores. Ese algo que va a pasar es lo que sigue al final de la película.", "", usuario33, null);
		Resenias resenia343 = new Resenias("La película está inspirada en la figura del padre Giuseppe Mario Pantaleo (Pistoia, 1915-Buenos Aires, 1992), un sacerdote salesiano que alcanzó popularidad por su don de diagnosticar y -en ocasiones- curar por imposición de manos, padecimientos físicos incurables desde la mirada científica.", "", usuario25, null);
		Resenias resenia344 = new Resenias("Algunos pueden considerar un auténtico milagro y dignificar el Goya que recibió “Las manos” como mejor película extranjera del 2006 de habla hispana. Sería una cuestión de fe. Algo que ha olvidado el veterano director argentino, autor de la estupenda “Esperando la carroza”, al enfrentarse a la vida y milagros del Padre Mario Pantaleo.", "", usuario26, null);
		Resenias resenia345 = new Resenias("Las manos de quien escribe y adapta guiones transparentes en la Argentina de hoy están dotadas de talento y magnetismo para atraernos y contemplar las obras de este país. Es así como el trabajo de Alejandro Doria y Juan Bautista permite que conozcamos la historia de unas manos con el don de la cura, a enfermedades que la ciencia diagnostica como terminales.", "", usuario33, null);
		Resenias resenia346 = new Resenias("Siempre me han conmovido las historias sobre curas sanadores. En esta no se siguen los caminos trillados: buscar la grandilocuencia o la lágrima fácil, cuando resulta tentador y existen todas las posibilidades para hacerlo. Tampoco se exaltan los milagros de un cura infalible y ganador.", "", usuario5, null);
		Resenias resenia347 = new Resenias("Gran actuación de Marrales. La película va de menor a mayor. Lo único que he escuchado por ahí, es que la verdadera obra del padre Mario es gigantesca e imposible de resumir en una pelicula de hora y media. Nos quitamos el sombrero ante Doria. Queremos más cine de esta calidad.", "", usuario20, null);
		Resenias resenia348 = new Resenias("La leyenda dice que el ave Fenix resucita de sus propias cenizas. El ciclo interminable de la vida y la muerte. En este caso el ave es reemplazada por la mosca, que puede hundirse y ahogarse en el agua pero la ceniza la devolverá a la vida. La mosca.", "", usuario32, null);
		Resenias resenia349 = new Resenias("Ví la película &quot;La Mosca En La Ceniza&quot; y es buena pero por momentos no me atrapó mucho.El comienzo me pareció entretenido y luego atrapante pero me esperaba otra cosa mejor.La historia realista está bien contada pero se pudo haber mejorado.", "", usuario5, null);
		Resenias resenia350 = new Resenias("Estoy confundido y no sé bien qué pensar de esta película. No le creo al protagonista, no me convence, no dice dos frases interesantes o que justifiquen el lugar que progresivamente va ocupando. Mueve los hilos importantes pero no se le ve pasta de intrigante, más bien lo es en los hechos pero no en la carnadura del personaje.", "", usuario34, null);
		Resenias resenia351 = new Resenias("Interesante intento por construir una reflexión contemporánea y rioplatense sobre las características malsanas del poder, de la toxicidad visceral de la política, de la anemia de escrúpulos que preside los tejemanejes del mundo universitario, politiqueos de salón, arribistas de cloacas varias.", "", usuario7, null);
		Resenias resenia352 = new Resenias("Luego de ser co-guionista en Leonera y Carancho (ambas de Pablo Trapero), Santiago Mitre dirige, solo, su opera prima.El estudiante es un film potente, soberbio, dirigido con una solvencia (y una mirada) tan real como efectiva, un drama con formato de Thriller en el qué abunda lo documental, un film independiente.", "", usuario24, null);
		Resenias resenia353 = new Resenias("Película presentada en la Competencia Oficial del FICCI. “El Estudiante”, es una de las que me llamaron mucho la atención desde que la vi en el listado. Precisamente, resultó ganadora como Mejor Película de la Competencia Oficial del FICCI, junto con los premios al Mejor Actor y el Premios de la Crítica Internacional (FIPRESCI).", "", usuario21, null);
		Resenias resenia354 = new Resenias("Me pareció una película entretenida y recomendable, que muestra algunas cosas de la política universitaria por dentro, entre ellas algunas de las más turbias, como los acuerdos entre dirigentes, la repartija de cargos públicos, y el uso y aprovechamiento que hacen de los estudiantes para intereses personales.", "", usuario16, null);
		Resenias resenia355 = new Resenias("Cine under argentino, simple y contundente. Teniendo fresquito el recuerdo de &quot;La 21, Barracas&quot;, Vikingo se engrandece en la comparación. Es que de todo lo que La 21 adolesce, Vikingo hace su mayor mérito. Vikingo es un personaje craso, rudo, pero mucho más sensible que lo que habría de esperarse.", "", usuario34, null);
		Resenias resenia356 = new Resenias("Me fascina el cine de Lucrecia Martel. Adoro su manera de contar, de filmar, la dirección perfecta que tiene sobre sus actores (es la única directora que puede hacer actuar a un muerto) su obsesión por contar lo que parece no interesar a nadie. Sus pequeñas grandes historias de su Salta natal.", "", usuario5, null);
		Resenias resenia357 = new Resenias("Vuelta a las andadas de Lucrecia Martel, una directora con un estilo inconfundible: estupendo manejo de la cámara, buena fotografía, gran dirección de actores, personajes problemáticos, punto de vista femenino aunque otorgando bastante protagonismo a los personajes masculinos.", "", usuario19, null);
		Resenias resenia358 = new Resenias("Lucrecia Martel es una gran directora, y sus películas constituyen exquisito arte. Puro placer estético. Su cine es un cine de climas, de sensaciones. Qué maravilla que los recursos del cine y el talento de una directora puedan permitir estas composiciones.", "", usuario24, null);
		Resenias resenia359 = new Resenias("Apadrinada por los hermanos Almodóvar, la argentina Lucrecia Martel ambienta su segunda película &quot;La Niña Santa&quot; en un hotel donde se celebra un congreso de medicina y donde conviven unas adolscentes que reciben adoctrinamiento religioso.", "", usuario25, null);
		Resenias resenia360 = new Resenias("Amalia (María Alche) y Josefina (Julieta Zylberberg) son dos jóvenes adolescentes que están pasando por los típicos cambios físicos y emocionales de su edad. Josefina proviene de una familia de clase media, mientras que Amalia vive en el Hotel Termas, que es propiedad de su familia.", "", usuario21, null);
		Resenias resenia361 = new Resenias("Un novio...es una peli tramposa, de esas que se construyen desde la ironía, mucho humor local, acidez dialogal y situaciones hilarantes, algunas especialmente geniales. No obstante,  detrás de un guión muy bien armado y un montaje preciso, en la obra de Taratuto se encuentran velados sentimientos de renuncia y sacrificios muy fuertes, escenas conmovedoras en donde la cotidiana sensiblería da lugar a una intimidad reflexiva y hasta conmovedora.", "", usuario19, null);
		Resenias resenia362 = new Resenias("Si quieren que les de una buena razón para ver esta película, sólo tengo una de peso para darles.  Y tiene nombre propio: Valeria Bertuccelli. Por lo demás, esta tercera producción de Juan Taratuto es una comedia liviana, llevadera y simpática, pero que se mantiene bastante por debajo del nivel de su ópera prima &quot;No sos vos, soy yo&quot;.", "", usuario1, null);
		Resenias resenia363 = new Resenias("Te levantas un día y la persona que está a tu lado en la cama no es ya ese ser especial que te hacía soñar despierto. Te preguntas  qué ha ocurrido y sientes la necesidad de escapar pero la cotidianeidad y el miedo te lo impiden. Te escudas en mil razones para evitar lo inevitable.", "", usuario24, null);
		Resenias resenia364 = new Resenias("Empecemos por decir que efectivamente el cine argentino es obviamente  argentino, por eso es un cine especial y muy particular: Veamos, si a esta película se hiciera en Francia, sería de arte y ensayo, se recorta la base de humor, se aumenta el drama, diciendo lo mismo pero de manera más académica  y voilá tendríamos una película para el fogón de Cannes.", "", usuario3, null);
		Resenias resenia365 = new Resenias("Siempre me he preguntado porqué no queremos que nuestros amigos cambien y sin embargo, tratamos de cambiar a nuestros amantes. ¿Significa que respetamos más la personalidad de nuestros amigos? ¿O de que en realidad idealizamos a nuestros amantes y a nuestros amigos los vemos tal y como son desde un princpio?.", "", usuario25, null);
		Resenias resenia366 = new Resenias("Me ha parecido una película bastante interesante. Me ha gustado mucho lo original que ha sido el argumento y es verdad que hay veces que existen pausas muy prolongadas, pero creo que con esas pausas, el director logra un clima de complicidad con el espectador.", "", usuario10, null);
		Resenias resenia367 = new Resenias("Marco Berger logra en este largometraje lo qué otro no podría haber conseguido en un cortometraje.Plan B es una historia honesta, donde su director la construye con piezas sencillas pero sólidas, construye la historia desde su silencios, desde sus stop y sus pausa la construye desde un trabajo actoral más qué destacado de Manuel Vignau y Lucas Ferrero (a los qué la historia los toma por sorpresa pero no parecería tanto) el film se construye como una pirámide sólida desde el arranque pero tambalea cuando se esta acercando a la cima (hablo de lo argumental y no del declive del film); Berger pone el corte justo, los títulos aparecen en el preciso momento que deben aparecer, ni uno más ni uno menos.", "", usuario32, null);
		Resenias resenia368 = new Resenias("Adorable película de temática gay del cine argentino. Con personajes creíbles, sinceros, honestos. Son personajes que te enamoran. Deseas ser amigos de ellos, porque no tienen mas pretenciones que ser ellos mismos. Me encantó,  me enamore de esta película, el guión, la dirección, los actores, todos se complementan y nos ofrecen el nacimiento de una historia de amor urbano, sin pretenciones.", "", usuario20, null);
		Resenias resenia369 = new Resenias("Es cierto que abusa de las pausas pero le dan el ritmo a la película. No me pareció en absoluto larga,  todo lo contrario, me pareció diferente y muy valiente. Lo bueno es que es una historia en la que da igual la orientación sexual de los personajes, te los crees de principio a fin.", "", usuario36, null);
		Resenias resenia370 = new Resenias("El ritmo no es una novedad, las pausas tampoco, ni la ausencia de música. Pero todo contribuye a lo mismo, al tema de la película: la tensión de Pablo, el único que no juega, que se explora, que se permite vivir sin prisa ni miedo al resultado, consciente de poseer prejuicios que no le impiden nada.", "", usuario34, null);
		Resenias resenia371 = new Resenias("El binomio Burman-Hendler regresa ahora con una película de tono más gentil que &quot;El abrazo partido&quot;, ese film que muchos denominaban comedia cuando el drama le salía por los poros. &quot;Derecho de familia&quot; reincide en las relaciones familiares, en los problemas de comunicación y si en &quot;El abrazo partido&quot; no eran muy buenas esas relaciones aquí se demuestra que aún siendo buenas nos quedamos cortos.", "", usuario36, null);
		Resenias resenia372 = new Resenias("Esta no es una película de género, aunque circule entre la comedia y el drama ligero, a la manera de algunas películas de Truffaut, de quien Burman se diferencia en acentuar menos la poesía que los matices del humor en situaciones extremadamente simples.", "", usuario9, null);
		Resenias resenia373 = new Resenias("Vale, “Derecho de familia” no es la estupenda “El abrazo partido” pero Daniel Burman, esta vez más autocomplaciente, sigue (algunas veces) de cerca las premisas de su mejor película manteniendo el punto de vista masculino. Ahora las relaciones paterno-filiales son por partida doble entre el protagonista, un abogado que ha heredado la profesión por parte de su progenitor, con su padre y a la vez con su hijo, interpretado por el propio hijo del director, de apenas dos años y eje central de la historia.", "", usuario31, null);
		Resenias resenia374 = new Resenias("Más madura que El abrazo partido, menos alleniana también, inferior asimismo. Buen, muy buen Hendler, dispersa a la hora de equilibrar los distintos aspectos de la vida del protagonista: acertadísima la parte del padre, algo menos la familiar, buena la sub-historia de la facultad y sus chistes.", "", usuario1, null);
		Resenias resenia375 = new Resenias("Si, tiene un arranque bastante bueno y la relación padre-hijo tiene muchos matices, pero en general la película me pareció falta de vida, sosa y reiterativa. Por su tono tan frío me es difícil emocionarme con ella, porque ni funciona como comedia ni como drama, y si lo hace, aunque, a medias, es como análisis en torno a las relaciones de pareja, la madurez y el paso del tiempo.", "", usuario8, null);
		Resenias resenia376 = new Resenias("El asaltante parece un fragmento de otra película mayor. Todos sabemos cómo se estructura  una película tipo; ésta se divide en tres partes: presentación, nudo y desenlace. Pues imaginen una película diseccionada sobre la mesa de edición. Tomamos la presentación y la arrojamos a la basura, tomamos el desenlace y hacemos lo mismo: nos quedamos sólo y exclusivamente con el nudo.", "", usuario2, null);
		Resenias resenia377 = new Resenias("Cabe recordar, que a partir de manifiestos como el Ulises de James Joyce, el esquema ático “presentación-nudo-desenlace” ha sido despojado de su primado y puesto en paridad. Es solamente un modo del ser, no uno de sus trascendentales. De manera que, corroer una trama por sospechar que se consuma nudamente, como pulpa expuesta, sin las tapas, sin el pecho y el rabo de uso, no es más que consumar un juicio epocalmente impropio.", "", usuario10, null);
		Resenias resenia378 = new Resenias("La acción transcurre prácticamente en tiempo real. El protagonista es un ladrón de guante blanco que roba colegios privados sin disparar un sólo tiro, interpretado por Arturo Goetz, con el porte necesario para pasar desapercibido ante sus víctimas.", "", usuario12, null);
		Resenias resenia379 = new Resenias("Si uno quiere imaginar la soledad más absoluta, el desamparo y la desazón sólo tiene que mirar esta película. El director nos muestra en este film despojado, realista y contundente lo que el desarraigo y el destino puede depararle a una persona. Si a eso le sumamos un cuadro costumbrista de una ciudad extranjera pero al mismo tiempo extremadamente familiar, como es la Nueva York tan conocida por múltiples películas, aunque visitada en una forma inusual por la mirada de un argentino, obtenemos por resultado este film entrañable, oscuro, pero al mismo tiempo enormemente humano y, dentro de todo lo dramático y desolado de la historia, con un dejo de optimismo final.", "", usuario26, null);
		Resenias resenia380 = new Resenias("Es cruda. Un baño de humildad. Es lo que nos espera.David Burgos interpreta magistralmente su papel.Es darwinismo social, solo los más fuertes sobreviven y el ejemplo: &quot;Perú&quot; es el buscavidas perfecto pero.... por encima de él está la mujer, Yekaterina, con sus artes (con sus armas) lo lleva al huerto y consigue sobrevivir a su costa.", "", usuario19, null);
		Resenias resenia381 = new Resenias("El bienvenido y creciente interés de las nuevas generaciones por el conocimiento de los protagonistas que construyeron al país, ya demostrado con el auge de la novela histórica y el ensayo más desprejuiciado sobre próceres y acontecimientos autóctonos, se ha trasladado al cine, favorecido al calor de la conmemoración del bicentenario y el interés de las autoridades actuales en revisitar la historia argentina.", "", usuario19, null);
		Resenias resenia382 = new Resenias("¿Que es la Patria? Esta es una de las preguntas que le hace Esteban de Corvalan uno de los pocos veteranos que quedan de la gesta libertadora al periodista que lo entrevista con motivo del retorno de los restos del General San Martin a Buenos Aires en 1880.", "", usuario7, null);
		Resenias resenia383 = new Resenias("Confieso que he esperado esta película con mucha expectativa. Me predispuse de la mejor forma para degustarla pero finalizada la misma el paladar me quedo adormecido, como después de masticar hielo. La película no es mala, es cierto, pero prometía mucho más.", "", usuario5, null);
		Resenias resenia384 = new Resenias("A priori, se podría ubicar a este film dentro del mismo género que “Belgrano: la película” ya que en ambos casos se trata de reconstruir una parte de la historia de nuestro país pero con un enfoque basado en la personalidad del personaje principal, José de San Martín en este caso.", "", usuario0, null);
		Resenias resenia385 = new Resenias("Las películas basadas en la vida de próceres o líderes de poder cometen muchas veces el mismo error: ser formales y suntuosas. Quien haya visto varias películas históricas en los últimos tiempos podrá darme la razón. Ya no puedo recordar la diferencia entre Elizabeth, La Duquesa, Maria Antonieta, Las hermanas Bolena.", "", usuario35, null);
		Resenias resenia386 = new Resenias("El cine argentino, siempre desparejo y a veces sorprendente, está atravesando un época muy activa, seguramente favorecido por el compromiso institucional que le sirve de apoyo a lo largo de estos años. Muchos son los estrenos y otros los filmes que llegan al público editados en formatos de uso hogareño, inclusive sin haber pasado por una sala.", "", usuario18, null);
		Resenias resenia387 = new Resenias("Siempre las críticas son distantes, como si uno no se quisiera involucrarse demasiado con la película que se comenta... Yo quiero hacer todo lo contrario, quiero agradecer a su director y a sus actores por hacerme olvidar por un tiempo de los problemas cotidianos, quiero confesarles con toda sinceridad, qué gran trabajo han hecho, siéntanse muy orgullosos de esta obra que tiene un latido profundo y cercano.", "", usuario22, null);
		Resenias resenia388 = new Resenias("La idea de mixturar realidad con ficción, actualidad con historia, y jóvenes supuestamente blandos con guapos violentos, a la par de atractiva podía resultar fallida.Fantasma de Buenos Aires tiene algunos problemas a la hora de resolver guión con actuación, pero es un esfuerzo que merece ser visto y recomendado.", "", usuario8, null);
		Resenias resenia389 = new Resenias("Lo siento, pero después de ver tanto cine bueno (dentro de la propia Argentina, además) no me vale con un puñado de moralinas y cuatro escenas cómicas para decir que algo es, por lo menos, interesante. La parte inicial de la película es ramplona y está mal sujeta por el elenco joven que la interpreta, y aunque es verdad que el guión se va entonando y al final hasta consigue enternecer un poco al espectador, lo cierto es que eso no es suficiente para salvar la película.", "", usuario29, null);
		Resenias resenia390 = new Resenias("Me pareció una película bastante ocurrente para ser argentina... Me gustó mucho el lazo que se genera entre el pibe y el fantasma, quien parece ser muy rudo, pero al final se termina quebrando ante las situaciones que no supo ver y que se entero muchos años después.", "", usuario27, null);
		Resenias resenia391 = new Resenias("Este cuarto largometraje de la realizadora María Victoria Menis es una bienaventurada rareza en el cine argentino actual, no sólo porque prescinde de actores conocidos pero que igualmente demuestran un sólido oficio forjado en el teatro independiente, sino por su apuesta temática y narrativa, a contracorriente de buena parte de la producción nacional.", "", usuario34, null);
		Resenias resenia392 = new Resenias("María Cristina Menis demuestra cómo se hace un excelente cine a partir de una historia aparentemente sencilla. &quot;La cámara oscura&quot; es una película de esas que hay ver nueva vez. De manera sutil te va llevando a un reconocimiento de los valores esenciales del ser, a mirar con ojos atentos lo importante de este mundo.", "", usuario27, null);
		Resenias resenia393 = new Resenias("Película un tanto especial, de ritmo pausado y tono intimista, con muy pocos diálogos. Y aunque no es para nada aburrida, para mí el hecho de que haya tan pocos diálogos  hace que sea algo fría y distante. Me hubiera gustado saber más cosas de Gertrudis, su protagonista:  qué siente, qué desea hacer, qué está pensando, por qué no se rebela.", "", usuario1, null);
		Resenias resenia394 = new Resenias("Cuánta desilusión. La directora María Victoria Menis sabe cómo desperdiciar una buena idea y destrozarla en apenas los 20 primeros minutos del film. Realiza una película desangelada, con un guión que nunca avanza y actuaciones para el olvido; como la de Fernando Arman, que es tan mediocre en su papel que nunca llegamos a creer que sea el jefe de una familia de estancieros y más bien nos parece el hermano compinche de sus propios hijos, cosa muy improbable en la vida de campo de los inicios del siglo XX.", "", usuario9, null);
		Resenias resenia395 = new Resenias("Prefiero los dramas carcelarios en los que lo importante es el relato de la fuga o la descripción de los presos.Aquí han dado demasiada importancia a un artificioso (y artificial) montaje para intentar maquillar un guión flojo, aunque el potencial de la historia era prometedor.", "", usuario15, null);
		Resenias resenia396 = new Resenias("Mignona adaptó su propia novela, la cual narraba la fuga de 7 presos de una penitenciaría de Buenos Aires a finales de los años 20. Se rodeó para ello de un grupo estupendo de intérpretes, los cuales son capaces de transmitir con suma eficacia el caracter de sus personajes.", "", usuario22, null);
		Resenias resenia397 = new Resenias("La película es buena, las actuaciones están bien y la historia es buena y fue real. Un par de detalles erróneos en el comentario es la locación de la historia; se dice sucedió en Buenos Aires, cuando los hechos ocurrieron en el correccional penal de Punta Carretas, en la ciudad de Montevideo, Uruguay; la otra diferencia es que sólo fueron 3 los escapados, y eran todos anarquistas.", "", usuario19, null);
		Resenias resenia398 = new Resenias("A mi modesto criterio, esta película es un libro de fotografías demodé, más que un film....Resultón gasto de producción para la ambientación y tal, pero fallida historia, a la que no se le encontra nunca la razón y el sentido entre las situaciones deslabazadas.", "", usuario4, null);
		Resenias resenia399 = new Resenias("Pues a mí me ha gustado, y mucho, &quot;La fuga&quot; de Eduardo Mignogna. Libertades históricas aparte (Buenos Aires en lugar de Montevideo y siete fugados en lugar de los tres que en realidad fueron) la película es muy sólida y con magníficos giros de guión que sorprenden y hacen más atractiva la cinta.", "", usuario7, null);
		Resenias resenia400 = new Resenias("El asadito trata de unos amigos que se reúnen para comer el 30 de Diciembre de 1999. La acción transcurre en la ciudad de Rosario, Argentina. Cada uno de los personajes encarna un cierto rol muy delimitado, sin demasiada profundidad y en algunos casos de manera un tanto histriónica.", "", usuario37, null);
		Resenias resenia401 = new Resenias("Los siete amigos que vemos en este film tienen algo en común. Nacieron entre las décadas del 60/70. Llegado el día del rodaje, en 1999, ya varios pelan canas, arrugas, miradas de desencanto y un considerable camino andado por sus respectivas vidas.", "", usuario13, null);
		Resenias resenia402 = new Resenias("Cuando vi el título, leí la trama y conocí su duración me dije, tengo que ver esta película. No me defraudó, un film interesante y que ayuda a pasar el rato. Las actitudes, gestos, palabras son para mí (argentino) conocidas y por ello más de una vez graciosas.", "", usuario17, null);
		Resenias resenia403 = new Resenias("Otra mas. Y eso me pone bien. Saber que en mi país se hizo buen cine. Como en realidad por momentos se sigue haciendo. Y esta película que se trata de un simple asadito (como su título lo indica) en una terraza de Rosario se hace un viaje hermoso a las costumbres argentinas.", "", usuario29, null);
		Resenias resenia404 = new Resenias("Terminé de ver &quot;Mía&quot; con la sensación incomparable de haber asistido a un espectáculo maravilloso. Más allá de su mirada social y de su profundo compromiso artístico, &quot;Mía&quot; resume el encanto de las cosas bien hechas. Un guión contundente, unas actuaciones a medida y una sensibilidad que se desprende de su piel como un ejercicio mágico.", "", usuario32, null);
		Resenias resenia405 = new Resenias("Con lo que se gasta una europea en venir desde su país hasta Argentina, la estancia larga ahí y luego el pago por llevarse un bebé (todo de manera ilegal y tratando con desalmados  intermediarios cuyo negocio es la venta de seres humanos), es decir unos 30.", "", usuario28, null);
		Resenias resenia406 = new Resenias("Interesante peli argentina sobre la adopción ilegal de niños, tráfico de lo más espinoso porque nadie garantiza las buenas intenciones del “comprador” (al que no se le hacen demasiadas preguntas cuando desembolsa la friolera de 20 o 30.000 euros por un niño), de manera que pueden acabar siendo pasto de la prostitución infantil o la venta de órganos.", "", usuario21, null);
		Resenias resenia407 = new Resenias("Con la intención de desocultar una realidad que muchos no conocen, Juan Solanas (ver spoiler), elige un tema doloroso y encubierto en la Argentina: el tráfico de niños vinculado con la adopción ilegal pero también con el negocio de órganos y la prostitución infantil.", "", usuario32, null);
		Resenias resenia408 = new Resenias("Nordeste trata el tema de la adopción internacional de niños, en este caso en Argentina, y sigue las peripecias de una ejecutiva francesa soltera y de mediana edad en su búsqueda de un bebé. Formaría una buana trilogía con La Casa del los Babys de John Sayles y la más reciente La Pequeña Lola de Bertrand Tavernier, pero se distancia de ellos en la forma de contar la historia, muy pausada y sin hacer partícipe a la cámara de la intensidad emocional que vive los personajes (en contraste con el exceso de cámara en mano del que hacía uso Tavernier).", "", usuario11, null);
		Resenias resenia409 = new Resenias("Es el nordeste argentino, lugar donde está contextualizada la ópera prima de Juan Solanas, una de las regiones más deprimidas del país sudamericano. Esta descarnada historia, que bebe del realismo social más aguerrido, denuncia sin paliativos ni edulcorantes la adopción ilegal de infantes en las zonas más depauperadas del globo.", "", usuario20, null);
		Resenias resenia410 = new Resenias("&quot;No sos vos, soy yo&quot; o lo que es lo mismo; &quot;no eres tú, soy yo&quot;; es una frase tan vieja como habitual en el día a día de la especie humana. Hoy le toca al amigo, mañana al vecino y pasado te toca a ti. Y Taratuto sin duda sabe de qué está hablando.", "", usuario16, null);
		Resenias resenia411 = new Resenias("En el ranking de las tres frases más jodidas que puede decirte el amor de tu vida están las que siguen:- &quot;Tenemos que hablar&quot;.- &quot;Eres como un hermano/a para mí&quot;- &quot;Sí, me lo he follado&quot;.", "", usuario4, null);
		Resenias resenia412 = new Resenias("Qué condenadamente jodidas pueden ser las relaciones. Lo realmente malo es que tenemos la manía de ilusionarnos, de empezar a pensar en mañana. El ser humano tiene la estúpida obsesión de creer que, en cuanto alguien le ofrece unas migajas, ya sus manos van a pasear unidas por los oleajes del tiempo durante toda la eternidad.", "", usuario32, null);
		Resenias resenia413 = new Resenias("En esta opera prima de Juan Taruto la historia es todo un drama, pero el guión le da un delicioso clima de comedia que el director saca adelante con altas dosis de ironía, agilidad y, por supuesto, humor. Presentar el terrible conflicto del protagonista con una sonrisa es el gran mérito de este trabajo.", "", usuario19, null);
		Resenias resenia414 = new Resenias("De las pocas películas, que yo recuerde, cuyo tema principal sea el amor-desamor, que me haya gustado, tal vez por el tono tragicómico que derrocha, o por lo entrañable del protagonista o por todo en general.Una muestra mas de la calidad del cine Argentino.", "", usuario24, null);
		Resenias resenia415 = new Resenias("&quot;Todo el bien del mundo&quot; no es de esas películas que perduran en la memoria, tiende a desdibujarse si dejas pasar unos días desde que la ves. Y esa sensación de que se escurre en la memoria se debe a que es una película irregular, irregular en diálogos (algunos son destacables, y otros resbalan por el oído sin dejar huella) e irregular en situaciones (no es un argumento bien trabado, con situaciones construidas con un ritmo regular, fluido).", "", usuario20, null);
		Resenias resenia416 = new Resenias("Esta película,que pasó por las carteleras sin casi destacar, es una pequeña joya. Con un transcurrir lento, que no aburrido, nos acerca a los sentimientos de unas personas que han sufrido en la vida las consecuencias de las dictaduras y del sinsentido de la historia.", "", usuario0, null);
		Resenias resenia417 = new Resenias("Las crisis por decreto de intereses es el modus vivendi con el que las últimas generaciones en Latinoamérica hemos sido acondicionadas, irremediablemente conferidas de nacimiento. Acá las crisis algunos las viven, otros la soportan y la mayoría las sufre.", "", usuario26, null);
		Resenias resenia418 = new Resenias("La novelista y directora argentina Lucía Puenzo se caracteriza por abordar temas que atraviesan la biología y la sexualidad en la adolescencia, con un punto de vista que rescata lo natural y espontáneo de esa etapa de cruce hacia el mundo adulto, tal como se evidencia en sus películas anteriores como “XXY” o “El Niño Pez.", "", usuario35, null);
		Resenias resenia419 = new Resenias("Realmente me hubiera gustado ponerle más puntaje a esta peli, porque está muy bien filmada, tiene actuaciones solidas y un tema más que atrayente. Pero resulta la verdad que salí del cine con una sensación de gusto a poco y, después de rumiar un rato más, la sigo teniendo.", "", usuario32, null);
		Resenias resenia420 = new Resenias("Tercera película de la directora argentina Lucía Puenzo, que adapta su propia novela, que a su vez se basa en la historia real de Josef Mengele: un despiadado criminal Nazi, que tras la Segunda Guerra Mundial se refugio en Sudamérica, donde continuo con sus experimentos en animales y niños.", "", usuario17, null);
		Resenias resenia421 = new Resenias("“Wakolda” se inserta dentro de los intereses de la directora Lucía Puenzo para llevar a la pantalla los temas con los que se ha hecho ya un espacio: la sugerente exposición de la virginidad y fragilidad de los cuerpos, el precoz despertar de la inocencia, el retrato de las minorías sexuales, el dramático devenir de las diferencias frente a los estereotipados esquemas mentales aceptados por la sociedad.", "", usuario0, null);
		Resenias resenia422 = new Resenias("Con una destacable realización y unas interpretaciones que sostienen la trama, el &quot;Médico alemán&quot; quizás adolece de querer ser demasiado sutil en el desarrollo del suspense. Tanto que roza la pérdida del interés del espectador en algunos momentos.", "", usuario33, null);
		Resenias resenia423 = new Resenias("Hay una mancha de humedad en tu departamento, puedes hacer de cuenta que no está allí pero, como dice el dicho, &quot;acuéstate con chicos y amanecerás mojado&quot;.Lo sorprendente de La mala verdad es su capacidad para implotar, en vez de explotar.", "", usuario30, null);
		Resenias resenia424 = new Resenias("¿Qué verdad puede ser mala para quienes hemos decidido ver este título? En efecto, el abuso infantil, el cual jamás se caracterizará por ser un tema amable y el que muchos cineastas han retomado bajo distintos géneros como el documental o bien el drama que innegablemente remueve la sensibilidad del espectador.", "", usuario29, null);
		Resenias resenia425 = new Resenias("El director de “Tan de repente” (2002), “Mientras tanto” (2006) y “La mirada invisible” (2010) ratifica con “Refugiado” su capacidad como riguroso narrador para encarar un tema tan delicado y vigente como la violencia de género.  que en otras manos, podría haber caído en una mera denuncia políticamente correcta, se convierte en un interesante thriller psicológico que excede el marco de la mera concientización, para proyectarse como una película inteligente y necesaria.", "", usuario22, null);
		Resenias resenia426 = new Resenias("Matías está en un cumpleaños infantil cuando de repente se hace la hora de finalizar la fiesta y su madre no aparece. Pasan los minutos y no hay noticias de ella. Cuando una de las madres se ofrece y lo lleva a su casa se encuentran con una imagen desagradable: Laura, su madre, en el suelo, lastimada entre astillas de vidrios.", "", usuario29, null);
		Resenias resenia427 = new Resenias("Relata la huida de una mujer con su hijo posterior a una agresión física que sufre por parte de su pareja. Las intenciones del film son muy claros, da dos perspectivas de la historia, la mirada comprensible pero siempre inocente del niño, que no logra comprender toda la dimensión de lo sucedido.", "", usuario25, null);
		Resenias resenia428 = new Resenias("Alguna vez tuve la oportunidad de visitar a un grupo de mujeres que habían sufrido maltrato a manos de sus parejas. El asunto se había convertido en casi una moda mediática en aquel momento y todos los días era bombardeado por historias de violencia de género.", "", usuario10, null);
		Resenias resenia429 = new Resenias("Un niño, testigo silencioso que todo lo ve, todo lo oye, de todo se entera, presencia que pasa desapercibida pero todo lo devora, perenne esencia volteada como maleta sin equipaje a quien nadie pregunta, todo en su cabeza, engullido y mezclado, difícil saber qué piensa, cómo se siente realmente, lo único claro es lo que le hace daño, lo que le perjudica, lo mucho que no entiende y lo poco que sí sabe, que su papá pega a su mamá, que su mamá llora, que no puede volver al colegio y que se perderá los cumpleaños de sus amigos, que siente mear la cama y que está cansado de correr, que promete portarse bien y que quiere volver a casa, que todo sea como antes, antes de que papá pegara a mamá y mamá no dejara de llorar.", "", usuario17, null);
		Resenias resenia430 = new Resenias("El film describe el doloroso aprendizaje y la creciente desesperación de una joven de clase media que decide prostituirse por una noche, recurriendo a una antigua amiga del colegio que se dedica al oficio más antiguo del mundo. Previsiblemente, todo le resultará mucho más difícil de lo que imagina.", "", usuario26, null);
		Resenias resenia431 = new Resenias("Aunque tengo el mismo gusto que Shandy por el cine argentino, no coincido exactamente con su crítica: no creo que sea tan mala. Es simplemente sobria. Cualquier intento de mostrar más hubiese caído en el dramatismo lacrimógeno.Me parece una película correcta, que curiosamente nos sitúa premeditadamente lejos de la protagonista.", "", usuario13, null);
		Resenias resenia432 = new Resenias("Pese a ser un casi incodicional de todo el cine argentino, poco o nada positivo he encontrado en esta película que al menos es breve; una multitud de planos subjetivos que no cuentan nada y que aburren, son intercalados entre las insulsas escenas de una película que no está mal hecha pero que no cuenta nada y cuyo personaje central no invita a la simpatía, no por una mala interpretación, sino por pura insuficiciencia del guión.", "", usuario25, null);
		Resenias resenia433 = new Resenias("La flamante remake del clásico de Daniel Tinayre , realizado en 1960, justifica la actualización de su propuesta, que incorpora la actualidad de su propio tiempo y a su vez interpela hasta qué punto nos hemos desacostumbrado a los dilemas éticos y su consecuente dialéctica para defender ideas y consecuencias.", "", usuario29, null);
		Resenias resenia434 = new Resenias("La película de Mitre es un profundo despropósito. Pretende hacer un análisis moral de la sociedad occidental pero para ello utiliza un guión poco o nada creíble. La película no desgrana las motivaciones que conducen a los actos de la protagonista.", "", usuario18, null);
		Resenias resenia435 = new Resenias("Estamos ante un retrato poderoso de un personaje femenino que marca su independencia, que se enfrenta a su padre y a su novio, se rebela contra una previsible carrera exitosa en la judicatura y se revuelve contra las decisiones que otros toman por ella, colisionando con los convencionalismos al uso y demostrando que la integridad moral no conoce de vínculos afectivos, ni de servilismos trasnochados, ni de sumisiones tácitas o expresas.", "", usuario24, null);
		Resenias resenia436 = new Resenias("En su segundo largometraje –un remake de «La patota» de Daniel Tinayre–, el argentino Santiago Mitre construye un drama de gran fuerza emotiva que se sostiene completamente sobre los hombros de su complejo personaje protagonista, Paulina, una joven idealista que será víctima de una violación.", "", usuario19, null);
		Resenias resenia437 = new Resenias("Hermosísima película. Endemoniadamente compleja, interesante y bien hecha.Todos sabemos que las grandes causas, los idearios bellos, los discursos al viento, todo el entramado de frases, sentencias, normas, leyes, derechos..., y demás reglas del juego son, en la medida en que se acercan a la cruda realidad, no más que un pálido reflejo de su celestial intención inicial.", "", usuario0, null);
		Resenias resenia438 = new Resenias("Pequeña película de animación argentina totalmente irregular, aunque con puntos destacables.El film está compuesto por cuatro historias, contadas por distintos animadores/dibujantes, que tienen que ver con la Gran Buenos Aires. Lo desparejo de los segmentos atenta contra el resultado final, aunque constituye una rareza ver este tipo de films elaborado en el sur.", "", usuario12, null);
		Resenias resenia439 = new Resenias("Esta nueva película argentina está basada en un cuento inédito de Alberto Laiseca del mismo nombre.  En el original, un hombre está muy enamorado de su esposa y por miedo a perderla por falta de dinero hace un pacto con el diablo a cambio de un millón de dólares.", "", usuario17, null);
		Resenias resenia440 = new Resenias("Querida voy a comprar cigarrillos y vuelvo es una película inclasificable, ni cine popular ni cine para especialistas. La premisa es la siguiente: A nuestro antihéroe se le presenta la oportunidad de vivir diez años en su pasado conservando su mente actual a cambio de un millón de dólares.", "", usuario8, null);
		Resenias resenia441 = new Resenias("Cohn-Duprat tienen en su haber un par de films más que interesantes. A decir verdad no me gustó demasiado &quot;Yo Presidente&quot;. Sin embargo lo que vino después fue mejorando más que gradualmente. &quot;El Artista&quot; me dejó una gran impresión y fue la mejor carta de presentación para lo que vendría.", "", usuario36, null);
		Resenias resenia442 = new Resenias("“Cine de autor”, raro, particular, tal vez algo pretensioso, pero definitivamente una propuesta distinta. Basado en un cuento del escritor Alberto Laiseca, famoso por su obra &quot;Los sorias&quot;, considerada la obra más larga de la literatura argentina, y el cual se hizo un poco más conocido para el público general cuando condujo un ciclo de cuentos de terror en episodios de diez minutos en el canal I-SAT.", "", usuario12, null);
		Resenias resenia443 = new Resenias("&quot;Querida, voy a comprar cigarrillos y vuelvo&quot; es una comedia que mezcla el género dramático y la ciencia ficción dando lugar a una radiografía de una Argentina y de los argentinos. Basado en un cuento de ciencia ficción de Alberto Laiseca, quien ademas es narrador y explica las desventuras que hace el protagonista que interpreta en un papel dramático nunca visto de Emilio Disi cuando hace un pacto &quot;diabólico&quot; con un personaje chanta, sacado de una persona de cine bizarro, que le ofrece dinero a cambio de que retroceda, él y sólo él, diez años en el tiempo.", "", usuario14, null);
		Resenias resenia444 = new Resenias("Un treinteañero, que hace 10 años era un joven que vivía al día, sólo pensando en sí mismo y sin importarle lo que pensara la gente, se encuentra con una extraña situaciòn:ahora que ya tiene su vida hecha pero continúa inseguro en sus relaciones, resulta que una niña de 10 años le hace descubrir que la vida puede tener otro sentido menos frívolo y más gratificante.", "", usuario13, null);
		Resenias resenia445 = new Resenias("Nacionalidad: argentina. Los argentinos no dejan de sorprender con su cine, ya sea comedia, construyendo historias al uso o con este cine pausado. Rubén es un camionero que viaja de Paraguay a Buenos Aires, 1500 km. En este viaje, por petición de su jefe, debe llevar con él a una mujer paraguaya, Jacinta, que además va acompañada de su bebé, una niñita sorprendente.", "", usuario19, null);
		Resenias resenia446 = new Resenias("Entrañable y optimista película capaz de hacernos recordar  que siempre se puede volver a empezar, que no todo es igual per secula seculorum. Es una película radical en su desarrollo, no da concesiones a la galería, pero por la fuerza de sus imágenes y el tratamiento de las situaciones y personajes,  logra que te llegues a  sentirte dentro de esa cabina, a sentir y comprender los sentimientos de los dos personajes adultos, a deleitarte con la alegría de vida de la beba tan indiferente –por otra parte- a lo que ocurre en esa cabina de camión.", "", usuario13, null);
		Resenias resenia447 = new Resenias("Mientras transcurría la película me lo pregunté varias veces: ¿Cómo una película puede ser lenta, con pocos diálogos, sin música y  con planos fijos y, sin embargo, generar una sensación de incomodidad, de tensión constante?¿Cómo pueden tres personajes que hablan muy poco (o nada) meterse adentro del corazón del espectador y lograr que uno se sienta identificado con ellos?La respuesta: así.", "", usuario22, null);
		Resenias resenia448 = new Resenias("Aunque esta película no desprenda el nivelazo al que me tiene acostumbrada el cine argentino, se trata igualmente de una historia agradable de ver. Transcurre de manera sosegada (quizá demasiado). Los actores estan muy bien y basicamente podemos intuir el resurgir de un sentimiento escondido, el deseo de volver a estar en compañía, querer y ser querido.", "", usuario8, null);
		Resenias resenia449 = new Resenias("Para los qué amamos el cine de Sorin, para los que disfrutamos de las “historias mínimas”, Las Acacias, ópera prima de Pablo Giorgeli, es una caricia, es una joya qué el cine nos regala y es un lujo del qué no debemos privarnos.Las Acacias, ganadora de la cámara de oro en el festival de Cannes mejor ópera prima, es una road movie en la cual hacemos el trayecto de la frontera con Paraguay hasta Buenos Aires, es un recorrido, como cualquiera, como muchos, donde, desde la cabina de un camión, la piel de Giorgelli muestra a sus personajes, nos muestra a Rubén, a Jacinta y a la pequeña Anahi, nos muestra sus sabores (y sus miedos) sus fracasos y sus silencios, esos silencios qué hacen entrañable a estos personajes, esos silencios qué ingresan en el espectador para alojarse en la piel qué lleva al alma.", "", usuario16, null);
		Resenias resenia450 = new Resenias("Soy argentino, pero si no lo fuera, o si fuera un argentino de los tantos que sólo leen las páginas de deportes de los diarios y mira notas policiales por TV, y me encontrara por casualidad con la sinopsis de esta película diría: ni loco voy al cine a ver eso.", "", usuario24, null);
		Resenias resenia451 = new Resenias("El infaltable azar vincula las diferentes historias de Ezequiel (Peretti) y Paula (Oreiro), cuya relación empezará mucho más cercana al odio que al amor a primera vista: el personaje central es un compositor de música para películas, momentáneamente falto de inspiración, que atraviesa un reciente divorcio y problemas económicos apremiantes.", "", usuario0, null);
		Resenias resenia452 = new Resenias("Seguramente mi desconocimiento del cine argentino, que no va mas allá de las siempre entretenidas y las mas de las ocasiones divertidas comedias que son estrenadas en España y aquellos desfases de Alberto Olmedo y Jorge Porcel  que nos llegaron en los 80 a los videoclubs patrios (con gran acogida por parte de la clientela, así era y así lo cuento) me impidan analizar con mas conocimiento esta película.", "", usuario5, null);
		Resenias resenia453 = new Resenias("Dos situaciones iniciales, dos urgencias, cómicamente desesperadas -la de un hombre y la de una mujer- que inopinadamente se agarran el uno al otro para ayudarse, casi a contrapelo,  y de ahí va naciendo al mismo tiempo , va fluyendo la cosa, a trancas y barrancas, con muchas complicaciones, pero fluyendo, hacia la musica cumplida y el amor que se hace y el niño que nace.", "", usuario21, null);
		Resenias resenia454 = new Resenias("Una película entretenida y muy agradable . Tiene buenos momentos graciosos y divertidos que harán pasar un buen rato en el cine con humor inteligente . El ritmo no decaee gracias al buen guión . Un lujo el elenco principal formado por Diego Peretti , Natalia Oreiro y Norma Aleandro .", "", usuario29, null);
		Resenias resenia455 = new Resenias("Vista en perspectiva histórica de su estreno en el 2004 pocas veces en Argentina se había aventurado al género de la comedia romantica. Pero con El amor (Primera Parte) se llega a un género que en comparación a posteriores películas como las de Juan Taratuto (especialmente) es más de un estilo de ensayo sobre el amor, con elementos de una historia de ficción suaves tamizadas por momentos de lecciones acerca de la experiencia del amor desde un punto de vista cientificista, racional que sirve esto último para darle un toque de humor, para sazonarla y descubrir su divague intelectual de estos cuatro directores.", "", usuario29, null);
		Resenias resenia456 = new Resenias("No voy a hacer una crítica detallada. Sólo voy a decir que la vi hace poquito y me hizo acordar mucho a Blue Valentine y a 500 Días juntos (500 Days with Summer). Un poco me indignó el parecido, ya que ambas me habían gustado, pero esto ya me parecía una copia.", "", usuario1, null);
		Resenias resenia457 = new Resenias("No sé si será porque meditación, zen, conciencia, etcétera me resultan interesantes de por sí, pero esta película me ha gustado mucho. Maneja conceptos que no resultan precisamente fáciles de abordar, y lo hace de forma sencilla, clara, sin dejarse llevar por la parcialidad.", "", usuario15, null);
		Resenias resenia458 = new Resenias("Cuando uno quiere ver una peli sobre filosofía oriental y acude a peliculas orientales... hay algo que se queda por el camino... ellos dan tantas cosas por supuestas que para nosostros son sólo conceptos vagos... que no logra llegarte de verdad la peli (a no ser que seas un meditador o yogui experimentado).", "", usuario9, null);
		Resenias resenia459 = new Resenias("Al margen de sus valores cinematográficos, tal vez el principal mérito de esta película sea el de introducir al espectador en el fascinante -y para muchos supongo que exótico- mundo del Zen. Y lo hace sin rubor, sus personajes tienen inquietudes espirituales (¿espiri.", "", usuario23, null);
		Resenias resenia460 = new Resenias("Propuesta honesta e interesante del debutante director argentino Diego Rafecas al que muy marcadamente se le nota que le seducen los temas espirituales y en especial el Zen, tanto que hace cinco años fue consagrado Monje, tras un largo período de prácticas de los principios y enseñanzas del Budismo, no obstante,  la película adolece de un guion consistente que no haga perderse tanto al espectador en valorar esta filosofía con valores tan antiguos como útiles para el progreso del ser humano.", "", usuario4, null);
		Resenias resenia461 = new Resenias("Película argentina sobre las relaciones mundanas y la búsqueda de paz interior vía meditaciones y métodos clásicos ad hoc.Pese a la premisa -de autoayuda- es entretenida y acaba en sí misma.LO MEJOR: No adolece de esa manía del cine dramático español de querer convertir situaciones normales en dramas griegos histrionizados.", "", usuario8, null);
		Resenias resenia462 = new Resenias("La directora Natalia Smirnoff debuta en la dirección con la película Rompecabezas, que paso con una buena acogida por parte de la crítica en el pasado Festival de Cine de Berlín, aunque finalmente se quedara sin premio. Y la verdad es que viendo la sencillez y la sutileza con la que Smirnoff afronta su primera película, de la que también es guionista, solo cabe esperar con ganas su siguiente proyecto.", "", usuario19, null);
		Resenias resenia463 = new Resenias("¿De qué excepción hablo?..... De la que dice que todo nóvel director de cine argentino hará de su ópera prima un presuntuoso, olvidable, incoherente, esperpéntico y mediocre canto a la pavada seudoculturosa.  En el presente caso Natalia Smirnoff nos da una obra lúcida, personal, profundamente imbuída de la genial sensibilidad femenina, no atada a los moldes habituales de los egresados de la escuela de cine argentina donde se les inculca que son crípticos artistas (destinados a despoblar las salas de cine).", "", usuario11, null);
		Resenias resenia464 = new Resenias("Cuando encontré ese título entre varias películas en el armario de mi hermano, me fascinó la sencillez del título. Y a partir de allí me sumergí en el mundo de una mujer tan simple y compleja que nos lleva a conocer una pasión que ejerce con real entusiasmo.", "", usuario33, null);
		Resenias resenia465 = new Resenias("Rompecabezas es la típica película que su planteamiento simplista permite múltiples interpretaciones que harán las delicias de un psicoanalista pues habla de obsesiones, habilidades y evasiones. Yo también me permito la licencia de interpretar que la directora ha pretendido que la película sea un puzzle, no ya tanto por su complejidad sino mas bien porque sigue el método de trabajo para montarlo: el trascurso de la búsqueda de las piezas es lento y aburrido como la película; En un primer momento separa las piezas que hacen de borde, (muestra a la protagonista en su 50 cumpleaños haciendo una de sus habilidades: la comida y cuidar de los tres &quot;hombrones&quot; que tiene en casa), seguidamente separa las piezas por colores (el marido: un egoista solo preocupado de saciar sus instintos básicos: el sexo y el queso, los 2 hijos unos tarambanas y por último, presenta al heroe: un caballero, un hidalgo, un Garcilaso del siglo XXI) y finalmente el júbilo que supone armar la última pieza y el halo de misticismo del momento en que se contempla la obra terminada (la atracción sexual, la posibilidad de consumar una aventura con el hombre que admira) y después.", "", usuario35, null);
		Resenias resenia466 = new Resenias("Servicial antes que útil, vista antes que mirada, querida más que amada, y oida mas que escuchada. Esa es la historia de una mujer &quot;simple&quot; con un don excepcional, que no descubre hasta la mitad de su vida, ya con una típica familia formada y poco o nada excitante esperándole día tras día.", "", usuario12, null);
		Resenias resenia467 = new Resenias("Los dueños realiza una buena descripción de la relación laboral entre peones y caseros, las diferencias de poder entre ambos y las relaciones sociales de ambos. La cinta se puede dividir en dos claras partes, una primera descriptiva, de presentación de personajes, y el entorno; y una segunda con un giro de la trama y el desenlace.", "", usuario34, null);
		Resenias resenia468 = new Resenias("Este humilde, sencillo pero exquisito retrato de los avatares de una familia argentina de barrio me ha llegado desde el minuto uno. Suena un tema de Bersuit: &quot;Qué linda que estás, sos un caramelo, te veo en el recreo y me vuelvo loco.", "", usuario28, null);
		Resenias resenia469 = new Resenias("Como ya demostrara en su interesante &quot;No sabe / No contesta&quot;, Fernando Musa sabe llegar a nosotros con un estilo despojado de cualquier artificio, con buenos diálogos, sencillez y unos personajes muy cercanos.El humor vuelve a estar presente, acompañado muchas veces de una invitación a la reflexión, lo que por momentos le da un toque agridulce.", "", usuario16, null);
		Resenias resenia470 = new Resenias("Una hermosa y engreida mujer Andrea Galante (preciosa) se enamora de un niño más inmaduro que ella aún y el resultado es que van a tener un hijo. Sin idea alguna de lo que quieren para sus vidas y con un futuro incierto desde todo punto de vista, se desarrolla la trama del film, el cual tiene un final inesperado y estoy seguro que daras gracias a Dios, ya que fue lo mejor que pudo suceder, tierna, graciosa por momentos y precisa en su dosis de drama, para mi una obra muy digna de apreciarse la cual no te defrauda a pesar de un lógico rechazo a este tipo de historias.", "", usuario21, null);
		Resenias resenia471 = new Resenias("La palabra que mejor describe esta película es agridulce, su trama, sus personajes, su dirección, y la sensación que te deja después de verla.Lo mejor desde mi punto de vista es la forma que trata el embarazo adolecente, sin ensalsarlo, ni mostrar a estos como las víctimas, sino como seres irresponsables y desorientados, sin volverlo morboso o trágico.", "", usuario14, null);
		Resenias resenia472 = new Resenias("Sin duda una excelente película que mueve las fibras sensibles de cualquier persona que ha tenido que vivir o que vive la situación que aquí se maneja: &quot;El exilio voluntario&quot;.Sin duda Argentina es un país conocido por su ascendencia totalmente europeizada, los argentinos son &quot;descendientes del barco&quot;.", "", usuario25, null);
		Resenias resenia473 = new Resenias("Admiro a Szifrón pero esta peli me resultó una pequeña decepción. Tiene segmentos interesantes y algunos diálogos muy buenos pero como obra completa me parece muy vacía. Tiene el aire denso de las películas de temáticas profundas sin ser una de ellas.", "", usuario6, null);
		Resenias resenia474 = new Resenias("Después de ver los actores que tenía la película y la crítica argentina en general esperaba otro tipo de película. Lo que me encontré fue un drama de búsqueda de personalidad interior disfrazado de película de misterio. La película tiene buena fotografía pero puede decirse que la acción avanza bastante lenta en ocasiones e irritántemente cansina en otras.", "", usuario16, null);
		Resenias resenia475 = new Resenias("Resulta curioso este largometraje a la vez que ópera prima de Damián Szifron que resulte tan atractivo e intenso como a la vez absurdo y convencional. Szifron lo da todo de sí, deja momentos para la posteridad, esa escena en el dormitorio arriba o Hendler haciendo la vida imposible al amante constantemente son dignas de admirar.", "", usuario10, null);
		Resenias resenia476 = new Resenias("Se trata de la película de un chico celoso que se vuelve obsesivo.Es interesante la historia pero se hace un poco cansina con tanto seguimiento y tanta locura por enterarse de todo por su cuenta. Hubiera sido más fácil y rápido hacer otras cosas, pero en ese caso, no habría habido película.", "", usuario35, null);
		Resenias resenia477 = new Resenias("Película dirigida por Szifron (los simuladores) en el que cuenta la historia de un extraño personaje interpretado por Hendler que sufrirá momentos disparatadados y bastantes bizarros ya que es un obsesivo de su pareja (Fonzi)Las actuaciones están bien en especial la de Hendler y Garzón.", "", usuario5, null);
		Resenias resenia478 = new Resenias("El último film de Pablo Trapero es una conmocionante pintura social construida con los mejores recursos cinematográficos que se apoyan en la solidez de la imagen como punto de partida.Elefante Blanco” aborda con calidad y sobre todo sin manipulaciones, la más salvaje de nuestras realidades sociales pero entendiendo al cine como espectáculo atrapante y movilizador.", "", usuario15, null);
		Resenias resenia479 = new Resenias("La palabra que la define es &quot;chasco&quot;.Tras una excelente idea, tras una propuesta convincente, e incluso tras una primera media hora de notable alto, la película se viene abajo, cae en todos los tópicos más típicos y ramplones que quepa imaginar y, al fin, se desangra en el absurdo.", "", usuario18, null);
		Resenias resenia480 = new Resenias("Como si de un regreso al de 'Apocalypse Now' (1979) se tratara, Pablo Trapero evoca la obra de Coppola en el prólogo, emprendiendo un viaje a la selva del amazonas en el que, sin diálogos, presenta el encuentro de sus dos protagonistas, Ricardo Darín y Jérémie Renier (habitual en el cine de los hermanos Dardenne), ambos sacerdotes en sacrificio espiritual frente a la barbarie.", "", usuario31, null);
		Resenias resenia481 = new Resenias("Realmente me decepcionó, con un argumento muy pobre, parece que la película solo intenta retratar lo que ya todos sabemos que sucede en las villas. Imágenes reiterativas, casi exageradas, sobre las condiciones inhumanas en las que vive mucha gente en nuestro país, convierten la película en un documental de lujo.", "", usuario13, null);
		Resenias resenia482 = new Resenias("Siempre me atraparon las presentaciones de las películas de Pablo Trapero: El titulo, el argumento, el trailer. Sin embargo, una vez que las veía sentía un sabor amargo por ciertas fallas que yo creía notar: por ejemplo, el roce constante con el género documental en 'Leonera' o la exageración argumentativa en 'Carancho'.", "", usuario22, null);
		Resenias resenia483 = new Resenias("Una apatía constante va orillándonos a brutales depresiones, donde todos tratan de ayudar ya sea con compañía, consejos o antidepresivos, sin saber cual es el meollo del asunto de nuestro estado anímico. Cuando se juega al psicólogo los estados psíquicos se contagian y arrastran a otros a las mismas condiciones cuando uno ya ha superado la crisis y retoma la dirección de la vida que hemos previsto.", "", usuario35, null);
		Resenias resenia484 = new Resenias("Rara, no apta para quienes gustan del cine clásico. La apatía que muestran los personajes, diciendo las mas grandes barbaridades siempre con esa cara de nada es notable. Si ésta pelicula te interesó, te sugiero no dejar de ver Silvia Prieto o Rapado, del mismo director quien sabe sacar partido de sus actores.", "", usuario9, null);
		Resenias resenia485 = new Resenias("Aviso para todos aquellos que se dispongan a ver una película de Rejtman: Olvídense de todo lo que crean saber sobre el cine argentino. Olvídense, no van a ver nada de eso.A día de hoy Rejtman es considerado el padre del Nuevo Cine Argentino.", "", usuario6, null);
		Resenias resenia486 = new Resenias("Después de haber visto El hijo de la novia, Conversaciones con mama, Elsa y Fred, Lugares comunes, Felicidades, Sol de otoño, etc..., esta película me ha parecido más floja de lo normal, y digo de lo normal porque el cine argentino es un cine atractivo para el espectador, muy humano y comprometido con los sentimientos y las situaciones más cotidianas de la vida.", "", usuario15, null);
		Resenias resenia487 = new Resenias("Diego Rafecas acude al cine, tal como lo hizo en sus dos películas anteriores, para mostrar un malestar de la cultura. En este caso, el terreno creciente de las adicciones más peligrosas en los jóvenes de todos los estratos sociales.  Con &quot;Paco&quot; la intención parece ser abarcar no solamente las causas y efectos de las peores drogas, sino también -y fundamentalmente- el proceso de recuperación de los afectados.", "", usuario13, null);
		Resenias resenia488 = new Resenias("Luego de maravillarme con Un Buda, Rafecas nos regala esta valiente película sobre el mundo de los drogadictos y de los intentos institucionales de rehabilitarlos. La música acompaña perfectamente la historia y nos lleva de la mano de melodías hinduístas genialmente realizadas por Babasónicos.", "", usuario14, null);
		Resenias resenia489 = new Resenias("Me parece excelente que exista un cine argentino &quot;zen&quot;. El tema de los centros de recuperación está interesante, aunque hubiera podido hacerlo mucho más truculento y aùn asì ser fiel a la realidad. Es muy interesante que haya una mirada no-moralista en el sentido judeo-cristiano, sino un acercamiento màs humano a los personajes.", "", usuario31, null);
		Resenias resenia490 = new Resenias("Reflejar en casi 2 horas un drama tan inmenso como el de la droga y todo lo que ello implica, es casi imposible, aunque este film logra aunque sea superficialmente demostrar un circuito cotidiano de comercio, usos y costumbres, llegando hasta la muerte de muchos habitantes del mundo que eligen el flagelo de los estupefacientes en forma indiscriminada,.", "", usuario12, null);
		Resenias resenia491 = new Resenias("Un juego de seducción donde ella danza mientras el diálogo de una comedia de Shakespeare se repite, coqueto, en bucle. Una mirada furtiva. Reflexiones acerca de la naturaleza de las relaciones humanas con Shakespeare de fondo. La intriga de si llegará o no llegará el beso.", "", usuario14, null);
		Resenias resenia492 = new Resenias("Definitivamente, últimamente no tengo suerte con las películas que elijo. Después de tragarme Love (2011), ese insufrible tedio espacial de William Eubank, busqué un poco de entretenimiento  en el cine comercial y, cómo no, sólo se me pudo ocurrir ver After Earth (2013), la peor historia de ciencia ficción de la historia, escrita por.", "", usuario0, null);
		Resenias resenia493 = new Resenias("Excelente. Claro que es cuestión de gustos. De escalas, de conexiones, de otras visiones, de cuánto cine se ve, de a cuánto cine argentino uno se le anima. Pero después de repetir tres veces  Viola  , la película parece ofrecer disfrutes nuevos, nuevas conexiones, nuevos gestos, nuevos detalles.", "", usuario1, null);
		Resenias resenia494 = new Resenias("Lo que despierta en nuestros corazones con estas propuestas. Alguien sugirio en un taller literario de mi país que después de ver estas dos películas de Subiela debimos abandonar el taller y hacer poesía en los semáforos de la ciudad....Ambas las veo con UNA.", "", usuario10, null);
		Resenias resenia495 = new Resenias("Es una segunda parte de algo que debería haber quedado inconcluso, la primera realmente  me cautivó y la poesía era su ingrediente perfecto aparte de Grandinetti que no podría hacerlo mejor, pero esta segunda parte no me provocó lo mismo fue como un engaño a la idea matriz de todo, además el hecho de que ella sea equilibrista lo encontré muy obvio con la idea de que quería una mujer que vuele.", "", usuario20, null);
		Resenias resenia496 = new Resenias("Esta película la descubrí por casualidad, tal vez fuera el acento argentino por el que siento especial debilidad, tal vez esa soledad melancólica que transmitía el protagonista, quizás fueran esos soliloquios sobre la vida y el amor, no lo se, pero tenía algo que hizo que me enganchase a la historia, admito no haber visto la primera parte, que probablemente sea mejor que ésta, y que es en realidad donde conoces a todos los personajes y su psicología.", "", usuario21, null);
		Resenias resenia497 = new Resenias("Si no conociera lo que le precede a esta segunda parte de &quot;el lado oscuro del corazón&quot; quizás diría que se trata de una película buena, pero conociendo los antecedentes me reservo esa afirmación. A mi parecer Subiela erra al intentar repetir la fórmula de la primera  cinta, creo que los versos en los diálogos en esta ocasión se ven un tanto forzados, además creo que se pierde la atmósfera arrabalera poética perfecta que se había conseguido anteriormente.", "", usuario3, null);
		Resenias resenia498 = new Resenias("No he tenido la posibilidad de ver al primera parte de esta película; sin embargo, esta me ha parecido una interesante propuesta sobre hasta donde puede llegar el amor y su reflexión sobre la pasión.Destacable la incorporación de poemas en los diálogos, lo cual hace muy intimista la película y adicionalmente, la cantidad de simbología manejada en las escenas y en los mismos personajes.", "", usuario8, null);
		Resenias resenia499 = new Resenias("Agradable sorpresa la que depara esta ópera prima de Rosendo Ruiz, proveniente de la docta ciudad de Córdoba, Argentina, aunque no sean sus conocidas catedrales ni otros íconos promocionados por el turismo comercial los que muestra, sino el entorno marginal de boliches cuarteteros, clubes barriales y calles salvajes donde pululan todo tipo de personajes que bien podrían encabezar el ranking de una genuina picaresca nacional actualizada.", "", usuario24, null);
		Resenias resenia500 = new Resenias("El entusiasmo desmedido con el que me acerqué a &quot;De Caravana&quot; jugó en contra. La crítica la destacaba como la película más festiva del 2011 en Argentina, lo cual no me parece tan errado. Ahora...no me ocurre lo mismo con el comentario de &quot;una de las mejores películas del año en Argentina&quot;.", "", usuario35, null);
		Resenias resenia501 = new Resenias("De Caravana fue elegida junto con Avallay, otro bodriazo, por el público como la mejor película del  Festival de cine de Mar del Plata.¡Por Dios, como serian las demás !La película trata sobre un fotógrafo que tiene que meterse en un recital de la Mona Giménez para retratar el mundo cuartetero y termina mezclándose con la mafia cordobesa.", "", usuario27, null);
		Resenias resenia502 = new Resenias("En una atmósfera nostálgica y por momentos claustrofóbica, la película nos introduce en una ciudad argentina en los años setenta, vista desde la nostálgica perspectiva del recuerdo. En espacios que no van más allá de la vereda, la escuela o el campito de juego, la historia transcurre en los reconocibles “años de plomo” de la dictadura militar en esa época.", "", usuario17, null);
		Resenias resenia503 = new Resenias("Anoche escuchevarias explosionestiros de escopeta y de revólverautos acelerados, frenos, gritosecos de botas en la calletoques de puerta,quejas, por dioses, platos rotosestaban dando la telenovelapor eso nadie miró para afueraavestruz…Chicos jugando al policía y al ladrón, nada inusual a menos qué esto lo situemos en Buenos Aires en plena década del 70; chicos jugando juegos de grandes, (como en las películas) mientras grandes se comportaban como chicos (o peor).", "", usuario11, null);
		Resenias resenia504 = new Resenias("Carlos Sorín vuelve al desolado paisaje patagónico pero esta vez no se queda en la meseta sino que llega hasta el mar, de la mano del protagonista principal Marco (Alejandro Awada), un hombre de poco más de cincuenta y al borde de la jubilación, que ha decido pasar sus vacaciones con dos objetivos: pescar tiburones (algo que nunca hizo) y reconectarse con su hija de la que ha estado distanciado en los últimos años.", "", usuario31, null);
		Resenias resenia505 = new Resenias("Carlos Sorin despuntó en 2002 con 'Historias mínimas', película que le dio cierta fama y reconocimiento no solo en Argentina sino también de cara a Europa.Ahora vuelve a filmar en la Patagonia con 'Días de pesca' (que en España llevará la coletilla de “en Patagonia”, sin saber muy bien el por qué) con otro drama íntimo, donde Marco Tucci, un viajante de comercio de 52 años, después de recuperarse de su problema de alcoholismo, se toma unas vacaciones en Puerto Deseado, donde pasará sus días pescando y aprovechará para retomar el contacto con su hija Ana, de la que perdió el contacto hace años.", "", usuario27, null);
		Resenias resenia506 = new Resenias("Dicen que segundas partes nunca fueron buenas. Con ellas se pierde el factor sorpresa; se pierde una innovación sin la cual, se supone, ya no se puede lograr en el espectador el impacto imprescindible para que la película en cuestión cale en él con las sensaciones agradables que, siempre en teoría, estaban reservadas para la primera entrega de la saga de turno.", "", usuario2, null);
		Resenias resenia507 = new Resenias("La historia está contada de una manera muy lenta, lo que conduce al aburrimiento supremo. Además, no conseguí cogerle cariño o al menos empatizar con el protagonista, un exalcohólico, que busca una nueva oportunidad. No podía olvidar que tras esa cara de tristeza y aparente bondad, existía un pasado difícil provocado por su adicción al alcohol.", "", usuario28, null);
		Resenias resenia508 = new Resenias("Carlos Sorín vuelve a competir en el festival de San Sebastián con una nueva creación, Días de Pesca. Hay en esta nueva propuesta muchos de los motivos por los que anhelamos sus historias. Patagonia vuelve a ser el escenario perfecto de unos personajes desnudos, con mirada afable que esconden heridas antiguas, pero que apuestan por la superación  a pesar del dolor y el sufrimiento.", "", usuario14, null);
		Resenias resenia509 = new Resenias("Que un joven realizador elija para su ópera prima un tema anclado en el contexto de la última dictadura militar en Argentina; adopte el poco frecuente formato biográfico (biopic) y además situado sobre el eje de un personaje no fallecido, crea una serie de prejuicios respecto de la forma de abordaje.", "", usuario24, null);
		Resenias resenia510 = new Resenias("Emotiva producción argentina sobre la vida de la presidenta actual de las Abuelas de la Plaza de Mayo (Estela de Carlotto) que se proyectó, formando parte de la Sección Oficial de la Seminci (2011), el miércoles 26 de Octubre; y ganándose a pulso la justicia de un reconocimiento, tal vez el de mejor actriz, para Susú Pecoraro.", "", usuario32, null);
		Resenias resenia511 = new Resenias("El derecho a saber quiénes somos y de dónde venimos, y cómo, en determinados momentos  de la historia de muchos países (y no miremos muy lejos), alguien decide que hay personas que no lo merecen...   EL tema toca la fibra sensible de cualquiera a poco humano que se sea (aunque de todo hay!), con lo que se tiene ganado bastante terreno antes de empezar.", "", usuario1, null);
		Resenias resenia512 = new Resenias("Ópera prima de este director argentino, en la que reconstruye la vida de Estela de Carlotto, presidenta de las Abuelas de Plaza de Mayo y refleja el cambio radical que sufrió cuando su hija fue asesinada y su nieto secuestrado y su lucha por los ideales de justicia y por los reencuentros.", "", usuario27, null);
		Resenias resenia513 = new Resenias("Primer largo, de titulo rebuscado, del joven director argentino hijo del juez que instruía el juicio a las Juntas Militares de su país, que sembraron el terror a finales de los 70 y principios de los 80.A Lavedra aún le queda rodaje en esto del cine y se nota su bisoñez con una cinta que avanza con aspereza, falta de tono y con subrayados musicales repetitivos e innecesarios ante tanta tragedia.", "", usuario15, null);
		Resenias resenia514 = new Resenias("Ni Dios, ni patrón, ni marido es una historia generada a partir de un personaje real, Virginia Bolten (1870-1960?), redactora de la primera publicación feminista latinoamericana denominada “La voz de la mujer”, cuyo lema era “Ni Dios, ni patrón ni marido”, que durante 9 números (editados en la clandestinidad entre 1896 y 1897), dió una perspectiva anarcofeminista en la defensa de los derechos elementales de la mujer y los trabajadores.", "", usuario14, null);
		Resenias resenia515 = new Resenias("He de confesar que suelo ser bastante escéptico ante cualquier película revisionista, de corte político o de trasfondo histórico y ante la visión de ésta, y que no me pasase como con &quot;Las Hurdes&quot;, preferí documentarme antes y, efectivamente, salvo algún nimio detalle está púlcramente construida.", "", usuario7, null);
		Resenias resenia516 = new Resenias("Decía el pianista Franz Listz que “La música es el corazón de la vida. Por ella habla el amor, sin ella no hay bien posible y con ella todo es hermoso” Una frase que cala muy hondo en el director Gabriel Nesci, que nos presenta en su primer largometraje una historia que habla de música, de amor, de amistad, de belleza y de vida.", "", usuario5, null);
		Resenias resenia517 = new Resenias("Cuatro amigos de la infancia, amantes de la buena música, cuya vida es un despropósito debido a su mal-entendida relación con las mujeres, al poco recorrido de lo que iban a ser sus vidas y al espacio que ocupan en la actualidad; estrambótico y estrafalario el escenario en el que se mueve este singular cuarteto para mayor gloria y goce del espectador.", "", usuario9, null);
		Resenias resenia518 = new Resenias("Días de vinilo es una comedia romántica un tanto previsible que narra las peripecias vitales de cuatro tipos unidos por la música y una larga amistad. Tiene, no obstante, un arranque notable, con una atractiva puesta en escena a la que rápidamente suceden unos diálogos, chistes y situaciones chispeantes, sin duda lo mejor de la película.", "", usuario30, null);
		Resenias resenia519 = new Resenias("Si bien son incomparables en cuanto a realización concierne, ambas centran sus atractivos principales sobre el amor y la música. Musicalmente hablando Hi-Fi está sin dudas por encima, pero respecto a la transferencia de valores en sí, tenemos una indiscutida ganadora.", "", usuario34, null);
		Resenias resenia520 = new Resenias("Aclaro que soy fanático de la serie para televisión TODOS CONTRA JUAN, en sus dos temporadas, programa que me encantó y me encandiló como uno de los mejor realizados hasta la fecha en Argentina. Así es como me encuentro con esta película, la cual parece un genial apéndice cinematográfico de aquella gran serie protagonizada igualmente por Gastón Pauls.", "", usuario14, null);
		Resenias resenia521 = new Resenias("Una vez más caí en una “historia chiquita” que tanto provoca al cine argentino. Ópera prima de Diego Lerman (2002), blanco y negro, actrices desconocidas, en fin… pero debo agregar que no resultó un embole como suele suceder en este género.", "", usuario5, null);
		Resenias resenia522 = new Resenias("La película es interesante, a ratos intensa. El gran fallo son los personajes, en especial el de la chica que va a por la protagonista. Su actitud no parece creíble o convincente, aunque las actuaciones sí dan la talla. Es un problema, parece, de guión.", "", usuario14, null);
		Resenias resenia523 = new Resenias("Hacía tiempo que no le tomaba tanto cariño a un personaje como al &quot;Juan Pérez&quot; de Grandinettí. Cómo dice la maestra &quot;este hombre es un extraterrestre&quot;, pero de un planeta amable, en el que un hombre siempre puede volver y aclararlo todo, por mucho que se compliquen las cosas, y en el que se puede saber si alguien es bueno con solo mirarle a los ojos.", "", usuario0, null);
		Resenias resenia524 = new Resenias("Película digna de verse, por todo lo que contiene: la atracción entre distintos sexos, la necesidad e incluso el amor entre un hombre y una mujer maduros y bastante solos, el romanticismo y la burocracia que conlleva la conquista amorosa.De hecho, la simbología del frasco es enorme: un frasco es algo endeble, de cristal, frágil como el amor, puede guardar dentro cosas importantes pero igualmente puede quebrarse al más mínimo descuido.", "", usuario5, null);
		Resenias resenia525 = new Resenias("Los primeros minutos de la peli se me hicieron algo lentos , incluso llegue a temer por no haber acertado con ella, pero la historia va creciendo y me fue atrapando  sin saber muy bien porqué, y de repente me encontré con dos lagrimones bajando por mi cara y con una sonrisa de esas que se llaman de ternura y todo gracias a dos pedazos de actores como Dario Grandinetti y Leticia Brédice que hacen de una pelicula modesta una pequeña obra maestra .", "", usuario2, null);
		Resenias resenia526 = new Resenias("Una cinta intimista muy sencilla donde la apuesta máxima pasa por el trazado dentro del argumento de excéntricos personajes. Es un filme donde todo tipo de análisis riguroso de la calidad intrínseca de la obra cae a pedazos ante las ocurrentes situaciones mínimas que están repletas de enredos jocosos.", "", usuario4, null);
		Resenias resenia527 = new Resenias("Esta película, además de entretener con una bonita y algo extravagante historia de un frasco, nos muestra a un hombre extremadamente tímido. No recuerdo ninguna pelicula en la que el principal personaje fuera tan tímido y además se tratara con esta mezcla de humor y cariño como lo ha hecho Lecchi.", "", usuario34, null);
		Resenias resenia528 = new Resenias("En películas anteriores, Carnevale había abordado temas más o menos espinosos, como el amor en la tercera edad (“Elsa &amp; Fred”), la orfandad de los discapacitados (“Anita”) y la infidelidad (“Viudas”), donde supo tamizar los puntos álgidos con una cuota de humor.", "", usuario36, null);
		Resenias resenia529 = new Resenias("La idea es buena. Parte de una base de comedia en la que el tema principal es una crítica hacia la hipocresía de la sociedad, a sus prejuicios y a sus cánones de belleza preestablecidos.Todo dentro de un marco de humor respaldado por buenas actuaciones.", "", usuario35, null);
		Resenias resenia530 = new Resenias("Tyrion Lannister ya lo demuestra con creces en “Canción de hielo y fuego” y “Juego de tronos”. Que alguien de cuerpo pequeño puede proyectar una sombra muy larga. Nacido en un mundo cruel semejante al nuestro, ha luchado duramente, y casi siempre en vano, para ganarse un respeto que le ha sido negado por haber nacido enano.", "", usuario33, null);
		Resenias resenia531 = new Resenias("Y es que no tiene absolutamente nada. Primero como película, no tiene una puesta en escena o dirección con personalidad tan siquiera, esas imágenes genéricas de telenovela. No hay buenas actuaciones y tal vez, lo que podría haber sido también queda en ridículo por el absurdo guión.", "", usuario29, null);
		Resenias resenia532 = new Resenias("¿Vale la pena verla? Yo creo que sí. Una película que te hace reír, emocionar y que da elementos para pensar ya vale la pena. ¿Tiene fallas? Algunas sí, es un poco previsible, la música es demasiado protagonista. Pero las actuaciones son Excelentes, muy buenos trabajos de todos los actores, da gusto ver cómo desarrollan sus personajes.", "", usuario32, null);
		Resenias resenia533 = new Resenias("Es la historia de varias pequeñas historias de pequeños personajes de la gran urbe de Buenos Aires, que se llegan a cruzar de alguna manera y en algún momento, con el trasfondo evidente de la terrible crisis económica reciente de nuestros hermanos argentinos.", "", usuario37, null);
		Resenias resenia534 = new Resenias("Historias que se encuentran en ése cruce común a todos que es la búsqueda de amar y ser amado, de escuchar y de que te escuchen.Con el trasfondo común a varios de sus trabajos, el judaismo, Burman hace un retrato de personajes en constante búsqueda, creíbles y humanos.", "", usuario18, null);
		Resenias resenia535 = new Resenias("Daniel Burman empieza a alinearse en las peliculas de autor con Esperando al Mesias. De la misma manera que sus personajes en sus películas (posibles alter ego) el busca su propia manera de filmar, su temática, su toma de posición ante la cuestión y la identidad argentina .", "", usuario32, null);
		Resenias resenia536 = new Resenias("Burman es un director a tomar en cuenta. Ya nos sorprendió en &quot;Derechos de familia&quot;. Es un director que sabe tratar &quot;esa dura condición humana&quot;. Hace que revisemos, nos invita a eso...", "", usuario25, null);
		Resenias resenia537 = new Resenias("Vi la película porque soy fan de Sbaraglia y me encantan todas sus pelis, pero en cuanto vi a Norma Aleandro me quede totalmente impresionado. Es la primera vez en mi vida que me entran ganas de llorar con cada escena que tiene una actriz, da igual lo que esté haciendo.", "", usuario18, null);
		Resenias resenia538 = new Resenias("El guión hace aguas por todas partes y solo Norma Aleandro evitó que apagara el televisor. El director usa y abusa de la actriz para fabricar un film entrañable y ternurista con un solo mimbre. Hay otros actores, es cierto, pero se podría haber prescindido de ellos, porque aportan muy poco y en lugar de hablar mascullan, en especial Natalia Oreiroa.", "", usuario31, null);
		Resenias resenia539 = new Resenias("El comienzo es buenísimo, con una Norma Aleandro que se sale de la pantalla y una bonita historia para Natalia Oreiro (¡qué guapa sale!).Pero entonces llega el estilo Mignogna, es decir, la gran cagada. La película empieza a caminar por el terreno de lo ridículo, con un montón de &quot;apartes&quot; más propios del teatro que de lo que pedía esta película.", "", usuario29, null);
		Resenias resenia540 = new Resenias("Abismal el mérito actoral de Norma Aleandro por sobre el resto del film. La dirección de Mignona pone un sello latino al género de películas de camino tan estereotipado por el imperio, pero no logra verosimilitud. La definición como comedia emotiva es la que considero más ajustada, con toques de grotesco, parodia y sátira.", "", usuario33, null);
		Resenias resenia541 = new Resenias("Impresionante lección interpretativa de la inmensa  Norma Aleandro en una película que, sin ser una obra de arte, consigue emocionar y divertir a partes iguales. Se trata de una especie de road movie sin demasiadas pretensiones. Para nada pienso, como se ha apuntado por ahí, que pretenda ser una Thelma y Louise a la argentina.", "", usuario37, null);
		Resenias resenia542 = new Resenias("Película excesivamente dialogada, donde no se dicen cosas muy inteligentes ni interesantes y  que sugiere más de lo que cuenta. Por momentos crea expectación, y en otras aburre  con su monotonía que hay que superar tratando de entender la psicología de los personajes, nada profundos por supuesto.", "", usuario26, null);
		Resenias resenia543 = new Resenias("“Bersuit Vergarabat” dejo escrito en una de sus canciones que los argentinos son capaces de lo mejor y de lo peor. Y es cierto. El Tango es una buena prueba de ello. Dentro del tango está lo peor y lo mejor del hombre, y quizá por eso, escuchar un tango te mezcla sentimientos dentro del estomago, y a veces, no sabes si llorar o reír mientras lo escuchas.", "", usuario16, null);
		Resenias resenia544 = new Resenias("Tuve ocasión de ver esta película dentro del contexto de la Seminci de Valladolid ya que participaba en su sección oficial.Simplemente me remito a la definición de su director: &quot;es como el tango, reirse de estar triste&quot;.Todo aquel que quiera reir a carcajadas en una película con mucho fondo, Ciudad en Celo es su film.", "", usuario13, null);
		Resenias resenia545 = new Resenias("No se que me ocurre últimamente con el cine argentino, comienzo a ver el film y tengo la sensación de que promete, de que hay tema para desarrollar una historia que me atrape y que a fin de cuentas tenga sentido y sea creible, pero todo este anhelo se va desvaneciendo poco a poco a medida que transcurre la película.", "", usuario10, null);
		Resenias resenia546 = new Resenias("Comienzo intenso dando juego a la curiosidad por saber en que puede desencadenar una situación tan caótica y mostrada con humor. A medida que pasan los segundos, crece un sentimiento narcisista tan argentino que tumba todas las buenas intenciones. Director y guionista parecen mas preocupados en mostrarnos lo graciosos, &quot;vivos&quot;, boludos e inteligentes que son los porteños y porteñas, que en contar una historia.", "", usuario2, null);
		Resenias resenia547 = new Resenias("La trama central de la película transcurre en la cafetería Garllington, donde se reúnen para charlar sobre sus historias Sergio, un guionista en crisis sentimental con su mujer, Marcos, un ligón empedernido, y menos veces van Valeria, una cantante de un grupo de tango, y Sebas, un ejecutivo, que está demasiado comprometido con su trabajo.", "", usuario35, null);
		Resenias resenia548 = new Resenias("Y el caso es que a mí me habían dicho que los parques acompañados de un bebé son el espacio y el momento idóneos para establecer nuevas relaciones —vulgo, ligar—, pero lo que Mi amiga del parque (2015), de Ana Katz, que hace el papel de Rosa en el filme, nos ofrece es una visión totalmente diferente de ese contexto paradisíaco en el imaginario colectivo, sobre todo masculino.", "", usuario34, null);
		Resenias resenia549 = new Resenias("Sorprendente regalo el que nos hace la directora y actriz Argentina Ana Katz ( es Rosa en la peli). Con un envoltorio realista (la historia de madres que se encargan sin otro apoyo de la crianza de sus bebés en un parque) nos propone una historia que tiene que ver con el suspense, con el thriller e incluso la tragicomedia.", "", usuario33, null);
		Resenias resenia550 = new Resenias("Película argentina, animada, sobre un marciano que accidentalmente desembarca en Buenos Aires. Una película mordaz, que pinta socarronamente aspectos de la cultura argentina y general, con mucho humor negro. Por otra parte, es corta como muy entretenida.", "", usuario19, null);
		Resenias resenia551 = new Resenias("&quot;...Dios nos acusaba de echar a perder toda una generación. Debido a esto, y para separar justos de pecadores, Dios decidía tomarnos un examen. Él eligiría a uno de mis ex-alumnos, a uno de ustedes, y lo pondría a prueba ante una situación limite.", "", usuario4, null);
		Resenias resenia552 = new Resenias("Regresados habla sobre  el reencuentro, 20 años más tarde, de una promoción de compañeros de la secundaria  en plena crisis del 2002 en Buenos Aires .Se focaliza en tres historias. En la primera historia, Guido y Melina, una ex pareja de novios, vuelven a encontrarse.", "", usuario12, null);

		/*Genero Peliculas*/

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor0);
		actorespelicula.add(actor1);
		actorespelicula.add(actor2);
		actorespelicula.add(actor3);
		actorespelicula.add(actor4);
		actorespelicula.add(actor5);
		actorespelicula.add(actor6);
		actorespelicula.add(actor7);
		actorespelicula.add(actor8);
		actorespelicula.add(actor9);
		actorespelicula.add(actor10);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia0);
		reseniaspelicula.add(resenia1);
		reseniaspelicula.add(resenia2);
		reseniaspelicula.add(resenia3);
		reseniaspelicula.add(resenia4);

		Peliculas pelicula0 = new Peliculas("El secreto de sus ojos",2009,"",126,"Argentina. Benjamín Espósito es oficial de un Juzgado de Instrucción de Buenos Aires recién retirado. Obsesionado por un brutal asesinato ocurrido veinticinco años antes, en 1974, decide escribir una novela sobre el caso, del cual fue testigo y protagonista. Reviviendo el pasado, viene también a su memoria el recuerdo de una mujer, a quien ha amado en silencio durante todos esos años.",0,"imgs/peliculas/0.jpg","GcHkTSqeGoU",actorespelicula,director0,reseniaspelicula,usuario,genero0, true);

		this.peliculaService.add(pelicula0);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor0);
		actorespelicula.add(actor11);
		actorespelicula.add(actor12);
		actorespelicula.add(actor13);
		actorespelicula.add(actor14);
		actorespelicula.add(actor15);
		actorespelicula.add(actor16);
		actorespelicula.add(actor17);
		actorespelicula.add(actor18);
		actorespelicula.add(actor19);
		actorespelicula.add(actor20);
		actorespelicula.add(actor21);
		actorespelicula.add(actor22);
		actorespelicula.add(actor23);
		actorespelicula.add(actor24);
		actorespelicula.add(actor25);
		actorespelicula.add(actor26);
		actorespelicula.add(actor27);
		actorespelicula.add(actor28);
		actorespelicula.add(actor29);
		actorespelicula.add(actor30);
		actorespelicula.add(actor31);
		actorespelicula.add(actor32);
		actorespelicula.add(actor33);
		actorespelicula.add(actor34);
		actorespelicula.add(actor35);
		actorespelicula.add(actor36);
		actorespelicula.add(actor37);
		actorespelicula.add(actor38);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia5);
		reseniaspelicula.add(resenia6);
		reseniaspelicula.add(resenia7);
		reseniaspelicula.add(resenia8);
		reseniaspelicula.add(resenia9);

		Peliculas pelicula1 = new Peliculas("Nueve reinas",2000,"",114,"Buenos Aires. Juan y Marcos son dos estafadores de poca monta, uno joven y un veterano en el arte del timo, que casualmente se ven envueltos en un asunto que les puede hacer millonarios: tienen menos de un día para hacer una estafa que no puede fallar.",0,"imgs/peliculas/1.jpg","KWUs-smqOeQ",actorespelicula,director1,reseniaspelicula,usuario,genero0, true);

		this.peliculaService.add(pelicula1);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor0);
		actorespelicula.add(actor39);
		actorespelicula.add(actor40);
		actorespelicula.add(actor41);
		actorespelicula.add(actor42);
		actorespelicula.add(actor43);
		actorespelicula.add(actor44);
		actorespelicula.add(actor45);
		actorespelicula.add(actor46);
		actorespelicula.add(actor47);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia10);
		reseniaspelicula.add(resenia11);
		reseniaspelicula.add(resenia12);
		reseniaspelicula.add(resenia13);
		reseniaspelicula.add(resenia14);

		Peliculas pelicula2 = new Peliculas("El hijo de la novia",2001,"",124,"Rafael dedica 24 horas al día a su restaurante, está divorciado, ve muy poco a su hija, no tiene amigos y elude comprometerse con su novia. Además, desde hace mucho tiempo no visita a su madre, internada en un geriátrico porque sufre el mal de Alzheimer. Una serie de acontecimientos inesperados le obligan a replantearse su vida. Entre ellos, la intención que tiene su padre de cumplir el viejo sueño de su madre: casarse por la Iglesia.",0,"imgs/peliculas/2.jpg","",actorespelicula,director0,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula2);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor0);
		actorespelicula.add(actor48);
		actorespelicula.add(actor49);
		actorespelicula.add(actor50);
		actorespelicula.add(actor51);
		actorespelicula.add(actor52);
		actorespelicula.add(actor53);
		actorespelicula.add(actor54);
		actorespelicula.add(actor55);
		actorespelicula.add(actor56);
		actorespelicula.add(actor57);
		actorespelicula.add(actor58);
		actorespelicula.add(actor59);
		actorespelicula.add(actor60);
		actorespelicula.add(actor61);
		actorespelicula.add(actor62);
		actorespelicula.add(actor63);
		actorespelicula.add(actor64);
		actorespelicula.add(actor65);
		actorespelicula.add(actor66);
		actorespelicula.add(actor67);
		actorespelicula.add(actor68);
		actorespelicula.add(actor69);
		actorespelicula.add(actor70);
		actorespelicula.add(actor71);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia15);
		reseniaspelicula.add(resenia16);
		reseniaspelicula.add(resenia17);
		reseniaspelicula.add(resenia18);
		reseniaspelicula.add(resenia19);

		Peliculas pelicula3 = new Peliculas("Relatos salvajes",2014,"",119,"La película consta de seis episodios que alternan la intriga, la comedia y la violencia. Sus personajes se verán empujados hacia el abismo y hacia el innegable placer de perder el control, cruzando la delgada línea que separa la civilización de la barbarie.",0,"imgs/peliculas/3.jpg","kmHHPcT2zl8",actorespelicula,director2,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula3);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor72);
		actorespelicula.add(actor73);
		actorespelicula.add(actor74);
		actorespelicula.add(actor75);
		actorespelicula.add(actor76);
		actorespelicula.add(actor77);
		actorespelicula.add(actor78);
		actorespelicula.add(actor38);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia20);
		reseniaspelicula.add(resenia21);
		reseniaspelicula.add(resenia22);
		reseniaspelicula.add(resenia23);
		reseniaspelicula.add(resenia24);

		Peliculas pelicula4 = new Peliculas("Lugares comunes",2002,"",108,"Fernando Robles (Federico Luppi) es porteño, ya ha cumplido los sesenta y es profesor de literatura en la universidad. Enseña a enseñar. Lleva toda la vida casado con Liliana Rovira (Mercedes Sampietro), española, hija de catalanes, que trabaja como asistente social en barrios marginales de Buenos Aires. Se quieren, se respetan, son leales. Nunca se aburren estando juntos, les gusta estar solos.",0,"imgs/peliculas/4.jpg","fDioVsOSCWo",actorespelicula,director3,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula4);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor79);
		actorespelicula.add(actor80);
		actorespelicula.add(actor81);
		actorespelicula.add(actor82);
		actorespelicula.add(actor83);
		actorespelicula.add(actor84);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia25);
		reseniaspelicula.add(resenia26);
		reseniaspelicula.add(resenia27);
		reseniaspelicula.add(resenia28);
		reseniaspelicula.add(resenia29);

		Peliculas pelicula5 = new Peliculas("Historias extraordinarias",2008,"",245,"Se trata de los relatos que tienen como figuras centrales a tres forasteros, identificados cada uno con una inicial: H, X y Z, cada uno con una misión, que se irán revelando de a poco. Capítulo tras capítulo, Llinás describe lugares, situaciones, sus actitudes frente a las circunstancias y los hechos de los que son protagonistas o simples testigos, a partir de un relato en off (con las voces de Daniel Hendler, Juan Minujin y Verónica Llinás), escrito con formato literario, de manera que estos cuentos ilustrados no requieran diálogos entre los personajes.",0,"imgs/peliculas/5.jpg","mnp9CsY_Ufc",actorespelicula,director4,reseniaspelicula,usuario,genero3, true);

		this.peliculaService.add(pelicula5);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor85);
		actorespelicula.add(actor86);
		actorespelicula.add(actor87);
		actorespelicula.add(actor88);
		actorespelicula.add(actor89);
		actorespelicula.add(actor90);
		actorespelicula.add(actor91);
		actorespelicula.add(actor92);
		actorespelicula.add(actor93);
		actorespelicula.add(actor94);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia30);
		reseniaspelicula.add(resenia31);
		reseniaspelicula.add(resenia32);
		reseniaspelicula.add(resenia33);
		reseniaspelicula.add(resenia34);

		Peliculas pelicula6 = new Peliculas("El ciudadano ilustre",2016,"",118,"Es la historia de un escritor argentino, Premio Nobel de Literatura, que hace cuarenta años abandonó su pueblo y partió hacia Europa, donde triunfó escribiendo sobre su localidad natal y sus personajes. En el pico de su carrera, el alcalde de ese pueblo donde nació le invita para nombrarle &quot;Ciudadano Ilustre&quot; del mismo, y él decide cancelar su apretada agenda y aceptar la invitación.",0,"imgs/peliculas/6.jpg","VI2GLPtYCq8",actorespelicula,director5,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula6);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor95);
		actorespelicula.add(actor96);
		actorespelicula.add(actor97);
		actorespelicula.add(actor98);
		actorespelicula.add(actor99);
		actorespelicula.add(actor100);
		actorespelicula.add(actor101);
		actorespelicula.add(actor102);
		actorespelicula.add(actor103);
		actorespelicula.add(actor104);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia35);
		reseniaspelicula.add(resenia36);
		reseniaspelicula.add(resenia37);
		reseniaspelicula.add(resenia38);
		reseniaspelicula.add(resenia39);

		Peliculas pelicula7 = new Peliculas("Historias mínimas",2002,"",94,"A miles de kilómetros al sur de Buenos Aires, tres personajes viajan por las solitarias rutas de la Patagonia. Don Justo, un anciano de ochenta años, que es el dueño de un bar de carretera que regenta su hijo, se ha escapado de casa para buscar a su perro desaparecido desde hace tiempo: alguien le ha dicho que lo ha visto en San Julián. A medida que se acerca a esta población, ciertos datos hacen sospechar que las intenciones del anciano van más allá de encontrar al animal: debe resolver ciertos asuntos vitales para poder afrontar la muerte en paz consigo mismo.",0,"imgs/peliculas/7.jpg","DByCQgPmSRQ",actorespelicula,director6,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula7);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor105);
		actorespelicula.add(actor106);
		actorespelicula.add(actor107);
		actorespelicula.add(actor108);
		actorespelicula.add(actor109);
		actorespelicula.add(actor110);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia40);
		reseniaspelicula.add(resenia41);
		reseniaspelicula.add(resenia42);
		reseniaspelicula.add(resenia43);
		reseniaspelicula.add(resenia44);

		Peliculas pelicula8 = new Peliculas("The Motorcycle Diaries (Diarios de motocicleta)",2004,"",128,"En 1952, siendo el &quot;Che&quot; Guevara (Gael García Bernal) estudiante de medicina, recorrió América del Sur, con su amigo Alberto Granado (Rodrigo de la Serna), en una destartalada moto. Ernesto es un joven estudiante de medicina de 23 años de edad, especializado en lepra. Alberto es un bioquímico de 29 años. Ambos jóvenes emprenden un viaje de descubrimiento de la rica y compleja topografía humana y social del continente hispanoamericano.",0,"imgs/peliculas/8.jpg","Ygn1lNk_oTg",actorespelicula,director7,reseniaspelicula,usuario,genero4, true);

		this.peliculaService.add(pelicula8);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor111);
		actorespelicula.add(actor112);
		actorespelicula.add(actor113);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia45);
		reseniaspelicula.add(resenia46);
		reseniaspelicula.add(resenia47);
		reseniaspelicula.add(resenia48);

		Peliculas pelicula9 = new Peliculas("Medianeras",2004,"",28,"Buenos Aires es el escenario de esta historia. Mariana y Martín viven historias parecidas, viven soledades parecidas, viven neurosis parecidas, incluso viven en la misma calle, pero no pueden conocerse. Lo mismo que los une es lo que los separa: medianeras.",0,"imgs/peliculas/9.jpg","kDj9yoBJ0k8",actorespelicula,director8,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula9);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor114);
		actorespelicula.add(actor115);
		actorespelicula.add(actor112);
		actorespelicula.add(actor116);
		actorespelicula.add(actor15);
		actorespelicula.add(actor117);
		actorespelicula.add(actor118);
		actorespelicula.add(actor119);
		actorespelicula.add(actor120);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia49);
		reseniaspelicula.add(resenia50);
		reseniaspelicula.add(resenia51);
		reseniaspelicula.add(resenia52);

//		Peliculas pelicula10 = new Peliculas("Gilda, no me arrepiento de este amor",2016,"",116,"Esposa, madre y maestra jardinera de Devoto, con 30 años, Myriam Alejandra Bianchi decide cambiar el rumbo de su vida para siempre. Con su dulce voz, Gilda marcó la música tropical y se convirtió en un suceso de popularidad. Cuatro años más tarde, murió trágicamente en una ruta camino a la provincia de Entre Ríos. Su música influenció a artistas de todos los estilos y diferentes generaciones y su figura trascendió fronteras.",0,"imgs/peliculas/10.jpg","5lHR8uqQE2Y",actorespelicula,director9,reseniaspelicula,usuario,genero1, true);
//
//		this.peliculaService.add(pelicula10);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor121);
		actorespelicula.add(actor122);
		actorespelicula.add(actor123);
		actorespelicula.add(actor124);
		actorespelicula.add(actor125);
		actorespelicula.add(actor126);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia53);
		reseniaspelicula.add(resenia54);
		reseniaspelicula.add(resenia55);
		reseniaspelicula.add(resenia56);
		reseniaspelicula.add(resenia57);

		Peliculas pelicula11 = new Peliculas("Valentín",2003,"",79,"1969, Buenos Aires. Valentín es un niño de ocho años que vive con su abuela. Su madre desapareció cuando él tenía tres años, y su padre es un bala perdida incapaz de asumir responsabilidad alguna. Valentín es un niño solitario que busca constantemente el amor y el afecto. Su vida transcurre tranquilamente y sólo tiene dos obsesiones: ser astronauta y que su padre lo lleve junto a su madre.",0,"imgs/peliculas/11.jpg","U6GNaDYRomo",actorespelicula,director10,reseniaspelicula,usuario,genero2, true, 963);

		this.peliculaService.add(pelicula11);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor127);
		actorespelicula.add(actor128);
		actorespelicula.add(actor129);
		actorespelicula.add(actor130);
		actorespelicula.add(actor131);
		actorespelicula.add(actor132);
		actorespelicula.add(actor133);
		actorespelicula.add(actor134);
		actorespelicula.add(actor119);
		actorespelicula.add(actor17);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia58);
		reseniaspelicula.add(resenia59);
		reseniaspelicula.add(resenia60);
		reseniaspelicula.add(resenia61);
		reseniaspelicula.add(resenia62);

		Peliculas pelicula12 = new Peliculas("Tiempo de valientes",2005,"",110,"Mariano es un psicoanalista que, a raíz de un accidente de tráfico, es condenado a realizar trabajos comunitarios relacionados con su profesión. La tarea que el juez le asigna es la de atender a Alfredo, un inspector de la Policía Federal anímicamente devastado por la infidelidad de su mujer. Mariano tendrá que improvisar sus sesiones de psicoanálisis mientras acompaña a Alfredo en sus investigaciones.",0,"imgs/peliculas/12.jpg","tEIAEJxuu-w",actorespelicula,director2,reseniaspelicula,usuario,genero0, true);

		this.peliculaService.add(pelicula12);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor135);
		actorespelicula.add(actor136);
		actorespelicula.add(actor137);
		actorespelicula.add(actor138);
		actorespelicula.add(actor139);
		actorespelicula.add(actor140);
		actorespelicula.add(actor141);
		actorespelicula.add(actor142);
		actorespelicula.add(actor93);
		actorespelicula.add(actor143);
		actorespelicula.add(actor144);
		actorespelicula.add(actor145);
		actorespelicula.add(actor124);
		actorespelicula.add(actor146);
		actorespelicula.add(actor147);
		actorespelicula.add(actor148);
		actorespelicula.add(actor149);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia63);
		reseniaspelicula.add(resenia64);
		reseniaspelicula.add(resenia65);
		reseniaspelicula.add(resenia66);
		reseniaspelicula.add(resenia67);

		Peliculas pelicula13 = new Peliculas("Roma",2004,"",148,"La irrupción del periodista Manuel Cueto en la vida del escritor Joaquín Góñez, a instancias de la editorial para la que Joaquín está escribiendo su último libro, provocará un gran desasosiego en la solitaria vida de este hombre que vive de espaldas al mundo y rehuye sus propios recuerdos. Acostumbrado a la soledad, el encuentro con el joven periodista despertará en él emociones olvidadas que lo transportan a  la época de su niñez y a su locos años de juventud en Buenos Aires: los errores de la inexperiencia, el recuerdo de los amigos, de la lealtad, la influencia del cine y del jazz, el sabor del primer amor, y la íntima relación con sus padres, especialmente con su madre, Roma, una mujer inteligente, fuerte, comprensiva y comprometida con los ideales de juventud de su hijo.",0,"imgs/peliculas/13.jpg","aN9eVNpIDcY",actorespelicula,director3,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula13);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor72);
		actorespelicula.add(actor150);
		actorespelicula.add(actor151);
		actorespelicula.add(actor152);
		actorespelicula.add(actor153);
		actorespelicula.add(actor33);
		actorespelicula.add(actor154);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia68);
		reseniaspelicula.add(resenia69);
		reseniaspelicula.add(resenia70);
		reseniaspelicula.add(resenia71);
		reseniaspelicula.add(resenia72);

		Peliculas pelicula14 = new Peliculas("El viento",2005,"",100,"El dolor, la culpa y la búsqueda de la felicidad son los ejes de la historia de Frank (Federico Luppi), un campesino de la Patagonia que nunca salió de su pueblo. La muerte de su hija lo llevará hasta Buenos Aires para reencontrarse con su nieta Alina (Antonella Costa).",0,"imgs/peliculas/14.jpg","",actorespelicula,director11,reseniaspelicula,usuario,genero1, true, 1096);

		this.peliculaService.add(pelicula14);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor155);
		actorespelicula.add(actor156);
		actorespelicula.add(actor157);
		actorespelicula.add(actor158);
		actorespelicula.add(actor159);
		actorespelicula.add(actor72);
		actorespelicula.add(actor160);
		actorespelicula.add(actor161);
		actorespelicula.add(actor162);
		actorespelicula.add(actor163);
		actorespelicula.add(actor164);
		actorespelicula.add(actor165);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia73);
		reseniaspelicula.add(resenia74);
		reseniaspelicula.add(resenia75);
		reseniaspelicula.add(resenia76);
		reseniaspelicula.add(resenia77);

		Peliculas pelicula15 = new Peliculas("Elsa & Fred",2005,"",106,"Elsa (China Zorrilla), que tiene 82 años, es una mujer llena de vitalidad y con una imaginación desbordante. Alfredo (Manuel Alexandre), algo más joven que ella, ha sido siempre un hombre convencional, serio y responsable. Al quedar viudo, desconcertado y angustiado por la ausencia de su mujer, su hija lo anima a mudarse a un apartamento más pequeño.",0,"imgs/peliculas/15.jpg","9V7tAJgQzbs",actorespelicula,director12,reseniaspelicula,usuario,genero5, true);

		this.peliculaService.add(pelicula15);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor106);
		actorespelicula.add(actor166);
		actorespelicula.add(actor167);
		actorespelicula.add(actor168);
		actorespelicula.add(actor115);
		actorespelicula.add(actor169);
		actorespelicula.add(actor170);
		actorespelicula.add(actor116);
		actorespelicula.add(actor171);
		actorespelicula.add(actor172);
		actorespelicula.add(actor173);
		actorespelicula.add(actor174);
		actorespelicula.add(actor175);
		actorespelicula.add(actor176);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia78);
		reseniaspelicula.add(resenia79);
		reseniaspelicula.add(resenia80);
		reseniaspelicula.add(resenia81);
		reseniaspelicula.add(resenia82);

		Peliculas pelicula16 = new Peliculas("Crónica de una fuga",2006,"",103,"En 1977, durante el horror de la última dictadura militar argentina, un grupo de tareas secuestra a Claudio Tamburrini, arquero de un equipo de fútbol de la &quot;B&quot;, y lo traslada al centro Mansión Seré: una vieja y aristocrática casona ubicada en el barrio de Morón, en Buenos Aires. Allí, Claudio conoce a Guillermo, el Vasco y el Gallego.",0,"imgs/peliculas/16.jpg","MRKjxiKGuKk",actorespelicula,director13,reseniaspelicula,usuario,genero0, true);

		this.peliculaService.add(pelicula16);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor177);
		actorespelicula.add(actor66);
		actorespelicula.add(actor178);
		actorespelicula.add(actor99);
		actorespelicula.add(actor179);
		actorespelicula.add(actor180);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia83);
		reseniaspelicula.add(resenia84);
		reseniaspelicula.add(resenia85);
		reseniaspelicula.add(resenia86);
		reseniaspelicula.add(resenia87);

		Peliculas pelicula17 = new Peliculas("El perro",2004,"",95,"Coco ha trabajado toda su vida en una estación de servicio, pero cuando ésta se vende, se queda sin trabajo. Desocupado y sin muchas expectativas, sobrevive intentando vender cuchillos artesanales que él mismo fabrica. Un excelente perro dogo de pura raza acabará convirtiéndose no sólo en su amigo, sino en la única esperanza de una vida mejor.",0,"imgs/peliculas/17.jpg","",actorespelicula,director6,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula17);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor155);
		actorespelicula.add(actor42);
		actorespelicula.add(actor181);
		actorespelicula.add(actor182);
		actorespelicula.add(actor183);
		actorespelicula.add(actor184);
		actorespelicula.add(actor185);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia88);
		reseniaspelicula.add(resenia89);
		reseniaspelicula.add(resenia90);
		reseniaspelicula.add(resenia91);
		reseniaspelicula.add(resenia92);

		Peliculas pelicula18 = new Peliculas("Conversaciones con mamá",2004,"",86,"Mamá tiene ochenta y dos años y su hijo Jaime, cincuenta. Ambos viven en mundos muy diferentes. Jaime tiene mujer, dos hijos, una hermosa casa, dos coches y una suegra que atender. Mamá se las arregla sola y sobrelleva su vejez con dignidad. Pero un día ocurre lo inesperado; la empresa para la que trabaja Jaime lo deja en la calle por razones de reajuste de personal.",0,"imgs/peliculas/18.jpg","fyuxYGiRwLE",actorespelicula,director14,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula18);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor40);
		actorespelicula.add(actor128);
		actorespelicula.add(actor186);
		actorespelicula.add(actor187);
		actorespelicula.add(actor188);
		actorespelicula.add(actor189);
		actorespelicula.add(actor58);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia93);
		reseniaspelicula.add(resenia94);
		reseniaspelicula.add(resenia95);
		reseniaspelicula.add(resenia96);
		reseniaspelicula.add(resenia97);

		Peliculas pelicula19 = new Peliculas("Anita",2009,"",104,"Cuenta la historia de Anita, una joven con Síndrome de Down que, el día del atentado a la AMIA, el 18 de julio de 1994, aturdida por la gran explosión, se pierde en la gran ciudad. Anita es una mujer-niña. Tiene casi 35 años y vive con su madre Dora en pleno barrio del Once. Dora es su conexión con el mundo. Anita vive ligada a Dora, y Dora a su hija.",0,"imgs/peliculas/19.jpg","aG-ZVuOGxWk",actorespelicula,director12,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula19);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor11);
		actorespelicula.add(actor151);
		actorespelicula.add(actor190);
		actorespelicula.add(actor191);
		actorespelicula.add(actor192);
		actorespelicula.add(actor193);
		actorespelicula.add(actor194);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia98);
		reseniaspelicula.add(resenia99);
		reseniaspelicula.add(resenia100);
		reseniaspelicula.add(resenia101);
		reseniaspelicula.add(resenia102);

		Peliculas pelicula20 = new Peliculas("Felicidades",2000,"",100,"Es Nochebuena en Argentina. Un escritor famoso que no es feliz y que decide viajar al encuentro de su amada; un médico que quiere ligar con una española, y un odontólogo loco por encontrar el juguete que su hijo quiere de regalo. Una ácida visión sobre la otra cara de la navidad, donde la clase media insiste en sostener una celebración que ya ha perdido su naturaleza.",0,"imgs/peliculas/20.jpg","",actorespelicula,director15,reseniaspelicula,usuario,genero1, true, 630);

		this.peliculaService.add(pelicula20);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor195);
		actorespelicula.add(actor1);
		actorespelicula.add(actor196);
		actorespelicula.add(actor197);
		actorespelicula.add(actor198);
		actorespelicula.add(actor199);
		actorespelicula.add(actor119);
		actorespelicula.add(actor200);
		actorespelicula.add(actor201);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia103);
		reseniaspelicula.add(resenia104);
		reseniaspelicula.add(resenia105);
		reseniaspelicula.add(resenia106);
		reseniaspelicula.add(resenia107);

		Peliculas pelicula21 = new Peliculas("Un oso rojo",2002,"",94,"Aunque solo Oso lleva la cuenta, han pasado siete años desde que cayó preso por homicidio y robo a mano armada. Es un hombre parco, impredecible, violento por naturaleza o por necesidad, y es probable que en todos estos años no le haya dicho a nadie lo que oculta en sus silencios y la tristeza de su mirada. Ahora, mientras sale a la calle en libertad condicional, Oso piensa que tal vez pueda volver a empezar.",0,"imgs/peliculas/21.jpg","NX4Yx-ZwrPk",actorespelicula,director13,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula21);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor0);
		actorespelicula.add(actor202);
		actorespelicula.add(actor39);
		actorespelicula.add(actor203);
		actorespelicula.add(actor13);
		actorespelicula.add(actor204);
		actorespelicula.add(actor205);
		actorespelicula.add(actor206);
		actorespelicula.add(actor207);
		actorespelicula.add(actor208);
		actorespelicula.add(actor209);
		actorespelicula.add(actor210);
		actorespelicula.add(actor211);
		actorespelicula.add(actor212);
		actorespelicula.add(actor213);
		actorespelicula.add(actor214);
		actorespelicula.add(actor215);
		actorespelicula.add(actor216);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia108);
		reseniaspelicula.add(resenia109);
		reseniaspelicula.add(resenia110);
		reseniaspelicula.add(resenia111);
		reseniaspelicula.add(resenia112);

		Peliculas pelicula22 = new Peliculas("Kamchatka",2002,"",104,"Los difíciles años de la dictadura militar argentina son contemplados por Harry, un niño de diez años que lo único que desea es jugar y hacer travesuras con su hermano pequeño. Sin embargo, en 1976, cuando su familia, perseguida por la dictadura, se ve obligada a esconderse en el campo, comienza para él una nueva vida que pondrá fin a su infancia.",0,"imgs/peliculas/22.jpg","JkAWI_fS7Pc",actorespelicula,director16,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula22);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor200);
		actorespelicula.add(actor217);
		actorespelicula.add(actor218);
		actorespelicula.add(actor198);
		actorespelicula.add(actor219);
		actorespelicula.add(actor220);
		actorespelicula.add(actor221);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia113);
		reseniaspelicula.add(resenia114);
		reseniaspelicula.add(resenia115);
		reseniaspelicula.add(resenia116);
		reseniaspelicula.add(resenia117);

//		Peliculas pelicula23 = new Peliculas("Bolivia",2001,"",82,"Freddy emigra a Buenos Aires en busca de una vida más próspera. En su país natal, Bolivia, deja a su familia. Sin embargo, la capital argentina no es el paraíso que Freddy soñó, y mucho menos para los emigrantes ilegales como él. Pese a ello, consigue trabajo como cocinero en un restaurante. Un aclamado filme de bajo presupuesto premiado en varios festivales.",0,"imgs/peliculas/23.jpg","V31tISIoLsg",actorespelicula,director13,reseniaspelicula,usuario,genero1, true);
//
//		this.peliculaService.add(pelicula23);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor222);
		actorespelicula.add(actor223);
		actorespelicula.add(actor224);
		actorespelicula.add(actor225);
		actorespelicula.add(actor226);
		actorespelicula.add(actor227);
		actorespelicula.add(actor228);
		actorespelicula.add(actor229);
		actorespelicula.add(actor230);
		actorespelicula.add(actor231);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia118);
		reseniaspelicula.add(resenia119);
		reseniaspelicula.add(resenia120);
		reseniaspelicula.add(resenia121);
		reseniaspelicula.add(resenia122);

		Peliculas pelicula24 = new Peliculas("Leonera",2008,"",113,"Julia (Martina Gusman) es una joven acusada del asesinato de su novio. Aunque las circunstancias del crimen no están claras, acaba ingresando en prisión. Abatida y embarazada deberá adaptarse a su nueva vida en la cárcel, donde nacerá su hijo Tomás...",0,"imgs/peliculas/24.jpg","GxyVs7P1WZY",actorespelicula,director17,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula24);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor232);
		actorespelicula.add(actor233);
		actorespelicula.add(actor234);
		actorespelicula.add(actor235);
		actorespelicula.add(actor236);
		actorespelicula.add(actor183);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia123);
		reseniaspelicula.add(resenia124);
		reseniaspelicula.add(resenia125);
		reseniaspelicula.add(resenia126);
		reseniaspelicula.add(resenia127);

		Peliculas pelicula25 = new Peliculas("Aniceto",2008,"",82,"Aniceto (Hernán Piquín) es un hombre solitario que vive con su gallo en un pueblito de Mendoza. Francisca (Natalia Pelayo) es una chica ingenua que llega al lugar en busca de trabajo. Se conocen y se enamoran. Parece un sueño, pero termina en pesadilla cuando aparece la enigmática e irresistible Lucía (Alejandra Baldoni), su nueva vecina, que perturba al hombre y lo arrastra a su propia destrucción.",0,"imgs/peliculas/25.jpg","PKhaw_tMBHo",actorespelicula,director18,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula25);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor237);
		actorespelicula.add(actor238);
		actorespelicula.add(actor239);
		actorespelicula.add(actor22);
		actorespelicula.add(actor240);
		actorespelicula.add(actor241);
		actorespelicula.add(actor242);
		actorespelicula.add(actor243);
		actorespelicula.add(actor244);
		actorespelicula.add(actor245);
		actorespelicula.add(actor246);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia128);
		reseniaspelicula.add(resenia129);
		reseniaspelicula.add(resenia130);
		reseniaspelicula.add(resenia131);
		reseniaspelicula.add(resenia132);

		Peliculas pelicula26 = new Peliculas("Buena vida (Delivery)",2004,"",94,"Hernán tiene 24 años y un precario trabajo de mensajero. Desde que su familia emigró a España huyendo de la crisis por la que atraviesa Argentina, vive solo en su casa familiar, ahora vacía y llena de recuerdos. Está enamorado de Patricia (Pato), una empleada de una estación de servicio que está buscando hospedaje. Hernán se ofrece a alquilarle una habitación de su propia casa.",0,"imgs/peliculas/26.jpg","",actorespelicula,director19,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula26);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor40);
		actorespelicula.add(actor247);
		actorespelicula.add(actor144);
		actorespelicula.add(actor248);
		actorespelicula.add(actor18);
		actorespelicula.add(actor249);
		actorespelicula.add(actor250);
		actorespelicula.add(actor251);
		actorespelicula.add(actor252);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia133);
		reseniaspelicula.add(resenia134);
		reseniaspelicula.add(resenia135);
		reseniaspelicula.add(resenia136);
		reseniaspelicula.add(resenia137);

		Peliculas pelicula27 = new Peliculas("Cama adentro (Señora Beba)",2004,"",87,"Beba supo ser una dama de clase acomodada. Fue dueña de su propia casa de cosméticos, pero hoy se ve forzada a trabajar como vendedora puerta a puerta de productos de belleza. Sus gruesos pendientes de oro y su criada, Dora, son los últimos bastiones de un estatus que no se resigna a perder. Dora llegó a los 17 años desde la provincia del Chaco para trabajar `cama adentro` en la casa de la señora Beba.",0,"imgs/peliculas/27.jpg","",actorespelicula,director20,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula27);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor253);
		actorespelicula.add(actor254);
		actorespelicula.add(actor255);
		actorespelicula.add(actor256);
		actorespelicula.add(actor257);
		actorespelicula.add(actor258);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia138);
		reseniaspelicula.add(resenia139);
		reseniaspelicula.add(resenia140);
		reseniaspelicula.add(resenia141);
		reseniaspelicula.add(resenia142);

		Peliculas pelicula28 = new Peliculas("El artista",2008,"",91,"Jorge (Sergio Pángaro) es un enfermero que pasa de cuidar ancianos en un geriátrico a convertirse en el nuevo niño mimado de la escena artística bonaerense. Tras presentar como propias unas pinturas de uno de los ancianos, su vida simple y monótona se transforma de repente en un constante peregrinar por galerías de arte, universidades, programas de televisión, y reuniones con artistas e intelectuales.",0,"imgs/peliculas/28.jpg","OPnrG9veqpo",actorespelicula,director5,reseniaspelicula,usuario,genero2, true, 1247);

		this.peliculaService.add(pelicula28);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor259);
		actorespelicula.add(actor108);
		actorespelicula.add(actor260);
		actorespelicula.add(actor261);
		actorespelicula.add(actor262);
		actorespelicula.add(actor263);
		actorespelicula.add(actor264);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia143);
		reseniaspelicula.add(resenia144);
		reseniaspelicula.add(resenia145);
		reseniaspelicula.add(resenia146);
		reseniaspelicula.add(resenia147);

		Peliculas pelicula29 = new Peliculas("La ciénaga",2001,"",102,"Dos familias -una de clase media urbana y otra de productores rurales en decadencia- se entrecruzan en el sopor provinciano de una Salta caótica e inmutable, donde nada sucede pero todo está a punto de estallar.",0,"imgs/peliculas/29.jpg","q9j1y6suhgY",actorespelicula,director21,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula29);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor0);
		actorespelicula.add(actor42);
		actorespelicula.add(actor108);
		actorespelicula.add(actor265);
		actorespelicula.add(actor266);
		actorespelicula.add(actor267);
		actorespelicula.add(actor268);
		actorespelicula.add(actor46);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia148);
		reseniaspelicula.add(resenia149);
		reseniaspelicula.add(resenia150);
		reseniaspelicula.add(resenia151);
		reseniaspelicula.add(resenia152);

		Peliculas pelicula30 = new Peliculas("Luna de Avellaneda",2004,"",140,"Luna de Avellaneda, un club de barrio que vivió en el pasado una época de esplendor, está atravesando una crisis que pone en peligro su existencia. Al parecer, la única salida posible es que se convierta en un Casino, pero esto se aparta de los ideales y de los fines para los que fue fundado en los años 40: un club social, deportivo y cultural.",0,"imgs/peliculas/30.jpg","B2ZnKwQA33U",actorespelicula,director0,reseniaspelicula,usuario,genero1, true, 950);

		this.peliculaService.add(pelicula30);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor176);
		actorespelicula.add(actor269);
		actorespelicula.add(actor270);
		actorespelicula.add(actor271);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia153);
		reseniaspelicula.add(resenia154);
		reseniaspelicula.add(resenia155);
		reseniaspelicula.add(resenia156);
		reseniaspelicula.add(resenia157);

		Peliculas pelicula31 = new Peliculas("El cielito",2003,"",93,"Félix, un joven vagabundo de 20 años, llega a un pueblecito perdido del interior de Argentina. En la estación, se encuentra por casualidad con Roberto, un desocupado devenido en albañil, que le ofrece a Félix un trabajito en la chacra donde vive con su mujer, Mercedes, y su hijo Chango de apenas un año. Es ahí, en ese contexto de soledad, bajo el sol abrasador de La Pampa, donde Félix descubre poco a poco la tensión cotidiana, violenta y muda, en la cual ellos sobreviven.",0,"imgs/peliculas/31.jpg","NAypf4cLk4k",actorespelicula,director22,reseniaspelicula,usuario,genero1, true, 190);

		this.peliculaService.add(pelicula31);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor53);
		actorespelicula.add(actor272);
		actorespelicula.add(actor131);
		actorespelicula.add(actor221);
		actorespelicula.add(actor273);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia158);
		reseniaspelicula.add(resenia159);
		reseniaspelicula.add(resenia160);
		reseniaspelicula.add(resenia161);
		reseniaspelicula.add(resenia162);

		Peliculas pelicula32 = new Peliculas("Herencia",2002,"",94,"Dos extranjeros se encuentran en un restaurante en Buenos Aires. Olinda es una inmigrante italiana que llegó a Argentina después de la Segunda Guerra Mundial buscando un amor que nunca encontró. Con el tiempo compró un restaurante. Peter es un joven de solo 24 años que viaja buscando un amor perdido en su adolescencia. Ambos se conocen en el restaurante y, poco a poco, este mágico encuentro será para Peter una guía que le ayudará a encontrarse a sí mismo y, a la vez, devolverá a Olinda la posibilidad olvidada de elegir en la vida.",0,"imgs/peliculas/32.jpg","6W-EstREjqQ",actorespelicula,director23,reseniaspelicula,usuario,genero1, true, 230);

		this.peliculaService.add(pelicula32);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor49);
		actorespelicula.add(actor274);
		actorespelicula.add(actor166);
		actorespelicula.add(actor72);
		actorespelicula.add(actor3);
		actorespelicula.add(actor66);
		actorespelicula.add(actor275);
		actorespelicula.add(actor276);
		actorespelicula.add(actor277);
		actorespelicula.add(actor278);
		actorespelicula.add(actor279);
		actorespelicula.add(actor280);
		actorespelicula.add(actor281);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia163);
		reseniaspelicula.add(resenia164);
		reseniaspelicula.add(resenia165);
		reseniaspelicula.add(resenia166);
		reseniaspelicula.add(resenia167);

		Peliculas pelicula33 = new Peliculas("Al final del túnel",2016,"",120,"Joaquín está en silla de ruedas. Su casa, que conoció tiempos mejores, ahora es lúgubre y oscura. Berta, bailarina de striptease, y su hija Betty, llaman a su puerta respondiendo a un anuncio que puso Joaquín para alquilar una habitación. Su presencia alegra la casa y anima la vida de Joaquín. Una noche, mientras trabaja en su sótano, Joaquín escucha un ruido casi imperceptible.",0,"imgs/peliculas/33.jpg","eO0vwfzwuEI",actorespelicula,director24,reseniaspelicula,usuario,genero0, true);

		this.peliculaService.add(pelicula33);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor106);
		actorespelicula.add(actor282);
		actorespelicula.add(actor283);
		actorespelicula.add(actor284);
		actorespelicula.add(actor285);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();

		Peliculas pelicula34 = new Peliculas("Camino a La Paz",2015,"",92,"Sebastián (Rodrigo de la Serna) es un joven recién casado, fanático de Vox Dei. El protagonista, motivado por una necesidad económica, comienza a trabajar de remisero con su Peugeot 505. En este trabajo conoce a Khalil (Ernesto Suarez), un anciano poco gentil. Juntos emprenderán un largo viaje desde Buenos Aires hasta La Paz (Bolivia), donde se pondrá a prueba la relación de los dos protagonistas.",0,"imgs/peliculas/34.jpg","rGI1fFi8BHM",actorespelicula,director25,reseniaspelicula,usuario,genero1, true, 999);

		this.peliculaService.add(pelicula34);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor108);
		actorespelicula.add(actor16);
		actorespelicula.add(actor286);
		actorespelicula.add(actor287);
		actorespelicula.add(actor133);
		actorespelicula.add(actor288);
		actorespelicula.add(actor289);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia168);
		reseniaspelicula.add(resenia169);
		reseniaspelicula.add(resenia170);
		reseniaspelicula.add(resenia171);
		reseniaspelicula.add(resenia172);

		Peliculas pelicula35 = new Peliculas("Whisky Romeo Zulu",2004,"",107,"Whisky Romeo Zulu narra la historia previa al accidente del Boeing 737 de LAPA que, el 31 de agosto de 1999, se incendió tras impactar contra un terraplén en pleno centro de Buenos Aires, provocando la muerte de 67 personas. La catástrofe cambió la historia de la aviación civil y comercial en Argentina, y la película relata, desde la óptica del director -un ex piloto de líneas aéreas- cómo en algunos países la seguridad de los vuelos es increíblemente precaria.",0,"imgs/peliculas/35.jpg","",actorespelicula,director26,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula35);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor290);
		actorespelicula.add(actor291);
		actorespelicula.add(actor292);
		actorespelicula.add(actor293);
		actorespelicula.add(actor294);
		actorespelicula.add(actor58);
		actorespelicula.add(actor295);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia173);
		reseniaspelicula.add(resenia174);
		reseniaspelicula.add(resenia175);
		reseniaspelicula.add(resenia176);
		reseniaspelicula.add(resenia177);

		Peliculas pelicula36 = new Peliculas("El patrón, radiografía de un crimen",2014,"",99,"El patrón, radiografia de un crimen, se enfoca en un hecho criminal real sobre un hombre rural que llega a Buenos Aires en busca de trabajo y termina explotado por un siniestro patrón que lo obliga a vender carne podrida y que lo somete a una verdadera esclavitud, en el corazón de la Ciudad de Buenos Aires y en el siglo XXI.",0,"imgs/peliculas/36.jpg","h2eV-cSMpIU",actorespelicula,director27,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula36);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor296);
		actorespelicula.add(actor297);
		actorespelicula.add(actor298);
		actorespelicula.add(actor15);
		actorespelicula.add(actor299);
		actorespelicula.add(actor300);
		actorespelicula.add(actor301);
		actorespelicula.add(actor269);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia178);
		reseniaspelicula.add(resenia179);
		reseniaspelicula.add(resenia180);
		reseniaspelicula.add(resenia181);
		reseniaspelicula.add(resenia182);

//		Peliculas pelicula37 = new Peliculas("El Polaquito",2003,"",92,"Un chico de la calle, de 13 años de edad, se gana la vida cantando tangos en los trenes de la estación central de Buenos Aires. Imita a Polaco Goyeneche, el famoso cantante de tangos, por lo que la gente le conoce como &quot;El Polaquito&quot; (Abel Ayala). El Polaquito conoce a &quot;Pelu&quot; (Marina Glezer), una joven prostituta que también trabaja en la estación de Constitución, de la cual queda inmediatamente prendado y a la que intenta rescatar de la mafia que la explota.",0,"imgs/peliculas/37.jpg","PEVIHud1gXs",actorespelicula,director28,reseniaspelicula,usuario,genero1, true, 3600);
//
//		this.peliculaService.add(pelicula37);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor302);
		actorespelicula.add(actor303);
		actorespelicula.add(actor304);
		actorespelicula.add(actor256);
		actorespelicula.add(actor305);
		actorespelicula.add(actor306);
		actorespelicula.add(actor307);
		actorespelicula.add(actor308);
		actorespelicula.add(actor309);
		actorespelicula.add(actor310);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia183);
		reseniaspelicula.add(resenia184);
		reseniaspelicula.add(resenia185);
		reseniaspelicula.add(resenia186);
		reseniaspelicula.add(resenia187);

		Peliculas pelicula38 = new Peliculas("El hombre de al lado",2009,"",101,"La película narra un conflicto entre vecinos que parece no tener fin. Una simple pared medianera puede dividir dos mundos, dos maneras de vestir, de comer, de vivir. De un lado Leonardo (Rafael Spregelburd), fino y prestigioso diseñador que vive en una casa realizada por Le Corbusier. Del otro lado Víctor (Daniel Aráoz), vendedor de coches usados, vulgar, rústico y avasallador.",0,"imgs/peliculas/38.jpg","_haLmb7mdWI",actorespelicula,director5,reseniaspelicula,usuario,genero2, true, 653);

		this.peliculaService.add(pelicula38);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor311);
		actorespelicula.add(actor312);
		actorespelicula.add(actor313);
		actorespelicula.add(actor314);
		actorespelicula.add(actor38);
		actorespelicula.add(actor315);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia188);

		Peliculas pelicula39 = new Peliculas("76-89-03",2000,"",85,"La película cuenta la historia de tres amigos y su sueño en común, a lo largo de tres momentos históricos claves de la Argentina. Todo comienza en 1976, con la aparición de una sex symbol que despierta los primeros ratones de cada uno de ellos. Continúa y se desarrolla en 1989, durante la noche de mayor hiperinflación. Ante la decadencia del país, la aún famosísima sex symbol es sospechada de prostitución, motivo por el cual nuestro protagónico trío se lanza a la caza de la afamada diva.",0,"imgs/peliculas/39.jpg","",actorespelicula,director29,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula39);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor316);
		actorespelicula.add(actor317);
		actorespelicula.add(actor318);
		actorespelicula.add(actor319);
		actorespelicula.add(actor11);
		actorespelicula.add(actor107);
		actorespelicula.add(actor172);
		actorespelicula.add(actor18);
		actorespelicula.add(actor184);
		actorespelicula.add(actor179);
		actorespelicula.add(actor320);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia189);
		reseniaspelicula.add(resenia190);
		reseniaspelicula.add(resenia191);

		Peliculas pelicula40 = new Peliculas("Las mantenidas sin sueños",2005,"",88,"Una madre que no sabe qué hacer con su hija. Eugenia, su hija, sí sabe qué haría siendo madre. Olga, ¿una vecina o parte de la familia? Celina, ¿crisis vocacional o vocación de moda? Sara, ¿abuela o marido? Lola, ¿se quedó sin nada o nunca tuvo? Aquí ninguna puede nada sola. Juntas pueden llegar a soñar aunque sea algo.",0,"imgs/peliculas/40.jpg","",actorespelicula,director30,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula40);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor11);
		actorespelicula.add(actor194);
		actorespelicula.add(actor123);
		actorespelicula.add(actor16);
		actorespelicula.add(actor321);
		actorespelicula.add(actor12);
		actorespelicula.add(actor38);
		actorespelicula.add(actor322);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia192);
		reseniaspelicula.add(resenia193);
		reseniaspelicula.add(resenia194);
		reseniaspelicula.add(resenia195);

		Peliculas pelicula41 = new Peliculas("La suerte está echada",2005,"",99,"Comedia que habla de la suerte, del destino y del afecto de dos hermanastros muy diferentes, que han vivido distanciados durante años. Es su padre quien los vuelve a unir en una circunstancia muy particular.",0,"imgs/peliculas/41.jpg","PmEk7dG_9MY",actorespelicula,director31,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula41);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor323);
		actorespelicula.add(actor324);
		actorespelicula.add(actor325);
		actorespelicula.add(actor326);
		actorespelicula.add(actor327);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia196);
		reseniaspelicula.add(resenia197);
		reseniaspelicula.add(resenia198);
		reseniaspelicula.add(resenia199);
		reseniaspelicula.add(resenia200);

		Peliculas pelicula42 = new Peliculas("Peter Capusotto y sus 3 dimensiones (Peter Capusotto y sus tres dimensiones)",2012,"",93,"En una época de progreso tecnológico y de posibilidades ilimitadas de entretenimiento, Violencia Rivas, una cantante argentina, pionera del punk en los 60, declara que la excesiva diversión es nociva y constituye un síntoma esencial de la decadencia de la humanidad. Conjunto de historias breves que muestran cómo la relación de los seres humanos con el cine, la radio, internet, el video home y otras prácticas tecnológicas deteriora las relaciones personales al convertir el entretenimiento en algo más interesante que la vida.",0,"imgs/peliculas/42.jpg","RgmConQ8z20",actorespelicula,director32,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula42);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor48);
		actorespelicula.add(actor328);
		actorespelicula.add(actor329);
		actorespelicula.add(actor330);
		actorespelicula.add(actor331);
		actorespelicula.add(actor332);
		actorespelicula.add(actor333);
		actorespelicula.add(actor334);
		actorespelicula.add(actor335);
		actorespelicula.add(actor139);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia201);
		reseniaspelicula.add(resenia202);
		reseniaspelicula.add(resenia203);
		reseniaspelicula.add(resenia204);

		Peliculas pelicula43 = new Peliculas("El juego de Arcibel",2003,"",115,"En la República de Miranda, imaginario país de Hispanoamérica que vive bajo la dictadura del General Abalorio, Arcibel Alegría, un periodista que escribe sobre ajedrez, es encarcelado por culpa de una confusión en la programación del diario en el que trabaja. Él, un hombre solitario y apolítico, empieza a conocer en la cárcel una realidad que le era completamente ajena.",0,"imgs/peliculas/43.jpg","aZVMR2g8wUE",actorespelicula,director33,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula43);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor336);
		actorespelicula.add(actor112);
		actorespelicula.add(actor337);
		actorespelicula.add(actor338);
		actorespelicula.add(actor339);
		actorespelicula.add(actor340);
		actorespelicula.add(actor341);
		actorespelicula.add(actor342);
		actorespelicula.add(actor343);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia205);
		reseniaspelicula.add(resenia206);
		reseniaspelicula.add(resenia207);
		reseniaspelicula.add(resenia208);
		reseniaspelicula.add(resenia209);

		Peliculas pelicula44 = new Peliculas("Medianeras",2011,"",94,"Mariana y Martín viven en la misma manzana en diferentes edificios; pero, aunque sus caminos se cruzan, no llegan a encontrarse. Martín diseña páginas web. Mariana es arquitecta, pero trabaja como decoradora de vidrieras. Además de desilusiones recientes, los dos tienen muchas cosas en común. Viven en el centro de Buenos Aires. La ciudad los une y a la vez los separa.",0,"imgs/peliculas/44.jpg","",actorespelicula,director8,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula44);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor4);
		actorespelicula.add(actor344);
		actorespelicula.add(actor345);
		actorespelicula.add(actor346);
		actorespelicula.add(actor347);
		actorespelicula.add(actor348);
		actorespelicula.add(actor349);
		actorespelicula.add(actor350);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia210);
		reseniaspelicula.add(resenia211);
		reseniaspelicula.add(resenia212);
		reseniaspelicula.add(resenia213);
		reseniaspelicula.add(resenia214);

		Peliculas pelicula45 = new Peliculas("El clan",2015,"",110,"La historia se basa en el caso policial del Clan Puccio, que conmocionó a la sociedad argentina a principios de los 80. Tras la aparente normalidad de la familia Puccio se oculta un siniestro clan dedicado al secuestro y al asesinato. Arquímedes, el patriarca, miembro del Servicio de Inteligencia desde la dictadura, lidera y planifica las operaciones.",0,"imgs/peliculas/45.jpg","",actorespelicula,director17,reseniaspelicula,usuario,genero0, true);

		this.peliculaService.add(pelicula45);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor351);
		actorespelicula.add(actor352);
		actorespelicula.add(actor289);
		actorespelicula.add(actor353);
		actorespelicula.add(actor354);
		actorespelicula.add(actor47);
		actorespelicula.add(actor355);
		actorespelicula.add(actor182);
		actorespelicula.add(actor356);
		actorespelicula.add(actor357);
		actorespelicula.add(actor358);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia215);
		reseniaspelicula.add(resenia216);
		reseniaspelicula.add(resenia217);
		reseniaspelicula.add(resenia218);
		reseniaspelicula.add(resenia219);

		Peliculas pelicula46 = new Peliculas("El abrazo partido",2003,"",100,"Narra la historia de un &quot;adolescente tardío&quot; que busca un pasaporte para huir de Argentina pero al que el regreso de su padre, que abandonó a la familia por un ideal, le trastoca los planes. Pese a ello, y gracias a este reencuentro, el hijo buscará a través de su padre su propia identidad.",0,"imgs/peliculas/46.jpg","qHvys9ERRkg",actorespelicula,director34,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula46);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor51);
		actorespelicula.add(actor106);
		actorespelicula.add(actor338);
		actorespelicula.add(actor359);
		actorespelicula.add(actor360);
		actorespelicula.add(actor361);
		actorespelicula.add(actor362);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia220);
		reseniaspelicula.add(resenia221);
		reseniaspelicula.add(resenia222);
		reseniaspelicula.add(resenia223);

		Peliculas pelicula47 = new Peliculas("Inseparables",2016,"",107,"Felipe un empresario adinerado que ha quedado tetrapléjico, debido a un accidente, está buscando a un asistente terapéutico. Se presentan varios muy calificados, pero él decide tomar al ayudante de su jardinero, Tito que ha decidido renunciar. Tito no reúne ni por cerca las condiciones requeridas para tal empleo, cosa que notan inmediatamente las personas más cercanas a Felipe: Verónica e Ivonne su ama de llaves, pero Felipe mantiene firme su decisión.",0,"imgs/peliculas/47.jpg","k7E3MtBLf6U",actorespelicula,director12,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula47);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor363);
		actorespelicula.add(actor364);
		actorespelicula.add(actor114);
		actorespelicula.add(actor365);
		actorespelicula.add(actor366);
		actorespelicula.add(actor367);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia224);
		reseniaspelicula.add(resenia225);
		reseniaspelicula.add(resenia226);
		reseniaspelicula.add(resenia227);
		reseniaspelicula.add(resenia228);

		Peliculas pelicula48 = new Peliculas("Infancia clandestina",2012,"",110,"Después de vivir en el exilio, Juan, un niño de doce años, regresa con su familia a Argentina, donde todavía gobierna la Junta militar que les obligó a huir. Aunque es testigo de la actitud combativa de sus padres, intenta llevar una vida normal, en la que el colegio, las fiestas, las acampadas, las bromas y las risas con mamá también tienen su lugar.",0,"imgs/peliculas/48.jpg","",actorespelicula,director35,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula48);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor265);
		actorespelicula.add(actor368);
		actorespelicula.add(actor123);
		actorespelicula.add(actor339);
		actorespelicula.add(actor369);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia229);
		reseniaspelicula.add(resenia230);
		reseniaspelicula.add(resenia231);
		reseniaspelicula.add(resenia232);
		reseniaspelicula.add(resenia233);

		Peliculas pelicula49 = new Peliculas("La antena",2007,"",87,"Una ciudad entera se ha quedado sin voz y vive bajo un largo y crudo invierno. Un hombre malvado y sin escrúpulos, el Sr. T.V., dueño absoluto de las imágenes que animan esta ciudad y de una extensa cadena de productos bajo su sello personal, lleva adelante un siniestro plan secreto para someter eternamente a cada una de las almas que habitan este lugar.",0,"imgs/peliculas/49.jpg","",actorespelicula,director36,reseniaspelicula,usuario,genero6, true);

		this.peliculaService.add(pelicula49);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor0);
		actorespelicula.add(actor370);
		actorespelicula.add(actor371);
		actorespelicula.add(actor372);
		actorespelicula.add(actor373);
		actorespelicula.add(actor374);
		actorespelicula.add(actor375);
		actorespelicula.add(actor376);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia234);
		reseniaspelicula.add(resenia235);
		reseniaspelicula.add(resenia236);
		reseniaspelicula.add(resenia237);
		reseniaspelicula.add(resenia238);

		Peliculas pelicula50 = new Peliculas("Un cuento chino",2011,"",93,"Roberto, un hombre marcado por un duro revés que arruinó y paralizó su vida hace más de veinte años, vive atrincherado frente al mundo y en completa soledad en su ferretería. Sin embargo, un día, un extraño acontecimiento logra sacarlo de su aislamiento y ponerlo de nuevo en contacto con la realidad: en su vida aparece un chino que no sabe una palabra de español, y Roberto desea devolver al joven con los suyos.",0,"imgs/peliculas/50.jpg","onfIJVgS3Fo",actorespelicula,director31,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula50);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor377);
		actorespelicula.add(actor378);
		actorespelicula.add(actor379);
		actorespelicula.add(actor380);
		actorespelicula.add(actor381);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia239);
		reseniaspelicula.add(resenia240);
		reseniaspelicula.add(resenia241);
		reseniaspelicula.add(resenia242);
		reseniaspelicula.add(resenia243);

		Peliculas pelicula51 = new Peliculas("Hawaii",2013,"",106,"Eugenio pasa el verano cuidando la casa de sus tíos, que alguna vez fue suya, mientras busca inspiración para un guion que está escribiendo. Martín no tiene ninguna ocupación y se ofrece a trabajar en esa casa haciendo todo tipo de arreglos. Se conocieron hace tiempo, siendo chicos, y no se volvieron a ver desde entonces.",0,"imgs/peliculas/51.jpg","DU0qmw2Ct0o",actorespelicula,director37,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula51);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor382);
		actorespelicula.add(actor383);
		actorespelicula.add(actor269);
		actorespelicula.add(actor384);
		actorespelicula.add(actor385);
		actorespelicula.add(actor386);
		actorespelicula.add(actor387);
		actorespelicula.add(actor388);
		actorespelicula.add(actor389);
		actorespelicula.add(actor390);
		actorespelicula.add(actor391);
		actorespelicula.add(actor392);
		actorespelicula.add(actor393);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia244);
		reseniaspelicula.add(resenia245);
		reseniaspelicula.add(resenia246);
		reseniaspelicula.add(resenia247);
		reseniaspelicula.add(resenia248);

		Peliculas pelicula52 = new Peliculas("El bonaerense",2002,"",99,"EL Zapa es cerrajero en un pueblo pequeño de la Provincia de Buenos Aires. El pueblo es tranquilo, trabajo de cerrajería hay muy poco y las horas de trabajo pasan lentamente. El Polaco, el dueño del local lo envía a abrir una caja fuerte en una oficina. Al día siguiente cae preso como responsable del robo al lugar. Su tío Ismael, policía Bonaerense retirado, lo saca de la comisaría y lo envía al Gran Buenos Aires con una carta de recomendación.",0,"imgs/peliculas/52.jpg","nADus4wBFSA",actorespelicula,director17,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula52);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor394);
		actorespelicula.add(actor395);
		actorespelicula.add(actor396);
		actorespelicula.add(actor397);
		actorespelicula.add(actor398);
		actorespelicula.add(actor399);
		actorespelicula.add(actor400);
		actorespelicula.add(actor401);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia249);
		reseniaspelicula.add(resenia250);
		reseniaspelicula.add(resenia251);
		reseniaspelicula.add(resenia252);
		reseniaspelicula.add(resenia253);

		Peliculas pelicula53 = new Peliculas("Los muertos",2004,"",78,"Un hombre de cincuenta y cuatro años sale de una cárcel en la provincia de Corrientes. Lo único que quiere es llegar hasta donde está su hija, que vive en un lugar perdido rodeado de agua y selva. Para llegar hasta donde está su familia deberá atravesar un largo trayecto de agua en una canoa.",0,"imgs/peliculas/53.jpg","",actorespelicula,director38,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula53);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor49);
		actorespelicula.add(actor72);
		actorespelicula.add(actor288);
		actorespelicula.add(actor196);
		actorespelicula.add(actor402);
		actorespelicula.add(actor403);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia254);
		reseniaspelicula.add(resenia255);
		reseniaspelicula.add(resenia256);
		reseniaspelicula.add(resenia257);
		reseniaspelicula.add(resenia258);

		Peliculas pelicula54 = new Peliculas("Sin retorno",2010,"",104,"Un joven ciclista muere atropellado por un automóvil. El culpable huye sin dejar rastro. Pero el padre de la víctima, con el apoyo de los medios de comunicación, exige que se encuentre al responsable y se haga justicia. Una serie de hechos fortuitos y unos magistrados contaminados por la opinión pública harán que un hombre inocente se siente en el banquillo de los acusados.",0,"imgs/peliculas/54.jpg","2AMAsUlb48M",actorespelicula,director39,reseniaspelicula,usuario,genero0, true);

		this.peliculaService.add(pelicula54);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor387);
		actorespelicula.add(actor404);
		actorespelicula.add(actor405);
		actorespelicula.add(actor406);
		actorespelicula.add(actor407);
		actorespelicula.add(actor408);
		actorespelicula.add(actor409);
		actorespelicula.add(actor410);
		actorespelicula.add(actor411);
		actorespelicula.add(actor412);
		actorespelicula.add(actor413);
		actorespelicula.add(actor414);
		actorespelicula.add(actor415);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia259);
		reseniaspelicula.add(resenia260);
		reseniaspelicula.add(resenia261);
		reseniaspelicula.add(resenia262);
		reseniaspelicula.add(resenia263);

		Peliculas pelicula55 = new Peliculas("Familia rodante",2004,"",103,"La abuela Emilia cumple 84 años... Muy emocionada, anuncia a toda su familia que su sobrina la ha elegido como madrina de su boda, que se celebrará a 1.500 kilómetros de allí. Para ese largo periplo de Buenos Aires a Misiones, lugar de su nacimiento, Emilia desea que todos la acompañen. Como nadie se atreve a negárselo, se ponen en marcha en una caravana.",0,"imgs/peliculas/55.jpg","8SKwK89P2p8",actorespelicula,director17,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula55);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor416);
		actorespelicula.add(actor417);
		actorespelicula.add(actor418);
		actorespelicula.add(actor419);
		actorespelicula.add(actor420);
		actorespelicula.add(actor245);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia264);
		reseniaspelicula.add(resenia265);
		reseniaspelicula.add(resenia266);
		reseniaspelicula.add(resenia267);
		reseniaspelicula.add(resenia268);

		Peliculas pelicula56 = new Peliculas("El último Elvis",2012,"",92,"Carlos Gutiérrez, &quot;Elvis&quot;, es un cantante separado que vive en un olvidado barrio de Buenos Aires y que tiene una pequeña hija llamada Lisa Marie, a la que no ve muy seguido. Siempre vivió su vida como si fuese la reencarnación de Elvis Presley, negándose a aceptar su realidad. Pero está a punto de cumplir los años que su ídolo tenía al morir y su futuro se muestra vacío.",0,"imgs/peliculas/56.jpg","kGZ1ysL8rAc",actorespelicula,director40,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula56);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor11);
		actorespelicula.add(actor421);
		actorespelicula.add(actor422);
		actorespelicula.add(actor244);
		actorespelicula.add(actor423);
		actorespelicula.add(actor424);
		actorespelicula.add(actor106);
		actorespelicula.add(actor425);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia269);
		reseniaspelicula.add(resenia270);
		reseniaspelicula.add(resenia271);
		reseniaspelicula.add(resenia272);
		reseniaspelicula.add(resenia273);

		Peliculas pelicula57 = new Peliculas("Nueces para el amor",2001,"",103,"En 1975, unos meses antes del comienzo de la dictadura militar argentina, Alicia y Marcelo se conocen en un concierto de rock. El amor surge inmediatamente entre ellos, pero el retorno del novio de Alicia provoca la separación. En 1982, en Madrid, sus caminos vuelven a cruzarse. Tras el encuentro, se dan cuenta de que, a pesar de que el amor sigue latente, sus destinos discurren por rumbos separados.",0,"imgs/peliculas/57.jpg","LuqlNpSN1eM",actorespelicula,director33,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula57);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor426);
		actorespelicula.add(actor292);
		actorespelicula.add(actor427);
		actorespelicula.add(actor247);
		actorespelicula.add(actor428);
		actorespelicula.add(actor353);
		actorespelicula.add(actor298);
		actorespelicula.add(actor429);
		actorespelicula.add(actor430);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia274);
		reseniaspelicula.add(resenia275);
		reseniaspelicula.add(resenia276);
		reseniaspelicula.add(resenia277);
		reseniaspelicula.add(resenia278);

		Peliculas pelicula58 = new Peliculas("El resultado del amor",2007,"",94,"Mabel trabaja alternando la animación de fiestas infantiles con la prostitución. A los 20 años se cruza con Martín, un abogado que se ha separado de su esposa, y deja el estudio para el cual trabajaba. Se atraen mutuamente y terminan enamorándose. Al poco tiempo Mabel descubre que es portadora del virus VIH.",0,"imgs/peliculas/58.jpg","u1qYwZotIZ8",actorespelicula,director41,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula58);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor431);
		actorespelicula.add(actor432);
		actorespelicula.add(actor433);
		actorespelicula.add(actor434);
		actorespelicula.add(actor435);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia279);
		reseniaspelicula.add(resenia280);
		reseniaspelicula.add(resenia281);
		reseniaspelicula.add(resenia282);
		reseniaspelicula.add(resenia283);

		Peliculas pelicula59 = new Peliculas("El camino de San Diego",2006,"",98,"Tati, un joven de la provincia de Misiones, es un fan loco de Maradona, como la mayoría de los argentinos. A pesar de haber perdido su trabajo y de que su situación económica sea dramática, Tati no pierde su espíritu jovial. Cuando la televisión informa del internamiento de Maradona en la Clínica Suizo Argentina de Buenos Aires por un problema cardíaco, Tati decide viajar a la capital para hacerle entrega personalmente de una talla esculpida en madera.",0,"imgs/peliculas/59.jpg","",actorespelicula,director6,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula59);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor436);
		actorespelicula.add(actor380);
		actorespelicula.add(actor437);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia284);
		reseniaspelicula.add(resenia285);
		reseniaspelicula.add(resenia286);
		reseniaspelicula.add(resenia287);
		reseniaspelicula.add(resenia288);

		Peliculas pelicula60 = new Peliculas("Rancho aparte",2007,"",90,"Había una vez, en un lugar llamado Nogolí, un rancho de paredes de barro y piedra, donde vivían Tulio y Susana. La vida transcurría con rutinas, casi sólo con rutinas y el mundo era ancho y ajeno. En ese pequeño mundo, todo era conocido, todo era compartido, los recuerdos, los rencores, los gustos y los muertos. Fuera de allí todo era extraño, distinto, inconveniente, peligroso.",0,"imgs/peliculas/60.jpg","",actorespelicula,director42,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula60);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor438);
		actorespelicula.add(actor439);
		actorespelicula.add(actor351);
		actorespelicula.add(actor440);
		actorespelicula.add(actor441);
		actorespelicula.add(actor442);
		actorespelicula.add(actor198);
		actorespelicula.add(actor443);
		actorespelicula.add(actor444);
		actorespelicula.add(actor445);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia289);
		reseniaspelicula.add(resenia290);
		reseniaspelicula.add(resenia291);
		reseniaspelicula.add(resenia292);
		reseniaspelicula.add(resenia293);

		Peliculas pelicula61 = new Peliculas("No sabe, no contesta",2002,"",90,"No sabe, no contesta cuenta la historia de Joaquín, que estudia cine y le gusta Laura. Tres días en cuatro capítulos en cuatro historias de cuatro amigos. Tres días en la historia de Joaquín que tiene tres amigos. Marcos, que tiene una novia que queda embarazada de otro. Damián, que tiene una novia que se acuesta con otro. David, que se acuesta con la novia de Damián.",0,"imgs/peliculas/61.jpg","",actorespelicula,director43,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula61);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor67);
		actorespelicula.add(actor446);
		actorespelicula.add(actor447);
		actorespelicula.add(actor448);
		actorespelicula.add(actor449);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia294);

		Peliculas pelicula62 = new Peliculas("La larga noche de Francisco Sanctis",2016,"",78,"Adaptación de la novela homónima de Humberto Costantini, situada en Buenos Aires en 1977. Un hombre recibe, en plena dictadura, la información del paradero de dos personas buscadas por los militares. Ahora tiene la posibilidad de salvarlas, aunque eso implica arriesgar su propia vida.",0,"imgs/peliculas/62.jpg","j_3eIV4bj1k",actorespelicula,director44,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula62);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor337);
		actorespelicula.add(actor0);
		actorespelicula.add(actor265);
		actorespelicula.add(actor450);
		actorespelicula.add(actor451);
		actorespelicula.add(actor452);
		actorespelicula.add(actor453);
		actorespelicula.add(actor365);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia295);
		reseniaspelicula.add(resenia296);
		reseniaspelicula.add(resenia297);
		reseniaspelicula.add(resenia298);
		reseniaspelicula.add(resenia299);

		Peliculas pelicula63 = new Peliculas("XXY",2007,"",86,"Álex (Inés Efron) es una singular adolescente de quince años que esconde un secreto. Poco después de su nacimiento, sus padres, Kraken (Ricardo Darín) y Suli (Valeria Bertuccelli), decidieron dejar Buenos Aires para vivir, aislados del mundo, en una cabaña de madera a orillas del mar. Lo que pretendían era que su hija creciera libre de cualquier tipo de prejuicios, protegida y feliz, hasta que llegara el momento de decidir qué camino debía seguir.",0,"imgs/peliculas/63.jpg","lvimt276vDI",actorespelicula,director45,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula63);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor454);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia300);
		reseniaspelicula.add(resenia301);
		reseniaspelicula.add(resenia302);

		Peliculas pelicula64 = new Peliculas("Martín Fierro, la película",2007,"",88,"Martín Fierro es un renegado que lucha contra la corrupción que intenta someterlo y quitarle lo más preciado de su vida: La libertad.",0,"imgs/peliculas/64.jpg","3kIWUqcukdE",actorespelicula,director46,reseniaspelicula,usuario,genero7, true);

		this.peliculaService.add(pelicula64);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor0);
		actorespelicula.add(actor222);
		actorespelicula.add(actor455);
		actorespelicula.add(actor456);
		actorespelicula.add(actor457);
		actorespelicula.add(actor458);
		actorespelicula.add(actor459);
		actorespelicula.add(actor460);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia303);
		reseniaspelicula.add(resenia304);
		reseniaspelicula.add(resenia305);
		reseniaspelicula.add(resenia306);
		reseniaspelicula.add(resenia307);

		Peliculas pelicula65 = new Peliculas("Carancho",2010,"",107,"Después de haber perdido su licencia, el abogado Sosa (Ricardo Darín) ingresa en una sociedad ilegal que se encarga de provocar accidentes automovilísticos para estafar a las aseguradoras. El destino hace que un día Sosa conozca a Luján (Martina Gusmán), una médica de un hospital de Buenos Aires.",0,"imgs/peliculas/65.jpg","geZmmTil9fM",actorespelicula,director17,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula65);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor461);
		actorespelicula.add(actor350);
		actorespelicula.add(actor462);
		actorespelicula.add(actor463);
		actorespelicula.add(actor292);
		actorespelicula.add(actor464);
		actorespelicula.add(actor465);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia308);
		reseniaspelicula.add(resenia309);
		reseniaspelicula.add(resenia310);
		reseniaspelicula.add(resenia311);
		reseniaspelicula.add(resenia312);

		Peliculas pelicula66 = new Peliculas("El último verano de la Boyita",2009,"",93,"La Boyita es una casa rodante que tiene la mágica capacidad de flotar. Una especie de anfibio doméstico, un refugio para Jorgelina, una niña que está a punto de alcanzar la adolescencia. Cuando va a pasar las vacaciones al campo junto a su papá, conoce a Mario, un niño que le plantea a Jorgelina dudas que no sabe cómo afrontar.",0,"imgs/peliculas/66.jpg","",actorespelicula,director47,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula66);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor466);
		actorespelicula.add(actor467);
		actorespelicula.add(actor468);
		actorespelicula.add(actor469);
		actorespelicula.add(actor470);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia313);
		reseniaspelicula.add(resenia314);
		reseniaspelicula.add(resenia315);
		reseniaspelicula.add(resenia316);
		reseniaspelicula.add(resenia317);

//		Peliculas pelicula67 = new Peliculas("La libertad",2001,"",73,"Misael vive en la inmensidad del monte pampeano trabajando con su hacha. Sobrevive sólo con lo indispensable y casi sin contacto con otras personas. Vemos su vida minuto a minuto intentando descubrir a través de pequeños movimientos o acciones su manera de estar en el mundo.",0,"imgs/peliculas/67.jpg","Lx4Cvk9SJ2c",actorespelicula,director38,reseniaspelicula,usuario,genero1, true);
//
//		this.peliculaService.add(pelicula67);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor471);
		actorespelicula.add(actor472);
		actorespelicula.add(actor473);
		actorespelicula.add(actor474);
		actorespelicula.add(actor475);
		actorespelicula.add(actor476);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia318);
		reseniaspelicula.add(resenia319);
		reseniaspelicula.add(resenia320);
		reseniaspelicula.add(resenia321);
		reseniaspelicula.add(resenia322);

		Peliculas pelicula68 = new Peliculas("Cautiva",2004,"",115,"Cristina, una joven de 15 años, es sacada de su clase en un estricto colegio católico de Buenos Aires y llevada ante un juez, quien le revela que ella es en realidad Sofía Lombardi, la hija de una pareja de jóvenes arquitectos militantes desaparecidos en los años 70, durante la dictadura militar argentina.",0,"imgs/peliculas/68.jpg","gffrHzRVSck",actorespelicula,director48,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula68);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor0);
		actorespelicula.add(actor477);
		actorespelicula.add(actor16);
		actorespelicula.add(actor151);
		actorespelicula.add(actor478);
		actorespelicula.add(actor479);
		actorespelicula.add(actor480);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia323);
		reseniaspelicula.add(resenia324);
		reseniaspelicula.add(resenia325);
		reseniaspelicula.add(resenia326);
		reseniaspelicula.add(resenia327);

		Peliculas pelicula69 = new Peliculas("El aura",2005,"",138,"Esteban Espinosa (Ricardo Darín) es un hombre honrado, aunque taciturno y hosco. Es un taxidermista que, aislado en su taller, dedica el tiempo a dar apariencia de vida a la materia muerta. Pero, detrás de sus ojos fríos, arde un deseo oculto, una extraña obsesión en un hombre honrado: durante los últimos años, una y otra vez, ha imaginado y planeado los golpes más perfectos y brillantes, fruto de una inteligencia que, según él, lo diferencia de los demás.",0,"imgs/peliculas/69.jpg","sKCcqaTrM4o",actorespelicula,director1,reseniaspelicula,usuario,genero3, true);

		this.peliculaService.add(pelicula69);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor351);
		actorespelicula.add(actor481);
		actorespelicula.add(actor81);
		actorespelicula.add(actor482);
		actorespelicula.add(actor483);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia328);
		reseniaspelicula.add(resenia329);
		reseniaspelicula.add(resenia330);
		reseniaspelicula.add(resenia331);

//		Peliculas pelicula70 = new Peliculas("Los paranoicos",2008,"",102,"&quot;Los paranoicos&quot; cuenta la historia de Gauna (Daniel Hendler), un joven que escribe pero nunca tuvo el coraje de enseñar su obra. Un hombre que en la intimidad expone una personalidad que parece censurar en su escasa vida social. La aparición de un viejo amigo, Manuel, que llega desde España embriagado por el suceso de una serie televisiva cuyo protagonista tiene un nombre que remite a él, provoca el enfrentamiento de Gauna con aquello que desea -aunque sea la novia de su amigo- y la reafirmación de sus principios.",0,"imgs/peliculas/70.jpg","",actorespelicula,director49,reseniaspelicula,usuario,genero2, true);
//
//		this.peliculaService.add(pelicula70);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor11);
		actorespelicula.add(actor242);
		actorespelicula.add(actor175);
		actorespelicula.add(actor484);
		actorespelicula.add(actor485);
		actorespelicula.add(actor300);
		actorespelicula.add(actor486);
		actorespelicula.add(actor132);
		actorespelicula.add(actor115);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia332);
		reseniaspelicula.add(resenia333);
		reseniaspelicula.add(resenia334);
		reseniaspelicula.add(resenia335);
		reseniaspelicula.add(resenia336);

		Peliculas pelicula71 = new Peliculas("Iluminados por el fuego",2005,"",100,"&quot;Iluminados por el fuego&quot; narra los recuerdos de Esteban Leguizamón, un hombre de 40 años que, en 1982 y cuando tenía sólo 18, fue llevado como soldado recluta a combatir a las Islas Malvinas. A partir del intento de suicidio de uno de sus excompañeros, Esteban se sumerge en los recuerdos de esa guerra que compartió con otros dos jóvenes reclutas: Vargas, el suicida, y Juan, muerto en combate.",0,"imgs/peliculas/71.jpg","c3Pyou7P4DU",actorespelicula,director50,reseniaspelicula,usuario,genero8, true);

		this.peliculaService.add(pelicula71);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor72);
		actorespelicula.add(actor40);
		actorespelicula.add(actor166);
		actorespelicula.add(actor487);
		actorespelicula.add(actor488);
		actorespelicula.add(actor489);
		actorespelicula.add(actor490);
		actorespelicula.add(actor491);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia337);
		reseniaspelicula.add(resenia338);
		reseniaspelicula.add(resenia339);
		reseniaspelicula.add(resenia340);
		reseniaspelicula.add(resenia341);

		Peliculas pelicula72 = new Peliculas("Cuestión de principios",2009,"",115,"Castilla, modesto empleado portuario a punto de jubilarse, posee un ejemplar de una vieja revista que Silva, su nuevo y joven jefe, quiere comprarle a toda costa para completar su preciada colección. Sin embargo, Castilla rechaza la oferta con el fin de darle una lección, demostrándole que no todo en la vida tiene un precio. Las tentadoras ofertas de su obsesivo jefe provocarán un conflicto entre Castilla y su familia.",0,"imgs/peliculas/72.jpg","",actorespelicula,director24,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula72);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor492);
		actorespelicula.add(actor493);
		actorespelicula.add(actor448);
		actorespelicula.add(actor494);
		actorespelicula.add(actor495);
		actorespelicula.add(actor496);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia342);

		Peliculas pelicula73 = new Peliculas("La luz incidente",2015,"",95,"Argentina, años 60. Desde el accidente, Luisa no ha podido rearmar su vida. Pero cuando un seductor desconocido entra en su vida y le propone con vehemencia volver a empezar, Luisa se enfrenta con el duelo que venía intentando evitar.",0,"imgs/peliculas/73.jpg","_dxcfFUMwzc",actorespelicula,director51,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula73);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor497);
		actorespelicula.add(actor259);
		actorespelicula.add(actor498);
		actorespelicula.add(actor456);
		actorespelicula.add(actor499);
		actorespelicula.add(actor500);
		actorespelicula.add(actor133);
		actorespelicula.add(actor501);
		actorespelicula.add(actor211);
		actorespelicula.add(actor502);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia343);
		reseniaspelicula.add(resenia344);
		reseniaspelicula.add(resenia345);
		reseniaspelicula.add(resenia346);
		reseniaspelicula.add(resenia347);

		Peliculas pelicula74 = new Peliculas("Las manos",2006,"",119,"El sacerdote Mario Pantaleo descubre que tiene cierto poder para diagnosticar y curar enfermedades por medio de la imposición de las manos. Pero la policía y la jerarquía eclesiástica se pondrán en su contra.",0,"imgs/peliculas/74.jpg","E5k4i6A0VUc",actorespelicula,director52,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula74);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor503);
		actorespelicula.add(actor504);
		actorespelicula.add(actor505);
		actorespelicula.add(actor506);
		actorespelicula.add(actor507);
		actorespelicula.add(actor508);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia348);
		reseniaspelicula.add(resenia349);

		Peliculas pelicula75 = new Peliculas("La mosca en la ceniza",2009,"",98,"El film trata sobre dos amigas íntimas que llegan a Buenos Aires desde el Noroeste buscando un futuro mejor, pero son víctimas de un engaño y deben trabajar en un prostíbulo. Allí, una se adaptará para sobrevivir y la otra intentará huir.",0,"imgs/peliculas/75.jpg","JKes7oGQYKk",actorespelicula,director53,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula75);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor509);
		actorespelicula.add(actor343);
		actorespelicula.add(actor510);
		actorespelicula.add(actor511);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia350);
		reseniaspelicula.add(resenia351);
		reseniaspelicula.add(resenia352);
		reseniaspelicula.add(resenia353);
		reseniaspelicula.add(resenia354);

		Peliculas pelicula76 = new Peliculas("El estudiante",2011,"",124,"Roque Espinosa llega a Buenos Aires para estudiar en la Universidad. Sin embargo, pronto se da cuenta de que no tiene vocación para el estudio. Se dedica entonces a deambular sin rumbo por la facultad y a hacer amigos. Paula, una profesora de la facultad, lo introduce en política. Roque empieza a asistir a las reuniones del partido y a relacionarse con otros militantes.",0,"imgs/peliculas/76.jpg","",actorespelicula,director54,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula76);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor512);
		actorespelicula.add(actor513);
		actorespelicula.add(actor514);
		actorespelicula.add(actor515);
		actorespelicula.add(actor516);
		actorespelicula.add(actor517);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia355);

		Peliculas pelicula77 = new Peliculas("Vikingo",2009,"",90,"Vikingo es un respetado motociclista de vida licenciosa pero, paradójicamente, rígido en lo que hace a la aplicación de ciertos preceptos morales. El honor y el respeto son sus códigos, aunque no estén presentes coherentemente en todas las dimensiones de su vida.",0,"imgs/peliculas/77.jpg","",actorespelicula,director55,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula77);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor108);
		actorespelicula.add(actor192);
		actorespelicula.add(actor368);
		actorespelicula.add(actor518);
		actorespelicula.add(actor52);
		actorespelicula.add(actor107);
		actorespelicula.add(actor70);
		actorespelicula.add(actor284);
		actorespelicula.add(actor519);
		actorespelicula.add(actor520);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia356);
		reseniaspelicula.add(resenia357);
		reseniaspelicula.add(resenia358);
		reseniaspelicula.add(resenia359);
		reseniaspelicula.add(resenia360);

		Peliculas pelicula78 = new Peliculas("La niña santa",2004,"",106,"Amalia es una niña como las otras del coro, que se cuestionan sus creencias religiosas. Cuando el Dr. Jano llega a dar una charla al hotel donde Amalia vive con su madre, ella siente que tiene una misión: librar del pecado a ese hombre que está seduciendo a su madre.",0,"imgs/peliculas/78.jpg","ILc19QUijkM",actorespelicula,director21,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula78);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor521);
		actorespelicula.add(actor265);
		actorespelicula.add(actor244);
		actorespelicula.add(actor522);
		actorespelicula.add(actor523);
		actorespelicula.add(actor524);
		actorespelicula.add(actor525);
		actorespelicula.add(actor526);
		actorespelicula.add(actor4);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia361);
		reseniaspelicula.add(resenia362);
		reseniaspelicula.add(resenia363);
		reseniaspelicula.add(resenia364);
		reseniaspelicula.add(resenia365);

		Peliculas pelicula79 = new Peliculas("Un novio para mi mujer",2008,"",100,"El Tenso (Adrián Suar) no sabe cómo enfrentarse a su mujer, la Tana (Valeria Bertuccelli), para decirle que se quiere separar, ya que la relación se le hace insostenible debido a su terrible carácter. Ella vive constantemente malhumorada: si no protesta por el tiempo, es por el gobierno; si no es por los vecinos, es por los jóvenes, o por los viejos… o por lo que fuere.",0,"imgs/peliculas/79.jpg","BXJpXzPJtg0",actorespelicula,director56,reseniaspelicula,usuario,genero5, true);

		this.peliculaService.add(pelicula79);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor377);
		actorespelicula.add(actor527);
		actorespelicula.add(actor379);
		actorespelicula.add(actor528);
		actorespelicula.add(actor529);
		actorespelicula.add(actor530);
		actorespelicula.add(actor531);
		actorespelicula.add(actor280);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia366);
		reseniaspelicula.add(resenia367);
		reseniaspelicula.add(resenia368);
		reseniaspelicula.add(resenia369);
		reseniaspelicula.add(resenia370);

		Peliculas pelicula80 = new Peliculas("Plan B",2009,"",103,"Bruno (Manuel Vignau) sufre el abandono de su novia Laura (Mercedes Quinteros). A pesar de que siguen viéndose de vez en cuando, Laura tiene un nuevo novio, Pablo (Lucas Ferraro). Bruno está empeñado en recuperarla, así que comienza a idear un plan. En principio, pretende hacerse amigo de Pablo -con el que coincide en el gimnasio- con la idea de erosionar la pareja, quizá presentándole a otra mujer.",0,"imgs/peliculas/80.jpg","xdaSrYct7TQ",actorespelicula,director37,reseniaspelicula,usuario,genero5, true);

		this.peliculaService.add(pelicula80);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor351);
		actorespelicula.add(actor352);
		actorespelicula.add(actor520);
		actorespelicula.add(actor273);
		actorespelicula.add(actor532);
		actorespelicula.add(actor533);
		actorespelicula.add(actor534);
		actorespelicula.add(actor535);
		actorespelicula.add(actor536);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia371);
		reseniaspelicula.add(resenia372);
		reseniaspelicula.add(resenia373);
		reseniaspelicula.add(resenia374);
		reseniaspelicula.add(resenia375);

//		Peliculas pelicula81 = new Peliculas("Derecho de familia",2006,"",102,"Perelman hijo (Daniel Hendler) es un joven que estudia derecho que no quiere parecerse más a su padre (Arturo Goetz), un prestigioso abogado, pero cuanto más trata de diferenciarse, más se parece a él. Como una forma de encontrarse, busca la manera de descubrir qué es lo que más lo representa, y así despegarse de la imagen paterna. Ahora que ya es un adulto, está casado, tiene un hijo y la vida se le presenta en permanente transformación.",0,"imgs/peliculas/81.jpg","hZHzh5zBiRg",actorespelicula,director34,reseniaspelicula,usuario,genero1, true);
//
//		this.peliculaService.add(pelicula81);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor520);
		actorespelicula.add(actor471);
		actorespelicula.add(actor537);
		actorespelicula.add(actor538);
		actorespelicula.add(actor58);
		actorespelicula.add(actor539);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia376);
		reseniaspelicula.add(resenia377);
		reseniaspelicula.add(resenia378);

		Peliculas pelicula82 = new Peliculas("El asaltante",2007,"",70,"Un hombre ejecuta un plan que estuvo preparando minuciosamente. Mientras la cámara lo sigue en prácticamente todos sus movimientos, el espectador se convierte en testigo privilegiado de momentos íntimos de ansiedad, solapada desesperación, o del instante que precede una decisión de vida o muerte.",0,"imgs/peliculas/82.jpg","",actorespelicula,director57,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula82);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor352);
		actorespelicula.add(actor540);
		actorespelicula.add(actor541);
		actorespelicula.add(actor542);
		actorespelicula.add(actor543);
		actorespelicula.add(actor544);
		actorespelicula.add(actor545);
		actorespelicula.add(actor546);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia379);
		reseniaspelicula.add(resenia380);

		Peliculas pelicula83 = new Peliculas("A través de tus ojos",2006,"",104,"Lito y Nilda parten a Nueva York en plena crisis económica. Él acata, sumiso, la decisión de su esposa de conocer ese destino soñado. Una vez allí y a pesar de las advertencias de su marido, Nilda descuida su dieta y sufre una descompensación que la lleva al hospital. Lito se ve desbordado. Solo y sin dinero, en medio de este caos, conocerá una Nueva York inesperada, hostil a sus costumbres.",0,"imgs/peliculas/83.jpg","",actorespelicula,director58,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula83);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor106);
		actorespelicula.add(actor547);
		actorespelicula.add(actor548);
		actorespelicula.add(actor549);
		actorespelicula.add(actor300);
		actorespelicula.add(actor550);
		actorespelicula.add(actor168);
		actorespelicula.add(actor551);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia381);
		reseniaspelicula.add(resenia382);
		reseniaspelicula.add(resenia383);
		reseniaspelicula.add(resenia384);
		reseniaspelicula.add(resenia385);

//		Peliculas pelicula84 = new Peliculas("Revolución: El cruce de los Andes",2010,"",93,"Leandro Ipiña toma distancia de los puntos de vista que se abordaron anteriormente en este nuevo film sobre San Martin. Narrada por un anciano que en su juventud fue amanuense de San Martín y en el 1880 del relato malvive en una pensión, la película entrelaza el interés intimista de su narración con un despliegue visual de dimensiones avasallantes para cubrir ese primer cruce de Los Andes en el que San Martin se planteó la liberación de toda Sudamérica de los virreynatos.",0,"imgs/peliculas/84.jpg","_TA53WPa-a0",actorespelicula,director59,reseniaspelicula,usuario,genero1, true);
//
//		this.peliculaService.add(pelicula84);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor552);
		actorespelicula.add(actor553);
		actorespelicula.add(actor554);
		actorespelicula.add(actor555);
		actorespelicula.add(actor556);
		actorespelicula.add(actor557);
		actorespelicula.add(actor558);
		actorespelicula.add(actor559);
		actorespelicula.add(actor403);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia386);
		reseniaspelicula.add(resenia387);
		reseniaspelicula.add(resenia388);
		reseniaspelicula.add(resenia389);
		reseniaspelicula.add(resenia390);

		Peliculas pelicula85 = new Peliculas("Fantasma de Buenos Aires",2008,"",91,"Una historia fantástica con toques de comedia, sobre la relación entre un joven tímido de hoy y el fantasma de un malevo asesinado en 1920.",0,"imgs/peliculas/85.jpg","7Ym1FeTGt4I",actorespelicula,director60,reseniaspelicula,usuario,genero9, true);

		this.peliculaService.add(pelicula85);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor560);
		actorespelicula.add(actor561);
		actorespelicula.add(actor562);
		actorespelicula.add(actor563);
		actorespelicula.add(actor182);
		actorespelicula.add(actor421);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia391);
		reseniaspelicula.add(resenia392);
		reseniaspelicula.add(resenia393);
		reseniaspelicula.add(resenia394);

//		Peliculas pelicula86 = new Peliculas("La cámara oscura (The Camera Obscura)",2008,"",85,"A finales del siglo XIX, en la provincia de Entre Ríos, una niña a la que todos consideran fea, se convierte, con el paso del tiempo, en una mujer insignificante, casi transparente e ignorada por todos. Sin embargo, ella observa con una extraña avidez y detenimiento el mundo que la rodea y encuentra signos de belleza por todas partes. Años más tarde, ya casada y con hijos, llega a su casa un fotógrafo francés, que será la única persona capaz de ver la particular belleza de la protagonista y la riqueza de su intenso mundo interior.",0,"imgs/peliculas/86.jpg","fFJFLuTUR4E",actorespelicula,director22,reseniaspelicula,usuario,genero1, true);
//
//		this.peliculaService.add(pelicula86);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor564);
		actorespelicula.add(actor0);
		actorespelicula.add(actor565);
		actorespelicula.add(actor566);
		actorespelicula.add(actor567);
		actorespelicula.add(actor568);
		actorespelicula.add(actor139);
		actorespelicula.add(actor16);
		actorespelicula.add(actor146);
		actorespelicula.add(actor40);
		actorespelicula.add(actor569);
		actorespelicula.add(actor570);
		actorespelicula.add(actor150);
		actorespelicula.add(actor194);
		actorespelicula.add(actor182);
		actorespelicula.add(actor571);
		actorespelicula.add(actor572);
		actorespelicula.add(actor573);
		actorespelicula.add(actor403);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia395);
		reseniaspelicula.add(resenia396);
		reseniaspelicula.add(resenia397);
		reseniaspelicula.add(resenia398);
		reseniaspelicula.add(resenia399);

		Peliculas pelicula87 = new Peliculas("La fuga",2001,"",115,"En 1928, siete reclusos de la Penitenciaria Nacional de Buenos Aires huyen por un túnel excavado durante meses de duro trabajo. Por un error de cálculo salen a una carbonería regentada por un viejo matrimonio español. La suerte de cada uno de estos personajes -un anarquista, un estafador, tres asesinos, un timador de naipes y un inocente- será bien distinta.",0,"imgs/peliculas/87.jpg","",actorespelicula,director11,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula87);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor574);
		actorespelicula.add(actor575);
		actorespelicula.add(actor576);
		actorespelicula.add(actor577);
		actorespelicula.add(actor412);
		actorespelicula.add(actor578);
		actorespelicula.add(actor579);
		actorespelicula.add(actor580);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia400);
		reseniaspelicula.add(resenia401);
		reseniaspelicula.add(resenia402);
		reseniaspelicula.add(resenia403);

		Peliculas pelicula88 = new Peliculas("El asadito",2000,"",71,"El 30 de diciembre de 1999 se encuentran a comer un asado siete amigos (más un invitado sorpresa) en la terraza de Tito, el anfitrión. La reunión se prolonga hasta las primeras horas del último día del fin del milenio.",0,"imgs/peliculas/88.jpg","62WvoJcFxl8",actorespelicula,director61,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula88);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor106);
		actorespelicula.add(actor581);
		actorespelicula.add(actor582);
		actorespelicula.add(actor583);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia404);

		Peliculas pelicula89 = new Peliculas("Mía",2011,"",106,"La historia aborda el derecho a la felicidad y a poder formar parte de la comunidad, de quienes han elegido una forma diferente de la moralmente aceptada por la sociedad, y nos permite repasar el tema de la discriminación, la intolerancia, la marginación y la exclusión social, pero también el de la infinita capacidad de amor que tiene el ser humano.",0,"imgs/peliculas/89.jpg","",actorespelicula,director62,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula89);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor573);
		actorespelicula.add(actor584);
		actorespelicula.add(actor585);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();

		Peliculas pelicula90 = new Peliculas("Los porfiados (Les acharnés)",2002,"",90,"Argentina, en los albores del siglo XXI. En un suburbio de Buenos Aires, Dino, un viejo ideólogo marxista sueña con una hermosa revolución. Un día reúne una especie de ejército al que consigue convencer con sus ideas de objetivos poco concretos. En su cabaña, convertida en cuartel general, en medio de cabras y gallinas, se organizan para convertirse en modernos guerrilleros.",0,"imgs/peliculas/90.jpg","",actorespelicula,director63,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula90);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor586);
		actorespelicula.add(actor73);
		actorespelicula.add(actor587);
		actorespelicula.add(actor588);
		actorespelicula.add(actor286);
		actorespelicula.add(actor589);
		actorespelicula.add(actor590);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia405);
		reseniaspelicula.add(resenia406);
		reseniaspelicula.add(resenia407);
		reseniaspelicula.add(resenia408);
		reseniaspelicula.add(resenia409);

		Peliculas pelicula91 = new Peliculas("Nordeste",2005,"",100,"Después de haberlo sacrificado casi todo para alcanzar el éxito profesional, Hélène (Carole Bouquet), una madura y bella francesa, decide cambiar radicalmente de vida. Su deseo de ser madre la lleva hasta Argentina en busca de un niño al que adoptar. Allí descubre Nordeste, una región salvaje cuya asombrosa belleza contrasta violentamente con la miseria de sus habitantes.",0,"imgs/peliculas/91.jpg","p3v9YoahMKc",actorespelicula,director64,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula91);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor127);
		actorespelicula.add(actor1);
		actorespelicula.add(actor591);
		actorespelicula.add(actor144);
		actorespelicula.add(actor154);
		actorespelicula.add(actor153);
		actorespelicula.add(actor15);
		actorespelicula.add(actor592);
		actorespelicula.add(actor593);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia410);
		reseniaspelicula.add(resenia411);
		reseniaspelicula.add(resenia412);
		reseniaspelicula.add(resenia413);
		reseniaspelicula.add(resenia414);

		Peliculas pelicula92 = new Peliculas("No sos vos, soy yo",2004,"",102,"Javier, un médico treintañero que está recién casado, tiene planes de comenzar una nueva vida en Estados Unidos con María. Justo antes de partir a Miami para encontrarse con su mujer, ella lo llama para confesar que se ha enamorado de otro y terminar su relación. Javier está desesperado, ella es su vida y no sabe qué hacer. Así que trata de refugiarse en el sofá de su psicoanalista, en sus amigos y en el perro que acaba de comprar; todo para superar su incapacidad de estar solo y olvidar esa traición.",0,"imgs/peliculas/92.jpg","sWsbNP8WF0Y",actorespelicula,director56,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula92);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor594);
		actorespelicula.add(actor595);
		actorespelicula.add(actor123);
		actorespelicula.add(actor125);
		actorespelicula.add(actor181);
		actorespelicula.add(actor122);
		actorespelicula.add(actor596);
		actorespelicula.add(actor597);
		actorespelicula.add(actor598);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia415);
		reseniaspelicula.add(resenia416);

		Peliculas pelicula93 = new Peliculas("Un mundo menos peor",2004,"",90,"Una mujer descubre que su marido, al que creía muerto hacía más de veinte años, aún vive en un pequeño pueblo de la costa. Hacia allí viaja con su hija, quien nunca conoció a ese padre. Juntas tratarán de hacerle recobrar la memoria y de brindarle una familia.",0,"imgs/peliculas/93.jpg","",actorespelicula,director10,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula93);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor48);
		actorespelicula.add(actor108);
		actorespelicula.add(actor181);
		actorespelicula.add(actor2);
		actorespelicula.add(actor139);
		actorespelicula.add(actor570);
		actorespelicula.add(actor77);
		actorespelicula.add(actor599);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia417);

		Peliculas pelicula94 = new Peliculas("Próxima salida",2004,"",110,"En alguna época las líneas férreas argentinas tenían la nada despreciable longitud de 100 mil kilómetros, donde se transportaban mercancías y gente trabajadora a distintos destinos. Para su sostén, trabajaban 80 mil empleados. Veinte años después debido a las políticas privatizadoras aunadas a las crisis económicas las líneas se recortaron a 20 mil kilómetros y se despidieron a 60,000 almas que presas de la globalización quedaron desempleados.",0,"imgs/peliculas/94.jpg","RtA9hJxPbHk",actorespelicula,director65,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula94);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor600);
		actorespelicula.add(actor114);
		actorespelicula.add(actor127);
		actorespelicula.add(actor601);
		actorespelicula.add(actor292);
		actorespelicula.add(actor602);
		actorespelicula.add(actor603);
		actorespelicula.add(actor61);
		actorespelicula.add(actor604);
		actorespelicula.add(actor605);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia418);
		reseniaspelicula.add(resenia419);
		reseniaspelicula.add(resenia420);
		reseniaspelicula.add(resenia421);
		reseniaspelicula.add(resenia422);

		Peliculas pelicula95 = new Peliculas("Wakolda",2013,"",90,"En el verano de 1960, en la desolada región de la Patagonia, un médico alemán (Alex Brendemühl) conoce a una familia argentina y se une a ellos para seguir la ruta del desierto en caravana. El viajero es Josef Mengele, uno de los mayores criminales de la historia. La familia hace renacer en él todas sus obsesiones por la pureza y la perfección.",0,"imgs/peliculas/95.jpg","SE-OoHjzB0M",actorespelicula,director45,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula95);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor606);
		actorespelicula.add(actor607);
		actorespelicula.add(actor422);
		actorespelicula.add(actor192);
		actorespelicula.add(actor608);
		actorespelicula.add(actor609);
		actorespelicula.add(actor610);
		actorespelicula.add(actor611);
		actorespelicula.add(actor612);
		actorespelicula.add(actor613);
		actorespelicula.add(actor614);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia423);
		reseniaspelicula.add(resenia424);

		Peliculas pelicula96 = new Peliculas("La mala verdad",2010,"",93,"Bárbara tiene 10 años y vive con su madre Laura y su abuelo Ernesto. La conducta de la niña en la escuela desata las sospechas de Sara, la sicopedagoga del instituto. Las charlas con Sara comenzarán a revelar la verdad de la relación que la niña esconde dentro de su familia.",0,"imgs/peliculas/96.jpg","",actorespelicula,director66,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula96);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor273);
		actorespelicula.add(actor615);
		actorespelicula.add(actor284);
		actorespelicula.add(actor476);
		actorespelicula.add(actor616);
		actorespelicula.add(actor617);
		actorespelicula.add(actor618);
		actorespelicula.add(actor456);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia425);
		reseniaspelicula.add(resenia426);
		reseniaspelicula.add(resenia427);
		reseniaspelicula.add(resenia428);
		reseniaspelicula.add(resenia429);

		Peliculas pelicula97 = new Peliculas("Refugiado",2014,"",95,"Matías (Sebastián Molinaro) y Laura, su madre (Julieta Dìaz), se ven obligados a abandonar precipitadamente su casa tras la enésima reacción violenta de su padre. Matías tiene 7 años y Laura está embarazada, pero no tienen más remedio que deambular en busca de un lugar donde puedan sentirse protegidos y amparados.",0,"imgs/peliculas/97.jpg","TNcH0qkdkfA",actorespelicula,director67,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula97);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor108);
		actorespelicula.add(actor497);
		actorespelicula.add(actor261);
		actorespelicula.add(actor357);
		actorespelicula.add(actor422);
		actorespelicula.add(actor403);
		actorespelicula.add(actor619);
		actorespelicula.add(actor620);
		actorespelicula.add(actor621);
		actorespelicula.add(actor622);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();

		Peliculas pelicula98 = new Peliculas("Cordero de Dios (Agnus Dei)",2008,"",90,"El abuelo de Guillermina es secuestrado durante la crisis de 2001, y la joven decide contactar a su madre, quien se encuentra exiliada en Francia y tiene sus propios fantasmas de la época de la dictadura.",0,"imgs/peliculas/98.jpg","vTvRpVZdI5s",actorespelicula,director68,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula98);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor150);
		actorespelicula.add(actor623);
		actorespelicula.add(actor427);
		actorespelicula.add(actor624);
		actorespelicula.add(actor625);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia430);
		reseniaspelicula.add(resenia431);
		reseniaspelicula.add(resenia432);

		Peliculas pelicula99 = new Peliculas("Hoy y mañana",2004,"",94,"Una crisis sin final convierte a los hijos de la clase media argentina en aprendices de sobrevivientes. Paula tiene 24 años, una madre que murió, un padre abogado obsesionado con mantener su pasado status social y un enorme deseo de ser actriz. Sin embargo, pequeños acontecimientos cotidianos que escapan a su control amenazan con quebrar su frágil estabilidad.",0,"imgs/peliculas/99.jpg","",actorespelicula,director69,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula99);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor477);
		actorespelicula.add(actor51);
		actorespelicula.add(actor509);
		actorespelicula.add(actor626);
		actorespelicula.add(actor627);
		actorespelicula.add(actor628);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia433);
		reseniaspelicula.add(resenia434);
		reseniaspelicula.add(resenia435);
		reseniaspelicula.add(resenia436);
		reseniaspelicula.add(resenia437);

		Peliculas pelicula100 = new Peliculas("La patota",2015,"",103,"Paulina es una joven abogada que regresa a su ciudad para dedicarse a labores sociales. Trabaja en un programa de defensa de los derechos humanos en zonas humildes de la periferia de la ciudad. Tras la segunda semana de trabajo, es interceptada y atacada por una patota. Remake del clásico del cine argentino del mismo nombre, que en 1961 dirigió Daniel Tinayre, con Mirtha Legrand como protagonista.",0,"imgs/peliculas/100.jpg","4mnImJw2SPE",actorespelicula,director54,reseniaspelicula,usuario,genero0, true);

		this.peliculaService.add(pelicula100);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor454);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia438);

		Peliculas pelicula101 = new Peliculas("Ánima Buenos Aires",2011,"",95,"Largometraje animado integrado por cuatro historias que revelan el increíble universo que encierran barrios y rincones de la ciudad de Buenos Aires.",0,"imgs/peliculas/101.jpg","G8-7z3uJWug",actorespelicula,director70,reseniaspelicula,usuario,genero7, true);

		this.peliculaService.add(pelicula101);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor629);
		actorespelicula.add(actor630);
		actorespelicula.add(actor631);
		actorespelicula.add(actor253);
		actorespelicula.add(actor94);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia439);
		reseniaspelicula.add(resenia440);
		reseniaspelicula.add(resenia441);
		reseniaspelicula.add(resenia442);
		reseniaspelicula.add(resenia443);

		Peliculas pelicula102 = new Peliculas("Querida, voy a comprar cigarrillos y vuelvo",2011,"",80,"Gracias a un pacto con una persona que posee poderes sobrenaturales, un agente inmobiliario tiene la posibilidad de viajar al pasado y vivir nuevamente su juventud.",0,"imgs/peliculas/102.jpg","",actorespelicula,director5,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula102);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor632);
		actorespelicula.add(actor633);
		actorespelicula.add(actor634);
		actorespelicula.add(actor635);
		actorespelicula.add(actor318);
		actorespelicula.add(actor636);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia444);

//		Peliculas pelicula103 = new Peliculas("Road July",2010,"",88,"Un Citroën azul atraviesa una ruta polvorienta camino a San Rafael, Mendoza: a bordo, dos siluetas y poco equipaje más que un radiograbador y un baúl lleno de chucherías. Una road movie iniciática; una historia sobre el encuentro de dos personas con un pasado ausente que las une; un relato sobre la autosuperación de los errores. Ésas son algunas de las huellas que decide dejar el segundo  largometraje de Gaspar Gómez sobre el paisaje atravesado por su historia, que es la del proceso de acercamiento entre un padre y su hija de diez años, con quien convive por primera vez desde su nacimiento.",0,"imgs/peliculas/103.jpg","",actorespelicula,director71,reseniaspelicula,usuario,genero1, true);
//
//		this.peliculaService.add(pelicula103);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor58);
		actorespelicula.add(actor637);
		actorespelicula.add(actor638);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia445);
		reseniaspelicula.add(resenia446);
		reseniaspelicula.add(resenia447);
		reseniaspelicula.add(resenia448);
		reseniaspelicula.add(resenia449);

		Peliculas pelicula104 = new Peliculas("Las acacias",2011,"",85,"Por encargo, un camionero debe llevar a una mujer desconocida desde Asunción, Paraguay, hasta Buenos Aires, en Argentina. La mujer trae consigo una niña en brazos. Son 1.500 kilometros de viaje por delante.",0,"imgs/peliculas/104.jpg","OcZuDuGXKyE",actorespelicula,director72,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula104);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor127);
		actorespelicula.add(actor114);
		actorespelicula.add(actor40);
		actorespelicula.add(actor639);
		actorespelicula.add(actor302);
		actorespelicula.add(actor640);
		actorespelicula.add(actor641);
		actorespelicula.add(actor642);
		actorespelicula.add(actor643);
		actorespelicula.add(actor339);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia450);
		reseniaspelicula.add(resenia451);
		reseniaspelicula.add(resenia452);
		reseniaspelicula.add(resenia453);
		reseniaspelicula.add(resenia454);

		Peliculas pelicula105 = new Peliculas("Música en espera",2009,"",106,"Ezequiel, un compositor que debe escribir la música de una nueva película, no encuentra la inspiración. Tiene, además, problemas para pagar un crédito. Cuando llama al banco, mientras espera que lo atiendan, escucha una melodía ideal, justamente lo que estaba buscando para la película, pero, después, no es capaz de recordarla. La secretaria del gerente del banco, que está embarazada, espera la llegada de su madre que viene de España para conocer a su nieto.",0,"imgs/peliculas/105.jpg","wwyszEal9F4",actorespelicula,director73,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula105);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor261);
		actorespelicula.add(actor505);
		actorespelicula.add(actor644);
		actorespelicula.add(actor645);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia455);
		reseniaspelicula.add(resenia456);

		Peliculas pelicula106 = new Peliculas("El amor (primera parte)",2005,"",110,"La historia de una joven pareja, desde su inicio hasta su conclusión, desde las euforias del enamoramiento hasta los desdibujados y oscuros días finales, observada con ojo analítico y afán investigador. ¿Cómo y por qué dos personas se enamoran? ¿Cuándo comienzan a ser una pareja? ¿Qué imprevisibles mecanismos ponen en marcha la convivencia? ¿En qué inesperado momento la situación, de manera imperceptible, se acerca al final? ¿Cuándo termina realmente una relación amorosa?",0,"imgs/peliculas/106.jpg","",actorespelicula,director74,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula106);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor646);
		actorespelicula.add(actor647);
		actorespelicula.add(actor648);
		actorespelicula.add(actor123);
		actorespelicula.add(actor649);
		actorespelicula.add(actor650);
		actorespelicula.add(actor651);
		actorespelicula.add(actor652);
		actorespelicula.add(actor653);
		actorespelicula.add(actor293);
		actorespelicula.add(actor654);
		actorespelicula.add(actor655);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia457);
		reseniaspelicula.add(resenia458);
		reseniaspelicula.add(resenia459);
		reseniaspelicula.add(resenia460);
		reseniaspelicula.add(resenia461);

		Peliculas pelicula107 = new Peliculas("Un buda",2005,"",115,"Es la historia de un joven que, insertado en el mundo de la gran ciudad, lucha por evadir y posponer sistemáticamente su particular y profunda necesidad espiritual, el desesperado anhelo de su alma por saber quién es él. La pérdida, el desengaño y la tragedia, lo llevan irremediablemente a adentrarse de un modo extremo en el abismo de prácticas ascéticas, abandonando completamente su vida, su entorno, su alimentación, y sacudiendo profundamente el mundo de las personas que lo rodean.",0,"imgs/peliculas/107.jpg","mXXDthpoxuU",actorespelicula,director75,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula107);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor54);
		actorespelicula.add(actor244);
		actorespelicula.add(actor520);
		actorespelicula.add(actor656);
		actorespelicula.add(actor657);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia462);
		reseniaspelicula.add(resenia463);
		reseniaspelicula.add(resenia464);
		reseniaspelicula.add(resenia465);
		reseniaspelicula.add(resenia466);

//		Peliculas pelicula108 = new Peliculas("Rompecabezas (Puzzle)",2009,"",87,"María del Carmen, un ama de casa de 50 años que vive en Turdera, un suburbio bonaerense, descubre que tiene un don: armar rompecabezas. Ya metida de lleno en esta actividad, conoce a Roberto, un millonario de 60 años que aspira a participar en el torneo mundial de rompecabezas de Alemania. Juntos logran formar una pareja imbatible en este juego.",0,"imgs/peliculas/108.jpg","",actorespelicula,director76,reseniaspelicula,usuario,genero1, true);
//
//		this.peliculaService.add(pelicula108);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor658);
		actorespelicula.add(actor58);
		actorespelicula.add(actor659);
		actorespelicula.add(actor660);
		actorespelicula.add(actor661);
		actorespelicula.add(actor662);
		actorespelicula.add(actor663);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia467);

//		Peliculas pelicula109 = new Peliculas("Los dueños",2013,"",93,"Sergio y su familia son peones de una finca al norte de Argentina. Cuando sus patrones no están, ocupan la casa principal y emulan la vida de los dueños. Una mañana llega a la finca Pía, la hija mayor del dueño, con la intención de quedarse unos días hasta el casamiento de su padre. Esto obliga a los peones a recluirse en su humilde morada, y a cumplir las tareas que les corresponden.",0,"imgs/peliculas/109.jpg","bJhBH3PsF1k",actorespelicula,director77,reseniaspelicula,usuario,genero1, true);
//
//		this.peliculaService.add(pelicula109);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor664);
		actorespelicula.add(actor665);
		actorespelicula.add(actor666);
		actorespelicula.add(actor198);
		actorespelicula.add(actor373);
		actorespelicula.add(actor160);
		actorespelicula.add(actor667);
		actorespelicula.add(actor668);
		actorespelicula.add(actor669);
		actorespelicula.add(actor483);
		actorespelicula.add(actor670);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia468);
		reseniaspelicula.add(resenia469);
		reseniaspelicula.add(resenia470);
		reseniaspelicula.add(resenia471);

//		Peliculas pelicula110 = new Peliculas("Chiche Bombón",2004,"",94,"En el barrio se habla de ellos… Dos señoras chismosas observan esta historia de amor a través de su ventana: Chiche es una hermosa mujer de 27 años embarazada de un adolescente, Marianito, 10 años menor y aún cursando el colegio secundario. Ambos viven con los padres de ella, Manrique, un líder político de tercera fila que trata de brindarles todo su apoyo desde una postura un tanto permisiva.",0,"imgs/peliculas/110.jpg","zNlb-MD7zQY",actorespelicula,director43,reseniaspelicula,usuario,genero1, true);
//
//		this.peliculaService.add(pelicula110);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor651);
		actorespelicula.add(actor612);
		actorespelicula.add(actor671);
		actorespelicula.add(actor672);
		actorespelicula.add(actor673);
		actorespelicula.add(actor674);
		actorespelicula.add(actor675);
		actorespelicula.add(actor137);
		actorespelicula.add(actor676);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia472);

		Peliculas pelicula111 = new Peliculas("Bar El Chino",2003,"",96,"El Bar El Chino es un boliche de paredes desconchadas en donde se conserva la esencia del tango. Los personajes que lo frecuentan son todos veteranos legendarios, en especial su creador, &quot;El Chino&quot; Garcés. Es el cumpleaños de Jorge, un cineasta, y sus amigos lo llevan a celebrarlo al bar. Allí durante meses había filmado imágenes con la idea realizar un documental.",0,"imgs/peliculas/111.jpg","",actorespelicula,director78,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula111);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor351);
		actorespelicula.add(actor93);
		actorespelicula.add(actor477);
		actorespelicula.add(actor677);
		actorespelicula.add(actor678);
		actorespelicula.add(actor679);
		actorespelicula.add(actor680);
		actorespelicula.add(actor119);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia473);
		reseniaspelicula.add(resenia474);
		reseniaspelicula.add(resenia475);
		reseniaspelicula.add(resenia476);
		reseniaspelicula.add(resenia477);

		Peliculas pelicula112 = new Peliculas("El fondo del mar",2003,"",92,"Toledo (Daniel Hendler), 26 años, futuro arquitecto, sufre de celos agudos. Vive obsesionado con los movimientos y actividades de su novia. Un día llega a casa y descubre que su peor pesadilla se ha hecho realidad: hay otro hombre. Superado el golpe, inicia una particular persecución nocturna de descubrimiento de personalidades: la del misterioso enemigo y, trágicamente, la suya propia.",0,"imgs/peliculas/112.jpg","4kSKzlNraao",actorespelicula,director2,reseniaspelicula,usuario,genero0, true);

		this.peliculaService.add(pelicula112);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor0);
		actorespelicula.add(actor681);
		actorespelicula.add(actor222);
		actorespelicula.add(actor682);
		actorespelicula.add(actor683);
		actorespelicula.add(actor81);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia478);
		reseniaspelicula.add(resenia479);
		reseniaspelicula.add(resenia480);
		reseniaspelicula.add(resenia481);
		reseniaspelicula.add(resenia482);

		Peliculas pelicula113 = new Peliculas("Elefante blanco",2012,"",106,"Narra la historia de amistad de dos curas, Julián y Nicolás, que tras sobrevivir a un intento de asesinato por parte del ejército durante su trabajo en Centroamérica, se asientan en una barriada de Buenos Aires para desarrollar su apostolado y labor social. Allí conocen a Luciana, con quien lucharán codo con codo contra la corrupción, un mal endémico de la zona.",0,"imgs/peliculas/113.jpg","",actorespelicula,director17,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula113);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor684);
		actorespelicula.add(actor265);
		actorespelicula.add(actor299);
		actorespelicula.add(actor493);
		actorespelicula.add(actor685);
		actorespelicula.add(actor686);
		actorespelicula.add(actor687);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia483);
		reseniaspelicula.add(resenia484);
		reseniaspelicula.add(resenia485);
		reseniaspelicula.add(resenia486);

		Peliculas pelicula114 = new Peliculas("Los guantes mágicos",2003,"",90,"Alejandro es un taxista de unos treinta y cinco años que se encuentra de pronto en medio de separaciones, cambios climáticos violentos, riqueza súbita, personajes que quieren volver a Argentina, otros que quieren irse para siempre, guantes mágicos, música ensordecedora, empobrecimiento repentino, incontables viajes al aeropuerto, una nueva relación, depresiones extremas, adicciones diversas.",0,"imgs/peliculas/114.jpg","",actorespelicula,director79,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula114);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor13);
		actorespelicula.add(actor40);
		actorespelicula.add(actor688);
		actorespelicula.add(actor689);
		actorespelicula.add(actor128);
		actorespelicula.add(actor47);
		actorespelicula.add(actor261);
		actorespelicula.add(actor427);
		actorespelicula.add(actor690);
		actorespelicula.add(actor691);
		actorespelicula.add(actor692);
		actorespelicula.add(actor693);
		actorespelicula.add(actor694);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia487);
		reseniaspelicula.add(resenia488);
		reseniaspelicula.add(resenia489);
		reseniaspelicula.add(resenia490);

		Peliculas pelicula115 = new Peliculas("Paco",2009,"",128,"Narra la historia de Francisco, un estudiante de ciencias que empieza a consumir drogas, su madre, una conocida congresista, y de Nina, la mujer que intentará salvar al primero de su previsiblemente horrible futuro.",0,"imgs/peliculas/115.jpg","mILxMGhQpMw",actorespelicula,director75,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula115);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor695);
		actorespelicula.add(actor696);
		actorespelicula.add(actor283);
		actorespelicula.add(actor343);
		actorespelicula.add(actor697);
		actorespelicula.add(actor446);
		actorespelicula.add(actor698);
		actorespelicula.add(actor699);
		actorespelicula.add(actor700);
		actorespelicula.add(actor701);
		actorespelicula.add(actor702);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia491);
		reseniaspelicula.add(resenia492);
		reseniaspelicula.add(resenia493);

		Peliculas pelicula116 = new Peliculas("Viola",2012,"",65,"Cecilia ocupa sus días ensayando la comedia Noche de reyes de W. Shakespeare mientras Viola deja pasar los suyos arriba de una bicicleta repartiendo películas pirateadas. Entre diferentes teorías del deseo, entre sueños, versos y ficciones en un mundo de mujeres shakesperianas, los misterios no se resuelven, pero el amor circula irrefrenablemente.",0,"imgs/peliculas/116.jpg","IUzpVFfFyz8",actorespelicula,director80,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula116);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor48);
		actorespelicula.add(actor421);
		actorespelicula.add(actor703);
		actorespelicula.add(actor704);
		actorespelicula.add(actor705);
		actorespelicula.add(actor706);
		actorespelicula.add(actor488);
		actorespelicula.add(actor452);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia494);
		reseniaspelicula.add(resenia495);
		reseniaspelicula.add(resenia496);
		reseniaspelicula.add(resenia497);
		reseniaspelicula.add(resenia498);

		Peliculas pelicula117 = new Peliculas("El lado oscuro del corazón 2",2001,"",108,"Diez años después, Oliverio sigue buscando a la mujer que sea capaz de volar. Tras varios intentos, en España conoce a una equilibrista, y con ella logra demorar el tiempo y vencer a la muerte",0,"imgs/peliculas/117.jpg","",actorespelicula,director41,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula117);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor707);
		actorespelicula.add(actor708);
		actorespelicula.add(actor709);
		actorespelicula.add(actor710);
		actorespelicula.add(actor711);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia499);
		reseniaspelicula.add(resenia500);
		reseniaspelicula.add(resenia501);

		Peliculas pelicula118 = new Peliculas("De caravana",2010,"",110,"Corriendo a contrarreloj, Juan Cruz prepara su obra para una prestigiosa competencia de fotografía, cuando sus jefes en la agencia de publicidad se empeñan en arrancarlo tanto de esa tarea como de su mundo &quot;natural&quot;, el de la clase alta cordobesa. La misión consiste en zambullirse en un recital de la Mona Jiménez, y capturar el espíritu de la noche cuartetera con su cámara.",0,"imgs/peliculas/118.jpg","aGpDO0cTnzE",actorespelicula,director81,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula118);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor613);
		actorespelicula.add(actor40);
		actorespelicula.add(actor712);
		actorespelicula.add(actor713);
		actorespelicula.add(actor714);
		actorespelicula.add(actor715);
		actorespelicula.add(actor716);
		actorespelicula.add(actor667);
		actorespelicula.add(actor717);
		actorespelicula.add(actor718);
		actorespelicula.add(actor719);
		actorespelicula.add(actor654);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia502);
		reseniaspelicula.add(resenia503);

		Peliculas pelicula119 = new Peliculas("Andrés no quiere dormir la siesta",2009,"",108,"Andrés (Conrado Valenzuela) vive con su madre (Celina Font) y su hermano mayor en Santa Fe. Ella está separada de su marido (Fabio Aste), y la relación con su ex se torna cada vez más tirante. A raíz de un accidente, ella muere de manera repentina, así que tanto Andrés como su hermano Armando tendrán que irse a vivir con su padre y la madre de él (Norma Aleandro).",0,"imgs/peliculas/119.jpg","ka_B01U9kkk",actorespelicula,director82,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula119);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor16);
		actorespelicula.add(actor720);
		actorespelicula.add(actor721);
		actorespelicula.add(actor722);
		actorespelicula.add(actor723);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia504);
		reseniaspelicula.add(resenia505);
		reseniaspelicula.add(resenia506);
		reseniaspelicula.add(resenia507);
		reseniaspelicula.add(resenia508);

		Peliculas pelicula120 = new Peliculas("Días de pesca",2012,"",80,"Tras someterse a una cura de desintoxicación para dejar el alcohol, Marco, un maduro viajante de comercio, intenta cambiar el rumbo de su vida. Como parte del tratamiento, se le sugiere que elija un hobby, y él se decide por la pesca. Viaja entonces a Puerto Deseado porque es la temporada de pesca del tiburón, pero también porque su hija Ana vive allí y no sabe nada de ella desde hace años.",0,"imgs/peliculas/120.jpg","",actorespelicula,director6,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula120);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor136);
		actorespelicula.add(actor16);
		actorespelicula.add(actor724);
		actorespelicula.add(actor725);
		actorespelicula.add(actor726);
		actorespelicula.add(actor133);
		actorespelicula.add(actor727);
		actorespelicula.add(actor728);
		actorespelicula.add(actor524);
		actorespelicula.add(actor184);
		actorespelicula.add(actor729);
		actorespelicula.add(actor53);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia509);
		reseniaspelicula.add(resenia510);
		reseniaspelicula.add(resenia511);
		reseniaspelicula.add(resenia512);
		reseniaspelicula.add(resenia513);

//		Peliculas pelicula121 = new Peliculas("Verdades verdaderas. La vida de Estela",2011,"",110,"Semblanza de la vida de Estela de Carlotto, la presidenta de las &quot;Abuelas de la Plaza de Mayo&quot;. Estela era una señora de clase media que repartía su tiempo entre su familia y su trabajo como directora de escuela, y vivía completamente ajena a cualquier militancia política. Sin embargo, tras el secuestro y asesinato de su hija Laura entre 1977 y 1978 y la pérdida de su nieto Guido, retenido por los secuestradores, su vida cambió por completo.",0,"imgs/peliculas/121.jpg","D1r1trjRAqM",actorespelicula,director83,reseniaspelicula,usuario,genero1, true);
//
//		this.peliculaService.add(pelicula121);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor730);
		actorespelicula.add(actor731);
		actorespelicula.add(actor181);
		actorespelicula.add(actor267);
		actorespelicula.add(actor732);
		actorespelicula.add(actor733);
		actorespelicula.add(actor290);
		actorespelicula.add(actor688);
		actorespelicula.add(actor497);
		actorespelicula.add(actor724);
		actorespelicula.add(actor734);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia514);
		reseniaspelicula.add(resenia515);

//		Peliculas pelicula122 = new Peliculas("Ni Dios, ni patrón ni marido",2010,"",113,"En 1896, Virgina Bolten, una conocida anarquista de treinta años, llega a Buenos Aires en donde se encuentra con su amiga Matilde, que junto con otras mujeres está trabajando en la hilandería de Genaro Volpon, bajo las penosas condiciones de la época. Matilde, Filomena, Rosalía y otras operarias de la hilandería se reúnen en torno a Virginia para llevar a cabo un viejo proyecto de ésta: editar un periódico que denuncie la doble explotación a la que es sometida la mujer del siglo XIX: por su condición de clase y por su género.",0,"imgs/peliculas/122.jpg","LLh8AX0tcY0",actorespelicula,director84,reseniaspelicula,usuario,genero1, true);
//
//		this.peliculaService.add(pelicula122);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor11);
		actorespelicula.add(actor725);
		actorespelicula.add(actor302);
		actorespelicula.add(actor237);
		actorespelicula.add(actor735);
		actorespelicula.add(actor337);
		actorespelicula.add(actor736);
		actorespelicula.add(actor452);
		actorespelicula.add(actor49);
		actorespelicula.add(actor737);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia516);
		reseniaspelicula.add(resenia517);
		reseniaspelicula.add(resenia518);
		reseniaspelicula.add(resenia519);
		reseniaspelicula.add(resenia520);

		Peliculas pelicula123 = new Peliculas("Días de vinilo",2012,"",110,"Damián, Marcelo, Luciano y Facundo son cuatro amigos treintañeros a los que une la pasión por la música, la amistad y las mujeres. Damián, es escritor y guionista. Para recuperar a Ana escribe un guión de cine, pero la única copia que tiene la pierde Vera, una mujer muy particular que se entromete en su vida con el fin de cambiarla.",0,"imgs/peliculas/123.jpg","UFyTGwMnWmo",actorespelicula,director85,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula123);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor143);
		actorespelicula.add(actor738);
		actorespelicula.add(actor739);
		actorespelicula.add(actor740);
		actorespelicula.add(actor741);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia521);
		reseniaspelicula.add(resenia522);

		Peliculas pelicula124 = new Peliculas("Tan de repente",2002,"",90,"Buenos Aires, en una tarde de invierno. Marcia es una chica joven y gordita, vendedora de lencería, que lleva una vida rutinaria y gris en la capital argentina. Mao y Lenin son una pareja de chicas punk, que tropiezan con Marcia y, por algún motivo inexplicable, se empeñan en demostrarle su amor. Desde ese momento, las tres (intrépidas unas, aturdida la otra) emprenden un viaje inesperado hacia un lugar desconocido.",0,"imgs/peliculas/124.jpg","",actorespelicula,director67,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula124);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor12);
		actorespelicula.add(actor48);
		actorespelicula.add(actor450);
		actorespelicula.add(actor742);
		actorespelicula.add(actor46);
		actorespelicula.add(actor577);
		actorespelicula.add(actor743);
		actorespelicula.add(actor744);
		actorespelicula.add(actor745);
		actorespelicula.add(actor278);
		actorespelicula.add(actor746);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia523);
		reseniaspelicula.add(resenia524);
		reseniaspelicula.add(resenia525);
		reseniaspelicula.add(resenia526);
		reseniaspelicula.add(resenia527);

		Peliculas pelicula125 = new Peliculas("El frasco",2008,"",96,"Pérez, un conductor de autobús, rompe, sin querer, un frasco de orina que le ha entregado una maestra rural para que lo lleve a analizar. La idea que se le ocurre para solucionar el problema no puede ser más absurda, pero marca el comienzo de una entrañable historia de amor entre esos dos personajes.",0,"imgs/peliculas/125.jpg","xYsAb6oS5dk",actorespelicula,director33,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula125);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor4);
		actorespelicula.add(actor273);
		actorespelicula.add(actor747);
		actorespelicula.add(actor748);
		actorespelicula.add(actor749);
		actorespelicula.add(actor750);
		actorespelicula.add(actor751);
		actorespelicula.add(actor44);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia528);
		reseniaspelicula.add(resenia529);
		reseniaspelicula.add(resenia530);
		reseniaspelicula.add(resenia531);
		reseniaspelicula.add(resenia532);

		Peliculas pelicula126 = new Peliculas("Corazón de León",2013,"",110,"Ivana Cornejo es una exitosa abogada. Desde hace 3 años está divorciada de Diego Bisoni, también abogado y socio del bufete que ambos comparten. Tras la pérdida de su celular, Ivana recibe la llamada de alguien que lo encontró, con intenciones de devolvérselo. Es León Godoy, un arquitecto de gran renombre con una personalidad arrolladora: simpático, galante, carismático.",0,"imgs/peliculas/126.jpg","",actorespelicula,director12,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula126);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor39);
		actorespelicula.add(actor351);
		actorespelicula.add(actor752);
		actorespelicula.add(actor753);
		actorespelicula.add(actor754);
		actorespelicula.add(actor286);
		actorespelicula.add(actor356);
		actorespelicula.add(actor755);
		actorespelicula.add(actor477);
		actorespelicula.add(actor756);
		actorespelicula.add(actor757);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia533);
		reseniaspelicula.add(resenia534);
		reseniaspelicula.add(resenia535);
		reseniaspelicula.add(resenia536);

		Peliculas pelicula127 = new Peliculas("Esperando al mesías",2000,"",98,"Ariel Goldstein es un joven judío de clase media. O mejor: es un joven de clase media que se siente obsesionado con el judaísmo, lo que él llama la &quot;burbuja&quot;.  Vive y trabaja con su padre, filmando casamientos y toda clase de actos sociales de los miembros de la comunidad judía, más menos respetuosos con las tradiciones religiosas. Cuando cambie los bar-mitzvas por una productora de televisión por cable empezará a tomar contacto con otra gente.",0,"imgs/peliculas/127.jpg","",actorespelicula,director34,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula127);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor40);
		actorespelicula.add(actor114);
		actorespelicula.add(actor49);
		actorespelicula.add(actor39);
		actorespelicula.add(actor606);
		actorespelicula.add(actor651);
		actorespelicula.add(actor758);
		actorespelicula.add(actor759);
		actorespelicula.add(actor717);
		actorespelicula.add(actor760);
		actorespelicula.add(actor761);
		actorespelicula.add(actor762);
		actorespelicula.add(actor763);
		actorespelicula.add(actor764);
		actorespelicula.add(actor765);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia537);
		reseniaspelicula.add(resenia538);
		reseniaspelicula.add(resenia539);
		reseniaspelicula.add(resenia540);
		reseniaspelicula.add(resenia541);

		Peliculas pelicula128 = new Peliculas("Cleopatra",2003,"",103,"Cleo, una maestra jubilada (Norma Aleandro), y Sandra (Natalia Oreiro), una popular actriz de telenovelas, hastiadas de sus rutinarias vidas, se lanzan a la carretera para vivir un fin de semana diferente que cambiará por completo sus destinos. En el trayecto, conocen a Carlos (Leonardo Sbaraglia), un campesino que se sumará a la aventura.",0,"imgs/peliculas/128.jpg","C4g4LKADFcA",actorespelicula,director11,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula128);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor766);
		actorespelicula.add(actor49);
		actorespelicula.add(actor302);
		actorespelicula.add(actor304);
		actorespelicula.add(actor767);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();

		Peliculas pelicula129 = new Peliculas("Cornelia frente al espejo",2012,"",103,"La joven Cornelia llega a la antigua casona paterna para quitarse la vida. Cuando intenta cumplir con su cometido es continuamente interrumpida por imprevistas apariciones: una misteriosa niña, un ladrón y un amante.",0,"imgs/peliculas/129.jpg","c8eWeDw_xL0",actorespelicula,director86,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula129);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor768);
		actorespelicula.add(actor769);
		actorespelicula.add(actor770);
		actorespelicula.add(actor771);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();

		Peliculas pelicula130 = new Peliculas("Juana a los 12",2014,"",75,"Juana va a un colegio inglés del conurbano bonaerense. Tras la preocupación de sus maestras por su bajo rendimiento, su madre comienza a buscar ayuda externa. Juana lidia los desafíos académicos y sociales con una aparente indiferencia mientras transita una edad de mucha incertidumbre.",0,"imgs/peliculas/130.jpg","",actorespelicula,director87,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula130);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor772);
		actorespelicula.add(actor773);
		actorespelicula.add(actor441);
		actorespelicula.add(actor450);
		actorespelicula.add(actor774);
		actorespelicula.add(actor775);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia542);

		Peliculas pelicula131 = new Peliculas("Excursiones",2009,"",80,"Marcos trabaja en una fábrica de golosinas; Martín es guionista de TV. Ambos fueron compañeros de escuela y grandes amigos, pero hace años que no se ven. Marcos consigue que un teatro quiera estrenar un unipersonal que creó en la escuela secundaria y le propone a su antiguo amigo que lo ayude a rescribir el texto.",0,"imgs/peliculas/131.jpg","",actorespelicula,director88,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula131);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor776);
		actorespelicula.add(actor340);
		actorespelicula.add(actor777);
		actorespelicula.add(actor778);
		actorespelicula.add(actor38);
		actorespelicula.add(actor779);
		actorespelicula.add(actor636);
		actorespelicula.add(actor780);
		actorespelicula.add(actor781);
		actorespelicula.add(actor782);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia543);
		reseniaspelicula.add(resenia544);
		reseniaspelicula.add(resenia545);
		reseniaspelicula.add(resenia546);
		reseniaspelicula.add(resenia547);

		Peliculas pelicula132 = new Peliculas("Ciudad en celo",2006,"",104,"En un bar de Buenos Aires llamado Garllington (en homenaje a Gardel y Ellington) se reúne a diario un grupo de amigos que rondan los 40 años. La historia transcurre durante los primeros días de primavera: los abrigos empiezan a descubrir los cuerpos y el grupo se da cuenta de que no puede hablarse de otra cosa que no sea de mujeres. Duke, dueño del bar, les ha impuesto no hacer comentarios acerca de fútbol ni política para evitar las largas discusiones entre Sergio (escritor de guiones) y Marcos (comerciante), los más habituales.",0,"imgs/peliculas/132.jpg","",actorespelicula,director89,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula132);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor52);
		actorespelicula.add(actor783);
		actorespelicula.add(actor737);
		actorespelicula.add(actor463);
		actorespelicula.add(actor351);
		actorespelicula.add(actor784);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia548);
		reseniaspelicula.add(resenia549);

		Peliculas pelicula133 = new Peliculas("Mi amiga del parque",2015,"",86,"Corren días difíciles para Liz, madre primeriza de Nicanor y esposa de Gustavo, que está de viaje filmando en Chile. Liz parece perdida y sola, visita todos los días el parque vecino a su casa. Allí conoce a un grupo de madres y a algún padre y se encuentra con Rosa, presunta madre de Clarisa y hermana de la inestable Renata. En esta intensa amistad se crea una complicidad especial, en la que las nuevas amigas comparten confesiones, tareas domésticas y de a poco lo más importante, el cuidado de los hijos.",0,"imgs/peliculas/133.jpg","2JZvm-0RKbk",actorespelicula,director90,reseniaspelicula,usuario,genero2, true);

		this.peliculaService.add(pelicula133);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor454);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia550);

		Peliculas pelicula134 = new Peliculas("Mercano, el marciano",2002,"",87,"Largometraje cinematográfico basado en el popular personaje animado de la televisión. Un marciano que usa las alcantarillas porteñas como base de operaciones para armar un mundo virtual.",0,"imgs/peliculas/134.jpg","VT5kNWnXwfI",actorespelicula,director91,reseniaspelicula,usuario,genero7, true);

		this.peliculaService.add(pelicula134);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor323);
		actorespelicula.add(actor158);
		actorespelicula.add(actor785);
		actorespelicula.add(actor786);
		actorespelicula.add(actor787);
		actorespelicula.add(actor788);
		actorespelicula.add(actor789);
		actorespelicula.add(actor790);
		actorespelicula.add(actor536);
		actorespelicula.add(actor791);


		/*resenias en esta pelicula*/
		reseniaspelicula = new ArrayList<Resenias>();
		reseniaspelicula.add(resenia551);
		reseniaspelicula.add(resenia552);

		Peliculas pelicula135 = new Peliculas("Regresados",2007,"",95,"Tres historias que transcurren en una sola noche. El punto de partida es una reunión de egresados. Los ex compañeros de colegio se reencuentran después de veinte años y todas estas historias tendrán algo en común: las segundas oportunidades.",0,"imgs/peliculas/135.jpg","CLLxjVtJtD4",actorespelicula,director29,reseniaspelicula,usuario,genero1, true);

		this.peliculaService.add(pelicula135);


		
		
		
		Secciones seccion1 = new Secciones();
		seccion1.setDescripcion("Películas");
		seccion1.setCant_visitas(10558);
		this.seccionService.save(seccion1);
		
		Secciones seccion2 = new Secciones();
		seccion2.setDescripcion("Actores");
		seccion2.setCant_visitas(5032);
		this.seccionService.save(seccion2);
		
		Secciones seccion3 = new Secciones();
		seccion3.setDescripcion("Directores");
		seccion3.setCant_visitas(520);
		this.seccionService.save(seccion3);
		
		Secciones seccion4 = new Secciones();
		seccion4.setDescripcion("Usuarios");
		seccion4.setCant_visitas(600);
		this.seccionService.save(seccion4);
	}

}
