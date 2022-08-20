export class persona{
    id?: number; //Al ser el id autogenerado con el ? indico que este no es necesario cargar y asi no me tira error
    nombre: string;
    apellido: string;
    img: string;

    constructor(nombre: string, apellido: string, img: string){
                this.nombre = nombre;
                this.apellido = apellido;
                this.img = img;
    }

}