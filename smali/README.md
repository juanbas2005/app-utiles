# smali — bytecode Dalvik (apktool/baksmali 2.4.1)

Salida de baksmali (a través de `apktool d`) sobre `apk-original/UtilEs.apk`.

## Alcance versionado

Solo el paquete **first-party** `cu/lestebang/**` (89 ficheros `.smali`, 2.8 MB).
El árbol completo (10 507 ficheros, 174 MB, incluidas todas las dependencias)
se regenera con `tools/decompile.sh`.

## ¿Para qué sirve?

- Verificación de comportamiento cuando jadx no puede decompilar una clase
  (coroutines complejas, código R8-optimizado).
- Auditoría a nivel bytecode (los hallazgos de `SECURITY.md` citan clases concretas,
  p. ej. `su0` — cifrado AES/GCM con AndroidKeyStore de las contraseñas Nauta).

## Estructura

```
smali/cu/lestebang/utiletecsa/
├── App.smali, MainActivity.smali, R.smali
├── core/{network,preferences,room}/
├── data/repository/{account,feedback,forum,profile,spots}/
├── feature/{auth,ayuda,forum,home,infoutil,nauta,planes,precios,profile,red,registro,servicios,settings,sms}/
├── messaging/, shortcuts/, sync/worker/, widget/
```

## Reproducción completa

```bash
./tools/decompile.sh          # regenera TODO el árbol (incl. third-party) en /tmp
```
