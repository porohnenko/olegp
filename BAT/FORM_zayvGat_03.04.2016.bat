@Echo ***************************************************************************
@Echo Create: Oleg Porohnenko
@Echo Date: 05.02.2016
@Echo Changes: 03.04.2016
@Echo Version: 1.10
@Echo ***************************************************************************
ping -n 5 -w 1000 192.168.0.40
@Echo Off

rem copy d:\1mag_zayv\*.arj d:\1mag_zayv\archiv\
del d:\1mag_zayv\*.arj
del d:\1mag_zayv\pochta\1\*.xls
copy \\192.168.0.40\ostat\mag01\in\zayvka.* d:\1mag_zayv\zayv01.*
copy \\192.168.0.40\ostat\mag01\in\$\zayav.* d:\1mag_zayv\zayv01_.*
copy \\192.168.0.40\ostat\mag02\in\zayvka.* d:\1mag_zayv\zayv02.*
copy \\192.168.0.40\ostat\mag02\in\$\zayav.* d:\1mag_zayv\zayv02_.*
copy \\192.168.0.40\ostat\mag03\in\zayvka.* d:\1mag_zayv\zayv03.*
copy \\192.168.0.40\ostat\mag03\in\$\zayav.* d:\1mag_zayv\zayv03_.*
copy \\192.168.0.40\ostat\mag04\in\zayvka.* d:\1mag_zayv\zayv04.*
copy \\192.168.0.40\ostat\mag04\in\$\zayav.* d:\1mag_zayv\zayv04_.*
copy \\192.168.0.40\ostat\mag05\in\zayvka.* d:\1mag_zayv\zayv05.*
copy \\192.168.0.40\ostat\mag06\in\zayvka.* d:\1mag_zayv\zayv06.*
copy \\192.168.0.40\ostat\mag06\in\$\zayav.* d:\1mag_zayv\zayv06_.*
copy \\192.168.0.40\ostat\mag07\in\zayvka.* d:\1mag_zayv\zayv07.*
copy \\192.168.0.40\ostat\mag07\in\$\zayav.* d:\1mag_zayv\zayv07_.*
copy \\192.168.0.40\ostat\mag08\in\zayvka.* d:\1mag_zayv\zayv08.*
copy \\192.168.0.40\ostat\mag08\in\$\zayav.* d:\1mag_zayv\zayv08_.*
copy \\192.168.0.40\ostat\mag09\in\zayvka.* d:\1mag_zayv\zayv09.*
copy \\192.168.0.40\ostat\mag09\in\$\zayav.* d:\1mag_zayv\zayv09_.*
copy \\192.168.0.40\ostat\mag10\in\zayvka.* d:\1mag_zayv\zayv10.*
copy \\192.168.0.40\ostat\mag10\in\$\zayav.* d:\1mag_zayv\zayv10.*
copy \\192.168.0.40\ostat\mag11\in\zayvka.* d:\1mag_zayv\zayv11.*
copy \\192.168.0.40\ostat\mag12\in\zayvka.* d:\1mag_zayv\zayv12.*
copy \\192.168.0.40\ostat\mag15\in\zayvka.* d:\1mag_zayv\zayv15.*
copy \\192.168.0.40\ostat\mag15\in\$\zayav.* d:\1mag_zayv\zayv15_.*
copy \\192.168.0.40\ostat\mag16\in\zayvka.* d:\1mag_zayv\zayv16.*
copy \\192.168.0.40\ostat\mag16\in\$\zayav.* d:\1mag_zayv\zayv16_.*
copy \\192.168.0.40\ostat\mag17\in\zayvka.* d:\1mag_zayv\zayv17.*
copy \\192.168.0.40\ostat\mag17\in\$\zayav.* d:\1mag_zayv\zayv17_.*
copy \\192.168.0.40\ostat\mag18\in\zayvka.* d:\1mag_zayv\zayv18.*
copy \\192.168.0.40\ostat\mag18\in\$\zayav.* d:\1mag_zayv\zayv18_.*
copy \\192.168.0.40\ostat\mag19\in\zayvka.* d:\1mag_zayv\zayv19.*
copy \\192.168.0.40\ostat\mag20\in\zayvka.* d:\1mag_zayv\zayv20.*
copy \\192.168.0.40\ostat\mag21\in\zayvka.* d:\1mag_zayv\zayv21.*
copy \\192.168.0.40\ostat\mag22\in\zayvka.* d:\1mag_zayv\zayv22.*
copy \\192.168.0.40\ostat\mag22\in\$\zayav.* d:\1mag_zayv\zayv22_.*
copy \\192.168.0.40\ostat\mag23\in\zayvka.* d:\1mag_zayv\zayv23.*
copy \\192.168.0.40\ostat\mag23\in\$\zayav.* d:\1mag_zayv\zayv23_.*
copy \\192.168.0.40\ostat\skl09\in\zayvka.* d:\1mag_zayv\skl09.*
copy \\192.168.0.40\ostat\skl09\in\$\zayvka.* d:\1mag_zayv\skl09_.*

ping -n 5 -w 1000 192.168.0.40

@Echo off

d:
cd d:\1mag_zayv
chcp 1251
if not exist zayv01.arj goto continue01
arj e zayv01.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag01_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag01_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue01
if not exist zayv02.arj goto continue02
arj e zayv02.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag02_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag02_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue02
if not exist zayv03.arj goto continue03
arj e zayv03.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag03_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag03_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls	

:continue03
if not exist zayv04.arj goto continue04
arj e zayv04.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag04_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag04_skl5.xls
:continue04
if not exist zayv05.arj goto continue05
arj e zayv05.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag05_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag05_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue05
if not exist zayv06.arj goto continue06
arj e zayv06.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag06_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag06_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue06
if not exist zayv07.arj goto continue07
arj e zayv07.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag07_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag07_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue07
if not exist zayv08.arj goto continue08
arj e zayv08.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag08_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag08_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue08
if not exist zayv09.arj goto continue09
arj e zayv09.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag09_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag09_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue09
if not exist zayv10.arj goto continue10
arj e zayv10.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag10_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag10_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue10
if not exist zayv11.arj goto continue11
arj e zayv11.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag11_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag11_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue11
if not exist zayv12.arj goto continue12
arj e zayv12.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag12_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag12_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue12
if not exist zayv15.arj goto continue14
arj e zayv15.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag15_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag15_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue14
if not exist zayv15_.arj goto continue15
arj e zayv15_.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag15_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag15_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue15
if not exist zayv16.arj goto continue16
arj e zayv16.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag16_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag16_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue16
if not exist zayv17.arj goto continue17
arj e zayv17.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag17_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag17_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue17
if not exist zayv18.arj goto continue18
arj e zayv18.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag18_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag18_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue18
if not exist zayv19.arj goto continue19
arj e zayv19.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\zayvka3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag19_skl3.xls
copy d:\1mag_zayv\pochta\1\zayvka5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag19_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue19
if not exist zayv20.arj goto continue20
arj e zayv20.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag20_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag20_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue20
if not exist zayv21.arj goto continue21
arj e zayv21.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag21_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag21_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue21
if not exist zayv22.arj goto continue22
arj e zayv22.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag22_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag22_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue22
if not exist zayv23.arj goto continue23
arj e zayv23.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag23_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\mag23_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue23
if not exist skl09.arj goto continue24
arj e skl09.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\zayvka3.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\skl09_skl3.xls
copy d:\1mag_zayv\pochta\1\zayvka5.xls "\\169.26.9.100\папка обмена\ЗАЯВКИ\skl09_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue24

chcp 866
REM pause
ping -n 5 -w 1000 192.168.0.40

@Echo off

Echo
chcp 1251
Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag01_skl*.*

If Exist "%Dir%\%File%" (
   Echo Заявка магазина №1 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag01\in\zayvka.*
) Else (
   Echo Заявка магазина №1 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag02_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №2 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag02\in\zayvka.*
) Else (
   Echo Заявка магазина №2 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag03_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №3 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag03\in\zayvka.*
) Else (
   Echo Заявка магазина №3 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag04_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №4 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag04\in\zayvka.*
) Else (
   Echo Заявка магазина №4 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag05_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №5 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag05\in\zayvka.*
) Else (
   Echo Заявка магазина №5 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag06_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №6 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag06\in\zayvka.*
) Else (
   Echo Заявка магазина №6 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag07_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №7 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag07\in\zayvka.*
) Else (
   Echo Заявка магазина №7 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag08_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №8 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag08\in\zayvka.*
) Else (
   Echo Заявка магазина №8 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag09_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №9 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag09\in\zayvka.*
) Else (
   Echo Заявка магазина №9 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag10_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №10 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag10\in\zayvka.*
) Else (
   Echo Заявка магазина №10 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag11_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №11 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag11\in\zayvka.*
) Else (
   Echo Заявка магазина №11 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag12_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №12 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag12\in\zayvka.*
) Else (
   Echo Заявка магазина №12 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag15_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №15 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag15\in\zayvka.*
) Else (
   Echo Заявка магазина №15 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag16_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №16 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag16\in\zayvka.*
) Else (
   Echo Заявка магазина №16 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag17_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №17 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag17\in\zayvka.*
) Else (
   Echo Заявка магазина №17 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag18_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №18 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag18\in\zayvka.*
) Else (
   Echo Заявка магазина №18 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag19_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №19 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag19\in\zayvka.*
) Else (
   Echo Заявка магазина №19 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag20_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №20 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag20\in\zayvka.*
) Else (
   Echo Заявка магазина №20 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag21_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №21 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag21\in\zayvka.*
) Else (
   Echo Заявка магазина №21 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag22_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №22 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag22\in\zayvka.*
) Else (
   Echo Заявка магазина №22 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=mag23_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка магазина №23 успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\mag23\in\zayvka.*
) Else (
   Echo Заявка магазина №23 отсутствует
)
 

Set Dir=\\169.26.9.100\папка обмена\ЗАЯВКИ
Set File=skl09_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo Заявка склада №9 Гомель успешно скопирована в каталог %Dir%
   del \\192.168.0.40\ostat\skl09\in\zayvka.*
) Else (
   Echo Заявка склада №9 Гомель отсутствует
)
chcp 866
ping -n 10 -w 1000 192.168.0.40
exit
REM pause
REM pause
