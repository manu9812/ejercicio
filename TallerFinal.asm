
; You may customize this and other start-up templates; 
; The location of this template is c:\emu8086\inc\0_com_template.txt


include emu8086.inc

org 100h
;----Inicio Indice corporal------
mov dx, offset inicioCorporal 
mov ah, 09h   ;Mensaje indice corporal
int 21h 
mov dx, offset espacio
int 21h
mov dx, offset espacio
int 21h

mov cx, 80
mov al, 01    ;Imprimo caritas
mov bx, 0fh
int 10h
mov dx, offset espacio
int 21h

mov dx, offset peso
int 21h              ;pido el peso
call scan_num
mov ax, cx
mov cx, 100
mul cx
push ax

mov ah, 09h
mov dx, offset estatura
int 21h                 ;pido la estatura                
call scan_num
mov dx, offset espacio
int 21h 
mov dx, offset espacio
int 21h 

mov ax, cx
mul cx          ;La elevo al cuadrado
mov cx, 100
div cx
push ax

pop cx
pop ax

div cx
push ax 

cmp ax, 18 
jb pesoBajo
cmp ax, 24
jbe pesoNormal
cmp ax, 26
jbe Sobrepeso
cmp ax, 29
jbe obecidadI
cmp ax, 40
jb obecidadII
jmp obecidadIII


pesoBajo: ; Si el IMC es menor a 18
mov cx, 80
mov al, 03    ;Imprimo Corazones grices
mov bx, 09h
mov ah, 09h
int 10h
mov dx, offset espacio
int 21h

mov dx, offset imc
mov ah, 09h 
int 21h

pop ax
call print_num  ;Imprimo indice de masa corporal

mov dx, offset menor18 ;msj menor de 18
mov ah, 09h
int 21h
mov dx, offset tratamiento1   ;msj para tratamiento
int 21h

jmp final   ;MANUELA enves de saltar al final "ret" a la etiqueta que inicia de nuevo el programa mostrando el menu

pesoNormal: ;Si el IMC esta entre 18 y 24
mov cx, 80
mov al, 03    ;Imprimo corazones rojos
mov bx, 04h
mov ah, 09h
int 10h
mov dx, offset espacio
int 21h

mov dx, offset imc
mov ah, 09h 
int 21h

pop ax
call print_num  ;Imprimo indice de masa corporal

mov dx, offset 18a24 ;msj entre 18 y 24
mov ah, 09h
int 21h 

jmp final

Sobrepeso: ;Si el IMC esta entre 25 y 26
mov cx, 80
mov al, 03    ;Imprimo corazones rojos claro
mov bx, 0Ch
mov ah, 09h
int 10h
mov dx, offset espacio
int 21h

mov dx, offset imc
mov ah, 09h 
int 21h

pop ax
call print_num  ;Imprimo indice de masa corporal

mov dx, offset 25a26 ;msj de imc entre 25 a 26
mov ah, 09h 
int 21h
mov dx, offset tratamiento2
int 21h

jmp final

obecidadI: ;Si el IMC esta entre 27 y 29
mov cx, 80
mov al, 03    ;Imprimo corazones marrones
mov bx, 06h
mov ah, 09h
int 10h
mov dx, offset espacio
int 21h

mov dx, offset imc
mov ah, 09h 
int 21h

pop ax
call print_num  ;Imprimo indice de masa corporal

mov dx, offset 27a29 ;msj de imc entre 27 a 29
mov ah, 09h 
int 21h
mov dx, offset tratamiento2
int 21h

jmp final

obecidadII: ;Si el IMC esta entre 30 y 39
mov cx, 80
mov al, 03    ;Imprimo corazones marrones
mov bx, 06h
mov ah, 09h
int 10h
mov dx, offset espacio
int 21h

mov dx, offset imc
mov ah, 09h 
int 21h

pop ax
call print_num  ;Imprimo indice de masa corporal

mov dx, offset 30a39 ;msj imc entre 30 a 39
mov ah, 09h 
int 21h
mov dx, offset tratamiento2
int 21h

jmp final

obecidadIII: ;Si el IMC es mayor a 40
mov cx, 80              
mov al, 03    ;Imprimo corazones marrones
mov bx, 06h
mov ah, 09h
int 10h
mov dx, offset espacio
int 21h

mov dx, offset imc
mov ah, 09h 
int 21h

pop ax
call print_num  ;Imprimo indice de masa corporal

mov dx, offset mayor40 ;msj mayor a 40
mov ah, 09h 
int 21h
mov dx, offset tratamiento2
int 21h

jmp final
  
final:  ; MANUELA enves de saltar al final "ret" a la etiqueta que inicia de nuevo el programa mostrando el menu
ret

inicioCorporal db 10,"                    Calcule su Indice de Masa Corporal$"
peso db 10,13," Digite su peso en Kg:  $"
estatura db 10,10,13," Digite su estatura en Mts:  $"
imc db " Su indice de masa corporal es: $"
menor18 db 10,10,13," Peso bajo con probables signos de desnutricion $"
18a24 db 10,10,13," Su peso es normal, Sigue asi$"
25a26 db 10,10,13," Sobrepeso, necesita vajar un poco de peso $"
27a29 db 10,10,13," Obecidad grado I. Risgo alto para desarrollar enfermedades cardiovasculares $"
30a39 db 10,10,13," Obecidad grado II. Riesgo muy alto de desarrollar enfermedades cardivasculares$"
mayor40 db 10,10,13," Obecidad grado III. Riesgo extremadamente alto de sufrir enfermedades cardivasculares$"
tratamiento1 db 10,13," Necesita mejorar su alimentacion consumiendo mas alimentos nutritivos$"
tratamiento2 db 10,13," Necesita Realizar mas actividad fisica y reducir la cantidad de alimento$"
espacio db 10,13,"$" 

DEFINE_SCAN_NUM
DEFINE_PRINT_NUM
DEFINE_PRINT_NUM_UNS

END