# Programa4.0Egg
Trabajos del programa 4.0 Egg para practicar con Java, GIT y conexiones de bases de datos.

# ¿Como encontrar los archivos Java si no los quiero descargar?
Tendras que ir a la carpeta de alguna de las fechas de los encuentros que contiene los ejercicios y de ahi seleccionar los ejercicios comunes o extras
Luego te toparas con una carpeta que tiene de nombre src/ y con algun nombre de mas al lado del "/" y finalmente encontraras los archivos .java, los cuales podras leer desde la pagina de github cuando los clickeas.

# ¿Como leo los archivos UML? (GUIA SOLO PARA LOS QUE USEN JAVA NETBEANS)
https://www.youtube.com/watch?v=OhIqmXdcPIg

# AVISO
Apartir de la actividad 13, es necesario conocimientos de manejo de bases de datos y consultas con SQL.
PD: La conexion esta hecha con MYSQL, tendran que descargar el driver de JDBC incluido en la carpeta (Una vez descargado debe ser ubicado en
C:\Program Files\NetBeans (Numero de version)\ide\modules\ext), tambien van a tener que ejecutar un script en el workbench de mysql para crear una contraseña de MYSQL asi el driver puede obtener acceso a la base de datos (SCRIPT ALTER USER MYSQL) y una de base de datos para trabajar con los ejercicios.

# NUEVO AVISO
Si llegaste a la actividad 14, es probable que tengas que configurar el proyecto para incluir las librerias de Eclipse Link (2.0...) y incluir el JDBC driver, de otra forma no funcionara, ademas si tienes problemas de compatibilidad con tu JDK, lo mejor sera que vayas actualizando tu netbeans para conseguir las versiones mas actuales de EclipseLink (2.2).
Para trabajar en esta parte tendras que ir a MysqlWorkbench, crear un script sql para crear una base de datos vacia llamada Libreria, y luego dejas que el programa haga el mapeo y deberian de estar rellenadas con sus respectivas tablas sin tener que hacer ningun script sql.
