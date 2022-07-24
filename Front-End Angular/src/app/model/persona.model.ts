export class persona{
    id?: number;
    nombre: String;
    apellido: String;
    titulo: String;
    descripcion: String;
    imageheader: String;
    imageperfil: String;

    constructor(nombre: String, apellido: String, titulo: String, descripcion: String, imageheader: String, imageperfil: String){
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imageheader = imageheader;
        this.imageperfil = imageperfil;
    }
}