# Docker exercise

If you are unable to do any of the tasks asked of you here, then please provide a description of what you have _tried_ to do, or what you would do _if it worked_.

## The gay border TOIlet

The TOIlet (stands for “The Other Implementation’s letters”) application is a linux CLI that takes the input characters and produces various text-based effects. I want a container that can output me colorful variations of a given text.

See [TOIlet's website](http://caca.zoy.org/wiki/toilet) for more info (but you do not have to).

**Tasks:**

Write a build file that:

* takes an ubuntu 18.04
* instals toilet.
* makes sure that the commands `toilet -F border --gay` always will be run before any user inputted commands to the container.

Submit your build file.

Build your image, calling it `<yourusername>/toilet`.

Push your newly created image up to dockerhub, and provide the link to it.

## Wordpress with proxy

We want to run a wordpress site, that sits behind a proxy server. You do not need any experience with proxies, nor Nginx in particular to solve this assignment.

You need to provide a docker compose file with the following containers in:

* Nginx as a proxy (in the script called loadbalancer-nginx)
* Mysql as a database (in the script called db)
* Wordpress as an application (in the script called wordpress)

**Tasks:**

* Make nginx the only container visible to the outside world, and only on port 80.
* Make the containers start in the following order: mysql,wordpress,nginx
* Make nginx volume in the file `nginx.conf` on the container path /etc/nginx/conf.d/default.conf
* Make wordpress and mysql configured so they do not need to ask for database host, database name, user and password (hint: look at their docker-hub pages)
* Make a network that all containers belong to.

**Questions:**

Describe what kind of commands you would use to delete the containers and create new ones.
 - docker-compose up
 - docker-compose down

Describe where you would define what exact version of mysql docker should use?
 - image: mysql:< insert version number here >

What commands will give you the ip addresses of the containers in the described network.
use the following commands

>`docker network ls`
>>To see all of the networks currently in excistense

>`docker network inspect <NETWORK ID OR NETWORK NAME>`
>>To see specifik information about a single network such as ip etc. etc.