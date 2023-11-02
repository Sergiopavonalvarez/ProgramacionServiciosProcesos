import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Correo c1 = new Correo(1, "Jose@gmail.com", "pikachu@gmail.com", "importante", "Etc...etc...");
		Correo c2 = new Correo(2, "Maria@gmail.com", "Carlos123@gmail.com", "urgente", "Contenido del mensaje...");
		Correo c3 = new Correo(3, "Laura@gmail.com", "Pedro456@gmail.com", "reunión", "Mensaje sobre la reunión...");
		Correo c4 = new Correo(4, "Elena@gmail.com", "Juan789@gmail.com", "información", "Detalles importantes...");
		Correo c5 = new Correo(5, "Sara@gmail.com", "Luis22@gmail.com", "aviso", "Aviso de última hora...");
		Correo c6 = new Correo(6, "Ana@gmail.com", "Miguel321@gmail.com", "recordatorio", "Recordatorio de la cita...");
		Correo c7 = new Correo(7, "David@gmail.com", "Isabel@gmail.com", "solicitud", "Solicitud de información...");
		Correo c8 = new Correo(8, "Carmen@gmail.com", "Manuel99@gmail.com", "confirmación",
				"Confirmación de la reserva...");
		Correo c9 = new Correo(9, "Luisa@gmail.com", "Javier7@gmail.com", "consulta", "Consulta sobre el proyecto...");
		Correo c10 = new Correo(10, "Carlos@gmail.com", "Ana5@gmail.com", "pedido", "Detalles del pedido...");
		Correo c11 = new Correo(11, "Raúl@gmail.com", "Eva@gmail.com", "factura", "Adjunto la factura...");
		Correo c12 = new Correo(12, "Laura@gmail.com", "Marcos123@gmail.com", "confirmación", "Confirmo la reserva...");
		Correo c13 = new Correo(13, "Marta@gmail.com", "pikachu@gmail.com", "reunión", "Recordatorio de la reunión...");
		Correo c14 = new Correo(14, "Cristina@gmail.com", "Carlos7@gmail.com", "información",
				"Información adicional...");
		Correo c15 = new Correo(15, "Ricardo@gmail.com", "Elena22@gmail.com", "aviso", "Aviso importante...");
		Correo c16 = new Correo(16, "Silvia@gmail.com", "Luisa99@gmail.com", "invitación", "Invitación a evento...");
		Correo c17 = new Correo(17, "Héctor@gmail.com", "Carolina3@gmail.com", "solicitud",
				"Solicitud de presupuesto...");
		Correo c18 = new Correo(18, "Gonzalo@gmail.com", "Isabel2@gmail.com", "felicitación",
				"Felicitaciones por el logro...");
		Correo c19 = new Correo(19, "Patricia@gmail.com", "Sergio10@gmail.com", "seguimiento",
				"Seguimiento del proyecto...");
		Correo c20 = new Correo(20, "Lorena@gmail.com", "Jorge88@gmail.com", "novedades", "Novedades de la empresa...");
		Correo c21 = new Correo(21, "Adrián@gmail.com", "Lara@gmail.com", "oferta", "Oferta especial...");
		Correo c22 = new Correo(22, "Rosa@gmail.com", "Daniel1@gmail.com", "recordatorio",
				"Recordatorio de cita médica...");
		Correo c23 = new Correo(23, "Víctor@gmail.com", "María56@gmail.com", "propuesta", "Propuesta de negocio...");
		Correo c24 = new Correo(24, "Sergio@gmail.com", "Sandra4@gmail.com", "instructivo",
				"Instrucciones para la instalación...");
		Correo c25 = new Correo(25, "Natalia@gmail.com", "pikachu@gmail.com", "comentarios",
				"Comentarios sobre el proyecto...");
		Correo c26 = new Correo(26, "Ángela@gmail.com", "Luis11@gmail.com", "reclamación",
				"Reclamación sobre el producto...");
		Correo c27 = new Correo(27, "César@gmail.com", "Alicia99@gmail.com", "agenda", "Actualización de la agenda...");
		Correo c28 = new Correo(28, "Fernando@gmail.com", "Marina8@gmail.com", "cita", "Confirmación de la cita...");
		Correo c29 = new Correo(29, "Eduardo@gmail.com", "Lucía1@gmail.com", "reserva", "Reserva de hotel...");
		Correo c30 = new Correo(30, "Beatriz@gmail.com", "Alejandro2@gmail.com", "anuncio", "Anuncio importante...");

		Correo[] correos = new Correo[] { c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17,
				c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28, c29, c30 };

		Buffer cola = new Buffer();
		ProductorCorreo p1 = new ProductorCorreo("Productor Alan", cola);
		ProductorCorreo p2 = new ProductorCorreo("Productor Parson", cola);
		ProductorCorreo p3 = new ProductorCorreo("Productor Ricardo", cola);

		for (int i = 0; i < 10; i++) {

			p1.addCorreo(correos[i]);
			p2.addCorreo(correos[i + 10]);
			p3.addCorreo(correos[i + 20]);

		}

		ConsumidorCorreo con1 = new ConsumidorCorreo("Consumidor Pepe", cola);
		ConsumidorCorreo con2 = new ConsumidorCorreo("Consumidor Johnny", cola);

		p1.start();
		p2.start();
		p3.start();

		con1.start();
		con2.start();

	}

}
