#Ejecutando provisionamiento

Aquí he elegido
[`salt-ssh`](https://docs.saltstack.com/en/latest/topics/ssh/index.html)
por las buenas, pero no se puede ejecutar tan por las buenas. Si
quieres ejecutarlo sin necesidad de ser superusuario, hay que

1. Copiar todos los ficheros de configuración de `/etc/salt` a un
   directorio tuyo, `/home/usuario/lib`

2. Crear una serie de directorios para logs y cache.

```
mkdir -p ~/etc/salt/pki/master
mkdir -p ~/var/cache/salt/master
mkdir -p ~/log/salt/
```

3. Modificar el fichero de configuración en `~/lib/salt/master` y
   añadir esos directorios, así:

```
pki_dir: /home/jmerelo/etc/salt/pki/master
cachedir: /home/jmerelo/var/cache/salt/master
log_file: /home/jmerelo/log/salt/master
```

