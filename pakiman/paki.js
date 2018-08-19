
var imageness= [];
imageness["cauchin"] = "vaca.png";
imageness["pokacho"] = "pollo.png";
imageness["tocinauro"]= "cerdo.png";

var coleccion =[];
coleccion.push(new Pakiman("cauchin", 100, 30));
coleccion.push(new Pakiman("pokacho",80, 50));
coleccion.push(new Pakiman("tocinauro", 120,40));

for (var p of coleccion) {
  p.mostrar();
}

for (var x in  coleccion[0]) {
  console.log(x);
}
