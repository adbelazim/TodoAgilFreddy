Este es el proyecto de freddy con las modificaciones necesarias para que pueda correr en sus computadores.
Recuerden que igual deben hacer el pool de conexión, el jdbc resoruce y configurar la seguridad dentro del glassfish.
Para hacer deploy del proyecto deben hacer estos pasos
	1.- entrar a carpeta TrelloJava por terminal y ejecutar
		mvn clean install
	2.- entrar a carpeta KanbanizeJava por terminal y ejecutar
		mvn clean install
	3.- entrar a carpeta TodoAgil
		entrar a carpeta TodoAgil-ejb
			mvn clean install
		entrar a carpeta TodoAgil-web
			mvn clean install
		entrar a carpeta TodoAgil-ear
			mvn clean install
			mvn glassfish:deploy
La dirección de la aplicación es http://localhost:8080/TodoAgil-web/
