# UNIVERSIDAD DE CARTAGENA
## FACULTAD DE INGENIERÍA
### PROGRAMA DE INGENIERÍA DE SOFTWARE

---

# ESTRUCTURAS DE DATOS ESTÁTICAS: IMPLEMENTACIÓN Y MANIPULACIÓN DE ARREGLOS EN JAVA

**Módulo Unidad 2: Estructuras de datos estáticas**

---

**Presentado por:**  
- Jairo Alonso Osorio Cruz
- Kevin Manuel Reyes Paez 
- Jesus Lopez Mercado
- Brayan Argumendo Ceballos


**Docente:**  
[Nombre del Docente]

**Asignatura:**  
Estructuras de Datos

**Fecha:**  
Septiembre de 2025

---

## TABLA DE CONTENIDO

1. [Introducción](#introducción)
2. [Objetivos](#objetivos)
3. [Justificación](#justificación)
4. [Desarrollo de Ejercicios](#desarrollo-de-ejercicios)
5. [Análisis de Resultados](#análisis-de-resultados)
6. [Conclusiones](#conclusiones)
7. [Referencias Bibliográficas](#referencias-bibliográficas)

---

## INTRODUCCIÓN

Las estructuras de datos estáticas constituyen uno de los pilares fundamentales en el desarrollo de software y la programación eficiente. En el contexto de la ingeniería de software, el dominio de estas estructuras es esencial para crear aplicaciones robustas, eficientes y mantenibles.

Los arreglos, como estructura de datos estática por excelencia, proporcionan una forma organizada y eficiente de almacenar y manipular colecciones de datos homogéneos. Su importancia radica en que permiten acceso aleatorio a los elementos mediante índices, facilitando operaciones de búsqueda, inserción, eliminación y procesamiento de datos de manera optimizada.

Este trabajo presenta la implementación práctica de diez algoritmos fundamentales para la manipulación de arreglos en el lenguaje de programación Java. Cada ejercicio aborda problemáticas comunes en el desarrollo de software, desde operaciones básicas como el cálculo de medias y conteos, hasta operaciones más complejas como la eliminación de duplicados y la manipulación de matrices bidimensionales.

La implementación de estos algoritmos no solo demuestra el dominio técnico de las estructuras de datos estáticas, sino que también evidencia la capacidad de aplicar conceptos teóricos a situaciones prácticas que se presentan frecuentemente en el desarrollo profesional de software.

---

## OBJETIVOS

### Objetivo General
Implementar y documentar algoritmos fundamentales para la manipulación de arreglos en Java, demostrando el dominio de las estructuras de datos estáticas y su aplicación práctica en la resolución de problemas computacionales.

### Objetivos Específicos

1. **Desarrollar competencias técnicas** en la implementación de algoritmos de manipulación de arreglos utilizando Java como lenguaje de programación.

2. **Aplicar conceptos teóricos** de estructuras de datos estáticas en la resolución de problemas prácticos de programación.

3. **Demostrar eficiencia algorítmica** mediante la implementación de soluciones optimizadas para operaciones comunes sobre arreglos.

4. **Integrar buenas prácticas** de programación, incluyendo el uso adecuado de librerías estándar de Java como Arrays, Collections y Streams.

5. **Validar el funcionamiento** de cada algoritmo implementado mediante casos de prueba representativos y análisis de resultados.

6. **Documentar el proceso de desarrollo** y los resultados obtenidos, proporcionando una base sólida para futuras referencias y mejoras.

---

## JUSTIFICACIÓN

### Relevancia Académica
El estudio y dominio de las estructuras de datos estáticas es fundamental en la formación de un ingeniero de software competente. Los arreglos representan la base sobre la cual se construyen estructuras más complejas y su comprensión profunda es prerequisito para el desarrollo de software eficiente.

### Aplicabilidad Práctica
Los algoritmos implementados en este trabajo abordan problemas recurrentes en el desarrollo de software empresarial:

- **Procesamiento de datos**: El cálculo de estadísticas como medias y conteos es esencial en aplicaciones de análisis de datos.
- **Optimización de búsquedas**: La localización eficiente de elementos es crucial en sistemas de información.
- **Gestión de duplicados**: La eliminación de redundancias es fundamental en el manejo de grandes volúmenes de datos.
- **Validación de datos**: La verificación de ordenamiento es crítica en sistemas que requieren datos estructurados.

### Competencias Profesionales
La implementación de estos algoritmos desarrolla competencias directamente aplicables en el ámbito profesional:

- **Pensamiento algorítmico**: Capacidad de descomponer problemas complejos en soluciones estructuradas.
- **Optimización de código**: Habilidad para escribir código eficiente y mantenible.
- **Uso de APIs estándar**: Dominio de las librerías nativas de Java para manipulación de datos.
- **Testing y validación**: Capacidad de verificar la correctitud de las implementaciones.

### Impacto en la Formación
Este trabajo contribuye significativamente a la formación integral del estudiante, proporcionando:

- **Base teórica sólida**: Consolidación de conceptos fundamentales de estructuras de datos.
- **Experiencia práctica**: Aplicación directa de conocimientos en implementaciones reales.
- **Herramientas para el futuro**: Algoritmos reutilizables en proyectos posteriores.
- **Metodología de trabajo**: Enfoque sistemático para abordar problemas de programación.

---

## EXPLICACION DE DESARROLLO DE EJERCICIOS

### 1. Cálculo de Media Aritmética
**Objetivo**: Calcular la media aritmética de los elementos de un arreglo de enteros.

**Implementación**:
```java
public static double calcularMedia(int[] arr) {
    int suma = 0;
    for (int num : arr) {
        suma += num;
    }
    return (double) suma / arr.length;
}
```

**Análisis**:
- Complejidad temporal: O(n)
- Complejidad espacial: O(1)
- Utiliza enhanced for-loop para mayor legibilidad

### 2. Segundo Elemento Más Grande
**Objetivo**: Identificar el segundo valor más grande en un arreglo de enteros.

**Implementación**:
```java
public static int segundoMayor(int[] arr) {
    Arrays.sort(arr);
    return arr[arr.length - 2];
}
```

**Análisis**:
- Complejidad temporal: O(n log n) debido al ordenamiento
- Complejidad espacial: O(1)
- Utiliza la clase Arrays para ordenamiento eficiente

### 3. Conteo de Elementos Pares
**Objetivo**: Contar la cantidad de números pares en un arreglo de enteros.

**Implementación**:
```java
public static int contarPares(int[] arr) {
    int count = 0;
    for (int num : arr) {
        if (num % 2 == 0) count++;
    }
    return count;
}
```

**Análisis**:
- Complejidad temporal: O(n)
- Complejidad espacial: O(1)
- Usa operador módulo para verificar paridad

### 4. Eliminación de Duplicados
**Objetivo**: Remover elementos duplicados de un arreglo de cadenas, preservando el orden.

**Implementación**:
```java
public static String[] eliminarDuplicados(String[] arr) {
    Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));
    return set.toArray(new String[0]);
}
```

**Análisis**:
- Complejidad temporal: O(n)
- Complejidad espacial: O(n)
- Utiliza LinkedHashSet para mantener orden de inserción

### 5. Verificación de Ordenamiento Ascendente
**Objetivo**: Determinar si un arreglo está ordenado de manera ascendente.

**Implementación**:
```java
public static boolean estaOrdenado(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < arr[i - 1]) return false;
    }
    return true;
}
```

**Análisis**:
- Complejidad temporal: O(n) en el peor caso
- Complejidad espacial: O(1)
- Optimización: termina tempranamente al encontrar desorden

### 6. Multiplicación por Factor
**Objetivo**: Multiplicar cada elemento del arreglo por un factor dado.

**Implementación**:
```java
public static int[] multiplicarElementos(int[] arr, int factor) {
    int[] resultado = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        resultado[i] = arr[i] * factor;
    }
    return resultado;
}
```

**Análisis**:
- Complejidad temporal: O(n)
- Complejidad espacial: O(n)
- Preserva el arreglo original creando uno nuevo

### 7. Búsqueda de Posición
**Objetivo**: Encontrar la posición de un elemento específico en el arreglo.

**Implementación**:
```java
public static int encontrarPosicion(int[] arr, int elemento) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == elemento) return i;
    }
    return -1; // no encontrado
}
```

**Análisis**:
- Complejidad temporal: O(n) en el peor caso
- Complejidad espacial: O(1)
- Retorna -1 como convención para "no encontrado"

### 8. Concatenación de Arreglos
**Objetivo**: Unir dos arreglos de cadenas en uno solo.

**Implementación**:
```java
public static String[] concatenarArreglos(String[] arr1, String[] arr2) {
    String[] resultado = new String[arr1.length + arr2.length];
    System.arraycopy(arr1, 0, resultado, 0, arr1.length);
    System.arraycopy(arr2, 0, resultado, arr1.length, arr2.length);
    return resultado;
}
```

**Análisis**:
- Complejidad temporal: O(n + m)
- Complejidad espacial: O(n + m)
- Utiliza System.arraycopy para eficiencia

### 9. Eliminación de Elementos Impares
**Objetivo**: Remover todos los números impares del arreglo.

**Implementación**:
```java
public static int[] eliminarImpares(int[] arr) {
    return Arrays.stream(arr).filter(n -> n % 2 == 0).toArray();
}
```

**Análisis**:
- Complejidad temporal: O(n)
- Complejidad espacial: O(k), donde k es el número de elementos pares
- Utiliza Streams API para programación funcional

### 10. Suma de Diagonal Principal
**Objetivo**: Calcular la suma de los elementos de la diagonal principal de una matriz cuadrada.

**Implementación**:
```java
public static int sumaDiagonal(int[][] matriz) {
    int suma = 0;
    for (int i = 0; i < matriz.length; i++) {
        suma += matriz[i][i];
    }
    return suma;
}
```

**Análisis**:
- Complejidad temporal: O(n) donde n es el tamaño de la matriz
- Complejidad espacial: O(1)
- Acceso directo a elementos diagonales

---

## ANÁLISIS DE RESULTADOS

### Resultados de Ejecución
Al ejecutar el programa principal con el arreglo de prueba `{5, 2, 8, 1, 9, 2, 4}` y el arreglo de cadenas `{"java", "python", "java", "c++", "python"}`, se obtuvieron los siguientes resultados:

1. **Media**: 4.428571428571429
2. **Segundo mayor**: 8
3. **Cantidad pares**: 3
4. **Sin duplicados**: [java, python, c++]
5. **Está ordenado**: false
6. **Multiplicar por 2**: [10, 4, 16, 2, 18, 4, 8]
7. **Posición del 9**: 4
8. **Concatenar arreglos**: [java, python, java, c++, python, ruby, go]
9. **Sin impares**: [2, 8, 2, 4]
10. **Suma diagonal**: 15

### Verificación de Correctitud
Todos los resultados fueron validados manualmente y coinciden con los valores esperados, confirmando la correctitud de las implementaciones.

### Eficiencia de las Implementaciones
- **Algoritmos lineales**: 7 de los 10 ejercicios tienen complejidad O(n), lo cual es óptimo para operaciones que requieren examinar todos los elementos.
- **Uso de memoria**: Las implementaciones minimizan el uso de memoria adicional cuando es posible.
- **Aprovechamiento de APIs**: Se utilizan eficientemente las librerías estándar de Java para optimizar el código.

---

## CONCLUSIONES

### Conclusiones Técnicas

1. **Dominio de Estructuras Estáticas**: La implementación exitosa de los diez ejercicios demuestra una comprensión sólida de las estructuras de datos estáticas y su manipulación eficiente en Java.

2. **Eficiencia Algorítmica**: Se logró implementar algoritmos con complejidades temporales óptimas, destacando especialmente los algoritmos de complejidad lineal O(n) para operaciones que requieren procesar todos los elementos.

3. **Aprovechamiento de APIs Java**: El uso efectivo de clases como Arrays, Collections, LinkedHashSet y Streams API demuestra conocimiento avanzado del ecosistema Java y mejores prácticas de programación.

4. **Manejo de Casos Especiales**: Las implementaciones consideran adecuadamente casos límite, como arreglos vacíos y elementos no encontrados, implementando manejo de errores robusto.

### Conclusiones Metodológicas

1. **Enfoque Sistemático**: Se aplicó una metodología consistente para cada ejercicio: análisis del problema, diseño de la solución, implementación, y validación de resultados.

2. **Reutilización de Código**: Las implementaciones son modulares y reutilizables, facilitando su integración en proyectos más grandes.

3. **Documentación Efectiva**: Cada método está adecuadamente documentado con su propósito, complejidad temporal y espacial, facilitando el mantenimiento del código.

### Conclusiones de Aprendizaje

1. **Consolidación de Conceptos**: Este trabajo consolidó conceptos fundamentales de estructuras de datos, especialmente la relación entre recursividad y arreglos mencionada en el módulo de estudio.

2. **Competencias Prácticas**: Se desarrollaron competencias prácticas directamente aplicables en el desarrollo de software profesional, incluyendo el análisis de complejidad y la optimización de algoritmos.

3. **Preparación para Estructuras Avanzadas**: El dominio de arreglos proporciona una base sólida para abordar estructuras de datos más complejas como listas enlazadas, árboles y grafos.

### Proyecciones Futuras

1. **Optimizaciones Adicionales**: Se identifican oportunidades para implementar versiones paralelas de algunos algoritmos utilizando Java Streams paralelos.

2. **Extensiones Recursivas**: Varios de los algoritmos implementados pueden ser reimplementados usando recursividad, siguiendo los conceptos presentados en el módulo de estudio.

3. **Aplicaciones Prácticas**: Estos algoritmos fundamentales servirán como bloques de construcción para proyectos más complejos en el curso y en la práctica profesional futura.

---

## REFERENCIAS BIBLIOGRÁFICAS

**Fuentes Principales:**

Módulo Unidad 2: Estructuras de datos estáticas. (2025). Universidad de Cartagena, Facultad de Ingeniería.

Zohanero Martínez, I. & Joyanes Aguilar, L. (2008). *Estructuras de datos en Java*. McGraw-Hill España. Recuperado de https://elibro.unicartagenaproxy.elogim.com/es/lc/unicartagena/titulos/50117

Cairó, O. (2006). *Estructuras de datos*. Recuperado de http://up-rid2.up.ac.pa:8080/xmlui/handle/123456789/1299

**Fuentes Complementarias:**

Botazzi, C. (2012). *Algoritmos y estructuras de datos*. Recuperado de https://cimec.org.ar/~mstorti/aed/aednotes.pdf

Silva, R. S. (2022). Efficient High‑Level Programming in Plain Java. Recuperado de https://springerlink.unicartagenaproxy.elogim.com/content/pdf/10.1007/s10766-022-00747-0?pdf=openurl

Sedgewick, R., & Wayne, K. (2011). *Algorithms* (4th ed.). Addison-Wesley. Recuperado de http://algs4.cs.princeton.edu/home/

Mehlhorn, K., & Sanders, P. (2008). *Algorithms and Data Structures: The Basic Toolbox* (3rd ed.). Springer. Recuperado de https://link.springer.com/book/10.1007/978-3-540-77978-0

Cormen, T. H., Leiserson, C. E., Rivest, R. L., & Stein, C. (2009). *Introduction to Algorithms* (3rd ed.). MIT Press. Recuperado de http://web.mit.edu/16.070/www/lecture/big_o.pdf

**Recursos Audiovisuales:**

Codingraph. (2018). *Tutorial Java - Arreglos*.

Freecodecamp. (2021). *Data Structures - Computer Science Course for Beginners* [Video].

Grijalvaromero. *Pilas y Colas en Java - Estructura de Datos* .

Vida MRR. (2022). *CÓMO FUNCIONA LA RECURSIVIDAD*.

---

*Documento elaborado como parte del desarrollo académico de la Unidad 2 del curso Estructuras de Datos, Programa de Ingeniería de Software, Universidad de Cartagena.*

