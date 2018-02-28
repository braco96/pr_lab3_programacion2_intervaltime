# PR_LAB3_PROGRAMACION2_INTERVALTIME
**Autor:** Luis Bravo  
**Curso:** 2017–2018  
**Asignatura:** Programación II — Laboratorio 3

## Descripción
Extensión del laboratorio de **tiempos** del tema anterior:
- Añade relaciones de **orden temporal** (`less`, `lessEq`) a `TimeHMS` (HH:MM:SS) y `TimeSec` (segundos totales).
- Implementa `IntervalTime` para representar intervalos cerrados de tiempo con operaciones:
  - `contains(Time t)` — ¿el tiempo `t` está dentro del intervalo?
  - `equals(Object o)` — igualdad estructural.
  - `isIncluded(IntervalTime other)` — ¿este intervalo está contenido en `other`?
  - `allIncluded(IntervalTime[] v)` — ¿están **todos** los elementos de `v` dentro de este intervalo?
- Los tests de referencia están en `src/test/java/aed/intervaltime/Tester.java`.
- La guía completa está en `docs/guia.pdf`.

## Estructura
```
src/
 ├─ main/java/aed/intervaltime/
 │   ├─ Time.java
 │   ├─ TimeHMS.java
 │   ├─ TimeSec.java
 │   └─ IntervalTime.java
 └─ test/java/aed/intervaltime/
     └─ Tester.java
docs/
 └─ guia.pdf
```

## Uso
```bash
mvn clean compile
mvn test
```

## Notas
- Mantén la **consistencia** entre representaciones `TimeHMS` y `TimeSec` (normaliza al crear/operar).
- Comprueba casos frontera en `IntervalTime`: igualdad de extremos, inclusión exacta y listas vacías.

— *Luis Bravo*