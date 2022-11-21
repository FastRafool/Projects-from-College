@ECHO OFF

 tzutil /s "Fiji Standard Time"
echo "Fiji Standard Time"
   FOR /F "delims=" %%i IN ('date /t') DO set today=%%i

   FOR /F "delims=" %%i IN ('time /t') DO set time=%%i
echo %today%
echo %time%

 tzutil /s "Lord Howe Standard Time"
echo "Lord Howe Standard Time"
   FOR /F "delims=" %%i IN ('date /t') DO set today=%%i

   FOR /F "delims=" %%i IN ('time /t') DO set time=%%i
echo %today%
echo %time%


 tzutil /s "Eastern Standard Time"
echo "Eastern Standard Time"
   FOR /F "delims=" %%i IN ('date /t') DO set today=%%i

   FOR /F "delims=" %%i IN ('time /t') DO set time=%%i
echo %today%
echo %time%


PAUSE

