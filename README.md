This layer depends on:

>URI: git://git.openembedded.org/openembedded-core  
branch: master  
revision: HEAD

and
>URI: git://git.openembedded.org/meta-openembedded  
branch: master  
revision: HEAD

###local.conf
You should define at lease the following variables in a distro include file or `conf/local.conf`
```shell
PREFERRED_PROVIDER_virtual/java-initial = "cacao-initial"

PREFERRED_PROVIDER_virtual/java-native = "jamvm-native"
PREFERRED_PROVIDER_virtual/javac-native = "ecj-bootstrap-native"
```
Sometimes the following is needed:
```shell
PREFERRED_PROVIDER_openjdk-6-jre = "openjdk-6-jre"
PREFERRED_PROVIDER_openjdk-7-jre = "openjdk-7-jre
```
####OpenJDK6

```shell
PREFERRED_VERSION_openjdk-6-jre = "6b24-1.11.9"
```
or
```shell
PREFERRED_VERSION_openjdk-6-jre = "6b27-1.12.5"  
PREFERRED_VERSION_icedtea6-native = "1.8.11"
```
####OpenJDK7

```shell
PREFERRED_VERSION_openjdk-7-jre = "25b30-2.3.12"
PREFERRED_VERSION_icedtea7-native = "2.1.3"
```
###bblayers.conf
For `conf/bblayers.conf` you have to add
````shell
BBLAYERS ?= " \
   ...
  path_to_source/meta-openembedded/meta-oe \
  path_to_source/sources/meta-java \
  "
```
####Notes
Please note that libstdc\+\+ static is needed on your host to compile icedtea6/7-native
(install libstdc++-static on a Fedora).

Send pull requests to openembedded-devel@lists.openembedded.org

Main layer maintainers: Henning Heinold <henning@itconsulting-heinold.de>