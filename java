Java 1.8.0 version
  wget -c --header "Cookie: oraclelicense=accept-securebackup-cookie" http://download.oracle.com/otn-pub/java/jdk/8u141-b15/336fa29ff2bb4ef291e347e091f7f4a7/jdk-8u141-linux-x64.tar.gz
  sudo tar -xzf jdk-8u141-linux-x64.tar.gz 
Check the version
  java -version
  nano .bash_profile
Inside this view insert; 
  export JAVA_HOME=/usr/lib/jvm/java-1.8.0_141
  export PATH=JAVA_HOME/bin:$PATH
  
  
export JAVA_HOME
export PATH
