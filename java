First, update the yum package manager.
  yum -y update
Let's install the WGET Download Manager.
   yum install wget
Let's Start!
  sudo yum install java-1.8.0-openjdk-devel
Check the version
  java -version
You can see;  openjdk version "1.8.0_252"
              OpenJDK Runtime Environment (build 1.8.0_252-b09)
              OpenJDK 64-Bit Server VM (build 25.252-b09, mixed mode)
JAVA_HOME=/usr/lib/jvm/java-8-openjdk/ 
OR!
nano -w ~ / .bashrc
Inside this view insert; 
export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk
export PATH=JAVA_HOME/bin:$PATH
