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
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag01_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag01_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue01
if not exist zayv02.arj goto continue02
arj e zayv02.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag02_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag02_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue02
if not exist zayv03.arj goto continue03
arj e zayv03.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag03_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag03_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls	

:continue03
if not exist zayv04.arj goto continue04
arj e zayv04.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag04_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag04_skl5.xls
:continue04
if not exist zayv05.arj goto continue05
arj e zayv05.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag05_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag05_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue05
if not exist zayv06.arj goto continue06
arj e zayv06.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag06_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag06_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue06
if not exist zayv07.arj goto continue07
arj e zayv07.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag07_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag07_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue07
if not exist zayv08.arj goto continue08
arj e zayv08.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag08_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag08_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue08
if not exist zayv09.arj goto continue09
arj e zayv09.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag09_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag09_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue09
if not exist zayv10.arj goto continue10
arj e zayv10.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag10_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag10_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue10
if not exist zayv11.arj goto continue11
arj e zayv11.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag11_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag11_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue11
if not exist zayv12.arj goto continue12
arj e zayv12.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag12_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag12_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue12
if not exist zayv15.arj goto continue14
arj e zayv15.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag15_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag15_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue14
if not exist zayv15_.arj goto continue15
arj e zayv15_.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag15_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag15_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue15
if not exist zayv16.arj goto continue16
arj e zayv16.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag16_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag16_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue16
if not exist zayv17.arj goto continue17
arj e zayv17.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag17_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag17_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue17
if not exist zayv18.arj goto continue18
arj e zayv18.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag18_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag18_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue18
if not exist zayv19.arj goto continue19
arj e zayv19.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\zayvka3.xls "\\169.26.9.100\����� ������\������\mag19_skl3.xls
copy d:\1mag_zayv\pochta\1\zayvka5.xls "\\169.26.9.100\����� ������\������\mag19_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue19
if not exist zayv20.arj goto continue20
arj e zayv20.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag20_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag20_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue20
if not exist zayv21.arj goto continue21
arj e zayv21.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag21_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag21_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue21
if not exist zayv22.arj goto continue22
arj e zayv22.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag22_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag22_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue22
if not exist zayv23.arj goto continue23
arj e zayv23.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\ostat3.xls "\\169.26.9.100\����� ������\������\mag23_skl3.xls
copy d:\1mag_zayv\pochta\1\ostat5.xls "\\169.26.9.100\����� ������\������\mag23_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue23
if not exist skl09.arj goto continue24
arj e skl09.arj d:\1mag_zayv\pochta\1
copy d:\1mag_zayv\pochta\1\zayvka3.xls "\\169.26.9.100\����� ������\������\skl09_skl3.xls
copy d:\1mag_zayv\pochta\1\zayvka5.xls "\\169.26.9.100\����� ������\������\skl09_skl5.xls

del d:\1mag_zayv\pochta\1\*.xls

:continue24

chcp 866
REM pause
ping -n 5 -w 1000 192.168.0.40

@Echo off

Echo
chcp 1251
Set Dir=\\169.26.9.100\����� ������\������
Set File=mag01_skl*.*

If Exist "%Dir%\%File%" (
   Echo ������ �������� �1 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag01\in\zayvka.*
) Else (
   Echo ������ �������� �1 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag02_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �2 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag02\in\zayvka.*
) Else (
   Echo ������ �������� �2 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag03_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �3 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag03\in\zayvka.*
) Else (
   Echo ������ �������� �3 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag04_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �4 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag04\in\zayvka.*
) Else (
   Echo ������ �������� �4 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag05_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �5 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag05\in\zayvka.*
) Else (
   Echo ������ �������� �5 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag06_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �6 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag06\in\zayvka.*
) Else (
   Echo ������ �������� �6 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag07_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �7 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag07\in\zayvka.*
) Else (
   Echo ������ �������� �7 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag08_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �8 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag08\in\zayvka.*
) Else (
   Echo ������ �������� �8 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag09_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �9 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag09\in\zayvka.*
) Else (
   Echo ������ �������� �9 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag10_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �10 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag10\in\zayvka.*
) Else (
   Echo ������ �������� �10 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag11_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �11 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag11\in\zayvka.*
) Else (
   Echo ������ �������� �11 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag12_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �12 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag12\in\zayvka.*
) Else (
   Echo ������ �������� �12 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag15_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �15 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag15\in\zayvka.*
) Else (
   Echo ������ �������� �15 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag16_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �16 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag16\in\zayvka.*
) Else (
   Echo ������ �������� �16 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag17_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �17 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag17\in\zayvka.*
) Else (
   Echo ������ �������� �17 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag18_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �18 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag18\in\zayvka.*
) Else (
   Echo ������ �������� �18 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag19_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �19 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag19\in\zayvka.*
) Else (
   Echo ������ �������� �19 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag20_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �20 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag20\in\zayvka.*
) Else (
   Echo ������ �������� �20 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag21_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �21 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag21\in\zayvka.*
) Else (
   Echo ������ �������� �21 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag22_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �22 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag22\in\zayvka.*
) Else (
   Echo ������ �������� �22 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=mag23_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ �������� �23 ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\mag23\in\zayvka.*
) Else (
   Echo ������ �������� �23 �����������
)
 

Set Dir=\\169.26.9.100\����� ������\������
Set File=skl09_skl*.*

If Exist "%Dir%\%File%*.*" (
   Echo ������ ������ �9 ������ ������� ����������� � ������� %Dir%
   del \\192.168.0.40\ostat\skl09\in\zayvka.*
) Else (
   Echo ������ ������ �9 ������ �����������
)
chcp 866
ping -n 10 -w 1000 192.168.0.40
exit
REM pause
REM pause
