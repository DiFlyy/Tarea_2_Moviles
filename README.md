🎵 Pop Music Explorer

Aplicación Android desarrollada en Kotlin que permite explorar la música pop de diferentes décadas de manera jerárquica e inmersiva.

📋 Descripción

La aplicación Pop Music Explorer ofrece un recorrido interactivo a través de la música pop en distintas épocas:

Selección de década → El usuario elige entre los años 80s y 2010s.

Selección de artista → Cada década presenta dos artistas representativos con su imagen.

Selección de hits → Al elegir un artista, se muestran dos canciones icónicas. Al presionar sobre cada una, aparece información interesante (trivia) mediante un Snackbar.

🗂️ Estructura jerárquica

DecadesActivity → Pantalla principal con dos décadas.

ArtistsActivity → Lista de artistas por década, mostrados con imagen circular y nombre.

HitsActivity → Canciones del artista seleccionado, mostradas como botones de texto.

🎨 Diseño visual

Cada pantalla tiene un fondo de color distinto (bg_decades, bg_artists, bg_hits).

Las décadas y artistas usan íconos circulares con imágenes personalizadas.

Se incluyó un título en la pantalla principal: "Pop Music Explorer".

Las transiciones entre Activities usan animaciones (slide_in_left, slide_out_right, fade_in, fade_out).

✅ Requisitos técnicos cumplidos

Tres Activities jerárquicas: Décadas → Artistas → Hits.

Fragments opcionales no fueron requeridos, pero se dejó lista la estructura para extender.

ViewBinding activado en Gradle para un manejo seguro de vistas.

Snackbar utilizado para mostrar trivia de cada hit.

Código limpio y comentado.

🚀 Instrucciones de ejecución

Clonar el repositorio en Android Studio:

git clone https://github.com/usuario/Tarea_2_Moviles.git


Abrir el proyecto en Android Studio.

Sincronizar con Gradle (Sync Project with Gradle Files).

Ejecutar en un emulador o dispositivo físico con Android 7.0 (API 24) o superior.

⚙️ Decisiones de diseño

Se eligió trabajar con dos décadas (80s y 2010s) para mantener la aplicación sencilla y visual.

Se implementaron imágenes circulares usando ShapeableImageView de Material Components.

Se redujo la selección a dos artistas por década y dos canciones por artista para simplificar la navegación.

Los fondos de cada pantalla diferencian visualmente los niveles jerárquicos.

🧩 Retos y soluciones

Problema con Gradle y Kotlin DSL → Se corrigió la configuración de plugins y jvmTarget para evitar errores de compilación.

Errores de android:exported → Se solucionó configurando explícitamente las Activities en AndroidManifest.xml.

Colores duplicados en colors.xml → Se revisó y limpiaron las definiciones repetidas.

Recursos faltantes → Se agregaron drawable de prueba (ic_artist1, ic_artist2) y fondos de color personalizados.

📸 Capturas de pantalla

(pendiente de agregar desde el emulador)

Pantalla de Décadas

Pantalla de Artistas

Pantalla de Hits
