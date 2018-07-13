@echo off

java -classpath "dist;dist/lib;dist/Pool.jar" -Dsun.java2d.noddraw=true -Djava.library.path="dist;dist/lib/windows;dist/Pool.jar" com.bianisoft.games.pool.AppPool
