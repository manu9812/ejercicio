
 ; You may customize this and other start-up templates; 
; The location of this template is c:\emu8086\inc\0_com_template.txt  
;manuela garcia
;16 
include 'emu8086.inc'


org 100h
menu:
mov ah, 9
mov dx, offset mensaje1
int 21h

mov ah, 9
mov dx, offset mensaje2
int 21h

mov ah, 9
mov dx, offset mensaje3
int 21h

mov ah, 9
mov dx, offset mensaje4
int 21h

mov ah, 9
mov dx, offset mensaje5
int 21h

mov ah, 9
mov dx, offset mensaje6
int 21h

mov ah, 01
int 21h
sub al, 30h

push ax

mov ah, 00h
mov al, 03 ; limpiar pantalla
int 10h

pop ax

cmp al, 1
je sumar

cmp al, 2
je restar

cmp al, 3
je multi

cmp al, 4
je salir

limpiar:

mov ah, 00h
mov al, 03 ; limpiar pantalla
int 10h
jmp menu


sumar:  ;suma

mov dx, offset ingr
mov ah, 9
int 21h
call scan_num
push cx

mov dx, offset ingr2
mov ah, 9
int 21h
call scan_num
mov dx, offset result
int 21h
pop ax
add ax, cx
call print_num
jmp cnt


restar:  ; resta

mov dx, offset ingr
mov ah, 9
int 21h
call scan_num
push cx

mov dx, offset ingr2
mov ah, 9
int 21h
call scan_num
mov dx, offset result
int 21h
pop ax
sub ax, cx
call print_num
jmp cnt

multi:  ;multiplicacion

mov dx, offset ingr
mov ah, 9
int 21h
call scan_num
push cx

mov dx, offset ingr2
mov ah, 9
int 21h
call scan_num
mov dx, offset result
int 21h
pop ax
mul cx
call print_num
jmp cnt


cnt:
mov dx, offset tec
mov ah, 9
int 21h
mov ah, 1
int 21h
jmp limpiar


salir:
ret

mensaje1 db 10,13,"MENU, SELECCIONE ALGUNAS DE LAS SIGUIENTES OPERACIONES $"
mensaje2 db 10,13,"1. SUMAR  NUM1 + NUM2 $"
mensaje3 db 10,13,"2. RESTAR NUM1 - NUM2 $"
mensaje4 db 10,13,"3. MULTIPLICAR NUM1 * NUM2 $"
mensaje5 db 10,13,"4. SALIR$"
mensaje6 db 10,13,"DIGITE LA OPCION CORRESPONDIENTE A LA OPERACION QUE DESEA REALIZAR$"

ingr db 10,13,"INGRESE UN NUMERO: $"  
ingr2 db 10,13, "INGRESE EL SEGUNDO NUMERO: $"
result db 10,13,"EL RESULTADO DE LA OPERACION QUE HA SELECCIONADO ES:  $" 
tec  db 10,13,"DIGITE CUALQUIER TECLA PARA REGRESAR AL MENU$"


DEFINE_SCAN_NUM       
DEFINE_PRINT_NUM
DEFINE_PRINT_NUM_UNS

END



