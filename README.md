# Assignment 3: Bridge Pattern - Shape & Renderer Architecture

## Problem Overview
Without the Bridge pattern, combining $N$ shapes (Circle, Square) with $M$ renderers (Vector, Raster) requires $N \times M$ subclasses (`VectorCircle`, `RasterCircle`, etc.), causing a combinatorial class explosion. 

## Solution
This project implements the **Bridge Structural Design Pattern** by decoupling the high-level `Shape` abstraction from the low-level `Renderer` implementation via object composition.

## Structural Elements
* **Abstraction:** `Shape` (abstract class with a reference to `Renderer`).
* **Refined Abstractions:** `Circle`, `Square`.
* **Implementor:** `Renderer` (interface).
* **Concrete Implementors:** `VectorRenderer`, `RasterRenderer`.
* **Client:** `Main` (demonstrates runtime binding and dynamic engine swapping).

## How to Run
1. Open the project in IntelliJ IDEA (JDK 17).
2. Execute `Main.java`.
