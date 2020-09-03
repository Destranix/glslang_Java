# glslang_Java
Provides JNI-Bindings and other utilities based on glslang.
https://github.com/KhronosGroup/glslang

### Commit:
1ef2e250fc36d862573cc5e92f04b1d0e2d89867

## Build
### Dependencies
Same as glslang:
* A C++11 compiler.
  (For MSVS: 2015 is recommended, 2013 is fully supported/tested, and 2010 support is attempted, but not tested.)
* [CMake][cmake]: for generating compilation targets.
* make: _Linux_, ninja is an alternative, if configured.
* [Python 3.x][python]: for executing SPIRV-Tools scripts. (Optional if not using SPIRV-Tools and the 'External' subdirectory does not exist.)
* [bison][bison]: _optional_, but needed when changing the grammar (glslang.y).
* [googletest][googletest]: _optional_, but should use if making any changes to glslang.

Additional Notes:
* On Windows currently Visual Studio Build Tools are needed. `vcvarsall.bat`must be visible in shell opened by make. Git Bash or similar might fail on execution. Consider using cmd for calling make in that case.

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

Find glslang lib(.lib/.a/.so) files in `$GLSLANG_BUILD_DIR`. They should lie under `$GLSLANG_BUILD_DIR/install` or `$GLSLANG_BUILD_DIR/$(pwd)/install`.
Copy them into `$SOURCE_DIR/C/lib`.

#### 4) Execute make

```bash
cd $SOURCE_DIR/C
make Release
```

Instead of `Release` there's another existing target called `Debug`.

Result should be a dynamic library suitable for your system.

## Using JNI

### Build jars
The script `packJar` cann be used to generate Jars packing all necessary classes and native libraries. Simply execute the script in `$SOURCE_DIR`.
The following command-line options are available:
* `-f=[DIR]`: Allows to specify the outputfile containing the classes and native libraries. `DIR`is either an absolute path or relative to current working directory.
* `-s=[DIR]`: Allows to specify the outputfile containing the sources. `DIR`is either an absolute path or relative to current working directory.
* `-no-generate-classes`: Causes script not to generate a .jar containing classes and native libraries.
* `-no-generate-sources`: Causes script not to generate a .jar containing sources.
* `-no-cleanup`: Causes script not to cleanup generated folders and files.

### Other
To make use of JNI-Bindings, you'll have to add the path of the generated dynamic library to `java.library.path`.
There are several ways to do that. One is, by extending `java.library.path`on java execution.
i.e.:
```bash
java -cp $SOURCE_DIR -Djava.library.path+=$SOURCE_DIR/C $SOURCE_DIR/Test/Test.java
```

