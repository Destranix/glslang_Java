# glslang_Java
Provides JNI-Bindings and other utilities based on glslang.
https://github.com/KhronosGroup/glslang

## Build
### Build steps

The following steps assume a Bash shell. On Windows, that could be the Git Bash
shell or some other shell of your choosing.

#### 1) Build glslang-Libraries

Follow the Build steps at https://github.com/KhronosGroup/glslang.
Build dir will be refered to as `$GLSLANG_BUILD_DIR`

#### 2) Check-Out this project

Location of glslang_Java on your local installation will be referred to as `$SOURCE_DIR`.

```bash
cd <parent of where you want glslang_Java to be>
git clone https://github.com/Destranix/glslang_Java.git
```
#### 3) Copy lib files

Find glslang lib files in `$GLSLANG_BUILD_DIR`. They should lie under `/install` or `/$(pwd)/install`.
Copy them into `$SOURCE_DIR/C/lib`.

#### 4) Execute make

```bash
cd $SOURCE_DIR/C
make Release
```

Instead of `Release` there's another existing target called `Debug`.

Result should be a dynamic library suitable for your system.

## Using JNI

To make use of JNI-Bindings, you'll have to add the path of the generated dynamic library to `java.library.path`.
There are several ways to do that. One is, by extending `java.library.path`on java execution.
i.e.:
```bash
java -cp $SOURCE_DIR -Djava.library.path+=$SOURCE_DIR/C $SOURCE_DIR/Test/Test.java
```

