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
		Actores actor11 = new Actores("Federico", "Luppi", 0, true);
		Actores actor12 = new Actores("Cecilia", "Roth", 0, true);
		Actores actor13 = new Actores("José", "Sacristán", 0, true);
		Actores actor14 = new Actores("Leonor", "Benedetto", 0, true);
		Actores actor15 = new Actores("Gastón", "Batyi", 0, true);
		Actores actor16 = new Actores("Lito", "Cruz", 0, true);
		Actores actor17 = new Actores("Mariano", "Ortega", 0, true);
		Actores actor18 = new Actores("Rodolfo", "Ranni", 0, true);
		Actores actor19 = new Actores("Lorena", "Río", 0, true);
		Actores actor20 = new Actores("Hugo", "Arana", 0, true);
		Actores actor21 = new Actores("Mario", "Alarcón", 0, true);
		Actores actor22 = new Actores("Ricardo", "Darín", 0, true);
		Actores actor23 = new Actores("Gastón", "Pauls", 0, true);
		Actores actor24 = new Actores("Leticia", "Brédice", 0, true);
		Actores actor25 = new Actores("Tomás", "Fonzi", 0, true);
		Actores actor26 = new Actores("Ignasi", "Abadal", 0, true);
		Actores actor27 = new Actores("Roly", "Serrano", 0, true);
		Actores actor28 = new Actores("Alejandro", "Awada", 0, true);
		Actores actor29 = new Actores("Antonio", "Ugo", 0, true);
		Actores actor30 = new Actores("Elsa", "Berenguer", 0, true);
		Actores actor31 = new Actores("Celia", "Juárez", 0, true);
		Actores actor32 = new Actores("Leo", "Dyzen", 0, true);
		Actores actor33 = new Actores("Graciela", "Tenembaum", 0, true);
		Actores actor34 = new Actores("Oscar", "Núñez", 0, true);
		Actores actor35 = new Actores("María", "Villagra", 0, true);
		Actores actor36 = new Actores("Gabriel", "Correa", 0, true);
		Actores actor37 = new Actores("Luis", "Armesto", 0, true);
		Actores actor38 = new Actores("Pochi", "Ducasse", 0, true);
		Actores actor39 = new Actores("Ernesto", "Arias", 0, true);
		Actores actor40 = new Actores("Amancay", "Espíndola", 0, true);
		Actores actor41 = new Actores("Jorge", "Noya", 0, true);
		Actores actor42 = new Actores("Carlos", "Lanari", 0, true);
		Actores actor43 = new Actores("Roberto", "Rey", 0, true);
		Actores actor44 = new Actores("Carlos", "Falcone", 0, true);
		Actores actor45 = new Actores("Ricardo", "Mourelle", 0, true);
		Actores actor46 = new Actores("Emanuel", "Mercado", 0, true);
		Actores actor47 = new Actores("Ulises", "Celestino", 0, true);
		Actores actor48 = new Actores("Norberto", "Arcusín", 0, true);
		Actores actor49 = new Actores("Gabriel", "Molinelli", 0, true);
		Actores actor50 = new Actores("Claudio", "Rissi", 0, true);
		Actores actor51 = new Actores("Héctor", "Alterio", 0, true);
		Actores actor52 = new Actores("Norma", "Aleandro", 0, true);
		Actores actor53 = new Actores("Hugo", "Arana", 0, true);
		Actores actor54 = new Actores("Chunchuna", "Villafañe", 0, true);
		Actores actor55 = new Actores("Lidia", "Catalano", 0, true);
		Actores actor56 = new Actores("Chela", "Ruiz", 0, true);
		Actores actor57 = new Actores("Patricio", "Contreras", 0, true);
		Actores actor58 = new Actores("Guillermo", "Battaglia", 0, true);
		Actores actor59 = new Actores("Daniel", "Lago", 0, true);
		Actores actor60 = new Actores("Andrea", "Tenuta", 0, true);
		Actores actor61 = new Actores("Floria", "Bloise", 0, true);
		Actores actor62 = new Actores("Carlos", "Weber", 0, true);
		Actores actor63 = new Actores("Leal", "Rey", 0, true);
		Actores actor64 = new Actores("María", "Robledo", 0, true);
		Actores actor65 = new Actores("Laura", "Palmucci", 0, true);
		Actores actor66 = new Actores("Ricardo", "Darín", 0, true);
		Actores actor67 = new Actores("Héctor", "Alterio", 0, true);
		Actores actor68 = new Actores("Norma", "Aleandro", 0, true);
		Actores actor69 = new Actores("Natalia", "Verbeke", 0, true);
		Actores actor70 = new Actores("Eduardo", "Blanco", 0, true);
		Actores actor71 = new Actores("Gimena", "Nóbile", 0, true);
		Actores actor72 = new Actores("Claudia", "Fontán", 0, true);
		Actores actor73 = new Actores("David", "Masajnik", 0, true);
		Actores actor74 = new Actores("Atilio", "Pozzobon", 0, true);
		Actores actor75 = new Actores("Salo", "Pasik", 0, true);
		Actores actor76 = new Actores("Ricardo", "Darín", 0, true);
		Actores actor77 = new Actores("Darío", "Grandinetti", 0, true);
		Actores actor78 = new Actores("Leonardo", "Sbaraglia", 0, true);
		Actores actor79 = new Actores("Erica", "Rivas", 0, true);
		Actores actor80 = new Actores("Oscar", "Martínez", 0, true);
		Actores actor81 = new Actores("Julieta", "Zylberberg", 0, true);
		Actores actor82 = new Actores("Rita", "Cortese", 0, true);
		Actores actor83 = new Actores("María", "Onetto", 0, true);
		Actores actor84 = new Actores("Osmar", "Núñez", 0, true);
		Actores actor85 = new Actores("Nancy", "Dupláa", 0, true);
		Actores actor86 = new Actores("María", "Marull", 0, true);
		Actores actor87 = new Actores("Germán", "Silva", 0, true);
		Actores actor88 = new Actores("Marcelo", "Pozzi", 0, true);
		Actores actor89 = new Actores("Diego", "Gentile", 0, true);
		Actores actor90 = new Actores("Alan", "Daicz", 0, true);
		Actores actor91 = new Actores("Liliana", "Weimer", 0, true);
		Actores actor92 = new Actores("Claudio", "Delan", 0, true);
		Actores actor93 = new Actores("Lucila", "Mangone", 0, true);
		Actores actor94 = new Actores("Federico", "Liss", 0, true);
		Actores actor95 = new Actores("Walter", "Donado", 0, true);
		Actores actor96 = new Actores("Diego", "Velázquez", 0, true);
		Actores actor97 = new Actores("Margarita", "Molfino", 0, true);
		Actores actor98 = new Actores("César", "Bordón", 0, true);
		Actores actor99 = new Actores("Mónica", "Villa", 0, true);
		Actores actor100 = new Actores("Juan", "Linari", 0, true);
		Actores actor101 = new Actores("Juan", "Verdaguer", 0, true);
		Actores actor102 = new Actores("Susana", "Campos", 0, true);
		Actores actor103 = new Actores("María", "Robledo", 0, true);
		Actores actor104 = new Actores("Alberto", "Dalbés", 0, true);
		Actores actor105 = new Actores("Amalia", "Bernabé", 0, true);
		Actores actor106 = new Actores("Héctor", "Calcaño", 0, true);
		Actores actor107 = new Actores("María", "César", 0, true);
		Actores actor108 = new Actores("Nina", "Brian", 0, true);
		Actores actor109 = new Actores("Lili", "Gacel", 0, true);
		Actores actor110 = new Actores("Beto", "Gianola", 0, true);
		Actores actor111 = new Actores("Miguel", "Ligero", 0, true);
		Actores actor112 = new Actores("Enrique", "Kossi", 0, true);
		Actores actor113 = new Actores("Federico", "Luppi", 0, true);
		Actores actor114 = new Actores("Haydée", "Padilla", 0, true);
		Actores actor115 = new Actores("Julio", "Grazia", 0, true);
		Actores actor116 = new Actores("Ulises", "Dumont", 0, true);
		Actores actor117 = new Actores("Jofre", "Soares", 0, true);
		Actores actor118 = new Actores("Aldo", "Barbero", 0, true);
		Actores actor119 = new Actores("Enrique", "Liporace", 0, true);
		Actores actor120 = new Actores("Arturo", "Maly", 0, true);
		Actores actor121 = new Actores("Rodolfo", "Ranni", 0, true);
		Actores actor122 = new Actores("Jorge", "Hacker", 0, true);
		Actores actor123 = new Actores("Alberto", "Benegas", 0, true);
		Actores actor124 = new Actores("Federico", "Luppi", 0, true);
		Actores actor125 = new Actores("Mercedes", "Sampietro", 0, true);
		Actores actor126 = new Actores("Arturo", "Puig", 0, true);
		Actores actor127 = new Actores("Carlos", "Santamaría", 0, true);
		Actores actor128 = new Actores("Yael", "Bamatán", 0, true);
		Actores actor129 = new Actores("Valentina", "Bassi", 0, true);
		Actores actor130 = new Actores("María", "Fiorentino", 0, true);
		Actores actor131 = new Actores("Claudio", "Rissi", 0, true);
		Actores actor132 = new Actores("Carlos", "Roffé", 0, true);
		Actores actor133 = new Actores("Sergio", "Campos", 0, true);
		Actores actor134 = new Actores("Lorenzo", "Quinteros", 0, true);
		Actores actor135 = new Actores("Mirta", "Busnelli", 0, true);
		Actores actor136 = new Actores("Nathalie", "Casale", 0, true);
		Actores actor137 = new Actores("Daniel", "Burzaco", 0, true);
		Actores actor138 = new Actores("Guido", "Lauwaert", 0, true);
		Actores actor139 = new Actores("Antonio", "Gasalla", 0, true);
		Actores actor140 = new Actores("China", "Zorrilla", 0, true);
		Actores actor141 = new Actores("Luis", "Brandoni", 0, true);
		Actores actor142 = new Actores("Julio", "Grazia", 0, true);
		Actores actor143 = new Actores("Betiana", "Blum", 0, true);
		Actores actor144 = new Actores("Juan", "Tenuta", 0, true);
		Actores actor145 = new Actores("Mónica", "Villa", 0, true);
		Actores actor146 = new Actores("Cecilia", "Rossetto", 0, true);
		Actores actor147 = new Actores("Enrique", "Pinti", 0, true);
		Actores actor148 = new Actores("Andrea", "Tenuta", 0, true);
		Actores actor149 = new Actores("Darío", "Grandinetti", 0, true);
		Actores actor150 = new Actores("Lidia", "Catalano", 0, true);
		Actores actor151 = new Actores("Juan", "Acosta", 0, true);
		Actores actor152 = new Actores("Miguel", "Porro", 0, true);
		Actores actor153 = new Actores("Clotilde", "Borella", 0, true);
		Actores actor154 = new Actores("Hugo", "Soto", 0, true);
		Actores actor155 = new Actores("Lorenzo", "Quinteros", 0, true);
		Actores actor156 = new Actores("Inés", "Vernengo", 0, true);
		Actores actor157 = new Actores("Rubens", "Correa", 0, true);
		Actores actor158 = new Actores("David", "Edery", 0, true);
		Actores actor159 = new Actores("Tomás", "Voth", 0, true);
		Actores actor160 = new Actores("Rodolfo", "Rodas", 0, true);
		Actores actor161 = new Actores("Horacio", "Marasi", 0, true);
		Actores actor162 = new Actores("Jean", "Reguerraz", 0, true);
		Actores actor163 = new Actores("Héctor", "Alterio", 0, true);
		Actores actor164 = new Actores("Luis", "Brandoni", 0, true);
		Actores actor165 = new Actores("Federico", "Luppi", 0, true);
		Actores actor166 = new Actores("José", "Soriano", 0, true);
		Actores actor167 = new Actores("Pedro", "Aleandro", 0, true);
		Actores actor168 = new Actores("Jorge", "López", 0, true);
		Actores actor169 = new Actores("Osvaldo", "Terranova", 0, true);
		Actores actor170 = new Actores("Héctor", "Pellegrini", 0, true);
		Actores actor171 = new Actores("Maurice", "Jouvet", 0, true);
		Actores actor172 = new Actores("Alfredo", "Iglesias", 0, true);
		Actores actor173 = new Actores("José", "Gutiérrez", 0, true);
		Actores actor174 = new Actores("Carlos", "Muñoz", 0, true);
		Actores actor175 = new Actores("Héctor", "Olivera", 0, true);
		Actores actor176 = new Actores("Federico", "Luppi", 0, true);
		Actores actor177 = new Actores("Juan", "Botto", 0, true);
		Actores actor178 = new Actores("Eusebio", "Poncela", 0, true);
		Actores actor179 = new Actores("Cecilia", "Roth", 0, true);
		Actores actor180 = new Actores("Sancho", "Gracia", 0, true);
		Actores actor181 = new Actores("Ana", "Picchio", 0, true);
		Actores actor182 = new Actores("Enrique", "Liporace", 0, true);
		Actores actor183 = new Actores("José", "Sacristán", 0, true);
		Actores actor184 = new Actores("Leonora", "Balcarce", 0, true);
		Actores actor185 = new Actores("", "", 0, true);
		Actores actor186 = new Actores("Víctor", "Proncet", 0, true);
		Actores actor187 = new Actores("Raúl", "Fraire", 0, true);
		Actores actor188 = new Actores("Susana", "Lanteri", 0, true);
		Actores actor189 = new Actores("Mara", "Lasio", 0, true);
		Actores actor190 = new Actores("Mario", "Luciani", 0, true);
		Actores actor191 = new Actores("Lautaro", "Murúa", 0, true);
		Actores actor192 = new Actores("Walter", "Soubrie", 0, true);
		Actores actor193 = new Actores("Luis", "Politti", 0, true);
		Actores actor194 = new Actores("Osvaldo", "Santoro", 0, true);
		Actores actor195 = new Actores("Osvaldo", "Senatore", 0, true);
		Actores actor196 = new Actores("Klaus", "Dietze", 0, true);
		Actores actor197 = new Actores("Eduardo", "Iaccono", 0, true);
		Actores actor198 = new Actores("Walter", "Jakob", 0, true);
		Actores actor199 = new Actores("Mariano", "Llinás", 0, true);
		Actores actor200 = new Actores("Horacio", "Marassi", 0, true);
		Actores actor201 = new Actores("Agustín", "Mendilaharzu", 0, true);
		Actores actor202 = new Actores("Óscar", "Martínez", 0, true);
		Actores actor203 = new Actores("Dady", "Brieva", 0, true);
		Actores actor204 = new Actores("Andrea", "Frigerio", 0, true);
		Actores actor205 = new Actores("Belén", "Chavanne", 0, true);
		Actores actor206 = new Actores("Nora", "Navas", 0, true);
		Actores actor207 = new Actores("Iván", "Steinhardt", 0, true);
		Actores actor208 = new Actores("Manuel", "Vicente", 0, true);
		Actores actor209 = new Actores("Marcelo", "D'Andrea", 0, true);
		Actores actor210 = new Actores("Gustavo", "Garzón", 0, true);
		Actores actor211 = new Actores("Emma", "Rivera", 0, true);
		Actores actor212 = new Actores("Walter", "Vidarte", 0, true);
		Actores actor213 = new Actores("Graciela", "Borges", 0, true);
		Actores actor214 = new Actores("Nora", "Cullen", 0, true);
		Actores actor215 = new Actores("Fernando", "'Tacholas'", 0, true);
		Actores actor216 = new Actores("Martín", "Andrade", 0, true);
		Actores actor217 = new Actores("José", "Felicetti", 0, true);
		Actores actor218 = new Actores("Héctor", "Pellegrini", 0, true);
		Actores actor219 = new Actores("María", "Laurenz", 0, true);
		Actores actor220 = new Actores("Nelly", "Beltrán", 0, true);
		Actores actor221 = new Actores("Lautaro", "Murúa", 0, true);
		Actores actor222 = new Actores("Alberto", "Rosa", 0, true);
		Actores actor223 = new Actores("Maurice", "Jouvet", 0, true);
		Actores actor224 = new Actores("Beatriz", "Matar", 0, true);
		Actores actor225 = new Actores("Jorge", "López", 0, true);
		Actores actor226 = new Actores("Federico", "Luppi", 0, true);
		Actores actor227 = new Actores("Marta", "Gam", 0, true);
		Actores actor228 = new Actores("Alberto", "Barcel", 0, true);
		Actores actor229 = new Actores("Hugo", "Dargo", 0, true);
		Actores actor230 = new Actores("Zulema", "Katz", 0, true);
		Actores actor231 = new Actores("Orlando", "Bor", 0, true);
		Actores actor232 = new Actores("Fabiana", "Gavel", 0, true);
		Actores actor233 = new Actores("Darío", "Grandinetti", 0, true);
		Actores actor234 = new Actores("Sandra", "Ballesteros", 0, true);
		Actores actor235 = new Actores("Nacha", "Guevara", 0, true);
		Actores actor236 = new Actores("Mario", "Benedetti", 0, true);
		Actores actor237 = new Actores("André", "Melançon", 0, true);
		Actores actor238 = new Actores("Jean-Pierre", "Reguerraz", 0, true);
		Actores actor239 = new Actores("Inés", "Vernengo", 0, true);
		Actores actor240 = new Actores("Mónica", "Galán", 0, true);
		Actores actor241 = new Actores("Marisa", "Aguilera", 0, true);
		Actores actor242 = new Actores("Federico", "Luppi", 0, true);
		Actores actor243 = new Actores("Julio", "Grazia", 0, true);
		Actores actor244 = new Actores("Soledad", "Silveyra", 0, true);
		Actores actor245 = new Actores("Ulises", "Dumont", 0, true);
		Actores actor246 = new Actores("Carlos", "Ferreiro", 0, true);
		Actores actor247 = new Actores("Mónica", "Galán", 0, true);
		Actores actor248 = new Actores("Norma", "Kraider", 0, true);
		Actores actor249 = new Actores("Enrique", "Liporace", 0, true);
		Actores actor250 = new Actores("Arturo", "Maly", 0, true);
		Actores actor251 = new Actores("Noemi", "Morelli", 0, true);
		Actores actor252 = new Actores("Pablo", "Rago", 0, true);
		Actores actor253 = new Actores("China", "Zorrilla", 0, true);
		Actores actor254 = new Actores("Elena", "Tasisto", 0, true);
		Actores actor255 = new Actores("Héctor", "Alterio", 0, true);
		Actores actor256 = new Actores("Ana", "Picchio", 0, true);
		Actores actor257 = new Actores("Luis", "Brandoni", 0, true);
		Actores actor258 = new Actores("Marilina", "Ross", 0, true);
		Actores actor259 = new Actores("China", "Zorrilla", 0, true);
		Actores actor260 = new Actores("Cipe", "Lincovsky", 0, true);
		Actores actor261 = new Actores("Oscar", "Martínez", 0, true);
		Actores actor262 = new Actores("Luis", "Politti", 0, true);
		Actores actor263 = new Actores("Norma", "Aleandro", 0, true);
		Actores actor264 = new Actores("Antonio", "Gasalla", 0, true);
		Actores actor265 = new Actores("Federico", "Luppi", 0, true);
		Actores actor266 = new Actores("Norma", "Aleandro", 0, true);
		Actores actor267 = new Actores("Jorge", "Luz", 0, true);
		Actores actor268 = new Actores("Cecilia", "Rossetto", 0, true);
		Actores actor269 = new Actores("Gabriela", "Acher", 0, true);
		Actores actor270 = new Actores("Roberto", "Carnaghi", 0, true);
		Actores actor271 = new Actores("Erasmo", "Olivera", 0, true);
		Actores actor272 = new Actores("Nicolas", "Goldsmith", 0, true);
		Actores actor273 = new Actores("Javier", "Lombardo", 0, true);
		Actores actor274 = new Actores("Antonio", "Benedictis", 0, true);
		Actores actor275 = new Actores("Javiera", "Bravo", 0, true);
		Actores actor276 = new Actores("Laura", "Vagnoni", 0, true);
		Actores actor277 = new Actores("Mariela", "Díaz", 0, true);
		Actores actor278 = new Actores("Julia", "Solomonoff", 0, true);
		Actores actor279 = new Actores("Anibal", "Maldonado", 0, true);
		Actores actor280 = new Actores("Magín", "García", 0, true);
		Actores actor281 = new Actores("María", "Cianferoni", 0, true);
		Actores actor282 = new Actores("Carlos", "Monteros", 0, true);
		Actores actor283 = new Actores("Luis", "Brandoni", 0, true);
		Actores actor284 = new Actores("Dora", "Baret", 0, true);
		Actores actor285 = new Actores("Luisina", "Brando", 0, true);
		Actores actor286 = new Actores("Lito", "Cruz", 0, true);
		Actores actor287 = new Actores("Oscar", "Ferrigno", 0, true);
		Actores actor288 = new Actores("María", "Vaner", 0, true);
		Actores actor289 = new Actores("China", "Zorrilla", 0, true);
		Actores actor290 = new Actores("Darío", "Grandinetti", 0, true);
		Actores actor291 = new Actores("Fernando", "Álvarez", 0, true);
		Actores actor292 = new Actores("Clotilde", "Borella", 0, true);
		Actores actor293 = new Actores("Mónica", "Villa", 0, true);
		Actores actor294 = new Actores("Manuel", "Callau", 0, true);
		Actores actor295 = new Actores("Juan", "Corazza", 0, true);
		Actores actor296 = new Actores("Norberto", "Díaz", 0, true);
		Actores actor297 = new Actores("Gabriela", "Flores", 0, true);
		Actores actor298 = new Actores("Héctor", "Alterio", 0, true);
		Actores actor299 = new Actores("Juan", "Gené", 0, true);
		Actores actor300 = new Actores("Lautaro", "Murúa", 0, true);
		Actores actor301 = new Actores("Walter", "Vidarte", 0, true);
		Actores actor302 = new Actores("Héctor", "Pellegrini", 0, true);
		Actores actor303 = new Actores("Luis", "Aranda", 0, true);
		Actores actor304 = new Actores("Osvaldo", "Bonet", 0, true);
		Actores actor305 = new Actores("Diana", "Arias", 0, true);
		Actores actor306 = new Actores("Cipe", "Lincovsky", 0, true);
		Actores actor307 = new Actores("Sara", "Bonet", 0, true);
		Actores actor308 = new Actores("Luis", "Castro", 0, true);
		Actores actor309 = new Actores("Enzo", "Bai", 0, true);
		Actores actor310 = new Actores("Coco", "Fossati", 0, true);
		Actores actor311 = new Actores("Carlos", "Lasarte", 0, true);
		Actores actor312 = new Actores("Mario", "Luciani", 0, true);
		Actores actor313 = new Actores("Pacheco", "Fernández", 0, true);
		Actores actor314 = new Actores("Roberto", "Pieri", 0, true);
		Actores actor315 = new Actores("Héctor", "Biuchet", 0, true);
		Actores actor316 = new Actores("Natalio", "Hoxman", 0, true);
		Actores actor317 = new Actores("Marcos", "Mundstock", 0, true);
		Actores actor318 = new Actores("Arturo", "Córdova", 0, true);
		Actores actor319 = new Actores("Zully", "Moreno", 0, true);
		Actores actor320 = new Actores("Florindo", "Ferrario", 0, true);
		Actores actor321 = new Actores("Enrique", "Chaico", 0, true);
		Actores actor322 = new Actores("Federico", "Mansilla", 0, true);
		Actores actor323 = new Actores("Zoe", "Ducos", 0, true);
		Actores actor324 = new Actores("José", "Comellas", 0, true);
		Actores actor325 = new Actores("Roberto", "Bordoni", 0, true);
		Actores actor326 = new Actores("Ramón", "Garay", 0, true);
		Actores actor327 = new Actores("Tito", "Grassi", 0, true);
		Actores actor328 = new Actores("Adolfo", "Linvel", 0, true);
		Actores actor329 = new Actores("José", "Paonessa", 0, true);
		Actores actor330 = new Actores("Enrique", "Pedro", 0, true);
		Actores actor331 = new Actores("Nicolás", "Taricano", 0, true);
		Actores actor332 = new Actores("Aída", "Villadeamigo", 0, true);
		Actores actor333 = new Actores("Alejo", "Pintos", 0, true);
		Actores actor334 = new Actores("Vita", "Escardó", 0, true);
		Actores actor335 = new Actores("Pablo", "Novak", 0, true);
		Actores actor336 = new Actores("Adriana", "Salonia", 0, true);
		Actores actor337 = new Actores("Pablo", "Machado", 0, true);
		Actores actor338 = new Actores("José", "Monje", 0, true);
		Actores actor339 = new Actores("Leonardo", "Sbaraglia", 0, true);
		Actores actor340 = new Actores("Héctor", "Bidonde", 0, true);
		Actores actor341 = new Actores("Tina", "Serrano", 0, true);
		Actores actor342 = new Actores("Lorenzo", "Quinteros", 0, true);
		Actores actor343 = new Actores("Antonella", "Costa", 0, true);
		Actores actor344 = new Actores("Carlos", "Echevarría", 0, true);
		Actores actor345 = new Actores("Dominique", "Sanda", 0, true);
		Actores actor346 = new Actores("Chiara", "Caselli", 0, true);
		Actores actor347 = new Actores("Enrique", "Piñeyro", 0, true);
		Actores actor348 = new Actores("Gael", "Bernal", 0, true);
		Actores actor349 = new Actores("Rodrigo", "Serna", 0, true);
		Actores actor350 = new Actores("Mía", "Maestro", 0, true);
		Actores actor351 = new Actores("Mercedes", "Morán", 0, true);
		Actores actor352 = new Actores("Jorge", "Chiarella", 0, true);
		Actores actor353 = new Actores("Gabriela", "Aguilera", 0, true);
		Actores actor354 = new Actores("Natalia", "Oreiro", 0, true);
		Actores actor355 = new Actores("Lautaro", "Delgado", 0, true);
		Actores actor356 = new Actores("Javier", "Drolas", 0, true);
		Actores actor357 = new Actores("Susana", "Pampín", 0, true);
		Actores actor358 = new Actores("Roly", "Serrano", 0, true);
		Actores actor359 = new Actores("Daniel", "Melingo", 0, true);
		Actores actor360 = new Actores("Ángela", "Torres", 0, true);
		Actores actor361 = new Actores("Daniel", "Valenzuela", 0, true);
		Actores actor362 = new Actores("Vanesa", "Weinberg", 0, true);
		Actores actor363 = new Actores("Mariana", "Anghileri)", 0, true);
		Actores actor364 = new Actores("Javier", "Drolas", 0, true);
		Actores actor365 = new Actores("Valentina", "Liernud", 0, true);
		Actores actor366 = new Actores("Héctor", "Alterio", 0, true);
		Actores actor367 = new Actores("Leonardo", "Sbaraglia", 0, true);
		Actores actor368 = new Actores("Cecilia", "Roth", 0, true);
		Actores actor369 = new Actores("Daniel", "Kuzniecka", 0, true);
		Actores actor370 = new Actores("Leticia", "Brédice", 0, true);
		Actores actor371 = new Actores("Nicolás", "Abeles", 0, true);
		Actores actor372 = new Actores("Alejo", "Pintos", 0, true);
		Actores actor373 = new Actores("Maximiliano", "Ghione", 0, true);
		Actores actor374 = new Actores("Emilio", "Bardi", 0, true);
		Actores actor375 = new Actores("Tita", "Merello", 0, true);
		Actores actor376 = new Actores("Arturo", "Buhr", 0, true);
		Actores actor377 = new Actores("Roberto", "Fugazot", 0, true);
		Actores actor378 = new Actores("Enrique", "Fava", 0, true);
		Actores actor379 = new Actores("Graciela", "Lecube", 0, true);
		Actores actor380 = new Actores("Diego", "Puente", 0, true);
		Actores actor381 = new Actores("Tino", "Pascali", 0, true);
		Actores actor382 = new Actores("Cacho", "Espíndola", 0, true);
		Actores actor383 = new Actores("Victoriano", "Moreira", 0, true);
		Actores actor384 = new Actores("Beto", "Gianola", 0, true);
		Actores actor385 = new Actores("Leonardo", "Favio", 0, true);
		Actores actor386 = new Actores("María", "Vaner", 0, true);
		Actores actor387 = new Actores("Elcira", "Garcés", 0, true);
		Actores actor388 = new Actores("María", "Robledo", 0, true);
		Actores actor389 = new Actores("Hugo", "Arana", 0, true);
		Actores actor390 = new Actores("Carlos", "Lucero", 0, true);
		Actores actor391 = new Actores("Mario", "Pena", 0, true);
		Actores actor392 = new Actores("Juan", "Valunes", 0, true);
		Actores actor393 = new Actores("Amadeo", "Valiente", 0, true);
		Actores actor394 = new Actores("Juan", "Castro", 0, true);
		Actores actor395 = new Actores("Juan", "Delicio", 0, true);
		Actores actor396 = new Actores("Carlos", "Medrano", 0, true);
		Actores actor397 = new Actores("Miguel", "Medrano", 0, true);
		Actores actor398 = new Actores("Jorge", "Puente", 0, true);
		Actores actor399 = new Actores("Óscar", "Saraceni", 0, true);
		Actores actor400 = new Actores("Jorge", "Cabello", 0, true);
		Actores actor401 = new Actores("Néstor", "Tricarico", 0, true);
		Actores actor402 = new Actores("Roberto", "Domínguez", 0, true);
		Actores actor403 = new Actores("Carlos", "González", 0, true);
		Actores actor404 = new Actores("Carmen", "Maura", 0, true);
		Actores actor405 = new Actores("Rodrigo", "Noya", 0, true);
		Actores actor406 = new Actores("Julieta", "Cardinali", 0, true);
		Actores actor407 = new Actores("Jean", "Noher", 0, true);
		Actores actor408 = new Actores("Mex", "Urtizberea", 0, true);
		Actores actor409 = new Actores("Alejandro", "Agresti", 0, true);
		Actores actor410 = new Actores("Carlos", "Cores", 0, true);
		Actores actor411 = new Actores("Analía", "Gadé", 0, true);
		Actores actor412 = new Actores("Carmen", "Giménez", 0, true);
		Actores actor413 = new Actores("George", "Hilton", 0, true);
		Actores actor414 = new Actores("Vassili", "Lambrinos", 0, true);
		Actores actor415 = new Actores("Adolfo", "Linvel", 0, true);
		Actores actor416 = new Actores("Gilda", "Lousek", 0, true);
		Actores actor417 = new Actores("Aída", "Luz", 0, true);
		Actores actor418 = new Actores("Pablo", "Moret", 0, true);
		Actores actor419 = new Actores("Bernardo", "Perrone", 0, true);
		Actores actor420 = new Actores("Diego", "Peretti", 0, true);
		Actores actor421 = new Actores("Luis", "Luque", 0, true);
		Actores actor422 = new Actores("Oscar", "Ferreiro", 0, true);
		Actores actor423 = new Actores("Gabriela", "Izcovich", 0, true);
		Actores actor424 = new Actores("Martín", "Adjemián", 0, true);
		Actores actor425 = new Actores("Tony", "Lestingi", 0, true);
		Actores actor426 = new Actores("Carlos", "Portaluppi", 0, true);
		Actores actor427 = new Actores("Ernesto", "Claudio", 0, true);
		Actores actor428 = new Actores("Daniel", "Valenzuela", 0, true);
		Actores actor429 = new Actores("Antonio", "Ugo", 0, true);
		Actores actor430 = new Actores("", "", 0, true);
		Actores actor431 = new Actores("Juan", "Botto", 0, true);
		Actores actor432 = new Actores("Susú", "Pecoraro", 0, true);
		Actores actor433 = new Actores("José", "Sacristán", 0, true);
		Actores actor434 = new Actores("Agustín", "Garvie", 0, true);
		Actores actor435 = new Actores("Vando", "Villamil", 0, true);
		Actores actor436 = new Actores("Marcela", "Kloosterboer", 0, true);
		Actores actor437 = new Actores("Maximiliano", "Ghione", 0, true);
		Actores actor438 = new Actores("Marina", "Gleezer", 0, true);
		Actores actor439 = new Actores("Gustavo", "Garzón", 0, true);
		Actores actor440 = new Actores("Carla", "Crespo", 0, true);
		Actores actor441 = new Actores("Marcos", "Mundstock", 0, true);
		Actores actor442 = new Actores("Raúl", "Rizzo", 0, true);
		Actores actor443 = new Actores("Jean", "Noher", 0, true);
		Actores actor444 = new Actores("Alberto", "Jiménez", 0, true);
		Actores actor445 = new Actores("Ángel", "Facio", 0, true);
		Actores actor446 = new Actores("María", "Galiana", 0, true);
		Actores actor447 = new Actores("Marcos", "Woinski", 0, true);
		Actores actor448 = new Actores("Hugo", "Carril", 0, true);
		Actores actor449 = new Actores("Adriana", "Benetti", 0, true);
		Actores actor450 = new Actores("Raúl", "Valle", 0, true);
		Actores actor451 = new Actores("Pedro", "Laxalt", 0, true);
		Actores actor452 = new Actores("Gloria", "Ferrandiz", 0, true);
		Actores actor453 = new Actores("Eloy", "Álvarez", 0, true);
		Actores actor454 = new Actores("Herminia", "Franco", 0, true);
		Actores actor455 = new Actores("Luis", "Otero", 0, true);
		Actores actor456 = new Actores("Federico", "Luppi", 0, true);
		Actores actor457 = new Actores("Antonella", "Costa", 0, true);
		Actores actor458 = new Actores("Pablo", "Cedrón", 0, true);
		Actores actor459 = new Actores("Esteban", "Meloni", 0, true);
		Actores actor460 = new Actores("Mariana", "Briski", 0, true);
		Actores actor461 = new Actores("Ricardo", "Mourelle", 0, true);
		Actores actor462 = new Actores("Hernán", "Jiménez", 0, true);
		Actores actor463 = new Actores("China", "Zorrilla", 0, true);
		Actores actor464 = new Actores("Manuel", "Alexandre", 0, true);
		Actores actor465 = new Actores("Blanca", "Portillo", 0, true);
		Actores actor466 = new Actores("Roberto", "Carnaghi", 0, true);
		Actores actor467 = new Actores("José", "Egido", 0, true);
		Actores actor468 = new Actores("Federico", "Luppi", 0, true);
		Actores actor469 = new Actores("Gonzalo", "Urtizberea", 0, true);
		Actores actor470 = new Actores("Omar", "Muñoz", 0, true);
		Actores actor471 = new Actores("Carlos", "Novoa", 0, true);
		Actores actor472 = new Actores("Fanny", "Gautier", 0, true);
		Actores actor473 = new Actores("Claudia", "Álvarez", 0, true);
		Actores actor474 = new Actores("Tomás", "Sáez", 0, true);
		Actores actor475 = new Actores("Rodrigo", "Serna", 0, true);
		Actores actor476 = new Actores("Pablo", "Echarri", 0, true);
		Actores actor477 = new Actores("Nazareno", "Casero", 0, true);
		Actores actor478 = new Actores("Matías", "Marmorato", 0, true);
		Actores actor479 = new Actores("Lautaro", "Delgado", 0, true);
		Actores actor480 = new Actores("Diego", "Gómez", 0, true);
		Actores actor481 = new Actores("Martín", "Urruty", 0, true);
		Actores actor482 = new Actores("Susana", "Pampín", 0, true);
		Actores actor483 = new Actores("Micaela", "Vázquez", 0, true);
		Actores actor484 = new Actores("Julián", "Krakov", 0, true);
		Actores actor485 = new Actores("Rubén", "Noceda", 0, true);
		Actores actor486 = new Actores("Alfonso", "Tort", 0, true);
		Actores actor487 = new Actores("César", "Albarracín", 0, true);
		Actores actor488 = new Actores("Leonardo", "Ramírez", 0, true);
		Actores actor489 = new Actores("Rodolfo", "Bebán", 0, true);
		Actores actor490 = new Actores("Pablo", "Cumo", 0, true);
		Actores actor491 = new Actores("Alba", "Mugica", 0, true);
		Actores actor492 = new Actores("Carlos", "Muñoz", 0, true);
		Actores actor493 = new Actores("Elcira", "Garcés", 0, true);
		Actores actor494 = new Actores("Eduardo", "Rudy", 0, true);
		Actores actor495 = new Actores("Elena", "Tritek", 0, true);
		Actores actor496 = new Actores("Edgardo", "Suárez", 0, true);
		Actores actor497 = new Actores("Osvaldo", "Vega", 0, true);
		Actores actor498 = new Actores("Augusto", "Kretschmar", 0, true);
		Actores actor499 = new Actores("Pirucho", "Gómez", 0, true);
		Actores actor500 = new Actores("Lola", "Palombo", 0, true);
		Actores actor501 = new Actores("María", "Vera", 0, true);
		Actores actor502 = new Actores("Hector", "Palavecino", 0, true);
		Actores actor503 = new Actores("Julio", "González", 0, true);
		Actores actor504 = new Actores("Carlos", "Rodríguez", 0, true);
		Actores actor505 = new Actores("Marie", "Laforêt", 0, true);
		Actores actor506 = new Actores("Philippe", "Léotard", 0, true);
		Actores actor507 = new Actores("Miguel", "Sola", 0, true);
		Actores actor508 = new Actores("Marina", "Vlady", 0, true);
		Actores actor509 = new Actores("Georges", "Wilson", 0, true);
		Actores actor510 = new Actores("Lautaro", "Murúa", 0, true);
		Actores actor511 = new Actores("Gabriela", "Toscano", 0, true);
		Actores actor512 = new Actores("Juan", "Villegas", 0, true);
		Actores actor513 = new Actores("Walter", "Donado", 0, true);
		Actores actor514 = new Actores("Rosa", "Valsecchi", 0, true);
		Actores actor515 = new Actores("Mariela", "Díaz", 0, true);
		Actores actor516 = new Actores("Pascual", "Condito", 0, true);
		Actores actor517 = new Actores("Carlos", "Rossi", 0, true);
		Actores actor518 = new Actores("Federico", "Luppi", 0, true);
		Actores actor519 = new Actores("Elsa", "Daniel", 0, true);
		Actores actor520 = new Actores("María", "Vaner", 0, true);
		Actores actor521 = new Actores("Edgardo", "Suárez", 0, true);
		Actores actor522 = new Actores("Cacho", "Mendoza", 0, true);
		Actores actor523 = new Actores("Eduardo", "Vargas", 0, true);
		Actores actor524 = new Actores("Ernesto", "Cutrera", 0, true);
		Actores actor525 = new Actores("Rafael", "Chumbito", 0, true);
		Actores actor526 = new Actores("Mario", "Savino", 0, true);
		Actores actor527 = new Actores("Julio", "Grazia", 0, true);
		Actores actor528 = new Actores("Luisina", "Brando", 0, true);
		Actores actor529 = new Actores("Fernanda", "Mistral", 0, true);
		Actores actor530 = new Actores("Beba", "Bidart", 0, true);
		Actores actor531 = new Actores("Lidia", "Catalano", 0, true);
		Actores actor532 = new Actores("Julio", "Chávez", 0, true);
		Actores actor533 = new Actores("Patricio", "Contreras", 0, true);
		Actores actor534 = new Actores("Ulises", "Dumont", 0, true);
		Actores actor535 = new Actores("Miguel", "Guerberoff", 0, true);
		Actores actor536 = new Actores("Arturo", "Maly", 0, true);
		Actores actor537 = new Actores("Cecilia", "Padilla", 0, true);
		Actores actor538 = new Actores("Osvaldo", "Terranova", 0, true);
		Actores actor539 = new Actores("Alejandro", "Patiño", 0, true);
		Actores actor540 = new Actores("China", "Zorrilla", 0, true);
		Actores actor541 = new Actores("Eduardo", "Blanco", 0, true);
		Actores actor542 = new Actores("Ulises", "Dumont", 0, true);
		Actores actor543 = new Actores("Silvina", "Bosco", 0, true);
		Actores actor544 = new Actores("Floria", "Bloise", 0, true);
		Actores actor545 = new Actores("Nicolás", "Condito", 0, true);
		Actores actor546 = new Actores("Tito", "Mendoza", 0, true);
		Actores actor547 = new Actores("Julio", "Chávez", 0, true);
		Actores actor548 = new Actores("Soledad", "Villamil", 0, true);
		Actores actor549 = new Actores("Luis", "Machín", 0, true);
		Actores actor550 = new Actores("Agostina", "Lage", 0, true);
		Actores actor551 = new Actores("Enrique", "Liporace", 0, true);
		Actores actor552 = new Actores("Rene", "Lavand", 0, true);
		Actores actor553 = new Actores("Daniel", "Valenzuela", 0, true);
		Actores actor554 = new Actores("Freddy", "Flores", 0, true);
		Actores actor555 = new Actores("Ernesto", "Villegas", 0, true);
		Actores actor556 = new Actores("Gastón", "Pauls", 0, true);
		Actores actor557 = new Actores("Pablo", "Cedrón", 0, true);
		Actores actor558 = new Actores("", "", 0, true);
		Actores actor559 = new Actores("Luis", "Machin", 0, true);
		Actores actor560 = new Actores("Carlos", "Belloso", 0, true);
		Actores actor561 = new Actores("Alfredo", "Casero", 0, true);
		Actores actor562 = new Actores("Marcelo", "Mazzarello", 0, true);
		Actores actor563 = new Actores("Norma", "Aleandro", 0, true);
		Actores actor564 = new Actores("Luis", "Luque", 0, true);
		Actores actor565 = new Actores("Leonor", "Manso", 0, true);
		Actores actor566 = new Actores("Peto", "Menahem", 0, true);
		Actores actor567 = new Actores("Alejandra", "Manzo", 0, true);
		Actores actor568 = new Actores("Laura", "Cymer", 0, true);
		Actores actor569 = new Actores("Germán", "Silva", 0, true);
		Actores actor570 = new Actores("Ricardo", "Darín", 0, true);
		Actores actor571 = new Actores("Cecilia", "Roth", 0, true);
		Actores actor572 = new Actores("Héctor", "Alterio", 0, true);
		Actores actor573 = new Actores("Fernanda", "Mistral", 0, true);
		Actores actor574 = new Actores("Tomás", "Fonzi", 0, true);
		Actores actor575 = new Actores("Mónica", "Scapparone", 0, true);
		Actores actor576 = new Actores("Milton", "Canal", 0, true);
		Actores actor577 = new Actores("Matías", "Pozo", 0, true);
		Actores actor578 = new Actores("Evelyn", "Domínguez", 0, true);
		Actores actor579 = new Actores("Leticia", "Bredice", 0, true);
		Actores actor580 = new Actores("Nicolás", "Cantafio", 0, true);
		Actores actor581 = new Actores("Gabriel", "Galíndez", 0, true);
		Actores actor582 = new Actores("María", "Socas", 0, true);
		Actores actor583 = new Actores("Juan", "Carrasco", 0, true);
		Actores actor584 = new Actores("Demián", "Bugallo", 0, true);
		Actores actor585 = new Actores("Valentín", "Barrio", 0, true);
		Actores actor586 = new Actores("Oscar", "Ferrigno", 0, true);
		Actores actor587 = new Actores("Alberto", "Silva", 0, true);
		Actores actor588 = new Actores("Susú", "Pecoraro", 0, true);
		Actores actor589 = new Actores("Imanol", "Arias", 0, true);
		Actores actor590 = new Actores("Héctor", "Alterio", 0, true);
		Actores actor591 = new Actores("Elena", "Tasisto", 0, true);
		Actores actor592 = new Actores("Carlos", "Muñoz", 0, true);
		Actores actor593 = new Actores("Héctor", "Pellegrini", 0, true);
		Actores actor594 = new Actores("Juan", "Leyrado", 0, true);
		Actores actor595 = new Actores("Boris", "Rubaja", 0, true);
		Actores actor596 = new Actores("Claudio", "Gallardou", 0, true);
		Actores actor597 = new Actores("Mona", "Maris", 0, true);
		Actores actor598 = new Actores("Zelmar", "Gueñol", 0, true);
		Actores actor599 = new Actores("Fernando", "'Tacholas'", 0, true);
		Actores actor600 = new Actores("Lidia", "Catalano", 0, true);
		Actores actor601 = new Actores("Oscar", "Núñez", 0, true);
		Actores actor602 = new Actores("Héctor", "Alterio", 0, true);
		Actores actor603 = new Actores("Leonardo", "Sbaraglia", 0, true);
		Actores actor604 = new Actores("Federico", "Luppi", 0, true);
		Actores actor605 = new Actores("Cecilia", "Dopazo", 0, true);
		Actores actor606 = new Actores("Ferrán", "Miras", 0, true);
		Actores actor607 = new Actores("Daniel", "Kuzniecka", 0, true);
		Actores actor608 = new Actores("Cipe", "Lincovsky", 0, true);
		Actores actor609 = new Actores("Antonio", "Grimau", 0, true);
		Actores actor610 = new Actores("Alex", "Benn", 0, true);
		Actores actor611 = new Actores("Freddy", "Flores", 0, true);
		Actores actor612 = new Actores("Rosa", "Sánchez", 0, true);
		Actores actor613 = new Actores("Óscar", "Bertea", 0, true);
		Actores actor614 = new Actores("Enrique", "Liporace", 0, true);
		Actores actor615 = new Actores("Marcelo", "Videla", 0, true);
		Actores actor616 = new Actores("Alberto", "Mercado", 0, true);
		Actores actor617 = new Actores("Héctor", "Anglada", 0, true);

		/*Genero Categorias*/
		Generos genero0 = new Generos("Thriller");
		this.generoService.add(genero0);
		Generos genero1 = new Generos("Drama");
		this.generoService.add(genero1);
		Generos genero2 = new Generos("Comedia");
		this.generoService.add(genero2);
		Generos genero3 = new Generos("Animación");
		this.generoService.add(genero3);
		Generos genero4 = new Generos("Intriga");
		this.generoService.add(genero4);
		Generos genero5 = new Generos("Romance");
		this.generoService.add(genero5);
		Generos genero6 = new Generos("Aventuras");
		this.generoService.add(genero6);
		Generos genero7 = new Generos("Cine negro");
		this.generoService.add(genero7);

		/*Genero Directores*/
		Directores director0 = new Directores("Juan", "Campanella", 0);
		this.directorService.add(director0);
		Directores director1 = new Directores("Adolfo", "Aristarain", 0);
		this.directorService.add(director1);
		Directores director2 = new Directores("Fabián", "Bielinsky", 0);
		this.directorService.add(director2);
		Directores director3 = new Directores("Luis", "Puenzo", 0);
		this.directorService.add(director3);
		Directores director4 = new Directores("Juan", "Campanella", 0);
		this.directorService.add(director4);
		Directores director5 = new Directores("Damián", "Szifrón", 0);
		this.directorService.add(director5);
		Directores director6 = new Directores("Mario", "Soffici", 0);
		this.directorService.add(director6);
		Directores director7 = new Directores("Adolfo", "Aristarain", 0);
		this.directorService.add(director7);
		Directores director8 = new Directores("Adolfo", "Aristarain", 0);
		this.directorService.add(director8);
		Directores director9 = new Directores("Alejandro", "Agresti", 0);
		this.directorService.add(director9);
		Directores director10 = new Directores("Alejandro", "Doria", 0);
		this.directorService.add(director10);
		Directores director11 = new Directores("Eliseo", "Subiela", 0);
		this.directorService.add(director11);
		Directores director12 = new Directores("Héctor", "Olivera", 0);
		this.directorService.add(director12);
		Directores director13 = new Directores("Adolfo", "Aristarain", 0);
		this.directorService.add(director13);
		Directores director14 = new Directores("Manuel", "Ferré", 0);
		this.directorService.add(director14);
		Directores director15 = new Directores("Raymundo", "Gleyzer", 0);
		this.directorService.add(director15);
		Directores director16 = new Directores("Mariano", "Llinás", 0);
		this.directorService.add(director16);
		Directores director17 = new Directores("Mariano", "Duprat", 0);
		this.directorService.add(director17);
		Directores director18 = new Directores("Leonardo", "Favio", 0);
		this.directorService.add(director18);
		Directores director19 = new Directores("Rodolfo", "Kuhn", 0);
		this.directorService.add(director19);
		Directores director20 = new Directores("Eliseo", "Subiela", 0);
		this.directorService.add(director20);
		Directores director21 = new Directores("Adolfo", "Aristarain", 0);
		this.directorService.add(director21);
		Directores director22 = new Directores("Sergio", "Renán", 0);
		this.directorService.add(director22);
		Directores director23 = new Directores("Eduardo", "Mignogna", 0);
		this.directorService.add(director23);
		Directores director24 = new Directores("Carlos", "Sorín", 0);
		this.directorService.add(director24);
		Directores director25 = new Directores("Alejandro", "Doria", 0);
		this.directorService.add(director25);
		Directores director26 = new Directores("Ricardo", "Wullicher", 0);
		this.directorService.add(director26);
		Directores director27 = new Directores("Luis", "Amadori", 0);
		this.directorService.add(director27);
		Directores director28 = new Directores("Héctor", "Olivera", 0);
		this.directorService.add(director28);
		Directores director29 = new Directores("Marco", "Bechis", 0);
		this.directorService.add(director29);
		Directores director30 = new Directores("Walter", "Salles", 0);
		this.directorService.add(director30);
		Directores director31 = new Directores("Lorena", "Muñoz", 0);
		this.directorService.add(director31);
		Directores director32 = new Directores("Gustavo", "Taretto", 0);
		this.directorService.add(director32);
		Directores director33 = new Directores("Marcelo", "Piñeyro", 0);
		this.directorService.add(director33);
		Directores director34 = new Directores("Lucas", "Demare", 0);
		this.directorService.add(director34);
		Directores director35 = new Directores("Leonardo", "Favio", 0);
		this.directorService.add(director35);
		Directores director36 = new Directores("Alejandro", "Agresti", 0);
		this.directorService.add(director36);
		Directores director37 = new Directores("Fernando", "Ayala", 0);
		this.directorService.add(director37);
		Directores director38 = new Directores("Damián", "Szifrón", 0);
		this.directorService.add(director38);
		Directores director39 = new Directores("Santiago", "Grasso", 0);
		this.directorService.add(director39);
		Directores director40 = new Directores("Adolfo", "Aristarain", 0);
		this.directorService.add(director40);
		Directores director41 = new Directores("Hugo", "Carril", 0);
		this.directorService.add(director41);
		Directores director42 = new Directores("Eduardo", "Mignogna", 0);
		this.directorService.add(director42);
		Directores director43 = new Directores("Marcos", "Carnevale", 0);
		this.directorService.add(director43);
		Directores director44 = new Directores("Adrián", "Caetano", 0);
		this.directorService.add(director44);
		Directores director45 = new Directores("Leonardo", "Favio", 0);
		this.directorService.add(director45);
		Directores director46 = new Directores("Fernando", "Birri", 0);
		this.directorService.add(director46);
		Directores director47 = new Directores("Fernando", "Solanas", 0);
		this.directorService.add(director47);
		Directores director48 = new Directores("Carlos", "Sorín", 0);
		this.directorService.add(director48);
		Directores director49 = new Directores("Leonardo", "Favio", 0);
		this.directorService.add(director49);
		Directores director50 = new Directores("Adolfo", "Aristarain", 0);
		this.directorService.add(director50);
		Directores director51 = new Directores("Santiago", "Oves", 0);
		this.directorService.add(director51);
		Directores director52 = new Directores("Adrián", "Caetano", 0);
		this.directorService.add(director52);
		Directores director53 = new Directores("Lucho", "Bender", 0);
		this.directorService.add(director53);
		Directores director54 = new Directores("Marcos", "Carnevale", 0);
		this.directorService.add(director54);
		Directores director55 = new Directores("Marcelo", "Piñeyro", 0);
		this.directorService.add(director55);
		Directores director56 = new Directores("María", "Bemberg", 0);
		this.directorService.add(director56);
		Directores director57 = new Directores("Marcelo", "Piñeyro", 0);
		this.directorService.add(director57);
		Directores director58 = new Directores("Adrián", "Caetano", 0);
		this.directorService.add(director58);

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

		Peliculas pelicula0 = new Peliculas("El secreto de sus ojos",2009,"",126,"Argentina. Benjamín Espósito es oficial de un Juzgado de Instrucción de Buenos Aires recién retirado. Obsesionado por un brutal asesinato ocurrido veinticinco años antes, en 1974, decide escribir una novela sobre el caso, del cual fue testigo y protagonista. Reviviendo el pasado, viene también a su memoria el recuerdo de una mujer, a quien ha amado en silencio durante todos esos años.",0,"imgs/peliculas/el_secreto_de_sus_ojos-862971973-mmed.jpg","GcHkTSqeGoU",actorespelicula,director0,null,usuario,genero0, true);

		this.peliculaService.add(pelicula0);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
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

		Peliculas pelicula1 = new Peliculas("Un lugar en el mundo",1992,"",120,"Ernesto hace un viaje a la provincia argentina de San Luis, a un remoto pueblo en un valle puntano, para recordar su infancia y las circunstancias que han determinado su vida: sus padres se habían exiliado voluntariamente de Buenos Aires para vivir en una comunidad campesina. La llegada de un geólogo español, contratado por el cacique local para buscar petróleo, representa una amenaza para la forma de vida de los campesinos.",0,"imgs/peliculas/un_lugar_en_el_mundo-643443472-mmed.jpg","32tH6F6sFbU",actorespelicula,director1,null,usuario,genero1, true);

		this.peliculaService.add(pelicula1);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
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
		actorespelicula.add(actor39);
		actorespelicula.add(actor40);
		actorespelicula.add(actor41);
		actorespelicula.add(actor42);
		actorespelicula.add(actor43);
		actorespelicula.add(actor44);
		actorespelicula.add(actor45);
		actorespelicula.add(actor46);
		actorespelicula.add(actor47);
		actorespelicula.add(actor48);
		actorespelicula.add(actor49);
		actorespelicula.add(actor50);

		Peliculas pelicula2 = new Peliculas("Nueve reinas",2000,"",114,"Buenos Aires. Juan y Marcos son dos estafadores de poca monta, uno joven y un veterano en el arte del timo, que casualmente se ven envueltos en un asunto que les puede hacer millonarios: tienen menos de un día para hacer una estafa que no puede fallar.",0,"imgs/peliculas/nueve_reinas-699348153-mmed.jpg","KWUs-smqOeQ",actorespelicula,director2,null,usuario,genero0, true);

		this.peliculaService.add(pelicula2);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
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

		Peliculas pelicula3 = new Peliculas("La historia oficial",1985,"",110,"Buenos Aires, 1983. En los últimos años de la dictadura militar argentina, una acomodada profesora de historia comienza a tomar conciencia de lo ocurrido en ese periodo. Sus sospechas sobre los oscuros asuntos de su marido y una Abuela de Plaza de Mayo que busca a su nieta son los motivos que la llevan a replantearse &quot;la historia oficial&quot;.",0,"imgs/peliculas/la_historia_oficial-970645863-mmed.jpg","drcYUlHBx1Y",actorespelicula,director3,null,usuario,genero1, true);

		this.peliculaService.add(pelicula3);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor66);
		actorespelicula.add(actor67);
		actorespelicula.add(actor68);
		actorespelicula.add(actor69);
		actorespelicula.add(actor70);
		actorespelicula.add(actor71);
		actorespelicula.add(actor72);
		actorespelicula.add(actor73);
		actorespelicula.add(actor74);
		actorespelicula.add(actor75);

		Peliculas pelicula4 = new Peliculas("El hijo de la novia",2001,"",124,"Rafael dedica 24 horas al día a su restaurante, está divorciado, ve muy poco a su hija, no tiene amigos y elude comprometerse con su novia. Además, desde hace mucho tiempo no visita a su madre, internada en un geriátrico porque sufre el mal de Alzheimer. Una serie de acontecimientos inesperados le obligan a replantearse su vida. Entre ellos, la intención que tiene su padre de cumplir el viejo sueño de su madre: casarse por la Iglesia.",0,"imgs/peliculas/el_hijo_de_la_novia-570644260-mmed.jpg","",actorespelicula,director4,null,usuario,genero1, true);

		this.peliculaService.add(pelicula4);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor76);
		actorespelicula.add(actor77);
		actorespelicula.add(actor78);
		actorespelicula.add(actor79);
		actorespelicula.add(actor80);
		actorespelicula.add(actor81);
		actorespelicula.add(actor82);
		actorespelicula.add(actor83);
		actorespelicula.add(actor84);
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
		actorespelicula.add(actor95);
		actorespelicula.add(actor96);
		actorespelicula.add(actor97);
		actorespelicula.add(actor98);
		actorespelicula.add(actor99);
		actorespelicula.add(actor100);

		Peliculas pelicula5 = new Peliculas("Relatos salvajes",2014,"",119,"La película consta de seis episodios que alternan la intriga, la comedia y la violencia. Sus personajes se verán empujados hacia el abismo y hacia el innegable placer de perder el control, cruzando la delgada línea que separa la civilización de la barbarie.",0,"imgs/peliculas/relatos_salvajes-102488639-mmed.jpg","kmHHPcT2zl8",actorespelicula,director5,null,usuario,genero2, true);

		this.peliculaService.add(pelicula5);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor101);
		actorespelicula.add(actor102);
		actorespelicula.add(actor103);
		actorespelicula.add(actor104);
		actorespelicula.add(actor105);
		actorespelicula.add(actor106);
		actorespelicula.add(actor107);
		actorespelicula.add(actor108);
		actorespelicula.add(actor109);
		actorespelicula.add(actor110);
		actorespelicula.add(actor111);
		actorespelicula.add(actor112);

		Peliculas pelicula6 = new Peliculas("Rosaura a las diez",1958,"",100,"Todo comenzó unos seis meses antes, &quot;aquella mañana en el que el cartero trajo un sobre rosa con un detestable perfume a violetas&quot;. Los sobres van llegando puntualmente, cada miércoles, a la pensión La Madrileña. El olor a violetas invade las habitaciones de los inquilinos, que se convertirían en testigos del encuentro entre Rosaura y Camilo Canegato, el tímido restaurador de cuadros. Sin embargo, hay algo que parece no cuadrar del todo en la relación de ambos.",0,"imgs/peliculas/rosaura_a_las_diez-823198962-mmed.jpg","-WUZ6bu2NqA",actorespelicula,director6,null,usuario,genero1, true);

		this.peliculaService.add(pelicula6);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor113);
		actorespelicula.add(actor114);
		actorespelicula.add(actor115);
		actorespelicula.add(actor116);
		actorespelicula.add(actor117);
		actorespelicula.add(actor118);
		actorespelicula.add(actor119);
		actorespelicula.add(actor120);
		actorespelicula.add(actor121);
		actorespelicula.add(actor122);
		actorespelicula.add(actor123);

		Peliculas pelicula7 = new Peliculas("Tiempo de revancha",1981,"",108,"El ex-sindicalista Pedro Bengoa, previa &quot;limpieza&quot; de su pasado, consigue trabajo en las minas de la empresa Tulsaco, donde se reencuentra con un antiguo compañero quien, pasado algún tiempo, le propone un plan: simular un accidente y hacerse pasar por mudo para cobrar una indemnización. Pero algo inesperado sucede...",0,"imgs/peliculas/tiempo_de_revancha-353300768-mmed.jpg","C-6ExvULsC0",actorespelicula,director7,null,usuario,genero1, true);

		this.peliculaService.add(pelicula7);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor124);
		actorespelicula.add(actor125);
		actorespelicula.add(actor126);
		actorespelicula.add(actor127);
		actorespelicula.add(actor128);
		actorespelicula.add(actor129);
		actorespelicula.add(actor130);
		actorespelicula.add(actor131);

		Peliculas pelicula8 = new Peliculas("Lugares comunes",2002,"",108,"Fernando Robles (Federico Luppi) es porteño, ya ha cumplido los sesenta y es profesor de literatura en la universidad. Enseña a enseñar. Lleva toda la vida casado con Liliana Rovira (Mercedes Sampietro), española, hija de catalanes, que trabaja como asistente social en barrios marginales de Buenos Aires. Se quieren, se respetan, son leales. Nunca se aburren estando juntos, les gusta estar solos. Se conocen profundamente, se aceptan, se pelean sin odio, se divierten. Son amantes, socios, amigos, cómplices. Ninguno de ellos concibe la vida sin el otro.",0,"imgs/peliculas/lugares_comunes-166936253-mmed.jpg","fDioVsOSCWo",actorespelicula,director8,null,usuario,genero1, true);

		this.peliculaService.add(pelicula8);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor132);
		actorespelicula.add(actor133);
		actorespelicula.add(actor134);
		actorespelicula.add(actor135);
		actorespelicula.add(actor136);
		actorespelicula.add(actor137);
		actorespelicula.add(actor138);

		Peliculas pelicula9 = new Peliculas("El acto en cuestión",1994,"",114,"Historia del mago Miguel Quiroga que roba un libro de un desconocido y se hace muy famoso.",0,"imgs/peliculas/el_acto_en_cuestion-409071526-mmed.jpg","mytGVGBnr1A",actorespelicula,director9,null,usuario,genero1, true);

		this.peliculaService.add(pelicula9);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor139);
		actorespelicula.add(actor140);
		actorespelicula.add(actor141);
		actorespelicula.add(actor142);
		actorespelicula.add(actor143);
		actorespelicula.add(actor144);
		actorespelicula.add(actor145);
		actorespelicula.add(actor146);
		actorespelicula.add(actor147);
		actorespelicula.add(actor148);
		actorespelicula.add(actor149);
		actorespelicula.add(actor150);
		actorespelicula.add(actor151);
		actorespelicula.add(actor152);
		actorespelicula.add(actor153);

		Peliculas pelicula10 = new Peliculas("Esperando la carroza",1985,"",87,"Mamá Cora, muy cerca ya de los ochenta años, tiene tres hijos y una hija. Vive con uno de ellos, que pasa serios apuros económicos. Un día la familia se reúne para celebrar una comida de aniversario, y es en ese momento cuando se plantea el gran dilema: ¿Quién se hará cargo de ella llevándosela a su casa? El peliagudo asunto se complica cuando reciben la noticia de que la anciana se ha tirado a la vía del tren.",0,"imgs/peliculas/esperando_la_carroza-675954190-mmed.jpg","MX24bb1-ncg",actorespelicula,director10,null,usuario,genero2, true);

		this.peliculaService.add(pelicula10);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor154);
		actorespelicula.add(actor155);
		actorespelicula.add(actor156);
		actorespelicula.add(actor157);
		actorespelicula.add(actor158);
		actorespelicula.add(actor159);
		actorespelicula.add(actor160);
		actorespelicula.add(actor161);
		actorespelicula.add(actor162);

		Peliculas pelicula11 = new Peliculas("Hombre mirando al sudeste",1986,"",104,"El doctor Julio Denis es un médico psiquiatra y trabaja en un neuropsiquiátrico. Un día llega al hospital un joven, Rantés, que dice ser un ser de otro planeta. Lo trata como paranoico, pero Rantés irá introduciéndose en su vida, haciéndolo dudar de si realmente está loco, con lo que, sutilmente, lo obliga a replantear su vida y profesión.",0,"imgs/peliculas/hombre_mirando_al_sudeste-539575931-mmed.jpg","_G-5MrOa3Jc",actorespelicula,director11,null,usuario,genero1, true);

		this.peliculaService.add(pelicula11);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor163);
		actorespelicula.add(actor164);
		actorespelicula.add(actor165);
		actorespelicula.add(actor166);
		actorespelicula.add(actor167);
		actorespelicula.add(actor168);
		actorespelicula.add(actor169);
		actorespelicula.add(actor170);
		actorespelicula.add(actor171);
		actorespelicula.add(actor172);
		actorespelicula.add(actor173);
		actorespelicula.add(actor174);
		actorespelicula.add(actor175);

		Peliculas pelicula12 = new Peliculas("La Patagonia rebelde",1974,"",103,"En 1920, unos obreros de la Patagonia (Argentina), agrupados en sociedades anarquistas y socialistas, deciden hacer una huelga exigiendo mejoras laborales. Entre los trabajadores hay numerosos emigrantes europeos que influyen ideológicamente en sus compañeros. La situación se hace insostenible y el gobierno de Yrigoyen manda, desde Buenos Aires, al teniente coronel Zavala para que restablezca el orden...",0,"imgs/peliculas/la_patagonia_rebelde-737787125-mmed.jpg","7NKFiGj_DYI",actorespelicula,director12,null,usuario,genero1, true);

		this.peliculaService.add(pelicula12);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor176);
		actorespelicula.add(actor177);
		actorespelicula.add(actor178);
		actorespelicula.add(actor179);
		actorespelicula.add(actor180);
		actorespelicula.add(actor181);
		actorespelicula.add(actor182);
		actorespelicula.add(actor183);
		actorespelicula.add(actor184);

		Peliculas pelicula13 = new Peliculas("Martín (Hache)",1997,"",134,"Martín Echenique (Federico Luppi) es un director de cine argentino que lleva más de veinte años viviendo en Madrid. Detesta su país y se niega a recrearse en la nostalgia. Siguiendo la tradición familiar, su hijo también se llama Martín, pero todos le llaman Hache (Juan Diego Botto);  tiene 19 años y vive en Buenos Aires con su madre. Ni estudia ni trabaja; callejea y toca su guitarra eléctrica. Después de cinco años sin verse, vuelven a encontrarse en Buenos Aires cuando Hache sufre un grave accidente. La exmujer de Martín,  que tiene una nueva familia en la que parece que no hay cabida para Hache, propone que el chico viva con su padre.",0,"imgs/peliculas/martin_hache-793749679-mmed.jpg","7KCP20lP-7E",actorespelicula,director13,null,usuario,genero1, true);

		this.peliculaService.add(pelicula13);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor185);

		Peliculas pelicula14 = new Peliculas("Trapito",1975,"",70,"Trapito, un espantapájaros con un corazón de oro, salva la vida a Salapín, un simpático Gorrión. Surge una inseparable amistad y viven una historia llena de peligros, aventuras, risas pero también instantes realmente tristes. Aparecerán amigos como Larguirucho, Espumita y Caballito de Mar, pero también malvados enemigos como el pirata Mala Pata y el Pulpo Cruel.",0,"imgs/peliculas/trapito-471283419-mmed.jpg","",actorespelicula,director14,null,usuario,genero3, true);

		this.peliculaService.add(pelicula14);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor186);
		actorespelicula.add(actor187);
		actorespelicula.add(actor188);
		actorespelicula.add(actor189);
		actorespelicula.add(actor190);
		actorespelicula.add(actor191);
		actorespelicula.add(actor192);
		actorespelicula.add(actor193);
		actorespelicula.add(actor194);
		actorespelicula.add(actor195);

		Peliculas pelicula15 = new Peliculas("Los traidores",1972,"",113,"Película originalmente destinada para la clase obrera revolucionaria e intelectuales de izquierda. Trata sobre la vida de un militante sindical, que comienza su lucha en las filas peronistas durante los '60 y se corrompe en su ascenso al poder. La película fue y es considerada por muchos como el único film argentino que profundizó, indagó e investigó con audacia y valentía el accionar histórico de la CGT, su política corrupta y mafiosa. La película propone que la estructura sindical que permitió actuar a esos dirigentes sigue intacta. Los &quot;traidores&quot; de ayer son los mismos que hoy.",0,"imgs/peliculas/los_traidores-961472995-mmed.jpg","",actorespelicula,director15,null,usuario,genero1, true);

		this.peliculaService.add(pelicula15);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor196);
		actorespelicula.add(actor197);
		actorespelicula.add(actor198);
		actorespelicula.add(actor199);
		actorespelicula.add(actor200);
		actorespelicula.add(actor201);

		Peliculas pelicula16 = new Peliculas("Historias extraordinarias",2008,"",245,"Se trata de los relatos que tienen como figuras centrales a tres forasteros, identificados cada uno con una inicial: H, X y Z, cada uno con una misión, que se irán revelando de a poco. Capítulo tras capítulo, Llinás describe lugares, situaciones, sus actitudes frente a las circunstancias y los hechos de los que son protagonistas o simples testigos, a partir de un relato en off (con las voces de Daniel Hendler, Juan Minujin y Verónica Llinás), escrito con formato literario, de manera que estos cuentos ilustrados no requieran diálogos entre los personajes.",0,"imgs/peliculas/historias_extraordinarias-318176356-mmed.jpg","mnp9CsY_Ufc",actorespelicula,director16,null,usuario,genero4, true);

		this.peliculaService.add(pelicula16);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor202);
		actorespelicula.add(actor203);
		actorespelicula.add(actor204);
		actorespelicula.add(actor205);
		actorespelicula.add(actor206);
		actorespelicula.add(actor207);
		actorespelicula.add(actor208);
		actorespelicula.add(actor209);
		actorespelicula.add(actor210);
		actorespelicula.add(actor211);

		Peliculas pelicula17 = new Peliculas("El ciudadano ilustre",2016,"",118,"Es la historia de un escritor argentino, Premio Nobel de Literatura, que hace cuarenta años abandonó su pueblo y partió hacia Europa, donde triunfó escribiendo sobre su localidad natal y sus personajes. En el pico de su carrera, el alcalde de ese pueblo donde nació le invita para nombrarle &quot;Ciudadano Ilustre&quot; del mismo, y él decide cancelar su apretada agenda y aceptar la invitación.",0,"imgs/peliculas/el_ciudadano_ilustre-221897542-mmed.jpg","VI2GLPtYCq8",actorespelicula,director17,null,usuario,genero2, true);

		this.peliculaService.add(pelicula17);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor212);
		actorespelicula.add(actor213);
		actorespelicula.add(actor214);
		actorespelicula.add(actor215);
		actorespelicula.add(actor216);
		actorespelicula.add(actor217);

		Peliculas pelicula18 = new Peliculas("El dependiente",1969,"",87,"Después de comprometerse con una chica retraída y bella, el dependiente de una ferretería es presa de la avaricia. Empieza a pensar que su patrón, que no tiene familiares, puede morir en cualquier momento y que, en ese caso, él heredaría el negocio.",0,"imgs/peliculas/el_dependiente-678974693-mmed.jpg","",actorespelicula,director18,null,usuario,genero1, true);

		this.peliculaService.add(pelicula18);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor218);
		actorespelicula.add(actor219);
		actorespelicula.add(actor220);
		actorespelicula.add(actor221);
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
		actorespelicula.add(actor232);

		Peliculas pelicula19 = new Peliculas("Pajarito Gómez (Una vida feliz)",1964,"",83,"&quot;Pajarito&quot; Gómez es un cantante de música popular impulsado por una empresa discográfica. La historia se centra en la vida de Pajarito fuera de los escenarios, cómo se construye su figura pública alimentando el mito del muchacho pobre, provinciano, que por su talento -y siendo al mismo tiempo buen hijo y buen ciudadano- alcanza la fama y la fortuna. Detrás de esta fachada, Pajarito es un hombre oscuro y desorientado, alcohólico, distanciado de su madre.",0,"imgs/peliculas/pajarito_gomez_una_vida_feliz-261162818-mmed.jpg","",actorespelicula,director19,null,usuario,genero1, true);

		this.peliculaService.add(pelicula19);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor233);
		actorespelicula.add(actor234);
		actorespelicula.add(actor235);
		actorespelicula.add(actor236);
		actorespelicula.add(actor237);
		actorespelicula.add(actor238);
		actorespelicula.add(actor239);
		actorespelicula.add(actor240);
		actorespelicula.add(actor241);

		Peliculas pelicula20 = new Peliculas("El lado oscuro del corazón",1992,"",127,"Historia de un poeta treintañero que sobrevive editando poesía comercial mientras recorre Buenos Aires. Lo único que desea es encontrar a la mujer de sus sueños, que le comprenda y que le haga volar... Otra apuesta arriesgada de Subiela de corte poético que obtuvo buenas críticas.",0,"imgs/peliculas/el_lado_oscuro_del_corazon-287528769-mmed.jpg","Ty7Sl7mXDmo",actorespelicula,director20,null,usuario,genero1, true);

		this.peliculaService.add(pelicula20);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor242);
		actorespelicula.add(actor243);
		actorespelicula.add(actor244);
		actorespelicula.add(actor245);
		actorespelicula.add(actor246);
		actorespelicula.add(actor247);
		actorespelicula.add(actor248);
		actorespelicula.add(actor249);
		actorespelicula.add(actor250);
		actorespelicula.add(actor251);
		actorespelicula.add(actor252);
		actorespelicula.add(actor253);
		actorespelicula.add(actor254);

		Peliculas pelicula21 = new Peliculas("Últimos días de la víctima",1982,"",94,"A Mendizábal, un asesino a sueldo, sus anónimos clientes le ordenan un nuevo asesinato. Pero en la persecución, precisa y obsesiva, descubrirá que solo forma parte de un juego que no le pertenece, de una cadena al servicio de intereses mayores.",0,"imgs/peliculas/ultimos_dias_de_la_victima-433328666-mmed.jpg","",actorespelicula,director21,null,usuario,genero0, true);

		this.peliculaService.add(pelicula21);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor255);
		actorespelicula.add(actor256);
		actorespelicula.add(actor257);
		actorespelicula.add(actor258);
		actorespelicula.add(actor259);
		actorespelicula.add(actor260);
		actorespelicula.add(actor261);
		actorespelicula.add(actor262);
		actorespelicula.add(actor263);
		actorespelicula.add(actor264);

		Peliculas pelicula22 = new Peliculas("La tregua",1974,"",108,"Martín Santomé, un viudo con tres hijos, comienza a registrar en un diario íntimo la vida cotidiana y anódina de la oficina y las tensiones de su vida familiar. Un día, a punto de jubilarse, irrumpe en su vida la joven Laura Avellaneda, y Martín descubre que aún está vivo. Superados los temores que les infunde la gran  diferencia de edad que hay entre ellos, se atreven a correr el riesgo de vivir una relación amorosa.",0,"imgs/peliculas/la_tregua-852443382-mmed.jpg","kP36UMv6kps",actorespelicula,director22,null,usuario,genero1, true);

		this.peliculaService.add(pelicula22);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor265);
		actorespelicula.add(actor266);
		actorespelicula.add(actor267);
		actorespelicula.add(actor268);
		actorespelicula.add(actor269);
		actorespelicula.add(actor270);
		actorespelicula.add(actor271);
		actorespelicula.add(actor272);

		Peliculas pelicula23 = new Peliculas("Sol de otoño",1996,"",103,"Clara Goldstein, una mujer madura, que desea relacionarse con un hombre de su edad, publica un anuncio en un periódico, en el que dibuja una estrella de David. Recibe la llamada de un tal Saúl Levín con el que se encuentra en una cafetería céntrica. Él es uruguayo y tiene un taller de marcos para cuadros. Clara es contable en una tienda de telas. Al final del encuentro, Clara descubre que él no es judío y que su nombre verdadero es Raúl Ferraro. Entonces, para evitar problemas con su familia, le propone a Raúl que se haga pasar por judío. Éste es el punto de partida de una tierna relación sentimental.",0,"imgs/peliculas/sol_de_otono-360110699-mmed.jpg","",actorespelicula,director23,null,usuario,genero5, true);

		this.peliculaService.add(pelicula23);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor273);
		actorespelicula.add(actor274);
		actorespelicula.add(actor275);
		actorespelicula.add(actor276);
		actorespelicula.add(actor277);
		actorespelicula.add(actor278);
		actorespelicula.add(actor279);
		actorespelicula.add(actor280);
		actorespelicula.add(actor281);
		actorespelicula.add(actor282);

		Peliculas pelicula24 = new Peliculas("Historias mínimas",2002,"",94,"A miles de kilómetros al sur de Buenos Aires, tres personajes viajan por las solitarias rutas de la Patagonia. Don Justo, un anciano de ochenta años, que es el dueño de un bar de carretera que regenta su hijo, se ha escapado de casa para buscar a su perro desaparecido desde hace tiempo: alguien le ha dicho que lo ha visto en San Julián. A medida que se acerca a esta población, ciertos datos hacen sospechar que las intenciones del anciano van más allá de encontrar al animal: debe resolver ciertos asuntos vitales para poder afrontar la muerte en paz consigo mismo.",0,"imgs/peliculas/historias_minimas-271947435-mmed.jpg","DByCQgPmSRQ",actorespelicula,director24,null,usuario,genero2, true);

		this.peliculaService.add(pelicula24);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor283);
		actorespelicula.add(actor284);
		actorespelicula.add(actor285);
		actorespelicula.add(actor286);
		actorespelicula.add(actor287);
		actorespelicula.add(actor288);
		actorespelicula.add(actor289);
		actorespelicula.add(actor290);
		actorespelicula.add(actor291);
		actorespelicula.add(actor292);
		actorespelicula.add(actor293);
		actorespelicula.add(actor294);
		actorespelicula.add(actor295);
		actorespelicula.add(actor296);
		actorespelicula.add(actor297);

		Peliculas pelicula25 = new Peliculas("Darse cuenta",1984,"",106,"En su película más exitosa, el director Alejandro Doria cuenta la relación profesional y afectiva entre un médico fracasado y un joven enfermo al que la medicina da por muerto. De manera paralela, la película narra los acontecimientos positivos y negativos que transcurren en un hospital público.",0,"imgs/peliculas/darse_cuenta-270352329-mmed.jpg","",actorespelicula,director25,null,usuario,genero1, true);

		this.peliculaService.add(pelicula25);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor298);
		actorespelicula.add(actor299);
		actorespelicula.add(actor300);
		actorespelicula.add(actor301);
		actorespelicula.add(actor302);
		actorespelicula.add(actor303);
		actorespelicula.add(actor304);
		actorespelicula.add(actor305);
		actorespelicula.add(actor306);
		actorespelicula.add(actor307);
		actorespelicula.add(actor308);
		actorespelicula.add(actor309);
		actorespelicula.add(actor310);
		actorespelicula.add(actor311);
		actorespelicula.add(actor312);
		actorespelicula.add(actor313);
		actorespelicula.add(actor314);
		actorespelicula.add(actor315);
		actorespelicula.add(actor316);
		actorespelicula.add(actor317);

		Peliculas pelicula26 = new Peliculas("Quebracho",1974,"",95,"Ambientada hacia 1910 en el Chaco. Muestra la situación de los leñadores del quebracho, cruelmente explotados por los empresarios ingleses, gracias al apoyo de las autoridades, de la policía local y de un cuerpo parapolicial creado por los propios patronos.",0,"imgs/peliculas/quebracho-275824487-mmed.jpg","CNje5ieYdKU",actorespelicula,director26,null,usuario,genero1, true);

		this.peliculaService.add(pelicula26);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor318);
		actorespelicula.add(actor319);
		actorespelicula.add(actor320);
		actorespelicula.add(actor321);
		actorespelicula.add(actor322);
		actorespelicula.add(actor323);
		actorespelicula.add(actor324);
		actorespelicula.add(actor325);
		actorespelicula.add(actor326);
		actorespelicula.add(actor327);
		actorespelicula.add(actor328);
		actorespelicula.add(actor329);
		actorespelicula.add(actor330);
		actorespelicula.add(actor331);
		actorespelicula.add(actor332);

		Peliculas pelicula27 = new Peliculas("Dios se lo pague",1948,"",119,"Una mujer jugadora, Nancy, que ostenta su elegancia para disimular su pobreza mientras espera que un hombre adinerado aparezca y se ocupe de ella, conversa con el viejo que mendiga en la puerta de un casino. Poco después, un pretendiente rico y misterioso le ofrece una vida de lujos, aunque alejada de las convenciones sociales.",0,"imgs/peliculas/dios_se_lo_pague-166367863-mmed.jpg","NUuTEXd5w6A",actorespelicula,director27,null,usuario,genero1, true);

		this.peliculaService.add(pelicula27);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor333);
		actorespelicula.add(actor334);
		actorespelicula.add(actor335);
		actorespelicula.add(actor336);
		actorespelicula.add(actor337);
		actorespelicula.add(actor338);
		actorespelicula.add(actor339);
		actorespelicula.add(actor340);
		actorespelicula.add(actor341);
		actorespelicula.add(actor342);

		Peliculas pelicula28 = new Peliculas("La noche de los lápices",1986,"",106,"En septiembre de 1976, durante los primeros meses de la dictadura militar argentina, siete adolescentes de la ciudad de La Plata son secuestrados, torturados y asesinados a raíz de sus protestas por el aumento del boleto estudiantil. El film relata estos sucesos desde la voz y presencia de uno de los supervivientes.",0,"imgs/peliculas/la_noche_de_los_lapices-239087571-mmed.jpg","Y41L4oZfWrg",actorespelicula,director28,null,usuario,genero1, true);

		this.peliculaService.add(pelicula28);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor343);
		actorespelicula.add(actor344);
		actorespelicula.add(actor345);
		actorespelicula.add(actor346);
		actorespelicula.add(actor347);

		Peliculas pelicula29 = new Peliculas("Garage Olimpo",1999,"",98,"Durante la Dictadura militar, María vive en Buenos Aires con su madre en una gran casa en decadencia. Han alquilado algunas habitaciones, y en una de ellas vive Félix, un joven tímido, enamorado de María, que, al parecer, trabaja de vigilante en un garaje. María enseña a leer ya escribir en un barrio pobre y, además, pertenece a una organización que lucha contra la dictadura militar. Una mañana, unos soldados de paisano la detienen y la llevan al Garage Olimpo, uno de los lugares donde se tortura a los activistas ante la indiferencia o ignorancia general. El encargado del centro elige a uno de sus mejores hombres para hacer el interrogatorio.",0,"imgs/peliculas/garage_olimpo-954615715-mmed.jpg","",actorespelicula,director29,null,usuario,genero1, true);

		this.peliculaService.add(pelicula29);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor348);
		actorespelicula.add(actor349);
		actorespelicula.add(actor350);
		actorespelicula.add(actor351);
		actorespelicula.add(actor352);
		actorespelicula.add(actor353);

		Peliculas pelicula30 = new Peliculas("The Motorcycle Diaries (Diarios de motocicleta)",2004,"",128,"En 1952, siendo el &quot;Che&quot; Guevara (Gael García Bernal) estudiante de medicina, recorrió América del Sur, con su amigo Alberto Granado (Rodrigo de la Serna), en una destartalada moto. Ernesto es un joven estudiante de medicina de 23 años de edad, especializado en lepra. Alberto es un bioquímico de 29 años. Ambos jóvenes emprenden un viaje de descubrimiento de la rica y compleja topografía humana y social del continente hispanoamericano. Los dos dejaron atrás el familiar entorno de Buenos Aires en una desvencijada motocicleta Norton de 500 cc, imbuidos de un romántico espíritu aventurero.",0,"imgs/peliculas/the_motorcycle_diaries_diarios_de_motocicleta-595600383-mmed.jpg","Ygn1lNk_oTg",actorespelicula,director30,null,usuario,genero6, true);

		this.peliculaService.add(pelicula30);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor354);
		actorespelicula.add(actor355);
		actorespelicula.add(actor356);
		actorespelicula.add(actor357);
		actorespelicula.add(actor358);
		actorespelicula.add(actor359);
		actorespelicula.add(actor360);
		actorespelicula.add(actor361);
		actorespelicula.add(actor362);

		Peliculas pelicula31 = new Peliculas("Gilda, no me arrepiento de este amor",2016,"",116,"Esposa, madre y maestra jardinera de Devoto, con 30 años, Myriam Alejandra Bianchi decide cambiar el rumbo de su vida para siempre. Con su dulce voz, Gilda marcó la música tropical y se convirtió en un suceso de popularidad. Cuatro años más tarde, murió trágicamente en una ruta camino a la provincia de Entre Ríos. Su música influenció a artistas de todos los estilos y diferentes generaciones y su figura trascendió fronteras.",0,"imgs/peliculas/gilda_no_me_arrepiento_de_este_amor-142096483-mmed.jpg","5lHR8uqQE2Y",actorespelicula,director31,null,usuario,genero1,true);

		this.peliculaService.add(pelicula31);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor363);
		actorespelicula.add(actor364);
		actorespelicula.add(actor365);

		Peliculas pelicula32 = new Peliculas("Medianeras",2004,"",28,"Buenos Aires es el escenario de esta historia. Mariana y Martín viven historias parecidas, viven soledades parecidas, viven neurosis parecidas, incluso viven en la misma calle, pero no pueden conocerse. Lo mismo que los une es lo que los separa: medianeras.",0,"imgs/peliculas/medianeras-389631888-mmed.jpg","kDj9yoBJ0k8",actorespelicula,director32,null,usuario,genero1, true);

		this.peliculaService.add(pelicula32);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor366);
		actorespelicula.add(actor367);
		actorespelicula.add(actor368);
		actorespelicula.add(actor369);
		actorespelicula.add(actor370);
		actorespelicula.add(actor371);
		actorespelicula.add(actor372);
		actorespelicula.add(actor373);
		actorespelicula.add(actor374);

		Peliculas pelicula33 = new Peliculas("Cenizas del paraíso",1997,"",116,"El juez Makantasis se precipita desde lo alto del edificio que alberga los juzgados. Al mismo tiempo, la joven Ana Muro aparece asesinada. Los tres hijos del juez y el novio de Ana se declaran culpables del asesinato de la chica. La conexión que hay entre ambas muertes tratará de descubrirla la juez Teller.",0,"imgs/peliculas/cenizas_del_paraiso-520141637-mmed.jpg","owCOpUqtvJg",actorespelicula,director33,null,usuario,genero0, true);

		this.peliculaService.add(pelicula33);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor375);
		actorespelicula.add(actor376);
		actorespelicula.add(actor377);
		actorespelicula.add(actor378);
		actorespelicula.add(actor379);

		Peliculas pelicula34 = new Peliculas("Los isleros",1951,"",112,"Leandro y la Carancha son habitantes de las islas del Delta del Paraná y conforman una pareja. Son personas rudas, hechas a la dura lucha por la vida en esos parajes. Tienen un hijo que un día lleva a la casa a una muchacha; la presencia de ella provoca los celos de la Carancha y su actitud conduce a dramáticos conflictivos, rompiendo la armonía.",0,"imgs/peliculas/los_isleros-880543338-mmed.jpg","VOlittxOeno",actorespelicula,director34,null,usuario,genero1, true);

		this.peliculaService.add(pelicula34);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor380);
		actorespelicula.add(actor381);
		actorespelicula.add(actor382);
		actorespelicula.add(actor383);
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
		actorespelicula.add(actor394);
		actorespelicula.add(actor395);
		actorespelicula.add(actor396);
		actorespelicula.add(actor397);
		actorespelicula.add(actor398);
		actorespelicula.add(actor399);
		actorespelicula.add(actor400);
		actorespelicula.add(actor401);
		actorespelicula.add(actor402);
		actorespelicula.add(actor403);

		Peliculas pelicula35 = new Peliculas("Crónica de un niño solo",1965,"",79,"Este clásico del cine argentino nos describe la infancia marginal, a través de un niño solitario, y su vida a medio camino entre su barrio pobre y el reformatorio.",0,"imgs/peliculas/cronica_de_un_nino_solo-920728726-mmed.jpg","lo2xpriZwX4",actorespelicula,director35,null,usuario,genero1, true);

		this.peliculaService.add(pelicula35);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor404);
		actorespelicula.add(actor405);
		actorespelicula.add(actor406);
		actorespelicula.add(actor407);
		actorespelicula.add(actor408);
		actorespelicula.add(actor409);

		Peliculas pelicula36 = new Peliculas("Valentín",2003,"",79,"1969, Buenos Aires. Valentín es un niño de ocho años que vive con su abuela. Su madre desapareció cuando él tenía tres años, y su padre es un bala perdida incapaz de asumir responsabilidad alguna. Valentín es un niño solitario que busca constantemente el amor y el afecto. Su vida transcurre tranquilamente y sólo tiene dos obsesiones: ser astronauta y que su padre lo lleve junto a su madre. Pero su padre no quiere remover el pasado y, además, no deja de decepcionarle presentándole novias horribles, hasta que un día le presenta a Leticia, de la que Valentín se queda inmediatamente prendado.",0,"imgs/peliculas/valentin-676878877-mmed.jpg","U6GNaDYRomo",actorespelicula,director36,null,usuario,genero2, true);

		this.peliculaService.add(pelicula36);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor410);
		actorespelicula.add(actor411);
		actorespelicula.add(actor412);
		actorespelicula.add(actor413);
		actorespelicula.add(actor414);
		actorespelicula.add(actor415);
		actorespelicula.add(actor416);
		actorespelicula.add(actor417);
		actorespelicula.add(actor418);
		actorespelicula.add(actor419);

		Peliculas pelicula37 = new Peliculas("Los tallos amargos",1956,"",90,"La película trata sobre un crimen perfecto y los remordimientos de su autor. Al protagonista, un periodista, le ofrecen hacer un negocio que le dejará dinero fácil estafando gente por correspondencia, en un principio todo parece de ensueño, pero luego comenzarán las sospechas.",0,"imgs/peliculas/los_tallos_amargos-616260302-mmed.jpg","DmC184zkarA",actorespelicula,director37,null,usuario,genero7, true);

		this.peliculaService.add(pelicula37);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor420);
		actorespelicula.add(actor421);
		actorespelicula.add(actor422);
		actorespelicula.add(actor423);
		actorespelicula.add(actor424);
		actorespelicula.add(actor425);
		actorespelicula.add(actor426);
		actorespelicula.add(actor427);
		actorespelicula.add(actor428);
		actorespelicula.add(actor429);

		Peliculas pelicula38 = new Peliculas("Tiempo de valientes",2005,"",110,"Mariano es un psicoanalista que, a raíz de un accidente de tráfico, es condenado a realizar trabajos comunitarios relacionados con su profesión. La tarea que el juez le asigna es la de atender a Alfredo, un inspector de la Policía Federal anímicamente devastado por la infidelidad de su mujer. Mariano tendrá que improvisar sus sesiones de psicoanálisis mientras acompaña a Alfredo en sus investigaciones. Casi sin darse cuenta, se irá sumergiendo en el universo policial hasta el punto de convertirse en una especie de ayudante extraoficial de Alfredo. Juntos tendrán que enfrentarse a inimaginables e inesperados peligros para los que no parecen estar preparados.",0,"imgs/peliculas/tiempo_de_valientes-184418063-mmed.jpg","tEIAEJxuu-w",actorespelicula,director38,null,usuario,genero0, true);

		this.peliculaService.add(pelicula38);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor430);

		Peliculas pelicula39 = new Peliculas("El empleo (The Employment) (S)",2008,"",6,"Un hombre realiza su trayecto habitual hacia el trabajo, inmerso en un sistema en el cual el uso de las personas como objetos es algo cotidiano.",0,"imgs/peliculas/el_empleo_the_employment_s-835189600-mmed.jpg","cxUuU1jwMgM",actorespelicula,director39,null,usuario,genero3, true);

		this.peliculaService.add(pelicula39);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor431);
		actorespelicula.add(actor432);
		actorespelicula.add(actor433);
		actorespelicula.add(actor434);
		actorespelicula.add(actor435);
		actorespelicula.add(actor436);
		actorespelicula.add(actor437);
		actorespelicula.add(actor438);
		actorespelicula.add(actor439);
		actorespelicula.add(actor440);
		actorespelicula.add(actor441);
		actorespelicula.add(actor442);
		actorespelicula.add(actor443);
		actorespelicula.add(actor444);
		actorespelicula.add(actor445);
		actorespelicula.add(actor446);
		actorespelicula.add(actor447);

		Peliculas pelicula40 = new Peliculas("Roma",2004,"",148,"La irrupción del periodista Manuel Cueto en la vida del escritor Joaquín Góñez, a instancias de la editorial para la que Joaquín está escribiendo su último libro, provocará un gran desasosiego en la solitaria vida de este hombre que vive de espaldas al mundo y rehuye sus propios recuerdos. Acostumbrado a la soledad, el encuentro con el joven periodista despertará en él emociones olvidadas que lo transportan a  la época de su niñez y a su locos años de juventud en Buenos Aires: los errores de la inexperiencia, el recuerdo de los amigos, de la lealtad, la influencia del cine y del jazz, el sabor del primer amor, y la íntima relación con sus padres.",0,"imgs/peliculas/roma-681357749-mmed.jpg","aN9eVNpIDcY",actorespelicula,director40,null,usuario,genero1, true);

		this.peliculaService.add(pelicula40);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor448);
		actorespelicula.add(actor449);
		actorespelicula.add(actor450);
		actorespelicula.add(actor451);
		actorespelicula.add(actor452);
		actorespelicula.add(actor453);
		actorespelicula.add(actor454);
		actorespelicula.add(actor455);

		Peliculas pelicula41 = new Peliculas("Las aguas bajan turbias",1952,"",92,"Los hermanos Santos y Rufino Peralta se emplean como trabajadores en los yerbatales del Alto Paraná. Allí se encontrarán con condiciones infrahumanas de trabajo y la codicia de los patrones. Además, Santos se enfrentará con un capataz por el amor de Amelia. La rebelión va madurando, al tiempo que se va gestando la formación de un sindicato de trabajadores.",0,"imgs/peliculas/las_aguas_bajan_turbias-970096260-mmed.jpg","IANnYuwMFdQ",actorespelicula,director41,null,usuario,genero1, true);

		this.peliculaService.add(pelicula41);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor456);
		actorespelicula.add(actor457);
		actorespelicula.add(actor458);
		actorespelicula.add(actor459);
		actorespelicula.add(actor460);
		actorespelicula.add(actor461);
		actorespelicula.add(actor462);

		Peliculas pelicula42 = new Peliculas("El viento",2005,"",100,"El dolor, la culpa y la búsqueda de la felicidad son los ejes de la historia de Frank (Federico Luppi), un campesino de la Patagonia que nunca salió de su pueblo. La muerte de su hija lo llevará hasta Buenos Aires para reencontrarse con su nieta Alina (Antonella Costa).",0,"imgs/peliculas/el_viento-662478617-mmed.jpg","",actorespelicula,director42,null,usuario,genero1, true);

		this.peliculaService.add(pelicula42);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor463);
		actorespelicula.add(actor464);
		actorespelicula.add(actor465);
		actorespelicula.add(actor466);
		actorespelicula.add(actor467);
		actorespelicula.add(actor468);
		actorespelicula.add(actor469);
		actorespelicula.add(actor470);
		actorespelicula.add(actor471);
		actorespelicula.add(actor472);
		actorespelicula.add(actor473);
		actorespelicula.add(actor474);

		Peliculas pelicula43 = new Peliculas("Elsa & Fred",2005,"",106,"Elsa (China Zorrilla), que tiene 82 años, es una mujer llena de vitalidad y con una imaginación desbordante. Alfredo (Manuel Alexandre), algo más joven que ella, ha sido siempre un hombre convencional, serio y responsable. Al quedar viudo, desconcertado y angustiado por la ausencia de su mujer, su hija lo anima a mudarse a un apartamento más pequeño. Es entonces cuando conoce a Elsa, que es vecina suya. A partir de ese momento, ella irrumpe en su vida como un torbellino dispuesta a demostrarle que el tiempo que le queda es precioso y debe disfrutarlo como le plazca.",0,"imgs/peliculas/elsa_fred-138842321-mmed.jpg","9V7tAJgQzbs",actorespelicula,director43,null,usuario,genero5, true);

		this.peliculaService.add(pelicula43);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor475);
		actorespelicula.add(actor476);
		actorespelicula.add(actor477);
		actorespelicula.add(actor478);
		actorespelicula.add(actor479);
		actorespelicula.add(actor480);
		actorespelicula.add(actor481);
		actorespelicula.add(actor482);
		actorespelicula.add(actor483);
		actorespelicula.add(actor484);
		actorespelicula.add(actor485);
		actorespelicula.add(actor486);
		actorespelicula.add(actor487);
		actorespelicula.add(actor488);

		Peliculas pelicula44 = new Peliculas("Crónica de una fuga",2006,"",103,"En 1977, durante el horror de la última dictadura militar argentina, un grupo de tareas secuestra a Claudio Tamburrini, arquero de un equipo de fútbol de la &quot;B&quot;, y lo traslada al centro Mansión Seré: una vieja y aristocrática casona ubicada en el barrio de Morón, en Buenos Aires. Allí, Claudio conoce a Guillermo, el Vasco y el Gallego. Durante cuatro meses de cautiverio en ese lugar que se asemeja a un manicomio carente de reglas, los jóvenes son torturados sistemáticamente. Muchos perdieron la vida, pero hubo quienes lograron sobrevivir...",0,"imgs/peliculas/cronica_de_una_fuga-482772517-mmed.jpg","MRKjxiKGuKk",actorespelicula,director44,null,usuario,genero0, true);

		this.peliculaService.add(pelicula44);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor489);
		actorespelicula.add(actor490);
		actorespelicula.add(actor491);
		actorespelicula.add(actor492);
		actorespelicula.add(actor493);
		actorespelicula.add(actor494);
		actorespelicula.add(actor495);
		actorespelicula.add(actor496);
		actorespelicula.add(actor497);
		actorespelicula.add(actor498);

		Peliculas pelicula45 = new Peliculas("Juan Moreira",1973,"",102,"El gaucho Juan Moreira es encarcelado por reclamar lo que le correspondía. Al ser liberado toma justicia por mano propia y signa definitivamente su destino: persecuciones y muertes. Se suma a las huestes de Alsina y entra en la política de comité. Traicionado se pasa al bando del general Mitre. En medio de estas luchas políticas, del fraude y de las traiciones, librado a su suerte, sólo le quedará una única opción.",0,"imgs/peliculas/juan_moreira-916178084-mmed.jpg","",actorespelicula,director45,null,usuario,genero1, true);

		this.peliculaService.add(pelicula45);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor499);
		actorespelicula.add(actor500);
		actorespelicula.add(actor501);
		actorespelicula.add(actor502);
		actorespelicula.add(actor503);
		actorespelicula.add(actor504);

		Peliculas pelicula46 = new Peliculas("Los inundados",1962,"",87,"Narra la historia de una familia de pocos recursos, habitantes del sur de la provincia de Santa Fe, que se ve forzada a mudarse a un vagón abandonado del ferrocarril hasta que bajen las aguas del río Salado.",0,"imgs/peliculas/los_inundados-547434603-mmed.jpg","",actorespelicula,director46,null,usuario,genero1, false);

		this.peliculaService.add(pelicula46);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor505);
		actorespelicula.add(actor506);
		actorespelicula.add(actor507);
		actorespelicula.add(actor508);
		actorespelicula.add(actor509);
		actorespelicula.add(actor510);
		actorespelicula.add(actor511);

		Peliculas pelicula47 = new Peliculas("El exilio de Gardel (Tangos)",1985,"",120,"Narra cómo un grupo de exiliados argentinos montan en París un número musical para &quot;curar&quot; su nostalgia tanguera.",0,"imgs/peliculas/el_exilio_de_gardel_tangos-240224504-mmed.jpg","Z995mGACUKw",actorespelicula,director47,null,usuario,genero1, false);

		this.peliculaService.add(pelicula47);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor512);
		actorespelicula.add(actor513);
		actorespelicula.add(actor514);
		actorespelicula.add(actor515);
		actorespelicula.add(actor516);
		actorespelicula.add(actor517);

		Peliculas pelicula48 = new Peliculas("El perro",2004,"",95,"Coco ha trabajado toda su vida en una estación de servicio, pero cuando ésta se vende, se queda sin trabajo. Desocupado y sin muchas expectativas, sobrevive intentando vender cuchillos artesanales que él mismo fabrica. Un excelente perro dogo de pura raza acabará convirtiéndose no sólo en su amigo, sino en la única esperanza de una vida mejor...",0,"imgs/peliculas/el_perro-585897928-mmed.jpg","",actorespelicula,director48,null,usuario,genero1, false);

		this.peliculaService.add(pelicula48);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor518);
		actorespelicula.add(actor519);
		actorespelicula.add(actor520);
		actorespelicula.add(actor521);
		actorespelicula.add(actor522);
		actorespelicula.add(actor523);
		actorespelicula.add(actor524);
		actorespelicula.add(actor525);
		actorespelicula.add(actor526);

		Peliculas pelicula49 = new Peliculas("Este es el romance del Aniceto y la Francisca, de cómo quedó trunco, comenzó la tristeza y unas pocas cosas más...",1966,"",63,"Es la historia de una seducción y enamoramiento entre dos personas de pueblo, en la provincia de Mendoza: Aniceto (Federico Luppi) y Francisca (Elsa Daniel), una chica decente y dulce, &quot;la santita&quot; del Aniceto. Pero el Aniceto también seduce a Lucía (María Vaner), apasionada y sexual, &quot;la putita&quot; del Aniceto. Cuando el romance se rompe, el Aniceto comienza a darse cuenta de lo que perdió.",0,"imgs/peliculas/este_es_el_romance_del_aniceto_y_la_francisca_de_como_quedo_trunco_comenzo_la_tristeza_y_unas_pocas_cosas_mas-220256368-mmed.jpg","UgRNW3Z3OLU",actorespelicula,director49,null,usuario,genero1, false);

		this.peliculaService.add(pelicula49);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor527);
		actorespelicula.add(actor528);
		actorespelicula.add(actor529);
		actorespelicula.add(actor530);
		actorespelicula.add(actor531);
		actorespelicula.add(actor532);
		actorespelicula.add(actor533);
		actorespelicula.add(actor534);
		actorespelicula.add(actor535);
		actorespelicula.add(actor536);
		actorespelicula.add(actor537);
		actorespelicula.add(actor538);
		actorespelicula.add(actor539);

		Peliculas pelicula50 = new Peliculas("La parte del León",1978,"",85,"Historia de un hombre común y corriente que, por casualidad, toma posesión del dinero que fue robado de un banco, creyendo que así podrá solucionar todos sus problemas.",0,"imgs/peliculas/la_parte_del_leon-998120172-mmed.jpg","",actorespelicula,director50,null,usuario,genero0, false);

		this.peliculaService.add(pelicula50);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor540);
		actorespelicula.add(actor541);
		actorespelicula.add(actor542);
		actorespelicula.add(actor543);
		actorespelicula.add(actor544);
		actorespelicula.add(actor545);
		actorespelicula.add(actor546);

		Peliculas pelicula51 = new Peliculas("Conversaciones con mamá",2004,"",86,"Mamá tiene ochenta y dos años y su hijo Jaime, cincuenta. Ambos viven en mundos muy diferentes. Jaime tiene mujer, dos hijos, una hermosa casa, dos coches y una suegra que atender. Mamá se las arregla sola y sobrelleva su vejez con dignidad. Pero un día ocurre lo inesperado; la empresa para la que trabaja Jaime lo deja en la calle por razones de reajuste de personal. La lamentable situación lo lleva a decisiones drásticas porque no puede mantener su tren de vida.",0,"imgs/peliculas/conversaciones_con_mama-746286734-mmed.jpg","fyuxYGiRwLE",actorespelicula,director51,null,usuario,genero1, false);

		this.peliculaService.add(pelicula51);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor547);
		actorespelicula.add(actor548);
		actorespelicula.add(actor549);
		actorespelicula.add(actor550);
		actorespelicula.add(actor551);
		actorespelicula.add(actor552);
		actorespelicula.add(actor553);
		actorespelicula.add(actor554);
		actorespelicula.add(actor555);

		Peliculas pelicula52 = new Peliculas("Un oso rojo",2002,"",94,"Aunque solo Oso lleva la cuenta, han pasado siete años desde que cayó preso por homicidio y robo a mano armada. Es un hombre parco, impredecible, violento por naturaleza o por necesidad, y es probable que en todos estos años no le haya dicho a nadie lo que oculta en sus silencios y la tristeza de su mirada. Ahora, mientras sale a la calle en libertad condicional, Oso piensa que tal vez pueda volver a empezar. El Turco le debe todavía su parte del asalto, y a través de un compañero de celda contacta con Güemes, que lo emplea como chofer en su agencia de taxis.",0,"imgs/peliculas/un_oso_rojo-935007009-mmed.jpg","NX4Yx-ZwrPk",actorespelicula,director52,null,usuario,genero1, false);

		this.peliculaService.add(pelicula52);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor556);
		actorespelicula.add(actor557);
		actorespelicula.add(actor558);
		actorespelicula.add(actor559);
		actorespelicula.add(actor560);
		actorespelicula.add(actor561);
		actorespelicula.add(actor562);

		Peliculas pelicula53 = new Peliculas("Felicidades",2000,"",100,"Es Nochebuena en Argentina. Un escritor famoso que no es feliz y que decide viajar al encuentro de su amada; un médico que quiere ligar con una española, y un odontólogo loco por encontrar el juguete que su hijo quiere de regalo. Una ácida visión sobre la otra cara de la navidad, donde la clase media insiste en sostener una celebración que ya ha perdido su naturaleza. Todos la festejan, pero se centra en los que quedan fuera: los protagonistas, que transitan en un mundo al revés, un mundo en el que irónicamente los justicieros se vuelven delincuentes y los nobles, miserables.",0,"imgs/peliculas/felicidades-440056730-mmed.jpg","",actorespelicula,director53,null,usuario,genero1, false);

		this.peliculaService.add(pelicula53);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor563);
		actorespelicula.add(actor564);
		actorespelicula.add(actor565);
		actorespelicula.add(actor566);
		actorespelicula.add(actor567);
		actorespelicula.add(actor568);
		actorespelicula.add(actor569);

		Peliculas pelicula54 = new Peliculas("Anita",2009,"",104,"Cuenta la historia de Anita, una joven con Síndrome de Down que, el día del atentado a la AMIA, el 18 de julio de 1994, aturdida por la gran explosión, se pierde en la gran ciudad. Anita es una mujer-niña. Tiene casi 35 años y vive con su madre Dora en pleno barrio del Once. Dora es su conexión con el mundo. Anita vive ligada a Dora, y Dora a su hija. Cuando el 18 de julio se produce el atentado a la mutual AMIA, su vida cambia para siempre. Anita no entiende qué ha pasado, sólo recuerda que su madre salió a hacer un tramite y, de pronto, la tierra empezó a temblar. Asustada por el ruido, decide salir de su casa y se pierde en la gran ciudad para comenzar una larga odisea. (FILMAFFINTIY)",0,"imgs/peliculas/anita-160516467-mmed.jpg","aG-ZVuOGxWk",actorespelicula,director54,null,usuario,genero1, false);

		this.peliculaService.add(pelicula54);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor570);
		actorespelicula.add(actor571);
		actorespelicula.add(actor572);
		actorespelicula.add(actor573);
		actorespelicula.add(actor574);
		actorespelicula.add(actor575);
		actorespelicula.add(actor576);
		actorespelicula.add(actor577);
		actorespelicula.add(actor578);
		actorespelicula.add(actor579);
		actorespelicula.add(actor580);
		actorespelicula.add(actor581);
		actorespelicula.add(actor582);
		actorespelicula.add(actor583);
		actorespelicula.add(actor584);
		actorespelicula.add(actor585);
		actorespelicula.add(actor586);
		actorespelicula.add(actor587);

		Peliculas pelicula55 = new Peliculas("Kamchatka",2002,"",104,"Los difíciles años de la dictadura militar argentina son contemplados por Harry, un niño de diez años que lo único que desea es jugar y hacer travesuras con su hermano pequeño. Sin embargo, en 1976, cuando su familia, perseguida por la dictadura, se ve obligada a esconderse en el campo, comienza para él una nueva vida que pondrá fin a su infancia.",0,"imgs/peliculas/kamchatka-239998952-mmed.jpg","JkAWI_fS7Pc",actorespelicula,director55,null,usuario,genero1, false);

		this.peliculaService.add(pelicula55);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor588);
		actorespelicula.add(actor589);
		actorespelicula.add(actor590);
		actorespelicula.add(actor591);
		actorespelicula.add(actor592);
		actorespelicula.add(actor593);
		actorespelicula.add(actor594);
		actorespelicula.add(actor595);
		actorespelicula.add(actor596);
		actorespelicula.add(actor597);
		actorespelicula.add(actor598);
		actorespelicula.add(actor599);
		actorespelicula.add(actor600);
		actorespelicula.add(actor601);

		Peliculas pelicula56 = new Peliculas("Camila",1984,"",107,"Un filme basado en hechos reales que narra la historia de amor que mantuvieron, en el siglo XIX, la aristócrata Camila O'Gorman y el sacerdote Ladislao Gutiérrez. Una relación que provocó el escándalo entre la iglesia y la sociedad de la época.",0,"imgs/peliculas/camila-502418258-mmed.jpg","",actorespelicula,director56,null,usuario,genero1, false);

		this.peliculaService.add(pelicula56);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor602);
		actorespelicula.add(actor603);
		actorespelicula.add(actor604);
		actorespelicula.add(actor605);
		actorespelicula.add(actor606);
		actorespelicula.add(actor607);
		actorespelicula.add(actor608);
		actorespelicula.add(actor609);
		actorespelicula.add(actor610);

		Peliculas pelicula57 = new Peliculas("Caballos salvajes",1995,"",92,"José, que ya tiene setenta años y cree saber cómo y por qué vale la pena jugarse la vida, conoce a un joven de 23, convencido de que ya está haciendo lo que debe hacer. Aunque nada parece unirlos, a partir del momento en que se conocen ya nada puede separarlos. A ellos se une Ana, una chica sin rumbo ni ilusiones. Los tres se sienten amenazados y perseguidos por gente que querría eliminarlos.",0,"imgs/peliculas/caballos_salvajes-718245719-mmed.jpg","",actorespelicula,director57,null,usuario,genero1, false);

		this.peliculaService.add(pelicula57);

		/*actores en esta pelicula*/
		actorespelicula = new ArrayList<Actores>();
		actorespelicula.add(actor611);
		actorespelicula.add(actor612);
		actorespelicula.add(actor613);
		actorespelicula.add(actor614);
		actorespelicula.add(actor615);
		actorespelicula.add(actor616);
		actorespelicula.add(actor617);

		Peliculas pelicula58 = new Peliculas("Bolivia",2001,"",82,"Freddy emigra a Buenos Aires en busca de una vida más próspera. En su país natal, Bolivia, deja a su familia. Sin embargo, la capital argentina no es el paraíso que Freddy soñó, y mucho menos para los emigrantes ilegales como él. Pese a ello, consigue trabajo como cocinero en un restaurante. Un aclamado filme de bajo presupuesto premiado en varios festivales.",0,"imgs/peliculas/bolivia-933387574-mmed.jpg","V31tISIoLsg",actorespelicula,director58,null,usuario,genero1, false);

		this.peliculaService.add(pelicula58);

	}
	

}
