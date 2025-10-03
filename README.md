🎵 Pop Music Explorer

Aplicación Android desarrollada como práctica académica.
El objetivo es explorar la música pop por décadas, navegando desde décadas → artistas → hits, con un diseño visual atractivo y transiciones animadas.

📱 Características principales

Jerarquía de navegación en tres niveles:

Selección de década (80s o 2010s).

Selección de artista dentro de la década.

Visualización de los hits más representativos del artista.

Interfaz personalizada con imágenes, íconos circulares y colores temáticos.

Transiciones animadas entre pantallas para mejorar la experiencia de usuario.

Compatibilidad con tema claro y oscuro gracias a la implementación de SharedPreferences.

⚙️ Requisitos técnicos

Android Studio (versión recomendada: Hedgehog 2023.1.1 o superior).

Kotlin como lenguaje principal.

Librerías de AndroidX y Material Design.

🚀 Ejecución del proyecto

1.Clona este repositorio:
git clone https://github.com/tu_usuario/Tarea3-PopMusicExplorer.git

2.Ábrelo en Android Studio.
3.Sincroniza Gradle (Sync Project with Gradle Files).
4.Ejecuta la app en un emulador o dispositivo físico con Android 8.0 (API 26) o superior.

Implementación de Temas con SharedPreferences

En esta nueva versión, se añadió la opción para cambiar entre tema claro y oscuro y que la elección persista entre sesiones.

🔧 ¿Cómo se implementó?

Se definieron dos temas en themes.xml:

Theme.PopMusic.Light (tema claro).

Theme.PopMusic.Dark (tema oscuro).

Se agregó un SwitchCompat en la pantalla principal (DecadesActivity) que permite alternar el tema.

Se utiliza SharedPreferences para guardar la elección del usuario bajo la clave isDarkMode.

Al iniciar cualquier Activity, se aplica el tema correspondiente antes de inflar la UI, garantizando coherencia en toda la aplicación.

📖 Uso del selector de tema

Abre la aplicación.

En la pantalla principal (Decades), activa el switch de "Modo oscuro".

El tema se aplicará de inmediato y quedará guardado incluso al cerrar y volver a abrir la app.

📷 Capturas de pantalla
Tema Claro
![Screenshot_20251002-224345](https://github.com/user-attachments/assets/50460b1f-8690-4b7e-9f73-418e6ac04776)
![Screenshot_20251002-224352](https://github.com/user-attachments/assets/6c318592-6f4f-4ab1-98a8-674abdfae7d5)
![Screenshot_20251002-224357](https://github.com/user-attachments/assets/ecdf41d3-11d3-45e3-bfba-b93b280132fc)

Tema Oscuro
![Screenshot_20251002-224406](https://github.com/user-attachments/assets/71dd72ac-cd19-4ceb-881e-41eb358a3fb5)
![Screenshot_20251002-224410](https://github.com/user-attachments/assets/816e1785-f00a-41d2-9657-9d309eff865e)
![Screenshot_20251002-224417](https://github.com/user-attachments/assets/e0e4fcb5-c112-49e9-ac0f-bde7ef4681da)


🛠️ Retos y soluciones

Problema: Los colores no cambiaban al alternar el switch.

✅ Solución: Se reemplazaron los colores fijos en XML (@android:color/white) por atributos dinámicos (?attr/colorOnSurface).

Problema: El círculo de imágenes no se aplicaba correctamente.

✅ Solución: Se utilizó ShapeableImageView de Material Design con app:shapeAppearanceOverlay.

Problema: Conflictos de recursos (duplicate styles, attr not found).

✅ Solución: Limpieza de styles.xml y unificación de definiciones en themes.xml.
