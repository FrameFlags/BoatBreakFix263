# Boat Break Fix — Minecraft 26.3 (all loaders)

Unofficial port: prevents boats from breaking on long falls and killing the rider. Clean-room implementation with attribution to ElocinDev (MIT). Scaffold release: rules and metadata only; in-game event wiring is not included.

## Status

This repository contains a **scaffold**: pure-Java rule classes with JUnit tests, thin loader
entrypoints that register and log initialization, and complete mod metadata for every variant.
In-game event wiring is not included in this release — see VERIFICATION.md in each workflow run
for the distinction between compiled, loaded and functionally verified.

## Layout

- `26.3-fabric/`, `26.3-forge/`, `26.3-neoforge/` — Minecraft 26.3, Java 25.

## Build & tests (GitHub only)

`build.yml` compiles/tests each variant and uploads jars + test reports.
`launcher-test.yml` boots a real headless client (Fabric/NeoForge) or a headless server (Forge)
for each variant with the built mod installed. No local builds.

## Attribution

Original "Boat Break Fix" by ElocinDev, MIT licensed. This is an unofficial clean-room port.
