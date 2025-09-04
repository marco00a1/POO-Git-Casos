# GUIA de creacion local - Java and Git

mkdir POO-Git-Casos                       ----> crear carpeta local.
cd POO-Git-Casos                          ----> ingresamos a la carpeta.
git init                                  ----> iniciamos git.
git status                                ----> ver estado actual
git log                                   ----> ver historial de commits
mkdir caso1 caso2 caso3                   ----> creamos las carpetas con los casos.
touch guia_git.md README.md               ----> creamos el archivo .md para la informacion del proyecto.
touch caso1/UsuarioSimple.java            ----> creamos el archivo para el primer caso.
touch caso2/EstudianteInteractivo.java    ----> creamos el archivo para el segundo caso.
touch caso3/CuentaBancaria.java           ----> creamos el archivo para el tercer caso.
git add .											----> prepara todos los cambios
git commit -m "POO-casos 1 al 3"				----> crea un commit del cambio
git branch POO-casos							----> crea una nueva rama llamada POO-casos
git checkout POO-casos							----> cambiamos a la rama POO-casos
git checkout master								----> denuevo cambiamos a la rama principal
git merge POO-casos								----> unimos la rama POO-casos dentro de la rama (master)
git remote add origin https://github.com/marco00a1/POO-Git-Casos.git	----> conecta tu repo local con el repo en GitHub
git push -u origin master						----> sube los commits de la rama master a GitHub.
git branch											----> lista todas las ramas existentes
git branch -M master							----> renombra tu rama actual hacia master(rama actual)
git remote add origin https://github.com/marco00a1/POO-Git-Casos.git	----> trate de conectarme por otro commit
git push -u origin master						----> sube los commits de la rama master a GitHub.
git add .											----> prepara todos los cambios
git commit -m "Se subio el repo local"		----> crea un commit del cambio
git push											----> sube tus commits al remoto (ya no necesitas -u origin master porque quedó configurado).
git status											----> muestra el estado actual,Archivos modificados,Archivos listos para commit.
git log												----> muestra el historial de commits con fecha, autor y mensaje.





# fin guia de creacion local