export class experiencia{
    id?: number;
    tituloExp: String;
    puestoExp: String;
    fechaiExp: String;
    fechafExp: String;
    descExp: String;
    certiExp: String;

    constructor(tituloExp: String, puestoExp: String, fechaiExp: String, fechafExp: String, descExp: String, certiExp: String){
        this.tituloExp = tituloExp;
        this.puestoExp = puestoExp;
        this.fechaiExp = fechaiExp;
        this.fechafExp = fechafExp;
        this.descExp = descExp;
        this.certiExp = certiExp;
    }
}