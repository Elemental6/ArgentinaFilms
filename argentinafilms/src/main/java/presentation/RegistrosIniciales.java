package presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Actores;
import model.Directores;
import model.Generos;
import model.Peliculas;
import model.Usuarios;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.ServiceDirector;
import service.ServiceGenero;
import service.ServicePelicula;
import service.ServiceUsuario;

@WebServlet("/RegistrosIniciales")
public class RegistrosIniciales extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public ServicePelicula peliculaService = null;
	public ServiceUsuario usuarioService = null;
	public ServiceDirector directorService = null;
	public ServiceGenero generoService = null;

	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.peliculaService = (ServicePelicula) context.getBean(ServicePelicula.class);
		this.usuarioService = (ServiceUsuario) context.getBean(ServiceUsuario.class);
		this.directorService = (ServiceDirector) context.getBean(ServiceDirector.class);
		this.generoService = (ServiceGenero) context.getBean(ServiceGenero.class);
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*Genera las peliculas*/
		crearDatos();
		response.sendRedirect("Inicio.jsp");
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
	private void crearDatos(){
		Usuarios usuario = new Usuarios("Jocs", "1234", "Jose", "Hassan", "jose.h.utn@gmail.com", "admin", true);
		usuario.setAvatar("imgs\\avatares\\xfdfrgf.jpg");
		this.usuarioService.add(usuario);
		
		List<Actores> actorespelicula = null;


		/*Genero Actores*/
		Actores actor0 = new Actores("Ricardo", "Dar�n", 0, true);
		Actores actor1 = new Actores("Soledad", "Villamil", 0, true);
		Actores actor2 = new Actores("Pablo", "Rago", 0, true);
		Actores actor3 = new Actores("Javier", "Godino", 0, true);
		Actores actor4 = new Actores("Guillermo", "Francella", 0, true);
		Actores actor5 = new Actores("Jos�", "Gioia", 0, true);
		Actores actor6 = new Actores("Mario", "Alarc�n", 0, true);
		Actores actor7 = new Actores("Mariano", "Argento", 0, true);
		Actores actor8 = new Actores("Kiko", "Cerone", 0, true);
		Actores actor9 = new Actores("David", "N�poli", 0, true);
		Actores actor10 = new Actores("Carla", "Quevedo", 0, true);
		Actores actor11 = new Actores("Gast�n", "Pauls", 0, true);
		Actores actor12 = new Actores("Leticia", "Br�dice", 0, true);
		Actores actor13 = new Actores("Tom�s", "Fonzi", 0, true);
		Actores actor14 = new Actores("Ignasi", "Abadal", 0, true);
		Actores actor15 = new Actores("Roly", "Serrano", 0, true);
		Actores actor16 = new Actores("Alejandro", "Awada", 0, true);
		Actores actor17 = new Actores("Antonio", "Ugo", 0, true);
		Actores actor18 = new Actores("Elsa", "Berenguer", 0, true);
		Actores actor19 = new Actores("Celia", "Ju�rez", 0, true);
		Actores actor20 = new Actores("Leo", "Dyzen", 0, true);
		Actores actor21 = new Actores("Graciela", "Tenembaum", 0, true);
		Actores actor22 = new Actores("Oscar", "N��ez", 0, true);
		Actores actor23 = new Actores("Mar�a", "Villagra", 0, true);
		Actores actor24 = new Actores("Gabriel", "Correa", 0, true);
		Actores actor25 = new Actores("Luis", "Armesto", 0, true);
		Actores actor26 = new Actores("Pochi", "Ducasse", 0, true);
		Actores actor27 = new Actores("Ernesto", "Arias", 0, true);
		Actores actor28 = new Actores("Amancay", "Esp�ndola", 0, true);
		Actores actor29 = new Actores("Jorge", "Noya", 0, true);
		Actores actor30 = new Actores("Carlos", "Lanari", 0, true);
		Actores actor31 = new Actores("Roberto", "Rey", 0, true);
		Actores actor32 = new Actores("Carlos", "Falcone", 0, true);
		Actores actor33 = new Actores("Ricardo", "Mourelle", 0, true);
		Actores actor34 = new Actores("Emanuel", "Mercado", 0, true);
		Actores actor35 = new Actores("Ulises", "Celestino", 0, true);
		Actores actor36 = new Actores("Norberto", "Arcus�n", 0, true);
		Actores actor37 = new Actores("Gabriel", "Molinelli", 0, true);
		Actores actor38 = new Actores("Claudio", "Rissi", 0, true);
		Actores actor39 = new Actores("H�ctor", "Alterio", 0, true);
		Actores actor40 = new Actores("Norma", "Aleandro", 0, true);
		Actores actor41 = new Actores("Natalia", "Verbeke", 0, true);
		Actores actor42 = new Actores("Eduardo", "Blanco", 0, true);
		Actores actor43 = new Actores("Gimena", "N�bile", 0, true);
		Actores actor44 = new Actores("Claudia", "Font�n", 0, true);
		Actores actor45 = new Actores("David", "Masajnik", 0, true);
		Actores actor46 = new Actores("Atilio", "Pozzobon", 0, true);
		Actores actor47 = new Actores("Salo", "Pasik", 0, true);
		Actores actor48 = new Actores("Dar�o", "Grandinetti", 0, true);
		Actores actor49 = new Actores("Leonardo", "Sbaraglia", 0, true);
		Actores actor50 = new Actores("Erica", "Rivas", 0, true);
		Actores actor51 = new Actores("Oscar", "Mart�nez", 0, true);
		Actores actor52 = new Actores("Julieta", "Zylberberg", 0, true);
		Actores actor53 = new Actores("Rita", "Cortese", 0, true);
		Actores actor54 = new Actores("Mar�a", "Onetto", 0, true);
		Actores actor55 = new Actores("Osmar", "N��ez", 0, true);
		Actores actor56 = new Actores("Nancy", "Dupl�a", 0, true);
		Actores actor57 = new Actores("Mar�a", "Marull", 0, true);
		Actores actor58 = new Actores("Germ�n", "Silva", 0, true);
		Actores actor59 = new Actores("Marcelo", "Pozzi", 0, true);
		Actores actor60 = new Actores("Diego", "Gentile", 0, true);
		Actores actor61 = new Actores("Alan", "Daicz", 0, true);
		Actores actor62 = new Actores("Liliana", "Weimer", 0, true);
		Actores actor63 = new Actores("Claudio", "Delan", 0, true);
		Actores actor64 = new Actores("Lucila", "Mangone", 0, true);
		Actores actor65 = new Actores("Federico", "Liss", 0, true);
		Actores actor66 = new Actores("Walter", "Donado", 0, true);
		Actores actor67 = new Actores("Diego", "Vel�zquez", 0, true);
		Actores actor68 = new Actores("Margarita", "Molfino", 0, true);
		Actores actor69 = new Actores("C�sar", "Bord�n", 0, true);
		Actores actor70 = new Actores("M�nica", "Villa", 0, true);
		Actores actor71 = new Actores("Juan", "Linari", 0, true);
		Actores actor72 = new Actores("Federico", "Luppi", 0, true);
		Actores actor73 = new Actores("Mercedes", "Sampietro", 0, true);
		Actores actor74 = new Actores("Arturo", "Puig", 0, true);
		Actores actor75 = new Actores("Carlos", "Santamar�a", 0, true);
		Actores actor76 = new Actores("Yael", "Bamat�n", 0, true);
		Actores actor77 = new Actores("Valentina", "Bassi", 0, true);
		Actores actor78 = new Actores("Mar�a", "Fiorentino", 0, true);
		Actores actor79 = new Actores("Klaus", "Dietze", 0, true);
		Actores actor80 = new Actores("Eduardo", "Iaccono", 0, true);
		Actores actor81 = new Actores("Walter", "Jakob", 0, true);
		Actores actor82 = new Actores("Mariano", "Llin�s", 0, true);
		Actores actor83 = new Actores("Horacio", "Marassi", 0, true);
		Actores actor84 = new Actores("Agust�n", "Mendilaharzu", 0, true);
		Actores actor85 = new Actores("�scar", "Mart�nez", 0, true);
		Actores actor86 = new Actores("Dady", "Brieva", 0, true);
		Actores actor87 = new Actores("Andrea", "Frigerio", 0, true);
		Actores actor88 = new Actores("Bel�n", "Chavanne", 0, true);
		Actores actor89 = new Actores("Nora", "Navas", 0, true);
		Actores actor90 = new Actores("Iv�n", "Steinhardt", 0, true);
		Actores actor91 = new Actores("Manuel", "Vicente", 0, true);
		Actores actor92 = new Actores("Marcelo", "D'Andrea", 0, true);
		Actores actor93 = new Actores("Gustavo", "Garz�n", 0, true);
		Actores actor94 = new Actores("Emma", "Rivera", 0, true);
		Actores actor95 = new Actores("Javier", "Lombardo", 0, true);
		Actores actor96 = new Actores("Antonio", "Benedictis", 0, true);
		Actores actor97 = new Actores("Javiera", "Bravo", 0, true);
		Actores actor98 = new Actores("Laura", "Vagnoni", 0, true);
		Actores actor99 = new Actores("Mariela", "D�az", 0, true);
		Actores actor100 = new Actores("Julia", "Solomonoff", 0, true);
		Actores actor101 = new Actores("Anibal", "Maldonado", 0, true);
		Actores actor102 = new Actores("Mag�n", "Garc�a", 0, true);
		Actores actor103 = new Actores("Mar�a", "Cianferoni", 0, true);
		Actores actor104 = new Actores("Carlos", "Monteros", 0, true);
		Actores actor105 = new Actores("Gael", "Bernal", 0, true);
		Actores actor106 = new Actores("Rodrigo", "Serna", 0, true);
		Actores actor107 = new Actores("M�a", "Maestro", 0, true);
		Actores actor108 = new Actores("Mercedes", "Mor�n", 0, true);
		Actores actor109 = new Actores("Jorge", "Chiarella", 0, true);
		Actores actor110 = new Actores("Gabriela", "Aguilera", 0, true);
		Actores actor111 = new Actores("Mariana", "Anghileri)", 0, true);
		Actores actor112 = new Actores("Javier", "Drolas", 0, true);
		Actores actor113 = new Actores("Valentina", "Liernud", 0, true);
		Actores actor114 = new Actores("Natalia", "Oreiro", 0, true);
		Actores actor115 = new Actores("Lautaro", "Delgado", 0, true);
		Actores actor116 = new Actores("Susana", "Pamp�n", 0, true);
		Actores actor117 = new Actores("Daniel", "Melingo", 0, true);
		Actores actor118 = new Actores("�ngela", "Torres", 0, true);
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
		Actores actor131 = new Actores("Mart�n", "Adjemi�n", 0, true);
		Actores actor132 = new Actores("Tony", "Lestingi", 0, true);
		Actores actor133 = new Actores("Carlos", "Portaluppi", 0, true);
		Actores actor134 = new Actores("Ernesto", "Claudio", 0, true);
		Actores actor135 = new Actores("", "", 0, true);
		Actores actor136 = new Actores("Juan", "Botto", 0, true);
		Actores actor137 = new Actores("Sus�", "Pecoraro", 0, true);
		Actores actor138 = new Actores("Jos�", "Sacrist�n", 0, true);
		Actores actor139 = new Actores("Agust�n", "Garvie", 0, true);
		Actores actor140 = new Actores("Vando", "Villamil", 0, true);
		Actores actor141 = new Actores("Marcela", "Kloosterboer", 0, true);
		Actores actor142 = new Actores("Maximiliano", "Ghione", 0, true);
		Actores actor143 = new Actores("Marina", "Gleezer", 0, true);
		Actores actor144 = new Actores("Carla", "Crespo", 0, true);
		Actores actor145 = new Actores("Marcos", "Mundstock", 0, true);
		Actores actor146 = new Actores("Ra�l", "Rizzo", 0, true);
		Actores actor147 = new Actores("Alberto", "Jim�nez", 0, true);
		Actores actor148 = new Actores("�ngel", "Facio", 0, true);
		Actores actor149 = new Actores("Mar�a", "Galiana", 0, true);
		Actores actor150 = new Actores("Marcos", "Woinski", 0, true);
		Actores actor151 = new Actores("Antonella", "Costa", 0, true);
		Actores actor152 = new Actores("Pablo", "Cedr�n", 0, true);
		Actores actor153 = new Actores("Esteban", "Meloni", 0, true);
		Actores actor154 = new Actores("Mariana", "Briski", 0, true);
		Actores actor155 = new Actores("Hern�n", "Jim�nez", 0, true);
		Actores actor156 = new Actores("China", "Zorrilla", 0, true);
		Actores actor157 = new Actores("Manuel", "Alexandre", 0, true);
		Actores actor158 = new Actores("Blanca", "Portillo", 0, true);
		Actores actor159 = new Actores("Roberto", "Carnaghi", 0, true);
		Actores actor160 = new Actores("Jos�", "Egido", 0, true);
		Actores actor161 = new Actores("Gonzalo", "Urtizberea", 0, true);
		Actores actor162 = new Actores("Omar", "Mu�oz", 0, true);
		Actores actor163 = new Actores("Carlos", "Novoa", 0, true);
		Actores actor164 = new Actores("Fanny", "Gautier", 0, true);
		Actores actor165 = new Actores("Claudia", "�lvarez", 0, true);
		Actores actor166 = new Actores("Tom�s", "S�ez", 0, true);
		Actores actor167 = new Actores("Pablo", "Echarri", 0, true);
		Actores actor168 = new Actores("Nazareno", "Casero", 0, true);
		Actores actor169 = new Actores("Mat�as", "Marmorato", 0, true);
		Actores actor170 = new Actores("Diego", "G�mez", 0, true);
		Actores actor171 = new Actores("Mart�n", "Urruty", 0, true);
		Actores actor172 = new Actores("Micaela", "V�zquez", 0, true);
		Actores actor173 = new Actores("Juli�n", "Krakov", 0, true);
		Actores actor174 = new Actores("Rub�n", "Noceda", 0, true);
		Actores actor175 = new Actores("Alfonso", "Tort", 0, true);
		Actores actor176 = new Actores("C�sar", "Albarrac�n", 0, true);
		Actores actor177 = new Actores("Leonardo", "Ram�rez", 0, true);
		Actores actor178 = new Actores("Juan", "Villegas", 0, true);
		Actores actor179 = new Actores("Rosa", "Valsecchi", 0, true);
		Actores actor180 = new Actores("Pascual", "Condito", 0, true);
		Actores actor181 = new Actores("Carlos", "Rossi", 0, true);
		Actores actor182 = new Actores("Ulises", "Dumont", 0, true);
		Actores actor183 = new Actores("Silvina", "Bosco", 0, true);
		Actores actor184 = new Actores("Floria", "Bloise", 0, true);
		Actores actor185 = new Actores("Nicol�s", "Condito", 0, true);
		Actores actor186 = new Actores("Tito", "Mendoza", 0, true);
		Actores actor187 = new Actores("Leonor", "Manso", 0, true);
		Actores actor188 = new Actores("Peto", "Menahem", 0, true);
		Actores actor189 = new Actores("Alejandra", "Manzo", 0, true);
		Actores actor190 = new Actores("Laura", "Cymer", 0, true);
		Actores actor191 = new Actores("Julio", "Ch�vez", 0, true);
		Actores actor192 = new Actores("Luis", "Mach�n", 0, true);
		Actores actor193 = new Actores("Agostina", "Lage", 0, true);
		Actores actor194 = new Actores("Enrique", "Liporace", 0, true);
		Actores actor195 = new Actores("Rene", "Lavand", 0, true);
		Actores actor196 = new Actores("Freddy", "Flores", 0, true);
		Actores actor197 = new Actores("Ernesto", "Villegas", 0, true);
		Actores actor198 = new Actores("Luis", "Machin", 0, true);
		Actores actor199 = new Actores("Carlos", "Belloso", 0, true);
		Actores actor200 = new Actores("Alfredo", "Casero", 0, true);
		Actores actor201 = new Actores("Marcelo", "Mazzarello", 0, true);
		Actores actor202 = new Actores("Cecilia", "Roth", 0, true);
		Actores actor203 = new Actores("Fernanda", "Mistral", 0, true);
		Actores actor204 = new Actores("M�nica", "Scapparone", 0, true);
		Actores actor205 = new Actores("Milton", "Canal", 0, true);
		Actores actor206 = new Actores("Mat�as", "Pozo", 0, true);
		Actores actor207 = new Actores("Evelyn", "Dom�nguez", 0, true);
		Actores actor208 = new Actores("Leticia", "Bredice", 0, true);
		Actores actor209 = new Actores("Nicol�s", "Cantafio", 0, true);
		Actores actor210 = new Actores("Gabriel", "Gal�ndez", 0, true);
		Actores actor211 = new Actores("Mar�a", "Socas", 0, true);
		Actores actor212 = new Actores("Juan", "Carrasco", 0, true);
		Actores actor213 = new Actores("Demi�n", "Bugallo", 0, true);
		Actores actor214 = new Actores("Valent�n", "Barrio", 0, true);
		Actores actor215 = new Actores("Oscar", "Ferrigno", 0, true);
		Actores actor216 = new Actores("Alberto", "Silva", 0, true);
		Actores actor217 = new Actores("Rosa", "S�nchez", 0, true);
		Actores actor218 = new Actores("�scar", "Bertea", 0, true);
		Actores actor219 = new Actores("Marcelo", "Videla", 0, true);
		Actores actor220 = new Actores("Alberto", "Mercado", 0, true);
		Actores actor221 = new Actores("H�ctor", "Anglada", 0, true);
		Actores actor222 = new Actores("Mart�n", "Piroyansky", 0, true);
		Actores actor223 = new Actores("Mar�a", "Canale", 0, true);
		Actores actor224 = new Actores("Martina", "Gusman", 0, true);
		Actores actor225 = new Actores("Elli", "Medeiros", 0, true);
		Actores actor226 = new Actores("Rodrigo", "Santoro", 0, true);
		Actores actor227 = new Actores("Laura", "Garc�a", 0, true);
		Actores actor228 = new Actores("Tom�s", "Plotinsky", 0, true);
		Actores actor229 = new Actores("Leonardo", "Sauma", 0, true);
		Actores actor230 = new Actores("Clara", "Sajnovetzky", 0, true);
		Actores actor231 = new Actores("Roberto", "Maciel", 0, true);
		Actores actor232 = new Actores("Walter", "Cignoli", 0, true);
		Actores actor233 = new Actores("Ricardo", "Ragendorfer", 0, true);
		Actores actor234 = new Actores("Hern�n", "Piqu�n", 0, true);
		Actores actor235 = new Actores("Alejandra", "Baldoni", 0, true);
		Actores actor236 = new Actores("Natalia", "Pelayo", 0, true);
		Actores actor237 = new Actores("Jorge", "Torres", 0, true);
		Actores actor238 = new Actores("Luis", "Mazzeo", 0, true);
		Actores actor239 = new Actores("Ignacio", "Toselli", 0, true);
		Actores actor240 = new Actores("Mariana", "Anghileri", 0, true);
		Actores actor241 = new Actores("Alicia", "Palmes", 0, true);
		Actores actor242 = new Actores("Sof�a", "Silva", 0, true);
		Actores actor243 = new Actores("Ariel", "Staltari", 0, true);
		Actores actor244 = new Actores("Pablo", "Ribba", 0, true);
		Actores actor245 = new Actores("Marcelo", "Nacci", 0, true);
		Actores actor246 = new Actores("Gabriel", "Goity", 0, true);
		Actores actor247 = new Actores("Corina", "Romero", 0, true);
		Actores actor248 = new Actores("Ricardo", "Niz", 0, true);
		Actores actor249 = new Actores("Norma", "Argentina", 0, true);
		Actores actor250 = new Actores("Ra�l", "Panguinao", 0, true);
		Actores actor251 = new Actores("Susana", "Lanteri", 0, true);
		Actores actor252 = new Actores("Claudia", "Lapac�", 0, true);
		Actores actor253 = new Actores("M�nica", "Gonzaga", 0, true);
		Actores actor254 = new Actores("Eduardo", "Rodr�guez", 0, true);
		Actores actor255 = new Actores("Alberto", "Laiseca", 0, true);
		Actores actor256 = new Actores("Sergio", "P�ngaro", 0, true);
		Actores actor257 = new Actores("Andr�s", "Duprat", 0, true);
		Actores actor258 = new Actores("Enrique", "Gagliesi", 0, true);
		Actores actor259 = new Actores("Ana", "Loza", 0, true);
		Actores actor260 = new Actores("Luciana", "Fauci", 0, true);
		Actores actor261 = new Actores("Ernesto", "Suarez", 0, true);
		Actores actor262 = new Actores("Elisa", "Carricajo", 0, true);
		Actores actor263 = new Actores("Marta", "Lubos", 0, true);
		Actores actor264 = new Actores("Maria", "Canale", 0, true);
		Actores actor265 = new Actores("Nicole", "Apstein", 0, true);
		Actores actor266 = new Actores("Marcela", "Ballestero", 0, true);
		Actores actor267 = new Actores("Steve", "Kisicki", 0, true);
		Actores actor268 = new Actores("Raymond", "Lee", 0, true);
		Actores actor269 = new Actores("Agustin", "Olcese", 0, true);
		Actores actor270 = new Actores("Graciela", "Borges", 0, true);
		Actores actor271 = new Actores("Mart�n", "Adjeiman", 0, true);
		Actores actor272 = new Actores("Leonora", "Balcarce", 0, true);
		Actores actor273 = new Actores("Diego", "Baenas", 0, true);
		Actores actor274 = new Actores("Silvia", "Bayel", 0, true);
		Actores actor275 = new Actores("Sof�a", "Bertolotto", 0, true);
		Actores actor276 = new Actores("Valeria", "Bertuccelli", 0, true);
		Actores actor277 = new Actores("Jos�", "V�zquez", 0, true);
		Actores actor278 = new Actores("Daniel", "Fanego", 0, true);
		Actores actor279 = new Actores("Silvia", "Kutika", 0, true);
		Actores actor280 = new Actores("Chino", "Dar�n", 0, true);
		Actores actor281 = new Actores("Rita", "Pauls", 0, true);
		Actores actor282 = new Actores("Mar�a", "Soldi", 0, true);
		Actores actor283 = new Actores("Justina", "Bustos", 0, true);
		Actores actor284 = new Actores("Dar�o", "Levy", 0, true);
		Actores actor285 = new Actores("Monica", "Lairana", 0, true);
		Actores actor286 = new Actores("Rodrigo", "Silva", 0, true);
		Actores actor287 = new Actores("Clara", "Lago", 0, true);
		Actores actor288 = new Actores("Uma", "Salduende", 0, true);
		Actores actor289 = new Actores("Daniel", "Comini", 0, true);
		Actores actor290 = new Actores("Laura", "Faienza", 0, true);
		Actores actor291 = new Actores("Sergio", "Ferreiro", 0, true);
		Actores actor292 = new Actores("Facundo", "Gim�nez", 0, true);
		Actores actor293 = new Actores("Ariel", "Croce", 0, true);
		Actores actor294 = new Actores("Crist�bal", "Pinto", 0, true);
		Actores actor295 = new Actores("Adri�n", "Witzke", 0, true);
		Actores actor296 = new Actores("Julieta", "D�az", 0, true);
		Actores actor297 = new Actores("Enrique", "Pi�eyro", 0, true);
		Actores actor298 = new Actores("Adolfo", "Yanelli", 0, true);
		Actores actor299 = new Actores("Mart�n", "Slipak", 0, true);
		Actores actor300 = new Actores("Sergio", "Boris", 0, true);
		Actores actor301 = new Actores("Joaqu�n", "Furriel", 0, true);
		Actores actor302 = new Actores("M�nica", "Lairana", 0, true);
		Actores actor303 = new Actores("Guillermo", "Pfening", 0, true);
		Actores actor304 = new Actores("Luis", "Ziembrowski", 0, true);
		Actores actor305 = new Actores("Victoria", "Raposo", 0, true);
		Actores actor306 = new Actores("Andrea", "Garrote", 0, true);
		Actores actor307 = new Actores("Abel", "Ayala", 0, true);
		Actores actor308 = new Actores("Marina", "Glezer", 0, true);
		Actores actor309 = new Actores("Fernando", "Roa", 0, true);
		Actores actor310 = new Actores("Fabi�n", "Arenillas", 0, true);
		Actores actor311 = new Actores("V�ctor", "Carrizo", 0, true);
		Actores actor312 = new Actores("Osvaldo", "Sanders", 0, true);
		Actores actor313 = new Actores("Rafael", "Spregelburd", 0, true);
		Actores actor314 = new Actores("Daniel", "Ar�oz", 0, true);
		Actores actor315 = new Actores("Eugenia", "Alonso", 0, true);
		Actores actor316 = new Actores("In�s", "Budassi", 0, true);
		Actores actor317 = new Actores("Lorenza", "Acu�a", 0, true);
		Actores actor318 = new Actores("Eugenio", "Scopel", 0, true);
		Actores actor319 = new Actores("D�bora", "Zanolli", 0, true);
		Actores actor320 = new Actores("B�rbara", "Hang", 0, true);
		Actores actor321 = new Actores("Rub�n", "Guzm�n", 0, true);
		Actores actor322 = new Actores("Sol", "Alac", 0, true);
		Actores actor323 = new Actores("Sergio", "Baldini", 0, true);
		Actores actor324 = new Actores("Gerardo", "Chendo", 0, true);
		Actores actor325 = new Actores("Diego", "Mackenzie", 0, true);
		Actores actor326 = new Actores("Fernando", "Cia", 0, true);
		Actores actor327 = new Actores("Vera", "Fogwill", 0, true);
		Actores actor328 = new Actores("Luc�a", "Snieg", 0, true);
		Actores actor329 = new Actores("Mirta", "Busnelli", 0, true);
		Actores actor330 = new Actores("Edda", "D�az", 0, true);
		Actores actor331 = new Actores("Mariel", "Sanchez", 0, true);
		Actores actor332 = new Actores("Paola", "Krum", 0, true);
		Actores actor333 = new Actores("Claudio", "Gallardou", 0, true);
		Actores actor334 = new Actores("Diego", "Capusotto", 0, true);
		Actores actor335 = new Actores("Jacqueline", "Decibe", 0, true);
		Actores actor336 = new Actores("Ivana", "Acosta", 0, true);
		Actores actor337 = new Actores("Alfonso", "Sierra", 0, true);
		Actores actor338 = new Actores("Sebasti�n", "Toro", 0, true);
		Actores actor339 = new Actores("Juan", "Echanove", 0, true);
		Actores actor340 = new Actores("Juan", "Diego", 0, true);
		Actores actor341 = new Actores("Diego", "Torres", 0, true);
		Actores actor342 = new Actores("Rebeca", "Cobos", 0, true);
		Actores actor343 = new Actores("Vladimir", "Cruz", 0, true);
		Actores actor344 = new Actores("Enrique", "Qui�ones", 0, true);
		Actores actor345 = new Actores("Alejandro", "Trejo", 0, true);
		Actores actor346 = new Actores("Gabriel", "Rovito", 0, true);
		Actores actor347 = new Actores("Peter", "Lanzani", 0, true);
		Actores actor348 = new Actores("In�s", "Popovich", 0, true);
		Actores actor349 = new Actores("Gast�n", "Cocchiarale", 0, true);
		Actores actor350 = new Actores("Giselle", "Motta", 0, true);
		Actores actor351 = new Actores("Franco", "Masini", 0, true);
		Actores actor352 = new Actores("Antonia", "Bengoechea", 0, true);
		Actores actor353 = new Actores("Gabo", "Correa", 0, true);
		Actores actor354 = new Actores("Pilar", "Ayala", 0, true);
		Actores actor355 = new Actores("In�s", "Efron", 0, true);
		Actores actor356 = new Actores("Carla", "Peterson", 0, true);
		Actores actor357 = new Actores("Rafael", "Ferro", 0, true);
		Actores actor358 = new Actores("Adri�n", "Navarro", 0, true);
		Actores actor359 = new Actores("Jorge", "Lanata", 0, true);
		Actores actor360 = new Actores("Alan", "Pauls", 0, true);
		Actores actor361 = new Actores("Romina", "Paula", 0, true);
		Actores actor362 = new Actores("Daniel", "Hendler", 0, true);
		Actores actor363 = new Actores("Adriana", "Aizemberg", 0, true);
		Actores actor364 = new Actores("Jorge", "D'El�a", 0, true);
		Actores actor365 = new Actores("Rosita", "Londner", 0, true);
		Actores actor366 = new Actores("Diego", "Korol", 0, true);
		Actores actor367 = new Actores("Melina", "Petriella", 0, true);
		Actores actor368 = new Actores("Juan", "Minuj�n", 0, true);
		Actores actor369 = new Actores("Norman", "Erlich", 0, true);
		Actores actor370 = new Actores("Gustavo", "Cornill�n", 0, true);
		Actores actor371 = new Actores("Mar�a", "Alch�", 0, true);
		Actores actor372 = new Actores("Luis", "Rial", 0, true);
		Actores actor373 = new Actores("Alejandra", "Flechner", 0, true);
		Actores actor374 = new Actores("Malena", "S�nchez", 0, true);
		Actores actor375 = new Actores("Flavia", "Palmiero", 0, true);
		Actores actor376 = new Actores("Teo", "Moreno", 0, true);
		Actores actor377 = new Actores("Ernesto", "Alterio", 0, true);
		Actores actor378 = new Actores("C�sar", "Troncoso", 0, true);
		Actores actor379 = new Actores("Cristina", "Banegas", 0, true);
		Actores actor380 = new Actores("Violeta", "Palukas", 0, true);
		Actores actor381 = new Actores("Alejandro", "Urdapilleta", 0, true);
		Actores actor382 = new Actores("Florencia", "Raggi", 0, true);
		Actores actor383 = new Actores("Ignacio", "Huang", 0, true);
		Actores actor384 = new Actores("Muriel", "Ana", 0, true);
		Actores actor385 = new Actores("Iv�n", "Romanelli", 0, true);
		Actores actor386 = new Actores("Vivian", "Jaber", 0, true);
		Actores actor387 = new Actores("Enric", "Cambray", 0, true);
		Actores actor388 = new Actores("Pablo", "Seijo", 0, true);
		Actores actor389 = new Actores("Joaqu�n", "Bouzas", 0, true);
		Actores actor390 = new Actores("Manuel", "Vignau", 0, true);
		Actores actor391 = new Actores("Mateo", "Chiarino", 0, true);
		Actores actor392 = new Actores("Mercedes", "Quinteros", 0, true);
		Actores actor393 = new Actores("Luz", "Palaz�n", 0, true);
		Actores actor394 = new Actores("Manuel", "Sobrad", 0, true);
		Actores actor395 = new Actores("Jorge", "Rom�n", 0, true);
		Actores actor396 = new Actores("Mim�", "Ard�", 0, true);
		Actores actor397 = new Actores("Victor", "Carrizo", 0, true);
		Actores actor398 = new Actores("Hugo", "Anganuzzi", 0, true);
		Actores actor399 = new Actores("Luis", "Vicat", 0, true);
		Actores actor400 = new Actores("Graciana", "Chironi", 0, true);
		Actores actor401 = new Actores("Roberto", "Posse", 0, true);
		Actores actor402 = new Actores("Anibal", "Barengo", 0, true);
		Actores actor403 = new Actores("Lucas", "Olivera", 0, true);
		Actores actor404 = new Actores("Jorge", "Gim�nez", 0, true);
		Actores actor405 = new Actores("Daniel", "Coria", 0, true);
		Actores actor406 = new Actores("Gast�n", "Polo", 0, true);
		Actores actor407 = new Actores("Argentino", "Vargas", 0, true);
		Actores actor408 = new Actores("Francisco", "Dornez", 0, true);
		Actores actor409 = new Actores("Yolanda", "Galarza", 0, true);
		Actores actor410 = new Actores("V�ctor", "Varela", 0, true);
		Actores actor411 = new Actores("Francisco", "Salazar", 0, true);
		Actores actor412 = new Actores("Hilda", "Chamorro", 0, true);
		Actores actor413 = new Actores("�ngel", "Vera", 0, true);
		Actores actor414 = new Actores("Javier", "Lenciza", 0, true);
		Actores actor415 = new Actores("B�rbara", "Goenaga", 0, true);
		Actores actor416 = new Actores("Ana", "Celentano", 0, true);
		Actores actor417 = new Actores("Liliana", "Capuro", 0, true);
		Actores actor418 = new Actores("Ruth", "Dobel", 0, true);
		Actores actor419 = new Actores("Federico", "Esquerro", 0, true);
		Actores actor420 = new Actores("Nicol�s", "L�pez", 0, true);
		Actores actor421 = new Actores("Bernardo", "Forteza", 0, true);
		Actores actor422 = new Actores("Laura", "Glave", 0, true);
		Actores actor423 = new Actores("Leila", "G�mez", 0, true);
		Actores actor424 = new Actores("Marianela", "Pedano", 0, true);
		Actores actor425 = new Actores("Carlos", "Resta", 0, true);
		Actores actor426 = new Actores("Ra�l", "Vi�oles", 0, true);
		Actores actor427 = new Actores("Liliana", "Escobar", 0, true);
		Actores actor428 = new Actores("Daniel", "Pereira", 0, true);
		Actores actor429 = new Actores("John", "McInerny", 0, true);
		Actores actor430 = new Actores("Griselda", "Siciliani", 0, true);
		Actores actor431 = new Actores("Margarita", "L�pez", 0, true);
		Actores actor432 = new Actores("Roc�o", "Presedo", 0, true);
		Actores actor433 = new Actores("Nora", "Childers", 0, true);
		Actores actor434 = new Actores("Ariadna", "Gil", 0, true);
		Actores actor435 = new Actores("Malena", "Solda", 0, true);
		Actores actor436 = new Actores("Nancy", "Duplaa", 0, true);
		Actores actor437 = new Actores("Nicol�s", "Pauls", 0, true);
		Actores actor438 = new Actores("Cristina", "Fridman", 0, true);
		Actores actor439 = new Actores("Sof�a", "Castiglione", 0, true);
		Actores actor440 = new Actores("Romina", "Ricci", 0, true);
		Actores actor441 = new Actores("Julio", "Arrieta", 0, true);
		Actores actor442 = new Actores("Dolores", "Fern�ndez", 0, true);
		Actores actor443 = new Actores("Claudia", "Herrera", 0, true);
		Actores actor444 = new Actores("Ignacio", "Ben�tez", 0, true);
		Actores actor445 = new Actores("Carlos", "Bella", 0, true);
		Actores actor446 = new Actores("Paola", "Rotela", 0, true);
		Actores actor447 = new Actores("Silvina", "Fontelles", 0, true);
		Actores actor448 = new Actores("Miguel", "Colman", 0, true);
		Actores actor449 = new Actores("Leandro", "Castello", 0, true);
		Actores actor450 = new Actores("Mercedes", "Scapola", 0, true);
		Actores actor451 = new Actores("Mariano", "Mart�nez", 0, true);
		Actores actor452 = new Actores("Karina", "Dali", 0, true);
		Actores actor453 = new Actores("Facundo", "Espinosa", 0, true);
		Actores actor454 = new Actores("Santiago", "Pedrero", 0, true);
		Actores actor455 = new Actores("Celina", "Zamb�n", 0, true);
		Actores actor456 = new Actores("Marcos", "Zucker", 0, true);
		Actores actor457 = new Actores("Dar�o", "Torrens", 0, true);
		Actores actor458 = new Actores("Cecilia", "Trejo", 0, true);
		Actores actor459 = new Actores("Germ�n", "Palacios", 0, true);
		Actores actor460 = new Actores("Carolina", "Peleritti", 0, true);
		Actores actor461 = new Actores("Guillermo", "Angelelli", 0, true);
		Actores actor462 = new Actores("Dar�o", "Valenzuela", 0, true);
		Actores actor463 = new Actores("Carlos", "Weber", 0, true);
		Actores actor464 = new Actores("Jos�", "Arias", 0, true);
		Actores actor465 = new Actores("Loren", "Acu�a", 0, true);
		Actores actor466 = new Actores("Gabriel", "Almir�n", 0, true);
		Actores actor467 = new Actores("Jos�", "Espeche", 0, true);
		Actores actor468 = new Actores("Guadalupe", "Alonso", 0, true);
		Actores actor469 = new Actores("Mar�a", "Merendino", 0, true);
		Actores actor470 = new Actores("Mirella", "Pascual", 0, true);
		Actores actor471 = new Actores("Silvia", "Tavcar", 0, true);
		Actores actor472 = new Actores("Nicol�s", "Treise", 0, true);
		Actores actor473 = new Actores("Misael", "Saavedra", 0, true);
		Actores actor474 = new Actores("Humberto", "Estrada", 0, true);
		Actores actor475 = new Actores("Rafael", "Estrada", 0, true);
		Actores actor476 = new Actores("Omar", "Didino", 0, true);
		Actores actor477 = new Actores("Javier", "Didino", 0, true);
		Actores actor478 = new Actores("B�rbara", "Lombardo", 0, true);
		Actores actor479 = new Actores("Susana", "Campos", 0, true);
		Actores actor480 = new Actores("Hugo", "Arana", 0, true);
		Actores actor481 = new Actores("Osvaldo", "Santoro", 0, true);
		Actores actor482 = new Actores("Mercedes", "Funes", 0, true);
		Actores actor483 = new Actores("Silvia", "Bayl�", 0, true);
		Actores actor484 = new Actores("Jazm�n", "Stuart", 0, true);
		Actores actor485 = new Actores("Mart�n", "Feldman", 0, true);
		Actores actor486 = new Actores("Miguel", "Dedovich", 0, true);
		Actores actor487 = new Actores("Dolores", "Fonzi", 0, true);
		Actores actor488 = new Actores("Walter", "Reyno", 0, true);
		Actores actor489 = new Actores("Jorge", "D�El�a", 0, true);
		Actores actor490 = new Actores("Nahuel", "Biscayart", 0, true);
		Actores actor491 = new Actores("Juan", "Leyrado", 0, true);
		Actores actor492 = new Actores("Virginia", "Inocenti", 0, true);
		Actores actor493 = new Actores("Arturo", "Bon�n", 0, true);
		Actores actor494 = new Actores("Mar�a", "Car�mbula", 0, true);
		Actores actor495 = new Actores("Pepe", "Novoa", 0, true);
		Actores actor496 = new Actores("�scar", "N��ez", 0, true);
		Actores actor497 = new Actores("M�nica", "Antonopulos", 0, true);
		Actores actor498 = new Actores("Mabel", "Pessen", 0, true);
		Actores actor499 = new Actores("Lu�s", "Mach�n", 0, true);
		Actores actor500 = new Actores("Cecilia", "Rosetto", 0, true);
		Actores actor501 = new Actores("Luciano", "C�ceres", 0, true);
		Actores actor502 = new Actores("M.Laura", "Caccamo", 0, true);
		Actores actor503 = new Actores("Paloma", "Contreras", 0, true);
		Actores actor504 = new Actores("Vera", "Carneval", 0, true);
		Actores actor505 = new Actores("Jorge", "Marrale", 0, true);
		Actores actor506 = new Actores("Bel�n", "Blanco", 0, true);
		Actores actor507 = new Actores("Esteban", "P�rez", 0, true);
		Actores actor508 = new Actores("Duilio", "Marzio", 0, true);
		Actores actor509 = new Actores("Jean", "Reguerraz", 0, true);
		Actores actor510 = new Actores("M�nica", "Cabrera", 0, true);
		Actores actor511 = new Actores("�rica", "Rivas", 0, true);
		Actores actor512 = new Actores("Susana", "Pampin", 0, true);
		Actores actor513 = new Actores("Marcelo", "Subiotto", 0, true);
		Actores actor514 = new Actores("Elvira", "Onetto", 0, true);
		Actores actor515 = new Actores("Roberto", "Su�rez", 0, true);
		Actores actor516 = new Actores("Rosana", "Vezzoni", 0, true);
		Actores actor517 = new Actores("Esteban", "Lamothe", 0, true);
		Actores actor518 = new Actores("Ricardo", "Felix", 0, true);
		Actores actor519 = new Actores("Valeria", "Correa", 0, true);
		Actores actor520 = new Actores("Mar�a", "Alche", 0, true);
		Actores actor521 = new Actores("Alejo", "Mango", 0, true);
		Actores actor522 = new Actores("Arturo", "Goetz", 0, true);
		Actores actor523 = new Actores("Rub�n", "Beltr�n", 0, true);
		Actores actor524 = new Actores("Armando", "Galvalisi", 0, true);
		Actores actor525 = new Actores("Gabriel", "M�ndez", 0, true);
		Actores actor526 = new Actores("Alejandro", "M�ndez", 0, true);
		Actores actor527 = new Actores("Natalia", "G�mez", 0, true);
		Actores actor528 = new Actores("Franco", "Gonz�lez", 0, true);
		Actores actor529 = new Actores("Adri�n", "Suar", 0, true);
		Actores actor530 = new Actores("Marcelo", "Xicarte", 0, true);
		Actores actor531 = new Actores("Luis", "Herrera", 0, true);
		Actores actor532 = new Actores("Mart�n", "Salazar", 0, true);
		Actores actor533 = new Actores("Oscar", "Nu�ez", 0, true);
		Actores actor534 = new Actores("Benjam�n", "Amadeo", 0, true);
		Actores actor535 = new Actores("Lucas", "Ferraro", 0, true);
		Actores actor536 = new Actores("Dami�n", "Canduci", 0, true);
		Actores actor537 = new Actores("Ana", "Antony", 0, true);
		Actores actor538 = new Actores("Carolina", "Stegmayer", 0, true);
		Actores actor539 = new Actores("Antonia", "Michelis", 0, true);
		Actores actor540 = new Actores("Laura", "Paredes", 0, true);
		Actores actor541 = new Actores("Valeria", "Lois", 0, true);
		Actores actor542 = new Actores("Rafael", "Federman", 0, true);

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
		Generos genero5 = new Generos("Animaci�n");
		this.generoService.add(genero5);
		Generos genero6 = new Generos("Romance");
		this.generoService.add(genero6);
		Generos genero7 = new Generos("Ciencia ficci�n");
		this.generoService.add(genero7);
		Generos genero8 = new Generos("B�lico");
		this.generoService.add(genero8);

		/*Genero Directores*/
		Directores director0 = new Directores("Juan", "Campanella", 0);
		this.directorService.add(director0);
		Directores director1 = new Directores("Fabi�n", "Bielinsky", 0);
		this.directorService.add(director1);
		Directores director2 = new Directores("Juan", "Campanella", 0);
		this.directorService.add(director2);
		Directores director3 = new Directores("Dami�n", "Szifr�n", 0);
		this.directorService.add(director3);
		Directores director4 = new Directores("Adolfo", "Aristarain", 0);
		this.directorService.add(director4);
		Directores director5 = new Directores("Mariano", "Llin�s", 0);
		this.directorService.add(director5);
		Directores director6 = new Directores("Mariano", "Duprat", 0);
		this.directorService.add(director6);
		Directores director7 = new Directores("Carlos", "Sor�n", 0);
		this.directorService.add(director7);
		Directores director8 = new Directores("Walter", "Salles", 0);
		this.directorService.add(director8);
		Directores director9 = new Directores("Gustavo", "Taretto", 0);
		this.directorService.add(director9);
		Directores director10 = new Directores("Lorena", "Mu�oz", 0);
		this.directorService.add(director10);
		Directores director11 = new Directores("Alejandro", "Agresti", 0);
		this.directorService.add(director11);
		Directores director12 = new Directores("Dami�n", "Szifr�n", 0);
		this.directorService.add(director12);
		Directores director13 = new Directores("Santiago", "Grasso", 0);
		this.directorService.add(director13);
		Directores director14 = new Directores("Adolfo", "Aristarain", 0);
		this.directorService.add(director14);
		Directores director15 = new Directores("Eduardo", "Mignogna", 0);
		this.directorService.add(director15);
		Directores director16 = new Directores("Marcos", "Carnevale", 0);
		this.directorService.add(director16);
		Directores director17 = new Directores("Adri�n", "Caetano", 0);
		this.directorService.add(director17);
		Directores director18 = new Directores("Carlos", "Sor�n", 0);
		this.directorService.add(director18);
		Directores director19 = new Directores("Santiago", "Oves", 0);
		this.directorService.add(director19);
		Directores director20 = new Directores("Marcos", "Carnevale", 0);
		this.directorService.add(director20);
		Directores director21 = new Directores("Adri�n", "Caetano", 0);
		this.directorService.add(director21);
		Directores director22 = new Directores("Lucho", "Bender", 0);
		this.directorService.add(director22);
		Directores director23 = new Directores("Marcelo", "Pi�eyro", 0);
		this.directorService.add(director23);
		Directores director24 = new Directores("Adri�n", "Caetano", 0);
		this.directorService.add(director24);
		Directores director25 = new Directores("Mart�n", "Piroyansky", 0);
		this.directorService.add(director25);
		Directores director26 = new Directores("Pablo", "Trapero", 0);
		this.directorService.add(director26);
		Directores director27 = new Directores("Leonardo", "Favio", 0);
		this.directorService.add(director27);
		Directores director28 = new Directores("Leonardo", "Cesare", 0);
		this.directorService.add(director28);
		Directores director29 = new Directores("Javier", "Salazar", 0);
		this.directorService.add(director29);
		Directores director30 = new Directores("Jorge", "Gaggero", 0);
		this.directorService.add(director30);
		Directores director31 = new Directores("Mariano", "Duprat", 0);
		this.directorService.add(director31);
		Directores director32 = new Directores("", "", 0);
		this.directorService.add(director32);
		Directores director33 = new Directores("Francisco", "Varone", 0);
		this.directorService.add(director33);
		Directores director34 = new Directores("Federico", "Heller", 0);
		this.directorService.add(director34);
		Directores director35 = new Directores("Lucrecia", "Martel", 0);
		this.directorService.add(director35);
		Directores director36 = new Directores("Juan", "Campanella", 0);
		this.directorService.add(director36);
		Directores director37 = new Directores("Luis", "Ortega", 0);
		this.directorService.add(director37);
		Directores director38 = new Directores("Mar�a", "Menis", 0);
		this.directorService.add(director38);
		Directores director39 = new Directores("Rodrigo", "Grande", 0);
		this.directorService.add(director39);
		Directores director40 = new Directores("Paula", "Hern�ndez", 0);
		this.directorService.add(director40);
		Directores director41 = new Directores("Enrique", "Pi�eyro", 0);
		this.directorService.add(director41);
		Directores director42 = new Directores("Sebasti�n", "Schindel", 0);
		this.directorService.add(director42);
		Directores director43 = new Directores("Juan", "Desanzo", 0);
		this.directorService.add(director43);
		Directores director44 = new Directores("Mariano", "Duprat", 0);
		this.directorService.add(director44);
		Directores director45 = new Directores("Cristian", "Nardini", 0);
		this.directorService.add(director45);
		Directores director46 = new Directores("Vera", "Desalvo", 0);
		this.directorService.add(director46);
		Directores director47 = new Directores("Sebasti�n", "Borensztein", 0);
		this.directorService.add(director47);
		Directores director48 = new Directores("Pedro", "Saborido", 0);
		this.directorService.add(director48);
		Directores director49 = new Directores("Alberto", "Lecchi", 0);
		this.directorService.add(director49);
		Directores director50 = new Directores("Pablo", "Trapero", 0);
		this.directorService.add(director50);
		Directores director51 = new Directores("Juan", "Zaramella", 0);
		this.directorService.add(director51);
		Directores director52 = new Directores("Gustavo", "Taretto", 0);
		this.directorService.add(director52);
		Directores director53 = new Directores("Daniel", "Burman", 0);
		this.directorService.add(director53);
		Directores director54 = new Directores("Juan", "Zaramella", 0);
		this.directorService.add(director54);
		Directores director55 = new Directores("Marcos", "Carnevale", 0);
		this.directorService.add(director55);
		Directores director56 = new Directores("Benjam�n", "�vila", 0);
		this.directorService.add(director56);
		Directores director57 = new Directores("Esteban", "Sapir", 0);
		this.directorService.add(director57);
		Directores director58 = new Directores("Sebasti�n", "Borensztein", 0);
		this.directorService.add(director58);
		Directores director59 = new Directores("Marco", "Berger", 0);
		this.directorService.add(director59);
		Directores director60 = new Directores("Pablo", "Trapero", 0);
		this.directorService.add(director60);
		Directores director61 = new Directores("Lisandro", "Alonso", 0);
		this.directorService.add(director61);
		Directores director62 = new Directores("Miguel", "Cohan", 0);
		this.directorService.add(director62);
		Directores director63 = new Directores("Pablo", "Trapero", 0);
		this.directorService.add(director63);
		Directores director64 = new Directores("Armando", "II", 0);
		this.directorService.add(director64);
		Directores director65 = new Directores("Alberto", "Lecchi", 0);
		this.directorService.add(director65);
		Directores director66 = new Directores("Eliseo", "Subiela", 0);
		this.directorService.add(director66);
		Directores director67 = new Directores("Carlos", "Sor�n", 0);
		this.directorService.add(director67);
		Directores director68 = new Directores("Edi", "Flehner", 0);
		this.directorService.add(director68);
		Directores director69 = new Directores("Fernando", "Musa", 0);
		this.directorService.add(director69);
		Directores director70 = new Directores("Luc�a", "Puenzo", 0);
		this.directorService.add(director70);
		Directores director71 = new Directores("Pablo", "Trapero", 0);
		this.directorService.add(director71);
		Directores director72 = new Directores("Liliana", "Ruiz", 0);
		this.directorService.add(director72);
		Directores director73 = new Directores("Julia", "Solomonoff", 0);
		this.directorService.add(director73);
		Directores director74 = new Directores("Lisandro", "Alonso", 0);
		this.directorService.add(director74);
		Directores director75 = new Directores("Gast�n", "Biraben", 0);
		this.directorService.add(director75);
		Directores director76 = new Directores("Gabriel", "Medina", 0);
		this.directorService.add(director76);
		Directores director77 = new Directores("Fabi�n", "Bielinsky", 0);
		this.directorService.add(director77);
		Directores director78 = new Directores("Trist�n", "Bauer", 0);
		this.directorService.add(director78);
		Directores director79 = new Directores("Rodrigo", "Grande", 0);
		this.directorService.add(director79);
		Directores director80 = new Directores("Gabriela", "David", 0);
		this.directorService.add(director80);
		Directores director81 = new Directores("Alejandro", "Doria", 0);
		this.directorService.add(director81);
		Directores director82 = new Directores("Ariel", "Rotter", 0);
		this.directorService.add(director82);
		Directores director83 = new Directores("Santiago", "Mitre", 0);
		this.directorService.add(director83);
		Directores director84 = new Directores("Lucrecia", "Martel", 0);
		this.directorService.add(director84);
		Directores director85 = new Directores("Jos�", "Campusano", 0);
		this.directorService.add(director85);
		Directores director86 = new Directores("Juan", "Taratuto", 0);
		this.directorService.add(director86);
		Directores director87 = new Directores("Marco", "Berger", 0);
		this.directorService.add(director87);
		Directores director88 = new Directores("Andrea", "M�rquez", 0);
		this.directorService.add(director88);

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

		Peliculas pelicula0 = new Peliculas("El secreto de sus ojos",2009,"",126,"Argentina. Benjam�n Esp�sito es oficial de un Juzgado de Instrucci�n de Buenos Aires reci�n retirado. Obsesionado por un brutal asesinato ocurrido veinticinco a�os antes, en 1974, decide escribir una novela sobre el caso, del cual fue testigo y protagonista. Reviviendo el pasado, viene tambi�n a su memoria el recuerdo de una mujer, a quien ha amado en silencio durante todos esos a�os.",0,"imgs/peliculas/0.jpg","GcHkTSqeGoU",actorespelicula,director0,null,usuario,genero0, true);

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

		Peliculas pelicula1 = new Peliculas("Nueve reinas",2000,"",114,"Buenos Aires. Juan y Marcos son dos estafadores de poca monta, uno joven y un veterano en el arte del timo, que casualmente se ven envueltos en un asunto que les puede hacer millonarios: tienen menos de un d�a para hacer una estafa que no puede fallar.",0,"imgs/peliculas/1.jpg","KWUs-smqOeQ",actorespelicula,director1,null,usuario,genero0, true);

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

		Peliculas pelicula2 = new Peliculas("El hijo de la novia",2001,"",124,"Rafael dedica 24 horas al d�a a su restaurante, est� divorciado, ve muy poco a su hija, no tiene amigos y elude comprometerse con su novia. Adem�s, desde hace mucho tiempo no visita a su madre, internada en un geri�trico porque sufre el mal de Alzheimer. Una serie de acontecimientos inesperados le obligan a replantearse su vida. Entre ellos, la intenci�n que tiene su padre de cumplir el viejo sue�o de su madre: casarse por la Iglesia.",0,"imgs/peliculas/2.jpg","",actorespelicula,director2,null,usuario,genero1, true);

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

		Peliculas pelicula3 = new Peliculas("Relatos salvajes",2014,"",119,"La pel�cula consta de seis episodios que alternan la intriga, la comedia y la violencia. Sus personajes se ver�n empujados hacia el abismo y hacia el innegable placer de perder el control, cruzando la delgada l�nea que separa la civilizaci�n de la barbarie.",0,"imgs/peliculas/3.jpg","kmHHPcT2zl8",actorespelicula,director3,null,usuario,genero2, true);

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

		Peliculas pelicula4 = new Peliculas("Lugares comunes",2002,"",108,"Fernando Robles (Federico Luppi) es porte�o, ya ha cumplido los sesenta y es profesor de literatura en la universidad. Ense�a a ense�ar. Lleva toda la vida casado con Liliana Rovira (Mercedes Sampietro), espa�ola, hija de catalanes, que trabaja como asistente social en barrios marginales de Buenos Aires. Se quieren, se respetan, son leales. Nunca se aburren estando juntos, les gusta estar solos. Se conocen profundamente, se aceptan, se pelean sin odio, se divierten. Son amantes, socios, amigos, c�mplices. Ninguno de ellos concibe la vida sin el otro. Tienen un hijo, Pedro (Carlos Santamar�a), casado y con dos hijos, que tiene un buen trabajo en Madrid, donde vive en una urbanizaci�n de clase media acomodada.",0,"imgs/peliculas/4.jpg","fDioVsOSCWo",actorespelicula,director4,null,usuario,genero1, true);

		this.peliculaService.add(pelicula4);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor79);
		actorespelicula.add(actor80);
		actorespelicula.add(actor81);
		actorespelicula.add(actor82);
		actorespelicula.add(actor83);
		actorespelicula.add(actor84);

		Peliculas pelicula5 = new Peliculas("Historias extraordinarias",2008,"",245,"Se trata de los relatos que tienen como figuras centrales a tres forasteros, identificados cada uno con una inicial: H, X y Z, cada uno con una misi�n, que se ir�n revelando de a poco. Cap�tulo tras cap�tulo, Llin�s describe lugares, situaciones, sus actitudes frente a las circunstancias y los hechos de los que son protagonistas o simples testigos, a partir de un relato en off (con las voces de Daniel Hendler, Juan Minujin y Ver�nica Llin�s), escrito con formato literario, de manera que estos cuentos ilustrados no requieran di�logos entre los personajes.",0,"imgs/peliculas/5.jpg","mnp9CsY_Ufc",actorespelicula,director5,null,usuario,genero3, true);

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

		Peliculas pelicula6 = new Peliculas("El ciudadano ilustre",2016,"",118,"Es la historia de un escritor argentino, Premio Nobel de Literatura, que hace cuarenta a�os abandon� su pueblo y parti� hacia Europa, donde triunf� escribiendo sobre su localidad natal y sus personajes. En el pico de su carrera, el alcalde de ese pueblo donde naci� le invita para nombrarle &quot;Ciudadano Ilustre&quot; del mismo, y �l decide cancelar su apretada agenda y aceptar la invitaci�n.",0,"imgs/peliculas/6.jpg","VI2GLPtYCq8",actorespelicula,director6,null,usuario,genero2, true);

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

		Peliculas pelicula7 = new Peliculas("Historias m�nimas",2002,"",94,"A miles de kil�metros al sur de Buenos Aires, tres personajes viajan por las solitarias rutas de la Patagonia. Don Justo, un anciano de ochenta a�os, que es el due�o de un bar de carretera que regenta su hijo, se ha escapado de casa para buscar a su perro desaparecido desde hace tiempo: alguien le ha dicho que lo ha visto en San Juli�n. A medida que se acerca a esta poblaci�n, ciertos datos hacen sospechar que las intenciones del anciano van m�s all� de encontrar al animal: debe resolver ciertos asuntos vitales para poder afrontar la muerte en paz consigo mismo.",0,"imgs/peliculas/7.jpg","DByCQgPmSRQ",actorespelicula,director7,null,usuario,genero2, true);

		this.peliculaService.add(pelicula7);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor105);
		actorespelicula.add(actor106);
		actorespelicula.add(actor107);
		actorespelicula.add(actor108);
		actorespelicula.add(actor109);
		actorespelicula.add(actor110);

		Peliculas pelicula8 = new Peliculas("The Motorcycle Diaries (Diarios de motocicleta)",2004,"",128,"En 1952, siendo el &quot;Che&quot; Guevara (Gael Garc�a Bernal) estudiante de medicina, recorri� Am�rica del Sur, con su amigo Alberto Granado (Rodrigo de la Serna), en una destartalada moto. Ernesto es un joven estudiante de medicina de 23 a�os de edad, especializado en lepra. Alberto es un bioqu�mico de 29 a�os. Ambos j�venes emprenden un viaje de descubrimiento de la rica y compleja topograf�a humana y social del continente hispanoamericano. Los dos dejaron atr�s el familiar entorno de Buenos Aires en una desvencijada motocicleta Norton de 500 cc, imbuidos de un rom�ntico esp�ritu aventurero.",0,"imgs/peliculas/8.jpg","Ygn1lNk_oTg",actorespelicula,director8,null,usuario,genero4, true);

		this.peliculaService.add(pelicula8);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor111);
		actorespelicula.add(actor112);
		actorespelicula.add(actor113);

		Peliculas pelicula9 = new Peliculas("Medianeras",2004,"",28,"Buenos Aires es el escenario de esta historia. Mariana y Mart�n viven historias parecidas, viven soledades parecidas, viven neurosis parecidas, incluso viven en la misma calle, pero no pueden conocerse. Lo mismo que los une es lo que los separa: medianeras.",0,"imgs/peliculas/9.jpg","kDj9yoBJ0k8",actorespelicula,director9,null,usuario,genero1, true);

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

		Peliculas pelicula10 = new Peliculas("Gilda, no me arrepiento de este amor",2016,"",116,"Esposa, madre y maestra jardinera de Devoto, con 30 a�os, Myriam Alejandra Bianchi decide cambiar el rumbo de su vida para siempre. Con su dulce voz, Gilda marc� la m�sica tropical y se convirti� en un suceso de popularidad. Cuatro a�os m�s tarde, muri� tr�gicamente en una ruta camino a la provincia de Entre R�os. Su m�sica influenci� a artistas de todos los estilos y diferentes generaciones y su figura trascendi� fronteras.",0,"imgs/peliculas/10.jpg","5lHR8uqQE2Y",actorespelicula,director10,null,usuario,genero1, true);

		this.peliculaService.add(pelicula10);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor121);
		actorespelicula.add(actor122);
		actorespelicula.add(actor123);
		actorespelicula.add(actor124);
		actorespelicula.add(actor125);
		actorespelicula.add(actor126);

		Peliculas pelicula11 = new Peliculas("Valent�n",2003,"",79,"1969, Buenos Aires. Valent�n es un ni�o de ocho a�os que vive con su abuela. Su madre desapareci� cuando �l ten�a tres a�os, y su padre es un bala perdida incapaz de asumir responsabilidad alguna. Valent�n es un ni�o solitario que busca constantemente el amor y el afecto. Su vida transcurre tranquilamente y s�lo tiene dos obsesiones: ser astronauta y que su padre lo lleve junto a su madre. Pero su padre no quiere remover el pasado y, adem�s, no deja de decepcionarle present�ndole novias horribles, hasta que un d�a le presenta a Leticia, de la que Valent�n se queda inmediatamente prendado.",0,"imgs/peliculas/11.jpg","U6GNaDYRomo",actorespelicula,director11,null,usuario,genero2, true);

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

		Peliculas pelicula12 = new Peliculas("Tiempo de valientes",2005,"",110,"Mariano es un psicoanalista que, a ra�z de un accidente de tr�fico, es condenado a realizar trabajos comunitarios relacionados con su profesi�n. La tarea que el juez le asigna es la de atender a Alfredo, un inspector de la Polic�a Federal an�micamente devastado por la infidelidad de su mujer. Mariano tendr� que improvisar sus sesiones de psicoan�lisis mientras acompa�a a Alfredo en sus investigaciones. Casi sin darse cuenta, se ir� sumergiendo en el universo policial hasta el punto de convertirse en una especie de ayudante extraoficial de Alfredo. Juntos tendr�n que enfrentarse a inimaginables e inesperados peligros para los que no parecen estar preparados.",0,"imgs/peliculas/12.jpg","tEIAEJxuu-w",actorespelicula,director12,null,usuario,genero0, true);

		this.peliculaService.add(pelicula12);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor135);

		Peliculas pelicula13 = new Peliculas("El empleo (The Employment) (S)",2008,"",6,"Un hombre realiza su trayecto habitual hacia el trabajo, inmerso en un sistema en el cual el uso de las personas como objetos es algo cotidiano.",0,"imgs/peliculas/13.jpg","cxUuU1jwMgM",actorespelicula,director13,null,usuario,genero5, true);

		this.peliculaService.add(pelicula13);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor136);
		actorespelicula.add(actor137);
		actorespelicula.add(actor138);
		actorespelicula.add(actor139);
		actorespelicula.add(actor140);
		actorespelicula.add(actor141);
		actorespelicula.add(actor142);
		actorespelicula.add(actor143);
		actorespelicula.add(actor93);
		actorespelicula.add(actor144);
		actorespelicula.add(actor145);
		actorespelicula.add(actor146);
		actorespelicula.add(actor124);
		actorespelicula.add(actor147);
		actorespelicula.add(actor148);
		actorespelicula.add(actor149);
		actorespelicula.add(actor150);

		Peliculas pelicula14 = new Peliculas("Roma",2004,"",148,"La irrupci�n del periodista Manuel Cueto en la vida del escritor Joaqu�n G��ez, a instancias de la editorial para la que Joaqu�n est� escribiendo su �ltimo libro, provocar� un gran desasosiego en la solitaria vida de este hombre que vive de espaldas al mundo y rehuye sus propios recuerdos. Acostumbrado a la soledad, el encuentro con el joven periodista despertar� en �l emociones olvidadas que lo transportan a  la �poca de su ni�ez y a su locos a�os de juventud en Buenos Aires: los errores de la inexperiencia, el recuerdo de los amigos, de la lealtad, la influencia del cine y del jazz, el sabor del primer amor, y la �ntima relaci�n con sus padres, especialmente con su madre, Roma, una mujer inteligente, fuerte, comprensiva y comprometida con los ideales de juventud de su hijo.",0,"imgs/peliculas/14.jpg","aN9eVNpIDcY",actorespelicula,director14,null,usuario,genero1, true);

		this.peliculaService.add(pelicula14);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor72);
		actorespelicula.add(actor151);
		actorespelicula.add(actor152);
		actorespelicula.add(actor153);
		actorespelicula.add(actor154);
		actorespelicula.add(actor33);
		actorespelicula.add(actor155);

		Peliculas pelicula15 = new Peliculas("El viento",2005,"",100,"El dolor, la culpa y la b�squeda de la felicidad son los ejes de la historia de Frank (Federico Luppi), un campesino de la Patagonia que nunca sali� de su pueblo. La muerte de su hija lo llevar� hasta Buenos Aires para reencontrarse con su nieta Alina (Antonella Costa).",0,"imgs/peliculas/15.jpg","",actorespelicula,director15,null,usuario,genero1, true);

		this.peliculaService.add(pelicula15);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor156);
		actorespelicula.add(actor157);
		actorespelicula.add(actor158);
		actorespelicula.add(actor159);
		actorespelicula.add(actor160);
		actorespelicula.add(actor72);
		actorespelicula.add(actor161);
		actorespelicula.add(actor162);
		actorespelicula.add(actor163);
		actorespelicula.add(actor164);
		actorespelicula.add(actor165);
		actorespelicula.add(actor166);

		Peliculas pelicula16 = new Peliculas("Elsa & Fred",2005,"",106,"Elsa (China Zorrilla), que tiene 82 a�os, es una mujer llena de vitalidad y con una imaginaci�n desbordante. Alfredo (Manuel Alexandre), algo m�s joven que ella, ha sido siempre un hombre convencional, serio y responsable. Al quedar viudo, desconcertado y angustiado por la ausencia de su mujer, su hija lo anima a mudarse a un apartamento m�s peque�o. Es entonces cuando conoce a Elsa, que es vecina suya. A partir de ese momento, ella irrumpe en su vida como un torbellino dispuesta a demostrarle que el tiempo que le queda es precioso y debe disfrutarlo como le plazca.",0,"imgs/peliculas/16.jpg","9V7tAJgQzbs",actorespelicula,director16,null,usuario,genero6, true);

		this.peliculaService.add(pelicula16);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor106);
		actorespelicula.add(actor167);
		actorespelicula.add(actor168);
		actorespelicula.add(actor169);
		actorespelicula.add(actor115);
		actorespelicula.add(actor170);
		actorespelicula.add(actor171);
		actorespelicula.add(actor116);
		actorespelicula.add(actor172);
		actorespelicula.add(actor173);
		actorespelicula.add(actor174);
		actorespelicula.add(actor175);
		actorespelicula.add(actor176);
		actorespelicula.add(actor177);

		Peliculas pelicula17 = new Peliculas("Cr�nica de una fuga",2006,"",103,"En 1977, durante el horror de la �ltima dictadura militar argentina, un grupo de tareas secuestra a Claudio Tamburrini, arquero de un equipo de f�tbol de la &quot;B&quot;, y lo traslada al centro Mansi�n Ser�: una vieja y aristocr�tica casona ubicada en el barrio de Mor�n, en Buenos Aires. All�, Claudio conoce a Guillermo, el Vasco y el Gallego. Durante cuatro meses de cautiverio en ese lugar que se asemeja a un manicomio carente de reglas, los j�venes son torturados sistem�ticamente. Muchos perdieron la vida, pero hubo quienes lograron sobrevivir...",0,"imgs/peliculas/17.jpg","MRKjxiKGuKk",actorespelicula,director17,null,usuario,genero0, true);

		this.peliculaService.add(pelicula17);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor178);
		actorespelicula.add(actor66);
		actorespelicula.add(actor179);
		actorespelicula.add(actor99);
		actorespelicula.add(actor180);
		actorespelicula.add(actor181);

		Peliculas pelicula18 = new Peliculas("El perro",2004,"",95,"Coco ha trabajado toda su vida en una estaci�n de servicio, pero cuando �sta se vende, se queda sin trabajo. Desocupado y sin muchas expectativas, sobrevive intentando vender cuchillos artesanales que �l mismo fabrica. Un excelente perro dogo de pura raza acabar� convirti�ndose no s�lo en su amigo, sino en la �nica esperanza de una vida mejor...",0,"imgs/peliculas/18.jpg","",actorespelicula,director18,null,usuario,genero1, true);

		this.peliculaService.add(pelicula18);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor156);
		actorespelicula.add(actor42);
		actorespelicula.add(actor182);
		actorespelicula.add(actor183);
		actorespelicula.add(actor184);
		actorespelicula.add(actor185);
		actorespelicula.add(actor186);

		Peliculas pelicula19 = new Peliculas("Conversaciones con mam�",2004,"",86,"Mam� tiene ochenta y dos a�os y su hijo Jaime, cincuenta. Ambos viven en mundos muy diferentes. Jaime tiene mujer, dos hijos, una hermosa casa, dos coches y una suegra que atender. Mam� se las arregla sola y sobrelleva su vejez con dignidad. Pero un d�a ocurre lo inesperado; la empresa para la que trabaja Jaime lo deja en la calle por razones de reajuste de personal. La lamentable situaci�n lo lleva a decisiones dr�sticas porque no puede mantener su tren de vida.",0,"imgs/peliculas/19.jpg","fyuxYGiRwLE",actorespelicula,director19,null,usuario,genero1, true);

		this.peliculaService.add(pelicula19);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor40);
		actorespelicula.add(actor128);
		actorespelicula.add(actor187);
		actorespelicula.add(actor188);
		actorespelicula.add(actor189);
		actorespelicula.add(actor190);
		actorespelicula.add(actor58);

		Peliculas pelicula20 = new Peliculas("Anita",2009,"",104,"Cuenta la historia de Anita, una joven con S�ndrome de Down que, el d�a del atentado a la AMIA, el 18 de julio de 1994, aturdida por la gran explosi�n, se pierde en la gran ciudad. Anita es una mujer-ni�a. Tiene casi 35 a�os y vive con su madre Dora en pleno barrio del Once. Dora es su conexi�n con el mundo. Anita vive ligada a Dora, y Dora a su hija. Cuando el 18 de julio se produce el atentado a la mutual AMIA, su vida cambia para siempre. Anita no entiende qu� ha pasado, s�lo recuerda que su madre sali� a hacer un tramite y, de pronto, la tierra empez� a temblar. Asustada por el ruido, decide salir de su casa y se pierde en la gran ciudad para comenzar una larga odisea. (FILMAFFINTIY)",0,"imgs/peliculas/20.jpg","aG-ZVuOGxWk",actorespelicula,director20,null,usuario,genero1, true);

		this.peliculaService.add(pelicula20);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor191);
		actorespelicula.add(actor1);
		actorespelicula.add(actor192);
		actorespelicula.add(actor193);
		actorespelicula.add(actor194);
		actorespelicula.add(actor195);
		actorespelicula.add(actor119);
		actorespelicula.add(actor196);
		actorespelicula.add(actor197);

		Peliculas pelicula21 = new Peliculas("Un oso rojo",2002,"",94,"Aunque solo Oso lleva la cuenta, han pasado siete a�os desde que cay� preso por homicidio y robo a mano armada. Es un hombre parco, impredecible, violento por naturaleza o por necesidad, y es probable que en todos estos a�os no le haya dicho a nadie lo que oculta en sus silencios y la tristeza de su mirada. Ahora, mientras sale a la calle en libertad condicional, Oso piensa que tal vez pueda volver a empezar. El Turco le debe todav�a su parte del asalto, y a trav�s de un compa�ero de celda contacta con G�emes, que lo emplea como chofer en su agencia de taxis. Oso ha perdido a su mujer, que vive ahora con Sergio, y su hija apenas lo recuerda, pero �l est� dispuesto a recuperarlas o al menos a reparar los da�os.",0,"imgs/peliculas/21.jpg","NX4Yx-ZwrPk",actorespelicula,director21,null,usuario,genero1, true);

		this.peliculaService.add(pelicula21);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor11);
		actorespelicula.add(actor152);
		actorespelicula.add(actor135);
		actorespelicula.add(actor198);
		actorespelicula.add(actor199);
		actorespelicula.add(actor200);
		actorespelicula.add(actor201);

		Peliculas pelicula22 = new Peliculas("Felicidades",2000,"",100,"Es Nochebuena en Argentina. Un escritor famoso que no es feliz y que decide viajar al encuentro de su amada; un m�dico que quiere ligar con una espa�ola, y un odont�logo loco por encontrar el juguete que su hijo quiere de regalo. Una �cida visi�n sobre la otra cara de la navidad, donde la clase media insiste en sostener una celebraci�n que ya ha perdido su naturaleza. Todos la festejan, pero se centra en los que quedan fuera: los protagonistas, que transitan en un mundo al rev�s, un mundo en el que ir�nicamente los justicieros se vuelven delincuentes y los nobles, miserables.",0,"imgs/peliculas/22.jpg","",actorespelicula,director22,null,usuario,genero1, true);

		this.peliculaService.add(pelicula22);

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

		Peliculas pelicula23 = new Peliculas("Kamchatka",2002,"",104,"Los dif�ciles a�os de la dictadura militar argentina son contemplados por Harry, un ni�o de diez a�os que lo �nico que desea es jugar y hacer travesuras con su hermano peque�o. Sin embargo, en 1976, cuando su familia, perseguida por la dictadura, se ve obligada a esconderse en el campo, comienza para �l una nueva vida que pondr� fin a su infancia.",0,"imgs/peliculas/23.jpg","JkAWI_fS7Pc",actorespelicula,director23,null,usuario,genero1, true);

		this.peliculaService.add(pelicula23);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor196);
		actorespelicula.add(actor217);
		actorespelicula.add(actor218);
		actorespelicula.add(actor194);
		actorespelicula.add(actor219);
		actorespelicula.add(actor220);
		actorespelicula.add(actor221);

		Peliculas pelicula24 = new Peliculas("Bolivia",2001,"",82,"Freddy emigra a Buenos Aires en busca de una vida m�s pr�spera. En su pa�s natal, Bolivia, deja a su familia. Sin embargo, la capital argentina no es el para�so que Freddy so��, y mucho menos para los emigrantes ilegales como �l. Pese a ello, consigue trabajo como cocinero en un restaurante. Un aclamado filme de bajo presupuesto premiado en varios festivales.",0,"imgs/peliculas/24.jpg","V31tISIoLsg",actorespelicula,director24,null,usuario,genero1, true);

		this.peliculaService.add(pelicula24);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor222);
		actorespelicula.add(actor223);

		Peliculas pelicula25 = new Peliculas("No me ama (S)",2009,"",16,"Una pareja que est� a punto de cumplir tres a�os de noviazgo viaja recorriendo la costa uruguaya. Durante el viaje, s�lo escuchamos un mon�logo interno de �l que, en su neurosis, comienza a creer que ella no le ama.",0,"imgs/peliculas/25.jpg","",actorespelicula,director25,null,usuario,genero2, true);

		this.peliculaService.add(pelicula25);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor224);
		actorespelicula.add(actor225);
		actorespelicula.add(actor226);
		actorespelicula.add(actor227);
		actorespelicula.add(actor228);
		actorespelicula.add(actor229);
		actorespelicula.add(actor230);
		actorespelicula.add(actor231);
		actorespelicula.add(actor232);
		actorespelicula.add(actor233);

		Peliculas pelicula26 = new Peliculas("Leonera",2008,"",113,"Julia (Martina Gusman) es una joven acusada del asesinato de su novio. Aunque las circunstancias del crimen no est�n claras, acaba ingresando en prisi�n. Abatida y embarazada deber� adaptarse a su nueva vida en la c�rcel, donde nacer� su hijo Tom�s...",0,"imgs/peliculas/26.jpg","GxyVs7P1WZY",actorespelicula,director26,null,usuario,genero1, true);

		this.peliculaService.add(pelicula26);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor234);
		actorespelicula.add(actor235);
		actorespelicula.add(actor236);
		actorespelicula.add(actor237);
		actorespelicula.add(actor238);
		actorespelicula.add(actor184);

		Peliculas pelicula27 = new Peliculas("Aniceto",2008,"",82,"Aniceto (Hern�n Piqu�n) es un hombre solitario que vive con su gallo en un pueblito de Mendoza. Francisca (Natalia Pelayo) es una chica ingenua que llega al lugar en busca de trabajo. Se conocen y se enamoran. Parece un sue�o, pero termina en pesadilla cuando aparece la enigm�tica e irresistible Luc�a (Alejandra Baldoni), su nueva vecina, que perturba al hombre y lo arrastra a su propia destrucci�n.",0,"imgs/peliculas/27.jpg","PKhaw_tMBHo",actorespelicula,director27,null,usuario,genero1, true);

		this.peliculaService.add(pelicula27);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor239);
		actorespelicula.add(actor240);
		actorespelicula.add(actor241);
		actorespelicula.add(actor22);
		actorespelicula.add(actor242);
		actorespelicula.add(actor243);
		actorespelicula.add(actor244);
		actorespelicula.add(actor245);
		actorespelicula.add(actor246);
		actorespelicula.add(actor247);
		actorespelicula.add(actor248);

		Peliculas pelicula28 = new Peliculas("Buena vida (Delivery)",2004,"",94,"Hern�n tiene 24 a�os y un precario trabajo de mensajero. Desde que su familia emigr� a Espa�a huyendo de la crisis por la que atraviesa Argentina, vive solo en su casa familiar, ahora vac�a y llena de recuerdos. Est� enamorado de Patricia (Pato), una empleada de una estaci�n de servicio que est� buscando hospedaje. Hern�n se ofrece a alquilarle una habitaci�n de su propia casa. Al poco tiempo de convivencia comienza una relaci�n amorosa aparentemente id�lica. Pero, sorpresivamente, la familia de Pato llega desde una ciudad del interior y se alojan por una noche.",0,"imgs/peliculas/28.jpg","",actorespelicula,director28,null,usuario,genero1, true);

		this.peliculaService.add(pelicula28);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor135);

		Peliculas pelicula29 = new Peliculas("Tecl�polis (S)",2010,"",12,"Hab�a una vez... revistas que se agitan al viento, una c�mara de Super 8 que se arrastra sobre una mesa mientras una vieja frazada va y viene. De repente, un rat�n. Luego, una civilizaci�n corriendo hacia su destino inevitable. La contaminaci�n pl�stica ha llegado a tal punto que ni las m�s lejanas playas est�n a salvo.",0,"imgs/peliculas/29.jpg","egu-k1GlOy0",actorespelicula,director29,null,usuario,genero5, true);

		this.peliculaService.add(pelicula29);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor40);
		actorespelicula.add(actor249);
		actorespelicula.add(actor145);
		actorespelicula.add(actor250);
		actorespelicula.add(actor18);
		actorespelicula.add(actor251);
		actorespelicula.add(actor252);
		actorespelicula.add(actor253);
		actorespelicula.add(actor254);

		Peliculas pelicula30 = new Peliculas("Cama adentro (Se�ora Beba)",2004,"",87,"Beba supo ser una dama de clase acomodada. Fue due�a de su propia casa de cosm�ticos, pero hoy se ve forzada a trabajar como vendedora puerta a puerta de productos de belleza. Sus gruesos pendientes de oro y su criada, Dora, son los �ltimos bastiones de un estatus que no se resigna a perder. Dora lleg� a los 17 a�os desde la provincia del Chaco para trabajar `cama adentro` en la casa de la se�ora Beba. Desde entonces, con el dinero de su sueldo ha ido construyendo una casita en la periferia de Buenos Aires. Sin embargo, Dora no puede terminar su casa porque Beba le adeuda seis meses de sueldo. Cansada de escuchar las falsas promesas de pago de su patrona y dispuesta a enfrentar el desaf�o de vivir su propia vida, Dora decide irse...",0,"imgs/peliculas/30.jpg","",actorespelicula,director30,null,usuario,genero1, true);

		this.peliculaService.add(pelicula30);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor255);
		actorespelicula.add(actor256);
		actorespelicula.add(actor257);
		actorespelicula.add(actor258);
		actorespelicula.add(actor259);
		actorespelicula.add(actor260);

		Peliculas pelicula31 = new Peliculas("El artista",2008,"",91,"Jorge (Sergio P�ngaro) es un enfermero que pasa de cuidar ancianos en un geri�trico a convertirse en el nuevo ni�o mimado de la escena art�stica bonaerense. Tras presentar como propias unas pinturas de uno de los ancianos, su vida simple y mon�tona se transforma de repente en un constante peregrinar por galer�as de arte, universidades, programas de televisi�n, y reuniones con artistas e intelectuales.",0,"imgs/peliculas/31.jpg","OPnrG9veqpo",actorespelicula,director31,null,usuario,genero2, true);

		this.peliculaService.add(pelicula31);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor135);

		Peliculas pelicula32 = new Peliculas("Muto (S)",2008,"",7,"Cortometraje de animaci�n experimental pintada sobre paredes p�blicas, realizado en Buenos Aires y Baden. Se trata de uno de los trabajos m�s reconocidos del artista gr�fico Blu, que en 2010 recorri� numerosos festivales con su aclamado &quot;Big Bang Big Boom&quot;.",0,"imgs/peliculas/32.jpg","uuGaqLT-gO4",actorespelicula,director32,null,usuario,genero5, true);

		this.peliculaService.add(pelicula32);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor106);
		actorespelicula.add(actor261);
		actorespelicula.add(actor262);
		actorespelicula.add(actor263);
		actorespelicula.add(actor264);

		Peliculas pelicula33 = new Peliculas("Camino a La Paz",2015,"",92,"Sebasti�n (Rodrigo de la Serna) es un joven reci�n casado, fan�tico de Vox Dei. El protagonista, motivado por una necesidad econ�mica, comienza a trabajar de remisero con su Peugeot 505. En este trabajo conoce a Khalil (Ernesto Suarez), un anciano poco gentil. Juntos emprender�n un largo viaje desde Buenos Aires hasta La Paz (Bolivia), donde se pondr� a prueba la relaci�n de los dos protagonistas. El camino y la mala salud de Khalil les plantear�n un viaje plagado de contratiempos.",0,"imgs/peliculas/33.jpg","rGI1fFi8BHM",actorespelicula,director33,null,usuario,genero1, true);

		this.peliculaService.add(pelicula33);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor135);
		actorespelicula.add(actor265);
		actorespelicula.add(actor266);
		actorespelicula.add(actor267);
		actorespelicula.add(actor268);
		actorespelicula.add(actor269);
		actorespelicula.add(actor90);

		Peliculas pelicula34 = new Peliculas("Uncanny Valley (S)",2015,"",8,"Con un tono que comienza como un documental, Heller narra un futuro dist�pico en el que las personas con menos recursos son adictas a conectarse a videojuegos online mediante un sofisticado sistema de realidad virtual que se implanta en la nariz.",0,"imgs/peliculas/34.jpg","",actorespelicula,director34,null,usuario,genero5, true);

		this.peliculaService.add(pelicula34);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor270);
		actorespelicula.add(actor108);
		actorespelicula.add(actor271);
		actorespelicula.add(actor272);
		actorespelicula.add(actor273);
		actorespelicula.add(actor274);
		actorespelicula.add(actor275);

		Peliculas pelicula35 = new Peliculas("La ci�naga",2001,"",102,"Dos familias -una de clase media urbana y otra de productores rurales en decadencia- se entrecruzan en el sopor provinciano de una Salta ca�tica e inmutable, donde nada sucede pero todo est� a punto de estallar.",0,"imgs/peliculas/35.jpg","q9j1y6suhgY",actorespelicula,director35,null,usuario,genero1, true);

		this.peliculaService.add(pelicula35);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor0);
		actorespelicula.add(actor42);
		actorespelicula.add(actor108);
		actorespelicula.add(actor276);
		actorespelicula.add(actor277);
		actorespelicula.add(actor278);
		actorespelicula.add(actor279);
		actorespelicula.add(actor46);

		Peliculas pelicula36 = new Peliculas("Luna de Avellaneda",2004,"",140,"Luna de Avellaneda, un club de barrio que vivi� en el pasado una �poca de esplendor, est� atravesando una crisis que pone en peligro su existencia. Al parecer, la �nica salida posible es que se convierta en un Casino, pero esto se aparta de los ideales y de los fines para los que fue fundado en los a�os 40: un club social, deportivo y cultural. Los descendientes de los fundadores se debatir�n entre la posibilidad de salvarse a cualquier precio o conservar el esp�ritu original del club.",0,"imgs/peliculas/36.jpg","B2ZnKwQA33U",actorespelicula,director36,null,usuario,genero1, true);

		this.peliculaService.add(pelicula36);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor16);
		actorespelicula.add(actor280);
		actorespelicula.add(actor202);
		actorespelicula.add(actor168);
		actorespelicula.add(actor281);
		actorespelicula.add(actor135);
		actorespelicula.add(actor282);
		actorespelicula.add(actor283);
		actorespelicula.add(actor93);
		actorespelicula.add(actor152);

		Peliculas pelicula37 = new Peliculas("Historia de un clan (TV Series)",2015,"",495,"La historia de Puccio. Historia de un clan se basa en los hechos reales de �el clan� Puccio, una familia tradicional de San Isidro que a comienzos de los �80 se dedic� al secuestro y asesinato de empresarios allegados. Durante los 13 cap�tulos de la miniserie se podr� conocer m�s sobre la psicolog�a de cada uno de los miembros de la familia liderada por su padre, Arqu�medes. Los Puccio escond�an a sus v�ctimas, ped�an rescates millonarios, los cobraban y despu�s las mataban porque eran empresarios de su c�rculo y amigos de sus hijos. Los Puccio secuestraron, de a uno, a cuatro empresarios y mataron a tres. La cuarta v�ctima se salv� porque entr� la polic�a. Pap� Arqu�medes cay� cuando estaba a punto de cobrar el rescate. La Justicia lo conden� a reclusi�n perpetua.",0,"imgs/peliculas/37.jpg","MYiE7YiI_ck",actorespelicula,director37,null,usuario,genero1, true);

		this.peliculaService.add(pelicula37);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor177);
		actorespelicula.add(actor284);
		actorespelicula.add(actor285);
		actorespelicula.add(actor286);

		Peliculas pelicula38 = new Peliculas("El cielito",2003,"",93,"F�lix, un joven vagabundo de 20 a�os, llega a un pueblecito perdido del interior de Argentina. En la estaci�n, se encuentra por casualidad con Roberto, un desocupado devenido en alba�il, que le ofrece a F�lix un trabajito en la chacra donde vive con su mujer, Mercedes, y su hijo Chango de apenas un a�o. Es ah�, en ese contexto de soledad, bajo el sol abrasador de La Pampa, donde F�lix descubre poco a poco la tensi�n cotidiana, violenta y muda, en la cual ellos sobreviven. Al mismo tiempo en que la pareja se destruye, una verdadera historia de amor surge entre el peque�o Chango y F�lix. Este ser marginal y solitario encuentra finalmente un sentido a su vida: salvar al ni�o del caos...",0,"imgs/peliculas/38.jpg","NAypf4cLk4k",actorespelicula,director38,null,usuario,genero1, true);

		this.peliculaService.add(pelicula38);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor49);
		actorespelicula.add(actor287);
		actorespelicula.add(actor167);
		actorespelicula.add(actor72);
		actorespelicula.add(actor3);
		actorespelicula.add(actor66);
		actorespelicula.add(actor288);
		actorespelicula.add(actor289);
		actorespelicula.add(actor290);
		actorespelicula.add(actor291);
		actorespelicula.add(actor292);
		actorespelicula.add(actor293);
		actorespelicula.add(actor294);

		Peliculas pelicula39 = new Peliculas("Al final del t�nel",2016,"",120,"Joaqu�n est� en silla de ruedas. Su casa, que conoci� tiempos mejores, ahora es l�gubre y oscura. Berta, bailarina de striptease, y su hija Betty, llaman a su puerta respondiendo a un anuncio que puso Joaqu�n para alquilar una habitaci�n. Su presencia alegra la casa y anima la vida de Joaqu�n. Una noche, mientras trabaja en su s�tano, Joaqu�n escucha un ruido casi imperceptible. Se da cuenta entonces que una banda de delincuentes est� construyendo un t�nel que pasa bajo su casa con la intenci�n de robar un banco cercano.",0,"imgs/peliculas/39.jpg","eO0vwfzwuEI",actorespelicula,director39,null,usuario,genero0, true);

		this.peliculaService.add(pelicula39);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor53);
		actorespelicula.add(actor295);
		actorespelicula.add(actor131);
		actorespelicula.add(actor221);
		actorespelicula.add(actor296);

		Peliculas pelicula40 = new Peliculas("Herencia",2002,"",94,"Dos extranjeros se encuentran en un restaurante en Buenos Aires. Olinda es una inmigrante italiana que lleg� a Argentina despu�s de la Segunda Guerra Mundial buscando un amor que nunca encontr�. Con el tiempo compr� un restaurante. Peter es un joven de solo 24 a�os que viaja buscando un amor perdido en su adolescencia. Ambos se conocen en el restaurante y, poco a poco, este m�gico encuentro ser� para Peter una gu�a que le ayudar� a encontrarse a s� mismo y, a la vez, devolver� a Olinda la posibilidad olvidada de elegir en la vida.",0,"imgs/peliculas/40.jpg","6W-EstREjqQ",actorespelicula,director40,null,usuario,genero1, true);

		this.peliculaService.add(pelicula40);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor108);
		actorespelicula.add(actor16);
		actorespelicula.add(actor297);
		actorespelicula.add(actor298);
		actorespelicula.add(actor133);
		actorespelicula.add(actor299);
		actorespelicula.add(actor300);

		Peliculas pelicula41 = new Peliculas("Whisky Romeo Zulu",2004,"",107,"Whisky Romeo Zulu narra la historia previa al accidente del Boeing 737 de LAPA que, el 31 de agosto de 1999, se incendi� tras impactar contra un terrapl�n en pleno centro de Buenos Aires, provocando la muerte de 67 personas. La cat�strofe cambi� la historia de la aviaci�n civil y comercial en Argentina, y la pel�cula relata, desde la �ptica del director -un ex piloto de l�neas a�reas- c�mo en algunos pa�ses la seguridad de los vuelos es incre�blemente precaria.",0,"imgs/peliculas/41.jpg","",actorespelicula,director41,null,usuario,genero1, true);

		this.peliculaService.add(pelicula41);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor301);
		actorespelicula.add(actor302);
		actorespelicula.add(actor303);
		actorespelicula.add(actor304);
		actorespelicula.add(actor305);
		actorespelicula.add(actor58);
		actorespelicula.add(actor306);

		Peliculas pelicula42 = new Peliculas("El patr�n, radiograf�a de un crimen",2014,"",99,"El patr�n, radiografia de un crimen, se enfoca en un hecho criminal real sobre un hombre rural que llega a Buenos Aires en busca de trabajo y termina explotado por un siniestro patr�n que lo obliga a vender carne podrida y que lo somete a una verdadera esclavitud, en el coraz�n de la Ciudad de Buenos Aires y en el siglo XXI.",0,"imgs/peliculas/42.jpg","h2eV-cSMpIU",actorespelicula,director42,null,usuario,genero1, true);

		this.peliculaService.add(pelicula42);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor307);
		actorespelicula.add(actor308);
		actorespelicula.add(actor309);
		actorespelicula.add(actor15);
		actorespelicula.add(actor310);
		actorespelicula.add(actor311);
		actorespelicula.add(actor312);
		actorespelicula.add(actor284);

		Peliculas pelicula43 = new Peliculas("El polaquito",2003,"",92,"Un chico de la calle, de 13 a�os de edad, se gana la vida cantando tangos en los trenes de la estaci�n central de Buenos Aires. Imita a Polaco Goyeneche, el famoso cantante de tangos, por lo que la gente le conoce como &quot;El Polaquito&quot; (Abel Ayala). El Polaquito conoce a &quot;Pelu&quot; (Marina Glezer), una joven prostituta que tambi�n trabaja en la estaci�n de Constituci�n, de la cual queda inmediatamente prendado y a la que intenta rescatar de la mafia que la explota. Este comportamiento de El Polaquito lo enfrenta con &quot;Rengo&quot; (Roly Serrano), l�der de esta mafia que, en connivencia con la polic�a de la estaci�n, comienza a hostigarlo tratando de quitarle esa idea de la cabeza e intentando interrumpir su relaci�n con Pelu.",0,"imgs/peliculas/43.jpg","PEVIHud1gXs",actorespelicula,director43,null,usuario,genero1, true);

		this.peliculaService.add(pelicula43);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor313);
		actorespelicula.add(actor314);
		actorespelicula.add(actor315);
		actorespelicula.add(actor258);
		actorespelicula.add(actor316);
		actorespelicula.add(actor317);
		actorespelicula.add(actor318);
		actorespelicula.add(actor319);
		actorespelicula.add(actor320);
		actorespelicula.add(actor321);

		Peliculas pelicula44 = new Peliculas("El hombre de al lado",2009,"",101,"La pel�cula narra un conflicto entre vecinos que parece no tener fin. Una simple pared medianera puede dividir dos mundos, dos maneras de vestir, de comer, de vivir. De un lado Leonardo (Rafael Spregelburd), fino y prestigioso dise�ador que vive en una casa realizada por Le Corbusier. Del otro lado V�ctor (Daniel Ar�oz), vendedor de coches usados, vulgar, r�stico y avasallador. V�ctor decide hacer una ventana para tener m�s luz, y ah� empieza el problema: cada uno toma conciencia de la existencia del otro.",0,"imgs/peliculas/44.jpg","_haLmb7mdWI",actorespelicula,director44,null,usuario,genero2, true);

		this.peliculaService.add(pelicula44);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor322);
		actorespelicula.add(actor323);
		actorespelicula.add(actor324);
		actorespelicula.add(actor325);
		actorespelicula.add(actor38);
		actorespelicula.add(actor326);

		Peliculas pelicula45 = new Peliculas("76-89-03",2000,"",85,"La pel�cula cuenta la historia de tres amigos y su sue�o en com�n, a lo largo de tres momentos hist�ricos claves de la Argentina. Todo comienza en 1976, con la aparici�n de una sex symbol que despierta los primeros ratones de cada uno de ellos. Contin�a y se desarrolla en 1989, durante la noche de mayor hiperinflaci�n. Ante la decadencia del pa�s, la a�n famos�sima sex symbol es sospechada de prostituci�n, motivo por el cual nuestro protag�nico tr�o se lanza a la caza de la afamada diva. Ah� comienza la accidentada aventura en donde vemos desfilar un verdadero bestiario porte�o... FILMAFFINITY)",0,"imgs/peliculas/45.jpg","",actorespelicula,director45,null,usuario,genero2, true);

		this.peliculaService.add(pelicula45);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor327);
		actorespelicula.add(actor328);
		actorespelicula.add(actor329);
		actorespelicula.add(actor330);
		actorespelicula.add(actor11);
		actorespelicula.add(actor107);
		actorespelicula.add(actor173);
		actorespelicula.add(actor18);
		actorespelicula.add(actor185);
		actorespelicula.add(actor180);
		actorespelicula.add(actor331);

		Peliculas pelicula46 = new Peliculas("Las mantenidas sin sue�os",2005,"",88,"Una madre que no sabe qu� hacer con su hija. Eugenia, su hija, s� sabe qu� har�a siendo madre. Olga, �una vecina o parte de la familia? Celina, �crisis vocacional o vocaci�n de moda? Sara, �abuela o marido? Lola, �se qued� sin nada o nunca tuvo? Aqu� ninguna puede nada sola. Juntas pueden llegar a so�ar aunque sea algo.",0,"imgs/peliculas/46.jpg","",actorespelicula,director46,null,usuario,genero1, true);

		this.peliculaService.add(pelicula46);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor11);
		actorespelicula.add(actor201);
		actorespelicula.add(actor123);
		actorespelicula.add(actor16);
		actorespelicula.add(actor332);
		actorespelicula.add(actor12);
		actorespelicula.add(actor38);
		actorespelicula.add(actor333);

		Peliculas pelicula47 = new Peliculas("La suerte est� echada",2005,"",99,"Comedia que habla de la suerte, del destino y del afecto de dos hermanastros muy diferentes, que han vivido distanciados durante a�os. Es su padre quien los vuelve a unir en una circunstancia muy particular.",0,"imgs/peliculas/47.jpg","PmEk7dG_9MY",actorespelicula,director47,null,usuario,genero2, true);

		this.peliculaService.add(pelicula47);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor334);
		actorespelicula.add(actor335);
		actorespelicula.add(actor336);
		actorespelicula.add(actor337);
		actorespelicula.add(actor338);

		Peliculas pelicula48 = new Peliculas("Peter Capusotto y sus 3 dimensiones (Peter Capusotto y sus tres dimensiones)",2012,"",93,"En una �poca de progreso tecnol�gico y de posibilidades ilimitadas de entretenimiento, Violencia Rivas, una cantante argentina, pionera del punk en los 60, declara que la excesiva diversi�n es nociva y constituye un s�ntoma esencial de la decadencia de la humanidad. Conjunto de historias breves que muestran c�mo la relaci�n de los seres humanos con el cine, la radio, internet, el video home y otras pr�cticas tecnol�gicas deteriora las relaciones personales al convertir el entretenimiento en algo m�s interesante que la vida.",0,"imgs/peliculas/48.jpg","RgmConQ8z20",actorespelicula,director48,null,usuario,genero2, true);

		this.peliculaService.add(pelicula48);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor48);
		actorespelicula.add(actor339);
		actorespelicula.add(actor340);
		actorespelicula.add(actor341);
		actorespelicula.add(actor342);
		actorespelicula.add(actor343);
		actorespelicula.add(actor344);
		actorespelicula.add(actor345);
		actorespelicula.add(actor346);
		actorespelicula.add(actor140);

		Peliculas pelicula49 = new Peliculas("El juego de Arcibel",2003,"",115,"En la Rep�blica de Miranda, imaginario pa�s de Hispanoam�rica que vive bajo la dictadura del General Abalorio, Arcibel Alegr�a, un periodista que escribe sobre ajedrez, es encarcelado por culpa de una confusi�n en la programaci�n del diario en el que trabaja. �l, un hombre solitario y apol�tico, empieza a conocer en la c�rcel una realidad que le era completamente ajena.",0,"imgs/peliculas/49.jpg","aZVMR2g8wUE",actorespelicula,director49,null,usuario,genero1, true);

		this.peliculaService.add(pelicula49);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor4);
		actorespelicula.add(actor347);
		actorespelicula.add(actor348);
		actorespelicula.add(actor349);
		actorespelicula.add(actor350);
		actorespelicula.add(actor351);
		actorespelicula.add(actor352);
		actorespelicula.add(actor353);

		Peliculas pelicula50 = new Peliculas("El clan",2015,"",110,"La historia se basa en el caso policial del Clan Puccio, que conmocion� a la sociedad argentina a principios de los 80. Tras la aparente normalidad de la familia Puccio se oculta un siniestro clan dedicado al secuestro y al asesinato. Arqu�medes, el patriarca, miembro del Servicio de Inteligencia desde la dictadura, lidera y planifica las operaciones. Alejandro, el hijo mayor, estrella de un club de rugby, se sirve de su popularidad para no levantar sospechas. Los dem�s miembros de la familia son c�mplices en mayor o menor grado de los cr�menes del clan, y viven de los beneficios obtenidos de los  rescates que pagan los familiares de los secuestrados.",0,"imgs/peliculas/50.jpg","Db2GV9cSocQ",actorespelicula,director50,null,usuario,genero0, true);

		this.peliculaService.add(pelicula50);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor135);

		Peliculas pelicula51 = new Peliculas("Viaje a Marte (S)",2005,"",15,"Antonio es un ni�o que quiere viajar a Marte y afortunadamente su abuelo conoce el camino para llegar. &quot;Viaje a Marte&quot; es una pel�cula de animaci�n de mu�ecos que aborda la fantas�a en la infancia desde la distancia de la adultez. Dirigido y animado por Juan Pablo Zaramella, el corto est� basado en una vivencia de la infancia del guionista Mario Rulloni, que sirvi� como base para el desarrollo de esta historia que tard� dos a�os en ser completada, realizada de forma totalmente independiente. &quot;Viaje a Marte&quot; ha participado en los principales festivales de cine y animaci�n de todo el mundo, en los cuales ha ganado m�s de 50 premios.",0,"imgs/peliculas/51.jpg","l2HxnJ51_FI",actorespelicula,director51,null,usuario,genero5, true);

		this.peliculaService.add(pelicula51);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor354);
		actorespelicula.add(actor112);
		actorespelicula.add(actor355);
		actorespelicula.add(actor356);
		actorespelicula.add(actor357);
		actorespelicula.add(actor358);
		actorespelicula.add(actor359);
		actorespelicula.add(actor360);
		actorespelicula.add(actor361);

		Peliculas pelicula52 = new Peliculas("Medianeras",2011,"",94,"Mariana y Mart�n viven en la misma manzana en diferentes edificios; pero, aunque sus caminos se cruzan, no llegan a encontrarse. Mart�n dise�a p�ginas web. Mariana es arquitecta, pero trabaja como decoradora de vidrieras. Adem�s de desilusiones recientes, los dos tienen muchas cosas en com�n. Viven en el centro de Buenos Aires. La ciudad los une y a la vez los separa.",0,"imgs/peliculas/52.jpg","",actorespelicula,director52,null,usuario,genero2, true);

		this.peliculaService.add(pelicula52);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor362);
		actorespelicula.add(actor363);
		actorespelicula.add(actor300);
		actorespelicula.add(actor364);
		actorespelicula.add(actor365);
		actorespelicula.add(actor47);
		actorespelicula.add(actor366);
		actorespelicula.add(actor183);
		actorespelicula.add(actor367);
		actorespelicula.add(actor368);
		actorespelicula.add(actor369);

		Peliculas pelicula53 = new Peliculas("El abrazo partido",2003,"",100,"Narra la historia de un &quot;adolescente tard�o&quot; que busca un pasaporte para huir de Argentina pero al que el regreso de su padre, que abandon� a la familia por un ideal, le trastoca los planes. Pese a ello, y gracias a este reencuentro, el hijo buscar� a trav�s de su padre su propia identidad.",0,"imgs/peliculas/53.jpg","qHvys9ERRkg",actorespelicula,director53,null,usuario,genero2, true);

		this.peliculaService.add(pelicula53);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor135);
		actorespelicula.add(actor370);
		actorespelicula.add(actor371);
		actorespelicula.add(actor372);

		Peliculas pelicula54 = new Peliculas("Luminaris (S)",2011,"",6,"Pieza de orfebrer�a a ritmo de tango sobre la voluntad de cambiar el mundo.",0,"imgs/peliculas/54.jpg","Tl63luylXz8",actorespelicula,director54,null,usuario,genero5, true);

		this.peliculaService.add(pelicula54);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor51);
		actorespelicula.add(actor106);
		actorespelicula.add(actor356);
		actorespelicula.add(actor373);
		actorespelicula.add(actor374);
		actorespelicula.add(actor281);
		actorespelicula.add(actor375);

		Peliculas pelicula55 = new Peliculas("Inseparables",2016,"",107,"Felipe un empresario adinerado que ha quedado tetrapl�jico, debido a un accidente, est� buscando a un asistente terap�utico. Se presentan varios muy calificados, pero �l decide tomar al ayudante de su jardinero, Tito que ha decidido renunciar. Tito no re�ne ni por cerca las condiciones requeridas para tal empleo, cosa que notan inmediatamente las personas m�s cercanas a Felipe: Ver�nica e Ivonne su ama de llaves, pero Felipe mantiene firme su decisi�n. Tito es la �nica persona, en mucho tiempo, que no lo trata con compasi�n.",0,"imgs/peliculas/55.jpg","k7E3MtBLf6U",actorespelicula,director55,null,usuario,genero2, true);

		this.peliculaService.add(pelicula55);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor376);
		actorespelicula.add(actor377);
		actorespelicula.add(actor114);
		actorespelicula.add(actor378);
		actorespelicula.add(actor379);
		actorespelicula.add(actor380);

		Peliculas pelicula56 = new Peliculas("Infancia clandestina",2012,"",110,"Despu�s de vivir en el exilio, Juan, un ni�o de doce a�os, regresa con su familia a Argentina, donde todav�a gobierna la Junta militar que les oblig� a huir. Aunque es testigo de la actitud combativa de sus padres, intenta llevar una vida normal, en la que el colegio, las fiestas, las acampadas, las bromas y las risas con mam� tambi�n tienen su lugar. El principal apoyo del ni�o es su querido t�o Beto (Ernesto Alterio) quien, al contrario que su padre, entiende que los ideales y la lucha no est�n re�idos con las ganas de vivir. El mundo de Juan se transforma cuando se enamora de una compa�era de colegio.",0,"imgs/peliculas/56.jpg","djaxsM57wvY",actorespelicula,director56,null,usuario,genero1, true);

		this.peliculaService.add(pelicula56);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor276);
		actorespelicula.add(actor381);
		actorespelicula.add(actor123);
		actorespelicula.add(actor357);
		actorespelicula.add(actor382);

		Peliculas pelicula57 = new Peliculas("La antena",2007,"",87,"Una ciudad entera se ha quedado sin voz y vive bajo un largo y crudo invierno. Un hombre malvado y sin escr�pulos, el Sr. T.V., due�o absoluto de las im�genes que animan esta ciudad y de una extensa cadena de productos bajo su sello personal, lleva adelante un siniestro plan secreto para someter eternamente a cada una de las almas que habitan este lugar. Para construir este monopolio ha financiado la creaci�n de una peligrosa m�quina que transmite hipn�ticas im�genes por la pantalla del televisor para inducir al consumo compulsivo de los productos con su sello.",0,"imgs/peliculas/57.jpg","XWtWib9k7hs",actorespelicula,director57,null,usuario,genero7, true);

		this.peliculaService.add(pelicula57);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor0);
		actorespelicula.add(actor383);
		actorespelicula.add(actor384);
		actorespelicula.add(actor385);
		actorespelicula.add(actor386);
		actorespelicula.add(actor387);
		actorespelicula.add(actor388);
		actorespelicula.add(actor389);

		Peliculas pelicula58 = new Peliculas("Un cuento chino",2011,"",93,"Roberto, un hombre marcado por un duro rev�s que arruin� y paraliz� su vida hace m�s de veinte a�os, vive atrincherado frente al mundo y en completa soledad en su ferreter�a. Sin embargo, un d�a, un extra�o acontecimiento logra sacarlo de su aislamiento y ponerlo de nuevo en contacto con la realidad: en su vida aparece un chino que no sabe una palabra de espa�ol, y Roberto desea devolver al joven con los suyos.",0,"imgs/peliculas/58.jpg","onfIJVgS3Fo",actorespelicula,director58,null,usuario,genero2, true);

		this.peliculaService.add(pelicula58);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor390);
		actorespelicula.add(actor391);
		actorespelicula.add(actor392);
		actorespelicula.add(actor393);
		actorespelicula.add(actor394);

		Peliculas pelicula59 = new Peliculas("Hawaii",2013,"",106,"Eugenio pasa el verano cuidando la casa de sus t�os, que alguna vez fue suya, mientras busca inspiraci�n para un guion que est� escribiendo. Mart�n no tiene ninguna ocupaci�n y se ofrece a trabajar en esa casa haciendo todo tipo de arreglos. Se conocieron hace tiempo, siendo chicos, y no se volvieron a ver desde entonces.",0,"imgs/peliculas/59.jpg","DU0qmw2Ct0o",actorespelicula,director59,null,usuario,genero1, true);

		this.peliculaService.add(pelicula59);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor395);
		actorespelicula.add(actor396);
		actorespelicula.add(actor284);
		actorespelicula.add(actor397);
		actorespelicula.add(actor398);
		actorespelicula.add(actor399);
		actorespelicula.add(actor400);
		actorespelicula.add(actor401);
		actorespelicula.add(actor402);
		actorespelicula.add(actor403);
		actorespelicula.add(actor404);
		actorespelicula.add(actor405);
		actorespelicula.add(actor406);

		Peliculas pelicula60 = new Peliculas("El bonaerense",2002,"",99,"EL Zapa es cerrajero en un pueblo peque�o de la Provincia de Buenos Aires. El pueblo es tranquilo, trabajo de cerrajer�a hay muy poco y las horas de trabajo pasan lentamente. El Polaco, el due�o del local lo env�a a abrir una caja fuerte en una oficina. Al d�a siguiente cae preso como responsable del robo al lugar. Su t�o Ismael, polic�a Bonaerense retirado, lo saca de la comisar�a y lo env�a al Gran Buenos Aires con una carta de recomendaci�n. Zapa se convierte en un joven aspirante a agente de la Polic�a Bonaerense. Zapa llega a su nueva ciudad. Toma el curso de preparaci�n, trabaja en la comisar�a, etc. Su vida se convierte en una extra�a ficci�n con la que deber� convivir en el futuro.",0,"imgs/peliculas/60.jpg","nADus4wBFSA",actorespelicula,director60,null,usuario,genero1, true);

		this.peliculaService.add(pelicula60);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor407);
		actorespelicula.add(actor408);
		actorespelicula.add(actor409);
		actorespelicula.add(actor410);
		actorespelicula.add(actor411);
		actorespelicula.add(actor412);
		actorespelicula.add(actor413);
		actorespelicula.add(actor414);

		Peliculas pelicula61 = new Peliculas("Los muertos",2004,"",78,"Un hombre de cincuenta y cuatro a�os sale de una c�rcel en la provincia de Corrientes. Lo �nico que quiere es llegar hasta donde est� su hija, que vive en un lugar perdido rodeado de agua y selva. Para llegar hasta donde est� su familia deber� atravesar un largo trayecto de agua en una canoa.",0,"imgs/peliculas/61.jpg","",actorespelicula,director61,null,usuario,genero1, true);

		this.peliculaService.add(pelicula61);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor49);
		actorespelicula.add(actor72);
		actorespelicula.add(actor299);
		actorespelicula.add(actor192);
		actorespelicula.add(actor415);
		actorespelicula.add(actor416);

		Peliculas pelicula62 = new Peliculas("Sin retorno",2010,"",104,"Un joven ciclista muere atropellado por un autom�vil. El culpable huye sin dejar rastro. Pero el padre de la v�ctima, con el apoyo de los medios de comunicaci�n, exige que se encuentre al responsable y se haga justicia. Una serie de hechos fortuitos y unos magistrados contaminados por la opini�n p�blica har�n que un hombre inocente se siente en el banquillo de los acusados.",0,"imgs/peliculas/62.jpg","2AMAsUlb48M",actorespelicula,director62,null,usuario,genero0, true);

		this.peliculaService.add(pelicula62);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor400);
		actorespelicula.add(actor417);
		actorespelicula.add(actor418);
		actorespelicula.add(actor419);
		actorespelicula.add(actor420);
		actorespelicula.add(actor421);
		actorespelicula.add(actor422);
		actorespelicula.add(actor423);
		actorespelicula.add(actor424);
		actorespelicula.add(actor425);
		actorespelicula.add(actor426);
		actorespelicula.add(actor427);
		actorespelicula.add(actor428);

		Peliculas pelicula63 = new Peliculas("Familia rodante",2004,"",103,"La abuela Emilia cumple 84 a�os... Muy emocionada, anuncia a toda su familia que su sobrina la ha elegido como madrina de su boda, que se celebrar� a 1.500 kil�metros de all�. Para ese largo periplo de Buenos Aires a Misiones, lugar de su nacimiento, Emilia desea que todos la acompa�en. Como nadie se atreve a neg�rselo, se ponen en marcha en una caravana. A partir de ese momento la abuela, sus hijas, sus nietos, bisnietos, yernos, novios y amigas, viven interesantes experiencias durante el viaje en el interior de la casa rodante que los traslada.",0,"imgs/peliculas/63.jpg","8SKwK89P2p8",actorespelicula,director63,null,usuario,genero1, true);

		this.peliculaService.add(pelicula63);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor429);
		actorespelicula.add(actor430);
		actorespelicula.add(actor431);
		actorespelicula.add(actor432);
		actorespelicula.add(actor433);
		actorespelicula.add(actor247);

		Peliculas pelicula64 = new Peliculas("El �ltimo Elvis",2012,"",92,"Carlos Guti�rrez, &quot;Elvis&quot;, es un cantante separado que vive en un olvidado barrio de Buenos Aires y que tiene una peque�a hija llamada Lisa Marie, a la que no ve muy seguido. Siempre vivi� su vida como si fuese la reencarnaci�n de Elvis Presley, neg�ndose a aceptar su realidad. Pero est� a punto de cumplir los a�os que su �dolo ten�a al morir y su futuro se muestra vac�o. Una situaci�n inesperada lo obliga a hacerse cargo de su hija. En esos d�as, Carlos logra conocerse como padre y Lisa Marie aprende a aceptarlo tal cual es. Pero el destino le presenta una decisi�n dif�cil. En un viaje de locura y m�sica, Carlos deber� elegir entre su sue�o de ser Elvis o su familia.",0,"imgs/peliculas/64.jpg","kGZ1ysL8rAc",actorespelicula,director64,null,usuario,genero1, true);

		this.peliculaService.add(pelicula64);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor11);
		actorespelicula.add(actor434);
		actorespelicula.add(actor435);
		actorespelicula.add(actor246);
		actorespelicula.add(actor436);
		actorespelicula.add(actor437);
		actorespelicula.add(actor106);
		actorespelicula.add(actor438);

		Peliculas pelicula65 = new Peliculas("Nueces para el amor",2001,"",103,"En 1975, unos meses antes del comienzo de la dictadura militar argentina, Alicia y Marcelo se conocen en un concierto de rock. El amor surge inmediatamente entre ellos, pero el retorno del novio de Alicia provoca la separaci�n. En 1982, en Madrid, sus caminos vuelven a cruzarse. Tras el encuentro, se dan cuenta de que, a pesar de que el amor sigue latente, sus destinos discurren por rumbos separados. A�os despu�s, en 1990, tras otro encuentro casual, Marcelo decide hacer frente a sus sentimientos por Alicia: ambos quieren hacer realidad su sue�o postergado desde la adolescencia...",0,"imgs/peliculas/65.jpg","LuqlNpSN1eM",actorespelicula,director65,null,usuario,genero1, true);

		this.peliculaService.add(pelicula65);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor439);
		actorespelicula.add(actor303);
		actorespelicula.add(actor440);
		actorespelicula.add(actor249);
		actorespelicula.add(actor441);
		actorespelicula.add(actor364);
		actorespelicula.add(actor309);
		actorespelicula.add(actor442);
		actorespelicula.add(actor443);

		Peliculas pelicula66 = new Peliculas("El resultado del amor",2007,"",94,"Mabel trabaja alternando la animaci�n de fiestas infantiles con la prostituci�n. A los 20 a�os se cruza con Mart�n, un abogado que se ha separado de su esposa, y deja el estudio para el cual trabajaba. Se atraen mutuamente y terminan enamor�ndose. Al poco tiempo Mabel descubre que es portadora del virus VIH.",0,"imgs/peliculas/66.jpg","u1qYwZotIZ8",actorespelicula,director66,null,usuario,genero1, true);

		this.peliculaService.add(pelicula66);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor444);
		actorespelicula.add(actor445);
		actorespelicula.add(actor446);
		actorespelicula.add(actor447);
		actorespelicula.add(actor448);

		Peliculas pelicula67 = new Peliculas("El camino de San Diego",2006,"",98,"Tati, un joven de la provincia de Misiones, es un fan loco de Maradona, como la mayor�a de los argentinos. A pesar de haber perdido su trabajo y de que su situaci�n econ�mica sea dram�tica, Tati no pierde su esp�ritu jovial. Cuando la televisi�n informa del internamiento de Maradona en la Cl�nica Suizo Argentina de Buenos Aires por un problema card�aco, Tati decide viajar a la capital para hacerle entrega personalmente de una talla esculpida en madera. Atraviesa el monte a pie cargando la escultura envuelta en papel de diario y un bolso con otras tallas que espera vender. Una vez en la ruta, conoce a Warguinho, comenzando as� su periplo, rico en sorpresas y encuentros. �Lograr� entregar la escultura a su �dolo?",0,"imgs/peliculas/67.jpg","",actorespelicula,director67,null,usuario,genero1, true);

		this.peliculaService.add(pelicula67);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor449);
		actorespelicula.add(actor393);
		actorespelicula.add(actor450);

		Peliculas pelicula68 = new Peliculas("Rancho aparte",2007,"",90,"Hab�a una vez, en un lugar llamado Nogol�, un rancho de paredes de barro y piedra, donde viv�an Tulio y Susana. La vida transcurr�a con rutinas, casi s�lo con rutinas y el mundo era ancho y ajeno. En ese peque�o mundo, todo era conocido, todo era compartido, los recuerdos, los rencores, los gustos y los muertos. Fuera de all� todo era extra�o, distinto, inconveniente, peligroso. En otra ciudad lejana llamada Buenos Aires vive Clara, hermana de Tulio, t�a de Susana con sus rutinas, sus rencores y sus peque�as compa��as cotidianas.",0,"imgs/peliculas/68.jpg","",actorespelicula,director68,null,usuario,genero2, true);

		this.peliculaService.add(pelicula68);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor451);
		actorespelicula.add(actor452);
		actorespelicula.add(actor362);
		actorespelicula.add(actor453);
		actorespelicula.add(actor454);
		actorespelicula.add(actor455);
		actorespelicula.add(actor194);
		actorespelicula.add(actor456);
		actorespelicula.add(actor457);
		actorespelicula.add(actor458);

		Peliculas pelicula69 = new Peliculas("No sabe, no contesta",2002,"",90,"No sabe, no contesta cuenta la historia de Joaqu�n, que estudia cine y le gusta Laura. Tres d�as en cuatro cap�tulos en cuatro historias de cuatro amigos. Tres d�as en la historia de Joaqu�n que tiene tres amigos. Marcos, que tiene una novia que queda embarazada de otro. Dami�n, que tiene una novia que se acuesta con otro. David, que se acuesta con la novia de Dami�n.",0,"imgs/peliculas/69.jpg","",actorespelicula,director69,null,usuario,genero1, true);

		this.peliculaService.add(pelicula69);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor355);
		actorespelicula.add(actor0);
		actorespelicula.add(actor276);
		actorespelicula.add(actor222);
		actorespelicula.add(actor459);
		actorespelicula.add(actor460);
		actorespelicula.add(actor461);
		actorespelicula.add(actor378);

		Peliculas pelicula70 = new Peliculas("XXY",2007,"",86,"�lex (In�s Efron) es una singular adolescente de quince a�os que esconde un secreto. Poco despu�s de su nacimiento, sus padres, Kraken (Ricardo Dar�n) y Suli (Valeria Bertuccelli), decidieron dejar Buenos Aires para vivir, aislados del mundo, en una caba�a de madera a orillas del mar. Lo que pretend�an era que su hija creciera libre de cualquier tipo de prejuicios, protegida y feliz, hasta que llegara el momento de decidir qu� camino deb�a seguir.",0,"imgs/peliculas/70.jpg","lvimt276vDI",actorespelicula,director70,null,usuario,genero1, true);

		this.peliculaService.add(pelicula70);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor0);
		actorespelicula.add(actor224);
		actorespelicula.add(actor462);
		actorespelicula.add(actor463);
		actorespelicula.add(actor464);
		actorespelicula.add(actor465);
		actorespelicula.add(actor466);
		actorespelicula.add(actor467);

		Peliculas pelicula71 = new Peliculas("Carancho",2010,"",107,"Despu�s de haber perdido su licencia, el abogado Sosa (Ricardo Dar�n) ingresa en una sociedad ilegal que se encarga de provocar accidentes automovil�sticos para estafar a las aseguradoras. El destino hace que un d�a Sosa conozca a Luj�n (Martina Gusm�n), una m�dica de un hospital de Buenos Aires.",0,"imgs/peliculas/71.jpg","geZmmTil9fM",actorespelicula,director71,null,usuario,genero1, true);

		this.peliculaService.add(pelicula71);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor135);

		Peliculas pelicula72 = new Peliculas("Mart�n Fierro, la pel�cula",2007,"",88,"Mart�n Fierro es un renegado que lucha contra la corrupci�n que intenta someterlo y quitarle lo m�s preciado de su vida: La libertad.",0,"imgs/peliculas/72.jpg","3kIWUqcukdE",actorespelicula,director72,null,usuario,genero5, true);

		this.peliculaService.add(pelicula72);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor468);
		actorespelicula.add(actor353);
		actorespelicula.add(actor469);
		actorespelicula.add(actor470);
		actorespelicula.add(actor303);
		actorespelicula.add(actor471);
		actorespelicula.add(actor472);

		Peliculas pelicula73 = new Peliculas("El �ltimo verano de la Boyita",2009,"",93,"La Boyita es una casa rodante que tiene la m�gica capacidad de flotar. Una especie de anfibio dom�stico, un refugio para Jorgelina, una ni�a que est� a punto de alcanzar la adolescencia. Cuando va a pasar las vacaciones al campo junto a su pap�, conoce a Mario, un ni�o que le plantea a Jorgelina dudas que no sabe c�mo afrontar.",0,"imgs/peliculas/73.jpg","",actorespelicula,director73,null,usuario,genero1, true);

		this.peliculaService.add(pelicula73);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor473);
		actorespelicula.add(actor474);
		actorespelicula.add(actor475);
		actorespelicula.add(actor476);
		actorespelicula.add(actor477);

		Peliculas pelicula74 = new Peliculas("La libertad",2001,"",73,"Misael vive en la inmensidad del monte pampeano trabajando con su hacha. Sobrevive s�lo con lo indispensable y casi sin contacto con otras personas. Vemos su vida minuto a minuto intentando descubrir a trav�s de peque�os movimientos o acciones su manera de estar en el mundo.",0,"imgs/peliculas/74.jpg","Lx4Cvk9SJ2c",actorespelicula,director74,null,usuario,genero1, true);

		this.peliculaService.add(pelicula74);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor478);
		actorespelicula.add(actor479);
		actorespelicula.add(actor480);
		actorespelicula.add(actor481);
		actorespelicula.add(actor482);
		actorespelicula.add(actor483);

		Peliculas pelicula75 = new Peliculas("Cautiva",2004,"",115,"Cristina, una joven de 15 a�os, es sacada de su clase en un estricto colegio cat�lico de Buenos Aires y llevada ante un juez, quien le revela que ella es en realidad Sof�a Lombardi, la hija de una pareja de j�venes arquitectos militantes desaparecidos en los a�os 70, durante la dictadura militar argentina.",0,"imgs/peliculas/75.jpg","gffrHzRVSck",actorespelicula,director75,null,usuario,genero1, true);

		this.peliculaService.add(pelicula75);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor362);
		actorespelicula.add(actor484);
		actorespelicula.add(actor81);
		actorespelicula.add(actor485);
		actorespelicula.add(actor486);

		Peliculas pelicula76 = new Peliculas("Los paranoicos",2008,"",102,"&quot;Los paranoicos&quot; cuenta la historia de Gauna (Daniel Hendler), un joven que escribe pero nunca tuvo el coraje de ense�ar su obra. Un hombre que en la intimidad expone una personalidad que parece censurar en su escasa vida social. La aparici�n de un viejo amigo, Manuel, que llega desde Espa�a embriagado por el suceso de una serie televisiva cuyo protagonista tiene un nombre que remite a �l, provoca el enfrentamiento de Gauna con aquello que desea -aunque sea la novia de su amigo- y la reafirmaci�n de sus principios.",0,"imgs/peliculas/76.jpg","",actorespelicula,director76,null,usuario,genero2, true);

		this.peliculaService.add(pelicula76);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor0);
		actorespelicula.add(actor487);
		actorespelicula.add(actor16);
		actorespelicula.add(actor152);
		actorespelicula.add(actor488);
		actorespelicula.add(actor489);
		actorespelicula.add(actor490);

		Peliculas pelicula77 = new Peliculas("El aura",2005,"",138,"Esteban Espinosa (Ricardo Dar�n) es un hombre honrado, aunque taciturno y hosco. Es un taxidermista que, aislado en su taller, dedica el tiempo a dar apariencia de vida a la materia muerta. Pero, detr�s de sus ojos fr�os, arde un deseo oculto, una extra�a obsesi�n en un hombre honrado: durante los �ltimos a�os, una y otra vez, ha imaginado y planeado los golpes m�s perfectos y brillantes, fruto de una inteligencia que, seg�n �l, lo diferencia de los dem�s. Lo que ocurre fuera de su taller: la lucha de �tontos contra tontos�, polic�as y ladrones no tiene nada que ver con �l.",0,"imgs/peliculas/77.jpg","sKCcqaTrM4o",actorespelicula,director77,null,usuario,genero3, true);

		this.peliculaService.add(pelicula77);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor11);
		actorespelicula.add(actor244);
		actorespelicula.add(actor176);
		actorespelicula.add(actor491);
		actorespelicula.add(actor492);
		actorespelicula.add(actor311);
		actorespelicula.add(actor493);
		actorespelicula.add(actor132);
		actorespelicula.add(actor115);

		Peliculas pelicula78 = new Peliculas("Iluminados por el fuego",2005,"",100,"&quot;Iluminados por el fuego&quot; narra los recuerdos de Esteban Leguizam�n, un hombre de 40 a�os que, en 1982 y cuando ten�a s�lo 18, fue llevado como soldado recluta a combatir a las Islas Malvinas. A partir del intento de suicidio de uno de sus excompa�eros, Esteban se sumerge en los recuerdos de esa guerra que comparti� con otros dos j�venes reclutas: Vargas, el suicida, y Juan, muerto en combate. All� aparecen no s�lo los horrores propios de la guerra y el padecimiento del fr�o y del hambre, sino tambi�n las historias de amistad y compa�erismo. Desde la mirada de Esteban, la pel�cula pone en evidencia la lenta y gradual inmersi�n de sus fr�giles vidas en el coraz�n de la muerte misma.",0,"imgs/peliculas/78.jpg","c3Pyou7P4DU",actorespelicula,director78,null,usuario,genero8, true);

		this.peliculaService.add(pelicula78);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor72);
		actorespelicula.add(actor40);
		actorespelicula.add(actor167);
		actorespelicula.add(actor494);
		actorespelicula.add(actor495);
		actorespelicula.add(actor496);
		actorespelicula.add(actor497);
		actorespelicula.add(actor498);

		Peliculas pelicula79 = new Peliculas("Cuesti�n de principios",2009,"",115,"Castilla, modesto empleado portuario a punto de jubilarse, posee un ejemplar de una vieja revista que Silva, su nuevo y joven jefe, quiere comprarle a toda costa para completar su preciada colecci�n. Sin embargo, Castilla rechaza la oferta con el fin de darle una lecci�n, demostr�ndole que no todo en la vida tiene un precio. Las tentadoras ofertas de su obsesivo jefe provocar�n un conflicto entre Castilla y su familia.",0,"imgs/peliculas/79.jpg","",actorespelicula,director79,null,usuario,genero2, true);

		this.peliculaService.add(pelicula79);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor499);
		actorespelicula.add(actor500);
		actorespelicula.add(actor501);
		actorespelicula.add(actor502);
		actorespelicula.add(actor503);
		actorespelicula.add(actor504);

		Peliculas pelicula80 = new Peliculas("La mosca en la ceniza",2009,"",98,"El film trata sobre dos amigas �ntimas que llegan a Buenos Aires desde el Noroeste buscando un futuro mejor, pero son v�ctimas de un enga�o y deben trabajar en un prost�bulo. All�, una se adaptar� para sobrevivir y la otra intentar� huir.",0,"imgs/peliculas/80.jpg","JKes7oGQYKk",actorespelicula,director80,null,usuario,genero1, true);

		this.peliculaService.add(pelicula80);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor505);
		actorespelicula.add(actor270);
		actorespelicula.add(actor506);
		actorespelicula.add(actor463);
		actorespelicula.add(actor507);
		actorespelicula.add(actor508);
		actorespelicula.add(actor133);
		actorespelicula.add(actor509);
		actorespelicula.add(actor211);
		actorespelicula.add(actor510);

		Peliculas pelicula81 = new Peliculas("Las manos",2006,"",119,"El sacerdote Mario Pantaleo descubre que tiene cierto poder para diagnosticar y curar enfermedades por medio de la imposici�n de las manos. Pero la polic�a y la jerarqu�a eclesi�stica se pondr�n en su contra.",0,"imgs/peliculas/81.jpg","E5k4i6A0VUc",actorespelicula,director81,null,usuario,genero1, true);

		this.peliculaService.add(pelicula81);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor511);
		actorespelicula.add(actor512);
		actorespelicula.add(actor513);
		actorespelicula.add(actor514);
		actorespelicula.add(actor515);
		actorespelicula.add(actor516);

		Peliculas pelicula82 = new Peliculas("La luz incidente",2015,"",95,"Argentina, a�os 60. Desde el accidente, Luisa no ha podido rearmar su vida. Pero cuando un seductor desconocido entra en su vida y le propone con vehemencia volver a empezar, Luisa se enfrenta con el duelo que ven�a intentando evitar.",0,"imgs/peliculas/82.jpg","_dxcfFUMwzc",actorespelicula,director82,null,usuario,genero1, true);

		this.peliculaService.add(pelicula82);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor517);
		actorespelicula.add(actor361);
		actorespelicula.add(actor518);
		actorespelicula.add(actor519);

		Peliculas pelicula83 = new Peliculas("El estudiante",2011,"",124,"Roque Espinosa llega a Buenos Aires para estudiar en la Universidad. Sin embargo, pronto se da cuenta de que no tiene vocaci�n para el estudio. Se dedica entonces a deambular sin rumbo por la facultad y a hacer amigos. Paula, una profesora de la facultad, lo introduce en pol�tica. Roque empieza a asistir a las reuniones del partido y a relacionarse con otros militantes. As� conoce a Alberto Acevedo, un viejo pol�tico que, desde su c�tedra, se dedica a formar a los cuadros del partido. A su lado, Roque aprende los entresijos de la pol�tica y se convierte en un dirigente estudiantil, Por fin, ha encontrado su vocaci�n.",0,"imgs/peliculas/83.jpg","CtnGZ8vNq3o",actorespelicula,director83,null,usuario,genero1, true);

		this.peliculaService.add(pelicula83);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor108);
		actorespelicula.add(actor199);
		actorespelicula.add(actor381);
		actorespelicula.add(actor520);
		actorespelicula.add(actor52);
		actorespelicula.add(actor107);
		actorespelicula.add(actor70);
		actorespelicula.add(actor263);
		actorespelicula.add(actor521);
		actorespelicula.add(actor522);

		Peliculas pelicula84 = new Peliculas("La ni�a santa",2004,"",106,"Amalia es una ni�a como las otras del coro, que se cuestionan sus creencias religiosas. Cuando el Dr. Jano llega a dar una charla al hotel donde Amalia vive con su madre, ella siente que tiene una misi�n: librar del pecado a ese hombre que est� seduciendo a su madre.",0,"imgs/peliculas/84.jpg","ILc19QUijkM",actorespelicula,director84,null,usuario,genero1, true);

		this.peliculaService.add(pelicula84);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor523);
		actorespelicula.add(actor524);
		actorespelicula.add(actor525);
		actorespelicula.add(actor526);
		actorespelicula.add(actor527);
		actorespelicula.add(actor528);

		Peliculas pelicula85 = new Peliculas("Vikingo",2009,"",90,"Vikingo es un respetado motociclista de vida licenciosa pero, parad�jicamente, r�gido en lo que hace a la aplicaci�n de ciertos preceptos morales. El honor y el respeto son sus c�digos, aunque no est�n presentes coherentemente en todas las dimensiones de su vida.",0,"imgs/peliculas/85.jpg","",actorespelicula,director85,null,usuario,genero1, true);

		this.peliculaService.add(pelicula85);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor529);
		actorespelicula.add(actor276);
		actorespelicula.add(actor246);
		actorespelicula.add(actor530);
		actorespelicula.add(actor531);
		actorespelicula.add(actor532);
		actorespelicula.add(actor533);
		actorespelicula.add(actor534);
		actorespelicula.add(actor4);

		Peliculas pelicula86 = new Peliculas("Un novio para mi mujer",2008,"",100,"El Tenso (Adri�n Suar) no sabe c�mo enfrentarse a su mujer, la Tana (Valeria Bertuccelli), para decirle que se quiere separar, ya que la relaci�n se le hace insostenible debido a su terrible car�cter. Ella vive constantemente malhumorada: si no protesta por el tiempo, es por el gobierno; si no es por los vecinos, es por los j�venes, o por los viejos� o por lo que fuere. Carlos, amigo del Tenso, le sugiere invertir el problema� y provocar que la Tana lo abandone a �l. �C�mo? se pregunta el Tenso, y Carlos le presenta una propuesta: recurrir al Cuervo Flores (Gabriel Goity), un viejo seductor irresistible que seducir� a su mujer hasta el enamoramiento para que, por fin, el Tenso encuentre la soluci�n a sus problemas�",0,"imgs/peliculas/86.jpg","BXJpXzPJtg0",actorespelicula,director86,null,usuario,genero6, true);

		this.peliculaService.add(pelicula86);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor390);
		actorespelicula.add(actor535);
		actorespelicula.add(actor392);
		actorespelicula.add(actor536);
		actorespelicula.add(actor537);
		actorespelicula.add(actor538);
		actorespelicula.add(actor539);
		actorespelicula.add(actor293);

		Peliculas pelicula87 = new Peliculas("Plan B",2009,"",103,"Bruno (Manuel Vignau) sufre el abandono de su novia Laura (Mercedes Quinteros). A pesar de que siguen vi�ndose de vez en cuando, Laura tiene un nuevo novio, Pablo (Lucas Ferraro). Bruno est� empe�ado en recuperarla, as� que comienza a idear un plan. En principio, pretende hacerse amigo de Pablo -con el que coincide en el gimnasio- con la idea de erosionar la pareja, quiz� present�ndole a otra mujer. Gracias a una amiga en com�n, Bruno se entera de que Pablo tuvo una relaci�n en el pasado con un hombre y que es muy abierto en ese tema. Es ah� cuando surge la posibilidad de un plan B: que Bruno seduzca a Pablo para que �ste se distancie de Laura. Las cosas se complican cuando Bruno comienza a sentirse cada vez m�s a gusto con Pablo...",0,"imgs/peliculas/87.jpg","xdaSrYct7TQ",actorespelicula,director87,null,usuario,genero6, true);

		this.peliculaService.add(pelicula87);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor67);
		actorespelicula.add(actor540);
		actorespelicula.add(actor541);
		actorespelicula.add(actor513);
		actorespelicula.add(actor542);

		Peliculas pelicula88 = new Peliculas("La larga noche de Francisco Sanctis",2016,"",78,"Adaptaci�n de la novela hom�nima de Humberto Costantini, situada en Buenos Aires en 1977. Un hombre recibe, en plena dictadura, la informaci�n del paradero de dos personas buscadas por los militares. Ahora tiene la posibilidad de salvarlas, aunque eso implica arriesgar su propia vida.",0,"imgs/peliculas/88.jpg","",actorespelicula,director88,null,usuario,genero1, true);

		this.peliculaService.add(pelicula88);

	}
	

}
