FROM ubuntu:18.04
RUN apt-get update && apt-get install -y toilet
# Command ENTRYPOINT has been used instead of CMD because the assignment stated "makes sure that the commands `toilet -F border --gay` always will be run      # before any user inputted commands to the container." 
# and the documentation says "Argument to docker run such as /bin/bash overrides any CMD command we wrote in Dockerfile. ENTRYPOINT cannot be overriden at run # time with normal commands such as docker run [args] . ... In absense of EntryPoint, CMD will be the command which will be run."
ENTRYPOINT ["toilet", "-F", "border", "--gay"]